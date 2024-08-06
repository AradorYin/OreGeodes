package net.aradoryin.yinoregeodes.block.custom;

import net.minecraft.world.level.block.AmethystClusterBlock;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ClusterBlock extends ShardBlock implements SimpleWaterloggedBlock {
    public static final MapCodec<ClusterBlock> CLUSTER_BLOCK_CODEC = RecordCodecBuilder.mapCodec(clusterBlockInstance ->
            clusterBlockInstance.group(Codec.FLOAT.fieldOf("height").forGetter(clusterBlock -> clusterBlock.height),
                    Codec.FLOAT.fieldOf("aabb_offset").forGetter(clusterBlock -> clusterBlock.aabbOffset),
                    propertiesCodec()).apply(clusterBlockInstance, ClusterBlock::new));

    public static final BooleanProperty WATERLOGGED;
    public static final DirectionProperty FACING;
    private final float height;
    private final float aabbOffset;
    protected final VoxelShape northAabb;
    protected final VoxelShape southAabb;
    protected final VoxelShape eastAabb;
    protected final VoxelShape westAabb;
    protected final VoxelShape upAabb;
    protected final VoxelShape downAabb;

    @Override
    public @NotNull MapCodec<ClusterBlock> codec() {
        return CLUSTER_BLOCK_CODEC;
    }

    public ClusterBlock(float height, float aabbOffset, BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, false).setValue(FACING, Direction.UP));
        this.upAabb = Block.box(aabbOffset, 0.0, aabbOffset, 16.0F - aabbOffset, height, 16.0F - aabbOffset);
        this.downAabb = Block.box(aabbOffset, 16.0F - height, aabbOffset, 16.0F - aabbOffset, 16.0, 16.0F - aabbOffset);
        this.northAabb = Block.box(aabbOffset, aabbOffset, 16.0F - height, 16.0F - aabbOffset, 16.0F - aabbOffset, 16.0);
        this.southAabb = Block.box(aabbOffset, aabbOffset, 0.0, 16.0F - aabbOffset, 16.0F - aabbOffset, height);
        this.eastAabb = Block.box(0.0, aabbOffset, aabbOffset, height, 16.0F - aabbOffset, 16.0F - aabbOffset);
        this.westAabb = Block.box(16.0F - height, aabbOffset, aabbOffset, 16.0, 16.0F - aabbOffset, 16.0F - aabbOffset);
        this.height = height;
        this.aabbOffset = aabbOffset;
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        Direction direction = state.getValue(FACING);
        return switch (direction) {
            case NORTH -> this.northAabb;
            case SOUTH -> this.southAabb;
            case EAST -> this.eastAabb;
            case WEST -> this.westAabb;
            case DOWN -> this.downAabb;
            default -> this.upAabb;
        };
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        BlockPos blockpos = pos.relative(direction.getOpposite());
        return level.getBlockState(blockpos).isFaceSturdy(level, blockpos, direction);
    }

    @Override
    protected @NotNull BlockState updateShape(BlockState state, @NotNull Direction direction, @NotNull BlockState neighborState,
                                              @NotNull LevelAccessor level, @NotNull BlockPos pos, @NotNull BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }

        return direction == state.getValue(FACING).getOpposite() && !state.canSurvive(level, pos) ?
                Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelAccessor levelaccessor = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        return this.defaultBlockState().setValue(WATERLOGGED,
                levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER).setValue(FACING, context.getClickedFace());
    }

    /** @deprecated */
    @Deprecated(forRemoval = false)
    @Override
    protected @NotNull BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    /** @deprecated */
    @Deprecated(forRemoval = false)
    @Override
    protected @NotNull BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected @NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FACING);
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        FACING = BlockStateProperties.FACING;
    }
}
