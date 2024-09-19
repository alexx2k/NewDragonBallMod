package com.alexbalsillie.dragonball.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import com.alexbalsillie.dragonball.network.DragonBallModVariables;
import com.alexbalsillie.dragonball.init.DragonBallModItems;
import com.alexbalsillie.dragonball.DragonBallMod;

public class DragonBallLootchestOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (DragonBallModVariables.WorldVariables.get(world).ballsFound == 7) {
			DragonBallModVariables.WorldVariables.get(world).ballsFound = 0;
			DragonBallModVariables.WorldVariables.get(world).syncData(world);
		}
		DragonBallMod.LOGGER.info(DragonBallModVariables.WorldVariables.get(world).ballsFound);
		DragonBallModVariables.WorldVariables.get(world).ballsFound = DragonBallModVariables.WorldVariables.get(world).ballsFound + 1;
		DragonBallModVariables.WorldVariables.get(world).syncData(world);
		DragonBallMod.LOGGER.info(DragonBallModVariables.WorldVariables.get(world).ballsFound);
		if (DragonBallModVariables.WorldVariables.get(world).ballsFound == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DragonBallModItems.DRAGON_BALL_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Someone has discovered the 1 star ball"), false);
		} else if (DragonBallModVariables.WorldVariables.get(world).ballsFound == 2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DragonBallModItems.DRAGON_BALL_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Someone has discovered the 2 star ball"), false);
		} else if (DragonBallModVariables.WorldVariables.get(world).ballsFound == 3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DragonBallModItems.DRAGON_BALL_3.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Someone has discovered the 3 star ball"), false);
		} else if (DragonBallModVariables.WorldVariables.get(world).ballsFound == 4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DragonBallModItems.DRAGON_BALL_4.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Someone has discovered the 4 star ball"), false);
		} else if (DragonBallModVariables.WorldVariables.get(world).ballsFound == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DragonBallModItems.DRAGON_BALL_5.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Someone has discovered the 5 star ball"), false);
		} else if (DragonBallModVariables.WorldVariables.get(world).ballsFound == 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DragonBallModItems.DRAGON_BALL_6.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Someone has discovered the 6 star ball"), false);
		} else {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DragonBallModItems.DRAGON_BALL_7.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Someone has discovered the 7 star ball"), false);
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
