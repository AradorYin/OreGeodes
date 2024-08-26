package net.aradoryin.yinoregeodes.item;

import net.aradoryin.yinoregeodes.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier AMETHYST = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL,
            600, 7f, 2.5f, 20,
            () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final Tier COPPER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            180, 4.5f, 1.5f, 7,
            () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final Tier ECHO = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ECHO_TOOL,
            1972, 8.5f, 3.5f, 18,
            () -> Ingredient.of(Items.ECHO_SHARD));
    public static final Tier EMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            1000, 7.5f, 2.8f, 12,
            () -> Ingredient.of(ModItems.EMERALD_SHARD));
}
