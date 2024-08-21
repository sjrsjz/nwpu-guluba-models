package nwpu.guluba;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FacingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    public enum RenderType {
        SOLID,
        CUTOUT,
        CUTOUT_MIPPED,
        TRANSLUCENT
    };
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of("guluba", name);
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        var block_ = Registry.register(Registries.BLOCK, id, block);
        if (shouldRegisterItem) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((group) -> {
                group.add(block_.asItem());
            });
        }
        return block_;
    }
    public static FacingBlock register(FacingBlock block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of("guluba", name);
        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        var block_ = Registry.register(Registries.BLOCK, id, block);
        if (shouldRegisterItem) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((group) -> {
                group.add(block_.asItem());
            });
        }
        return block_;
    }

    public static final Block StatueBlock = register(new Statue(
        AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)
            ), "statue_block", true);
    public static final Block BoardLeftBlock = register(new BoardLeft(
        AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)
            ), "board_left", true);
    public static final Block BoardRightBlock = register(new BoardRight(
        AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)
            ), "board_right", true);
}