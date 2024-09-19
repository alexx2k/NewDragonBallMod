
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import com.alexbalsillie.dragonball.network.OpenMoveGUIMessage;
import com.alexbalsillie.dragonball.network.KiRechargeBindMessage;
import com.alexbalsillie.dragonball.network.KiBlastBindMessage;
import com.alexbalsillie.dragonball.network.KaiokenKeybindMessage;
import com.alexbalsillie.dragonball.network.InstantTransmissionKeybindMessage;
import com.alexbalsillie.dragonball.network.FormLearnerKeybindMessage;
import com.alexbalsillie.dragonball.DragonBallMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DragonBallModKeyMappings {
	public static final KeyMapping KI_RECHARGE_BIND = new KeyMapping("key.dragon_ball.ki_recharge_bind", GLFW.GLFW_KEY_C, "key.categories.dragonball") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new KiRechargeBindMessage(0, 0));
				KiRechargeBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				KI_RECHARGE_BIND_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - KI_RECHARGE_BIND_LASTPRESS);
				DragonBallMod.PACKET_HANDLER.sendToServer(new KiRechargeBindMessage(1, dt));
				KiRechargeBindMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping KI_BLAST_BIND = new KeyMapping("key.dragon_ball.ki_blast_bind", GLFW.GLFW_KEY_G, "key.categories.dragonball") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new KiBlastBindMessage(0, 0));
				KiBlastBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_MOVE_GUI = new KeyMapping("key.dragon_ball.open_move_gui", GLFW.GLFW_KEY_V, "key.categories.dragonball") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new OpenMoveGUIMessage(0, 0));
				OpenMoveGUIMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FORM_LEARNER_KEYBIND = new KeyMapping("key.dragon_ball.form_learner_keybind", GLFW.GLFW_KEY_B, "key.categories.dragonball") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new FormLearnerKeybindMessage(0, 0));
				FormLearnerKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping KAIOKEN_KEYBIND = new KeyMapping("key.dragon_ball.kaioken_keybind", GLFW.GLFW_KEY_K, "key.categories.dragonball") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new KaiokenKeybindMessage(0, 0));
				KaiokenKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping INSTANT_TRANSMISSION_KEYBIND = new KeyMapping("key.dragon_ball.instant_transmission_keybind", GLFW.GLFW_KEY_R, "key.categories.dragonball") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new InstantTransmissionKeybindMessage(0, 0));
				InstantTransmissionKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long KI_RECHARGE_BIND_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(KI_RECHARGE_BIND);
		event.register(KI_BLAST_BIND);
		event.register(OPEN_MOVE_GUI);
		event.register(FORM_LEARNER_KEYBIND);
		event.register(KAIOKEN_KEYBIND);
		event.register(INSTANT_TRANSMISSION_KEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				KI_RECHARGE_BIND.consumeClick();
				KI_BLAST_BIND.consumeClick();
				OPEN_MOVE_GUI.consumeClick();
				FORM_LEARNER_KEYBIND.consumeClick();
				KAIOKEN_KEYBIND.consumeClick();
				INSTANT_TRANSMISSION_KEYBIND.consumeClick();
			}
		}
	}
}
