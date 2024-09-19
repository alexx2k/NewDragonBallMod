
package com.alexbalsillie.dragonball.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import com.alexbalsillie.dragonball.world.inventory.ShenronWishGUIMenu;
import com.alexbalsillie.dragonball.procedures.XPWishProcedure;
import com.alexbalsillie.dragonball.procedures.StrengthWishProcedure;
import com.alexbalsillie.dragonball.procedures.RichesWishProcedure;
import com.alexbalsillie.dragonball.procedures.HeartsWishProcedure;
import com.alexbalsillie.dragonball.DragonBallMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShenronWishGUIButtonMessage {
	private final int buttonID, x, y, z;

	public ShenronWishGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ShenronWishGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ShenronWishGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ShenronWishGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ShenronWishGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RichesWishProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			XPWishProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			HeartsWishProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			StrengthWishProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		DragonBallMod.addNetworkMessage(ShenronWishGUIButtonMessage.class, ShenronWishGUIButtonMessage::buffer, ShenronWishGUIButtonMessage::new, ShenronWishGUIButtonMessage::handler);
	}
}
