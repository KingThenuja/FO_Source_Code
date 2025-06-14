package net.thenujarh.fo.util;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.thenujarh.fo.FuturisticOres;
import net.thenujarh.fo.component.ModDataComponentTypes;
import net.thenujarh.fo.item.ModItems;

public class ModModelPredicates {
    public static void registerModelPredicates() {
        ModelPredicateProviderRegistry.register(ModItems.LEAD_CHISEL, Identifier.of(FuturisticOres.MOD_ID, "used"),
                (stack, world, entity, seed)
                        -> stack.get(ModDataComponentTypes.COORDINATES) != null ? 1f : 0f);

        registerCustomBow(ModItems.KAUPEN_BOW);
    }

    private static void registerCustomBow(Item item) {
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItem()
                        != stack ? 0.0F :
                        (stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });
        ModelPredicateProviderRegistry.register(
                item,
                Identifier.ofVanilla("pulling"),
                (stack, world, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getActiveItem()
                                == stack ? 1.0F : 0.0F
        );
    }
}
