
package com.alexbalsillie.dragonball.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.alexbalsillie.dragonball.procedures.KiChargerBaubleWhileBaubleIsEquippedTickProcedure;

public class KiChargerBaubleItem extends Item implements ICurioItem {
	public KiChargerBaubleItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Regenerates 3Ki/s when in curio slot"));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		KiChargerBaubleWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity());
	}
}
