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
            .icon(() -> new ItemStack(ModItems.NETHERITE_SHARD.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItems.COAL_SHARD);
                output.accept(ModItems.COPPER_SHARD);
                output.accept(ModItems.DIAMOND_SHARD);
                output.accept(ModItems.EMERALD_SHARD);
                output.accept(ModItems.FLINT_SHARD);
                output.accept(ModItems.GOLD_SHARD);
                output.accept(ModItems.IRON_SHARD);
                output.accept(ModItems.LAPIS_LAZULI_SHARD);
                output.accept(ModItems.NETHERITE_SHARD);
                output.accept(ModItems.QUARTZ_SHARD);
                output.accept(ModItems.REDSTONE_SHARD);
                output.accept(ModItems.SLIME_SHARD);
            })).build());

    public static final Supplier<CreativeModeTab> GEODE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("geode_blocks_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.yinoregeodes.geode_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks._BLOCK))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, "geode_items_tab"))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModBlocks._BLOCK);
            })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
