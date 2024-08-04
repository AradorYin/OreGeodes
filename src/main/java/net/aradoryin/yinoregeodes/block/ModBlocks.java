package net.aradoryin.yinoregeodes.block;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.custom.ShardBlock;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

/*
        AMETHYST_BLOCK = register((String)"amethyst_block", new AmethystBlock(Properties
        .of().mapColor(MapColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
        BUDDING_AMETHYST = register((String)"budding_amethyst", new BuddingAmethystBlock(Properties
        .of().mapColor(MapColor.COLOR_PURPLE).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()
        .pushReaction(PushReaction.DESTROY)));
        AMETHYST_CLUSTER = register((String)"amethyst_cluster", new AmethystClusterBlock(7.0F, 3.0F, Properties
        .of().mapColor(MapColor.COLOR_PURPLE).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> {
            return 5;
        }).pushReaction(PushReaction.DESTROY)));
        LARGE_AMETHYST_BUD = register((String)"large_amethyst_bud", new AmethystClusterBlock(5.0F, 3.0F, Properties
        .ofLegacyCopy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> {
            return 4;
        })));
        MEDIUM_AMETHYST_BUD = register((String)"medium_amethyst_bud", new AmethystClusterBlock(4.0F, 3.0F, Properties
        .ofLegacyCopy(AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152617_) -> {
            return 2;
        })));
        SMALL_AMETHYST_BUD = register((String)"small_amethyst_bud", new AmethystClusterBlock(3.0F, 4.0F, Properties
        .ofLegacyCopy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_187409_) -> {
            return 1;
        })));
 */

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OreGeodeMod.MOD_ID);

    // SHARD STORAGE BLOCKS
    public static final DeferredBlock<Block> COAL_SHARD_BLOCK = registerBlock("coal_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_BLACK).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> COPPER_SHARD_BLOCK = registerBlock("copper_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_ORANGE).strength(2f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DIAMOND_SHARD_BLOCK = registerBlock("diamond_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.DIAMOND).strength(2.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> EMERALD_SHARD_BLOCK = registerBlock("emerald_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.EMERALD).strength(1.75f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLINT_SHARD_BLOCK = registerBlock("flint_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_GRAY).strength(1f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GOLD_SHARD_BLOCK = registerBlock("gold_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.GOLD).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> IRON_SHARD_BLOCK = registerBlock("iron_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.RAW_IRON).strength(2f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LAPIS_SHARD_BLOCK = registerBlock("lapis_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.LAPIS).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NETHERITE_SHARD_BLOCK = registerBlock("netherite_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_BLACK).strength(3.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> QUARTZ_SHARD_BLOCK = registerBlock("quartz_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.QUARTZ).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> REDSTONE_SHARD_BLOCK = registerBlock("redstone_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_RED).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SLIME_SHARD_BLOCK = registerBlock("slime_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(0.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

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
    GEM_Cluster
    Budding_GEM
    Calibrated_Sculk_Sensor_GEM
    Large_GEM_Bud
    Medium_GEM_Bud
    Small_GEM_Bud
     */
}
