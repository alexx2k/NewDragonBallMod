package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;

public class LearnKiBlastProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 15) {
			{
				boolean _setval = true;
				entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.kiBlastUnlocked = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-(15));
		}
	}
}
