package net.itskittyyoutube.kitty.world;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class TBSConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_BIRCH = registerKey("cherry_birch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOLDEN_BIRCH = registerKey("golden_birch");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, CHERRY_BIRCH, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TBSBlocks.CHERRY_BIRCH_LOG),
                new StraightTrunkPlacer(5, 2, 0),

                BlockStateProvider.of(TBSBlocks.CHERRY_BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, GOLDEN_BIRCH, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TBSBlocks.GOLDEN_BIRCH_LOG),
                new StraightTrunkPlacer(5, 2, 0),

                BlockStateProvider.of(TBSBlocks.GOLDEN_BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(TBS.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}