package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks._BLOCK.get())
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', ModItems.s_SHARD.get())
//                .unlockedBy("has_s_shard", has(ModItems.s_SHARD.get()))
//                .save(recipeOutput);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.s_SHARD.get())
//                .requires(ModBlocks._BLOCK.get())
//                .unlockedBy("has__block", has(ModBlocks._BLOCK.get()))
//                .save(recipeOutput);
    }
}
