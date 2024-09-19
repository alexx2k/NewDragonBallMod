
package com.alexbalsillie.dragonball.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.alexbalsillie.dragonball.procedures.RawKiEnergyPlayerFinishesUsingItemProcedure;

public class RawKiEnergyItem extends Item {
	public RawKiEnergyItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("A ball pulsing with energy."));
		list.add(Component.literal("Consuming this would surely recharge my ki..."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		RawKiEnergyPlayerFinishesUsingItemProcedure.execute(entity);
		return ar;
	}
}
