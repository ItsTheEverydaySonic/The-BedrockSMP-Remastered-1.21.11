package net.itskittyyoutube.kitty.util;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TBSBlockTags {
    public static final TagKey<Block> NEEDS_STEEL_EQUIPMENT = of("needs_steel_equipment");
    public static final TagKey<Block> INCORRECT_FOR_STEEL_EQUIPMENT = of("incorrect_for_steel_equipment");
    public static final TagKey<Block> NEEDS_NETHERITE_EQUIPMENT = of("needs_netherite_equipment");
    public static final TagKey<Block> INCORRECT_FOR_NETHERITE_EQUIPMENT = of("incorrect_for_netherite_equipment");
    public static final TagKey<Block> NEEDS_BYZANTIUM_EQUIPMENT = of("needs_byzantium_equipment");
    public static final TagKey<Block> INCORRECT_FOR_BYZANTIUM_EQUIPMENT = of("incorrect_for_byzantium_equipment");
    public static final TagKey<Block> NEEDS_ENERGY_EQUIPMENT = of("needs_energy_equipment");
    public static final TagKey<Block> INCORRECT_FOR_ENERGY_EQUIPMENT = of("incorrect_for_energy_equipment");

    private TBSBlockTags() {
    }

    private static TagKey<Block> of(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TBS.MOD_ID, name));
    }
}
