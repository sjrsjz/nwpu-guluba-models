package nwpu.guluba;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier identifier = new Identifier("guluba", id);
        // Register the item with the identifier.
        Item registeredItem = Registry.register(Registries.ITEM, identifier, item);
        return registeredItem;
    }
}