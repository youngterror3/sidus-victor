package sidus-victor.ai.types;

import arc.math.*;
import sidus-victor.entities.*;
import sidus-victor.entities.units.*;
import sidus-victor.gen.*;
import sidus-victor.world.meta.*;

import static sidus-victor.Vars.*;

public class DefenderAI extends AIController{

    @Override
    public void updateMovement(){
        unloadPayloads();

        if(target != null){
            moveTo(target, (target instanceof Sized s ? s.hitSize()/2f * 1.1f : 0f) + unit.hitSize/2f + 15f, 50f);
            unit.lookAt(target);
        }
    }

    @Override
    public void updateTargeting(){
        if(retarget()) target = findTarget(unit.x, unit.y, unit.range(), true, true);
    }
    
    @Override
    public Teamc findTarget(float x, float y, float range, boolean air, boolean ground){

        //find unit to follow if not in rally mode
        if(command() != UnitCommand.rally){
            //Sort by max health and closer target.
            var result = Units.closest(unit.team, x, y, Math.max(range, 400f), u -> !u.dead() && u.type != unit.type, (u, tx, ty) -> -u.maxHealth + Mathf.dst2(u.x, u.y, tx, ty) / 6400f);
            if(result != null) return result;
        }

        //find rally point
        var block = targetFlag(unit.x, unit.y, BlockFlag.rally, false);
        if(block != null) return block;
        //return core if found
        var core = unit.closestCore();
        if(core != null) return core;

        //for enemies, target the enemy core.
        if(state.rules.waves && unit.team == state.rules.waveTeam){
            return unit.closestEnemyCore();
        }

        return null;
    }
}
