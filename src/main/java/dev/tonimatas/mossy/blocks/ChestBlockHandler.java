package dev.tonimatas.mossy.blocks;

import net.kyori.adventure.text.Component;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockHandler;
import net.minestom.server.inventory.Inventory;
import net.minestom.server.inventory.InventoryType;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;

public class ChestBlockHandler implements BlockHandler {
    private final Inventory inventory = new Inventory(InventoryType.CHEST_3_ROW, Component.translatable("container.chest"));
    
    @Override
    public boolean onInteract(@NotNull Interaction interaction) {
        // TODO: Make the logic
        interaction.getPlayer().openInventory(inventory);
        return BlockHandler.super.onInteract(interaction);
    }

    @Override
    public @NotNull NamespaceID getNamespaceId() {
        return Block.CHEST.namespace();
    }
}
