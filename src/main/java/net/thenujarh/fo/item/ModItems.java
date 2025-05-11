package net.thenujarh.fo.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thenujarh.fo.FuturisticOres;
import net.thenujarh.fo.item.custom.LeadChiselItem;

public class ModItems  {

    public static final Item LEAD = registerItem("lead", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item SULFUR = registerItem("sulfur", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item LEAD_CHISEL = registerItem("lead_chisel", new LeadChiselItem(new Item.Settings().maxDamage(32)));


    private static Item registerItem(String name, Item item){
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
        });
    }
}
