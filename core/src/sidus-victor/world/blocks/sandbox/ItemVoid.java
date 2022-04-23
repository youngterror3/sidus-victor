package sidus-victor.world.blocks.sandbox;

import sidus-victor.gen.*;
import sidus-victor.type.*;
import sidus-victor.world.*;
import sidus-victor.world.meta.*;

public class ItemVoid extends Block{

    public ItemVoid(String name){
        super(name);
        group = BlockGroup.transportation;
        update = solid = acceptsItems = true;
        envEnabled = Env.any;
    }

    public class ItemVoidBuild extends Building{
        @Override
        public void handleItem(Building source, Item item){}

        @Override
        public boolean acceptItem(Building source, Item item){
            return enabled;
        }
    }
}
