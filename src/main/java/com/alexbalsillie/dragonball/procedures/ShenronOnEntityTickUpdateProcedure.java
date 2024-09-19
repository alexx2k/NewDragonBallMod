package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;

public class ShenronOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (DragonBallModVariables.MapVariables.get(world).shenronWishGranted == true) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
