package org.halfcooler.dailyfabric.itemgroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.halfcooler.dailyfabric.items.ItemInitializer;

import static org.halfcooler.dailyfabric.Dailyfabric.LOGGER;

public final class ItemGroups1 {
	public static final ItemGroup ITEMGROUPS1 = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ItemInitializer.FABRIC))
		.displayName(Text.translatable("itemGroup.dailyfabric.itemgroups1"))
		.entries( (displayContext, entries) -> entries.addAll(ItemInitializer.ItemStackList) )
		.build();

	public static void Init() {
		LOGGER.atInfo().log("Registering item_group: dailyfabric.itemgroups1");
		Registry.register(Registries.ITEM_GROUP, Identifier.of("dailyfabric", "itemgroups1"), ITEMGROUPS1);
	}

	public static final RegistryKey<ItemGroup> InstanceRegistryKey = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of("dailyfabric", "itemgroups1"));
}