package net.itskittyyoutube.kitty.sounds;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class TBSSoundEvents {
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_TEMPLATE = registerReference("music_disc.template_disc");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_THE_TALE_OF_TOOTHLESS = registerReference("music_disc.the_tale_of_toothless");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerReference("music_disc.bye_justin_hi_justin");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_STEVE_LAVA_CHICKEN = registerReference("music_disc.steve_lava_chicken");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_LAVA_TEARSSTEP = registerReference("music_disc.lava_tearsstep");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_TERRIFYING_TEARS = registerReference("music_disc.terrifying_tears");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_ULTRA_TERRIFYING_TEARS = registerReference("music_disc.ultra_terrifying_tears");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_BETTERSIDE = registerReference("music_disc.betterside");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_12 = registerReference("music_disc.12");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerReference("music_disc.bye_justin_hi_justin_remastered");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_EXPLORER = registerReference("music_disc.explorer");
    public static final RegistryEntry.Reference<SoundEvent> ALREADY_AHEAD = registerReference("music_disc.already_ahead");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS = registerReference("music_disc.reversed_the_tale_of_toothless");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerReference("music_disc.reversed_bye_justin_hi_justin");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN = registerReference("music_disc.reversed_steve_lava_chicken");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_LAVA_TEARSSTEP = registerReference("music_disc.reversed_lava_tearsstep");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_TERRIFYING_TEARS = registerReference("music_disc.reversed_terrifying_tears");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_ULTRA_TERRIFYING_TEARS = registerReference("music_disc.reversed_ultra_terrifying_tears");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_BETTERSIDE = registerReference("music_disc.reversed_betterside");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_12 = registerReference("music_disc.reversed_12");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerReference("music_disc.reversed_bye_justin_hi_justin_remastered");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_REVERSED_EXPLORER = registerReference("music_disc.reversed_explorer");
    public static final RegistryEntry.Reference<SoundEvent> REVERSED_ALREADY_AHEAD = registerReference("music_disc.reversed_already_ahead");
    public static final RegistryEntry.Reference<SoundEvent> DARK_INSIDE = registerReference("music_disc.dark_inside");
    public static final RegistryEntry.Reference<SoundEvent> REVERSED_DARK_INSIDE = registerReference("music_disc.reversed_dark_inside");

    public static final RegistryEntry.Reference<SoundEvent> PANCAKE = registerReference("music_disc.pancake");
    public static final RegistryEntry.Reference<SoundEvent> WAFFLE = registerReference("music_disc.waffle");
    public static final RegistryEntry.Reference<SoundEvent> REVERSED_PANCAKE = registerReference("music_disc.reversed_pancake");
    public static final RegistryEntry.Reference<SoundEvent> REVERSED_WAFFLE = registerReference("music_disc.reversed_waffle");

    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_BYZANTIUM = registerReference("item.armor.equip_byzantium");
    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_DIAMARITE = registerReference("item.armor.equip_diamarite");
    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_CORRUPTIONITE = registerReference("item.armor.equip_corruptionite");
    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_GILDED_NETHERITE = registerReference("item.armor.equip_gilded_netherite");


    private static RegistryEntry.Reference<SoundEvent> registerReference(String path) {
        Identifier id = Identifier.of(TBS.MOD_ID, path);
        return Registry.registerReference(
                Registries.SOUND_EVENT,
                id,
                SoundEvent.of(id)
        );
    }



    public static void registerSoundEvents() {
        TBS.LOGGER.info("Registering SoundEvents for " + TBS.MOD_ID);
    }
}
