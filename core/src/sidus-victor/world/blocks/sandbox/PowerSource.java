package sidus-victor.world.blocks.sandbox;

import sidus-victor.world.blocks.power.*;
import sidus-victor.world.meta.*;

public class PowerSource extends PowerNode{
    public float powerProduction = 10000f;

    public PowerSource(String name){
        super(name);
        maxNodes = 100;
        outputsPower = true;
        consumesPower = false;
        //TODO maybe don't?
        envEnabled = Env.any;
    }

    public class PowerSourceBuild extends PowerNodeBuild{
        @Override
        public float getPowerProduction(){
            return enabled ? powerProduction : 0f;
        }
    }

}
