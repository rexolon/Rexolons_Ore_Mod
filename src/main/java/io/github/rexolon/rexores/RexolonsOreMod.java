package io.github.rexolon.rexores;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RexolonsOreMod.MOD_ID)
public class RexolonsOreMod {
    public static final String MOD_ID = "rexores";

    public RexolonsOreMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
