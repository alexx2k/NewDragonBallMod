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

import com.alexbalsillie.dragonball.world.inventory.ShenronWishGUIMenu;
import com.alexbalsillie.dragonball.network.ShenronWishGUIButtonMessage;
import com.alexbalsillie.dragonball.DragonBallMod;

public class ShenronWishGUIScreen extends AbstractContainerScreen<ShenronWishGUIMenu> {
	private final static HashMap<String, Object> guistate = ShenronWishGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_i_wish_for_riches;
	Button button_i_wish_for_xp;
	Button button_i_wish_for_extra_life;
	Button button_i_wish_to_become_strong;

	public ShenronWishGUIScreen(ShenronWishGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("dragon_ball:textures/screens/shenron_wish_gui.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_i_wish_for_riches = Button.builder(Component.translatable("gui.dragon_ball.shenron_wish_gui.button_i_wish_for_riches"), e -> {
			if (true) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new ShenronWishGUIButtonMessage(0, x, y, z));
				ShenronWishGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 33, this.topPos + 16, 113, 20).build();
		guistate.put("button:button_i_wish_for_riches", button_i_wish_for_riches);
		this.addRenderableWidget(button_i_wish_for_riches);
		button_i_wish_for_xp = Button.builder(Component.translatable("gui.dragon_ball.shenron_wish_gui.button_i_wish_for_xp"), e -> {
			if (true) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new ShenronWishGUIButtonMessage(1, x, y, z));
				ShenronWishGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 42, this.topPos + 52, 92, 20).build();
		guistate.put("button:button_i_wish_for_xp", button_i_wish_for_xp);
		this.addRenderableWidget(button_i_wish_for_xp);
		button_i_wish_for_extra_life = Button.builder(Component.translatable("gui.dragon_ball.shenron_wish_gui.button_i_wish_for_extra_life"), e -> {
			if (true) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new ShenronWishGUIButtonMessage(2, x, y, z));
				ShenronWishGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 24, this.topPos + 88, 134, 20).build();
		guistate.put("button:button_i_wish_for_extra_life", button_i_wish_for_extra_life);
		this.addRenderableWidget(button_i_wish_for_extra_life);
		button_i_wish_to_become_strong = Button.builder(Component.translatable("gui.dragon_ball.shenron_wish_gui.button_i_wish_to_become_strong"), e -> {
			if (true) {
				DragonBallMod.PACKET_HANDLER.sendToServer(new ShenronWishGUIButtonMessage(3, x, y, z));
				ShenronWishGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 124, 144, 20).build();
		guistate.put("button:button_i_wish_to_become_strong", button_i_wish_to_become_strong);
		this.addRenderableWidget(button_i_wish_to_become_strong);
	}
}
