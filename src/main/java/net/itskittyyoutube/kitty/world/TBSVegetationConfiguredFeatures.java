package net.itskittyyoutube.kitty.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.*;

import java.util.List;

public class TBSVegetationConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_CHERRY_BIRCH = ConfiguredFeatures.of("trees_cherry_birch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_BIRCH_TALL = ConfiguredFeatures.of("cherry_birch_tall");
    private static final float FALLEN_TREE_RARITY = 80.0F;

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<PlacedFeature> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntry<PlacedFeature> registryEntry = registryEntryLookup.getOrThrow(TreePlacedFeatures.BIRCH_BEES_002);
        RegistryEntry<PlacedFeature> registryEntry1 = registryEntryLookup.getOrThrow(TreePlacedFeatures.SUPER_BIRCH_BEES_0002);
        RegistryEntry<PlacedFeature> registryEntry2 = registryEntryLookup.getOrThrow(TreePlacedFeatures.BIRCH_BEES_0002);
        RegistryEntry<PlacedFeature> registryEntry3 = registryEntryLookup.getOrThrow(TreePlacedFeatures.SUPER_BIRCH_BEES);
        RegistryEntry<PlacedFeature> registryEntry4 = registryEntryLookup.getOrThrow(TreePlacedFeatures.FALLEN_BIRCH_TREE);
        RegistryEntry<PlacedFeature> registryEntry5 = registryEntryLookup.getOrThrow(TreePlacedFeatures.FALLEN_SUPER_BIRCH_TREE);
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_CHERRY_BIRCH,
                Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(registryEntry4, 0.0125F)), registryEntry2)
        );
        ConfiguredFeatures.register(
                featureRegisterable,
                CHERRY_BIRCH_TALL,
                Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(
                        List.of(new RandomFeatureEntry(registryEntry5, 0.00625F), new RandomFeatureEntry(registryEntry1, 0.5F), new RandomFeatureEntry(registryEntry4, 0.0125F)),
                        registryEntry2
                )
        );
    }
}
