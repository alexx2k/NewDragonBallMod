
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.alexbalsillie.dragonball.client.particle.KiParticleParticle;
import com.alexbalsillie.dragonball.client.particle.KaiokenParticlesParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonBallModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(DragonBallModParticleTypes.KAIOKEN_PARTICLES.get(), KaiokenParticlesParticle::provider);
		event.registerSpriteSet(DragonBallModParticleTypes.KI_PARTICLE.get(), KiParticleParticle::provider);
	}
}
