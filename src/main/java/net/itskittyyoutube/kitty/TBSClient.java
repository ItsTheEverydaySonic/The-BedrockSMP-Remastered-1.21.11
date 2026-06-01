package net.itskittyyoutube.kitty;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.itskittyyoutube.kitty.block.TBSBlocks;
import net.itskittyyoutube.kitty.util.TBSBabyProperty;
import net.itskittyyoutube.kitty.util.TBSBuiltinResourcePack;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.text.Text;

public final class TBSClient implements ClientModInitializer {
    public static final String PACK_ID = "small_axolotl_buckets";
    public static final String PACK_ID1 = "spooky_season";
    public static final String PACK_ID2 = "old_redwood";
    public static final String PACK_ID3 = "halloween_icons";
    public static final String PACK_ID4 = "spoopy_season";
    public static final String PACK_ID5 = "halloween_foliage";
    public static final String PACK_ID6 = "old_dye";
    public static final String PACK_ID7 = "bedrocksmp_look";
    public static final String PACK_ID8 = "bedrocksmp_icons";

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(TBSBlocks.CHERRY_BIRCH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(TBSBlocks.DARK_OAK_DOOR_WITH_WINDOWS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(TBSBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(TBSBlocks.CHERRY_BIRCH_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(TBSBlocks.CHERRY_BIRCH_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(TBSBlocks.GOLDEN_BIRCH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(TBSBlocks.GOLDEN_BIRCH_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(TBSBlocks.GOLDEN_BIRCH_TRAPDOOR, BlockRenderLayer.CUTOUT);

        TBSBabyProperty.register();

        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID,
                Text.translatable("pack.kitty.small_axolotl_buckets")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID1,
                Text.translatable("pack.kitty.spooky_season")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID2,
                Text.translatable("pack.kitty.old_redwood")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID3,
                Text.translatable("pack.kitty.halloween_icons")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID4,
                Text.translatable("pack.kitty.spoopy_season")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID5,
                Text.translatable("pack.kitty.halloween_foliage")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID6,
                Text.translatable("pack.kitty.old_dye")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID7,
                Text.translatable("pack.kitty.bedrocksmp_look")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID8,
                Text.translatable("pack.kitty.bedrocksmp_icons")
        );
    }
}
