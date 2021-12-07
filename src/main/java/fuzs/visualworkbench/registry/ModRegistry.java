package fuzs.visualworkbench.registry;

import fuzs.puzzleslib.registry.RegistryManager;
import fuzs.visualworkbench.VisualWorkbench;
import fuzs.visualworkbench.config.JsonConfigBuilder;
import fuzs.visualworkbench.world.inventory.ModCraftingMenu;
import fuzs.visualworkbench.world.level.block.entity.CraftingTableBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModRegistry {
    private static final RegistryManager REGISTRY = RegistryManager.of(VisualWorkbench.MOD_ID);
    public static final BlockEntityType<CraftingTableBlockEntity> CRAFTING_TABLE_BLOCK_ENTITY = REGISTRY.registerRawBlockEntityType("crafting_table", () -> FabricBlockEntityTypeBuilder.create(CraftingTableBlockEntity::new, JsonConfigBuilder.INSTANCE.getBlockStream().toArray(Block[]::new)));
    public static final MenuType<ModCraftingMenu> CRAFTING_MENU_TYPE = REGISTRY.registerRawMenuType("crafting", () -> ModCraftingMenu::new);

    public static void touch() {

    }
}
