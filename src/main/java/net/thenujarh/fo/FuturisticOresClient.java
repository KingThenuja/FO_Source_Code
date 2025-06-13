package net.thenujarh.fo;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.thenujarh.fo.block.ModBlocks;
import net.thenujarh.fo.util.ModModelPredicates;

public class FuturisticOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEAD_DOORS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LEAD_TRAPDOORS, RenderLayer.getCutout());

        ModModelPredicates.registerModelPredicates();
    }
}
