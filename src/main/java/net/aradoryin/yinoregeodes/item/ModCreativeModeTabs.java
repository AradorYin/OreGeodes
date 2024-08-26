package net.aradoryin.yinoregeodes.item;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OreGeodeMod.MOD_ID);

    public static final Supplier<CreativeModeTab> GEODE_ITEMS_TAB = CREATIVE_MODE_TABS.register("geode_items_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.yinoregeodes.geode_items_tab"))
            .icon(() -> new ItemStack(ModItems.COPPER_SHARD.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItems.COAL_SHARD);
                output.accept(ModItems.COPPER_SHARD);
                output.accept(ModItems.DIAMOND_SHARD);
                output.accept(ModItems.EMERALD_SHARD);
                output.accept(ModItems.FLINT_SHARD);
                output.accept(ModItems.GOLD_SHARD);
                output.accept(ModItems.IRON_SHARD);
                output.accept(ModItems.LAPIS_SHARD);
                output.accept(ModItems.NETHERITE_SHARD);
                output.accept(ModItems.QUARTZ_SHARD);
                output.accept(ModItems.REDSTONE_SHARD);
                output.accept(ModItems.SLIME_SHARD);
                // Hammers
                output.accept(ModItems.AMETHYST_HAMMER);
                output.accept(ModItems.DIAMOND_HAMMER);
                output.accept(ModItems.ECHO_HAMMER);
                output.accept(ModItems.GOLD_HAMMER);
                output.accept(ModItems.IRON_HAMMER);
                output.accept(ModItems.NETHERITE_HAMMER);
            })).build());

    public static final Supplier<CreativeModeTab> GEODE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("geode_blocks_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.yinoregeodes.geode_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.COPPER_SHARD_BLOCK))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, "geode_items_tab"))
            .displayItems(((itemDisplayParameters, output) -> {
                // BUDDING BLOCKS
                output.accept(ModBlocks.BUDDING_COAL);
                output.accept(ModBlocks.BUDDING_COPPER);
                output.accept(ModBlocks.BUDDING_DIAMOND);
                output.accept(ModBlocks.BUDDING_ECHO);
                output.accept(ModBlocks.BUDDING_EMERALD);
                output.accept(ModBlocks.BUDDING_FLINT);
                output.accept(ModBlocks.BUDDING_GOLD);
                output.accept(ModBlocks.BUDDING_IRON);
                output.accept(ModBlocks.BUDDING_LAPIS);
                output.accept(ModBlocks.BUDDING_NETHERITE);
                output.accept(ModBlocks.BUDDING_QUARTZ);
                output.accept(ModBlocks.BUDDING_REDSTONE);
                output.accept(ModBlocks.BUDDING_SLIME);
                // CLUSTERS
                output.accept(ModBlocks.COAL_CLUSTER);
                output.accept(ModBlocks.COPPER_CLUSTER);
                output.accept(ModBlocks.DIAMOND_CLUSTER);
                output.accept(ModBlocks.ECHO_CLUSTER);
                output.accept(ModBlocks.EMERALD_CLUSTER);
                output.accept(ModBlocks.FLINT_CLUSTER);
                output.accept(ModBlocks.GOLD_CLUSTER);
                output.accept(ModBlocks.IRON_CLUSTER);
                output.accept(ModBlocks.LAPIS_CLUSTER);
                output.accept(ModBlocks.NETHERITE_CLUSTER);
                output.accept(ModBlocks.QUARTZ_CLUSTER);
                output.accept(ModBlocks.REDSTONE_CLUSTER);
                output.accept(ModBlocks.SLIME_CLUSTER);
                // LARGE BUDS
                output.accept(ModBlocks.LARGE_COAL_BUD);
                output.accept(ModBlocks.LARGE_COPPER_BUD);
                output.accept(ModBlocks.LARGE_DIAMOND_BUD);
                output.accept(ModBlocks.LARGE_ECHO_BUD);
                output.accept(ModBlocks.LARGE_EMERALD_BUD);
                output.accept(ModBlocks.LARGE_FLINT_BUD);
                output.accept(ModBlocks.LARGE_GOLD_BUD);
                output.accept(ModBlocks.LARGE_IRON_BUD);
                output.accept(ModBlocks.LARGE_LAPIS_BUD);
                output.accept(ModBlocks.LARGE_NETHERITE_BUD);
                output.accept(ModBlocks.LARGE_QUARTZ_BUD);
                output.accept(ModBlocks.LARGE_REDSTONE_BUD);
                output.accept(ModBlocks.LARGE_SLIME_BUD);
                // MEDIUM BUDS
                output.accept(ModBlocks.MEDIUM_COAL_BUD);
                output.accept(ModBlocks.MEDIUM_COPPER_BUD);
                output.accept(ModBlocks.MEDIUM_DIAMOND_BUD);
                output.accept(ModBlocks.MEDIUM_ECHO_BUD);
                output.accept(ModBlocks.MEDIUM_EMERALD_BUD);
                output.accept(ModBlocks.MEDIUM_FLINT_BUD);
                output.accept(ModBlocks.MEDIUM_GOLD_BUD);
                output.accept(ModBlocks.MEDIUM_IRON_BUD);
                output.accept(ModBlocks.MEDIUM_LAPIS_BUD);
                output.accept(ModBlocks.MEDIUM_NETHERITE_BUD);
                output.accept(ModBlocks.MEDIUM_QUARTZ_BUD);
                output.accept(ModBlocks.MEDIUM_REDSTONE_BUD);
                output.accept(ModBlocks.MEDIUM_SLIME_BUD);
                // SHARD BLOCKS
                output.accept(ModBlocks.COAL_SHARD_BLOCK);
                output.accept(ModBlocks.COPPER_SHARD_BLOCK);
                output.accept(ModBlocks.DIAMOND_SHARD_BLOCK);
                output.accept(ModBlocks.ECHO_SHARD_BLOCK);
                output.accept(ModBlocks.EMERALD_SHARD_BLOCK);
                output.accept(ModBlocks.FLINT_SHARD_BLOCK);
                output.accept(ModBlocks.GOLD_SHARD_BLOCK);
                output.accept(ModBlocks.IRON_SHARD_BLOCK);
                output.accept(ModBlocks.LAPIS_SHARD_BLOCK);
                output.accept(ModBlocks.NETHERITE_SHARD_BLOCK);
                output.accept(ModBlocks.QUARTZ_SHARD_BLOCK);
                output.accept(ModBlocks.REDSTONE_SHARD_BLOCK);
                output.accept(ModBlocks.SLIME_SHARD_BLOCK);
                // SMALL BUDS
                output.accept(ModBlocks.SMALL_COAL_BUD);
                output.accept(ModBlocks.SMALL_COPPER_BUD);
                output.accept(ModBlocks.SMALL_DIAMOND_BUD);
                output.accept(ModBlocks.SMALL_ECHO_BUD);
                output.accept(ModBlocks.SMALL_EMERALD_BUD);
                output.accept(ModBlocks.SMALL_FLINT_BUD);
                output.accept(ModBlocks.SMALL_GOLD_BUD);
                output.accept(ModBlocks.SMALL_IRON_BUD);
                output.accept(ModBlocks.SMALL_LAPIS_BUD);
                output.accept(ModBlocks.SMALL_NETHERITE_BUD);
                output.accept(ModBlocks.SMALL_QUARTZ_BUD);
                output.accept(ModBlocks.SMALL_REDSTONE_BUD);
                output.accept(ModBlocks.SMALL_SLIME_BUD);
            })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
