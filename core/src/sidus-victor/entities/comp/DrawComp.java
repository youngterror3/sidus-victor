package sidus-victor.entities.comp;

import sidus-victor.annotations.Annotations.*;
import sidus-victor.gen.*;

@Component
abstract class DrawComp implements Posc{

    float clipSize(){
        return Float.MAX_VALUE;
    }

    void draw(){

    }
}
