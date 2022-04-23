package sidus-victor.world.blocks.environment;

import arc.*;
import arc.graphics.g2d.*;
import arc.math.*;
import sidus-victor.content.*;
import sidus-victor.gen.*;
import sidus-victor.world.*;

public class Prop extends Block{

    public Prop(String name){
        super(name);
        breakable = true;
        alwaysReplace = true;
        instantDeconstruct = true;
        breakEffect = Fx.breakProp;
        breakSound = Sounds.rockBreak;
    }

    @Override
    public void drawBase(Tile tile){
        Draw.rect(variants > 0 ? variantRegions[Mathf.randomSeed(tile.pos(), 0, Math.max(0, variantRegions.length - 1))] : region, tile.worldx(), tile.worldy());
    }

    @Override
    public TextureRegion[] icons(){
        return variants == 0 ? super.icons() : new TextureRegion[]{Core.atlas.find(name + "1")};
    }
}
