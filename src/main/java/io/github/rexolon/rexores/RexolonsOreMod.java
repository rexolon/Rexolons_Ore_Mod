package io.github.rexolon.rexores;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
@Mod(RexolonsOreMod.MOD_ID)
public class RexolonsOreMod {
    public static final String MOD_ID = "rexores";

    public RexolonsOreMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
