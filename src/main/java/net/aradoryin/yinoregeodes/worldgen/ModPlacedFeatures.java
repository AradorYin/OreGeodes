package net.aradoryin.yinoregeodes.worldgen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> COAL_GEODE_PLACED_KEY = registerKey("coal_geode_placed_key");
    public static final ResourceKey<PlacedFeature> COPPER_GEODE_PLACED_KEY = registerKey("copper_geode_placed_key");
    public static final ResourceKey<PlacedFeature> DIAMOND_GEODE_PLACED_KEY = registerKey("diamond_geode_placed_key");
    public static final ResourceKey<PlacedFeature> ECHO_GEODE_PLACED_KEY = registerKey("echo_geode_placed_key");
    public static final ResourceKey<PlacedFeature> EMERALD_GEODE_PLACED_KEY = registerKey("emerald_geode_placed_key");
    public static final ResourceKey<PlacedFeature> FLINT_GEODE_PLACED_KEY = registerKey("flint_geode_placed_key");
    public static final ResourceKey<PlacedFeature> GOLD_GEODE_PLACED_KEY = registerKey("gold_geode_placed_key");
    public static final ResourceKey<PlacedFeature> IRON_GEODE_PLACED_KEY = registerKey("iron_geode_placed_key");
    public static final ResourceKey<PlacedFeature> LAPIS_GEODE_PLACED_KEY = registerKey("lapis_geode_placed_key");
    public static final ResourceKey<PlacedFeature> NETHERITE_GEODE_PLACED_KEY = registerKey("netherite_geode_placed_key");
    public static final ResourceKey<PlacedFeature> QUARTZ_GEODE_PLACED_KEY = registerKey("quartz_geode_placed_key");
    public static final ResourceKey<PlacedFeature> REDSTONE_GEODE_PLACED_KEY = registerKey("redstone_geode_placed_key");
    public static final ResourceKey<PlacedFeature> SLIME_GEODE_PLACED_KEY = registerKey("slime_geode_placed_key");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, COAL_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COAL_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, COPPER_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COPPER_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, DIAMOND_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DIAMOND_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(65), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, ECHO_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ECHO_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(80), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, EMERALD_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EMERALD_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(60), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, FLINT_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLINT_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, GOLD_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLD_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, IRON_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRON_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, LAPIS_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAPIS_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, NETHERITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERITE_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(80), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, QUARTZ_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.QUARTZ_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(65), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, REDSTONE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.REDSTONE_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));

        register(context, SLIME_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SLIME_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(58), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
