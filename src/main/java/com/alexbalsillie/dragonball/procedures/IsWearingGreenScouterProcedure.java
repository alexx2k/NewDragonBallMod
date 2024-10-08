package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.init.DragonBallModItems;

public class IsWearingGreenScouterProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == DragonBallModItems.GREEN_SCOUTER_HELMET.get();
	}
}
