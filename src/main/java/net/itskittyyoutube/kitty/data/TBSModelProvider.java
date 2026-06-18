package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.itskittyyoutube.kitty.material.TBSArmorMaterials;
import net.itskittyyoutube.kitty.util.TBSBabyProperty;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.model.SelectItemModel;
import net.minecraft.client.render.item.property.select.ComponentSelectProperty;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.data.DataWriter;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class TBSModelProvider extends FabricModelProvider {
    private final boolean small;

    public TBSModelProvider(FabricDataOutput output, boolean small) {
        super(output);
        this.small = small;
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        return super.run(writer);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerDoor(TBSBlocks.STONE_DOOR);
        blockStateModelGenerator.registerDoor(TBSBlocks.BEDROCK_DOOR);
        blockStateModelGenerator.registerDoor(TBSBlocks.OBSIDIAN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.STONE_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.BEDROCK_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.OBSIDIAN_TRAPDOOR);
        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.PLANKS_TEMPLATE);
        BlockStateModelGenerator.BlockTexturePool whitePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.WHITE_PLANKS);
        whitePlanksPool.stairs(TBSBlocks.WHITE_STAIRS);
        whitePlanksPool.slab(TBSBlocks.WHITE_SLAB);
        whitePlanksPool.button(TBSBlocks.WHITE_BUTTON);
        whitePlanksPool.pressurePlate(TBSBlocks.WHITE_PRESSURE_PLATE);
        whitePlanksPool.fence(TBSBlocks.WHITE_FENCE);
        whitePlanksPool.fenceGate(TBSBlocks.WHITE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.WHITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.WHITE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool lightGrayPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.LIGHT_GRAY_PLANKS);
        lightGrayPlanksPool.stairs(TBSBlocks.LIGHT_GRAY_STAIRS);
        lightGrayPlanksPool.slab(TBSBlocks.LIGHT_GRAY_SLAB);
        lightGrayPlanksPool.button(TBSBlocks.LIGHT_GRAY_BUTTON);
        lightGrayPlanksPool.pressurePlate(TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE);
        lightGrayPlanksPool.fence(TBSBlocks.LIGHT_GRAY_FENCE);
        lightGrayPlanksPool.fenceGate(TBSBlocks.LIGHT_GRAY_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.LIGHT_GRAY_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.LIGHT_GRAY_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool grayPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.GRAY_PLANKS);
        grayPlanksPool.stairs(TBSBlocks.GRAY_STAIRS);
        grayPlanksPool.slab(TBSBlocks.GRAY_SLAB);
        grayPlanksPool.button(TBSBlocks.GRAY_BUTTON);
        grayPlanksPool.pressurePlate(TBSBlocks.GRAY_PRESSURE_PLATE);
        grayPlanksPool.fence(TBSBlocks.GRAY_FENCE);
        grayPlanksPool.fenceGate(TBSBlocks.GRAY_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.GRAY_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.GRAY_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool blackPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.BLACK_PLANKS);
        blackPlanksPool.stairs(TBSBlocks.BLACK_STAIRS);
        blackPlanksPool.slab(TBSBlocks.BLACK_SLAB);
        blackPlanksPool.button(TBSBlocks.BLACK_BUTTON);
        blackPlanksPool.pressurePlate(TBSBlocks.BLACK_PRESSURE_PLATE);
        blackPlanksPool.fence(TBSBlocks.BLACK_FENCE);
        blackPlanksPool.fenceGate(TBSBlocks.BLACK_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.BLACK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.BLACK_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool brownPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.BROWN_PLANKS);
        brownPlanksPool.stairs(TBSBlocks.BROWN_STAIRS);
        brownPlanksPool.slab(TBSBlocks.BROWN_SLAB);
        brownPlanksPool.button(TBSBlocks.BROWN_BUTTON);
        brownPlanksPool.pressurePlate(TBSBlocks.BROWN_PRESSURE_PLATE);
        brownPlanksPool.fence(TBSBlocks.BROWN_FENCE);
        brownPlanksPool.fenceGate(TBSBlocks.BROWN_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.BROWN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.BROWN_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool redPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.RED_PLANKS);
        redPlanksPool.stairs(TBSBlocks.RED_STAIRS);
        redPlanksPool.slab(TBSBlocks.RED_SLAB);
        redPlanksPool.button(TBSBlocks.RED_BUTTON);
        redPlanksPool.pressurePlate(TBSBlocks.RED_PRESSURE_PLATE);
        redPlanksPool.fence(TBSBlocks.RED_FENCE);
        redPlanksPool.fenceGate(TBSBlocks.RED_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.RED_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.RED_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool orangePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.ORANGE_PLANKS);
        orangePlanksPool.stairs(TBSBlocks.ORANGE_STAIRS);
        orangePlanksPool.slab(TBSBlocks.ORANGE_SLAB);
        orangePlanksPool.button(TBSBlocks.ORANGE_BUTTON);
        orangePlanksPool.pressurePlate(TBSBlocks.ORANGE_PRESSURE_PLATE);
        orangePlanksPool.fence(TBSBlocks.ORANGE_FENCE);
        orangePlanksPool.fenceGate(TBSBlocks.ORANGE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.ORANGE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.ORANGE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool yellowPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.YELLOW_PLANKS);
        yellowPlanksPool.stairs(TBSBlocks.YELLOW_STAIRS);
        yellowPlanksPool.slab(TBSBlocks.YELLOW_SLAB);
        yellowPlanksPool.button(TBSBlocks.YELLOW_BUTTON);
        yellowPlanksPool.pressurePlate(TBSBlocks.YELLOW_PRESSURE_PLATE);
        yellowPlanksPool.fence(TBSBlocks.YELLOW_FENCE);
        yellowPlanksPool.fenceGate(TBSBlocks.YELLOW_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.YELLOW_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.YELLOW_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool limePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.LIME_PLANKS);
        limePlanksPool.stairs(TBSBlocks.LIME_STAIRS);
        limePlanksPool.slab(TBSBlocks.LIME_SLAB);
        limePlanksPool.button(TBSBlocks.LIME_BUTTON);
        limePlanksPool.pressurePlate(TBSBlocks.LIME_PRESSURE_PLATE);
        limePlanksPool.fence(TBSBlocks.LIME_FENCE);
        limePlanksPool.fenceGate(TBSBlocks.LIME_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.LIME_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.LIME_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool greenPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.GREEN_PLANKS);
        greenPlanksPool.stairs(TBSBlocks.GREEN_STAIRS);
        greenPlanksPool.slab(TBSBlocks.GREEN_SLAB);
        greenPlanksPool.button(TBSBlocks.GREEN_BUTTON);
        greenPlanksPool.pressurePlate(TBSBlocks.GREEN_PRESSURE_PLATE);
        greenPlanksPool.fence(TBSBlocks.GREEN_FENCE);
        greenPlanksPool.fenceGate(TBSBlocks.GREEN_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.GREEN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.GREEN_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool cyanPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.CYAN_PLANKS);
        cyanPlanksPool.stairs(TBSBlocks.CYAN_STAIRS);
        cyanPlanksPool.slab(TBSBlocks.CYAN_SLAB);
        cyanPlanksPool.button(TBSBlocks.CYAN_BUTTON);
        cyanPlanksPool.pressurePlate(TBSBlocks.CYAN_PRESSURE_PLATE);
        cyanPlanksPool.fence(TBSBlocks.CYAN_FENCE);
        cyanPlanksPool.fenceGate(TBSBlocks.CYAN_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.CYAN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.CYAN_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool lightBluePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.LIGHT_BLUE_PLANKS);
        lightBluePlanksPool.stairs(TBSBlocks.LIGHT_BLUE_STAIRS);
        lightBluePlanksPool.slab(TBSBlocks.LIGHT_BLUE_SLAB);
        lightBluePlanksPool.button(TBSBlocks.LIGHT_BLUE_BUTTON);
        lightBluePlanksPool.pressurePlate(TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE);
        lightBluePlanksPool.fence(TBSBlocks.LIGHT_BLUE_FENCE);
        lightBluePlanksPool.fenceGate(TBSBlocks.LIGHT_BLUE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.LIGHT_BLUE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.LIGHT_BLUE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool bluePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.BLUE_PLANKS);
        bluePlanksPool.stairs(TBSBlocks.BLUE_STAIRS);
        bluePlanksPool.slab(TBSBlocks.BLUE_SLAB);
        bluePlanksPool.button(TBSBlocks.BLUE_BUTTON);
        bluePlanksPool.pressurePlate(TBSBlocks.BLUE_PRESSURE_PLATE);
        bluePlanksPool.fence(TBSBlocks.BLUE_FENCE);
        bluePlanksPool.fenceGate(TBSBlocks.BLUE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.BLUE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.BLUE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool purplePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.PURPLE_PLANKS);
        purplePlanksPool.stairs(TBSBlocks.PURPLE_STAIRS);
        purplePlanksPool.slab(TBSBlocks.PURPLE_SLAB);
        purplePlanksPool.button(TBSBlocks.PURPLE_BUTTON);
        purplePlanksPool.pressurePlate(TBSBlocks.PURPLE_PRESSURE_PLATE);
        purplePlanksPool.fence(TBSBlocks.PURPLE_FENCE);
        purplePlanksPool.fenceGate(TBSBlocks.PURPLE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.PURPLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.PURPLE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool magentaPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.MAGENTA_PLANKS);
        magentaPlanksPool.stairs(TBSBlocks.MAGENTA_STAIRS);
        magentaPlanksPool.slab(TBSBlocks.MAGENTA_SLAB);
        magentaPlanksPool.button(TBSBlocks.MAGENTA_BUTTON);
        magentaPlanksPool.pressurePlate(TBSBlocks.MAGENTA_PRESSURE_PLATE);
        magentaPlanksPool.fence(TBSBlocks.MAGENTA_FENCE);
        magentaPlanksPool.fenceGate(TBSBlocks.MAGENTA_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.MAGENTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.MAGENTA_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool pinkPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.PINK_PLANKS);
        pinkPlanksPool.stairs(TBSBlocks.PINK_STAIRS);
        pinkPlanksPool.slab(TBSBlocks.PINK_SLAB);
        pinkPlanksPool.button(TBSBlocks.PINK_BUTTON);
        pinkPlanksPool.pressurePlate(TBSBlocks.PINK_PRESSURE_PLATE);
        pinkPlanksPool.fence(TBSBlocks.PINK_FENCE);
        pinkPlanksPool.fenceGate(TBSBlocks.PINK_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.PINK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.PINK_TRAPDOOR);
        blockStateModelGenerator.registerDoor(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);
        BlockStateModelGenerator.BlockTexturePool CherryBirchPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.CHERRY_BIRCH_PLANKS);
        CherryBirchPool.stairs(TBSBlocks.CHERRY_BIRCH_STAIRS);
        CherryBirchPool.slab(TBSBlocks.CHERRY_BIRCH_SLAB);
        CherryBirchPool.button(TBSBlocks.CHERRY_BIRCH_BUTTON);
        CherryBirchPool.pressurePlate(TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE);
        CherryBirchPool.fence(TBSBlocks.CHERRY_BIRCH_FENCE);
        CherryBirchPool.fenceGate(TBSBlocks.CHERRY_BIRCH_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.CHERRY_BIRCH_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.CHERRY_BIRCH_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool GoldenBirchPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TBSBlocks.GOLDEN_BIRCH_PLANKS);
        GoldenBirchPool.stairs(TBSBlocks.GOLDEN_BIRCH_STAIRS);
        GoldenBirchPool.slab(TBSBlocks.GOLDEN_BIRCH_SLAB);
        GoldenBirchPool.button(TBSBlocks.GOLDEN_BIRCH_BUTTON);
        GoldenBirchPool.pressurePlate(TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE);
        GoldenBirchPool.fence(TBSBlocks.GOLDEN_BIRCH_FENCE);
        GoldenBirchPool.fenceGate(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TBSBlocks.GOLDEN_BIRCH_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR);

        blockStateModelGenerator.createLogTexturePool(TBSBlocks.CHERRY_BIRCH_LOG).log(TBSBlocks.CHERRY_BIRCH_LOG)
                .wood(TBSBlocks.CHERRY_BIRCH_WOOD);
        blockStateModelGenerator.createLogTexturePool(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG).log(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG)
                .wood(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
        blockStateModelGenerator.createLogTexturePool(TBSBlocks.GOLDEN_BIRCH_LOG).log(TBSBlocks.GOLDEN_BIRCH_LOG)
                .wood(TBSBlocks.GOLDEN_BIRCH_WOOD);
        blockStateModelGenerator.createLogTexturePool(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG).log(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG)
                .wood(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD);

        blockStateModelGenerator.registerSingleton(TBSBlocks.CHERRY_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(TBSBlocks.CHERRY_BIRCH_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerSingleton(TBSBlocks.GOLDEN_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(TBSBlocks.GOLDEN_BIRCH_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        //blockStateModelGenerator.registerShelf(TheBedrockSMPBlocks.SHELFSHELF, TheBedrockSMPBlocks.BLUE_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.DIAMARITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.CORRUPTIONITE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.BYZANTIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.RAW_BYZANTIUM_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.BYZANTIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.DEEPSLATE_BYZANTIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(TBSBlocks.GILDED_NETHERITE_BLOCK);

        blockStateModelGenerator.registerSingleton(TBSBlocks.GOLDEN_DEBRIS, TexturedModel.CUBE_COLUMN);

        //blockStateModelGenerator.registerShelf(TBSBlocks.SHELFSHELF, TBSBlocks.BLUE_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TBSItems.MUSIC_DISC_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(TBSItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_STEVE_LAVA_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_LAVA_TEARSSTEP, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_TERRIFYING_TEARS, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_BETTERSIDE, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_12, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_EXPLORER, Models.GENERATED);
        itemModelGenerator.register(TBSItems.ALREADY_AHEAD, Models.GENERATED);
        itemModelGenerator.register(TBSItems.DARK_INSIDE, Models.GENERATED);

        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_TERRIFYING_TEARS, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_BETTERSIDE, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_12, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MUSIC_DISC_REVERSED_EXPLORER, Models.GENERATED);
        itemModelGenerator.register(TBSItems.REVERSED_ALREADY_AHEAD, Models.GENERATED);
        itemModelGenerator.register(TBSItems.REVERSED_DARK_INSIDE, Models.GENERATED);

        itemModelGenerator.register(TBSItems.PANCAKE, Models.GENERATED);
        itemModelGenerator.register(TBSItems.WAFFLE, Models.GENERATED);
        itemModelGenerator.register(TBSItems.REVERSED_PANCAKE, Models.GENERATED);
        itemModelGenerator.register(TBSItems.REVERSED_WAFFLE, Models.GENERATED);

        itemModelGenerator.register(TBSItems.BEDROCKSMP_ICON, Models.GENERATED);
        itemModelGenerator.register(TBSItems.CURSED_EMERALD, Models.GENERATED);

        itemModelGenerator.register(TBSBlocks.CHERRY_BIRCH_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(TBSBlocks.GOLDEN_BIRCH_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(TBSItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(TBSItems.STEEL_ROD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.REINFORCED_PAPER, Models.GENERATED);
        itemModelGenerator.register(TBSItems.MONEY, Models.GENERATED);
        itemModelGenerator.register(TBSItems.YOUTUBE_LOGO, Models.GENERATED);
        itemModelGenerator.register(TBSItems.SILVER_PLAY_BUTTON, Models.GENERATED);
        itemModelGenerator.register(TBSItems.GOLDEN_PLAY_BUTTON, Models.GENERATED);
        itemModelGenerator.register(TBSItems.DIAMOND_PLAY_BUTTON, Models.GENERATED);
        itemModelGenerator.register(TBSItems.NETHERITE_ROD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE, Models.GENERATED);
        itemModelGenerator.register(TBSItems.DIAMARITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(TBSItems.DIAMOND_INGOT, Models.GENERATED);
        itemModelGenerator.register(TBSItems.AMETHYST_INGOT, Models.GENERATED);
        itemModelGenerator.register(TBSItems.CHARD_INGOT, Models.GENERATED);
        itemModelGenerator.register(TBSItems.BURNT_INGOT, Models.GENERATED);

        itemModelGenerator.register(TBSItems.BYZANTIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(TBSItems.BYZANTIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(TBSItems.RAW_BYZANTIUM, Models.GENERATED);

        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(TBSItems.GOLDEN_SCRAP, Models.GENERATED);

        itemModelGenerator.register(TBSItems.DUCT_TAPE, Models.GENERATED);

        itemModelGenerator.register(TBSItems.ENERGY, Models.GENERATED);
        itemModelGenerator.register(TBSItems.ENERGY_GEM, Models.GENERATED);

        itemModelGenerator.register(TBSItems.DREADITE_GEM, Models.GENERATED);

        itemModelGenerator.register(TBSItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.KATARA_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(TBSItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_DAGGER, Models.HANDHELD);

        itemModelGenerator.register(TBSItems.HANDLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.NETHERITE_HANDLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_HANDLE, Models.HANDHELD);

        itemModelGenerator.register(TBSItems.ENERGY_ROD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_HANDLE, Models.HANDHELD);

        itemModelGenerator.register(TBSItems.WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.COPPER_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMOND_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(TBSItems.WOODEN_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.COPPER_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STONE_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GOLDEN_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.IRON_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMOND_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.NETHERITE_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_KATANA, Models.HANDHELD);

        itemModelGenerator.register(TBSItems.WOODEN_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.COPPER_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STONE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GOLDEN_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.BYZANTIUM_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.IRON_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.STEEL_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMOND_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.NETHERITE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.DIAMARITE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.CORRUPTIONITE_SCYTHE, Models.HANDHELD);

        itemModelGenerator.register(TBSItems.DIAMARITE_MACE, Models.HANDHELD_MACE);
        itemModelGenerator.register(TBSItems.DOUBLED_MACE, Models.HANDHELD_MACE);

        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.GILDED_NETHERITE_SCYTHE, Models.HANDHELD);

        itemModelGenerator.registerSpear(TBSItems.STEEL_SPEAR);
        itemModelGenerator.registerSpear(TBSItems.BYZANTIUM_SPEAR);
        itemModelGenerator.registerSpear(TBSItems.GILDED_NETHERITE_SPEAR);
        itemModelGenerator.registerSpear(TBSItems.DIAMARITE_SPEAR);
        itemModelGenerator.registerSpear(TBSItems.CORRUPTIONITE_SPEAR);

        itemModelGenerator.register(TBSItems.ENERGY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_AXE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_HOE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_DAGGER, Models.HANDHELD);
        itemModelGenerator.registerSpear(TBSItems.ENERGY_SPEAR);
        itemModelGenerator.register(TBSItems.ENERGY_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_KATANA, Models.HANDHELD);
        itemModelGenerator.register(TBSItems.ENERGY_SCYTHE, Models.HANDHELD);

        itemModelGenerator.registerArmor(TBSItems.DIAMARITE_HELMET, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.DIAMARITE_CHESTPLATE, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.DIAMARITE_LEGGINGS, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.DIAMARITE_BOOTS, TBSArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.CORRUPTIONITE_HELMET, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.CORRUPTIONITE_CHESTPLATE, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.CORRUPTIONITE_LEGGINGS, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.CORRUPTIONITE_BOOTS, TBSArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.BYZANTIUM_HELMET, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.BYZANTIUM_CHESTPLATE, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.BYZANTIUM_LEGGINGS, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.BYZANTIUM_BOOTS, TBSArmorMaterials.BYZANTIUM_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(TBSItems.GILDED_NETHERITE_HELMET, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.GILDED_NETHERITE_CHESTPLATE, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.GILDED_NETHERITE_LEGGINGS, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.GILDED_NETHERITE_BOOTS, TBSArmorMaterials.GILDED_NETHERITE_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(TBSItems.ENERGY_HELMET, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.ENERGY_CHESTPLATE, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.ENERGY_LEGGINGS, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.ENERGY_BOOTS, TBSArmorMaterials.ENERGY_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        itemModelGenerator.registerArmor(TBSItems.DREADITE_HELMET, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.DREADITE_CHESTPLATE, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.DREADITE_LEGGINGS, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TBSItems.DREADITE_BOOTS, TBSArmorMaterials.DREADITE_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        Item item = Items.AXOLOTL_BUCKET;
        Identifier modelId = ModelIds.getItemModelId(item);
        ItemModel.Unbaked unbaked = ItemModels.basic(modelId);

        Model model = Models.GENERATED;
        if (this.small) {
            model = new Model(
                    Optional.of(Identifier.of(TBS.MOD_ID, "item/smaller_util")),
                    Optional.empty(),
                    TextureKey.LAYER0
            );
        }

        ArrayList<SelectItemModel.SwitchCase<AxolotlEntity.Variant>> adultSwitchCases = new ArrayList<>();
        ArrayList<SelectItemModel.SwitchCase<AxolotlEntity.Variant>> babySwitchCases = new ArrayList<>();

        for (AxolotlEntity.Variant variant : AxolotlEntity.Variant.values()) {
            String modelSuffix = "_" + variant.getId();
            String textureSuffix = variant.equals(AxolotlEntity.Variant.LUCY) ? "" : modelSuffix;

            Identifier adultModel = model.upload(
                    ModelIds.getItemSubModelId(item, modelSuffix),
                    TextureMap.layer0(TextureMap.getSubId(item, textureSuffix)),
                    itemModelGenerator.modelCollector
            );
            adultSwitchCases.add(ItemModels.switchCase(variant, ItemModels.basic(adultModel)));

            Identifier babyModel = model.upload(
                    ModelIds.getItemSubModelId(item, modelSuffix + "_baby"),
                    TextureMap.layer0(TextureMap.getSubId(item, textureSuffix + "_baby")),
                    itemModelGenerator.modelCollector
            );
            babySwitchCases.add(ItemModels.switchCase(variant, ItemModels.basic(babyModel)));
        }

        if (!this.small) {
            itemModelGenerator.output.accept(
                    item, ItemModels.condition(
                            new TBSBabyProperty(),
                            ItemModels.select(
                                    new ComponentSelectProperty<>(DataComponentTypes.AXOLOTL_VARIANT),
                                    unbaked,
                                    babySwitchCases
                            ),
                            ItemModels.select(
                                    new ComponentSelectProperty<>(DataComponentTypes.AXOLOTL_VARIANT),
                                    unbaked,
                                    adultSwitchCases
                            )
                    )
            );
        }
    }
}
