package com.jtrent238.epicproportions.addons.christmas.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemCandyCaneArmor extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public ItemCandyCaneArmor(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("ItemCandyCaneArmor");
	    this.setTextureName("epicproportionsmod_christmas:ItemCandyCaneArmor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return "epicproportionsmod_christmas:textures/armor/ItemCandyCaneArmor_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}