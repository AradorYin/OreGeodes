package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
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
        dropSelf(ModBlocks.COAL_SHARD_BLOCK.get());
        dropSelf(ModBlocks.COPPER_SHARD_BLOCK.get());
        dropSelf(ModBlocks.DIAMOND_SHARD_BLOCK.get());
        dropSelf(ModBlocks.EMERALD_SHARD_BLOCK.get());
        dropSelf(ModBlocks.FLINT_SHARD_BLOCK.get());
        dropSelf(ModBlocks.GOLD_SHARD_BLOCK.get());
        dropSelf(ModBlocks.IRON_SHARD_BLOCK.get());
        dropSelf(ModBlocks.LAPIS_SHARD_BLOCK.get());
        dropSelf(ModBlocks.NETHERITE_SHARD_BLOCK.get());
        dropSelf(ModBlocks.QUARTZ_SHARD_BLOCK.get());
        dropSelf(ModBlocks.REDSTONE_SHARD_BLOCK.get());
        dropSelf(ModBlocks.SLIME_SHARD_BLOCK.get());

//        dropWhenSilkTouch(SmallBud,MediumBud,LargeBud);
//        this.add(Budding Block, noDrop());

//        this.add(ModBlocks._BLOCK.get(), block -> createOreDrop(ModBlocks._BLOCK.get(), ModItems.s_SHARD.get()));
    }

    /**
     * This was created in the event of needing to create ore drops for a block.
     * If this method is not used in the future, it will be removed.
     * {@code @Deprecated}
     */
    @Deprecated
    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
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
