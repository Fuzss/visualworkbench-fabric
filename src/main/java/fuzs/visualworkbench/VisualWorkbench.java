package fuzs.visualworkbench;

import fuzs.puzzleslib.config.AbstractConfig;
import fuzs.puzzleslib.config.ConfigHolder;
import fuzs.puzzleslib.config.ConfigHolderImpl;
import fuzs.visualworkbench.config.ClientConfig;
import fuzs.visualworkbench.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VisualWorkbench implements ModInitializer {
    public static final String MOD_ID = "visualworkbench";
    public static final String MOD_NAME = "Visual Workbench";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @SuppressWarnings("Convert2MethodRef")
    public static final ConfigHolder<ClientConfig, AbstractConfig> CONFIG = ConfigHolder.client(() -> new ClientConfig());

    @Override
    public void onInitialize() {
        onConstructMod();
    }

    public static void onConstructMod() {
        ((ConfigHolderImpl<?, ?>) CONFIG).addConfigs(MOD_ID);
        // this doesn't work on Fabric as there is no order in which registries are loaded,
        // so there is no guarantee modded crafting table blocks will be registered before our block entity is
        // therefore just hardcode to vanilla table
//        JsonConfigBuilder.INSTANCE.load();
        ModRegistry.touch();
    }
}
