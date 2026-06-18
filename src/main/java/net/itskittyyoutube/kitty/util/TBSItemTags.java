package net.itskittyyoutube.kitty.util;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TBSItemTags {
    public static final TagKey<Item> CHERRY_BIRCH_LOGS = of("cherry_birch_logs");
    public static final TagKey<Item> HEADS = of("heads");
    public static final TagKey<Item> STEEL_EQUIPMENT_REPAIR = of("steel_equipment_repair");
    public static final TagKey<Item> NETHERITE_EQUIPMENT_REPAIR = of("netherite_equipment_repair");
    public static final TagKey<Item> INGOTS = of("ingots");
    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = of("amethyst_tool_materials");
    public static final TagKey<Item> BYZANTIUM_TOOL_MATERIALS = of("byzantium_tool_materials");
    public static final TagKey<Item> GOLDEN_BIRCH_LOGS = of("golden_birch_logs");
    public static final TagKey<Item> BYZANTIUM_EQUIPMENT_REPAIR = of("byzantium_equipment_repair");
    public static final TagKey<Item> STEEL_TOOL_MATERIALS = of("steel_tool_materials");
    public static final TagKey<Item> DIAMARITE_TOOL_MATERIALS = of("diamarite_tool_materials");
    public static final TagKey<Item> CORRUPTIONITE_TOOL_MATERIALS = of("corruptionite_tool_materials");
    public static final TagKey<Item> GILDED_NETHERITE_TOOL_MATERIALS = of("gilded_netherite_tool_materials");
    public static final TagKey<Item> ENERGY_TOOL_MATERIALS = of("energy_tool_materials");
    public static final TagKey<Item> ENERGY_EQUIPMENT_REPAIR = of("energy_equipment_repair");
    public static final TagKey<Item> DREADITE_EQUIPMENT_REPAIR = of("dreadite_equipment_repair");
    public static final TagKey<Item> STICK_REPAIR = of("stick_repair");

    private TBSItemTags() {
    }

    private static TagKey<Item> of(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(TBS.MOD_ID, name));
    }
}
