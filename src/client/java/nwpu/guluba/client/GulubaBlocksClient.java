package nwpu.guluba.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.BlockRenderType;
import net.minecraft.client.render.RenderLayer;
import nwpu.guluba.ModBlock;
import nwpu.guluba.Statue;

import javax.swing.plaf.nimbus.State;

public class GulubaBlocksClient implements ClientModInitializer {
    private RenderLayer getRenderLayer(ModBlock.RenderType type){
        switch (type){
            case SOLID:
                return RenderLayer.getSolid();
            case CUTOUT:
                return RenderLayer.getCutout();
            case CUTOUT_MIPPED:
                return RenderLayer.getCutoutMipped();
            case TRANSLUCENT:
                return RenderLayer.getTranslucent();
            default:
                return RenderLayer.getSolid();
        }
    }
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.StatueBlock, getRenderLayer(Statue.rendertype));
    }
}
