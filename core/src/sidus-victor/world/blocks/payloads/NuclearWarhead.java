package sidus-victor.world.blocks.payloads;

import sidus-victor.gen.*;
import sidus-victor.world.*;

public class NuclearWarhead extends Block{
    public float radius = 100f;

    public NuclearWarhead(String name){
        super(name);
        solid = true;
        update = true;
    }

    public class NuclearWarheadBuild extends Building{

    }
}
