package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;

public class KaiokenKeybindOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).kaiokenActive) {
			{
				boolean _setval = false;
				entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.kaiokenActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).kaiokenLearned == true) {
			{
				boolean _setval = true;
				entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.kaiokenActive = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
