package net.itskittyyoutube.kitty.util;

import com.mojang.serialization.MapCodec;
import net.itskittyyoutube.kitty.TBS;
import net.minecraft.client.render.item.property.bool.BooleanProperties;
import net.minecraft.client.render.item.property.bool.BooleanProperty;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

public record TBSBabyProperty() implements BooleanProperty {
    private static final String NBT_AGE = "Age";

    public static final MapCodec<TBSBabyProperty> CODEC = MapCodec.unit(new TBSBabyProperty());

    @Override
    public boolean test(
            ItemStack stack,
            ClientWorld world,
            LivingEntity user,
            int seed,
            ItemDisplayContext displayContext
    ) {
        NbtCompound nbt = stack.getOrDefault(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT).copyNbt();
        return nbt.getInt(NBT_AGE).orElse(0) < 0;
    }

    @Override
    public MapCodec<? extends BooleanProperty> getCodec() {
        return CODEC;
    }

    public static void register() {
        BooleanProperties.ID_MAPPER.put(Identifier.of(TBS.MOD_ID, "baby"), CODEC);
    }
}
