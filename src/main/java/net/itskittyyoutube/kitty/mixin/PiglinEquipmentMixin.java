package net.itskittyyoutube.kitty.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PiglinEntity.class)
public class PiglinEquipmentMixin {

    @ModifyReturnValue(
            method = "canEquipStack",
            at = @At("RETURN")
    )
    private boolean kitty$allowCustomPiglinEquipment(boolean original, ItemStack stack) {

        if (stack.isOf(TBSItems.GILDED_NETHERITE_SWORD) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_DAGGER) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_SCYTHE) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_SICKLE) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_KATANA) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_SPEAR) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_HELMET) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_CHESTPLATE) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_LEGGINGS) ||
                stack.isOf(TBSItems.GILDED_NETHERITE_BOOTS)) {

            return true;
        }

        return original;
    }
}