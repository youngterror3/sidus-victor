package sidus-victor.ui.dialogs;

import arc.*;
import arc.scene.ui.*;
import arc.util.*;
import sidus-victor.core.GameState.*;
import sidus-victor.game.EventType.*;
import sidus-victor.gen.*;
import sidus-victor.graphics.*;

import static sidus-victor.Vars.*;

public class BaseDialog extends Dialog{
    protected boolean wasPaused;
    protected boolean shouldPause;

    public BaseDialog(String title, DialogStyle style){
        super(title, style);
        setFillParent(true);
        this.title.setAlignment(Align.center);
        titleTable.row();
        titleTable.image(Tex.whiteui, Pal.accent)
        .growX().height(3f).pad(4f);

        hidden(() -> {
            if(shouldPause && state.isGame()){
                if(!wasPaused || net.active()){
                    state.set(State.playing);
                }
            }
            Sounds.back.play();
        });

        shown(() -> {
            if(shouldPause && state.isGame()){
                wasPaused = state.is(State.paused);
                state.set(State.paused);
            }
        });
    }

    public BaseDialog(String title){
        this(title, Core.scene.getStyle(DialogStyle.class));
    }

    protected void onResize(Runnable run){
        Events.on(ResizeEvent.class, event -> {
            if(isShown() && Core.scene.getDialog() == this){
                run.run();
                updateScrollFocus();
            }
        });
    }

    public void addCloseListener(){
       closeOnBack();
    }

    @Override
    public void addCloseButton(){
        buttons.defaults().size(210f, 64f);
        buttons.button("@back", Icon.left, this::hide).size(210f, 64f);

        addCloseListener();
    }
}
