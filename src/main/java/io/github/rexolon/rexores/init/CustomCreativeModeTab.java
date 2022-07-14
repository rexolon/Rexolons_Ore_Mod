package io.github.rexolon.rexores.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomCreativeModeTab {
    public static final CreativeModeTab REXORES_TAB = new CreativeModeTab("rexores_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.ALUMINIUM_INGOT.get());
        }
    };
}
