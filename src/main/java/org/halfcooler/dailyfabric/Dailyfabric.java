package org.halfcooler.dailyfabric;

import net.fabricmc.api.ModInitializer;


import org.halfcooler.dailyfabric.items.ItemInitializer;

public class Dailyfabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ItemInitializer.Init();
    }
}
