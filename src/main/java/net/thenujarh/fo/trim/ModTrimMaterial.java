package net.thenujarh.fo.trim;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.thenujarh.fo.FuturisticOres;
import net.thenujarh.fo.item.ModItems;

import java.util.Map;

public class ModTrimMaterial {
    public static final RegistryKey<ArmorTrimMaterial> LEAD = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(FuturisticOres.MOD_ID, "lead"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, LEAD, Registries.ITEM.getEntry(ModItems.LEAD),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);
    }


    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {

        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));


        registerable.register(armorTrimKey, trimMaterial);
    }
}
