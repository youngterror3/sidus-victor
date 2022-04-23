package sidus-victor.entities.comp;

import arc.util.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.game.*;
import sidus-victor.gen.*;
import sidus-victor.world.blocks.storage.CoreBlock.*;

import static sidus-victor.Vars.*;

@Component
abstract class TeamComp implements Posc{
    @Import float x, y;

    Team team = Team.derelict;

    public boolean cheating(){
        return team.rules().cheat;
    }

    @Nullable
    public CoreBuild core(){
        return team.core();
    }

    @Nullable
    public CoreBuild closestCore(){
        return state.teams.closestCore(x, y, team);
    }

    @Nullable
    public CoreBuild closestEnemyCore(){
        return state.teams.closestEnemyCore(x, y, team);
    }
}
