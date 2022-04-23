package sidus-victor.world.blocks.liquid;

import sidus-victor.gen.*;
import sidus-victor.type.*;
import sidus-victor.world.*;

public class ArmoredConduit extends Conduit{

    public ArmoredConduit(String name){
        super(name);
        leaks = false;
    }

    @Override
    public boolean blends(Tile tile, int rotation, int otherx, int othery, int otherrot, Block otherblock){
        return (otherblock.outputsLiquid && blendsArmored(tile, rotation, otherx, othery, otherrot, otherblock)) ||
            (lookingAt(tile, rotation, otherx, othery, otherblock) && otherblock.hasLiquids);
    }

    public class ArmoredConduitBuild extends ConduitBuild{
        @Override
        public boolean acceptLiquid(Building source, Liquid liquid){
            return super.acceptLiquid(source, liquid) && (tile == null || source.block instanceof Conduit ||
                source.tile.absoluteRelativeTo(tile.x, tile.y) == rotation);
        }
    }
}
