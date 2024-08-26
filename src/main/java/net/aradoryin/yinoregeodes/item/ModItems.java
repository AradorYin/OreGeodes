package net.aradoryin.yinoregeodes.item;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.item.custom.HammerItem;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OreGeodeMod.MOD_ID);

    public static final DeferredItem<Item> AMETHYST_HAMMER = ITEMS.register("amethyst_hammer", () -> new HammerItem(ModToolTiers.AMETHYST,
            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, 8, -3.4f))));
    public static final DeferredItem<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new HammerItem(Tiers.DIAMOND,
            new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 8, -3.2f))));
    public static final DeferredItem<Item> ECHO_HAMMER = ITEMS.register("echo_hammer", () -> new HammerItem(ModToolTiers.ECHO,
            new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 8, -3.0f))));
    public static final DeferredItem<Item> GOLD_HAMMER = ITEMS.register("gold_hammer", () -> new HammerItem(Tiers.GOLD,
            new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.GOLD, 8, -3.4f))));
    public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new HammerItem(Tiers.IRON,
            new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.IRON, 8, -3.4f))));
    public static final DeferredItem<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new HammerItem(Tiers.NETHERITE,
            new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 8, -3.0f))));

    // SHARDS
    public static final DeferredItem<Item> COAL_SHARD = ITEMS.registerSimpleItem("coal_shard");
    public static final DeferredItem<Item> COPPER_SHARD = ITEMS.registerSimpleItem("copper_shard");
    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.registerSimpleItem("diamond_shard");
    public static final DeferredItem<Item> EMERALD_SHARD = ITEMS.registerSimpleItem("emerald_shard");
    public static final DeferredItem<Item> FLINT_SHARD = ITEMS.registerSimpleItem("flint_shard");
    public static final DeferredItem<Item> GOLD_SHARD = ITEMS.registerSimpleItem("gold_shard");
    public static final DeferredItem<Item> IRON_SHARD = ITEMS.registerSimpleItem("iron_shard");
    public static final DeferredItem<Item> LAPIS_SHARD = ITEMS.registerSimpleItem("lapis_shard");
    public static final DeferredItem<Item> NETHERITE_SHARD = ITEMS.registerSimpleItem("netherite_shard");
    public static final DeferredItem<Item> QUARTZ_SHARD = ITEMS.registerSimpleItem("quartz_shard");
    public static final DeferredItem<Item> REDSTONE_SHARD = ITEMS.registerSimpleItem("redstone_shard");
    public static final DeferredItem<Item> SLIME_SHARD = ITEMS.registerSimpleItem("slime_shard");

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
