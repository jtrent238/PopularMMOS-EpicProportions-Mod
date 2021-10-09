package com.jtrent238.epicproportions.addons.halloween.items;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class itemCandy extends ItemFood{

	public itemCandy(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setPotionEffect(Potion.moveSpeed, 22F, 22F, 1F);
		this.setPotionEffect(Potion.jump, 22F, 22F, 1F);
		this.setPotionEffect(Potion.regeneration, 22F, 22F, 1F);
		this.setPotionEffect(Potion.heal, 22F, 22F, 1F);
		this.setPotionEffect(Potion.digSpeed, 22F, 22F, 1F);
	}

	private void setPotionEffect(Potion movespeed, float f, float g, float p_77844_4_) {
		
	}

}
