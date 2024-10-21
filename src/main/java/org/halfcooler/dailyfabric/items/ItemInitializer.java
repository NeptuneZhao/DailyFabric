package org.halfcooler.dailyfabric.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.halfcooler.dailyfabric.itemgroups.ItemGroups1;

import java.util.ArrayList;
import java.util.List;

import static org.halfcooler.dailyfabric.Dailyfabric.LOGGER;

public final class ItemInitializer {
	private ItemInitializer() { }
	private static final String ModName = "dailyfabric";

	public static List<ItemStack> ItemStackList = new ArrayList<>();
	public static <T extends Item> T register(String path, T item, RegistryKey<ItemGroup> group) {
		LOGGER.atInfo().log("Registering and placing item {}.{}", ModName, path);
		ItemStackList.add(new ItemStack(item));
		ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.add(item));
		return Registry.register(Registries.ITEM, Identifier.of(ModName, path), item);
	}

	// Register items
	public static final Item
		FABRIC = register("Fabric", new Fabric(new Item.Settings()), ItemGroups1.InstanceRegistryKey),
		STEEL_INGOT = register("SteelIngot", new SteelIngot(new Item.Settings()), ItemGroups1.InstanceRegistryKey);

	public static void Init() {
		FuelRegistry.INSTANCE.add(FABRIC, 200);
	}
}