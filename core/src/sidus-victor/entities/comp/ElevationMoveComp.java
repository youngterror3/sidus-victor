package sidus-victor.entities.comp;

import sidus-victor.annotations.Annotations.*;
import sidus-victor.entities.*;
import sidus-victor.entities.EntityCollisions.*;
import sidus-victor.gen.*;

@Component
abstract class ElevationMoveComp implements Velc, Posc, Flyingc, Hitboxc{
    @Import float x, y;

    @Replace
    @Override
    public SolidPred solidity(){
        return isFlying() ? null : EntityCollisions::solid;
    }

}
