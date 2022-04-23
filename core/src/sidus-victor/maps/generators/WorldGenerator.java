package sidus-victor.maps.generators;

import sidus-victor.world.*;

public interface WorldGenerator{
    void generate(Tiles tiles);

    /** Do not modify tiles here. This is only for specialized configuration. */
    default void postGenerate(Tiles tiles){}
}
