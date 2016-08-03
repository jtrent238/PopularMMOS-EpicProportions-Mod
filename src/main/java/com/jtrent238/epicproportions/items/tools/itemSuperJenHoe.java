package com.jtrent238.epicproportions.items.tools;

import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class itemSuperJenHoe extends ItemHoe{

	private static final int enchant = ItemLoader.superenchantlvl;


	public itemSuperJenHoe(ToolMaterial EMERALD) {
		super(EMERALD);
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return true;
    }
	
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.addEnchantment(Enchantment.unbreaking, enchant);

}
	
}


