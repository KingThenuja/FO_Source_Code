package net.thenujarh.fo.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thenujarh.fo.FuturisticOres;
import net.thenujarh.fo.block.ModBlocks;

public class ModItemGroups  {

    public static final ItemGroup FUTURISTIC_ORES_ITEMS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FuturisticOres.MOD_ID,"futuristic_ores_items_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LEAD))
                    .displayName(Text.translatable("item.futuristicores.lead_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LEAD);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SULFUR);
                        entries.add(ModBlocks.BLOCK_OF_LEAD);
                        entries.add(ModBlocks.BLOCK_OF_RAW_LEAD);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);
                        entries.add(ModBlocks.SULFUR_ORE);
                        entries.add(ModBlocks.SULFUR_BLOCK);
                        entries.add(ModItems.LEAD_CHISEL);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.BLOCK_OF_RUBY);
                        entries.add(ModBlocks.BLOCK_OF_RAW_RUBY);



                    }).build());

    public static void registerItemGroups() {
        FuturisticOres.LOGGER.info("Registering Item Groups for " + FuturisticOres.MOD_ID);

    }
}
