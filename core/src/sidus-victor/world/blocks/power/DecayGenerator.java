package sidus-victor.world.blocks.power;

import sidus-victor.type.*;
import sidus-victor.world.meta.*;

public class DecayGenerator extends ItemLiquidGenerator{

    public DecayGenerator(String name){
        super(true, false, name);
        hasItems = true;
        hasLiquids = false;
        envEnabled = Env.any;
    }

    @Override
    protected float getItemEfficiency(Item item){
        return item.radioactivity;
    }
}
