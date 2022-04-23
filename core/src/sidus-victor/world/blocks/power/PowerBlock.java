package sidus-victor.world.blocks.power;

import sidus-victor.world.*;
import sidus-victor.world.meta.*;

public class PowerBlock extends Block{

    public PowerBlock(String name){
        super(name);
        update = true;
        solid = true;
        hasPower = true;
        group = BlockGroup.power;
    }
}
