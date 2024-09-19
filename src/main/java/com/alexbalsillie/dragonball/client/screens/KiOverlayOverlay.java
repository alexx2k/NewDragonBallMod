
package com.alexbalsillie.dragonball.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.alexbalsillie.dragonball.procedures.KiStage9Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage8Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage7Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage6Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage5Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage4Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage3Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage2Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage1Procedure;
import com.alexbalsillie.dragonball.procedures.KiStage10Procedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class KiOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 14, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 21, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 28, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 35, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 42, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 49, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 56, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 63, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 70, h - 54, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/empty_ki.png"), w / 2 + 77, h - 54, 0, 0, 16, 16, 16, 16);

			if (KiStage1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 14, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 21, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 28, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 35, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 42, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 49, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 56, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 63, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 70, h - 54, 0, 0, 16, 16, 16, 16);
			}
			if (KiStage10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/ki_full.png"), w / 2 + 77, h - 54, 0, 0, 16, 16, 16, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
