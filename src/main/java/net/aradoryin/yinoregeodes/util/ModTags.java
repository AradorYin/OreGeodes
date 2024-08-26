package net.aradoryin.yinoregeodes.util;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");
        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_ECHO_TOOL = createTag("incorrect_for_echo_tool");
        public static final TagKey<Block> NEEDS_ECHO_TOOL = createTag("needs_echo_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");

        // GEODE BLOCK TAGS
        public static final TagKey<Block> CLUSTERS = createTag("clusters");
        public static final TagKey<Block> LARGE_BUDS = createTag("large_buds");
        public static final TagKey<Block> MEDIUM_BUDS = createTag("medium_buds");
        public static final TagKey<Block> SHARD_STORAGE_BLOCKS = createTag("shard_storage_blocks");
        public static final TagKey<Block> SMALL_BUDS = createTag("small_buds");
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> GEODE_SHARDS = createTag("geode_shards");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, name));
        }
    }
}
