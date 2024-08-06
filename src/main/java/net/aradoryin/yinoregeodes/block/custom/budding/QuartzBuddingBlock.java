package net.aradoryin.yinoregeodes.block.custom.budding;

import com.mojang.serialization.MapCodec;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.aradoryin.yinoregeodes.block.custom.ClusterBlock;
import net.aradoryin.yinoregeodes.block.custom.ShardBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

public class QuartzBuddingBlock extends ShardBlock {

    public static final MapCodec<QuartzBuddingBlock> CODEC = simpleCodec(QuartzBuddingBlock::new);
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    @Override
    public MapCodec<QuartzBuddingBlock> codec() {
        return CODEC;
    }

    public QuartzBuddingBlock(Properties properties) {
        super(properties);
    }

    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = pos.relative(direction);
            BlockState blockstate = level.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = ModBlocks.SMALL_QUARTZ_BUD.get();
            } else if (blockstate.is(ModBlocks.SMALL_QUARTZ_BUD) && blockstate.getValue(ClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_QUARTZ_BUD.get();
            } else if (blockstate.is(ModBlocks.MEDIUM_QUARTZ_BUD) && blockstate.getValue(ClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_QUARTZ_BUD.get();
            } else if (blockstate.is(ModBlocks.LARGE_QUARTZ_BUD) && blockstate.getValue(ClusterBlock.FACING) == direction) {
                block = ModBlocks.QUARTZ_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState()
                        .setValue(ClusterBlock.FACING, direction)
                        .setValue(ClusterBlock.WATERLOGGED, blockstate.getFluidState().getType() == Fluids.WATER);
                level.setBlockAndUpdate(blockpos, blockstate1);
            }
        }

    }

    public static boolean canClusterGrowAtState(BlockState state) {
        return state.isAir() || state.is(Blocks.WATER) && state.getFluidState().getAmount() == 8;
    }
}
