package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private RecipeOutput recipeOutput;

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        this.recipeOutput = recipeOutput;

        shardStorageRecipe(ModBlocks.COAL_SHARD_BLOCK.get(), ModItems.COAL_SHARD.get());
        shardStorageRecipe(ModBlocks.COPPER_SHARD_BLOCK.get(), ModItems.COPPER_SHARD.get());
        shardStorageRecipe(ModBlocks.DIAMOND_SHARD_BLOCK.get(), ModItems.DIAMOND_SHARD.get());
        shardStorageRecipe(ModBlocks.EMERALD_SHARD_BLOCK.get(), ModItems.EMERALD_SHARD.get());
        shardStorageRecipe(ModBlocks.FLINT_SHARD_BLOCK.get(), ModItems.FLINT_SHARD.get());
        shardStorageRecipe(ModBlocks.GOLD_SHARD_BLOCK.get(), ModItems.GOLD_SHARD.get());
        shardStorageRecipe(ModBlocks.IRON_SHARD_BLOCK.get(), ModItems.IRON_SHARD.get());
        shardStorageRecipe(ModBlocks.LAPIS_SHARD_BLOCK.get(), ModItems.LAPIS_LAZULI_SHARD.get());
        shardStorageRecipe(ModBlocks.NETHERITE_SHARD_BLOCK.get(), ModItems.NETHERITE_SHARD.get());
        shardStorageRecipe(ModBlocks.QUARTZ_SHARD_BLOCK.get(), ModItems.QUARTZ_SHARD.get());
        shardStorageRecipe(ModBlocks.REDSTONE_SHARD_BLOCK.get(), ModItems.REDSTONE_SHARD.get());
        shardStorageRecipe(ModBlocks.SLIME_SHARD_BLOCK.get(), ModItems.SLIME_SHARD.get());

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.s_SHARD.get())
//                .requires(ModBlocks._BLOCK.get())
//                .unlockedBy("has__block", has(ModBlocks._BLOCK.get()))
//                .save(recipeOutput);
    }

    /**
     * Generates a recipe for creating a shard storage block using the specified block and item.
     *
     * @param  block  the output of the recipe
     * @param  item   the input of the recipe
     */
    private void shardStorageRecipe(Block block, ItemLike item) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 1)
                .define('#', item)
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_" + getItemName(item), has(item))
                .save(recipeOutput, OreGeodeMod.MOD_ID + ":" + getItemName(block) + "_shard_storage_recipe_" + getItemName(item));
    }
}
