package org.halfcooler.dailyfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;

import org.halfcooler.dailyfabric.items.ItemInitializer;
import org.halfcooler.dailyfabric.items.fabric;

public class Dailyfabric implements ModInitializer {
    public static final Item IRON_MAKER = new fabric(new Item.Settings());
    @Override
    public void onInitialize() {
        ItemInitializer.Init();
    }
}
