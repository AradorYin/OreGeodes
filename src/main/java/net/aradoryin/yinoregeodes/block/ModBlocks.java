package net.aradoryin.yinoregeodes.block;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OreGeodeMod.MOD_ID);

    public static final DeferredBlock<Block> _BLOCK = registerBlock("_block", () -> new Block(BlockBehaviour.Properties
            .of()
            .strength(4f)
            .requiresCorrectToolForDrops()
    ));

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    /*
    GEM_Block
    GEM_Cluster
    Budding_GEM
    Calibrated_Sculk_Sensor_GEM
    Large_GEM_Bud
    Medium_GEM_Bud
    Small_GEM_Bud
     */
}
