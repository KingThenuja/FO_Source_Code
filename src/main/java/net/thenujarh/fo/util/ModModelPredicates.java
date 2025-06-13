package net.thenujarh.fo.util;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.thenujarh.fo.FuturisticOres;
import net.thenujarh.fo.component.ModDataComponentTypes;
import net.thenujarh.fo.item.ModItems;

public class ModModelPredicates {
    public static void registerModelPredicates() {
        ModelPredicateProviderRegistry.register(ModItems.LEAD_CHISEL, Identifier.of(FuturisticOres.MOD_ID, "used"),
                (stack, world, entity, seed)
                        -> stack.get(ModDataComponentTypes.COORDINATES) != null ? 1f : 0f);

    }
}
