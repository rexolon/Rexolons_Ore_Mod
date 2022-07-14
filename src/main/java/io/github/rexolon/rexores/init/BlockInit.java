package io.github.rexolon.rexores.init;

import io.github.rexolon.rexores.RexolonsOreMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RexolonsOreMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;


    public static final RegistryObject<Block> LEAD_ORE = register("lead_ore", () -> new Block(BlockBehaviour.Properties
            .of(Material.STONE, MaterialColor.COLOR_GRAY).strength(3.0F, 5.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(RexolonsOreMod.REXORES_TAB)));


    public static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }
    public static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
            Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
