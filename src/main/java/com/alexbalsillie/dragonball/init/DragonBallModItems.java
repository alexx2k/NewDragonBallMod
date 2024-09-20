
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.alexbalsillie.dragonball.item.ShenronsPouchItem;
import com.alexbalsillie.dragonball.item.SensuBeanItemItem;
import com.alexbalsillie.dragonball.item.RawKiEnergyItem;
import com.alexbalsillie.dragonball.item.PowerPoleItem;
import com.alexbalsillie.dragonball.item.NamekianShipItemItem;
import com.alexbalsillie.dragonball.item.GreenScouterItem;
import com.alexbalsillie.dragonball.item.GokusPouchItemItem;
import com.alexbalsillie.dragonball.item.FriezasShipItemItem;
import com.alexbalsillie.dragonball.item.DragonBall7Item;
import com.alexbalsillie.dragonball.item.DragonBall6Item;
import com.alexbalsillie.dragonball.item.DragonBall5Item;
import com.alexbalsillie.dragonball.item.DragonBall4Item;
import com.alexbalsillie.dragonball.item.DragonBall3Item;
import com.alexbalsillie.dragonball.item.DragonBall2Item;
import com.alexbalsillie.dragonball.item.DragonBall1Item;
import com.alexbalsillie.dragonball.DragonBallMod;

public class DragonBallModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonBallMod.MODID);
	public static final RegistryObject<Item> DRAGON_BALL_LOOTCHEST = block(DragonBallModBlocks.DRAGON_BALL_LOOTCHEST);
	public static final RegistryObject<Item> GOKUS_POUCH_ITEM = REGISTRY.register("gokus_pouch_item", () -> new GokusPouchItemItem());
	public static final RegistryObject<Item> DRAGON_BALL_1 = REGISTRY.register("dragon_ball_1", () -> new DragonBall1Item());
	public static final RegistryObject<Item> DRAGON_BALL_2 = REGISTRY.register("dragon_ball_2", () -> new DragonBall2Item());
	public static final RegistryObject<Item> DRAGON_BALL_3 = REGISTRY.register("dragon_ball_3", () -> new DragonBall3Item());
	public static final RegistryObject<Item> DRAGON_BALL_4 = REGISTRY.register("dragon_ball_4", () -> new DragonBall4Item());
	public static final RegistryObject<Item> DRAGON_BALL_5 = REGISTRY.register("dragon_ball_5", () -> new DragonBall5Item());
	public static final RegistryObject<Item> DRAGON_BALL_6 = REGISTRY.register("dragon_ball_6", () -> new DragonBall6Item());
	public static final RegistryObject<Item> DRAGON_BALL_7 = REGISTRY.register("dragon_ball_7", () -> new DragonBall7Item());
	public static final RegistryObject<Item> SHENRON_SPAWN_EGG = REGISTRY.register("shenron_spawn_egg", () -> new ForgeSpawnEggItem(DragonBallModEntities.SHENRON, -16741609, -136960, new Item.Properties()));
	public static final RegistryObject<Item> SHENRONS_POUCH = REGISTRY.register("shenrons_pouch", () -> new ShenronsPouchItem());
	public static final RegistryObject<Item> RAW_KI_ENERGY = REGISTRY.register("raw_ki_energy", () -> new RawKiEnergyItem());
	public static final RegistryObject<Item> POWER_POLE = REGISTRY.register("power_pole", () -> new PowerPoleItem());
	public static final RegistryObject<Item> NAMEKIAN_WOOD = block(DragonBallModBlocks.NAMEKIAN_WOOD);
	public static final RegistryObject<Item> NAMEKIAN_LOG = block(DragonBallModBlocks.NAMEKIAN_LOG);
	public static final RegistryObject<Item> NAMEKIAN_PLANKS = block(DragonBallModBlocks.NAMEKIAN_PLANKS);
	public static final RegistryObject<Item> NAMEKIAN_LEAVES = block(DragonBallModBlocks.NAMEKIAN_LEAVES);
	public static final RegistryObject<Item> NAMEKIAN_STAIRS = block(DragonBallModBlocks.NAMEKIAN_STAIRS);
	public static final RegistryObject<Item> NAMEKIAN_SLAB = block(DragonBallModBlocks.NAMEKIAN_SLAB);
	public static final RegistryObject<Item> NAMEKIAN_FENCE = block(DragonBallModBlocks.NAMEKIAN_FENCE);
	public static final RegistryObject<Item> NAMEKIAN_FENCE_GATE = block(DragonBallModBlocks.NAMEKIAN_FENCE_GATE);
	public static final RegistryObject<Item> NAMEKIAN_PRESSURE_PLATE = block(DragonBallModBlocks.NAMEKIAN_PRESSURE_PLATE);
	public static final RegistryObject<Item> NAMEKIAN_BUTTON = block(DragonBallModBlocks.NAMEKIAN_BUTTON);
	public static final RegistryObject<Item> NAMEKIAN_DIRT = block(DragonBallModBlocks.NAMEKIAN_DIRT);
	public static final RegistryObject<Item> NAMEKIAN_GRASS = block(DragonBallModBlocks.NAMEKIAN_GRASS);
	public static final RegistryObject<Item> NAMEKIAN_SHIP_ITEM = REGISTRY.register("namekian_ship_item", () -> new NamekianShipItemItem());
	public static final RegistryObject<Item> FRIEZAS_SHIP_ITEM = REGISTRY.register("friezas_ship_item", () -> new FriezasShipItemItem());
	public static final RegistryObject<Item> NAMEKIAN_1_SPAWN_EGG = REGISTRY.register("namekian_1_spawn_egg", () -> new ForgeSpawnEggItem(DragonBallModEntities.NAMEKIAN_1, -16724992, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> NAMEKIAN_2_SPAWN_EGG = REGISTRY.register("namekian_2_spawn_egg", () -> new ForgeSpawnEggItem(DragonBallModEntities.NAMEKIAN_2, -16751104, -10092442, new Item.Properties()));
	public static final RegistryObject<Item> NAMEKIAN_3_SPAWN_EGG = REGISTRY.register("namekian_3_spawn_egg", () -> new ForgeSpawnEggItem(DragonBallModEntities.NAMEKIAN_3, -16724992, -16777012, new Item.Properties()));
	public static final RegistryObject<Item> GREEN_SCOUTER_HELMET = REGISTRY.register("green_scouter_helmet", () -> new GreenScouterItem.Helmet());
	public static final RegistryObject<Item> SENSU_BEAN_ITEM = REGISTRY.register("sensu_bean_item", () -> new SensuBeanItemItem());
	public static final RegistryObject<Item> KORIN_CRATE = block(DragonBallModBlocks.KORIN_CRATE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
