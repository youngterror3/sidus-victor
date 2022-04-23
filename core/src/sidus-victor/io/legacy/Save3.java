package sidus-victor.io.legacy;

import sidus-victor.game.*;
import sidus-victor.game.Teams.*;

import java.io.*;

import static sidus-victor.Vars.*;

public class Save3 extends LegacySaveVersion{

    public Save3(){
        super(3);
    }

    @Override
    public void readEntities(DataInput stream) throws IOException{
        int teamc = stream.readInt();
        for(int i = 0; i < teamc; i++){
            Team team = Team.get(stream.readInt());
            TeamData data = team.data();
            int blocks = stream.readInt();
            for(int j = 0; j < blocks; j++){
                data.blocks.addLast(new BlockPlan(stream.readShort(), stream.readShort(), stream.readShort(), content.block(stream.readShort()).id, stream.readInt()));
            }
        }

        readLegacyEntities(stream);
    }
}
