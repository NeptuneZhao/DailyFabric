package org.halfcooler.dailyfabric.toolitems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.halfcooler.dailyfabric.itemgroups.ItemGroups1;
import org.halfcooler.dailyfabric.toolmaterials.BakedPotatoToolMaterial;
import org.halfcooler.dailyfabric.toolmaterials.DirtToolMaterial;

import java.util.ArrayList;
import java.util.List;

import static org.halfcooler.dailyfabric.Dailyfabric.LOGGER;

public final class ToolItemInitializer {
	private ToolItemInitializer() { }
	private static final String ModName = "dailyfabric";

	public static List<ItemStack> ToolItemStackList = new ArrayList<>();

	public static <T extends Item> T register(String path, T item, RegistryKey<ItemGroup> group) {
		LOGGER.atInfo().log("Registering and placing tool item {}.{}", ModName, path);
		ToolItemStackList.add(new ItemStack(item));
		ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.add(item));
		return Registry.register(Registries.ITEM, Identifier.of(ModName, path), item);
	}

	// Register items
	public static final ToolItem
		DIRT_PICKAXE = register("dirt_pickaxe", new DirtPickaxeItem(DirtToolMaterial.Instance, new Item.Settings()), ItemGroups1.InstanceRegistryKey),
		BAKED_POTATO_PICKAXE = register("baked_potato_pickaxe", new BakedPotatoPickaxeItem(BakedPotatoToolMaterial.Instance, new Item.Settings()), ItemGroups1.InstanceRegistryKey);

	public static void Init() { }

}