package net.thenujarh.fo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.thenujarh.fo.block.ModBlocks;
import net.thenujarh.fo.block.custom.RubyLampBlock;
import net.thenujarh.fo.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ModPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_LEAD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_RAW_LEAD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAD_ORE);

        ModPool.stairs(ModBlocks.LEAD_STAIRS);
        ModPool.slab(ModBlocks.LEAD_SLAB);

        ModPool.button(ModBlocks.LEAD_BUTTON);
        ModPool.pressurePlate(ModBlocks.LEAD_PRESSURE_PLATE);

        ModPool.wall(ModBlocks.LEAD_WALLS);

        blockStateModelGenerator.registerDoor(ModBlocks.LEAD_DOORS);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LEAD_TRAPDOORS);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.RUBY_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.RUBY_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.RUBY_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(RubyLampBlock.LIT, lampOnIdentifier, lampOffIdentifier)));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.LEAD_CHISEL, Models.GENERATED);
    }
}