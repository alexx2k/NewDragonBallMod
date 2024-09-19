
package com.alexbalsillie.dragonball.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DragonBall2Item extends Item {
	public DragonBall2Item() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
