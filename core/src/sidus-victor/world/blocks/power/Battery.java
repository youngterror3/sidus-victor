package sidus-victor.world.blocks.power;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.gen.*;
import sidus-victor.world.meta.*;

import static sidus-victor.Vars.*;

public class Battery extends PowerDistributor{
    public @Load("@-top") TextureRegion topRegion;

    public Color emptyLightColor = Color.valueOf("f8c266");
    public Color fullLightColor = Color.valueOf("fb9567");

    public Battery(String name){
        super(name);
        outputsPower = true;
        consumesPower = true;
        canOverdrive = false;
        flags = EnumSet.of(BlockFlag.battery);
        //TODO could be supported everywhere...
        envEnabled |= Env.space;
    }

    public class BatteryBuild extends Building{
        @Override
        public void draw(){
            Draw.color(emptyLightColor, fullLightColor, power.status);
            Fill.square(x, y, tilesize * size / 2f - 1);
            Draw.color();

            Draw.rect(topRegion, x, y);
        }

        @Override
        public void overwrote(Seq<Building> previous){
            for(Building other : previous){
                if(other.power != null && other.block.consumes.hasPower() && other.block.consumes.getPower().buffered){
                    float amount = other.block.consumes.getPower().capacity * other.power.status;
                    power.status = Mathf.clamp(power.status + amount / block.consumes.getPower().capacity);
                }
            }
        }

        @Override
        public BlockStatus status(){
            if(Mathf.equal(power.status, 0f, 0.001f)) return BlockStatus.noInput;
            if(Mathf.equal(power.status, 1f, 0.001f)) return BlockStatus.active;
            return BlockStatus.noOutput;
        }
    }
}