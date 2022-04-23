package sidus-victor.graphics.g3d;

import arc.graphics.gl.*;
import sidus-victor.type.*;

public class ShaderSphereMesh extends PlanetMesh{

    public ShaderSphereMesh(Planet planet, Shader shader, int divisions){
        super(planet, MeshBuilder.buildIcosphere(divisions, planet.radius), shader);
    }
}
