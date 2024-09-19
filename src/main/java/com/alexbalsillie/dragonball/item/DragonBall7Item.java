
package com.alexbalsillie.dragonball.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonBall7Item extends Item {
	public DragonBall7Item() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
