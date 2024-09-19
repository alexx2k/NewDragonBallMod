package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class NamekianOnRightClickProcedure {
	public static InteractionResult execute(Entity sourceentity) {
		if (sourceentity == null)
			return InteractionResult.PASS;
		double quoteSelection = 0;
		quoteSelection = Mth.nextInt(RandomSource.create(), 1, 5);
		if (quoteSelection == 1) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("That Frieza guy is destroying our home."), false);
		} else if (quoteSelection == 2) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Something needs to be done about Frieza."), false);
		} else if (quoteSelection == 3) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Are you the warrior they sent to defeat Frieza?"), false);
		} else if (quoteSelection == 4) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("I hope someone does something about this tyrant, Frieza."), false);
		} else if (quoteSelection == 5) {
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Will Namek be alright?"), false);
		}
		return InteractionResult.SUCCESS;
	}
}
