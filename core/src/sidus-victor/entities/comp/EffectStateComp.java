package sidus-victor.entities.comp;

import arc.graphics.*;
import sidus-victor.annotations.Annotations.*;
import sidus-victor.entities.*;
import sidus-victor.gen.*;

@EntityDef(value = {EffectStatec.class, Childc.class}, pooled = true, serialize = false)
@Component(base = true)
abstract class EffectStateComp implements Posc, Drawc, Timedc, Rotc, Childc{
    @Import float time, lifetime, rotation, x, y;
    @Import int id;

    Color color = new Color(Color.white);
    Effect effect;
    Object data;

    @Override
    public void draw(){
        lifetime = effect.render(id, color, time, lifetime, rotation, x, y, data);
    }

    @Replace
    public float clipSize(){
        return effect.clip;
    }
}
