package sidus-victor.world.blocks.sandbox;

import sidus-victor.world.blocks.power.*;
import sidus-victor.world.meta.*;

public class PowerVoid extends PowerBlock{

    public PowerVoid(String name){
        super(name);
        consumes.power(Float.MAX_VALUE);
        envEnabled = Env.any;
        enableDrawStatus = false;
    }

    @Override
    public void setStats(){
        super.setStats();
        stats.remove(Stat.powerUse);
    }
}
