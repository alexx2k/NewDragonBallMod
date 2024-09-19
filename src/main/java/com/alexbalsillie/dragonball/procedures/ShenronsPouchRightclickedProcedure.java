package com.alexbalsillie.dragonball.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.init.DragonBallModItems;

public class ShenronsPouchRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(DragonBallModItems.SHENRONS_POUCH.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
			_setstack.setCount(32);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
			_setstack.setCount(16);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
			_setstack.setCount(8);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
			_setstack.setCount(4);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
