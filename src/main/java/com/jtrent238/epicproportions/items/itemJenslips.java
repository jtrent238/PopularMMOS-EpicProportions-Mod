package com.jtrent238.epicproportions.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class itemJenslips extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public itemJenslips(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("itemJenslips");
	    this.setTextureName("epicproportionsmod:itemJenslips");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return "epicproportionsmod:textures/armor/itemJenslips_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}