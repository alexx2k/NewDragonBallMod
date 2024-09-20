
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.alexbalsillie.dragonball.DragonBallMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonBallModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DragonBallMod.MODID);
	public static final RegistryObject<CreativeModeTab> DRAGON_BALL_TAB = REGISTRY.register("dragon_ball_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dragon_ball.dragon_ball_tab")).icon(() -> new ItemStack(DragonBallModItems.DRAGON_BALL_4.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DragonBallModItems.GOKUS_POUCH_ITEM.get());
				tabData.accept(DragonBallModItems.DRAGON_BALL_1.get());
				tabData.accept(DragonBallModItems.DRAGON_BALL_2.get());
				tabData.accept(DragonBallModItems.DRAGON_BALL_3.get());
				tabData.accept(DragonBallModItems.DRAGON_BALL_4.get());
				tabData.accept(DragonBallModItems.DRAGON_BALL_5.get());
				tabData.accept(DragonBallModItems.DRAGON_BALL_6.get());
				tabData.accept(DragonBallModItems.DRAGON_BALL_7.get());
				tabData.accept(DragonBallModItems.SHENRONS_POUCH.get());
				tabData.accept(DragonBallModItems.SHENRON_SPAWN_EGG.get());
				tabData.accept(DragonBallModItems.RAW_KI_ENERGY.get());
				tabData.accept(DragonBallModItems.POWER_POLE.get());
				tabData.accept(DragonBallModItems.NAMEKIAN_SHIP_ITEM.get());
				tabData.accept(DragonBallModItems.NAMEKIAN_1_SPAWN_EGG.get());
				tabData.accept(DragonBallModItems.NAMEKIAN_2_SPAWN_EGG.get());
				tabData.accept(DragonBallModItems.NAMEKIAN_3_SPAWN_EGG.get());
				tabData.accept(DragonBallModItems.GREEN_SCOUTER_HELMET.get());
				tabData.accept(DragonBallModItems.SENSU_BEAN_ITEM.get());
				tabData.accept(DragonBallModBlocks.KORIN_CRATE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DragonBallModBlocks.NAMEKIAN_WOOD.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_LOG.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_PLANKS.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_STAIRS.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_SLAB.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_FENCE.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_FENCE_GATE.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_PRESSURE_PLATE.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DragonBallModItems.GREEN_SCOUTER_HELMET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DragonBallModItems.SHENRON_SPAWN_EGG.get());
			tabData.accept(DragonBallModItems.NAMEKIAN_1_SPAWN_EGG.get());
			tabData.accept(DragonBallModItems.NAMEKIAN_2_SPAWN_EGG.get());
			tabData.accept(DragonBallModItems.NAMEKIAN_3_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DragonBallModBlocks.NAMEKIAN_LEAVES.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_DIRT.get().asItem());
			tabData.accept(DragonBallModBlocks.NAMEKIAN_GRASS.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(DragonBallModItems.SENSU_BEAN_ITEM.get());
		}
	}
}
