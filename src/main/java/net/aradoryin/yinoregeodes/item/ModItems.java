package net.aradoryin.yinoregeodes.item;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OreGeodeMod.MOD_ID);

    public static final DeferredItem<Item> COAL_SHARD = ITEMS.registerSimpleItem("coal_shard");
    public static final DeferredItem<Item> COPPER_SHARD = ITEMS.registerSimpleItem("copper_shard");
    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.registerSimpleItem("diamond_shard");
    public static final DeferredItem<Item> EMERALD_SHARD = ITEMS.registerSimpleItem("emerald_shard");
    public static final DeferredItem<Item> FLINT_SHARD = ITEMS.registerSimpleItem("flint_shard");
    public static final DeferredItem<Item> GOLD_SHARD = ITEMS.registerSimpleItem("gold_shard");
    public static final DeferredItem<Item> IRON_SHARD = ITEMS.registerSimpleItem("iron_shard");
    public static final DeferredItem<Item> LAPIS_LAZULI_SHARD = ITEMS.registerSimpleItem("lapis_lazuli_shard");
    public static final DeferredItem<Item> NETHERITE_SHARD = ITEMS.registerSimpleItem("netherite_shard");
    public static final DeferredItem<Item> QUARTZ_SHARD = ITEMS.registerSimpleItem("quartz_shard");
    public static final DeferredItem<Item> REDSTONE_SHARD = ITEMS.registerSimpleItem("redstone_shard");
    public static final DeferredItem<Item> SLIME_SHARD = ITEMS.registerSimpleItem("slime_shard");

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
