package org.halfcooler.dailyfabric.toolitems;

import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class BakedPotatoPickaxeItem extends PickaxeItem {
	public BakedPotatoPickaxeItem(ToolMaterial material, Settings settings) {
		super(material, settings);
	}

	@Override
	public void appendTooltip(ItemStack itemStack, TooltipContext context, List<Text> tooltip, TooltipType type) {
		tooltip.add(Text.translatable("item.dailyfabric.bakedpotatopickaxeitem.tooltip1"));
		tooltip.add(Text.translatable("item.dailyfabric.bakedpotatopickaxeitem.tooltip2"));
	}
}