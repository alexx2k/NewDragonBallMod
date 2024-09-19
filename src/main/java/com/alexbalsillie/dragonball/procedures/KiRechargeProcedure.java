package com.alexbalsillie.dragonball.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import javax.annotation.Nullable;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;
import com.alexbalsillie.dragonball.init.DragonBallModParticleTypes;
import com.alexbalsillie.dragonball.DragonBallMod;

@Mod.EventBusSubscriber
public class KiRechargeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).kiRecharging == true) {
			{
				double _setval = (entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).playerKi + 1;
				entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.playerKi = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).playerKi >= 100) {
				{
					double _setval = 100;
					entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.playerKi = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (DragonBallModParticleTypes.KI_PARTICLE.get()), x, y, z, 5, 3, 3, 3, 1);
			DragonBallMod.queueServerWork(20, () -> {
			});
		}
	}
}
