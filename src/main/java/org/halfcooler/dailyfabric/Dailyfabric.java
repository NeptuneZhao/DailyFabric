package org.halfcooler.dailyfabric;

import net.fabricmc.api.ModInitializer;
import org.halfcooler.dailyfabric.itemgroups.ItemGroups1;
import org.halfcooler.dailyfabric.items.ItemInitializer;
import org.halfcooler.dailyfabric.toolitems.ToolItemInitializer;
import org.slf4j.Logger;

public class Dailyfabric implements ModInitializer {
    public static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger("Dailyfabric");
    @Override
    public void onInitialize() {
        LOGGER.atInfo().log("Hello Fabric, I am \"Daily Fabric!\"");
        ItemGroups1.Init();
        ItemInitializer.Init();
        ToolItemInitializer.Init();
    }
}
