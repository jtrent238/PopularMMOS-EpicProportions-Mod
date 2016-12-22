package com.jtrent238.epicproportions.addons.christmas.items;

import com.jtrent238.epicproportions.addons.christmas.Achievements;
import com.jtrent238.epicproportions.addons.christmas.Stats;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemJingleBells extends Item{

	public ItemJingleBells(){
		this.setMaxStackSize(1);
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        
    	p_77659_3_.playSound("epicproportionsmod_christmas:JingleBells_Jingle", 5F, 5F);
    	p_77659_3_.addStat(Stats.JingleBellsJingled, 1);
    	p_77659_3_.triggerAchievement(Achievements.achievementJingleBells);
    	
    	return p_77659_1_;
    }
}
