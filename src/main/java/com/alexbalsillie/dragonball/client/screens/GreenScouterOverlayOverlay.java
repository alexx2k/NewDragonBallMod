
package com.alexbalsillie.dragonball.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.alexbalsillie.dragonball.procedures.IsWearingGreenScouterProcedure;
import com.alexbalsillie.dragonball.procedures.GetMaxHealthLookingAtProcedure;
import com.alexbalsillie.dragonball.procedures.GetEntityLookingAtProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class GreenScouterOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
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
		if (IsWearingGreenScouterProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("dragon_ball:textures/screens/greenscouterguiblockbig.png"), -51, h / 2 + -67, 0, 0, 128, 128, 128, 128);

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dragon_ball.green_scouter_overlay.label_entity_information"), 9, h / 2 + -64, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetMaxHealthLookingAtProcedure.execute(world, x, y, z, entity), 9, h / 2 + 47, -1, false);
			if (GetEntityLookingAtProcedure.execute(world, x, y, z, entity) instanceof LivingEntity livingEntity) {
				InventoryScreen.renderEntityInInventoryFollowsAngle(event.getGuiGraphics(), 37, h / 2 + 41, 40, 0f, 0, livingEntity);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
