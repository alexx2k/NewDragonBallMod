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

import com.alexbalsillie.dragonball.world.inventory.FormLearnerMenu;
import com.alexbalsillie.dragonball.procedures.KaiokenNotLearnedProcedure;
import com.alexbalsillie.dragonball.procedures.KaiokenLearnedProcedure;
import com.alexbalsillie.dragonball.network.FormLearnerButtonMessage;
import com.alexbalsillie.dragonball.DragonBallMod;

public class FormLearnerScreen extends AbstractContainerScreen<FormLearnerMenu> {
	private final static HashMap<String, Object> guistate = FormLearnerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_learn_kaioken_15;

	public FormLearnerScreen(FormLearnerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("dragon_ball:textures/screens/form_learner.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dragon_ball.form_learner.label_learn_forms"), 60, 4, -12829636, false);
		if (KaiokenLearnedProcedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.dragon_ball.form_learner.label_kaioken_learned"), 51, 25, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_learn_kaioken_15 = Button.builder(Component.translatable("gui.dragon_ball.form_learner.button_learn_kaioken_15"), e -> {
			if (KaiokenNotLearnedProcedure.execute(entity)) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new FormLearnerButtonMessage(0, x, y, z));
				FormLearnerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 29, this.topPos + 21, 119, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (KaiokenNotLearnedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_learn_kaioken_15", button_learn_kaioken_15);
		this.addRenderableWidget(button_learn_kaioken_15);
	}
}
