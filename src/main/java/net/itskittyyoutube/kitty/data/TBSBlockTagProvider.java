package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class TBSBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TBSBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(TBSBlocks.STONE_DOOR)
                .add(TBSBlocks.STONE_TRAPDOOR)
                .add(TBSBlocks.OBSIDIAN_DOOR)
                .add(TBSBlocks.OBSIDIAN_TRAPDOOR)
                .add(TBSBlocks.DIAMARITE_BLOCK)
                .add(TBSBlocks.CORRUPTIONITE_BLOCK)
                .add(TBSBlocks.BYZANTIUM_BLOCK)
                .add(TBSBlocks.RAW_BYZANTIUM_BLOCK)
                .add(TBSBlocks.BYZANTIUM_ORE)
                .add(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE)
                .add(TBSBlocks.DIAMARITE_CORE)
                .add(TBSBlocks.GILDED_NETHERITE_BLOCK)
                .add(TBSBlocks.ENERGY_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(TBSBlocks.STONE_DOOR)
                .add(TBSBlocks.STONE_TRAPDOOR);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(TBSBlocks.BYZANTIUM_BLOCK)
                .add(TBSBlocks.RAW_BYZANTIUM_BLOCK)
                .add(TBSBlocks.BYZANTIUM_ORE)
                .add(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE)
                .add(TBSBlocks.ENERGY_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(TBSBlocks.OBSIDIAN_DOOR)
                .add(TBSBlocks.OBSIDIAN_TRAPDOOR)
                .add(TBSBlocks.DIAMARITE_BLOCK)
                .add(TBSBlocks.CORRUPTIONITE_BLOCK)
                .add(TBSBlocks.GILDED_NETHERITE_BLOCK);

        valueLookupBuilder(BlockTags.WOODEN_FENCES)
                .add(TBSBlocks.WHITE_FENCE)
                .add(TBSBlocks.LIGHT_GRAY_FENCE)
                .add(TBSBlocks.GRAY_FENCE)
                .add(TBSBlocks.BLACK_FENCE)
                .add(TBSBlocks.BROWN_FENCE)
                .add(TBSBlocks.RED_FENCE)
                .add(TBSBlocks.ORANGE_FENCE)
                .add(TBSBlocks.YELLOW_FENCE)
                .add(TBSBlocks.LIME_FENCE)
                .add(TBSBlocks.GREEN_FENCE)
                .add(TBSBlocks.CYAN_FENCE)
                .add(TBSBlocks.LIGHT_BLUE_FENCE)
                .add(TBSBlocks.BLUE_FENCE)
                .add(TBSBlocks.PURPLE_FENCE)
                .add(TBSBlocks.MAGENTA_FENCE)
                .add(TBSBlocks.PINK_FENCE)
                .add(TBSBlocks.CHERRY_BIRCH_FENCE)
                .add(TBSBlocks.GOLDEN_BIRCH_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(TBSBlocks.WHITE_FENCE_GATE)
                .add(TBSBlocks.LIGHT_GRAY_FENCE_GATE)
                .add(TBSBlocks.GRAY_FENCE_GATE)
                .add(TBSBlocks.BLACK_FENCE_GATE)
                .add(TBSBlocks.BROWN_FENCE_GATE)
                .add(TBSBlocks.RED_FENCE_GATE)
                .add(TBSBlocks.ORANGE_FENCE_GATE)
                .add(TBSBlocks.YELLOW_FENCE_GATE)
                .add(TBSBlocks.LIME_FENCE_GATE)
                .add(TBSBlocks.GREEN_FENCE_GATE)
                .add(TBSBlocks.CYAN_FENCE_GATE)
                .add(TBSBlocks.LIGHT_BLUE_FENCE_GATE)
                .add(TBSBlocks.BLUE_FENCE_GATE)
                .add(TBSBlocks.PURPLE_FENCE_GATE)
                .add(TBSBlocks.MAGENTA_FENCE_GATE)
                .add(TBSBlocks.PINK_FENCE_GATE)
                .add(TBSBlocks.CHERRY_BIRCH_FENCE_GATE)
                .add(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE);

        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(TBSBlocks.WHITE_DOOR)
                .add(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS)
                .add(TBSBlocks.LIGHT_GRAY_DOOR)
                .add(TBSBlocks.GRAY_DOOR)
                .add(TBSBlocks.BLACK_DOOR)
                .add(TBSBlocks.BROWN_DOOR)
                .add(TBSBlocks.RED_DOOR)
                .add(TBSBlocks.ORANGE_DOOR)
                .add(TBSBlocks.YELLOW_DOOR)
                .add(TBSBlocks.LIME_DOOR)
                .add(TBSBlocks.GREEN_DOOR)
                .add(TBSBlocks.CYAN_DOOR)
                .add(TBSBlocks.LIGHT_BLUE_DOOR)
                .add(TBSBlocks.BLUE_DOOR)
                .add(TBSBlocks.PURPLE_DOOR)
                .add(TBSBlocks.MAGENTA_DOOR)
                .add(TBSBlocks.PINK_DOOR)
                .add(TBSBlocks.CHERRY_BIRCH_DOOR)
                .add(TBSBlocks.GOLDEN_BIRCH_DOOR);

        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(TBSBlocks.WHITE_TRAPDOOR)
                .add(TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS)
                .add(TBSBlocks.LIGHT_GRAY_TRAPDOOR)
                .add(TBSBlocks.GRAY_TRAPDOOR)
                .add(TBSBlocks.BLACK_TRAPDOOR)
                .add(TBSBlocks.BROWN_TRAPDOOR)
                .add(TBSBlocks.RED_TRAPDOOR)
                .add(TBSBlocks.ORANGE_TRAPDOOR)
                .add(TBSBlocks.YELLOW_TRAPDOOR)
                .add(TBSBlocks.LIME_TRAPDOOR)
                .add(TBSBlocks.GREEN_TRAPDOOR)
                .add(TBSBlocks.CYAN_TRAPDOOR)
                .add(TBSBlocks.LIGHT_BLUE_TRAPDOOR)
                .add(TBSBlocks.BLUE_TRAPDOOR)
                .add(TBSBlocks.PURPLE_TRAPDOOR)
                .add(TBSBlocks.MAGENTA_TRAPDOOR)
                .add(TBSBlocks.PINK_TRAPDOOR)
                .add(TBSBlocks.CHERRY_BIRCH_TRAPDOOR)
                .add(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(TBSBlocks.WHITE_BUTTON)
                .add(TBSBlocks.LIGHT_GRAY_BUTTON)
                .add(TBSBlocks.GRAY_BUTTON)
                .add(TBSBlocks.BLACK_BUTTON)
                .add(TBSBlocks.BROWN_BUTTON)
                .add(TBSBlocks.RED_BUTTON)
                .add(TBSBlocks.ORANGE_BUTTON)
                .add(TBSBlocks.YELLOW_BUTTON)
                .add(TBSBlocks.LIME_BUTTON)
                .add(TBSBlocks.GREEN_BUTTON)
                .add(TBSBlocks.CYAN_BUTTON)
                .add(TBSBlocks.LIGHT_BLUE_BUTTON)
                .add(TBSBlocks.BLUE_BUTTON)
                .add(TBSBlocks.PURPLE_BUTTON)
                .add(TBSBlocks.MAGENTA_BUTTON)
                .add(TBSBlocks.PINK_BUTTON)
                .add(TBSBlocks.CHERRY_BIRCH_BUTTON)
                .add(TBSBlocks.GOLDEN_BIRCH_BUTTON);

        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(TBSBlocks.WHITE_SLAB)
                .add(TBSBlocks.LIGHT_GRAY_SLAB)
                .add(TBSBlocks.GRAY_SLAB)
                .add(TBSBlocks.BLACK_SLAB)
                .add(TBSBlocks.BROWN_SLAB)
                .add(TBSBlocks.RED_SLAB)
                .add(TBSBlocks.ORANGE_SLAB)
                .add(TBSBlocks.YELLOW_SLAB)
                .add(TBSBlocks.LIME_SLAB)
                .add(TBSBlocks.GREEN_SLAB)
                .add(TBSBlocks.CYAN_SLAB)
                .add(TBSBlocks.LIGHT_BLUE_SLAB)
                .add(TBSBlocks.BLUE_SLAB)
                .add(TBSBlocks.PURPLE_SLAB)
                .add(TBSBlocks.MAGENTA_SLAB)
                .add(TBSBlocks.PINK_SLAB)
                .add(TBSBlocks.CHERRY_BIRCH_SLAB)
                .add(TBSBlocks.GOLDEN_BIRCH_SLAB);

        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(TBSBlocks.WHITE_STAIRS)
                .add(TBSBlocks.LIGHT_GRAY_STAIRS)
                .add(TBSBlocks.GRAY_STAIRS)
                .add(TBSBlocks.BLACK_STAIRS)
                .add(TBSBlocks.BROWN_STAIRS)
                .add(TBSBlocks.RED_STAIRS)
                .add(TBSBlocks.ORANGE_STAIRS)
                .add(TBSBlocks.YELLOW_STAIRS)
                .add(TBSBlocks.LIME_STAIRS)
                .add(TBSBlocks.GREEN_STAIRS)
                .add(TBSBlocks.CYAN_STAIRS)
                .add(TBSBlocks.LIGHT_BLUE_STAIRS)
                .add(TBSBlocks.BLUE_STAIRS)
                .add(TBSBlocks.PURPLE_STAIRS)
                .add(TBSBlocks.MAGENTA_STAIRS)
                .add(TBSBlocks.PINK_STAIRS)
                .add(TBSBlocks.CHERRY_BIRCH_STAIRS)
                .add(TBSBlocks.GOLDEN_BIRCH_STAIRS);

        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(TBSBlocks.WHITE_PRESSURE_PLATE)
                .add(TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE)
                .add(TBSBlocks.GRAY_PRESSURE_PLATE)
                .add(TBSBlocks.BLACK_PRESSURE_PLATE)
                .add(TBSBlocks.BROWN_PRESSURE_PLATE)
                .add(TBSBlocks.RED_PRESSURE_PLATE)
                .add(TBSBlocks.ORANGE_PRESSURE_PLATE)
                .add(TBSBlocks.YELLOW_PRESSURE_PLATE)
                .add(TBSBlocks.LIME_PRESSURE_PLATE)
                .add(TBSBlocks.GREEN_PRESSURE_PLATE)
                .add(TBSBlocks.CYAN_PRESSURE_PLATE)
                .add(TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE)
                .add(TBSBlocks.BLUE_PRESSURE_PLATE)
                .add(TBSBlocks.PURPLE_PRESSURE_PLATE)
                .add(TBSBlocks.MAGENTA_PRESSURE_PLATE)
                .add(TBSBlocks.PINK_PRESSURE_PLATE)
                .add(TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE)
                .add(TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.DOORS)
                .add(TBSBlocks.STONE_DOOR)
                .add(TBSBlocks.BEDROCK_DOOR)
                .add(TBSBlocks.OBSIDIAN_DOOR);

        valueLookupBuilder(BlockTags.TRAPDOORS)
                .add(TBSBlocks.STONE_TRAPDOOR)
                .add(TBSBlocks.BEDROCK_TRAPDOOR)
                .add(TBSBlocks.OBSIDIAN_TRAPDOOR);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(TBSBlocks.CHERRY_BIRCH_LOG)
                .add(TBSBlocks.CHERRY_BIRCH_WOOD)
                .add(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG)
                .add(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD)
                .add(TBSBlocks.GOLDEN_BIRCH_LOG)
                .add(TBSBlocks.GOLDEN_BIRCH_WOOD)
                .add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG)
                .add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD);

        //valueLookupBuilder(BlockTags.WOODEN_SHELVES)
                //.add(TheBedrockSMPBlocks.SHELFSHELF);
    }
}
