package org.halfcooler.dailyfabric.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class fabric extends Item {
	public fabric(Settings settings) {
		super(settings.maxCount(128));
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		user.playSound(SoundEvents.ENTITY_VILLAGER_NO, 1.0F, 1.5F);
		return TypedActionResult.success(user.getStackInHand(hand));
	}
}
