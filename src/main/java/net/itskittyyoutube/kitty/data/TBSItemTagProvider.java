package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.item.TBSItems;
import net.itskittyyoutube.kitty.util.TBSItemTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class TBSItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public TBSItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .add(TBSBlocks.CHERRY_BIRCH_LOG.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_WOOD.asItem())
                .add(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG.asItem())
                .add(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_LOG.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_WOOD.asItem())
                .add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG.asItem())
                .add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD.asItem());

        valueLookupBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(Items.COBBLESTONE)
                .add(Items.BLACKSTONE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.ANDESITE)
                .add(Items.BASALT)
                .add(Items.DIORITE)
                .add(Items.GRANITE)
                .add(Items.TUFF)
                .add(Items.STONE)
                .add(Items.DEEPSLATE)
                .add(Items.END_STONE)
                .add(Items.NETHERRACK)
                .add(Items.SANDSTONE)
                .add(Items.RED_SANDSTONE)
                .add(Items.PRISMARINE)
                .add(Items.BRICKS)
                .add(Items.MUD_BRICKS)
                .add(Items.CALCITE)
                .add(Items.SMOOTH_BASALT);

        valueLookupBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(Items.COBBLESTONE)
                .add(Items.BLACKSTONE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.ANDESITE)
                .add(Items.BASALT)
                .add(Items.DIORITE)
                .add(Items.GRANITE)
                .add(Items.TUFF)
                .add(Items.STONE)
                .add(Items.DEEPSLATE)
                .add(Items.END_STONE)
                .add(Items.NETHERRACK)
                .add(Items.SANDSTONE)
                .add(Items.RED_SANDSTONE)
                .add(Items.PRISMARINE)
                .add(Items.BRICKS)
                .add(Items.MUD_BRICKS)
                .add(Items.CALCITE)
                .add(Items.SMOOTH_BASALT);

        valueLookupBuilder(ItemTags.PLANKS)
                .add(TBSBlocks.PLANKS_TEMPLATE.asItem())
                .add(TBSBlocks.WHITE_PLANKS.asItem())
                .add(TBSBlocks.LIGHT_GRAY_PLANKS.asItem())
                .add(TBSBlocks.GRAY_PLANKS.asItem())
                .add(TBSBlocks.BLACK_PLANKS.asItem())
                .add(TBSBlocks.BROWN_PLANKS.asItem())
                .add(TBSBlocks.RED_PLANKS.asItem())
                .add(TBSBlocks.ORANGE_PLANKS.asItem())
                .add(TBSBlocks.YELLOW_PLANKS.asItem())
                .add(TBSBlocks.LIME_PLANKS.asItem())
                .add(TBSBlocks.GREEN_PLANKS.asItem())
                .add(TBSBlocks.CYAN_PLANKS.asItem())
                .add(TBSBlocks.LIGHT_BLUE_PLANKS.asItem())
                .add(TBSBlocks.BLUE_PLANKS.asItem())
                .add(TBSBlocks.PURPLE_PLANKS.asItem())
                .add(TBSBlocks.MAGENTA_PLANKS.asItem())
                .add(TBSBlocks.PINK_PLANKS.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_PLANKS.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_PLANKS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(TBSBlocks.WHITE_FENCE.asItem())
                .add(TBSBlocks.LIGHT_GRAY_FENCE.asItem())
                .add(TBSBlocks.GRAY_FENCE.asItem())
                .add(TBSBlocks.BLACK_FENCE.asItem())
                .add(TBSBlocks.BROWN_FENCE.asItem())
                .add(TBSBlocks.RED_FENCE.asItem())
                .add(TBSBlocks.ORANGE_FENCE.asItem())
                .add(TBSBlocks.YELLOW_FENCE.asItem())
                .add(TBSBlocks.LIME_FENCE.asItem())
                .add(TBSBlocks.GREEN_FENCE.asItem())
                .add(TBSBlocks.CYAN_FENCE.asItem())
                .add(TBSBlocks.LIGHT_BLUE_FENCE.asItem())
                .add(TBSBlocks.BLUE_FENCE.asItem())
                .add(TBSBlocks.PURPLE_FENCE.asItem())
                .add(TBSBlocks.MAGENTA_FENCE.asItem())
                .add(TBSBlocks.PINK_FENCE.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_FENCE.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_FENCE.asItem());

        valueLookupBuilder(ItemTags.FENCE_GATES)
                .add(TBSBlocks.WHITE_FENCE_GATE.asItem())
                .add(TBSBlocks.LIGHT_GRAY_FENCE_GATE.asItem())
                .add(TBSBlocks.GRAY_FENCE_GATE.asItem())
                .add(TBSBlocks.BLACK_FENCE_GATE.asItem())
                .add(TBSBlocks.BROWN_FENCE_GATE.asItem())
                .add(TBSBlocks.RED_FENCE_GATE.asItem())
                .add(TBSBlocks.ORANGE_FENCE_GATE.asItem())
                .add(TBSBlocks.YELLOW_FENCE_GATE.asItem())
                .add(TBSBlocks.LIME_FENCE_GATE.asItem())
                .add(TBSBlocks.GREEN_FENCE_GATE.asItem())
                .add(TBSBlocks.CYAN_FENCE_GATE.asItem())
                .add(TBSBlocks.LIGHT_BLUE_FENCE_GATE.asItem())
                .add(TBSBlocks.BLUE_FENCE_GATE.asItem())
                .add(TBSBlocks.PURPLE_FENCE_GATE.asItem())
                .add(TBSBlocks.MAGENTA_FENCE_GATE.asItem())
                .add(TBSBlocks.PINK_FENCE_GATE.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_FENCE_GATE.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_FENCE_GATE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(TBSBlocks.WHITE_DOOR.asItem())
                .add(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS.asItem())
                .add(TBSBlocks.LIGHT_GRAY_DOOR.asItem())
                .add(TBSBlocks.GRAY_DOOR.asItem())
                .add(TBSBlocks.BLACK_DOOR.asItem())
                .add(TBSBlocks.BROWN_DOOR.asItem())
                .add(TBSBlocks.RED_DOOR.asItem())
                .add(TBSBlocks.ORANGE_DOOR.asItem())
                .add(TBSBlocks.YELLOW_DOOR.asItem())
                .add(TBSBlocks.LIME_DOOR.asItem())
                .add(TBSBlocks.GREEN_DOOR.asItem())
                .add(TBSBlocks.CYAN_DOOR.asItem())
                .add(TBSBlocks.LIGHT_BLUE_DOOR.asItem())
                .add(TBSBlocks.BLUE_DOOR.asItem())
                .add(TBSBlocks.PURPLE_DOOR.asItem())
                .add(TBSBlocks.MAGENTA_DOOR.asItem())
                .add(TBSBlocks.PINK_DOOR.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_DOOR.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_DOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(TBSBlocks.WHITE_TRAPDOOR.asItem())
                .add(TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS.asItem())
                .add(TBSBlocks.LIGHT_GRAY_TRAPDOOR.asItem())
                .add(TBSBlocks.GRAY_TRAPDOOR.asItem())
                .add(TBSBlocks.BLACK_TRAPDOOR.asItem())
                .add(TBSBlocks.BROWN_TRAPDOOR.asItem())
                .add(TBSBlocks.RED_TRAPDOOR.asItem())
                .add(TBSBlocks.ORANGE_TRAPDOOR.asItem())
                .add(TBSBlocks.YELLOW_TRAPDOOR.asItem())
                .add(TBSBlocks.LIME_TRAPDOOR.asItem())
                .add(TBSBlocks.GREEN_TRAPDOOR.asItem())
                .add(TBSBlocks.CYAN_TRAPDOOR.asItem())
                .add(TBSBlocks.LIGHT_BLUE_TRAPDOOR.asItem())
                .add(TBSBlocks.BLUE_TRAPDOOR.asItem())
                .add(TBSBlocks.PURPLE_TRAPDOOR.asItem())
                .add(TBSBlocks.MAGENTA_TRAPDOOR.asItem())
                .add(TBSBlocks.PINK_TRAPDOOR.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_TRAPDOOR.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                .add(TBSBlocks.WHITE_BUTTON.asItem())
                .add(TBSBlocks.LIGHT_GRAY_BUTTON.asItem())
                .add(TBSBlocks.GRAY_BUTTON.asItem())
                .add(TBSBlocks.BLACK_BUTTON.asItem())
                .add(TBSBlocks.BROWN_BUTTON.asItem())
                .add(TBSBlocks.RED_BUTTON.asItem())
                .add(TBSBlocks.ORANGE_BUTTON.asItem())
                .add(TBSBlocks.YELLOW_BUTTON.asItem())
                .add(TBSBlocks.LIME_BUTTON.asItem())
                .add(TBSBlocks.GREEN_BUTTON.asItem())
                .add(TBSBlocks.CYAN_BUTTON.asItem())
                .add(TBSBlocks.LIGHT_BLUE_BUTTON.asItem())
                .add(TBSBlocks.BLUE_BUTTON.asItem())
                .add(TBSBlocks.PURPLE_BUTTON.asItem())
                .add(TBSBlocks.MAGENTA_BUTTON.asItem())
                .add(TBSBlocks.PINK_BUTTON.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_BUTTON.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_BUTTON.asItem());

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(TBSBlocks.WHITE_SLAB.asItem())
                .add(TBSBlocks.LIGHT_GRAY_SLAB.asItem())
                .add(TBSBlocks.GRAY_SLAB.asItem())
                .add(TBSBlocks.BLACK_SLAB.asItem())
                .add(TBSBlocks.BROWN_SLAB.asItem())
                .add(TBSBlocks.RED_SLAB.asItem())
                .add(TBSBlocks.ORANGE_SLAB.asItem())
                .add(TBSBlocks.YELLOW_SLAB.asItem())
                .add(TBSBlocks.LIME_SLAB.asItem())
                .add(TBSBlocks.GREEN_SLAB.asItem())
                .add(TBSBlocks.CYAN_SLAB.asItem())
                .add(TBSBlocks.LIGHT_BLUE_SLAB.asItem())
                .add(TBSBlocks.BLUE_SLAB.asItem())
                .add(TBSBlocks.PURPLE_SLAB.asItem())
                .add(TBSBlocks.MAGENTA_SLAB.asItem())
                .add(TBSBlocks.PINK_SLAB.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_SLAB.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_SLAB.asItem());

        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(TBSBlocks.WHITE_STAIRS.asItem())
                .add(TBSBlocks.LIGHT_GRAY_STAIRS.asItem())
                .add(TBSBlocks.GRAY_STAIRS.asItem())
                .add(TBSBlocks.BLACK_STAIRS.asItem())
                .add(TBSBlocks.BROWN_STAIRS.asItem())
                .add(TBSBlocks.RED_STAIRS.asItem())
                .add(TBSBlocks.ORANGE_STAIRS.asItem())
                .add(TBSBlocks.YELLOW_STAIRS.asItem())
                .add(TBSBlocks.LIME_STAIRS.asItem())
                .add(TBSBlocks.GREEN_STAIRS.asItem())
                .add(TBSBlocks.CYAN_STAIRS.asItem())
                .add(TBSBlocks.LIGHT_BLUE_STAIRS.asItem())
                .add(TBSBlocks.BLUE_STAIRS.asItem())
                .add(TBSBlocks.PURPLE_STAIRS.asItem())
                .add(TBSBlocks.MAGENTA_STAIRS.asItem())
                .add(TBSBlocks.PINK_STAIRS.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_STAIRS.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_STAIRS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(TBSBlocks.WHITE_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.LIGHT_GRAY_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.GRAY_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.BLACK_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.BROWN_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.RED_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.ORANGE_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.YELLOW_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.LIME_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.GREEN_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.CYAN_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.LIGHT_BLUE_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.BLUE_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.PURPLE_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.MAGENTA_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.PINK_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_PRESSURE_PLATE.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_PRESSURE_PLATE.asItem());

        valueLookupBuilder(ItemTags.DOORS)
                .add(TBSBlocks.STONE_DOOR.asItem())
                .add(TBSBlocks.BEDROCK_DOOR.asItem())
                .add(TBSBlocks.OBSIDIAN_DOOR.asItem());

        valueLookupBuilder(ItemTags.TRAPDOORS)
                .add(TBSBlocks.STONE_TRAPDOOR.asItem())
                .add(TBSBlocks.BEDROCK_TRAPDOOR.asItem())
                .add(TBSBlocks.OBSIDIAN_TRAPDOOR.asItem());

        valueLookupBuilder(TBSItemTags.CHERRY_BIRCH_LOGS)
                .add(TBSBlocks.CHERRY_BIRCH_LOG.asItem())
                .add(TBSBlocks.CHERRY_BIRCH_WOOD.asItem())
                .add(TBSBlocks.STRIPPED_CHERRY_BIRCH_LOG.asItem())
                .add(TBSBlocks.STRIPPED_CHERRY_BIRCH_WOOD.asItem());

        valueLookupBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(TBSItems.MUSIC_DISC_TEMPLATE)
                .add(TBSItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS)
                .add(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP)
                .add(TBSItems.MUSIC_DISC_STEVE_LAVA_CHICKEN)
                .add(TBSItems.MUSIC_DISC_LAVA_TEARSSTEP)
                .add(TBSItems.MUSIC_DISC_12)
                .add(TBSItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED)
                .add(TBSItems.MUSIC_DISC_EXPLORER)
                .add(TBSItems.ALREADY_AHEAD)
                .add(TBSItems.DARK_INSIDE)
                .add(TBSItems.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS)
                .add(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP)
                .add(TBSItems.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN)
                .add(TBSItems.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP)
                .add(TBSItems.MUSIC_DISC_REVERSED_12)
                .add(TBSItems.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED)
                .add(TBSItems.MUSIC_DISC_REVERSED_EXPLORER)
                .add(TBSItems.REVERSED_ALREADY_AHEAD)
                .add(TBSItems.REVERSED_DARK_INSIDE)

                .add(TBSItems.PANCAKE)
                .add(TBSItems.WAFFLE)
                .add(TBSItems.REVERSED_PANCAKE)
                .add(TBSItems.REVERSED_WAFFLE);

        valueLookupBuilder(TBSItemTags.HEADS)
                .add(Items.PLAYER_HEAD)
                .add(Items.ZOMBIE_HEAD)
                .add(Items.CREEPER_HEAD)
                .add(Items.PIGLIN_HEAD)
                .add(Items.DRAGON_HEAD);

        valueLookupBuilder(TBSItemTags.STEEL_EQUIPMENT_REPAIR)
                .add(TBSItems.STEEL_INGOT)
                .add(Items.IRON_INGOT)
                .add(Items.GOLD_INGOT);

        valueLookupBuilder(ItemTags.SWORDS)
                .add(TBSItems.STEEL_SWORD)
                .add(TBSItems.DIAMARITE_SWORD)
                .add(TBSItems.CORRUPTIONITE_SWORD)
                .add(TBSItems.KATARA_KNIFE)
                .add(TBSItems.BYZANTIUM_SWORD)
                .add(TBSItems.GILDED_NETHERITE_SWORD)
                .add(TBSItems.ENERGY_SWORD)

                .add(TBSItems.WOODEN_DAGGER)
                .add(TBSItems.COPPER_DAGGER)
                .add(TBSItems.STONE_DAGGER)
                .add(TBSItems.GOLDEN_DAGGER)
                .add(TBSItems.BYZANTIUM_DAGGER)
                .add(TBSItems.IRON_DAGGER)
                .add(TBSItems.STEEL_DAGGER)
                .add(TBSItems.DIAMOND_DAGGER)
                .add(TBSItems.NETHERITE_DAGGER)
                .add(TBSItems.DIAMARITE_DAGGER)
                .add(TBSItems.CORRUPTIONITE_DAGGER)
                .add(TBSItems.GILDED_NETHERITE_DAGGER)
                .add(TBSItems.ENERGY_DAGGER)

                .add(TBSItems.WOODEN_SICKLE)
                .add(TBSItems.COPPER_SICKLE)
                .add(TBSItems.STONE_SICKLE)
                .add(TBSItems.GOLDEN_SICKLE)
                .add(TBSItems.BYZANTIUM_SICKLE)
                .add(TBSItems.IRON_SICKLE)
                .add(TBSItems.STEEL_SICKLE)
                .add(TBSItems.DIAMOND_SICKLE)
                .add(TBSItems.NETHERITE_SICKLE)
                .add(TBSItems.DIAMARITE_SICKLE)
                .add(TBSItems.CORRUPTIONITE_SICKLE)
                .add(TBSItems.GILDED_NETHERITE_SICKLE)
                .add(TBSItems.ENERGY_SICKLE)

                .add(TBSItems.WOODEN_KATANA)
                .add(TBSItems.COPPER_KATANA)
                .add(TBSItems.STONE_KATANA)
                .add(TBSItems.GOLDEN_KATANA)
                .add(TBSItems.BYZANTIUM_KATANA)
                .add(TBSItems.IRON_KATANA)
                .add(TBSItems.STEEL_KATANA)
                .add(TBSItems.DIAMOND_KATANA)
                .add(TBSItems.NETHERITE_KATANA)
                .add(TBSItems.DIAMARITE_KATANA)
                .add(TBSItems.CORRUPTIONITE_KATANA)
                .add(TBSItems.GILDED_NETHERITE_KATANA)
                .add(TBSItems.ENERGY_KATANA)

                .add(TBSItems.WOODEN_SCYTHE)
                .add(TBSItems.COPPER_SCYTHE)
                .add(TBSItems.STONE_SCYTHE)
                .add(TBSItems.GOLDEN_SCYTHE)
                .add(TBSItems.BYZANTIUM_SCYTHE)
                .add(TBSItems.IRON_SCYTHE)
                .add(TBSItems.STEEL_SCYTHE)
                .add(TBSItems.DIAMOND_SCYTHE)
                .add(TBSItems.NETHERITE_SCYTHE)
                .add(TBSItems.DIAMARITE_SCYTHE)
                .add(TBSItems.CORRUPTIONITE_SCYTHE)
                .add(TBSItems.GILDED_NETHERITE_SCYTHE)
                .add(TBSItems.ENERGY_SCYTHE);

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(TBSItems.STEEL_SHOVEL)
                .add(TBSItems.DIAMARITE_SHOVEL)
                .add(TBSItems.CORRUPTIONITE_SHOVEL)
                .add(TBSItems.BYZANTIUM_SHOVEL)
                .add(TBSItems.GILDED_NETHERITE_SHOVEL)
                .add(TBSItems.ENERGY_SHOVEL);

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(TBSItems.STEEL_PICKAXE)
                .add(TBSItems.DIAMARITE_PICKAXE)
                .add(TBSItems.CORRUPTIONITE_PICKAXE)
                .add(TBSItems.BYZANTIUM_PICKAXE)
                .add(TBSItems.GILDED_NETHERITE_PICKAXE)
                .add(TBSItems.ENERGY_PICKAXE);

        valueLookupBuilder(ItemTags.AXES)
                .add(TBSItems.STEEL_AXE)
                .add(TBSItems.DIAMARITE_AXE)
                .add(TBSItems.CORRUPTIONITE_AXE)
                .add(TBSItems.BYZANTIUM_AXE)
                .add(TBSItems.GILDED_NETHERITE_AXE)
                .add(TBSItems.ENERGY_AXE);

        valueLookupBuilder(ItemTags.HOES)
                .add(TBSItems.STEEL_HOE)
                .add(TBSItems.DIAMARITE_HOE)
                .add(TBSItems.CORRUPTIONITE_HOE)
                .add(TBSItems.BYZANTIUM_HOE)
                .add(TBSItems.GILDED_NETHERITE_HOE)
                .add(TBSItems.ENERGY_HOE);

        valueLookupBuilder(ItemTags.TRIM_MATERIALS)
                .add(TBSItems.STEEL_INGOT);

        valueLookupBuilder(TBSItemTags.NETHERITE_EQUIPMENT_REPAIR)
                .add(Items.DIAMOND)
                .add(Items.NETHERITE_INGOT)
                .add(TBSItems.DIAMARITE_INGOT)
                .add(TBSItems.CORRUPTIONITE_INGOT)
                .add(TBSItems.DIAMOND_INGOT)
                .add(TBSItems.DIAMARITE)
                .add(TBSItems.GILDED_NETHERITE_INGOT);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(TBSItems.DIAMARITE_HELMET)
                .add(TBSItems.DIAMARITE_CHESTPLATE)
                .add(TBSItems.DIAMARITE_LEGGINGS)
                .add(TBSItems.DIAMARITE_BOOTS)
                .add(TBSItems.CORRUPTIONITE_HELMET)
                .add(TBSItems.CORRUPTIONITE_CHESTPLATE)
                .add(TBSItems.CORRUPTIONITE_LEGGINGS)
                .add(TBSItems.CORRUPTIONITE_BOOTS)

                .add(TBSItems.BYZANTIUM_HELMET)
                .add(TBSItems.BYZANTIUM_CHESTPLATE)
                .add(TBSItems.BYZANTIUM_LEGGINGS)
                .add(TBSItems.BYZANTIUM_BOOTS)

                .add(TBSItems.GILDED_NETHERITE_HELMET)
                .add(TBSItems.GILDED_NETHERITE_CHESTPLATE)
                .add(TBSItems.GILDED_NETHERITE_LEGGINGS)
                .add(TBSItems.GILDED_NETHERITE_BOOTS)

                .add(TBSItems.ENERGY_HELMET)
                .add(TBSItems.ENERGY_CHESTPLATE)
                .add(TBSItems.ENERGY_LEGGINGS)
                .add(TBSItems.ENERGY_BOOTS)

                .add(TBSItems.DREADITE_HELMET)
                .add(TBSItems.DREADITE_CHESTPLATE)
                .add(TBSItems.DREADITE_LEGGINGS)
                .add(TBSItems.DREADITE_BOOTS);

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(TBSItems.DIAMARITE_HELMET)
                .add(TBSItems.CORRUPTIONITE_HELMET)
                .add(TBSItems.BYZANTIUM_HELMET)
                .add(TBSItems.GILDED_NETHERITE_HELMET)
                .add(TBSItems.ENERGY_HELMET)
                .add(TBSItems.DREADITE_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(TBSItems.DIAMARITE_CHESTPLATE)
                .add(TBSItems.CORRUPTIONITE_CHESTPLATE)
                .add(TBSItems.BYZANTIUM_CHESTPLATE)
                .add(TBSItems.GILDED_NETHERITE_CHESTPLATE)
                .add(TBSItems.ENERGY_CHESTPLATE)
                .add(TBSItems.DREADITE_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(TBSItems.DIAMARITE_LEGGINGS)
                .add(TBSItems.CORRUPTIONITE_LEGGINGS)
                .add(TBSItems.BYZANTIUM_LEGGINGS)
                .add(TBSItems.GILDED_NETHERITE_LEGGINGS)
                .add(TBSItems.ENERGY_LEGGINGS)
                .add(TBSItems.DREADITE_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(TBSItems.DIAMARITE_BOOTS)
                .add(TBSItems.CORRUPTIONITE_BOOTS)
                .add(TBSItems.BYZANTIUM_BOOTS)
                .add(TBSItems.GILDED_NETHERITE_BOOTS)
                .add(TBSItems.ENERGY_BOOTS)
                .add(TBSItems.DREADITE_BOOTS);

        valueLookupBuilder(TBSItemTags.INGOTS)
                .add(Items.IRON_INGOT)
                .add(Items.GOLD_INGOT)
                .add(Items.COPPER_INGOT)
                .add(Items.NETHERITE_INGOT)
                .add(TBSItems.STEEL_INGOT)
                .add(TBSItems.DIAMARITE_INGOT)
                .add(TBSItems.CORRUPTIONITE_INGOT)
                .add(TBSItems.DIAMOND_INGOT)
                .add(TBSItems.AMETHYST_INGOT)
                .add(TBSItems.BYZANTIUM_INGOT)
                .add(TBSItems.GILDED_NETHERITE_INGOT);

        valueLookupBuilder(ItemTags.DIAMOND_TOOL_MATERIALS)
                .add(Items.DIAMOND)
                .add(TBSItems.DIAMOND_INGOT);

        //valueLookupBuilder(ItemTags.WOODEN_SHELVES)
                //.add(TheBedrockSMPBlocks.SHELFSHELF.asItem());

        valueLookupBuilder(TBSItemTags.AMETHYST_TOOL_MATERIALS)
                .add(Items.AMETHYST_SHARD)
                .add(TBSItems.AMETHYST_INGOT);

        valueLookupBuilder(TBSItemTags.BYZANTIUM_TOOL_MATERIALS)
                .add(TBSItems.BYZANTIUM_INGOT);

        valueLookupBuilder(TBSItemTags.GOLDEN_BIRCH_LOGS)
                .add(TBSBlocks.GOLDEN_BIRCH_LOG.asItem())
                .add(TBSBlocks.GOLDEN_BIRCH_WOOD.asItem())
                .add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_LOG.asItem())
                .add(TBSBlocks.STRIPPED_GOLDEN_BIRCH_WOOD.asItem());

        valueLookupBuilder(TBSItemTags.BYZANTIUM_EQUIPMENT_REPAIR)
                .add(TBSItems.BYZANTIUM_INGOT)
                .add(Items.GOLD_INGOT)
                .add(Items.AMETHYST_SHARD)
                .add(TBSItems.AMETHYST_INGOT);

        valueLookupBuilder(TBSItemTags.STEEL_TOOL_MATERIALS)
                .add(TBSItems.STEEL_INGOT);

        valueLookupBuilder(TBSItemTags.DIAMARITE_TOOL_MATERIALS)
                .add(TBSItems.DIAMARITE)
                .add(TBSItems.DIAMARITE_INGOT);

        valueLookupBuilder(TBSItemTags.CORRUPTIONITE_TOOL_MATERIALS)
                .add(TBSItems.CORRUPTIONITE_INGOT);

        //Mace Enchantes
        valueLookupBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(TBSItems.DIAMARITE_MACE)
                .add(TBSItems.DOUBLED_MACE);

        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(TBSItems.DIAMARITE_MACE)
                .add(TBSItems.DOUBLED_MACE);

        valueLookupBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .add(TBSItems.DIAMARITE_MACE)
                .add(TBSItems.DOUBLED_MACE);

        valueLookupBuilder(ItemTags.MACE_ENCHANTABLE)
                .add(TBSItems.DIAMARITE_MACE)
                .add(TBSItems.DOUBLED_MACE);

        valueLookupBuilder(TBSItemTags.GILDED_NETHERITE_TOOL_MATERIALS)
                .add(TBSItems.GILDED_NETHERITE_INGOT);

        valueLookupBuilder(TBSItemTags.ENERGY_EQUIPMENT_REPAIR)
                .add(TBSItems.ENERGY_GEM)
                .add(Items.DIAMOND)
                .add(TBSItems.DIAMOND_INGOT);

        valueLookupBuilder(ItemTags.SPEARS)
                .add(TBSItems.STEEL_SPEAR)
                .add(TBSItems.BYZANTIUM_SPEAR)
                .add(TBSItems.GILDED_NETHERITE_SPEAR)
                .add(TBSItems.DIAMARITE_SPEAR)
                .add(TBSItems.CORRUPTIONITE_SPEAR)
                .add(TBSItems.ENERGY_SPEAR);

        valueLookupBuilder(TBSItemTags.ENERGY_TOOL_MATERIALS)
                .add(TBSItems.ENERGY_GEM);

        valueLookupBuilder(TBSItemTags.DREADITE_EQUIPMENT_REPAIR)
                .add(TBSItems.DREADITE_GEM)
                .add(Items.DIAMOND)
                .add(TBSItems.DIAMOND_INGOT)
                .add(Items.REDSTONE);

        valueLookupBuilder(TBSItemTags.STICK_REPAIR)
                .add(Items.STICK)
                .add(TBSItems.HANDLE);
    }
}
