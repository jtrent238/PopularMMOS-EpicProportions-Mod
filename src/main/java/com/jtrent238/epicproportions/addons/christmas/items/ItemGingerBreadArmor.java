package com.jtrent238.epicproportions.addons.christmas.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemGingerBreadArmor extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public ItemGingerBreadArmor(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("ItemGingerBreadArmor");
	    this.setTextureName("epicproportionsmod_christmas:ItemGingerBreadArmor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return "epicproportionsmod_christmas:textures/armor/ItemGingerBreadArmor_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}