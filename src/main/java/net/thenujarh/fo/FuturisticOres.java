package net.thenujarh.fo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.thenujarh.fo.block.ModBlocks;
import net.thenujarh.fo.component.ModDataComponentTypes;
import net.thenujarh.fo.item.ModItems;
import net.thenujarh.fo.sound.ModSounds;
import net.thenujarh.fo.util.HammerUsageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuturisticOres implements ModInitializer {
    public static final String MOD_ID = "futuristicores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModDataComponentTypes.registerDataComponentTypes();

        PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModSounds.registerSounds();
    }
}