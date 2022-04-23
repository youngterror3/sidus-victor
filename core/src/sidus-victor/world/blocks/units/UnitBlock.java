package sidus-victor.world.blocks.units;

import sidus-victor.annotations.Annotations.*;
import sidus-victor.gen.*;
import sidus-victor.world.*;
import sidus-victor.world.blocks.payloads.*;
import sidus-victor.world.meta.*;

public class UnitBlock extends PayloadBlock{

    public UnitBlock(String name){
        super(name);
        group = BlockGroup.units;
        outputsPayload = true;
        rotate = true;
        update = true;
        solid = true;
    }

    @Remote(called = Loc.server)
    public static void unitBlockSpawn(Tile tile){
        if(tile == null || !(tile.build instanceof UnitBuild build)) return;
        build.spawned();
    }

    public class UnitBuild extends PayloadBlockBuild<UnitPayload>{
        public float progress, time, speedScl;

        public void spawned(){
            progress = 0f;
            payload = null;
        }

        @Override
        public void dumpPayload(){
            if(payload.dump()){
                Call.unitBlockSpawn(tile);
            }
        }
    }
}
