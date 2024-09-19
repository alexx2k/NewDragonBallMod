
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.alexbalsillie.dragonball.world.inventory.ShenronWishGUIMenu;
import com.alexbalsillie.dragonball.world.inventory.MoveLearnerMenu;
import com.alexbalsillie.dragonball.world.inventory.GokusPouchMenu;
import com.alexbalsillie.dragonball.world.inventory.FormLearnerMenu;
import com.alexbalsillie.dragonball.DragonBallMod;

public class DragonBallModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DragonBallMod.MODID);
	public static final RegistryObject<MenuType<GokusPouchMenu>> GOKUS_POUCH_GUI = REGISTRY.register("gokus_pouch_gui", () -> IForgeMenuType.create(GokusPouchMenu::new));
	public static final RegistryObject<MenuType<ShenronWishGUIMenu>> SHENRON_WISH_GUI = REGISTRY.register("shenron_wish_gui", () -> IForgeMenuType.create(ShenronWishGUIMenu::new));
	public static final RegistryObject<MenuType<MoveLearnerMenu>> MOVE_LEARNER = REGISTRY.register("move_learner", () -> IForgeMenuType.create(MoveLearnerMenu::new));
	public static final RegistryObject<MenuType<FormLearnerMenu>> FORM_LEARNER = REGISTRY.register("form_learner", () -> IForgeMenuType.create(FormLearnerMenu::new));
}
