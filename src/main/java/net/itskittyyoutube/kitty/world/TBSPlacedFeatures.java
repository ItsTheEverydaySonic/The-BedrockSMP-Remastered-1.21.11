package net.itskittyyoutube.kitty.world;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class TBSPlacedFeatures {
    public static final RegistryKey<PlacedFeature> CHERRY_BIRCH_PLACED = registerKey("cherry_birch_placed");
    public static final RegistryKey<PlacedFeature> GOLDEN_BIRCH_PLACED = registerKey("golden_birch_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, CHERRY_BIRCH_PLACED, configuredFeatures.getOrThrow(TBSConfiguredFeatures.CHERRY_BIRCH),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1F, 1), TBSBlocks.CHERRY_BIRCH_SAPLING));

        register(context, GOLDEN_BIRCH_PLACED, configuredFeatures.getOrThrow(TBSConfiguredFeatures.GOLDEN_BIRCH),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1F, 1), TBSBlocks.GOLDEN_BIRCH_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(TBS.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}