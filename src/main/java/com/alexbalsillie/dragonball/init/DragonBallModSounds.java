
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.alexbalsillie.dragonball.DragonBallMod;

public class DragonBallModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DragonBallMod.MODID);
	public static final RegistryObject<SoundEvent> SHENRONSPAWN = REGISTRY.register("shenronspawn", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("dragon_ball", "shenronspawn")));
}
