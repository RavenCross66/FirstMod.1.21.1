package net.raven.firstmod.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.raven.firstmod.FirstMod;

public class ItemUtils {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstMod.MOD_ID);

    public static final DeferredItem<Item> THRONGLER = ITEMS.register("throngler", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
