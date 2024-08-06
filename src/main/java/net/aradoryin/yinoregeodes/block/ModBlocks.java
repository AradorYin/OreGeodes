package net.aradoryin.yinoregeodes.block;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.custom.budding.*;
import net.aradoryin.yinoregeodes.block.custom.ClusterBlock;
import net.aradoryin.yinoregeodes.block.custom.ShardBlock;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

    /*
    TODO: Calibrated_Sculk_Sensor_GEM
     */

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OreGeodeMod.MOD_ID);

    // CLUSTERS
    public static final DeferredBlock<Block> COAL_CLUSTER = registerBlock("coal_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> COPPER_CLUSTER = registerBlock("copper_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DIAMOND_CLUSTER = registerBlock("diamond_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> ECHO_CLUSTER = registerBlock("echo_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> EMERALD_CLUSTER = registerBlock("emerald_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> FLINT_CLUSTER = registerBlock("flint_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLD_CLUSTER = registerBlock("gold_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> IRON_CLUSTER = registerBlock("iron_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.RAW_IRON).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> LAPIS_CLUSTER = registerBlock("lapis_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> NETHERITE_CLUSTER = registerBlock("netherite_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> QUARTZ_CLUSTER = registerBlock("quartz_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> REDSTONE_CLUSTER = registerBlock("redstone_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> SLIME_CLUSTER = registerBlock("slime_cluster", () -> new ClusterBlock(7.0f, 3.0f,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).forceSolidOn().noOcclusion().sound(SoundType.AMETHYST_CLUSTER)
                    .strength(1.5f).lightLevel(lightLevel -> 5).pushReaction(PushReaction.DESTROY)));

    // LARGE BUDS
    public static final DeferredBlock<Block> LARGE_COAL_BUD = registerBlock("large_coal_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(COAL_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_COPPER_BUD = registerBlock("large_copper_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(COPPER_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_DIAMOND_BUD = registerBlock("large_diamond_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(DIAMOND_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_ECHO_BUD = registerBlock("large_echo_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(ECHO_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_EMERALD_BUD = registerBlock("large_emerald_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(EMERALD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_FLINT_BUD = registerBlock("large_flint_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(FLINT_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_GOLD_BUD = registerBlock("large_gold_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(GOLD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_IRON_BUD = registerBlock("large_iron_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(IRON_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_LAPIS_BUD = registerBlock("large_lapis_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(LAPIS_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_NETHERITE_BUD = registerBlock("large_netherite_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(NETHERITE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_QUARTZ_BUD = registerBlock("large_quartz_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(QUARTZ_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_REDSTONE_BUD = registerBlock("large_redstone_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(REDSTONE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));
    public static final DeferredBlock<Block> LARGE_SLIME_BUD = registerBlock("large_slime_bud", () -> new ClusterBlock(5.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(SLIME_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 4)));

    // MEDIUM BUDS
    public static final DeferredBlock<Block> MEDIUM_COAL_BUD = registerBlock("medium_coal_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(COAL_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_COPPER_BUD = registerBlock("medium_copper_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(COPPER_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_DIAMOND_BUD = registerBlock("medium_diamond_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(DIAMOND_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_ECHO_BUD = registerBlock("medium_echo_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(ECHO_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_EMERALD_BUD = registerBlock("medium_emerald_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(EMERALD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_FLINT_BUD = registerBlock("medium_flint_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(FLINT_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_GOLD_BUD = registerBlock("medium_gold_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(GOLD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_IRON_BUD = registerBlock("medium_iron_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(IRON_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_LAPIS_BUD = registerBlock("medium_lapis_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(LAPIS_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_NETHERITE_BUD = registerBlock("medium_netherite_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(NETHERITE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_QUARTZ_BUD = registerBlock("medium_quartz_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(QUARTZ_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_REDSTONE_BUD = registerBlock("medium_redstone_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(REDSTONE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));
    public static final DeferredBlock<Block> MEDIUM_SLIME_BUD = registerBlock("medium_slime_bud", () -> new ClusterBlock(4.0f, 3.0f,
            BlockBehaviour.Properties.ofLegacyCopy(SLIME_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 2)));

    // SHARD BLOCKS
    public static final DeferredBlock<Block> COAL_SHARD_BLOCK = registerBlock("coal_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_BLACK).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> COPPER_SHARD_BLOCK = registerBlock("copper_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_ORANGE).strength(2f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DIAMOND_SHARD_BLOCK = registerBlock("diamond_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.DIAMOND).strength(2.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ECHO_SHARD_BLOCK = registerBlock("echo_shard_block", () -> new ShardBlock(BlockBehaviour.Properties
            .of().mapColor(MapColor.COLOR_BLUE).strength(1.75f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
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

    // SMALL BUDS
    public static final DeferredBlock<Block> SMALL_COAL_BUD = registerBlock("small_coal_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(COAL_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_COPPER_BUD = registerBlock("small_copper_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(COPPER_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_DIAMOND_BUD = registerBlock("small_diamond_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(DIAMOND_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_ECHO_BUD = registerBlock("small_echo_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(ECHO_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_EMERALD_BUD = registerBlock("small_emerald_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(EMERALD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_FLINT_BUD = registerBlock("small_flint_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(FLINT_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_GOLD_BUD = registerBlock("small_gold_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(GOLD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_IRON_BUD = registerBlock("small_iron_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(IRON_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_LAPIS_BUD = registerBlock("small_lapis_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(LAPIS_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_NETHERITE_BUD = registerBlock("small_netherite_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(NETHERITE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_QUARTZ_BUD = registerBlock("small_quartz_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(QUARTZ_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_REDSTONE_BUD = registerBlock("small_redstone_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(REDSTONE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));
    public static final DeferredBlock<Block> SMALL_SLIME_BUD = registerBlock("small_slime_bud", () -> new ClusterBlock(3.0f, 4.0f,
            BlockBehaviour.Properties.ofLegacyCopy(SLIME_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightLevel -> 1)));

    // BUDDING BLOCKS
    public static final DeferredBlock<Block> BUDDING_COAL = registerBlock("budding_coal", () -> new CoalBuddingBlock(
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(1.5f)
                    .sound(SoundType.AMETHYST_CLUSTER).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_COPPER = registerBlock("budding_copper", () -> new CopperBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_DIAMOND = registerBlock("budding_diamond", () -> new DiamondBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.DIAMOND).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_ECHO = registerBlock("budding_echo", () -> new EchoBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLUE).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_EMERALD = registerBlock("budding_emerald", () -> new EmeraldBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.EMERALD).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_FLINT = registerBlock("budding_flint", () -> new FlintBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GRAY).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_GOLD = registerBlock("budding_gold", () -> new GoldBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.GOLD).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_IRON = registerBlock("budding_iron", () -> new IronBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.RAW_IRON).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_LAPIS = registerBlock("budding_lapis", () -> new LapisBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.LAPIS).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_NETHERITE = registerBlock("budding_netherite", () -> new NetheriteBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLACK).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_QUARTZ = registerBlock("budding_quartz", () -> new QuartzBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.QUARTZ).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_REDSTONE = registerBlock("budding_redstone", () -> new RedstoneBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_RED).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BUDDING_SLIME = registerBlock("budding_slime", () -> new SlimeBuddingBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_GREEN).randomTicks().strength(1.5f).sound(SoundType.AMETHYST_CLUSTER)
            .requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY)));

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
}
