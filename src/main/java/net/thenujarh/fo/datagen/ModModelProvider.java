package net.thenujarh.fo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.thenujarh.fo.block.ModBlocks;
import net.thenujarh.fo.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool leadPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_LEAD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_RAW_LEAD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAD_ORE);

        leadPool.stairs(ModBlocks.LEAD_STAIRS);
        leadPool.slab(ModBlocks.LEAD_SLAB);

        leadPool.button(ModBlocks.LEAD_BUTTON);
        leadPool.pressurePlate(ModBlocks.LEAD_PRESSURE_PLATE);

        leadPool.wall(ModBlocks.LEAD_WALLS);

        blockStateModelGenerator.registerDoor(ModBlocks.LEAD_DOORS);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LEAD_TRAPDOORS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAD_CHISEL, Models.GENERATED);
    }
}