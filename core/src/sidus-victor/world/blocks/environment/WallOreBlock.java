package sidus-victor.world.blocks.environment;

import sidus-victor.type.*;

/**An overlay ore that draws on top of walls. */
public class WallOreBlock extends OreBlock{

    public WallOreBlock(Item ore){
        super("wall-ore-" + ore.name, ore);
    }

    //mods only
    public WallOreBlock(String name){
        super(name);
    }
}
