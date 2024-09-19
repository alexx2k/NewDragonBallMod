package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;

public class KiStage5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).playerKi >= 50;
	}
}
