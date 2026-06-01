package net.itskittyyoutube.kitty.world.tree;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.world.TBSConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class TBSSaplingGenerators {
    public static final SaplingGenerator CHERRY_BIRCH = new SaplingGenerator(TBS.MOD_ID + ":cherry_birch",
            Optional.empty(), Optional.of(TBSConfiguredFeatures.CHERRY_BIRCH), Optional.empty());

    public static final SaplingGenerator GOLDEN_BIRCH = new SaplingGenerator(TBS.MOD_ID + ":golden_birch",
            Optional.empty(), Optional.of(TBSConfiguredFeatures.GOLDEN_BIRCH), Optional.empty());
}
