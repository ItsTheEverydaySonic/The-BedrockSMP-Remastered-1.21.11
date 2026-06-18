package net.itskittyyoutube.kitty.material;

import net.itskittyyoutube.kitty.util.TBSBlockTags;
import net.itskittyyoutube.kitty.util.TBSItemTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class TBSToolMaterials {
    public static ToolMaterial STEEL = new ToolMaterial(TBSBlockTags.INCORRECT_FOR_STEEL_EQUIPMENT,
            896, 7.0F, 3.0F, 13, TBSItemTags.STEEL_EQUIPMENT_REPAIR);

    public static ToolMaterial NETHERITE2 = new ToolMaterial(TBSBlockTags.INCORRECT_FOR_NETHERITE_EQUIPMENT,
            2031, 9.0F, 4.0F, 15, TBSItemTags.NETHERITE_EQUIPMENT_REPAIR);

    public static ToolMaterial BYZANTIUM = new ToolMaterial(TBSBlockTags.INCORRECT_FOR_BYZANTIUM_EQUIPMENT,
            250, 6.0F, 2.0F, 14, TBSItemTags.BYZANTIUM_EQUIPMENT_REPAIR);

    public static ToolMaterial ENERGY = new ToolMaterial(TBSBlockTags.INCORRECT_FOR_ENERGY_EQUIPMENT,
            1561, 8.0F, 3.0F, 10, TBSItemTags.ENERGY_EQUIPMENT_REPAIR);

    public static ToolMaterial STICK = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            0, 9.0F, 0.0F, 1, TBSItemTags.STICK_REPAIR);
}
