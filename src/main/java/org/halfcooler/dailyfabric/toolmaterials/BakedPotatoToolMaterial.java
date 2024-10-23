package org.halfcooler.dailyfabric.toolmaterials;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.random.Random;

public class BakedPotatoToolMaterial implements ToolMaterial {

	public static final BakedPotatoToolMaterial Instance = new BakedPotatoToolMaterial();

	@Override
	public int getDurability() {
		return Random.create().nextInt(2147483647);
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return (float)Random.create().nextInt(2147483647);
	}

	@Override
	public float getAttackDamage() {
		return (float)Random.create().nextInt(2147483647);
	}

	@Override
	public TagKey<Block> getInverseTag() {
		return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
	}

	@Override
	public int getEnchantability() {
		return Random.create().nextInt(2147483647);
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.BAKED_POTATO);
	}
}
