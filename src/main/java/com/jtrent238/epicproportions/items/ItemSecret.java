package com.jtrent238.epicproportions.items;

import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class ItemSecret extends Item{

	private static final int enchant = (int) ((float)ItemLoader.superenchantlvl * 9000);
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return true;
    }
	
	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 list.add(EnumChatFormatting.DARK_PURPLE + StatCollector.translateToLocal("tooltip." + EpicProportionsMod.MODID + "." + "ItemSecret" + "." + "special"));
	
	  }
}
