package net.itskittyyoutube.kitty.mixin;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.context.LootWorldContext;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {

    @Inject(method = "acceptsForBarter", at = @At("HEAD"), cancellable = true)
    private static void allowCustomBarterItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.isOf(TBSItems.GILDED_NETHERITE_INGOT)) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "getBarteredItem", at = @At("HEAD"), cancellable = true)
    private static void getCustomBarterOutputList(PiglinEntity piglin, CallbackInfoReturnable<List<ItemStack>> cir) {
        if (piglin.getOffHandStack().isOf(TBSItems.GILDED_NETHERITE_INGOT)) {
            Identifier customLootTable = Identifier.of(TBS.MOD_ID, "gameplay/piglin_trade_item");

            // 1. Safe cast utilizing your available getEntityWorld() method
            ServerWorld serverWorld = (ServerWorld) piglin.getEntityWorld();

            // 2. Safe instantiation bypassing any missing or altered getPos() methods
            net.minecraft.util.math.Vec3d piglinPos = new net.minecraft.util.math.Vec3d(piglin.getX(), piglin.getY(), piglin.getZ());

            // 3. Build out the 1.21.11 Yarn loot parameters mapping context
            LootWorldContext parameterSet = new LootWorldContext.Builder(serverWorld)
                    .add(LootContextParameters.THIS_ENTITY, piglin)
                    .add(LootContextParameters.ORIGIN, piglinPos)
                    .build(LootContextTypes.BARTER);

            // 4. Generate dynamic loot items list using mapped registries
            List<ItemStack> loot = serverWorld.getServer().getReloadableRegistries()
                    .getLootTable(RegistryKey.of(RegistryKeys.LOOT_TABLE, customLootTable))
                    .generateLoot(parameterSet);

            cir.setReturnValue(loot);
        }
    }
}
