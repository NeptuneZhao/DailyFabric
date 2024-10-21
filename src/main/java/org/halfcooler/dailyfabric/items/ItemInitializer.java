package org.halfcooler.dailyfabric.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static org.halfcooler.dailyfabric.Dailyfabric.LOGGER;

public final class ItemInitializer {
	private ItemInitializer() { }
	private static final String ModName = "dailyfabric";

	public static <T extends Item> T register(String path, T item) {
		try {
			var e = Registry.register(Registries.ITEM, Identifier.of(ModName, path), item);
			LOGGER.atInfo().log("Registered item: {}:{}", ModName, path);
			return e;
		}
		catch (Exception e) {
			LOGGER.atError().log("Failed to register item: {}:{}", ModName, path);
		}
	}

	public static final Item
			FABRIC = register("fabric", new fabric(new Item.Settings().maxCount(128))),
			STEEL_INGOT = register("steel_ingot", new Item(new Item.Settings().maxCount(64)));


	public static void Init() { }
}