package sidus-victor.entities.comp;

import arc.math.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.gen.*;
import sidus-victor.graphics.*;
import sidus-victor.type.*;

@Component
abstract class TrailComp implements Unitc{
    @Import UnitType type;
    @Import float x, y, rotation;

    transient Trail trail = new Trail(6);

    @Override
    public void update(){
        trail.length = type.trailLength;

        float scale = elevation();
        float offset = type.engineOffset/2f + type.engineOffset/2f*scale;

        float cx = x + Angles.trnsx(rotation + 180, offset), cy = y + Angles.trnsy(rotation + 180, offset);
        trail.update(cx, cy);
    }
}
