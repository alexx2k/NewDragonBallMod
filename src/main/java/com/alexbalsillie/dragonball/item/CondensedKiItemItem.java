
package com.alexbalsillie.dragonball.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import com.alexbalsillie.dragonball.procedures.CondensedKiItemRightclickedProcedure;

public class CondensedKiItemItem extends Item {
	public CondensedKiItemItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		CondensedKiItemRightclickedProcedure.execute(entity);
		return ar;
	}
}
