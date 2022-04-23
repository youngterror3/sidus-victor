package sidus-victor.entities.abilities;

import arc.util.*;
import sidus-victor.content.*;
import sidus-victor.entities.*;
import sidus-victor.gen.*;

public class RepairFieldAbility extends Ability{
    public float amount = 1, reload = 100, range = 60;
    public Effect healEffect = Fx.heal;
    public Effect activeEffect = Fx.healWaveDynamic;
    public boolean parentizeEffects = false;

    protected float timer;
    protected boolean wasHealed = false;

    RepairFieldAbility(){}

    public RepairFieldAbility(float amount, float reload, float range){
        this.amount = amount;
        this.reload = reload;
        this.range = range;
    }

    @Override
    public void update(Unit unit){
        timer += Time.delta;

        if(timer >= reload){
            wasHealed = false;

            Units.nearby(unit.team, unit.x, unit.y, range, other -> {
                if(other.damaged()){
                    healEffect.at(other, parentizeEffects);
                    wasHealed = true;
                }
                other.heal(amount);
            });

            if(wasHealed){
                activeEffect.at(unit, range);
            }

            timer = 0f;
        }
    }
}
