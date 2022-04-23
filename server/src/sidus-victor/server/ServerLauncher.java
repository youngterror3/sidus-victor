package sidus-victor.server;

import arc.*;
import arc.backend.headless.*;
import arc.util.*;
import sidus-victor.*;
import sidus-victor.core.*;
import sidus-victor.ctype.*;
import sidus-victor.game.EventType.*;
import sidus-victor.mod.*;
import sidus-victor.mod.Mods.*;
import sidus-victor.net.Net;
import sidus-victor.net.*;

import java.time.*;

import static arc.util.Log.*;
import static sidus-victor.Vars.*;
import static sidus-victor.server.ServerControl.*;

public class ServerLauncher implements ApplicationListener{
    static String[] args;

    public static void main(String[] args){
        try{
            ServerLauncher.args = args;
            Vars.platform = new Platform(){};
            Vars.net = new Net(platform.getNet());

            logger = (level1, text) -> {
                String result = "[" + dateTime.format(LocalDateTime.now()) + "] " + format(tags[level1.ordinal()] + " " + text + "&fr");
                System.out.println(result);
            };
            new HeadlessApplication(new ServerLauncher(), throwable -> CrashSender.send(throwable, f -> {}));
        }catch(Throwable t){
            CrashSender.send(t, f -> {});
        }
    }

    @Override
    public void init(){
        Core.settings.setDataDirectory(Core.files.local("config"));
        loadLocales = false;
        headless = true;

        Vars.loadSettings();
        Vars.init();
        content.createBaseContent();
        mods.loadScripts();
        content.createModContent();
        content.init();
        if(mods.hasContentErrors()){
            err("Error occurred loading mod content:");
            for(LoadedMod mod : mods.list()){
                if(mod.hasContentErrors()){
                    err("| &ly[@]", mod.name);
                    for(Content cont : mod.erroredContent){
                        err("| | &y@: &c@", cont.minfo.sourceFile.name(), Strings.getSimpleMessage(cont.minfo.baseError).replace("\n", " "));
                    }
                }
            }
            err("The server will now exit.");
            System.exit(1);
        }

        bases.load();

        Core.app.addListener(new ApplicationListener(){public void update(){ asyncCore.begin(); }});
        Core.app.addListener(logic = new Logic());
        Core.app.addListener(netServer = new NetServer());
        Core.app.addListener(new ServerControl(args));
        Core.app.addListener(new ApplicationListener(){public void update(){ asyncCore.end(); }});

        mods.eachClass(Mod::init);

        Events.fire(new ServerLoadEvent());
    }
}
