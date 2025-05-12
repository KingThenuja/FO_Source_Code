package net.thenujarh.fo;

import net.fabricmc.api.ModInitializer;
import net.thenujarh.fo.block.ModBlocks;
import net.thenujarh.fo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuturisticOres implements ModInitializer {
    public static final String MOD_ID = "futuristicores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
    }
}