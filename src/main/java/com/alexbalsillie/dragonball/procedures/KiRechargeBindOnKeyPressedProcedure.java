package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;

public class KiRechargeBindOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.kiRecharging = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
