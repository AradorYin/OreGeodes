package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, OreGeodeMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // BUDDING BLOCKS
        blockWithItem(ModBlocks.BUDDING_COAL);
        blockWithItem(ModBlocks.BUDDING_COPPER);
        blockWithItem(ModBlocks.BUDDING_DIAMOND);
        blockWithItem(ModBlocks.BUDDING_ECHO);
        blockWithItem(ModBlocks.BUDDING_EMERALD);
        blockWithItem(ModBlocks.BUDDING_FLINT);
        blockWithItem(ModBlocks.BUDDING_GOLD);
        blockWithItem(ModBlocks.BUDDING_IRON);
        blockWithItem(ModBlocks.BUDDING_LAPIS);
        blockWithItem(ModBlocks.BUDDING_NETHERITE);
        blockWithItem(ModBlocks.BUDDING_QUARTZ);
        blockWithItem(ModBlocks.BUDDING_REDSTONE);
        blockWithItem(ModBlocks.BUDDING_SLIME);

        // CLUSTERS
        directionalCrossBlock(ModBlocks.COAL_CLUSTER);
        directionalCrossBlock(ModBlocks.COPPER_CLUSTER);
        directionalCrossBlock(ModBlocks.DIAMOND_CLUSTER);
        directionalCrossBlock(ModBlocks.ECHO_CLUSTER);
        directionalCrossBlock(ModBlocks.EMERALD_CLUSTER);
        directionalCrossBlock(ModBlocks.FLINT_CLUSTER);
        directionalCrossBlock(ModBlocks.GOLD_CLUSTER);
        directionalCrossBlock(ModBlocks.IRON_CLUSTER);
        directionalCrossBlock(ModBlocks.LAPIS_CLUSTER);
        directionalCrossBlock(ModBlocks.NETHERITE_CLUSTER);
        directionalCrossBlock(ModBlocks.QUARTZ_CLUSTER);
        directionalCrossBlock(ModBlocks.REDSTONE_CLUSTER);
        directionalCrossBlock(ModBlocks.SLIME_CLUSTER);

        // LARGE BUDS
        directionalCrossBlock(ModBlocks.LARGE_COAL_BUD);
        directionalCrossBlock(ModBlocks.LARGE_COPPER_BUD);
        directionalCrossBlock(ModBlocks.LARGE_DIAMOND_BUD);
        directionalCrossBlock(ModBlocks.LARGE_ECHO_BUD);
        directionalCrossBlock(ModBlocks.LARGE_EMERALD_BUD);
        directionalCrossBlock(ModBlocks.LARGE_FLINT_BUD);
        directionalCrossBlock(ModBlocks.LARGE_GOLD_BUD);
        directionalCrossBlock(ModBlocks.LARGE_IRON_BUD);
        directionalCrossBlock(ModBlocks.LARGE_LAPIS_BUD);
        directionalCrossBlock(ModBlocks.LARGE_NETHERITE_BUD);
        directionalCrossBlock(ModBlocks.LARGE_QUARTZ_BUD);
        directionalCrossBlock(ModBlocks.LARGE_REDSTONE_BUD);
        directionalCrossBlock(ModBlocks.LARGE_SLIME_BUD);

        // MEDIUM BUDS
        directionalCrossBlock(ModBlocks.MEDIUM_COAL_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_COPPER_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_DIAMOND_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_ECHO_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_EMERALD_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_FLINT_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_GOLD_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_IRON_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_LAPIS_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_NETHERITE_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_QUARTZ_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_REDSTONE_BUD);
        directionalCrossBlock(ModBlocks.MEDIUM_SLIME_BUD);

        // SHARD BLOCKS
        blockWithItem(ModBlocks.COAL_SHARD_BLOCK);
        blockWithItem(ModBlocks.COPPER_SHARD_BLOCK);
        blockWithItem(ModBlocks.DIAMOND_SHARD_BLOCK);
        blockWithItem(ModBlocks.ECHO_SHARD_BLOCK);
        blockWithItem(ModBlocks.EMERALD_SHARD_BLOCK);
        blockWithItem(ModBlocks.FLINT_SHARD_BLOCK);
        blockWithItem(ModBlocks.GOLD_SHARD_BLOCK);
        blockWithItem(ModBlocks.IRON_SHARD_BLOCK);
        blockWithItem(ModBlocks.LAPIS_SHARD_BLOCK);
        blockWithItem(ModBlocks.NETHERITE_SHARD_BLOCK);
        blockWithItem(ModBlocks.QUARTZ_SHARD_BLOCK);
        blockWithItem(ModBlocks.REDSTONE_SHARD_BLOCK);
        blockWithItem(ModBlocks.SLIME_SHARD_BLOCK);

        // SMALL BUDS
        directionalCrossBlock(ModBlocks.SMALL_COAL_BUD);
        directionalCrossBlock(ModBlocks.SMALL_COPPER_BUD);
        directionalCrossBlock(ModBlocks.SMALL_DIAMOND_BUD);
        directionalCrossBlock(ModBlocks.SMALL_ECHO_BUD);
        directionalCrossBlock(ModBlocks.SMALL_EMERALD_BUD);
        directionalCrossBlock(ModBlocks.SMALL_FLINT_BUD);
        directionalCrossBlock(ModBlocks.SMALL_GOLD_BUD);
        directionalCrossBlock(ModBlocks.SMALL_IRON_BUD);
        directionalCrossBlock(ModBlocks.SMALL_LAPIS_BUD);
        directionalCrossBlock(ModBlocks.SMALL_NETHERITE_BUD);
        directionalCrossBlock(ModBlocks.SMALL_QUARTZ_BUD);
        directionalCrossBlock(ModBlocks.SMALL_REDSTONE_BUD);
        directionalCrossBlock(ModBlocks.SMALL_SLIME_BUD);
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void directionalCrossBlock(DeferredBlock<Block> deferredBlock) {
        directionalBlock(deferredBlock.get(), models().cross(blockName(deferredBlock),
                ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, "block/" + blockName(deferredBlock))).renderType("cutout"));
        simpleBlockItem(deferredBlock.get(), models().withExistingParent(blockName(deferredBlock), "minecraft:block/cross"));
    }

    private ResourceLocation blockKey(DeferredBlock<Block> deferredBlock) {
        return BuiltInRegistries.BLOCK.getKey(deferredBlock.get());
    }

    private String blockName(DeferredBlock<Block> deferredBlock) {
        return this.blockKey(deferredBlock).getPath();
    }
}
