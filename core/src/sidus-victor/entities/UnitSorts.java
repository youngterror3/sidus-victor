package sidus-victor.entities;

import arc.math.*;
import sidus-victor.entities.Units.*;
import sidus-victor.gen.*;

public class UnitSorts{
    public static Sortf

    closest = Unit::dst2,
    farthest = (u, x, y) -> -u.dst2(x, y),
    strongest = (u, x, y) -> -u.maxHealth + Mathf.dst2(u.x, u.y, x, y) / 6400f,
    weakest = (u, x, y) -> u.maxHealth + Mathf.dst2(u.x, u.y, x, y) / 6400f;
}