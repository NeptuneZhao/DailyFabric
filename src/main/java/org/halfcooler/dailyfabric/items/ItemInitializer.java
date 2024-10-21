package org.halfcooler.dailyfabric.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ItemInitializer {
	private ItemInitializer() {}
	private static final String ModName = "dailyfabric";

	public static <T extends Item> T register(String path, T item) {
		return Registry.register(Registries.ITEM, Identifier.of(ModName, path), item);
	}

	// Here add all the items you want to register
	// We can also use java.lang.reflect to automatically register all items in the package
	public static final Item FABRIC = register("fabric", new fabric(new Item.Settings()));

	public static void Init() {}
}