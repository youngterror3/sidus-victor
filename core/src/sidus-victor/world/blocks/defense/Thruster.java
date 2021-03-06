package sidus-victor.world.blocks.defense;

import arc.graphics.g2d.*;
import arc.util.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.entities.units.*;

public class Thruster extends Wall{
    public @Load("@-top") TextureRegion topRegion;

    public Thruster(String name){
        super(name);
        rotate = true;
        quickRotate = false;
    }

    @Override
    public void drawRequestRegion(BuildPlan req, Eachable<BuildPlan> list){
        Draw.rect(region, req.drawx(), req.drawy());
        Draw.rect(topRegion, req.drawx(), req.drawy(), req.rotation * 90);
    }

    @Override
    public TextureRegion[] icons(){
        return new TextureRegion[]{region, topRegion};
    }

    public class ThrusterBuild extends WallBuild{

        @Override
        public void draw(){
            Draw.rect(block.region, x, y);
            Draw.rect(topRegion, x, y, rotdeg());
        }
    }
}
