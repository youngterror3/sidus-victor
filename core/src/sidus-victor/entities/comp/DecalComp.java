package sidus-victor.entities.comp;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.gen.*;
import sidus-victor.graphics.*;

@EntityDef(value = {Decalc.class}, pooled = true, serialize = false)
@Component(base = true)
abstract class DecalComp implements Drawc, Timedc, Rotc, Posc{
    @Import float x, y, rotation;

    Color color = new Color(1, 1, 1, 1);
    TextureRegion region;

    @Override
    public void draw(){
        Draw.z(Layer.scorch);

        Draw.mixcol(color, color.a);
        Draw.alpha(1f - Mathf.curve(fin(), 0.98f));
        Draw.rect(region, x, y, rotation);
        Draw.reset();
    }

    @Replace
    public float clipSize(){
        return region.width *2;
    }

}
