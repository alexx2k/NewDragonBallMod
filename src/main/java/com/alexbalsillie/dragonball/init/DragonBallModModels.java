
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.alexbalsillie.dragonball.client.model.Modelscouter;
import com.alexbalsillie.dragonball.client.model.ModelShenron;
import com.alexbalsillie.dragonball.client.model.ModelKiBlast;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DragonBallModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelscouter.LAYER_LOCATION, Modelscouter::createBodyLayer);
		event.registerLayerDefinition(ModelKiBlast.LAYER_LOCATION, ModelKiBlast::createBodyLayer);
		event.registerLayerDefinition(ModelShenron.LAYER_LOCATION, ModelShenron::createBodyLayer);
	}
}
