package com.jtrent238.epicproportions.items.tools;


import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class itemSuperPatHoe extends ItemHoe{

	private static final int enchant = ItemLoader.superenchantlvl;
	private boolean hasenchanted;

	public itemSuperPatHoe(ToolMaterial EMERALD) {
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
    public void onUsingTick(ItemStack par1ItemStack, EntityPlayer player, int count) {
	    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, par1ItemStack);
	    if (lvl <= 0) {
			par1ItemStack.addEnchantment(Enchantment.unbreaking, enchant);
	    } 
	  }
	/**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
	public void onUpdate(ItemStack par1ItemStack, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) 
	    {
			int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, par1ItemStack);
		    if (lvl <= 0) {
				par1ItemStack.addEnchantment(Enchantment.unbreaking, enchant);
		    } 
	    }
}


