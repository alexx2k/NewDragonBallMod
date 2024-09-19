
package com.alexbalsillie.dragonball.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import com.alexbalsillie.dragonball.procedures.KaiokenActiveProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class KaiokenActiveOverlayOverlay {
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
		if (true) {
			if (KaiokenActiveProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dragon_ball.kaioken_active_overlay.label_kaioken_active"), w / 2 + 93, h / 2 + 106, -4849664, false);
		}
	}
}
