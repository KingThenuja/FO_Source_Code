package net.thenujarh.fo.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.thenujarh.fo.block.ModBlocks;
import net.thenujarh.fo.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLOCK_OF_RAW_RUBY);
        addDrop(ModBlocks.BLOCK_OF_RUBY);
        addDrop(ModBlocks.BLOCK_OF_LEAD);
        addDrop(ModBlocks.BLOCK_OF_RAW_LEAD);

        addDrop(ModBlocks.LEAD_ORE, oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.DEEPSLATE_LEAD_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE, ModItems.RAW_LEAD, 3, 7));

        addDrop(ModBlocks.LEAD_STAIRS);
        addDrop(ModBlocks.LEAD_SLAB, slabDrops(ModBlocks.LEAD_SLAB));

        addDrop(ModBlocks.LEAD_BUTTON);
        addDrop(ModBlocks.LEAD_PRESSURE_PLATE);

        addDrop(ModBlocks.LEAD_WALLS);

        addDrop(ModBlocks.LEAD_DOORS, doorDrops(ModBlocks.LEAD_DOORS));
        addDrop(ModBlocks.LEAD_TRAPDOORS);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}