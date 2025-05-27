package net.thenujarh.fo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.thenujarh.fo.item.ModItems;
import net.thenujarh.fo.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.LEAD_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.LEAD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.LEAD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.LEAD_AXE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.LEAD_HELMET)
                .add(ModItems.LEAD_CHESTPLATE)
                .add(ModItems.LEAD_LEGGINGS)
                .add(ModItems.LEAD_BOOTS);
    }
}