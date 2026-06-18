package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TBSLootTableProvider extends FabricBlockLootTableProvider {
    public TBSLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(TBSBlocks.PLANKS_TEMPLATE);
        addDrop(TBSBlocks.WHITE_PLANKS);
        addDrop(TBSBlocks.WHITE_STAIRS);
        addDrop(TBSBlocks.WHITE_SLAB, slabDrops(TBSBlocks.WHITE_SLAB));
        addDrop(TBSBlocks.WHITE_FENCE);
        addDrop(TBSBlocks.WHITE_FENCE_GATE);
        addDrop(TBSBlocks.WHITE_DOOR, doorDrops(TBSBlocks.WHITE_DOOR));
        addDrop(TBSBlocks.WHITE_TRAPDOOR);
        addDrop(TBSBlocks.WHITE_PRESSURE_PLATE);
        addDrop(TBSBlocks.WHITE_BUTTON);
        addDrop(TBSBlocks.LIGHT_GRAY_PLANKS);
        addDrop(TBSBlocks.LIGHT_GRAY_STAIRS);
        addDrop(TBSBlocks.LIGHT_GRAY_SLAB, slabDrops(TBSBlocks.LIGHT_GRAY_SLAB));
        addDrop(TBSBlocks.LIGHT_GRAY_FENCE);
        addDrop(TBSBlocks.LIGHT_GRAY_FENCE_GATE);
        addDrop(TBSBlocks.LIGHT_GRAY_DOOR, doorDrops(TBSBlocks.LIGHT_GRAY_DOOR));
        addDrop(TBSBlocks.LIGHT_GRAY_TRAPDOOR);
        addDrop(TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE);
        addDrop(TBSBlocks.LIGHT_GRAY_BUTTON);
        addDrop(TBSBlocks.GRAY_PLANKS);
        addDrop(TBSBlocks.GRAY_STAIRS);
        addDrop(TBSBlocks.GRAY_SLAB, slabDrops(TBSBlocks.GRAY_SLAB));
        addDrop(TBSBlocks.GRAY_FENCE);
        addDrop(TBSBlocks.GRAY_FENCE_GATE);
        addDrop(TBSBlocks.GRAY_DOOR, doorDrops(TBSBlocks.GRAY_DOOR));
        addDrop(TBSBlocks.GRAY_TRAPDOOR);
        addDrop(TBSBlocks.GRAY_PRESSURE_PLATE);
        addDrop(TBSBlocks.GRAY_BUTTON);
        addDrop(TBSBlocks.BLACK_PLANKS);
        addDrop(TBSBlocks.BLACK_STAIRS);
        addDrop(TBSBlocks.BLACK_SLAB, slabDrops(TBSBlocks.BLACK_SLAB));
        addDrop(TBSBlocks.BLACK_FENCE);
        addDrop(TBSBlocks.BLACK_FENCE_GATE);
        addDrop(TBSBlocks.BLACK_DOOR, doorDrops(TBSBlocks.BLACK_DOOR));
        addDrop(TBSBlocks.BLACK_TRAPDOOR);
        addDrop(TBSBlocks.BLACK_PRESSURE_PLATE);
        addDrop(TBSBlocks.BLACK_BUTTON);
        addDrop(TBSBlocks.BROWN_PLANKS);
        addDrop(TBSBlocks.BROWN_STAIRS);
        addDrop(TBSBlocks.BROWN_SLAB, slabDrops(TBSBlocks.BROWN_SLAB));
        addDrop(TBSBlocks.BROWN_FENCE);
        addDrop(TBSBlocks.BROWN_FENCE_GATE);
        addDrop(TBSBlocks.BROWN_DOOR, doorDrops(TBSBlocks.BROWN_DOOR));
        addDrop(TBSBlocks.BROWN_TRAPDOOR);
        addDrop(TBSBlocks.BROWN_PRESSURE_PLATE);
        addDrop(TBSBlocks.BROWN_BUTTON);
        addDrop(TBSBlocks.RED_PLANKS);
        addDrop(TBSBlocks.RED_STAIRS);
        addDrop(TBSBlocks.RED_SLAB, slabDrops(TBSBlocks.RED_SLAB));
        addDrop(TBSBlocks.RED_FENCE);
        addDrop(TBSBlocks.RED_FENCE_GATE);
        addDrop(TBSBlocks.RED_DOOR, doorDrops(TBSBlocks.RED_DOOR));
        addDrop(TBSBlocks.RED_TRAPDOOR);
        addDrop(TBSBlocks.RED_PRESSURE_PLATE);
        addDrop(TBSBlocks.RED_BUTTON);
        addDrop(TBSBlocks.ORANGE_PLANKS);
        addDrop(TBSBlocks.ORANGE_STAIRS);
        addDrop(TBSBlocks.ORANGE_SLAB, slabDrops(TBSBlocks.ORANGE_SLAB));
        addDrop(TBSBlocks.ORANGE_FENCE);
        addDrop(TBSBlocks.ORANGE_FENCE_GATE);
        addDrop(TBSBlocks.ORANGE_DOOR, doorDrops(TBSBlocks.ORANGE_DOOR));
        addDrop(TBSBlocks.ORANGE_TRAPDOOR);
        addDrop(TBSBlocks.ORANGE_PRESSURE_PLATE);
        addDrop(TBSBlocks.ORANGE_BUTTON);
        addDrop(TBSBlocks.YELLOW_PLANKS);
        addDrop(TBSBlocks.YELLOW_STAIRS);
        addDrop(TBSBlocks.YELLOW_SLAB, slabDrops(TBSBlocks.YELLOW_SLAB));
        addDrop(TBSBlocks.YELLOW_FENCE);
        addDrop(TBSBlocks.YELLOW_FENCE_GATE);
        addDrop(TBSBlocks.YELLOW_DOOR, doorDrops(TBSBlocks.YELLOW_DOOR));
        addDrop(TBSBlocks.YELLOW_TRAPDOOR);
        addDrop(TBSBlocks.YELLOW_PRESSURE_PLATE);
        addDrop(TBSBlocks.YELLOW_BUTTON);
        addDrop(TBSBlocks.LIME_PLANKS);
        addDrop(TBSBlocks.LIME_STAIRS);
        addDrop(TBSBlocks.LIME_SLAB, slabDrops(TBSBlocks.LIME_SLAB));
        addDrop(TBSBlocks.LIME_FENCE);
        addDrop(TBSBlocks.LIME_FENCE_GATE);
        addDrop(TBSBlocks.LIME_DOOR, doorDrops(TBSBlocks.LIME_DOOR));
        addDrop(TBSBlocks.LIME_TRAPDOOR);
        addDrop(TBSBlocks.LIME_PRESSURE_PLATE);
        addDrop(TBSBlocks.LIME_BUTTON);
        addDrop(TBSBlocks.GREEN_PLANKS);
        addDrop(TBSBlocks.GREEN_STAIRS);
        addDrop(TBSBlocks.GREEN_SLAB, slabDrops(TBSBlocks.GREEN_SLAB));
        addDrop(TBSBlocks.GREEN_FENCE);
        addDrop(TBSBlocks.GREEN_FENCE_GATE);
        addDrop(TBSBlocks.GREEN_DOOR, doorDrops(TBSBlocks.GREEN_DOOR));
        addDrop(TBSBlocks.GREEN_TRAPDOOR);
        addDrop(TBSBlocks.GREEN_PRESSURE_PLATE);
        addDrop(TBSBlocks.GREEN_BUTTON);
        addDrop(TBSBlocks.CYAN_PLANKS);
        addDrop(TBSBlocks.CYAN_STAIRS);
        addDrop(TBSBlocks.CYAN_SLAB, slabDrops(TBSBlocks.CYAN_SLAB));
        addDrop(TBSBlocks.CYAN_FENCE);
        addDrop(TBSBlocks.CYAN_FENCE_GATE);
        addDrop(TBSBlocks.CYAN_DOOR, doorDrops(TBSBlocks.CYAN_DOOR));
        addDrop(TBSBlocks.CYAN_TRAPDOOR);
        addDrop(TBSBlocks.CYAN_PRESSURE_PLATE);
        addDrop(TBSBlocks.CYAN_BUTTON);
        addDrop(TBSBlocks.LIGHT_BLUE_PLANKS);
        addDrop(TBSBlocks.LIGHT_BLUE_STAIRS);
        addDrop(TBSBlocks.LIGHT_BLUE_SLAB, slabDrops(TBSBlocks.LIGHT_BLUE_SLAB));
        addDrop(TBSBlocks.LIGHT_BLUE_FENCE);
        addDrop(TBSBlocks.LIGHT_BLUE_FENCE_GATE);
        addDrop(TBSBlocks.LIGHT_BLUE_DOOR, doorDrops(TBSBlocks.LIGHT_BLUE_DOOR));
        addDrop(TBSBlocks.LIGHT_BLUE_TRAPDOOR);
        addDrop(TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE);
        addDrop(TBSBlocks.LIGHT_BLUE_BUTTON);
        addDrop(TBSBlocks.BLUE_PLANKS);
        addDrop(TBSBlocks.BLUE_STAIRS);
        addDrop(TBSBlocks.BLUE_SLAB, slabDrops(TBSBlocks.BLUE_SLAB));
        addDrop(TBSBlocks.BLUE_FENCE);
        addDrop(TBSBlocks.BLUE_FENCE_GATE);
        addDrop(TBSBlocks.BLUE_DOOR, doorDrops(TBSBlocks.BLUE_DOOR));
        addDrop(TBSBlocks.BLUE_TRAPDOOR);
        addDrop(TBSBlocks.BLUE_PRESSURE_PLATE);
        addDrop(TBSBlocks.BLUE_BUTTON);
        addDrop(TBSBlocks.PURPLE_PLANKS);
        addDrop(TBSBlocks.PURPLE_STAIRS);
        addDrop(TBSBlocks.PURPLE_SLAB, slabDrops(TBSBlocks.PURPLE_SLAB));
        addDrop(TBSBlocks.PURPLE_FENCE);
        addDrop(TBSBlocks.PURPLE_FENCE_GATE);
        addDrop(TBSBlocks.PURPLE_DOOR, doorDrops(TBSBlocks.PURPLE_DOOR));
        addDrop(TBSBlocks.PURPLE_TRAPDOOR);
        addDrop(TBSBlocks.PURPLE_PRESSURE_PLATE);
        addDrop(TBSBlocks.PURPLE_BUTTON);
        addDrop(TBSBlocks.MAGENTA_PLANKS);
        addDrop(TBSBlocks.MAGENTA_STAIRS);
        addDrop(TBSBlocks.MAGENTA_SLAB, slabDrops(TBSBlocks.MAGENTA_SLAB));
        addDrop(TBSBlocks.MAGENTA_FENCE);
        addDrop(TBSBlocks.MAGENTA_FENCE_GATE);
        addDrop(TBSBlocks.MAGENTA_DOOR, doorDrops(TBSBlocks.MAGENTA_DOOR));
        addDrop(TBSBlocks.MAGENTA_TRAPDOOR);
        addDrop(TBSBlocks.MAGENTA_PRESSURE_PLATE);
        addDrop(TBSBlocks.MAGENTA_BUTTON);
        addDrop(TBSBlocks.PINK_PLANKS);
        addDrop(TBSBlocks.PINK_STAIRS);
        addDrop(TBSBlocks.PINK_SLAB, slabDrops(TBSBlocks.PINK_SLAB));
        addDrop(TBSBlocks.PINK_FENCE);
        addDrop(TBSBlocks.PINK_FENCE_GATE);
        addDrop(TBSBlocks.PINK_DOOR, doorDrops(TBSBlocks.PINK_DOOR));
        addDrop(TBSBlocks.PINK_TRAPDOOR);
        addDrop(TBSBlocks.PINK_PRESSURE_PLATE);
        addDrop(TBSBlocks.PINK_BUTTON);

        addDrop(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS, doorDrops(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS));
        addDrop(TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);
        
        addDrop(TBSBlocks.CHERRY_BIRCH_STAIRS);
        addDrop(TBSBlocks.CHERRY_BIRCH_SLAB, slabDrops(TBSBlocks.CHERRY_BIRCH_SLAB));
        addDrop(TBSBlocks.GOLDEN_BIRCH_STAIRS);
        addDrop(TBSBlocks.GOLDEN_BIRCH_SLAB, slabDrops(TBSBlocks.GOLDEN_BIRCH_SLAB));

        addDrop(TBSBlocks.CHERRY_BIRCH_BUTTON);
        addDrop(TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE);
        addDrop(TBSBlocks.GOLDEN_BIRCH_BUTTON);
        addDrop(TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE);

        addDrop(TBSBlocks.CHERRY_BIRCH_FENCE);
        addDrop(TBSBlocks.CHERRY_BIRCH_FENCE_GATE);
        addDrop(TBSBlocks.GOLDEN_BIRCH_FENCE);
        addDrop(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE);

        addDrop(TBSBlocks.CHERRY_BIRCH_DOOR, doorDrops(TBSBlocks.CHERRY_BIRCH_DOOR));
        addDrop(TBSBlocks.GOLDEN_BIRCH_DOOR, doorDrops(TBSBlocks.GOLDEN_BIRCH_DOOR));
        addDrop(TBSBlocks.STONE_DOOR, doorDrops(TBSBlocks.STONE_DOOR));
        addDrop(TBSBlocks.OBSIDIAN_DOOR, doorDrops(TBSBlocks.OBSIDIAN_DOOR));
        addDrop(TBSBlocks.CHERRY_BIRCH_TRAPDOOR);
        addDrop(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR);
        addDrop(TBSBlocks.STONE_TRAPDOOR);
        addDrop(TBSBlocks.OBSIDIAN_TRAPDOOR);

        addDrop(TBSBlocks.CHERRY_BIRCH_LOG);
        addDrop(TBSBlocks.CHERRY_BIRCH_WOOD);
        addDrop(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG);
        addDrop(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
        addDrop(TBSBlocks.CHERRY_BIRCH_PLANKS);
        addDrop(TBSBlocks.CHERRY_BIRCH_SAPLING);
        addDrop(TBSBlocks.GOLDEN_BIRCH_LOG);
        addDrop(TBSBlocks.GOLDEN_BIRCH_WOOD);
        addDrop(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG);
        addDrop(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD);
        addDrop(TBSBlocks.GOLDEN_BIRCH_PLANKS);
        addDrop(TBSBlocks.GOLDEN_BIRCH_SAPLING);

        addDrop(TBSBlocks.CHERRY_BIRCH_LEAVES, leavesDrops(TBSBlocks.CHERRY_BIRCH_LEAVES,
                TBSBlocks.CHERRY_BIRCH_SAPLING, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F));
        addDrop(TBSBlocks.GOLDEN_BIRCH_LEAVES, leavesDrops(TBSBlocks.GOLDEN_BIRCH_LEAVES,
                TBSBlocks.GOLDEN_BIRCH_SAPLING, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F));

        //addDrop(TheBedrockSMPBlocks.SHELFSHELF);

        addDrop(TBSBlocks.DIAMARITE_BLOCK);
        addDrop(TBSBlocks.CORRUPTIONITE_BLOCK);

        addDrop(TBSBlocks.BYZANTIUM_BLOCK);
        addDrop(TBSBlocks.RAW_BYZANTIUM_BLOCK);

        addDrop(TBSBlocks.BYZANTIUM_ORE, oreDrops(TBSBlocks.BYZANTIUM_ORE, TBSItems.RAW_BYZANTIUM));
        addDrop(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE, oreDrops(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE, TBSItems.RAW_BYZANTIUM));

        addDrop(TBSBlocks.DIAMARITE_CORE);

        addDrop(TBSBlocks.GILDED_NETHERITE_BLOCK);

        addDrop(TBSBlocks.ENERGY_BLOCK);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
