package org.halfcooler.dailyfabric.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DailyfabricClient implements ClientModInitializer {

    public static final Logger LOGGER_CLIENT = LoggerFactory.getLogger("DailyfabricClient");

    @Override
    public void onInitializeClient() {
        LOGGER_CLIENT.atInfo().log("Hello Fabric, I am \"Daily Fabric!\" (Client)");
    }
}
