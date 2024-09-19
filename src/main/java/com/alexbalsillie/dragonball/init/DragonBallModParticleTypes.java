
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.alexbalsillie.dragonball.DragonBallMod;

public class DragonBallModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DragonBallMod.MODID);
	public static final RegistryObject<SimpleParticleType> KAIOKEN_PARTICLES = REGISTRY.register("kaioken_particles", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> KI_PARTICLE = REGISTRY.register("ki_particle", () -> new SimpleParticleType(false));
}
