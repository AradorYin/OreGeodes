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
