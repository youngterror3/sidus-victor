package sidus-victor.logic;

import sidus-victor.ctype.*;

public interface Senseable{
    Object noSensed = new Object();

    double sense(LAccess sensor);
    double sense(Content content);

    default Object senseObject(LAccess sensor){
        return noSensed;
    }
}
