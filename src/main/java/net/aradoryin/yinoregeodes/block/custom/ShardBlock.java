package net.aradoryin.yinoregeodes.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ShardBlock  extends Block {
    public static final MapCodec<ShardBlock> CODEC = simpleCodec(ShardBlock::new);

    public MapCodec<? extends ShardBlock> codec() {
        return CODEC;
    }

    public ShardBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected void onProjectileHit(Level level, BlockState blockState, BlockHitResult hitResult, Projectile projectile) {
        if (!level.isClientSide) {
            BlockPos blockpos = hitResult.getBlockPos();
            level.playSound((Player)null, blockpos, SoundEvents.AMETHYST_BLOCK_HIT, SoundSource.BLOCKS,
                    1.0F, 0.5F + level.random.nextFloat() * 1.2F);
            level.playSound((Player)null, blockpos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS,
                    1.0F, 0.5F + level.random.nextFloat() * 1.2F);
        }

    }
}
