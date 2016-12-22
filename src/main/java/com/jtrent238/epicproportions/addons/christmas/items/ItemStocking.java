package com.jtrent238.epicproportions.addons.christmas.items;

import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class ItemStocking extends Item{
	
	public ItemStocking()
    {
        //this.DoorType = p_i45334_1_;
        this.maxStackSize = 1;
        this.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
        
    }
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
		 list.add(EnumChatFormatting.BOLD.UNDERLINE.RED.ITALIC + StatCollector.translateToLocal("tooltip." + epicproportionsmod_christmas.MODID + "." + "ItemStocking" + "." + "texture"));
		 list.add(EnumChatFormatting.BOLD.UNDERLINE.YELLOW.ITALIC + StatCollector.translateToLocal("tooltip." + epicproportionsmod_christmas.MODID + "." + "ItemStocking" + "." + "dealwithit"));
		  }
}
