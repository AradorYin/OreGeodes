package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        // BUDDING BLOCKS
        this.add(ModBlocks.BUDDING_COAL.get(), noDrop());
        this.add(ModBlocks.BUDDING_COPPER.get(), noDrop());
        this.add(ModBlocks.BUDDING_DIAMOND.get(), noDrop());
        this.add(ModBlocks.BUDDING_ECHO.get(), noDrop());
        this.add(ModBlocks.BUDDING_EMERALD.get(), noDrop());
        this.add(ModBlocks.BUDDING_FLINT.get(), noDrop());
        this.add(ModBlocks.BUDDING_GOLD.get(), noDrop());
        this.add(ModBlocks.BUDDING_IRON.get(), noDrop());
        this.add(ModBlocks.BUDDING_LAPIS.get(), noDrop());
        this.add(ModBlocks.BUDDING_NETHERITE.get(), noDrop());
        this.add(ModBlocks.BUDDING_QUARTZ.get(), noDrop());
        this.add(ModBlocks.BUDDING_REDSTONE.get(), noDrop());
        this.add(ModBlocks.BUDDING_SLIME.get(), noDrop());

        // CLUSTERS
        this.add(ModBlocks.COAL_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.COAL_CLUSTER.get(), ModItems.COAL_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.COPPER_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.COPPER_CLUSTER.get(), ModItems.COPPER_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.DIAMOND_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.DIAMOND_CLUSTER.get(), ModItems.DIAMOND_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.ECHO_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.ECHO_CLUSTER.get(), Items.ECHO_SHARD, 1.0f, 4.0f));
        this.add(ModBlocks.EMERALD_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.EMERALD_CLUSTER.get(), ModItems.EMERALD_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.FLINT_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.FLINT_CLUSTER.get(), ModItems.FLINT_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.GOLD_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.GOLD_CLUSTER.get(), ModItems.GOLD_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.IRON_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.IRON_CLUSTER.get(), ModItems.IRON_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.LAPIS_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.LAPIS_CLUSTER.get(), ModItems.LAPIS_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.NETHERITE_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.NETHERITE_CLUSTER.get(), ModItems.NETHERITE_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.QUARTZ_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.QUARTZ_CLUSTER.get(), ModItems.QUARTZ_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.REDSTONE_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.REDSTONE_CLUSTER.get(), ModItems.REDSTONE_SHARD.get(), 1.0f, 4.0f));
        this.add(ModBlocks.SLIME_CLUSTER.get(),
                block -> createMultipleClusterDrops(ModBlocks.SLIME_CLUSTER.get(), ModItems.SLIME_SHARD.get(), 1.0f, 4.0f));

        // LARGE BUDS
        dropWhenSilkTouch(ModBlocks.LARGE_COAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_COPPER_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_DIAMOND_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_ECHO_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_EMERALD_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_FLINT_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_GOLD_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_IRON_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_LAPIS_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_NETHERITE_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_QUARTZ_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_REDSTONE_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_SLIME_BUD.get());

        // MEDIUM BUDS
        dropWhenSilkTouch(ModBlocks.MEDIUM_COAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_COPPER_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_DIAMOND_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_ECHO_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_EMERALD_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_FLINT_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_GOLD_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_IRON_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_LAPIS_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_NETHERITE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_QUARTZ_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_REDSTONE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_SLIME_BUD.get());

        // SHARD BLOCKS
        dropSelf(ModBlocks.COAL_SHARD_BLOCK.get());
        dropSelf(ModBlocks.COPPER_SHARD_BLOCK.get());
        dropSelf(ModBlocks.DIAMOND_SHARD_BLOCK.get());
        dropSelf(ModBlocks.ECHO_SHARD_BLOCK.get());
        dropSelf(ModBlocks.EMERALD_SHARD_BLOCK.get());
        dropSelf(ModBlocks.FLINT_SHARD_BLOCK.get());
        dropSelf(ModBlocks.GOLD_SHARD_BLOCK.get());
        dropSelf(ModBlocks.IRON_SHARD_BLOCK.get());
        dropSelf(ModBlocks.LAPIS_SHARD_BLOCK.get());
        dropSelf(ModBlocks.NETHERITE_SHARD_BLOCK.get());
        dropSelf(ModBlocks.QUARTZ_SHARD_BLOCK.get());
        dropSelf(ModBlocks.REDSTONE_SHARD_BLOCK.get());
        dropSelf(ModBlocks.SLIME_SHARD_BLOCK.get());

        // SMALL BUDS
        dropWhenSilkTouch(ModBlocks.SMALL_COAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_COPPER_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_DIAMOND_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_ECHO_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_EMERALD_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_FLINT_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_GOLD_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_IRON_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_LAPIS_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_NETHERITE_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_QUARTZ_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_REDSTONE_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_SLIME_BUD.get());
    }

    protected LootTable.Builder createMultipleClusterDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
        ));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
