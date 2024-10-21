package org.halfcooler.dailyfabric.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class Fabric extends Item {
	public Fabric(Settings settings) {
		super(settings);
	}

	// Right click event
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		user.playSound(SoundEvents.ENTITY_VILLAGER_NO, 1.0F, 1.5F);
		return TypedActionResult.success(user.getStackInHand(hand));
	}

	@Override
	public void appendTooltip(ItemStack itemStack, TooltipContext context, List<Text> tooltip, TooltipType type) {
		tooltip.add(Text.translatable("item.dailyfabric.Fabric.tooltip1"));
		tooltip.add(Text.translatable("item.dailyfabric.Fabric.tooltip2"));
	}
}
