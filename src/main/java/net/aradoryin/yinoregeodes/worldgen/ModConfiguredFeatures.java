package net.aradoryin.yinoregeodes.worldgen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAL_GEODE_KEY = registerKey("coal_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COPPER_GEODE_KEY = registerKey("copper_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_GEODE_KEY = registerKey("diamond_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_GEODE_KEY = registerKey("echo_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EMERALD_GEODE_KEY = registerKey("emerald_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLINT_GEODE_KEY = registerKey("flint_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_GEODE_KEY = registerKey("gold_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_GEODE_KEY = registerKey("iron_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_GEODE_KEY = registerKey("lapis_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERITE_GEODE_KEY = registerKey("netherite_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_GEODE_KEY = registerKey("quartz_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_GEODE_KEY = registerKey("redstone_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SLIME_GEODE_KEY = registerKey("slime_geode_key");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, COAL_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.COAL_SHARD_BLOCK, ModBlocks.BUDDING_COAL, ModBlocks.SMALL_COAL_BUD,
                ModBlocks.MEDIUM_COAL_BUD, ModBlocks.LARGE_COAL_BUD, ModBlocks.COAL_CLUSTER));

        register(context, COPPER_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.COPPER_SHARD_BLOCK, ModBlocks.BUDDING_COPPER, ModBlocks.SMALL_COPPER_BUD,
                ModBlocks.MEDIUM_COPPER_BUD, ModBlocks.LARGE_COPPER_BUD, ModBlocks.COPPER_CLUSTER));

        register(context, DIAMOND_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.DIAMOND_SHARD_BLOCK, ModBlocks.BUDDING_DIAMOND, ModBlocks.SMALL_DIAMOND_BUD,
                ModBlocks.MEDIUM_DIAMOND_BUD, ModBlocks.LARGE_DIAMOND_BUD, ModBlocks.DIAMOND_CLUSTER));

        register(context, ECHO_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.ECHO_SHARD_BLOCK, ModBlocks.BUDDING_ECHO, ModBlocks.SMALL_ECHO_BUD,
                ModBlocks.MEDIUM_ECHO_BUD, ModBlocks.LARGE_ECHO_BUD, ModBlocks.ECHO_CLUSTER));

        register(context, EMERALD_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.EMERALD_SHARD_BLOCK, ModBlocks.BUDDING_EMERALD, ModBlocks.SMALL_EMERALD_BUD,
                ModBlocks.MEDIUM_EMERALD_BUD, ModBlocks.LARGE_EMERALD_BUD, ModBlocks.EMERALD_CLUSTER));

        register(context, FLINT_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.FLINT_SHARD_BLOCK, ModBlocks.BUDDING_FLINT, ModBlocks.SMALL_FLINT_BUD,
                ModBlocks.MEDIUM_FLINT_BUD, ModBlocks.LARGE_FLINT_BUD, ModBlocks.FLINT_CLUSTER));

        register(context, GOLD_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.GOLD_SHARD_BLOCK, ModBlocks.BUDDING_GOLD, ModBlocks.SMALL_GOLD_BUD,
                ModBlocks.MEDIUM_GOLD_BUD, ModBlocks.LARGE_GOLD_BUD, ModBlocks.GOLD_CLUSTER));

        register(context, IRON_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.IRON_SHARD_BLOCK, ModBlocks.BUDDING_IRON, ModBlocks.SMALL_IRON_BUD,
                ModBlocks.MEDIUM_IRON_BUD, ModBlocks.LARGE_IRON_BUD, ModBlocks.IRON_CLUSTER));

        register(context, LAPIS_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.LAPIS_SHARD_BLOCK, ModBlocks.BUDDING_LAPIS, ModBlocks.SMALL_LAPIS_BUD,
                ModBlocks.MEDIUM_LAPIS_BUD, ModBlocks.LARGE_LAPIS_BUD, ModBlocks.LAPIS_CLUSTER));

        register(context, NETHERITE_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.NETHERITE_SHARD_BLOCK, ModBlocks.BUDDING_NETHERITE, ModBlocks.SMALL_NETHERITE_BUD,
                ModBlocks.MEDIUM_NETHERITE_BUD, ModBlocks.LARGE_NETHERITE_BUD, ModBlocks.NETHERITE_CLUSTER));

        register(context, QUARTZ_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.QUARTZ_SHARD_BLOCK, ModBlocks.BUDDING_QUARTZ, ModBlocks.SMALL_QUARTZ_BUD,
                ModBlocks.MEDIUM_QUARTZ_BUD, ModBlocks.LARGE_QUARTZ_BUD, ModBlocks.QUARTZ_CLUSTER));

        register(context, REDSTONE_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.REDSTONE_SHARD_BLOCK, ModBlocks.BUDDING_REDSTONE, ModBlocks.SMALL_REDSTONE_BUD,
                ModBlocks.MEDIUM_REDSTONE_BUD, ModBlocks.LARGE_REDSTONE_BUD, ModBlocks.REDSTONE_CLUSTER));

        register(context, SLIME_GEODE_KEY, Feature.GEODE, geodeCreate(ModBlocks.SLIME_SHARD_BLOCK, ModBlocks.BUDDING_SLIME, ModBlocks.SMALL_SLIME_BUD,
                ModBlocks.MEDIUM_SLIME_BUD, ModBlocks.LARGE_SLIME_BUD, ModBlocks.SLIME_CLUSTER));
    }

    private static GeodeConfiguration geodeCreate(DeferredBlock<Block> shardBlock, DeferredBlock<Block> buddingBlock, DeferredBlock<Block> smallBud,
                                                  DeferredBlock<Block> mediumBud, DeferredBlock<Block> largeBud, DeferredBlock<Block> cluster) {
        return new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(shardBlock.get()),
                BlockStateProvider.simple(buddingBlock.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(
                        smallBud.get().defaultBlockState(),
                        mediumBud.get().defaultBlockState(),
                        largeBud.get().defaultBlockState(),
                        cluster.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 1.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, 2.0, 2),
                0.35, 0.83, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05, 1);
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> registerKey(final String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
            ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
