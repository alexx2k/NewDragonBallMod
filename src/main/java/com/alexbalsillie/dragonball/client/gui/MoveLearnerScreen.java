package com.alexbalsillie.dragonball.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.alexbalsillie.dragonball.world.inventory.MoveLearnerMenu;
import com.alexbalsillie.dragonball.procedures.KiBlastLearnedProcedure;
import com.alexbalsillie.dragonball.procedures.KiBlastLearnableProcedure;
import com.alexbalsillie.dragonball.procedures.InstantTransmissionNotLearnedProcedure;
import com.alexbalsillie.dragonball.procedures.InstantTransmissionLearnedProcedure;
import com.alexbalsillie.dragonball.procedures.FlightNotLearnedProcedure;
import com.alexbalsillie.dragonball.procedures.FlightLearnedProcedure;
import com.alexbalsillie.dragonball.network.MoveLearnerButtonMessage;
import com.alexbalsillie.dragonball.DragonBallMod;

public class MoveLearnerScreen extends AbstractContainerScreen<MoveLearnerMenu> {
	private final static HashMap<String, Object> guistate = MoveLearnerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_learn_ki_blast;
	Button button_learn_flight;
	Button button_learn_instant_transmission;

	public MoveLearnerScreen(MoveLearnerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("dragon_ball:textures/screens/move_learner.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dragon_ball.move_learner.label_learn_moves"), 48, 3, -12829636, false);
		if (KiBlastLearnedProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dragon_ball.move_learner.label_ki_blast_learned"), 47, 26, -12829636, false);
		if (FlightLearnedProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dragon_ball.move_learner.label_flight_learned"), 51, 55, -12829636, false);
		if (InstantTransmissionLearnedProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dragon_ball.move_learner.label_instant_transmission_learned"), 11, 83, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_learn_ki_blast = Button.builder(Component.translatable("gui.dragon_ball.move_learner.button_learn_ki_blast"), e -> {
			if (KiBlastLearnableProcedure.execute(entity)) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new MoveLearnerButtonMessage(0, x, y, z));
				MoveLearnerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 39, this.topPos + 22, 98, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (KiBlastLearnableProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_learn_ki_blast", button_learn_ki_blast);
		this.addRenderableWidget(button_learn_ki_blast);
		button_learn_flight = Button.builder(Component.translatable("gui.dragon_ball.move_learner.button_learn_flight"), e -> {
			if (FlightNotLearnedProcedure.execute(entity)) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new MoveLearnerButtonMessage(1, x, y, z));
				MoveLearnerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 51, 87, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (FlightNotLearnedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_learn_flight", button_learn_flight);
		this.addRenderableWidget(button_learn_flight);
		button_learn_instant_transmission = Button.builder(Component.translatable("gui.dragon_ball.move_learner.button_learn_instant_transmission"), e -> {
			if (InstantTransmissionNotLearnedProcedure.execute(entity)) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new MoveLearnerButtonMessage(2, x, y, z));
				MoveLearnerButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 78, 161, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (InstantTransmissionNotLearnedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_learn_instant_transmission", button_learn_instant_transmission);
		this.addRenderableWidget(button_learn_instant_transmission);
	}
}
