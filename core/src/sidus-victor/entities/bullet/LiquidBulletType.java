package sidus-victor.entities.bullet;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.geom.*;
import arc.util.*;
import sidus-victor.content.*;
import sidus-victor.entities.*;
import sidus-victor.gen.*;
import sidus-victor.type.*;
import sidus-victor.world.*;

import static sidus-victor.Vars.*;

public class LiquidBulletType extends BulletType{
    public Liquid liquid;
    public float puddleSize = 6f;
    public float orbSize = 3f;

    public LiquidBulletType(@Nullable Liquid liquid){
        super(3.5f, 0);

        if(liquid != null){
            this.liquid = liquid;
            this.status = liquid.effect;
            lightColor = liquid.lightColor;
            lightOpacity = liquid.lightColor.a;
        }

        ammoMultiplier = 1f;
        lifetime = 34f;
        statusDuration = 60f * 2f;
        despawnEffect = Fx.none;
        hitEffect = Fx.hitLiquid;
        smokeEffect = Fx.none;
        shootEffect = Fx.none;
        drag = 0.001f;
        knockback = 0.55f;
        displayAmmoMultiplier = false;
    }

    public LiquidBulletType(){
        this(null);
    }

    @Override
    public void update(Bullet b){
        super.update(b);

        if(liquid.canExtinguish()){
            Tile tile = world.tileWorld(b.x, b.y);
            if(tile != null && Fires.has(tile.x, tile.y)){
                Fires.extinguish(tile, 100f);
                b.remove();
                hit(b);
            }
        }
    }

    @Override
    public void draw(Bullet b){
        super.draw(b);
        Draw.color(liquid.color, Color.white, b.fout() / 100f);
        Fill.circle(b.x, b.y, orbSize);
        Draw.reset();
    }

    @Override
    public void despawned(Bullet b){
        super.despawned(b);

        //don't create liquids when the projectile despawns
        hitEffect.at(b.x, b.y, b.rotation(), liquid.color);
    }

    @Override
    public void hit(Bullet b, float hitx, float hity){
        hitEffect.at(hitx, hity, liquid.color);
        Puddles.deposit(world.tileWorld(hitx, hity), liquid, puddleSize);

        if(liquid.temperature <= 0.5f && liquid.flammability < 0.3f){
            float intensity = 400f * puddleSize/6f;
            Fires.extinguish(world.tileWorld(hitx, hity), intensity);
            for(Point2 p : Geometry.d4){
                Fires.extinguish(world.tileWorld(hitx + p.x * tilesize, hity + p.y * tilesize), intensity);
            }
        }
    }
}
