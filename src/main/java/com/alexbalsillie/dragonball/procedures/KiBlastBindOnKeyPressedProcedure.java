package com.alexbalsillie.dragonball.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;
import com.alexbalsillie.dragonball.init.DragonBallModParticleTypes;
import com.alexbalsillie.dragonball.init.DragonBallModEntities;
import com.alexbalsillie.dragonball.entity.KiBlastProjectileEntity;

public class KiBlastBindOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).playerKi >= 5
				&& (entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).kiBlastUnlocked) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new KiBlastProjectileEntity(DragonBallModEntities.KI_BLAST_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 3, 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 1.5, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (DragonBallModParticleTypes.KI_PARTICLE.get()), x, y, z, 5, 3, 3, 3, 1);
			{
				double _setval = (entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).playerKi - 5;
				entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.playerKi = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
