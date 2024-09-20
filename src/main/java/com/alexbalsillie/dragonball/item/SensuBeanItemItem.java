
package com.alexbalsillie.dragonball.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.alexbalsillie.dragonball.procedures.SensuBeanItemPlayerFinishesUsingItemProcedure;

public class SensuBeanItemItem extends Item {
	public SensuBeanItemItem() {
		super(new Item.Properties().stacksTo(3).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(20).saturationMod(2f).alwaysEat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("A magical bean that cures you of you ailments."));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		SensuBeanItemPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
