
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.alexbalsillie.dragonball.client.renderer.ShenronRenderer;
import com.alexbalsillie.dragonball.client.renderer.Namekian3Renderer;
import com.alexbalsillie.dragonball.client.renderer.Namekian2Renderer;
import com.alexbalsillie.dragonball.client.renderer.Namekian1Renderer;
import com.alexbalsillie.dragonball.client.renderer.KiBlastProjectileRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonBallModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DragonBallModEntities.SHENRON.get(), ShenronRenderer::new);
		event.registerEntityRenderer(DragonBallModEntities.KI_BLAST_PROJECTILE.get(), KiBlastProjectileRenderer::new);
		event.registerEntityRenderer(DragonBallModEntities.NAMEKIAN_1.get(), Namekian1Renderer::new);
		event.registerEntityRenderer(DragonBallModEntities.NAMEKIAN_2.get(), Namekian2Renderer::new);
		event.registerEntityRenderer(DragonBallModEntities.NAMEKIAN_3.get(), Namekian3Renderer::new);
	}
}
