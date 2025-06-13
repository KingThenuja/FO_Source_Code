package net.thenujarh.fo.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.thenujarh.fo.FuturisticOres;
import net.thenujarh.fo.block.custom.RefinerBlock;
import net.thenujarh.fo.block.custom.RubyLampBlock;

public class ModBlocks {

    public static final Block BLOCK_OF_LEAD = registerBlock("block_of_lead", new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    public static final Block BLOCK_OF_RAW_LEAD = registerBlock("block_of_raw_lead", new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(3.5F, 5.0F).sounds(BlockSoundGroup.TUFF)));

    public static final Block LEAD_ORE = registerBlock("lead_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block SULFUR_ORE = registerBlock("sulfur_ore", new ExperienceDroppingBlock(UniformIntProvider.create(4, 7), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));

    public static final Block SULFUR_BLOCK = registerBlock("sulfur_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 6), AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block BLOCK_OF_RUBY = registerBlock("block_of_ruby", new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    public static final Block BLOCK_OF_RAW_RUBY = registerBlock("block_of_raw_ruby", new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(3.5F, 5.0F).sounds(BlockSoundGroup.TUFF)));

    public static final Block LEAD_STAIRS = registerBlock("lead_stairs", new StairsBlock(ModBlocks.BLOCK_OF_LEAD.getDefaultState(), AbstractBlock.Settings.create().requiresTool().strength(2.5F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block LEAD_SLAB = registerBlock("lead_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(2.5F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block LEAD_BUTTON = registerBlock("lead_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().noCollision().requiresTool().strength(2.5F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block LEAD_PRESSURE_PLATE = registerBlock("lead_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));
    public static final Block LEAD_WALLS = registerBlock("lead_walls", new WallBlock(AbstractBlock.Settings.create().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));
    public static final Block LEAD_DOORS = registerBlock("lead_doors", new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().nonOpaque().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));
    public static final Block LEAD_TRAPDOORS = registerBlock("lead_trapdoors", new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().nonOpaque().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs", new StairsBlock(ModBlocks.BLOCK_OF_RUBY.getDefaultState(), AbstractBlock.Settings.create().requiresTool().strength(2.5F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(2.5F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_BUTTON = registerBlock("ruby_button", new ButtonBlock(BlockSetType.IRON, 2, AbstractBlock.Settings.create().noCollision().requiresTool().strength(2.5F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate", new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_WALLS = registerBlock("ruby_walls", new WallBlock(AbstractBlock.Settings.create().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_DOORS = registerBlock("ruby_doors", new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().nonOpaque().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));
    public static final Block RUBY_TRAPDOORS = registerBlock("ruby_trapdoors", new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().nonOpaque().requiresTool().strength(4F, 6F).sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_LAMP = registerBlock("ruby_lamp", new RubyLampBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().luminance(state -> state.get(RubyLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.LANTERN)));

    public static final Block LEAD_LANTERN = registerBlock(
            "lead_lantern", new LanternBlock(
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.IRON_GRAY)
                    .solid()
                    .requiresTool()
                    .strength(3.5F)
                    .sounds(BlockSoundGroup.LANTERN)
                    .luminance(state -> 15)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.NORMAL)
            ));

    public static final Block REFINING_TABLE = registerBlock(
            "refining_table",
            new RefinerBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.5F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FuturisticOres.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FuturisticOres.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FuturisticOres.LOGGER.info("Registering Mod Blocks for " + FuturisticOres.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLOCK_OF_LEAD);
            fabricItemGroupEntries.add(BLOCK_OF_RAW_LEAD);
            fabricItemGroupEntries.add(BLOCK_OF_RUBY);
            fabricItemGroupEntries.add(BLOCK_OF_RAW_RUBY);

            fabricItemGroupEntries.add(LEAD_SLAB);
            fabricItemGroupEntries.add(LEAD_STAIRS);
            fabricItemGroupEntries.add(LEAD_DOORS);
            fabricItemGroupEntries.add(LEAD_TRAPDOORS);
            fabricItemGroupEntries.add(LEAD_WALLS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(REFINING_TABLE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LEAD_PRESSURE_PLATE);
            fabricItemGroupEntries.add(LEAD_BUTTON);
            fabricItemGroupEntries.add(RUBY_PRESSURE_PLATE);
            fabricItemGroupEntries.add(RUBY_BUTTON);
            fabricItemGroupEntries.add(RUBY_LAMP);
        });
    }
}
