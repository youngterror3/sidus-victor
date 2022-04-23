package sidus-victor.world.blocks.production;

import sidus-victor.world.blocks.payloads.*;

/** @deprecated used PayloadBlock instead. */
@Deprecated
public abstract class PayloadAcceptor extends PayloadBlock{

    public PayloadAcceptor(String name){
        super(name);
    }

    /** @deprecated used PayloadBlockBuild instead. */
    @Deprecated
    public class PayloadAcceptorBuild<T extends Payload> extends PayloadBlockBuild<T>{

    }
}
