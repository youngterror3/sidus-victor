package sidus-victor.world.blocks.distribution;

import sidus-victor.gen.*;
import sidus-victor.type.*;
import sidus-victor.world.*;

public class ArmoredConveyor extends Conveyor{

    public ArmoredConveyor(String name){
        super(name);
        noSideBlend = true;
    }

    @Override
    public boolean blends(Tile tile, int rotation, int otherx, int othery, int otherrot, Block otherblock){
        return (otherblock.outputsItems() && blendsArmored(tile, rotation, otherx, othery, otherrot, otherblock)) ||
            (lookingAt(tile, rotation, otherx, othery, otherblock) && otherblock.hasItems);
    }

    public class ArmoredConveyorBuild extends ConveyorBuild{
        @Override
        public boolean acceptItem(Building source, Item item){
            return super.acceptItem(source, item) && (source.block instanceof Conveyor || Edges.getFacingEdge(source.tile(), tile).relativeTo(tile) == rotation);
        }
    }
}
