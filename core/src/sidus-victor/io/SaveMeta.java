package sidus-victor.io;

import arc.struct.*;
import sidus-victor.game.*;
import sidus-victor.maps.*;

import static sidus-victor.Vars.*;

public class SaveMeta{
    public int version;
    public int build;
    public long timestamp;
    public long timePlayed;
    public Map map;
    public int wave;
    public Rules rules;
    public StringMap tags;
    public String[] mods;

    public SaveMeta(int version, long timestamp, long timePlayed, int build, String map, int wave, Rules rules, StringMap tags){
        this.version = version;
        this.build = build;
        this.timestamp = timestamp;
        this.timePlayed = timePlayed;
        this.map = maps.all().find(m -> m.name().equals(map));
        this.wave = wave;
        this.rules = rules;
        this.tags = tags;
        this.mods = JsonIO.read(String[].class, tags.get("mods", "[]"));
    }
}
