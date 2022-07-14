package io.github.rexolon.rexores.init;

import io.github.rexolon.rexores.RexolonsOreMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RexolonsOreMod.MOD_ID);

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(CustomCreativeModeTab.REXORES_TAB)));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties().tab(CustomCreativeModeTab.REXORES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}