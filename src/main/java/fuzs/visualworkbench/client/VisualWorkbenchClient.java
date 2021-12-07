package fuzs.visualworkbench.client;

import fuzs.visualworkbench.client.renderer.blockentity.WorkbenchTileEntityRenderer;
import fuzs.visualworkbench.registry.ModRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.gui.screens.inventory.CraftingScreen;

public class VisualWorkbenchClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        onClientSetup();
    }

    public static void onClientSetup() {
        ScreenRegistry.register(ModRegistry.CRAFTING_MENU_TYPE, CraftingScreen::new);
        BlockEntityRendererRegistry.register(ModRegistry.CRAFTING_TABLE_BLOCK_ENTITY, WorkbenchTileEntityRenderer::new);
    }
}
