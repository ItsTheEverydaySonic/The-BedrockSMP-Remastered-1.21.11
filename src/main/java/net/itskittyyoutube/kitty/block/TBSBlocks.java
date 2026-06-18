package net.itskittyyoutube.kitty.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.world.tree.TBSSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class TBSBlocks {
    //Planks
    public static final Block PLANKS_TEMPLATE = registerBlock("planks_template",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block WHITE_PLANKS = registerBlock("white_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block LIGHT_GRAY_PLANKS = registerBlock("light_gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GRAY_PLANKS = registerBlock("gray_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BLACK_PLANKS = registerBlock("black_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BROWN_PLANKS = registerBlock("brown_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RED_PLANKS = registerBlock("red_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block YELLOW_PLANKS = registerBlock("yellow_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block LIME_PLANKS = registerBlock("lime_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GREEN_PLANKS = registerBlock("green_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CYAN_PLANKS = registerBlock("cyan_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block LIGHT_BLUE_PLANKS = registerBlock("light_blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BLUE_PLANKS = registerBlock("blue_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block PURPLE_PLANKS = registerBlock("purple_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MAGENTA_PLANKS = registerBlock("magenta_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block PINK_PLANKS = registerBlock("pink_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CHERRY_BIRCH_PLANKS = registerBlock("cherry_birch_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GOLDEN_BIRCH_PLANKS = registerBlock("golden_birch_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //Doors
    public static final Block WHITE_DOOR = registerBlock("white_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_DOOR = registerBlock("light_gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_DOOR = registerBlock("gray_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_DOOR = registerBlock("black_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_DOOR = registerBlock("brown_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_DOOR = registerBlock("red_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_DOOR = registerBlock("orange_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_DOOR = registerBlock("yellow_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_DOOR = registerBlock("lime_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_DOOR = registerBlock("green_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_DOOR = registerBlock("cyan_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_DOOR = registerBlock("light_blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_DOOR = registerBlock("blue_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_DOOR = registerBlock("purple_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_DOOR = registerBlock("magenta_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_DOOR = registerBlock("pink_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_DOOR_WITH_WINDOWS = registerBlock("dark_oak_door_with_windows",
            properties -> new DoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STONE_DOOR = registerBlock("stone_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.STONE)));
    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).pistonBehavior(PistonBehavior.DESTROY)
                    .dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block OBSIDIAN_DOOR = registerBlock("obsidian_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(50.0F, 1200.0F).pistonBehavior(PistonBehavior.DESTROY)
                    .allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block CHERRY_BIRCH_DOOR = registerBlock("cherry_birch_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_DOOR = registerBlock("golden_birch_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));


    //Trapdoors
    public static final Block WHITE_TRAPDOOR = registerBlock("white_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_TRAPDOOR = registerBlock("light_gray_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_TRAPDOOR = registerBlock("gray_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_TRAPDOOR = registerBlock("black_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_TRAPDOOR = registerBlock("brown_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_TRAPDOOR = registerBlock("red_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_TRAPDOOR = registerBlock("orange_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_TRAPDOOR = registerBlock("yellow_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_TRAPDOOR = registerBlock("lime_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_TRAPDOOR = registerBlock("green_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_TRAPDOOR = registerBlock("cyan_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_TRAPDOOR = registerBlock("light_blue_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_TRAPDOOR = registerBlock("blue_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_TRAPDOOR = registerBlock("purple_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_TRAPDOOR = registerBlock("magenta_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_TRAPDOOR = registerBlock("pink_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.PALE_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_TRAPDOOR_WITH_WINDOWS = registerBlock("dark_oak_trapdoor_with_windows",
            properties -> new TrapdoorBlock(BlockSetType.DARK_OAK, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable()));
    public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.5F, 6.0F).allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(50.0F, 1200.0F).allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block CHERRY_BIRCH_TRAPDOOR = registerBlock("cherry_birch_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_TRAPDOOR = registerBlock("golden_birch_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));

    //Buttons
    public static final Block WHITE_BUTTON = registerBlock("white_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_BUTTON = registerBlock("light_gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_BUTTON = registerBlock("gray_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_BUTTON = registerBlock("black_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_BUTTON = registerBlock("brown_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_BUTTON = registerBlock("red_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_BUTTON = registerBlock("orange_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_BUTTON = registerBlock("yellow_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_BUTTON = registerBlock("lime_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_BUTTON = registerBlock("green_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_BUTTON = registerBlock("cyan_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_BUTTON = registerBlock("light_blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_BUTTON = registerBlock("blue_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_BUTTON = registerBlock("purple_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_BUTTON = registerBlock("magenta_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_BUTTON = registerBlock("pink_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_BIRCH_BUTTON = registerBlock("cherry_birch_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_BUTTON = registerBlock("golden_birch_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));

    //Pressure Plates
    public static final Block WHITE_PRESSURE_PLATE = registerBlock("white_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_PRESSURE_PLATE = registerBlock("light_gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_PRESSURE_PLATE = registerBlock("gray_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_PRESSURE_PLATE = registerBlock("black_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_PRESSURE_PLATE = registerBlock("brown_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_PRESSURE_PLATE = registerBlock("red_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_PRESSURE_PLATE = registerBlock("orange_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_PRESSURE_PLATE = registerBlock("yellow_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_PRESSURE_PLATE = registerBlock("lime_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_PRESSURE_PLATE = registerBlock("green_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_PRESSURE_PLATE = registerBlock("cyan_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_PRESSURE_PLATE = registerBlock("light_blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_PRESSURE_PLATE = registerBlock("blue_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_PRESSURE_PLATE = registerBlock("purple_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_PRESSURE_PLATE = registerBlock("magenta_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_PRESSURE_PLATE = registerBlock("pink_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_BIRCH_PRESSURE_PLATE = registerBlock("cherry_birch_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_PRESSURE_PLATE = registerBlock("golden_birch_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));

    //Stairs
    public static final Block WHITE_STAIRS = registerBlock("white_stairs",
            properties -> new StairsBlock(TBSBlocks.WHITE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_STAIRS = registerBlock("light_gray_stairs",
            properties -> new StairsBlock(TBSBlocks.LIGHT_GRAY_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_STAIRS = registerBlock("gray_stairs",
            properties -> new StairsBlock(TBSBlocks.GRAY_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_STAIRS = registerBlock("black_stairs",
            properties -> new StairsBlock(TBSBlocks.BLACK_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_STAIRS = registerBlock("brown_stairs",
            properties -> new StairsBlock(TBSBlocks.BROWN_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_STAIRS = registerBlock("red_stairs",
            properties -> new StairsBlock(TBSBlocks.RED_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_STAIRS = registerBlock("orange_stairs",
            properties -> new StairsBlock(TBSBlocks.ORANGE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_STAIRS = registerBlock("yellow_stairs",
            properties -> new StairsBlock(TBSBlocks.YELLOW_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_STAIRS = registerBlock("lime_stairs",
            properties -> new StairsBlock(TBSBlocks.LIME_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_STAIRS = registerBlock("green_stairs",
            properties -> new StairsBlock(TBSBlocks.GREEN_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_STAIRS = registerBlock("cyan_stairs",
            properties -> new StairsBlock(TBSBlocks.CYAN_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_STAIRS = registerBlock("light_blue_stairs",
            properties -> new StairsBlock(TBSBlocks.LIGHT_BLUE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_STAIRS = registerBlock("blue_stairs",
            properties -> new StairsBlock(TBSBlocks.BLUE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_STAIRS = registerBlock("purple_stairs",
            properties -> new StairsBlock(TBSBlocks.PURPLE_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_STAIRS = registerBlock("magenta_stairs",
            properties -> new StairsBlock(TBSBlocks.MAGENTA_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_STAIRS = registerBlock("pink_stairs",
            properties -> new StairsBlock(TBSBlocks.PINK_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_BIRCH_STAIRS = registerBlock("cherry_birch_stairs",
            properties -> new StairsBlock(TBSBlocks.CHERRY_BIRCH_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_STAIRS = registerBlock("golden_birch_stairs",
            properties -> new StairsBlock(TBSBlocks.CHERRY_BIRCH_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Slabs
    public static final Block WHITE_SLAB = registerBlock("white_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_SLAB = registerBlock("light_gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_SLAB = registerBlock("gray_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_SLAB = registerBlock("black_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_SLAB = registerBlock("brown_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_SLAB = registerBlock("red_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_SLAB = registerBlock("orange_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_SLAB = registerBlock("yellow_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_SLAB = registerBlock("lime_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_SLAB = registerBlock("green_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_SLAB = registerBlock("cyan_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_SLAB = registerBlock("light_blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_SLAB = registerBlock("blue_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_SLAB = registerBlock("purple_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_SLAB = registerBlock("magenta_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_SLAB = registerBlock("pink_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_BIRCH_SLAB = registerBlock("cherry_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_SLAB = registerBlock("golden_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Fences
    public static final Block WHITE_FENCE = registerBlock("white_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_FENCE = registerBlock("light_gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_FENCE = registerBlock("gray_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_FENCE = registerBlock("black_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_FENCE = registerBlock("brown_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_FENCE = registerBlock("red_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_FENCE = registerBlock("orange_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_FENCE = registerBlock("yellow_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_FENCE = registerBlock("lime_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_FENCE = registerBlock("green_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_FENCE = registerBlock("cyan_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_FENCE = registerBlock("light_blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_FENCE = registerBlock("blue_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_FENCE = registerBlock("purple_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_FENCE = registerBlock("magenta_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_FENCE = registerBlock("pink_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_BIRCH_FENCE = registerBlock("cherry_birch_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_FENCE = registerBlock("golden_birch_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Fence Gates
    public static final Block WHITE_FENCE_GATE = registerBlock("white_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_GRAY_FENCE_GATE = registerBlock("light_gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GRAY_FENCE_GATE = registerBlock("gray_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLACK_FENCE_GATE = registerBlock("black_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BROWN_FENCE_GATE = registerBlock("brown_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block RED_FENCE_GATE = registerBlock("red_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block ORANGE_FENCE_GATE = registerBlock("orange_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block YELLOW_FENCE_GATE = registerBlock("yellow_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIME_FENCE_GATE = registerBlock("lime_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GREEN_FENCE_GATE = registerBlock("green_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CYAN_FENCE_GATE = registerBlock("cyan_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LIGHT_BLUE_FENCE_GATE = registerBlock("light_blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLUE_FENCE_GATE = registerBlock("blue_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PURPLE_FENCE_GATE = registerBlock("purple_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAGENTA_FENCE_GATE = registerBlock("magenta_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PINK_FENCE_GATE = registerBlock("pink_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block CHERRY_BIRCH_FENCE_GATE = registerBlock("cherry_birch_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block GOLDEN_BIRCH_FENCE_GATE = registerBlock("golden_birch_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Leaves
    public static final Block CHERRY_BIRCH_LEAVES = registerBlock("cherry_birch_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.CHERRY_LEAVES, properties
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final Block GOLDEN_BIRCH_LEAVES = registerBlock("golden_birch_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.CHERRY_LEAVES, properties
                    .mapColor(MapColor.GOLD)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    //Logs
    public static final Block CHERRY_BIRCH_LOG = registerBlock("cherry_birch_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_CHERRY_BIRCH_LOG = registerBlock("stripped_cherry_birch_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GOLDEN_BIRCH_LOG = registerBlock("golden_birch_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_GOLDEN_BIRCH_LOG = registerBlock("stripped_golden_birch_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //Woods
    public static final Block CHERRY_BIRCH_WOOD = registerBlock("cherry_birch_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block STRIPPED_CHERRY_BIRCH_WOOD = registerBlock("stripped_cherry_birch_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block GOLDEN_BIRCH_WOOD = registerBlock("golden_birch_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block STRIPPED_GOLDEN_BIRCH_WOOD = registerBlock("stripped_golden_birch_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));

    //Saplings
    public static final Block CHERRY_BIRCH_SAPLING = registerBlock("cherry_birch_sapling",
            properties -> new SaplingBlock(TBSSaplingGenerators.CHERRY_BIRCH, properties.mapColor(MapColor.PINK)
                    .noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GOLDEN_BIRCH_SAPLING = registerBlock("golden_birch_sapling",
            properties -> new SaplingBlock(TBSSaplingGenerators.GOLDEN_BIRCH, properties.mapColor(MapColor.GOLD)
                    .noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING).pistonBehavior(PistonBehavior.DESTROY)));

    //Shelves [NEEDS WORK]
    //public static final Block SHELFSHELF = registerBlock("shelfshelf",
            //properties -> new ShelfBlock(properties.mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASS)
                    //.strength(2.0F, 3.0F).sounds(BlockSoundGroup.SHELF).burnable()));
    //public static final Block SHELFSHELF = registerBlock("shelfshelf",
            //properties -> new ShelfBlock(properties.mapColor(MapColor.BLUE)
                    //.instrument(NoteBlockInstrument.BASS).sounds(BlockSoundGroup.SHELF).burnable().strength(2.0F, 3.0F)));

    //public static final Block SHELFSHELF = register("shelfshelf",
            //ShelfBlock::new,
            //AbstractBlock.Settings.create()
                    //.mapColor(BLUE_PLANKS.getDefaultMapColor())
                    //.instrument(NoteBlockInstrument.BASS)
                    //.sounds(BlockSoundGroup.SHELF)
                    //.burnable()
                    //.strength(2.0F, 3.0F));

    //Blocks
    public static final Block DIAMARITE_BLOCK = registerBlock("diamarite_block",
            properties -> new Block(properties.mapColor(MapColor.BLACK).requiresTool()
                    .strength(50.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block CORRUPTIONITE_BLOCK = registerBlock("corruptionite_block",
            properties -> new Block(properties.mapColor(MapColor.BLACK).requiresTool()
                    .strength(50.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block BYZANTIUM_BLOCK = registerBlock("byzantium_block",
            properties -> new Block(properties.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL)
                    .requiresTool().strength(4.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_BYZANTIUM_BLOCK = registerBlock("raw_byzantium_block",
            properties -> new Block(properties.mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(5.0F, 6.0F)));
    public static final Block BYZANTIUM_ORE = registerBlock("byzantium_ore",
            properties -> new Block(properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(3.0F, 3.0F)));
    public static final Block DEEPSLATE_BYZANTIUM_ORE = registerBlock("deepslate_byzantium_ore",
            properties -> new Block(properties.mapColor(MapColor.DEEPSLATE_GRAY).requiresTool()
                    .strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block DIAMARITE_CORE = registerBlock("diamarite_core",
            properties -> new HeavyCoreBlock(properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.SNARE)
                    .sounds(BlockSoundGroup.HEAVY_CORE).strength(10.0F).pistonBehavior(PistonBehavior.NORMAL).resistance(1200.0F)));

    public static final Block GILDED_NETHERITE_BLOCK = registerBlock("gilded_netherite_block",
            properties -> new Block(properties.mapColor(MapColor.BLACK).requiresTool()
                    .strength(50.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block GOLDEN_DEBRIS = registerBlock("golden_debris",
            properties -> new Block(properties.mapColor(MapColor.GOLD).requiresTool()
                    .strength(30.0F, 1200.0F).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block ENERGY_BLOCK = registerBlock("energy_block",
            properties -> new Block(properties.mapColor(MapColor.DIAMOND_BLUE).requiresTool()
                    .strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)));

    //Extra
    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TBS.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(TBS.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(TBS.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TBS.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TBS.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TBS.MOD_ID, name)))));
    }

    //private static Block register(String id,
                                  //Function<AbstractBlock.Settings, Block> factory,
                                  //AbstractBlock.Settings settings) {
        //RegistryKey<Block> key = RegistryKey.of(
                //RegistryKeys.BLOCK,
                //Identifier.of(TBS.MOD_ID, id)
        //);

        //return Registry.register(
                //Registries.BLOCK,
                //Identifier.of(TBS.MOD_ID, id),
                //factory.apply(settings.registryKey(key))
        //);
    //}

    public static void registerBlocks() {
        TBS.LOGGER.info("Registering Mod Blocks for " + TBS.MOD_ID);

        //Creative Tabs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(TBSBlocks.CHERRY_BIRCH_LEAVES);
            entries.add(TBSBlocks.CHERRY_BIRCH_SAPLING);
            entries.add(TBSBlocks.GOLDEN_BIRCH_LEAVES);
            entries.add(TBSBlocks.GOLDEN_BIRCH_SAPLING);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PLANKS_TEMPLATE);
            entries.add(WHITE_PLANKS);
            entries.add(WHITE_STAIRS);
            entries.add(WHITE_SLAB);
            entries.add(WHITE_FENCE);
            entries.add(WHITE_FENCE_GATE);
            entries.add(WHITE_DOOR);
            entries.add(WHITE_TRAPDOOR);
            entries.add(WHITE_PRESSURE_PLATE);
            entries.add(WHITE_BUTTON);
            entries.add(LIGHT_GRAY_PLANKS);
            entries.add(LIGHT_GRAY_STAIRS);
            entries.add(LIGHT_GRAY_SLAB);
            entries.add(LIGHT_GRAY_FENCE);
            entries.add(LIGHT_GRAY_FENCE_GATE);
            entries.add(LIGHT_GRAY_DOOR);
            entries.add(LIGHT_GRAY_TRAPDOOR);
            entries.add(LIGHT_GRAY_PRESSURE_PLATE);
            entries.add(LIGHT_GRAY_BUTTON);
            entries.add(GRAY_PLANKS);
            entries.add(GRAY_STAIRS);
            entries.add(GRAY_SLAB);
            entries.add(GRAY_FENCE);
            entries.add(GRAY_FENCE_GATE);
            entries.add(GRAY_DOOR);
            entries.add(GRAY_TRAPDOOR);
            entries.add(GRAY_PRESSURE_PLATE);
            entries.add(GRAY_BUTTON);
            entries.add(BLACK_PLANKS);
            entries.add(BLACK_STAIRS);
            entries.add(BLACK_SLAB);
            entries.add(BLACK_FENCE);
            entries.add(BLACK_FENCE_GATE);
            entries.add(BLACK_DOOR);
            entries.add(BLACK_TRAPDOOR);
            entries.add(BLACK_PRESSURE_PLATE);
            entries.add(BLACK_BUTTON);
            entries.add(BROWN_PLANKS);
            entries.add(BROWN_STAIRS);
            entries.add(BROWN_SLAB);
            entries.add(BROWN_FENCE);
            entries.add(BROWN_FENCE_GATE);
            entries.add(BROWN_DOOR);
            entries.add(BROWN_TRAPDOOR);
            entries.add(BROWN_PRESSURE_PLATE);
            entries.add(BROWN_BUTTON);
            entries.add(RED_PLANKS);
            entries.add(RED_STAIRS);
            entries.add(RED_SLAB);
            entries.add(RED_FENCE);
            entries.add(RED_FENCE_GATE);
            entries.add(RED_DOOR);
            entries.add(RED_TRAPDOOR);
            entries.add(RED_PRESSURE_PLATE);
            entries.add(RED_BUTTON);
            entries.add(ORANGE_PLANKS);
            entries.add(ORANGE_STAIRS);
            entries.add(ORANGE_SLAB);
            entries.add(ORANGE_FENCE);
            entries.add(ORANGE_FENCE_GATE);
            entries.add(ORANGE_DOOR);
            entries.add(ORANGE_TRAPDOOR);
            entries.add(ORANGE_PRESSURE_PLATE);
            entries.add(ORANGE_BUTTON);
            entries.add(YELLOW_PLANKS);
            entries.add(YELLOW_STAIRS);
            entries.add(YELLOW_SLAB);
            entries.add(YELLOW_FENCE);
            entries.add(YELLOW_FENCE_GATE);
            entries.add(YELLOW_DOOR);
            entries.add(YELLOW_TRAPDOOR);
            entries.add(YELLOW_PRESSURE_PLATE);
            entries.add(YELLOW_BUTTON);
            entries.add(LIME_PLANKS);
            entries.add(LIME_STAIRS);
            entries.add(LIME_SLAB);
            entries.add(LIME_FENCE);
            entries.add(LIME_FENCE_GATE);
            entries.add(LIME_DOOR);
            entries.add(LIME_TRAPDOOR);
            entries.add(LIME_PRESSURE_PLATE);
            entries.add(LIME_BUTTON);
            entries.add(GREEN_PLANKS);
            entries.add(GREEN_STAIRS);
            entries.add(GREEN_SLAB);
            entries.add(GREEN_FENCE);
            entries.add(GREEN_FENCE_GATE);
            entries.add(GREEN_DOOR);
            entries.add(GREEN_TRAPDOOR);
            entries.add(GREEN_PRESSURE_PLATE);
            entries.add(GREEN_BUTTON);
            entries.add(CYAN_PLANKS);
            entries.add(CYAN_STAIRS);
            entries.add(CYAN_SLAB);
            entries.add(CYAN_FENCE);
            entries.add(CYAN_FENCE_GATE);
            entries.add(CYAN_DOOR);
            entries.add(CYAN_TRAPDOOR);
            entries.add(CYAN_PRESSURE_PLATE);
            entries.add(CYAN_BUTTON);
            entries.add(LIGHT_BLUE_PLANKS);
            entries.add(LIGHT_BLUE_STAIRS);
            entries.add(LIGHT_BLUE_SLAB);
            entries.add(LIGHT_BLUE_FENCE);
            entries.add(LIGHT_BLUE_FENCE_GATE);
            entries.add(LIGHT_BLUE_DOOR);
            entries.add(LIGHT_BLUE_TRAPDOOR);
            entries.add(LIGHT_BLUE_PRESSURE_PLATE);
            entries.add(LIGHT_BLUE_BUTTON);
            entries.add(BLUE_PLANKS);
            entries.add(BLUE_STAIRS);
            entries.add(BLUE_SLAB);
            entries.add(BLUE_FENCE);
            entries.add(BLUE_FENCE_GATE);
            entries.add(BLUE_DOOR);
            entries.add(BLUE_TRAPDOOR);
            entries.add(BLUE_PRESSURE_PLATE);
            entries.add(BLUE_BUTTON);
            entries.add(PURPLE_PLANKS);
            entries.add(PURPLE_STAIRS);
            entries.add(PURPLE_SLAB);
            entries.add(PURPLE_FENCE);
            entries.add(PURPLE_FENCE_GATE);
            entries.add(PURPLE_DOOR);
            entries.add(PURPLE_TRAPDOOR);
            entries.add(PURPLE_PRESSURE_PLATE);
            entries.add(PURPLE_BUTTON);
            entries.add(MAGENTA_PLANKS);
            entries.add(MAGENTA_STAIRS);
            entries.add(MAGENTA_SLAB);
            entries.add(MAGENTA_FENCE);
            entries.add(MAGENTA_FENCE_GATE);
            entries.add(MAGENTA_DOOR);
            entries.add(MAGENTA_TRAPDOOR);
            entries.add(MAGENTA_PRESSURE_PLATE);
            entries.add(MAGENTA_BUTTON);
            entries.add(PINK_PLANKS);
            entries.add(PINK_STAIRS);
            entries.add(PINK_SLAB);
            entries.add(PINK_FENCE);
            entries.add(PINK_FENCE_GATE);
            entries.add(PINK_DOOR);
            entries.add(PINK_TRAPDOOR);
            entries.add(PINK_PRESSURE_PLATE);
            entries.add(PINK_BUTTON);
            entries.add(DARK_OAK_DOOR_WITH_WINDOWS);
            entries.add(DARK_OAK_TRAPDOOR_WITH_WINDOWS);
            entries.add(STONE_DOOR);
            entries.add(STONE_TRAPDOOR);
            entries.add(BEDROCK_DOOR);
            entries.add(BEDROCK_TRAPDOOR);
            entries.add(OBSIDIAN_DOOR);
            entries.add(OBSIDIAN_TRAPDOOR);
            entries.add(CHERRY_BIRCH_PLANKS);
            entries.add(CHERRY_BIRCH_STAIRS);
            entries.add(CHERRY_BIRCH_SLAB);
            entries.add(CHERRY_BIRCH_FENCE);
            entries.add(CHERRY_BIRCH_FENCE_GATE);
            entries.add(CHERRY_BIRCH_DOOR);
            entries.add(CHERRY_BIRCH_TRAPDOOR);
            entries.add(CHERRY_BIRCH_PRESSURE_PLATE);
            entries.add(CHERRY_BIRCH_BUTTON);
            entries.add(GOLDEN_BIRCH_PLANKS);
            entries.add(GOLDEN_BIRCH_STAIRS);
            entries.add(GOLDEN_BIRCH_SLAB);
            entries.add(GOLDEN_BIRCH_FENCE);
            entries.add(GOLDEN_BIRCH_FENCE_GATE);
            entries.add(GOLDEN_BIRCH_DOOR);
            entries.add(GOLDEN_BIRCH_TRAPDOOR);
            entries.add(GOLDEN_BIRCH_PRESSURE_PLATE);
            entries.add(GOLDEN_BIRCH_BUTTON);
        });
    }
}
