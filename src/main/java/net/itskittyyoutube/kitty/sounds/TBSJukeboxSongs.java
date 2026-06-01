package net.itskittyyoutube.kitty.sounds;

import net.itskittyyoutube.kitty.TBS;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface TBSJukeboxSongs {
    RegistryKey<JukeboxSong> TEMPLATE = of("template_disc");
    RegistryKey<JukeboxSong> TOOTHLESS = of("the_tale_of_toothless");
    RegistryKey<JukeboxSong> JUSTIN = of("bye_justin_hi_justin");
    RegistryKey<JukeboxSong> STEVE = of("steve_lava_chicken");
    RegistryKey<JukeboxSong> TEARSSTEP = of("lava_tearsstep");
    RegistryKey<JukeboxSong> TERRIFYING = of("terrifying_tears");
    RegistryKey<JukeboxSong> ULTRA = of("ultra_terrifying_tears");
    RegistryKey<JukeboxSong> BETTERSIDE = of("betterside");
    RegistryKey<JukeboxSong> TWELVE = of("12");
    RegistryKey<JukeboxSong> REMASTERED = of("bye_justin_hi_justin_remastered");
    RegistryKey<JukeboxSong> EXPLORER = of("explorer");
    RegistryKey<JukeboxSong> ALREADY = of("already_ahead");
    RegistryKey<JukeboxSong> DARK = of("dark_inside");
    RegistryKey<JukeboxSong> TOOTHLESS2 = of("reversed_the_tale_of_toothless");
    RegistryKey<JukeboxSong> JUSTIN2 = of("reversed_bye_justin_hi_justin");
    RegistryKey<JukeboxSong> STEVE2 = of("reversed_steve_lava_chicken");
    RegistryKey<JukeboxSong> TEARSSTEP2 = of("reversed_lava_tearsstep");
    RegistryKey<JukeboxSong> TERRIFYING2 = of("reversed_terrifying_tears");
    RegistryKey<JukeboxSong> ULTRA2 = of("reversed_ultra_terrifying_tears");
    RegistryKey<JukeboxSong> BETTERSIDE2 = of("reversed_betterside");
    RegistryKey<JukeboxSong> TWELVE2 = of("reversed_12");
    RegistryKey<JukeboxSong> REMASTERED2 = of("reversed_bye_justin_hi_justin_remastered");
    RegistryKey<JukeboxSong> EXPLORER2 = of("reversed_explorer");
    RegistryKey<JukeboxSong> ALREADY2 = of("reversed_already_ahead");
    RegistryKey<JukeboxSong> DARK2 = of("reversed_dark_inside");

    RegistryKey<JukeboxSong> PANCAKE = of("pancake");
    RegistryKey<JukeboxSong> WAFFLE = of("waffle");
    RegistryKey<JukeboxSong> PANCAKE2 = of("reversed_pancake");
    RegistryKey<JukeboxSong> WAFFLE2 = of("reversed_waffle");

    private static RegistryKey<JukeboxSong> of(String path) {
        return RegistryKey.of(
                RegistryKeys.JUKEBOX_SONG,
                Identifier.of(TBS.MOD_ID, path)
        );
    }


    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), lengthInSeconds, comparatorOutput)
        );
    }

    static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, TEMPLATE, TBSSoundEvents.MUSIC_DISC_TEMPLATE, 234, 15);
        register(registry, TOOTHLESS, TBSSoundEvents.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, 194, 15);
        register(registry, JUSTIN, TBSSoundEvents.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, 120, 15);
        register(registry, STEVE, TBSSoundEvents.MUSIC_DISC_STEVE_LAVA_CHICKEN, 51, 15);
        register(registry, TEARSSTEP, TBSSoundEvents.MUSIC_DISC_LAVA_TEARSSTEP, 175, 15);
        register(registry, TERRIFYING, TBSSoundEvents.MUSIC_DISC_TERRIFYING_TEARS, 210, 15);
        register(registry, ULTRA, TBSSoundEvents.MUSIC_DISC_ULTRA_TERRIFYING_TEARS, 210, 15);
        register(registry, BETTERSIDE, TBSSoundEvents.MUSIC_DISC_BETTERSIDE, 402, 14);
        register(registry, TWELVE, TBSSoundEvents.MUSIC_DISC_12, 178, 12);
        register(registry, REMASTERED, TBSSoundEvents.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, 168, 15);
        register(registry, EXPLORER, TBSSoundEvents.MUSIC_DISC_EXPLORER, 215, 14);
        register(registry, ALREADY, TBSSoundEvents.ALREADY_AHEAD, 189, 15);
        register(registry, DARK, TBSSoundEvents.DARK_INSIDE, 2440, 15);
        register(registry, TOOTHLESS2, TBSSoundEvents.MUSIC_DISC_REVERSED_THE_TALE_OF_TOOTHLESS, 194, 15);
        register(registry, JUSTIN2, TBSSoundEvents.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP, 120, 15);
        register(registry, STEVE2, TBSSoundEvents.MUSIC_DISC_REVERSED_STEVE_LAVA_CHICKEN, 51, 15);
        register(registry, TEARSSTEP2, TBSSoundEvents.MUSIC_DISC_REVERSED_LAVA_TEARSSTEP, 175, 15);
        register(registry, TERRIFYING2, TBSSoundEvents.MUSIC_DISC_REVERSED_TERRIFYING_TEARS, 210, 15);
        register(registry, ULTRA2, TBSSoundEvents.MUSIC_DISC_REVERSED_ULTRA_TERRIFYING_TEARS, 210, 15);
        register(registry, BETTERSIDE2, TBSSoundEvents.MUSIC_DISC_REVERSED_BETTERSIDE, 402, 14);
        register(registry, TWELVE2, TBSSoundEvents.MUSIC_DISC_REVERSED_12, 178, 12);
        register(registry, REMASTERED2, TBSSoundEvents.MUSIC_DISC_REVERSED_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, 168, 15);
        register(registry, EXPLORER2, TBSSoundEvents.MUSIC_DISC_REVERSED_EXPLORER, 215, 14);
        register(registry, ALREADY2, TBSSoundEvents.REVERSED_ALREADY_AHEAD, 189, 15);
        register(registry, DARK2, TBSSoundEvents.REVERSED_DARK_INSIDE, 2440, 15);

        register(registry, PANCAKE, TBSSoundEvents.PANCAKE, 217, 15);
        register(registry, WAFFLE, TBSSoundEvents.WAFFLE, 3160, 15);
        register(registry, PANCAKE2, TBSSoundEvents.REVERSED_PANCAKE, 217, 15);
        register(registry, WAFFLE2, TBSSoundEvents.REVERSED_WAFFLE, 3160, 15);
    }
}
