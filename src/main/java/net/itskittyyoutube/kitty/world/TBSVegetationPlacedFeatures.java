package net.itskittyyoutube.kitty.world;

import com.google.common.collect.ImmutableList;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TBSVegetationPlacedFeatures {
    public static final RegistryKey<PlacedFeature> CHERRY_BIRCH_TALL = PlacedFeatures.of("cherry_birch_tall");
    public static final RegistryKey<PlacedFeature> TREES_CHERRY_BIRCH = PlacedFeatures.of("trees_cherry_birch");
    private static final PlacementModifier NOT_IN_SURFACE_WATER_MODIFIER = SurfaceWaterDepthFilterPlacementModifier.of(0);

    public static List<PlacementModifier> modifiers(int count) {
        return List.of(CountPlacementModifier.of(count), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> mushroomModifiers(int chance, @Nullable PlacementModifier modifier) {
        ImmutableList.Builder<PlacementModifier> builder = ImmutableList.builder();
        if (modifier != null) {
            builder.add(modifier);
        }

        if (chance != 0) {
            builder.add(RarityFilterPlacementModifier.of(chance));
        }

        builder.add(SquarePlacementModifier.of());
        builder.add(PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        builder.add(BiomePlacementModifier.of());
        return builder.build();
    }

    private static ImmutableList.Builder<PlacementModifier> treeModifiersBuilder(PlacementModifier countModifier) {
        return ImmutableList.<PlacementModifier>builder()
                .add(countModifier)
                .add(SquarePlacementModifier.of())
                .add(NOT_IN_SURFACE_WATER_MODIFIER)
                .add(PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP)
                .add(BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> treeModifiers(PlacementModifier modifier) {
        return treeModifiersBuilder(modifier).build();
    }

    public static List<PlacementModifier> treeModifiersWithWouldSurvive(PlacementModifier modifier, Block block) {
        return treeModifiersBuilder(modifier).add(BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(block.getDefaultState(), BlockPos.ORIGIN))).build();
    }

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry1 = registryEntryLookup.getOrThrow(TBSVegetationConfiguredFeatures.CHERRY_BIRCH_TALL);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry2 = registryEntryLookup.getOrThrow(TBSVegetationConfiguredFeatures.TREES_CHERRY_BIRCH);
        PlacedFeatures.register(featureRegisterable, CHERRY_BIRCH_TALL, registryEntry1, treeModifiers(PlacedFeatures.createCountExtraModifier(10, 0.1F, 1)));
        PlacedFeatures.register(
                featureRegisterable, TREES_CHERRY_BIRCH, registryEntry2, treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(10, 0.1F, 1), TBSBlocks.CHERRY_BIRCH_SAPLING)
        );
    }
}

