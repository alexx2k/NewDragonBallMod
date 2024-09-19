
package com.alexbalsillie.dragonball.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.alexbalsillie.dragonball.entity.ShenronEntity;
import com.alexbalsillie.dragonball.client.model.ModelShenron;

public class ShenronRenderer extends MobRenderer<ShenronEntity, ModelShenron<ShenronEntity>> {
	public ShenronRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShenron(context.bakeLayer(ModelShenron.LAYER_LOCATION)), 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShenronEntity entity) {
		return new ResourceLocation("dragon_ball:textures/entities/shenron.png");
	}
}
