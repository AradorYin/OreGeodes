package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OreGeodeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COAL_SHARD.get());
        basicItem(ModItems.COPPER_SHARD.get());
        basicItem(ModItems.DIAMOND_SHARD.get());
        basicItem(ModItems.EMERALD_SHARD.get());
        basicItem(ModItems.FLINT_SHARD.get());
        basicItem(ModItems.GOLD_SHARD.get());
        basicItem(ModItems.IRON_SHARD.get());
        basicItem(ModItems.LAPIS_SHARD.get());
        basicItem(ModItems.NETHERITE_SHARD.get());
        basicItem(ModItems.QUARTZ_SHARD.get());
        basicItem(ModItems.REDSTONE_SHARD.get());
        basicItem(ModItems.SLIME_SHARD.get());

        handheldItem(ModItems.AMETHYST_HAMMER);
        handheldItem(ModItems.DIAMOND_HAMMER);
        handheldItem(ModItems.ECHO_HAMMER);
        handheldItem(ModItems.GOLD_HAMMER);
        handheldItem(ModItems.IRON_HAMMER);
        handheldItem(ModItems.NETHERITE_HAMMER);
    }

    private ItemModelBuilder handheldItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OreGeodeMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
