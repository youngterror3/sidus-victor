package sidus-victor.world.blocks.production;

import arc.math.*;
import sidus-victor.gen.*;
import sidus-victor.world.meta.*;

public class Fracker extends SolidPump{
    public float itemUseTime = 100f;

    public Fracker(String name){
        super(name);
        hasItems = true;
        ambientSound = Sounds.drill;
        ambientSoundVolume = 0.03f;
        envRequired |= Env.groundOil;
    }

    @Override
    public void setStats(){
        stats.timePeriod = itemUseTime;
        super.setStats();

        stats.add(Stat.productionTime, itemUseTime / 60f, StatUnit.seconds);
    }

    public class FrackerBuild extends SolidPumpBuild{
        public float accumulator;

        @Override
        public void updateTile(){
            if(consValid()){
                if(accumulator >= itemUseTime){
                    consume();
                    accumulator -= itemUseTime;
                }

                super.updateTile();
                accumulator += delta() * efficiency();
            }else{
                warmup = Mathf.lerpDelta(warmup, 0f, 0.02f);
                lastPump = 0f;
                dumpLiquid(result);
            }
        }
    }
}
