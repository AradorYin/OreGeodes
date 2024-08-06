package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.aradoryin.yinoregeodes.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, OreGeodeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.GEODE_SHARDS)
                .add(Items.AMETHYST_SHARD)
                .add(ModItems.COAL_SHARD.get())
                .add(ModItems.COPPER_SHARD.get())
                .add(ModItems.DIAMOND_SHARD.get())
                .add(ModItems.EMERALD_SHARD.get())
                .add(ModItems.FLINT_SHARD.get())
                .add(ModItems.GOLD_SHARD.get())
                .add(ModItems.IRON_SHARD.get())
                .add(ModItems.LAPIS_SHARD.get())
                .add(ModItems.NETHERITE_SHARD.get())
                .add(ModItems.QUARTZ_SHARD.get())
                .add(ModItems.REDSTONE_SHARD.get())
                .add(ModItems.SLIME_SHARD.get());
    }
}
