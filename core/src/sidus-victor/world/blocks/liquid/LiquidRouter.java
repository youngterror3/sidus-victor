package sidus-victor.world.blocks.liquid;

import sidus-victor.gen.*;
import sidus-victor.type.*;

public class LiquidRouter extends LiquidBlock{

    public LiquidRouter(String name){
        super(name);

        noUpdateDisabled = true;
        canOverdrive = false;
    }

    public class LiquidRouterBuild extends LiquidBuild{
        @Override
        public void updateTile(){
            if(liquids.total() > 0.01f){
                dumpLiquid(liquids.current());
            }
        }

        @Override
        public boolean acceptLiquid(Building source, Liquid liquid){
            return (liquids.current() == liquid || liquids.currentAmount() < 0.2f);
        }
    }
}
