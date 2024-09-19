
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.alexbalsillie.dragonball.client.gui.ShenronWishGUIScreen;
import com.alexbalsillie.dragonball.client.gui.MoveLearnerScreen;
import com.alexbalsillie.dragonball.client.gui.GokusPouchScreen;
import com.alexbalsillie.dragonball.client.gui.FormLearnerScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonBallModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DragonBallModMenus.GOKUS_POUCH_GUI.get(), GokusPouchScreen::new);
			MenuScreens.register(DragonBallModMenus.SHENRON_WISH_GUI.get(), ShenronWishGUIScreen::new);
			MenuScreens.register(DragonBallModMenus.MOVE_LEARNER.get(), MoveLearnerScreen::new);
			MenuScreens.register(DragonBallModMenus.FORM_LEARNER.get(), FormLearnerScreen::new);
		});
	}
}
