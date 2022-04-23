package sidus-victor.world.blocks.sandbox;

import sidus-victor.gen.*;
import sidus-victor.type.*;
import sidus-victor.world.*;
import sidus-victor.world.meta.*;

public class LiquidVoid extends Block{

    public LiquidVoid(String name){
        super(name);
        hasLiquids = true;
        solid = true;
        update = true;
        group = BlockGroup.liquids;
        envEnabled = Env.any;
    }

    @Override
    public void setBars(){
        super.setBars();
        bars.remove("liquid");
    }

    public class LiquidVoidBuild extends Building{
        @Override
        public boolean acceptLiquid(Building source, Liquid liquid){
            return enabled;
        }

        @Override
        public void handleLiquid(Building source, Liquid liquid, float amount){
        }
    }

}
