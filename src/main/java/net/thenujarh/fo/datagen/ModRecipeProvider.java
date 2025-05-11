package net.thenujarh.fo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.thenujarh.fo.block.ModBlocks;
import net.thenujarh.fo.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
//      Smelting/Blasting
        List<ItemConvertible> LEAD_SMELTABLES = List.of(ModItems.LEAD, ModBlocks.LEAD_ORE, ModBlocks.DEEPSLATE_LEAD_ORE);

        offerSmelting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD, 0.25f, 250, "lead");
        offerBlasting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD, 0.25f, 125, "lead");

//      Crafting (Table)
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.LEAD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_LEAD);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_RUBY);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_RAW_LEAD).pattern("AAA").pattern("AAA").pattern("AAA").input('A', ModItems.RAW_LEAD).criterion(hasItem(ModItems.RAW_LEAD), conditionsFromItem(ModItems.RAW_LEAD)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_RAW_RUBY).pattern("AAA").pattern("AAA").pattern("AAA").input('A', ModItems.RAW_RUBY).criterion(hasItem(ModItems.RAW_RUBY), conditionsFromItem(ModItems.RAW_LEAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_LEAD).input(ModBlocks.BLOCK_OF_RAW_LEAD).criterion(hasItem(ModBlocks.BLOCK_OF_RAW_LEAD), conditionsFromItem(ModBlocks.BLOCK_OF_RAW_LEAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY).input(ModBlocks.BLOCK_OF_RAW_RUBY).criterion(hasItem(ModBlocks.BLOCK_OF_RAW_RUBY), conditionsFromItem(ModBlocks.BLOCK_OF_RAW_RUBY)).offerTo(exporter);
    }
}
