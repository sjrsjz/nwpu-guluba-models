package nwpu.guluba;
import net.fabricmc.api.ModInitializer;

public class GulubaBlocks implements ModInitializer {
    @Override
    public void onInitialize() {
        Statue.initialize();
    }
}
