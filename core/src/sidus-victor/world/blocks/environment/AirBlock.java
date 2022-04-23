package sidus-victor.world.blocks.environment;

import arc.*;
import arc.graphics.g2d.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.world.*;

public class AirBlock extends Floor{

    public AirBlock(String name){
        super(name);
        alwaysReplace = true;
        hasShadow = false;
        useColor = false;
        wall = this;
        needsSurface = false;
        canShadow = false;
    }

    @Override
    public void drawBase(Tile tile){}

    @OverrideCallSuper
    @Override
    public void load(){}

    @OverrideCallSuper
    @Override
    public void init(){
        decoration = this;
    }

    @Override
    public boolean isHidden(){
        return true;
    }

    @Override
    public TextureRegion[] variantRegions(){
        if(variantRegions == null){
            variantRegions = new TextureRegion[]{Core.atlas.find("clear")};
        }
        return variantRegions;
    }
}
