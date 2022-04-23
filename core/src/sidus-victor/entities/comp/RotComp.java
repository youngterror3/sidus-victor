package sidus-victor.entities.comp;

import sidus-victor.annotations.Annotations.*;
import sidus-victor.gen.*;

@Component
abstract class RotComp implements Entityc{
    @SyncField(false) @SyncLocal float rotation;
}
