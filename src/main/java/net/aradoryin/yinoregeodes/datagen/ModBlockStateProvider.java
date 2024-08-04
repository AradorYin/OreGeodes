package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.minecraft.data.PackOutput;
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
        blockWithItem(ModBlocks.COAL_SHARD_BLOCK);
        blockWithItem(ModBlocks.COPPER_SHARD_BLOCK);
        blockWithItem(ModBlocks.DIAMOND_SHARD_BLOCK);
        blockWithItem(ModBlocks.EMERALD_SHARD_BLOCK);
        blockWithItem(ModBlocks.FLINT_SHARD_BLOCK);
        blockWithItem(ModBlocks.GOLD_SHARD_BLOCK);
        blockWithItem(ModBlocks.IRON_SHARD_BLOCK);
        blockWithItem(ModBlocks.LAPIS_SHARD_BLOCK);
        blockWithItem(ModBlocks.NETHERITE_SHARD_BLOCK);
        blockWithItem(ModBlocks.QUARTZ_SHARD_BLOCK);
        blockWithItem(ModBlocks.REDSTONE_SHARD_BLOCK);
        blockWithItem(ModBlocks.SLIME_SHARD_BLOCK);
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
