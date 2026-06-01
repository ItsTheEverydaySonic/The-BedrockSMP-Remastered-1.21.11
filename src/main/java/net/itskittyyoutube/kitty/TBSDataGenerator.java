package net.itskittyyoutube.kitty;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.itskittyyoutube.kitty.data.*;
import net.itskittyyoutube.kitty.material.TBSTrimMaterials;
import net.itskittyyoutube.kitty.world.TBSConfiguredFeatures;
import net.itskittyyoutube.kitty.world.TBSPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class TBSDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        final FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(TBSBlockTagProvider::new);
        pack.addProvider(TBSItemTagProvider::new);
        pack.addProvider(TBSLootTableProvider::new);
        pack.addProvider((FabricDataOutput output) -> new TBSModelProvider(output, false));
        pack.addProvider(TBSRecipeProvider::new);
        pack.addProvider(TBSRegistryDataGenerator::new);

        final FabricDataGenerator.Pack small_axolotl_buckets = generator.createBuiltinResourcePack(Identifier.of(
                TBS.MOD_ID,
                TBSClient.PACK_ID
        ));
        small_axolotl_buckets.addProvider((FabricDataOutput output) -> new TBSModelProvider(output, true));
    }
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, TBSTrimMaterials::bootstrap);

        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, TBSConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, TBSPlacedFeatures::bootstrap);
    }
}