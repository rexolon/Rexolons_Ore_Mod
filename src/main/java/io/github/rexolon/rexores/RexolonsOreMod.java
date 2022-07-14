package io.github.rexolon.rexores;

import io.github.rexolon.rexores.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RexolonsOreMod.MOD_ID)
public class RexolonsOreMod {
    public static final String MOD_ID = "rexores";

    public RexolonsOreMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
