package net.thenujarh.fo.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.thenujarh.fo.block.ModBlocks;

import java.util.Map;

public class LeadChiselItem extends Item {
    private static final Map<Block, Block> LEAD_CHISEL_MAP =
            Map.of(
                    ModBlocks.BLOCK_OF_LEAD, ModBlocks.BLOCK_OF_RAW_LEAD,
                    ModBlocks.BLOCK_OF_RAW_LEAD, ModBlocks.BLOCK_OF_LEAD,
                    ModBlocks.DEEPSLATE_LEAD_ORE, ModBlocks.LEAD_ORE,
                    ModBlocks.LEAD_ORE, ModBlocks.DEEPSLATE_LEAD_ORE

            );

    public LeadChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedblock = world.getBlockState(context.getBlockPos()).getBlock();

        if (LEAD_CHISEL_MAP.containsKey(clickedblock)) {
            if (!world.isClient) {
                world.setBlockState(context.getBlockPos(), LEAD_CHISEL_MAP.get(clickedblock).getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);


            }
        }

        return ActionResult.SUCCESS;
    }
}