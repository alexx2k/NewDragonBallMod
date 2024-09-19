package com.alexbalsillie.dragonball.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import javax.annotation.Nullable;

import java.util.UUID;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;
import com.alexbalsillie.dragonball.init.DragonBallModParticleTypes;

@Mod.EventBusSubscriber
public class KaiokenFormProcedure {
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
		if ((entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DragonBallModVariables.PlayerVariables())).kaiokenActive) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (DragonBallModParticleTypes.KAIOKEN_PARTICLES.get()), x, y, z, 5, 3, 3, 3, 1);
			if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.hasModifier((new AttributeModifier(UUID.fromString("218c8aad-2141-40a1-8fa5-c4c737eae2ee"), "kaioken_strength", 2, AttributeModifier.Operation.MULTIPLY_BASE)))))
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
						.addTransientModifier((new AttributeModifier(UUID.fromString("218c8aad-2141-40a1-8fa5-c4c737eae2ee"), "kaioken_strength", 2, AttributeModifier.Operation.MULTIPLY_BASE)));
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 1) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("dragon_ball:kaioken_damage")))), (float) 0.5);
			} else {
				{
					boolean _setval = false;
					entity.getCapability(DragonBallModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.kaiokenActive = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(UUID.fromString("218c8aad-2141-40a1-8fa5-c4c737eae2ee"));
		}
	}
}
