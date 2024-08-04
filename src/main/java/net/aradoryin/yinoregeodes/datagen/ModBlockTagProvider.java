package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.aradoryin.yinoregeodes.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OreGeodeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTags(ModTags.Blocks.SHARD_STORAGE_BLOCKS);

        tag(ModTags.Blocks.SHARD_STORAGE_BLOCKS)
                .add(ModBlocks.COAL_SHARD_BLOCK.get())
                .add(ModBlocks.COPPER_SHARD_BLOCK.get())
                .add(ModBlocks.DIAMOND_SHARD_BLOCK.get())
                .add(ModBlocks.EMERALD_SHARD_BLOCK.get())
                .add(ModBlocks.FLINT_SHARD_BLOCK.get())
                .add(ModBlocks.GOLD_SHARD_BLOCK.get())
                .add(ModBlocks.IRON_SHARD_BLOCK.get())
                .add(ModBlocks.LAPIS_SHARD_BLOCK.get())
                .add(ModBlocks.NETHERITE_SHARD_BLOCK.get())
                .add(ModBlocks.QUARTZ_SHARD_BLOCK.get())
                .add(ModBlocks.REDSTONE_SHARD_BLOCK.get())
                .add(ModBlocks.SLIME_SHARD_BLOCK.get());
    }
}
