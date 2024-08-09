package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        List<ItemLike> COAL_SMELTABLES = List.of(ModBlocks.COAL_SHARD_BLOCK);
        List<ItemLike> COPPER_SMELTABLES = List.of(ModBlocks.COPPER_SHARD_BLOCK);
        List<ItemLike> DIAMOND_SMELTABLES = List.of(ModBlocks.DIAMOND_SHARD_BLOCK);
        List<ItemLike> ECHO_SMELTABLES = List.of(ModBlocks.ECHO_SHARD_BLOCK);
        List<ItemLike> EMERALD_SMELTABLES = List.of(ModBlocks.EMERALD_SHARD_BLOCK);
        List<ItemLike> FLINT_SMELTABLES = List.of(ModBlocks.FLINT_SHARD_BLOCK);
        List<ItemLike> GOLD_SMELTABLES = List.of(ModBlocks.GOLD_SHARD_BLOCK);
        List<ItemLike> IRON_SMELTABLES = List.of(ModBlocks.IRON_SHARD_BLOCK);
        List<ItemLike> LAPIS_SMELTABLES = List.of(ModBlocks.LAPIS_SHARD_BLOCK);
        List<ItemLike> NETHERITE_SMELTABLES = List.of(ModBlocks.NETHERITE_SHARD_BLOCK);
        List<ItemLike> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_SHARD_BLOCK);
        List<ItemLike> REDSTONE_SMELTABLES = List.of(ModBlocks.REDSTONE_SHARD_BLOCK);
        List<ItemLike> SLIME_SMELTABLES = List.of(ModBlocks.SLIME_SHARD_BLOCK);

        //Shard Storage Recipes
        shardStorageRecipe(recipeOutput, ModBlocks.COAL_SHARD_BLOCK.get(), ModItems.COAL_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.COPPER_SHARD_BLOCK.get(), ModItems.COPPER_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.DIAMOND_SHARD_BLOCK.get(), ModItems.DIAMOND_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.ECHO_SHARD_BLOCK.get(), Items.ECHO_SHARD);
        shardStorageRecipe(recipeOutput, ModBlocks.EMERALD_SHARD_BLOCK.get(), ModItems.EMERALD_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.FLINT_SHARD_BLOCK.get(), ModItems.FLINT_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.GOLD_SHARD_BLOCK.get(), ModItems.GOLD_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.IRON_SHARD_BLOCK.get(), ModItems.IRON_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.LAPIS_SHARD_BLOCK.get(), ModItems.LAPIS_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.NETHERITE_SHARD_BLOCK.get(), ModItems.NETHERITE_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.QUARTZ_SHARD_BLOCK.get(), ModItems.QUARTZ_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.REDSTONE_SHARD_BLOCK.get(), ModItems.REDSTONE_SHARD.get());
        shardStorageRecipe(recipeOutput, ModBlocks.SLIME_SHARD_BLOCK.get(), ModItems.SLIME_SHARD.get());

        // Temporary Recipes
        fSmelting(recipeOutput, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, ECHO_SMELTABLES, RecipeCategory.MISC, Items.ECHO_SHARD, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, FLINT_SMELTABLES, RecipeCategory.MISC, Items.FLINT, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, NETHERITE_SMELTABLES, RecipeCategory.MISC, Items.NETHERITE_INGOT, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "coal_smelting");
        fSmelting(recipeOutput, SLIME_SMELTABLES, RecipeCategory.MISC, Items.SLIME_BALL, 0.25f, 200, "coal_smelting");

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.s_SHARD.get())
//                .requires(ModBlocks._BLOCK.get())
//                .unlockedBy("has__block", has(ModBlocks._BLOCK.get()))
//                .save(recipeOutput);
    }

    /**
     * Generates a recipe for creating a shard storage block using the specified block and item.
     *
     * @param  result  the output of the recipe
     * @param  ingredient   the input of the recipe
     */
    private void shardStorageRecipe(RecipeOutput recipeOutput, Block result, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 1)
                .define('#', ingredient)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipeOutput, OreGeodeMod.MOD_ID + ":" + getItemName(result) + "_shard_storage_recipe_" + getItemName(ingredient));
    }

    /**
     * Generates a smelting recipe for the given output, ingredients, category, result, experience, cooking time, and group.
     *
     * @param  recipeOutput   the output of the recipe
     * @param  ingredients    the list of ingredients for the recipe
     * @param  category       the category of the recipe
     * @param  result         the result of the recipe
     * @param  exp            the experience required to craft the recipe
     * @param  cookTime       the cooking time of the recipe
     * @param  group          the group of the recipe
     */
    protected static void fSmelting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result,
                                    float exp, int cookTime, String group) {
        cooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, ingredients, category, result, exp, cookTime, group, "_from_smelting");
    }

    /**
     * Generates a blasting recipe for the given output, ingredients, category, result, experience, cooking time, and group.
     *
     * @param  recipeOutput   the output of the recipe
     * @param  ingredients    the list of ingredients for the recipe
     * @param  category       the category of the recipe
     * @param  result         the result of the recipe
     * @param  exp            the experience required to craft the recipe
     * @param  cookTime       the cooking time of the recipe
     * @param  group          the group of the recipe
     */
    protected static void bBlasting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result,
                                    float exp, int cookTime, String group) {
        cooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, ingredients, category, result, exp, cookTime, group, "_from_blasting");
    }

    /**
     * Generates a cooking recipe for the given output, ingredients, category, result, experience, cooking time, group, and recipe name.
     *
     * @param  recipeOutput   the output of the recipe
     * @param  cookingSerializer   the serializer for the cooking recipe
     * @param  factory        the factory for creating the cooking recipe
     * @param  ingredients    the list of ingredients for the recipe
     * @param  category       the category of the recipe
     * @param  result         the result of the recipe
     * @param  exp            the experience required to craft the recipe
     * @param  cookTime       the cooking time of the recipe
     * @param  group          the group of the recipe
     * @param  recipeName     the name of the recipe
     * @param  <T>            the type of the abstract cooking recipe
     */
    protected static <T extends AbstractCookingRecipe> void cooking(RecipeOutput recipeOutput, RecipeSerializer<T> cookingSerializer,
            AbstractCookingRecipe.Factory<T> factory, List<ItemLike> ingredients, RecipeCategory category, ItemLike result,
                                                                    float exp, int cookTime, String group, String recipeName) {
        for(ItemLike itemLike : ingredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), category, result, exp, cookTime, cookingSerializer, factory)
                    .group(group).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(recipeOutput, OreGeodeMod.MOD_ID + ":" + getItemName(result) + recipeName + "_" + getItemName(itemLike));
        }
    }
}
