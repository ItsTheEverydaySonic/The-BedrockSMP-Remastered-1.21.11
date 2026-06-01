package net.itskittyyoutube.kitty.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.material.TBSArmorMaterials;
import net.itskittyyoutube.kitty.material.TBSToolMaterials;
import net.itskittyyoutube.kitty.sounds.TBSJukeboxSongs;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.type.WeaponComponent;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TBSItems {
    //Music Discs
    public static final Item MUSIC_DISC_TEMPLATE = registerItem("music_disc_template",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TEMPLATE).maxCount(4)));
    public static final Item MUSIC_DISC_THE_TALE_OF_TOOTHLESS = registerItem("music_disc_the_tale_of_toothless",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TOOTHLESS).maxCount(1)));
    public static final Item MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerItem("music_disc_bye_justin_hi_justin",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.JUSTIN).maxCount(1)));
    public static final Item MUSIC_DISC_STEVE_LAVA_CHICKEN = registerItem("music_disc_steve_lava_chicken",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.STEVE).maxCount(1)));
    public static final Item MUSIC_DISC_LAVA_TEARSSTEP = registerItem("music_disc_lava_tearsstep",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TEARSSTEP).maxCount(1)));
    public static final Item MUSIC_DISC_TERRIFYING_TEARS = registerItem("music_disc_terrifying_tears",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TERRIFYING).maxCount(1)));
    public static final Item MUSIC_DISC_BETTERSIDE = registerItem("music_disc_betterside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.BETTERSIDE).maxCount(1)));
    public static final Item MUSIC_DISC_12 = registerItem("music_disc_12",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TWELVE).maxCount(1)));
    public static final Item MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerItem("music_disc_bye_justin_hi_justin_remastered",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.REMASTERED).maxCount(1)));
    public static final Item MUSIC_DISC_EXPLORER = registerItem("music_disc_explorer",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.EXPLORER).maxCount(1)));
    public static final Item ALREADY_AHEAD = registerItem("music_disc_already_ahead",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.ALREADY).maxCount(1)));
    public static final Item DARK_INSIDE = registerItem("music_disc_dark_inside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.DARK).maxCount(1)));

    //REVERSED
    public static final Item MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS = registerItem("music_disc_reversed_the_tale_of_toothless",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TOOTHLESS2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerItem("music_disc_reversed_bye_justin_hi_justin",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.JUSTIN2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN = registerItem("music_disc_reversed_steve_lava_chicken",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.STEVE2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_LAVA_TEARSSTEP = registerItem("music_disc_reversed_lava_tearsstep",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TEARSSTEP2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_TERRIFYING_TEARS = registerItem("music_disc_reversed_terrifying_tears",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TERRIFYING2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_BETTERSIDE = registerItem("music_disc_reversed_betterside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.BETTERSIDE2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_12 = registerItem("music_disc_reversed_12",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.TWELVE2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerItem("music_disc_reversed_bye_justin_hi_justin_remastered",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.REMASTERED2).maxCount(1)));
    public static final Item MUSIC_DISC_REVERSED_EXPLORER = registerItem("music_disc_reversed_explorer",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.EXPLORER2).maxCount(1)));
    public static final Item REVERSED_ALREADY_AHEAD = registerItem("music_disc_reversed_already_ahead",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.ALREADY2).maxCount(1)));
    public static final Item REVERSED_DARK_INSIDE = registerItem("music_disc_reversed_dark_inside",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.DARK2).maxCount(1)));

    //PANCAKES
    public static final Item PANCAKE = registerItem("pancake",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.PANCAKE).maxCount(64).rarity(Rarity.EPIC)));
    public static final Item WAFFLE = registerItem("waffle",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.WAFFLE).maxCount(64).rarity(Rarity.EPIC)));
    public static final Item REVERSED_PANCAKE = registerItem("reversed_pancake",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.PANCAKE2).maxCount(64).rarity(Rarity.EPIC)));
    public static final Item REVERSED_WAFFLE = registerItem("reversed_waffle",
            setting -> new Item(setting.jukeboxPlayable(TBSJukeboxSongs.WAFFLE2).maxCount(64).rarity(Rarity.EPIC)));

    //Items
    public static final Item BEDROCKSMP_ICON = registerItem("bedrocksmp_icon",
            settings -> new Item(settings.rarity(Rarity.EPIC).maxCount(64).fireproof()));
    public static final Item BIG_STICK = registerItem("big_stick",
            settings -> new Item(settings.maxCount(64)));
    public static final Item CURSED_EMERALD = registerItem("cursed_emerald",
            settings -> new Item(settings.rarity(Rarity.EPIC).maxCount(1)));
    public static final Item YOUTUBE_LOGO = registerItem("youtube_logo",
            settings -> new Item(settings.maxCount(64)));
    public static final Item SILVER_PLAY_BUTTON = registerItem("silver_play_button",
            settings -> new Item(settings.maxCount(64)));
    public static final Item GOLDEN_PLAY_BUTTON = registerItem("golden_play_button",
            settings -> new Item(settings.maxCount(64)));
    public static final Item DIAMOND_PLAY_BUTTON = registerItem("diamond_play_button",
            settings -> new Item(settings.maxCount(64)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item STEEL_ROD = registerItem("steel_rod",
            settings -> new Item(settings.maxCount(64)));
    public static final Item REINFORCED_PAPER = registerItem("reinforced_paper",
            settings -> new Item(settings.maxCount(64).fireproof()));
    public static final Item MONEY = registerItem("money",
            settings -> new Item(settings.maxCount(64)));
    public static final Item NETHERITE_ROD = registerItem("netherite_rod",
            settings -> new Item(settings.maxCount(64).fireproof()));
    public static final Item DIAMARITE_INGOT = registerItem("diamarite_ingot",
            settings -> new Item(settings.maxCount(64).fireproof()));
    public static final Item CORRUPTIONITE_INGOT = registerItem("corruptionite_ingot",
            settings -> new Item(settings.maxCount(64).fireproof()));
    public static final Item DIAMOND_INGOT = registerItem("diamond_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item CHARD_INGOT = registerItem("chard_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item DIAMARITE = registerItem("diamarite",
            settings -> new Item(settings.maxCount(64).fireproof()));
    public static final Item BURNT_INGOT = registerItem("burnt_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item BYZANTIUM_INGOT = registerItem("byzantium_ingot",
            settings -> new Item(settings.maxCount(64).rarity(Rarity.EPIC)));
    public static final Item BYZANTIUM_NUGGET = registerItem("byzantium_nugget",
            settings -> new Item(settings.maxCount(64).rarity(Rarity.EPIC)));
    public static final Item RAW_BYZANTIUM = registerItem("raw_byzantium",
            settings -> new Item(settings.maxCount(64).rarity(Rarity.EPIC)));

    public static final Item HANDLE = registerItem("handle",
            settings -> new Item(settings.maxCount(64)));
    public static final Item NETHERITE_HANDLE = registerItem("netherite_handle",
            settings -> new Item(settings.maxCount(64).fireproof()));
    public static final Item STEEL_HANDLE = registerItem("steel_handle",
            settings -> new Item(settings.maxCount(64)));

    public static final Item GILDED_NETHERITE_INGOT = registerItem("gilded_netherite_ingot",
            settings -> new Item(settings.maxCount(64).fireproof()));

    public static final Item GOLDEN_SCRAP = registerItem("golden_scrap",
            settings -> new Item(settings.maxCount(64).fireproof()));

    public static final Item DUCT_TAPE = registerItem("duct_tape",
            settings -> new Item(settings.maxCount(64)));

    //Tools
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL_EQUIPMENT, 3.0F, -2.4F)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            setting -> new ShovelItem(TBSToolMaterials.STEEL_EQUIPMENT, 1.5F, -3.0F, setting));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.STEEL_EQUIPMENT, 1.0F, -2.8F)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            setting -> new AxeItem(TBSToolMaterials.STEEL_EQUIPMENT, 6.0F, -3.1F, setting));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            setting -> new HoeItem(TBSToolMaterials.STEEL_EQUIPMENT, -2.0F, -1.0F, setting));
    public static final Item KATARA_KNIFE = registerItem("katara_knife",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL_EQUIPMENT, 2.0F, -2.4F)));
    public static final Item DIAMARITE_SWORD = registerItem("diamarite_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 3.0F, -2.4F).fireproof()));
    public static final Item DIAMARITE_SHOVEL = registerItem("diamarite_shovel",
            setting -> new ShovelItem(TBSToolMaterials.NETHERITE_EQUIPMENT, 1.5F, -3.0F, setting.fireproof()));
    public static final Item DIAMARITE_PICKAXE = registerItem("diamarite_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.NETHERITE_EQUIPMENT, 1.0F, -2.8F).fireproof()));
    public static final Item DIAMARITE_AXE = registerItem("diamarite_axe",
            setting -> new AxeItem(TBSToolMaterials.NETHERITE_EQUIPMENT, 5.0F, -3.0F, setting.fireproof()));
    public static final Item DIAMARITE_HOE = registerItem("diamarite_hoe",
            setting -> new HoeItem(TBSToolMaterials.NETHERITE_EQUIPMENT, -4.0F, 0.0F, setting.fireproof()));
    public static final Item CORRUPTIONITE_SWORD = registerItem("corruptionite_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 3.0F, -2.4F).fireproof()));
    public static final Item CORRUPTIONITE_SHOVEL = registerItem("corruptionite_shovel",
            setting -> new ShovelItem(TBSToolMaterials.NETHERITE_EQUIPMENT, 1.5F, -3.0F, setting.fireproof()));
    public static final Item CORRUPTIONITE_PICKAXE = registerItem("corruptionite_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.NETHERITE_EQUIPMENT, 1.0F, -2.8F).fireproof()));
    public static final Item CORRUPTIONITE_AXE = registerItem("corruptionite_axe",
            setting -> new AxeItem(TBSToolMaterials.NETHERITE_EQUIPMENT, 5.0F, -3.0F, setting.fireproof()));
    public static final Item CORRUPTIONITE_HOE = registerItem("corruptionite_hoe",
            setting -> new HoeItem(TBSToolMaterials.NETHERITE_EQUIPMENT, -4.0F, 0.0F, setting.fireproof()));
    public static final Item BYZANTIUM_SWORD = registerItem("byzantium_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 3.0F, -2.4F)));
    public static final Item BYZANTIUM_SHOVEL = registerItem("byzantium_shovel",
            setting -> new ShovelItem(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 1.5F, -3.0F, setting));
    public static final Item BYZANTIUM_PICKAXE = registerItem("byzantium_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 1.0F, -2.8F)));
    public static final Item BYZANTIUM_AXE = registerItem("byzantium_axe",
            setting -> new AxeItem(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 6.0F, -3.1F, setting));
    public static final Item BYZANTIUM_HOE = registerItem("byzantium_hoe",
            setting -> new HoeItem(TBSToolMaterials.BYZANTIUM_EQUIPMENT, -2.0F, -1.0F, setting));
    public static final Item GILDED_NETHERITE_SWORD = registerItem("gilded_netherite_sword",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 3.0F, -2.4F).fireproof()));
    public static final Item GILDED_NETHERITE_SHOVEL = registerItem("gilded_netherite_shovel",
            setting -> new ShovelItem(TBSToolMaterials.NETHERITE_EQUIPMENT, 1.5F, -3.0F, setting.fireproof()));
    public static final Item GILDED_NETHERITE_PICKAXE = registerItem("gilded_netherite_pickaxe",
            setting -> new Item(setting.pickaxe(TBSToolMaterials.NETHERITE_EQUIPMENT, 1.0F, -2.8F).fireproof()));
    public static final Item GILDED_NETHERITE_AXE = registerItem("gilded_netherite_axe",
            setting -> new AxeItem(TBSToolMaterials.NETHERITE_EQUIPMENT, 5.0F, -3.0F, setting.fireproof()));
    public static final Item GILDED_NETHERITE_HOE = registerItem("gilded_netherite_hoe",
            setting -> new HoeItem(TBSToolMaterials.NETHERITE_EQUIPMENT, -4.0F, 0.0F, setting.fireproof()));

    //Armor
    public static final Item DIAMARITE_HELMET = registerItem("diamarite_helmet",
            setting -> new Item(setting.armor(TBSArmorMaterials.DIAMARITE, EquipmentType.HELMET).fireproof()));
    public static final Item DIAMARITE_CHESTPLATE = registerItem("diamarite_chestplate",
            setting -> new Item(setting.armor(TBSArmorMaterials.DIAMARITE, EquipmentType.CHESTPLATE).fireproof()));
    public static final Item DIAMARITE_LEGGINGS = registerItem("diamarite_leggings",
            setting -> new Item(setting.armor(TBSArmorMaterials.DIAMARITE, EquipmentType.LEGGINGS).fireproof()));
    public static final Item DIAMARITE_BOOTS = registerItem("diamarite_boots",
            setting -> new Item(setting.armor(TBSArmorMaterials.DIAMARITE, EquipmentType.BOOTS).fireproof()));
    public static final Item CORRUPTIONITE_HELMET = registerItem("corruptionite_helmet",
            setting -> new Item(setting.armor(TBSArmorMaterials.CORRUPTIONITE, EquipmentType.HELMET).fireproof()));
    public static final Item CORRUPTIONITE_CHESTPLATE = registerItem("corruptionite_chestplate",
            setting -> new Item(setting.armor(TBSArmorMaterials.CORRUPTIONITE, EquipmentType.CHESTPLATE).fireproof()));
    public static final Item CORRUPTIONITE_LEGGINGS = registerItem("corruptionite_leggings",
            setting -> new Item(setting.armor(TBSArmorMaterials.CORRUPTIONITE, EquipmentType.LEGGINGS).fireproof()));
    public static final Item CORRUPTIONITE_BOOTS = registerItem("corruptionite_boots",
            setting -> new Item(setting.armor(TBSArmorMaterials.CORRUPTIONITE, EquipmentType.BOOTS).fireproof()));
    public static final Item BYZANTIUM_HELMET = registerItem("byzantium_helmet",
            setting -> new Item(setting.armor(TBSArmorMaterials.BYZANTIUM, EquipmentType.HELMET)));
    public static final Item BYZANTIUM_CHESTPLATE = registerItem("byzantium_chestplate",
            setting -> new Item(setting.armor(TBSArmorMaterials.BYZANTIUM, EquipmentType.CHESTPLATE)));
    public static final Item BYZANTIUM_LEGGINGS = registerItem("byzantium_leggings",
            setting -> new Item(setting.armor(TBSArmorMaterials.BYZANTIUM, EquipmentType.LEGGINGS)));
    public static final Item BYZANTIUM_BOOTS = registerItem("byzantium_boots",
            setting -> new Item(setting.armor(TBSArmorMaterials.BYZANTIUM, EquipmentType.BOOTS)));
    public static final Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
            setting -> new Item(setting.armor(TBSArmorMaterials.GILDED_NETHERITE, EquipmentType.HELMET).fireproof()));
    public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
            setting -> new Item(setting.armor(TBSArmorMaterials.GILDED_NETHERITE, EquipmentType.CHESTPLATE).fireproof()));
    public static final Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
            setting -> new Item(setting.armor(TBSArmorMaterials.GILDED_NETHERITE, EquipmentType.LEGGINGS).fireproof()));
    public static final Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
            setting -> new Item(setting.armor(TBSArmorMaterials.GILDED_NETHERITE, EquipmentType.BOOTS).fireproof()));

    //Dagger
    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 2.0F, -2.4F)));
    public static final Item COPPER_DAGGER = registerItem("copper_dagger",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 2.0F, -2.4F)));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 2.0F, -2.4F)));
    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 2.0F, -2.4F)));
    public static final Item BYZANTIUM_DAGGER = registerItem("byzantium_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 2.0F, -2.4F)));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 2.0F, -2.4F)));
    public static final Item STEEL_DAGGER = registerItem("steel_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL_EQUIPMENT, 2.0F, -2.4F)));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 2.0F, -2.4F)));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 2.0F, -2.4F).fireproof()));
    public static final Item DIAMARITE_DAGGER = registerItem("diamarite_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 2.0F, -2.4F).fireproof()));
    public static final Item CORRUPTIONITE_DAGGER = registerItem("corruptionite_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 2.0F, -2.4F).fireproof()));
    public static final Item GILDED_NETHERITE_DAGGER = registerItem("gilded_netherite_dagger",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 2.0F, -2.4F).fireproof()));


    //public static final Item CORRUPTIONITE_DAGGER = registerItem("corruptionite_dagger",
            //setting -> new TridentItem(setting.maxDamage(250).attributeModifiers(TridentItem.createAttributeModifiers())
                    //.component(DataComponentTypes.TOOL, TridentItem.createToolComponent())
                    //.enchantable(1).component(DataComponentTypes.WEAPON, new WeaponComponent(1)).sword(TBSToolMaterials.NETHERITE_EQUIPMENT,
                            //2.0F, -2.4F)));

    //Sickle
    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 1.65F, -1.5F)));
    public static final Item COPPER_SICKLE = registerItem("copper_sickle",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 2.5F, -1.5F)));
    public static final Item STONE_SICKLE = registerItem("stone_sickle",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 2.25F, -1.5F)));
    public static final Item GOLDEN_SICKLE = registerItem("golden_sickle",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 1.65F, -1.5F)));
    public static final Item BYZANTIUM_SICKLE = registerItem("byzantium_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 2.85F, -1.5F)));
    public static final Item IRON_SICKLE = registerItem("iron_sickle",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 2.85F, -1.5F)));
    public static final Item STEEL_SICKLE = registerItem("steel_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL_EQUIPMENT, 2.85F, -1.5F)));
    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 3.45F, -1.5F)));
    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 4.0F, -1.5F).fireproof()));
    public static final Item DIAMARITE_SICKLE = registerItem("diamarite_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 4.0F, -1.5F).fireproof()));
    public static final Item CORRUPTIONITE_SICKLE = registerItem("corruptionite_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 4.0F, -1.5F).fireproof()));
    public static final Item GILDED_NETHERITE_SICKLE = registerItem("gilded_netherite_sickle",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 4.0F, -1.5F).fireproof()));

    //Katana
    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 3.15F, -2.0F)));
    public static final Item COPPER_KATANA = registerItem("copper_katana",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 4.75F, -2.0F)));
    public static final Item STONE_KATANA = registerItem("stone_katana",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 4.2F, -2.0F)));
    public static final Item GOLDEN_KATANA = registerItem("golden_katana",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 3.15F, -2.0F)));
    public static final Item BYZANTIUM_KATANA = registerItem("byzantium_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 5.25F, -2.0F)));
    public static final Item IRON_KATANA = registerItem("iron_katana",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 5.25F, -2.0F)));
    public static final Item STEEL_KATANA = registerItem("steel_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL_EQUIPMENT, 5.25F, -2.0F)));
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 6.3F, -2.0F)));
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 7.35F, -2.0F).fireproof()));
    public static final Item DIAMARITE_KATANA = registerItem("diamarite_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 7.35F, -2.0F).fireproof()));
    public static final Item CORRUPTIONITE_KATANA = registerItem("corruptionite_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 7.35F, -2.0F).fireproof()));
    public static final Item GILDED_NETHERITE_KATANA = registerItem("gilded_netherite_katana",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 7.35F, -2.0F).fireproof()));

    //Scythe
    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe",
            setting -> new Item(setting.sword(ToolMaterial.WOOD, 11.0F, -3.3F)));
    public static final Item COPPER_SCYTHE = registerItem("copper_scythe",
            setting -> new Item(setting.sword(ToolMaterial.COPPER, 15.5F, -3.3F)));
    public static final Item STONE_SCYTHE = registerItem("stone_scythe",
            setting -> new Item(setting.sword(ToolMaterial.STONE, 14.0F, -3.3F)));
    public static final Item GOLDEN_SCYTHE = registerItem("golden_scythe",
            setting -> new Item(setting.sword(ToolMaterial.GOLD, 11.0F, -3.3F)));
    public static final Item BYZANTIUM_SCYTHE = registerItem("byzantium_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.BYZANTIUM_EQUIPMENT, 17.0F, -3.3F)));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe",
            setting -> new Item(setting.sword(ToolMaterial.IRON, 17.0F, -3.3F)));
    public static final Item STEEL_SCYTHE = registerItem("steel_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.STEEL_EQUIPMENT, 17.0F, -3.3F)));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe",
            setting -> new Item(setting.sword(ToolMaterial.DIAMOND, 20.0F, -3.3F)));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe",
            setting -> new Item(setting.sword(ToolMaterial.NETHERITE, 23.0F, -3.3F).fireproof()));
    public static final Item DIAMARITE_SCYTHE = registerItem("diamarite_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 23.0F, -3.3F).fireproof()));
    public static final Item CORRUPTIONITE_SCYTHE = registerItem("corruptionite_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 23.0F, -3.3F).fireproof()));
    public static final Item GILDED_NETHERITE_SCYTHE = registerItem("gilded_netherite_scythe",
            setting -> new Item(setting.sword(TBSToolMaterials.NETHERITE_EQUIPMENT, 23.0F, -3.3F).fireproof()));

    //Spear
    public static final Item STEEL_SPEAR = registerItem("steel_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.STEEL_EQUIPMENT,
                    0.95F, 0.95F, 0.6F, 2.5F,
                    8.0F, 6.75F, 5.1F, 11.25F, 4.6F)));
    public static final Item BYZANTIUM_SPEAR = registerItem("byzantium_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.BYZANTIUM_EQUIPMENT,
                    0.95F, 0.95F, 0.6F, 2.5F,
                    8.0F, 6.75F, 5.1F, 11.25F, 4.6F)));
    public static final Item DIAMARITE_SPEAR = registerItem("diamarite_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.NETHERITE_EQUIPMENT,
                    1.15F, 1.2F, 0.4F, 2.5F,
                    7.0F, 5.5F, 5.1F, 8.75F, 4.6F).fireproof()));
    public static final Item CORRUPTIONITE_SPEAR = registerItem("corruptionite_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.NETHERITE_EQUIPMENT,
                    1.15F, 1.2F, 0.4F, 2.5F,
                    7.0F, 5.5F, 5.1F, 8.75F, 4.6F).fireproof()));
    public static final Item GILDED_NETHERITE_SPEAR = registerItem("gilded_netherite_spear",
            setting -> new Item(setting.spear(TBSToolMaterials.NETHERITE_EQUIPMENT,
                    1.15F, 1.2F, 0.4F, 2.5F,
                    7.0F, 5.5F, 5.1F, 8.75F, 4.6F).fireproof()));

    //Mace
    public static final Item DIAMARITE_MACE = registerItem("diamarite_mace",
            setting -> new MaceItem(setting.rarity(Rarity.EPIC).maxDamage(500)
                    .component(DataComponentTypes.TOOL, MaceItem.createToolComponent())
                    .repairable(DIAMARITE).attributeModifiers(MaceItem.createAttributeModifiers())
                    .enchantable(15).component(DataComponentTypes.WEAPON, new WeaponComponent(1)).fireproof().rarity(Rarity.EPIC)));

    public static final Item DOUBLED_MACE = registerItem("doubled_mace",
            setting -> new MaceItem(setting.rarity(Rarity.EPIC).maxDamage(500)
                    .component(DataComponentTypes.TOOL, MaceItem.createToolComponent())
                    .repairable(DIAMARITE_MACE).attributeModifiers(MaceItem.createAttributeModifiers())
                    .enchantable(15).component(DataComponentTypes.WEAPON, new WeaponComponent(1)).fireproof().rarity(Rarity.EPIC)));

    //Shelves
    //public static final Item SHELFSHELF = register(
            //TBSBlocks.SHELFSHELF, (UnaryOperator<Item.Settings>)(settings -> settings.component(DataComponentTypes.CONTAINER, ContainerComponent.DEFAULT)));

    //Extra
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TBS.MOD_ID, name), item);
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(TBS.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TBS.MOD_ID, name)))));
    }

    //public static Item register(Block block, UnaryOperator<Item.Settings> settingsOperator) {
        //Identifier blockId = Registries.BLOCK.getId(block);
        //Identifier itemId = Identifier.of(TBS.MOD_ID, blockId.getPath());

        //RegistryKey<Item> itemKey = RegistryKey.of(
                //RegistryKeys.ITEM,
                //itemId
        //);

        //Item item = new BlockItem(
                //block,
                //settingsOperator.apply(
                        //new Item.Settings().registryKey(itemKey)
                //)
        //);

        //return Registry.register(Registries.ITEM, itemId, item);
    //}

    public static void registerItems() {
        TBS.LOGGER.info("Registering Items for " + TBS.MOD_ID);

        //Creative Tabs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addBefore(Items.MUSIC_DISC_13, TBSItems.MUSIC_DISC_TEMPLATE);
            entries.addAfter(Items.MUSIC_DISC_LAVA_CHICKEN, TBSItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS);
            entries.addAfter(TBSItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
            entries.addAfter(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, TBSItems.MUSIC_DISC_STEVE_LAVA_CHICKEN);
            entries.addAfter(TBSItems.MUSIC_DISC_STEVE_LAVA_CHICKEN, TBSItems.MUSIC_DISC_LAVA_TEARSSTEP);
            entries.addAfter(TBSItems.MUSIC_DISC_LAVA_TEARSSTEP, TBSItems.MUSIC_DISC_TERRIFYING_TEARS);
            entries.addAfter(TBSItems.MUSIC_DISC_TERRIFYING_TEARS, TBSItems.MUSIC_DISC_BETTERSIDE);
            entries.addAfter(TBSItems.MUSIC_DISC_BETTERSIDE, TBSItems.MUSIC_DISC_12);
            entries.addAfter(TBSItems.MUSIC_DISC_12, TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED);
            entries.addAfter(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, TBSItems.MUSIC_DISC_EXPLORER);
            entries.addAfter(TBSItems.MUSIC_DISC_EXPLORER, TBSItems.ALREADY_AHEAD);
            entries.addAfter(TBSItems.ALREADY_AHEAD, TBSItems.DARK_INSIDE);
            entries.addAfter(TBSItems.DARK_INSIDE, TBSItems.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS, TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP, TBSItems.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN, TBSItems.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP, TBSItems.MUSIC_DISC_REVERSED_TERRIFYING_TEARS);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_TERRIFYING_TEARS, TBSItems.MUSIC_DISC_REVERSED_BETTERSIDE);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_BETTERSIDE, TBSItems.MUSIC_DISC_REVERSED_12);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_12, TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, TBSItems.MUSIC_DISC_REVERSED_EXPLORER);
            entries.addAfter(TBSItems.MUSIC_DISC_REVERSED_EXPLORER, TBSItems.REVERSED_ALREADY_AHEAD);
            entries.addAfter(TBSItems.REVERSED_ALREADY_AHEAD, TBSItems.REVERSED_DARK_INSIDE);
            entries.addAfter(TBSItems.REVERSED_DARK_INSIDE, TBSItems.PANCAKE);
            entries.addAfter(TBSItems.PANCAKE, TBSItems.WAFFLE);
            entries.addAfter(TBSItems.WAFFLE, TBSItems.REVERSED_PANCAKE);
            entries.addAfter(TBSItems.REVERSED_PANCAKE, TBSItems.REVERSED_WAFFLE);
            entries.addAfter(Items.IRON_HOE, TBSItems.STEEL_SHOVEL);
            entries.addAfter(TBSItems.STEEL_SHOVEL, TBSItems.STEEL_PICKAXE);
            entries.addAfter(TBSItems.STEEL_PICKAXE, TBSItems.STEEL_AXE);
            entries.addAfter(TBSItems.STEEL_AXE, TBSItems.STEEL_HOE);
            entries.addAfter(Items.GOLDEN_HOE, TBSItems.BYZANTIUM_SHOVEL);
            entries.addAfter(TBSItems.BYZANTIUM_SHOVEL, TBSItems.BYZANTIUM_PICKAXE);
            entries.addAfter(TBSItems.BYZANTIUM_PICKAXE, TBSItems.BYZANTIUM_AXE);
            entries.addAfter(TBSItems.BYZANTIUM_AXE, TBSItems.BYZANTIUM_HOE);
            entries.addAfter(Items.NETHERITE_HOE, TBSItems.GILDED_NETHERITE_SHOVEL);
            entries.addAfter(TBSItems.GILDED_NETHERITE_SHOVEL, TBSItems.GILDED_NETHERITE_PICKAXE);
            entries.addAfter(TBSItems.GILDED_NETHERITE_PICKAXE, TBSItems.GILDED_NETHERITE_AXE);
            entries.addAfter(TBSItems.GILDED_NETHERITE_AXE, TBSItems.GILDED_NETHERITE_HOE);
            entries.addAfter(TBSItems.GILDED_NETHERITE_HOE, TBSItems.DIAMARITE_SHOVEL);
            entries.addAfter(TBSItems.DIAMARITE_SHOVEL, TBSItems.DIAMARITE_PICKAXE);
            entries.addAfter(TBSItems.DIAMARITE_PICKAXE, TBSItems.DIAMARITE_AXE);
            entries.addAfter(TBSItems.DIAMARITE_AXE, TBSItems.DIAMARITE_HOE);
            entries.addAfter(TBSItems.DIAMARITE_HOE, TBSItems.CORRUPTIONITE_SHOVEL);
            entries.addAfter(TBSItems.CORRUPTIONITE_SHOVEL, TBSItems.CORRUPTIONITE_PICKAXE);
            entries.addAfter(TBSItems.CORRUPTIONITE_PICKAXE, TBSItems.CORRUPTIONITE_AXE);
            entries.addAfter(TBSItems.CORRUPTIONITE_AXE, TBSItems.CORRUPTIONITE_HOE);
            entries.addAfter(Items.MAP, TBSItems.MONEY);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.STICK, TBSItems.HANDLE);
            entries.addAfter(TBSItems.HANDLE, TBSItems.STEEL_HANDLE);
            entries.addAfter(TBSItems.STEEL_HANDLE, TBSItems.NETHERITE_HANDLE);
            entries.addAfter(TBSItems.NETHERITE_HANDLE, TBSItems.BIG_STICK);
            entries.addAfter(TBSItems.BIG_STICK, TBSItems.STEEL_ROD);
            entries.addAfter(TBSItems.STEEL_ROD, TBSItems.NETHERITE_ROD);
            entries.addAfter(Items.EMERALD, TBSItems.CURSED_EMERALD);
            entries.addAfter(Items.IRON_INGOT, TBSItems.STEEL_INGOT);
            entries.addAfter(Items.NETHERITE_INGOT, TBSItems.GILDED_NETHERITE_INGOT);
            entries.addAfter(TBSItems.GILDED_NETHERITE_INGOT, TBSItems.DIAMARITE_INGOT);
            entries.addAfter(TBSItems.DIAMARITE_INGOT, TBSItems.CORRUPTIONITE_INGOT);
            entries.addAfter(Items.DIAMOND, TBSItems.DIAMARITE);
            entries.addAfter(Items.GOLD_INGOT, TBSItems.BYZANTIUM_INGOT);
            entries.addAfter(TBSItems.BYZANTIUM_INGOT, TBSItems.DIAMOND_INGOT);
            entries.addAfter(Items.COPPER_INGOT, TBSItems.AMETHYST_INGOT);
            entries.addAfter(Items.PAPER, TBSItems.REINFORCED_PAPER);
            entries.addAfter(TBSItems.REINFORCED_PAPER, TBSItems.DUCT_TAPE);
            entries.addAfter(Items.NETHERITE_SCRAP, TBSItems.GOLDEN_SCRAP);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.WOODEN_SWORD, TBSItems.WOODEN_KATANA);
            entries.addAfter(TBSItems.WOODEN_KATANA, TBSItems.WOODEN_SICKLE);
            entries.addAfter(TBSItems.WOODEN_SICKLE, TBSItems.WOODEN_SCYTHE);
            entries.addAfter(TBSItems.WOODEN_SCYTHE, TBSItems.WOODEN_DAGGER);
            entries.addAfter(Items.STONE_SWORD, TBSItems.STONE_KATANA);
            entries.addAfter(TBSItems.STONE_KATANA, TBSItems.STONE_SICKLE);
            entries.addAfter(TBSItems.STONE_SICKLE, TBSItems.STONE_SCYTHE);
            entries.addAfter(TBSItems.STONE_SCYTHE, TBSItems.STONE_DAGGER);
            entries.addAfter(Items.COPPER_SWORD, TBSItems.COPPER_KATANA);
            entries.addAfter(TBSItems.COPPER_KATANA, TBSItems.COPPER_SICKLE);
            entries.addAfter(TBSItems.COPPER_SICKLE, TBSItems.COPPER_SCYTHE);
            entries.addAfter(TBSItems.COPPER_SCYTHE, TBSItems.COPPER_DAGGER);
            entries.addAfter(Items.IRON_SWORD, TBSItems.IRON_KATANA);
            entries.addAfter(TBSItems.IRON_KATANA, TBSItems.IRON_SICKLE);
            entries.addAfter(TBSItems.IRON_SICKLE, TBSItems.IRON_SCYTHE);
            entries.addAfter(TBSItems.IRON_SCYTHE, TBSItems.IRON_DAGGER);
            entries.addAfter(TBSItems.IRON_DAGGER, TBSItems.STEEL_SWORD);
            entries.addAfter(TBSItems.STEEL_SWORD, TBSItems.STEEL_KATANA);
            entries.addAfter(TBSItems.STEEL_KATANA, TBSItems.STEEL_SICKLE);
            entries.addAfter(TBSItems.STEEL_SICKLE, TBSItems.STEEL_SCYTHE);
            entries.addAfter(TBSItems.STEEL_SCYTHE, TBSItems.STEEL_DAGGER);
            entries.addAfter(TBSItems.STEEL_DAGGER, TBSItems.KATARA_KNIFE);
            entries.addAfter(Items.GOLDEN_SWORD, TBSItems.GOLDEN_KATANA);
            entries.addAfter(TBSItems.GOLDEN_KATANA, TBSItems.GOLDEN_SICKLE);
            entries.addAfter(TBSItems.GOLDEN_SICKLE, TBSItems.GOLDEN_SCYTHE);
            entries.addAfter(TBSItems.GOLDEN_SCYTHE, TBSItems.GOLDEN_DAGGER);
            entries.addAfter(TBSItems.GOLDEN_DAGGER, TBSItems.BYZANTIUM_SWORD);
            entries.addAfter(TBSItems.BYZANTIUM_SWORD, TBSItems.BYZANTIUM_KATANA);
            entries.addAfter(TBSItems.BYZANTIUM_KATANA, TBSItems.BYZANTIUM_SICKLE);
            entries.addAfter(TBSItems.BYZANTIUM_SICKLE, TBSItems.BYZANTIUM_SCYTHE);
            entries.addAfter(TBSItems.BYZANTIUM_SCYTHE, TBSItems.BYZANTIUM_DAGGER);
            entries.addAfter(Items.DIAMOND_SWORD, TBSItems.DIAMOND_KATANA);
            entries.addAfter(TBSItems.DIAMOND_KATANA, TBSItems.DIAMOND_SICKLE);
            entries.addAfter(TBSItems.DIAMOND_SICKLE, TBSItems.DIAMOND_SCYTHE);
            entries.addAfter(TBSItems.DIAMOND_SCYTHE, TBSItems.DIAMOND_DAGGER);
            entries.addAfter(Items.NETHERITE_SWORD, TBSItems.NETHERITE_KATANA);
            entries.addAfter(TBSItems.NETHERITE_KATANA, TBSItems.NETHERITE_SICKLE);
            entries.addAfter(TBSItems.NETHERITE_SICKLE, TBSItems.NETHERITE_SCYTHE);
            entries.addAfter(TBSItems.NETHERITE_SCYTHE, TBSItems.NETHERITE_DAGGER);
            entries.addAfter(TBSItems.NETHERITE_DAGGER, TBSItems.GILDED_NETHERITE_SWORD);
            entries.addAfter(TBSItems.GILDED_NETHERITE_SWORD, TBSItems.GILDED_NETHERITE_KATANA);
            entries.addAfter(TBSItems.GILDED_NETHERITE_KATANA, TBSItems.GILDED_NETHERITE_SICKLE);
            entries.addAfter(TBSItems.GILDED_NETHERITE_SICKLE, TBSItems.GILDED_NETHERITE_SCYTHE);
            entries.addAfter(TBSItems.GILDED_NETHERITE_SCYTHE, TBSItems.GILDED_NETHERITE_DAGGER);
            entries.addAfter(TBSItems.GILDED_NETHERITE_DAGGER, TBSItems.DIAMARITE_SWORD);
            entries.addAfter(TBSItems.DIAMARITE_SWORD, TBSItems.DIAMARITE_KATANA);
            entries.addAfter(TBSItems.DIAMARITE_KATANA, TBSItems.DIAMARITE_SICKLE);
            entries.addAfter(TBSItems.DIAMARITE_SICKLE, TBSItems.DIAMARITE_SCYTHE);
            entries.addAfter(TBSItems.DIAMARITE_SCYTHE, TBSItems.DIAMARITE_DAGGER);
            entries.addAfter(TBSItems.DIAMARITE_DAGGER, TBSItems.CORRUPTIONITE_SWORD);
            entries.addAfter(TBSItems.CORRUPTIONITE_SWORD, TBSItems.CORRUPTIONITE_KATANA);
            entries.addAfter(TBSItems.CORRUPTIONITE_KATANA, TBSItems.CORRUPTIONITE_SICKLE);
            entries.addAfter(TBSItems.CORRUPTIONITE_SICKLE, TBSItems.CORRUPTIONITE_SCYTHE);
            entries.addAfter(TBSItems.CORRUPTIONITE_SCYTHE, TBSItems.CORRUPTIONITE_DAGGER);
            entries.addAfter(Items.IRON_AXE, TBSItems.STEEL_AXE);
            entries.addAfter(Items.GOLDEN_AXE, TBSItems.BYZANTIUM_AXE);
            entries.addAfter(Items.NETHERITE_AXE, TBSItems.GILDED_NETHERITE_AXE);
            entries.addAfter(TBSItems.GILDED_NETHERITE_AXE, TBSItems.DIAMARITE_AXE);
            entries.addAfter(TBSItems.DIAMARITE_AXE, TBSItems.CORRUPTIONITE_AXE);
            entries.addAfter(Items.IRON_SPEAR, TBSItems.STEEL_SPEAR);
            entries.addAfter(Items.GOLDEN_SPEAR, TBSItems.BYZANTIUM_SPEAR);
            entries.addAfter(Items.NETHERITE_SPEAR, TBSItems.GILDED_NETHERITE_SPEAR);
            entries.addAfter(TBSItems.GILDED_NETHERITE_SPEAR, TBSItems.DIAMARITE_SPEAR);
            entries.addAfter(TBSItems.DIAMARITE_SPEAR, TBSItems.CORRUPTIONITE_SPEAR);
            entries.addAfter(Items.GOLDEN_BOOTS, TBSItems.BYZANTIUM_HELMET);
            entries.addAfter(TBSItems.BYZANTIUM_HELMET, TBSItems.BYZANTIUM_CHESTPLATE);
            entries.addAfter(TBSItems.BYZANTIUM_CHESTPLATE, TBSItems.BYZANTIUM_LEGGINGS);
            entries.addAfter(TBSItems.BYZANTIUM_LEGGINGS, TBSItems.BYZANTIUM_BOOTS);
            entries.addAfter(Items.NETHERITE_BOOTS, TBSItems.GILDED_NETHERITE_HELMET);
            entries.addAfter(TBSItems.GILDED_NETHERITE_HELMET, TBSItems.GILDED_NETHERITE_CHESTPLATE);
            entries.addAfter(TBSItems.GILDED_NETHERITE_CHESTPLATE, TBSItems.GILDED_NETHERITE_LEGGINGS);
            entries.addAfter(TBSItems.GILDED_NETHERITE_LEGGINGS, TBSItems.GILDED_NETHERITE_BOOTS);
            entries.addAfter(TBSItems.GILDED_NETHERITE_BOOTS, TBSItems.DIAMARITE_HELMET);
            entries.addAfter(TBSItems.DIAMARITE_HELMET, TBSItems.DIAMARITE_CHESTPLATE);
            entries.addAfter(TBSItems.DIAMARITE_CHESTPLATE, TBSItems.DIAMARITE_LEGGINGS);
            entries.addAfter(TBSItems.DIAMARITE_LEGGINGS, TBSItems.DIAMARITE_BOOTS);
            entries.addAfter(TBSItems.DIAMARITE_BOOTS, TBSItems.CORRUPTIONITE_HELMET);
            entries.addAfter(TBSItems.CORRUPTIONITE_HELMET, TBSItems.CORRUPTIONITE_CHESTPLATE);
            entries.addAfter(TBSItems.CORRUPTIONITE_CHESTPLATE, TBSItems.CORRUPTIONITE_LEGGINGS);
            entries.addAfter(TBSItems.CORRUPTIONITE_LEGGINGS, TBSItems.CORRUPTIONITE_BOOTS);
            entries.addAfter(Items.MACE, TBSItems.DIAMARITE_MACE);
        });
    }
}
