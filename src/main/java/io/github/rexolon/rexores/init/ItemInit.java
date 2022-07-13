package io.github.rexolon.rexores.init;

import io.github.rexolon.rexores.RexolonsOreMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RexolonsOreMod.MOD_ID);

    public static final RegistryObject<Item> LEAD_CHUNK = register("lead_chunk", () -> new Item(new Item.Properties().tab(RexolonsOreMod.REXORES_TAB)));


    public static <T extends Item>RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
