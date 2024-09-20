
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.alexbalsillie.dragonball.block.PlanetNamekPortalBlock;
import com.alexbalsillie.dragonball.block.NamekianWoodBlock;
import com.alexbalsillie.dragonball.block.NamekianStairsBlock;
import com.alexbalsillie.dragonball.block.NamekianSlabBlock;
import com.alexbalsillie.dragonball.block.NamekianPressurePlateBlock;
import com.alexbalsillie.dragonball.block.NamekianPlanksBlock;
import com.alexbalsillie.dragonball.block.NamekianLogBlock;
import com.alexbalsillie.dragonball.block.NamekianLeavesBlock;
import com.alexbalsillie.dragonball.block.NamekianGrassBlock;
import com.alexbalsillie.dragonball.block.NamekianFenceGateBlock;
import com.alexbalsillie.dragonball.block.NamekianFenceBlock;
import com.alexbalsillie.dragonball.block.NamekianDirtBlock;
import com.alexbalsillie.dragonball.block.NamekianButtonBlock;
import com.alexbalsillie.dragonball.block.KorinCrateBlock;
import com.alexbalsillie.dragonball.block.DragonBallLootchestBlock;
import com.alexbalsillie.dragonball.DragonBallMod;

public class DragonBallModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DragonBallMod.MODID);
	public static final RegistryObject<Block> DRAGON_BALL_LOOTCHEST = REGISTRY.register("dragon_ball_lootchest", () -> new DragonBallLootchestBlock());
	public static final RegistryObject<Block> NAMEKIAN_WOOD = REGISTRY.register("namekian_wood", () -> new NamekianWoodBlock());
	public static final RegistryObject<Block> NAMEKIAN_LOG = REGISTRY.register("namekian_log", () -> new NamekianLogBlock());
	public static final RegistryObject<Block> NAMEKIAN_PLANKS = REGISTRY.register("namekian_planks", () -> new NamekianPlanksBlock());
	public static final RegistryObject<Block> NAMEKIAN_LEAVES = REGISTRY.register("namekian_leaves", () -> new NamekianLeavesBlock());
	public static final RegistryObject<Block> NAMEKIAN_STAIRS = REGISTRY.register("namekian_stairs", () -> new NamekianStairsBlock());
	public static final RegistryObject<Block> NAMEKIAN_SLAB = REGISTRY.register("namekian_slab", () -> new NamekianSlabBlock());
	public static final RegistryObject<Block> NAMEKIAN_FENCE = REGISTRY.register("namekian_fence", () -> new NamekianFenceBlock());
	public static final RegistryObject<Block> NAMEKIAN_FENCE_GATE = REGISTRY.register("namekian_fence_gate", () -> new NamekianFenceGateBlock());
	public static final RegistryObject<Block> NAMEKIAN_PRESSURE_PLATE = REGISTRY.register("namekian_pressure_plate", () -> new NamekianPressurePlateBlock());
	public static final RegistryObject<Block> NAMEKIAN_BUTTON = REGISTRY.register("namekian_button", () -> new NamekianButtonBlock());
	public static final RegistryObject<Block> NAMEKIAN_DIRT = REGISTRY.register("namekian_dirt", () -> new NamekianDirtBlock());
	public static final RegistryObject<Block> NAMEKIAN_GRASS = REGISTRY.register("namekian_grass", () -> new NamekianGrassBlock());
	public static final RegistryObject<Block> PLANET_NAMEK_PORTAL = REGISTRY.register("planet_namek_portal", () -> new PlanetNamekPortalBlock());
	public static final RegistryObject<Block> KORIN_CRATE = REGISTRY.register("korin_crate", () -> new KorinCrateBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
