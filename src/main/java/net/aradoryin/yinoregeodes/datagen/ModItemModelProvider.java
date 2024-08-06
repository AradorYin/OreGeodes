package net.aradoryin.yinoregeodes.datagen;

import net.aradoryin.yinoregeodes.OreGeodeMod;
import net.aradoryin.yinoregeodes.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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
    }
}
