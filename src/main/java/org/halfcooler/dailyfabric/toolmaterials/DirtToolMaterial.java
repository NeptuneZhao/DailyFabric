package org.halfcooler.dailyfabric.toolmaterials;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class DirtToolMaterial implements ToolMaterial {

	public static final DirtToolMaterial Instance = new DirtToolMaterial();

	@Override
	public int getDurability() {
		return 10;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 1;
	}

	@Override
	public float getAttackDamage() {
		return 1;
	}

	@Override
	public TagKey<Block> getInverseTag() {
		return BlockTags.INCORRECT_FOR_WOODEN_TOOL;
	}

	@Override
	public int getEnchantability() {
		return 1;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.DIRT);
	}
}
