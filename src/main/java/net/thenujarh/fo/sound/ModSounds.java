package net.thenujarh.fo.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.thenujarh.fo.FuturisticOres;

public class ModSounds {

    //TODO add .ogg file for the mod's soumds
    public static final SoundEvent LEAD_SWORD_SWING = registerSoundEvent("lead_sword_swing");

    public static final SoundEvent CHISEL_USE = registerSoundEvent("chisel_use");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(FuturisticOres.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        FuturisticOres.LOGGER.info("Registering Mod Sounds for " + FuturisticOres.MOD_ID);
    }
}
