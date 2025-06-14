package net.thenujarh.fo.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;
import net.thenujarh.fo.FuturisticOres;
import net.thenujarh.fo.item.custom.HammerItem;
import net.thenujarh.fo.item.custom.LeadChiselItem;
import net.thenujarh.fo.sound.ModSounds;

public class ModItems {

    public static final Item LEAD = registerItem("lead", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item SULFUR = registerItem("sulfur", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item LEAD_CHISEL = registerItem("lead_chisel", new LeadChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item LEAD_SWORD = registerItem("lead_sword", new SwordItem(ModToolMaterials.LEAD,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers
                    (ModToolMaterials.LEAD, 3, -2.4f))));

    public static final Item LEAD_PICKAXE = registerItem("lead_pickaxe", new PickaxeItem(ModToolMaterials.LEAD,
            new Item.Settings().attributeModifiers
                    (SwordItem.createAttributeModifiers
                            (ModToolMaterials.LEAD, 1, -2.8f))));

    public static final Item LEAD_AXE = registerItem("lead_axe", new AxeItem(ModToolMaterials.LEAD,
            new Item.Settings().attributeModifiers
                    (SwordItem.createAttributeModifiers
                            (ModToolMaterials.LEAD, 6, -3.2f))));

    public static final Item LEAD_SHOVEL = registerItem("lead_shovel", new ShovelItem(ModToolMaterials.LEAD,
            new Item.Settings().attributeModifiers
                    (SwordItem.createAttributeModifiers
                            (ModToolMaterials.LEAD, 2, -3.0f))));

    public static final Item RUBY_HAMMER = registerItem("ruby_hammer",
            new HammerItem(ModToolMaterials.RUBY, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 7, -3.4f))));

    /*
    IRON MAX DAMAGE: 15
    DIAMOND MAX DAMAGE: 33
    GOLD MAX DAMAGE: 7
    NETHERITE MAX DAMAGE: 37 */

    public static final Item LEAD_HELMET = registerItem("lead_helmet",
            new ArmorItem(ModArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(27))));
    public static final Item LEAD_CHESTPLATE = registerItem("lead_chestplate",
            new ArmorItem(ModArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(27))));
    public static final Item LEAD_LEGGINGS = registerItem("lead_leggings",
            new ArmorItem(ModArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(27))));
    public static final Item LEAD_BOOTS = registerItem("lead_boots",
            new ArmorItem(ModArmorMaterials.LEAD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(27))));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(34))));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(34))));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(34))));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(34))));

    public static final Item KAUPENJOE_SMITHING_TEMPLATE = registerItem("kaupen_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(FuturisticOres.MOD_ID, "kaupen"), FeatureFlags.VANILLA));


    public static final Item KAUPEN_BOW = registerItem("kaupen_bow",
            new BowItem(new Item.Settings().maxDamage(500)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FuturisticOres.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FuturisticOres.LOGGER.info("Registering Mod Items for " + FuturisticOres.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LEAD);
            fabricItemGroupEntries.add(RAW_LEAD);
            fabricItemGroupEntries.add(SULFUR);
            fabricItemGroupEntries.add(RUBY);
            fabricItemGroupEntries.add(RAW_RUBY);
            fabricItemGroupEntries.add(KAUPENJOE_SMITHING_TEMPLATE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LEAD_SWORD);
            fabricItemGroupEntries.add(LEAD_HELMET);
            fabricItemGroupEntries.add(LEAD_CHESTPLATE);
            fabricItemGroupEntries.add(LEAD_LEGGINGS);
            fabricItemGroupEntries.add(LEAD_BOOTS);
            fabricItemGroupEntries.add(KAUPEN_BOW);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LEAD_PICKAXE);
            fabricItemGroupEntries.add(LEAD_AXE);
            fabricItemGroupEntries.add(LEAD_SHOVEL);
            fabricItemGroupEntries.add(LEAD_CHISEL);
            fabricItemGroupEntries.add(RUBY_HAMMER);
        });
    }
}
