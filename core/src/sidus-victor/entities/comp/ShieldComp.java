package sidus-victor.entities.comp;

import arc.util.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.content.*;
import sidus-victor.game.*;
import sidus-victor.gen.*;

import static sidus-victor.Vars.*;

@Component
abstract class ShieldComp implements Healthc, Posc{
    @Import float health, hitTime, x, y, healthMultiplier;
    @Import boolean dead;
    @Import Team team;

    /** Absorbs health damage. */
    float shield;
    /** Subtracts an amount from damage. No need to save. */
    transient float armor;
    /** Shield opacity. */
    transient float shieldAlpha = 0f;

    @Replace
    @Override
    public void damage(float amount){
        //apply armor
        amount = Math.max(amount - armor, minArmorDamage * amount);
        amount /= healthMultiplier;

        rawDamage(amount);
    }

    @Replace
    @Override
    public void damagePierce(float amount, boolean withEffect){
        float pre = hitTime;

        rawDamage(amount);

        if(!withEffect){
            hitTime = pre;
        }
    }

    private void rawDamage(float amount){
        boolean hadShields = shield > 0.0001f;

        if(hadShields){
            shieldAlpha = 1f;
        }

        float shieldDamage = Math.min(Math.max(shield, 0), amount);
        shield -= shieldDamage;
        hitTime = 1f;
        amount -= shieldDamage;

        if(amount > 0){
            health -= amount;
            if(health <= 0 && !dead){
                kill();
            }

            if(hadShields && shield <= 0.0001f){
                Fx.unitShieldBreak.at(x, y, 0, team.color, this);
            }
        }
    }

    @Override
    public void update(){
        shieldAlpha -= Time.delta / 15f;
        if(shieldAlpha < 0) shieldAlpha = 0f;
    }
}
