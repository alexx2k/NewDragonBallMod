package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import com.alexbalsillie.dragonball.init.DragonBallModParticleTypes;
import com.alexbalsillie.dragonball.DragonBallMod;

public class KiBlastProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (DragonBallModParticleTypes.KI_PARTICLE.get()), x, y, z, 3, 3, 3, 3, 1);
		DragonBallMod.queueServerWork(60, () -> {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		});
	}
}
