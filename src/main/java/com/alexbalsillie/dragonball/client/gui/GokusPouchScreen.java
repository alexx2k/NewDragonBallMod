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

import com.alexbalsillie.dragonball.world.inventory.GokusPouchMenu;
import com.alexbalsillie.dragonball.procedures.DisplaySummonButtonProcedure;
import com.alexbalsillie.dragonball.network.GokusPouchButtonMessage;
import com.alexbalsillie.dragonball.DragonBallMod;

public class GokusPouchScreen extends AbstractContainerScreen<GokusPouchMenu> {
	private final static HashMap<String, Object> guistate = GokusPouchMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_summon;

	public GokusPouchScreen(GokusPouchMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 190;
	}

	private static final ResourceLocation texture = new ResourceLocation("dragon_ball:textures/screens/gokus_pouch_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.dragon_ball.gokus_pouch_gui.label_gokus_pouch"), 8, 8, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_summon = Button.builder(Component.translatable("gui.dragon_ball.gokus_pouch_gui.button_summon"), e -> {
			if (DisplaySummonButtonProcedure.execute(entity)) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new GokusPouchButtonMessage(0, x, y, z));
				GokusPouchButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 114, this.topPos + 4, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (DisplaySummonButtonProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_summon", button_summon);
		this.addRenderableWidget(button_summon);
	}
}
