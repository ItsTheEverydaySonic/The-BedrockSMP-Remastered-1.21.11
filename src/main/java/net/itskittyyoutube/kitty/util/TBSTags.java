package net.itskittyyoutube.kitty.util;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TBSTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_STEEL_EQUIPMENT = createTag("needs_steel_equipment");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_EQUIPMENT = createTag("incorrect_for_steel_equipment");
        public static final TagKey<Block> NEEDS_NETHERITE_EQUIPMENT = createTag("needs_netherite_equipment");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_EQUIPMENT = createTag("incorrect_for_netherite_equipment");
        public static final TagKey<Block> NEEDS_BYZANTIUM_EQUIPMENT = createTag("needs_byzantium_equipment");
        public static final TagKey<Block> INCORRECT_FOR_BYZANTIUM_EQUIPMENT = createTag("incorrect_for_byzantium_equipment");
        public static final TagKey<Block> NEEDS_ENERGY_EQUIPMENT = createTag("needs_byzantium_equipment");
        public static final TagKey<Block> INCORRECT_FOR_ENERGY_EQUIPMENT = createTag("incorrect_for_byzantium_equipment");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TBS.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CHERRY_BIRCH_LOGS = createTag("cherry_birch_logs");
        public static final TagKey<Item> HEADS = createTag("heads");
        public static final TagKey<Item> STEEL_EQUIPMENT_REPAIR = createTag("steel_equipment_repair");
        public static final TagKey<Item> NETHERITE_EQUIPMENT_REPAIR = createTag("netherite_equipment_repair");
        public static final TagKey<Item> INGOTS = createTag("ingots");
        public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = createTag("amethyst_tool_materials");
        public static final TagKey<Item> BYZANTIUM_TOOL_MATERIALS = createTag("byzantium_tool_materials");
        public static final TagKey<Item> GOLDEN_BIRCH_LOGS = createTag("golden_birch_logs");
        public static final TagKey<Item> BYZANTIUM_EQUIPMENT_REPAIR = createTag("byzantium_equipment_repair");
        public static final TagKey<Item> STEEL_TOOL_MATERIALS = createTag("steel_tool_materials");
        public static final TagKey<Item> DIAMARITE_TOOL_MATERIALS = createTag("diamarite_tool_materials");
        public static final TagKey<Item> CORRUPTIONITE_TOOL_MATERIALS = createTag("corruptionite_tool_materials");
        public static final TagKey<Item> GILDED_NETHERITE_TOOL_MATERIALS = createTag("gilded_netherite_tool_materials");
        public static final TagKey<Item> ENERGY_TOOL_MATERIALS = createTag("energy_tool_materials");
        public static final TagKey<Item> ENERGY_EQUIPMENT_REPAIR = createTag("energy_equipment_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TBS.MOD_ID, name));
        }
    }
}
