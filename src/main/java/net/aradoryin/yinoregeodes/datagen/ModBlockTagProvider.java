package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.aradoryin.yinoregeodes.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OreGeodeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.Blocks.SHARD_STORAGE_BLOCKS);

        tag(ModTags.Blocks.NEEDS_AMETHYST_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_AMETHYST_TOOL);

//        tag(ModTags.Blocks.NEEDS_ECHO_TOOL)
//                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ECHO_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_ECHO_TOOL);

        tag(ModTags.Blocks.CLUSTERS)
                .add(Blocks.AMETHYST_CLUSTER)
                .add(ModBlocks.COAL_CLUSTER.get())
                .add(ModBlocks.COPPER_CLUSTER.get())
                .add(ModBlocks.DIAMOND_CLUSTER.get())
                .add(ModBlocks.ECHO_CLUSTER.get())
                .add(ModBlocks.EMERALD_CLUSTER.get())
                .add(ModBlocks.FLINT_CLUSTER.get())
                .add(ModBlocks.GOLD_CLUSTER.get())
                .add(ModBlocks.IRON_CLUSTER.get())
                .add(ModBlocks.LAPIS_CLUSTER.get())
                .add(ModBlocks.NETHERITE_CLUSTER.get())
                .add(ModBlocks.QUARTZ_CLUSTER.get())
                .add(ModBlocks.REDSTONE_CLUSTER.get())
                .add(ModBlocks.SLIME_CLUSTER.get());

        tag(ModTags.Blocks.LARGE_BUDS)
                .add(Blocks.LARGE_AMETHYST_BUD)
                .add(ModBlocks.LARGE_COAL_BUD.get())
                .add(ModBlocks.LARGE_COPPER_BUD.get())
                .add(ModBlocks.LARGE_DIAMOND_BUD.get())
                .add(ModBlocks.LARGE_ECHO_BUD.get())
                .add(ModBlocks.LARGE_EMERALD_BUD.get())
                .add(ModBlocks.LARGE_FLINT_BUD.get())
                .add(ModBlocks.LARGE_GOLD_BUD.get())
                .add(ModBlocks.LARGE_IRON_BUD.get())
                .add(ModBlocks.LARGE_LAPIS_BUD.get())
                .add(ModBlocks.LARGE_NETHERITE_BUD.get())
                .add(ModBlocks.LARGE_QUARTZ_BUD.get())
                .add(ModBlocks.LARGE_REDSTONE_BUD.get())
                .add(ModBlocks.LARGE_SLIME_BUD.get());

        tag(ModTags.Blocks.MEDIUM_BUDS)
                .add(Blocks.MEDIUM_AMETHYST_BUD)
                .add(ModBlocks.MEDIUM_COAL_BUD.get())
                .add(ModBlocks.MEDIUM_COPPER_BUD.get())
                .add(ModBlocks.MEDIUM_DIAMOND_BUD.get())
                .add(ModBlocks.MEDIUM_ECHO_BUD.get())
                .add(ModBlocks.MEDIUM_EMERALD_BUD.get())
                .add(ModBlocks.MEDIUM_FLINT_BUD.get())
                .add(ModBlocks.MEDIUM_GOLD_BUD.get())
                .add(ModBlocks.MEDIUM_IRON_BUD.get())
                .add(ModBlocks.MEDIUM_LAPIS_BUD.get())
                .add(ModBlocks.MEDIUM_NETHERITE_BUD.get())
                .add(ModBlocks.MEDIUM_QUARTZ_BUD.get())
                .add(ModBlocks.MEDIUM_REDSTONE_BUD.get())
                .add(ModBlocks.MEDIUM_SLIME_BUD.get());

        tag(ModTags.Blocks.SHARD_STORAGE_BLOCKS)
                .add(Blocks.AMETHYST_BLOCK)
                .add(ModBlocks.COAL_SHARD_BLOCK.get())
                .add(ModBlocks.COPPER_SHARD_BLOCK.get())
                .add(ModBlocks.DIAMOND_SHARD_BLOCK.get())
                .add(ModBlocks.ECHO_SHARD_BLOCK.get())
                .add(ModBlocks.EMERALD_SHARD_BLOCK.get())
                .add(ModBlocks.FLINT_SHARD_BLOCK.get())
                .add(ModBlocks.GOLD_SHARD_BLOCK.get())
                .add(ModBlocks.IRON_SHARD_BLOCK.get())
                .add(ModBlocks.LAPIS_SHARD_BLOCK.get())
                .add(ModBlocks.NETHERITE_SHARD_BLOCK.get())
                .add(ModBlocks.QUARTZ_SHARD_BLOCK.get())
                .add(ModBlocks.REDSTONE_SHARD_BLOCK.get())
                .add(ModBlocks.SLIME_SHARD_BLOCK.get());

        tag(ModTags.Blocks.SMALL_BUDS)
                .add(Blocks.SMALL_AMETHYST_BUD)
                .add(ModBlocks.SMALL_COAL_BUD.get())
                .add(ModBlocks.SMALL_COPPER_BUD.get())
                .add(ModBlocks.SMALL_DIAMOND_BUD.get())
                .add(ModBlocks.SMALL_ECHO_BUD.get())
                .add(ModBlocks.SMALL_EMERALD_BUD.get())
                .add(ModBlocks.SMALL_FLINT_BUD.get())
                .add(ModBlocks.SMALL_GOLD_BUD.get())
                .add(ModBlocks.SMALL_IRON_BUD.get())
                .add(ModBlocks.SMALL_LAPIS_BUD.get())
                .add(ModBlocks.SMALL_NETHERITE_BUD.get())
                .add(ModBlocks.SMALL_QUARTZ_BUD.get())
                .add(ModBlocks.SMALL_REDSTONE_BUD.get())
                .add(ModBlocks.SMALL_SLIME_BUD.get());
    }
}
