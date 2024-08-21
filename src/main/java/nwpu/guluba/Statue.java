package nwpu.guluba;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;

public class TestBlock {
    public static final Item SUSPICIOUS_SUBSTANCE = ModItem.register(
            new Item(new Item.Settings()),
            "suspicious_substance"
    );
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((group) -> {
            group.add(SUSPICIOUS_SUBSTANCE);
        });
    }
}
