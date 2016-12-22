package com.jtrent238.epicproportions.addons.christmas.items;

import java.util.Random;

import com.jtrent238.epicproportions.addons.christmas.Achievements;
import com.jtrent238.epicproportions.addons.christmas.Stats;
import com.jtrent238.epicproportions.addons.christmas.entity.EntitySanta;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemSnowWand extends Item{
	
	public ItemSnowWand(){
		this.setMaxStackSize(1);
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 * @param EntitySnowball 
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_, Entity EntitySnowball)
    {
        
    	p_77659_3_.playSound("epicproportionsmod_christmas:SnowWand_Blow", 5F, 5F);
    	//p_77659_3_.addStat(Stats.JingleBellsJingled, 1);
    	//p_77659_3_.triggerAchievement(Achievements.achievementJingleBells);
    	p_77659_2_.spawnEntityInWorld(EntitySnowball);
    	p_77659_2_.setRainStrength(5F);
		p_77659_2_.canSnowAtBody(p_77659_3_.serverPosX, p_77659_3_.serverPosY, p_77659_3_.serverPosZ, true);

    	if(!p_77659_2_.isRemote)
        {
    		EntitySnowball par1 = new EntitySnowball(p_77659_2_);
    		
    		Random rand = new Random();
    		int snowBallPos = rand.nextInt(50) + 1;
    		
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
    		par1.setPosition(p_77659_3_.posX + snowBallPos, p_77659_3_.posY + snowBallPos,p_77659_3_.posZ + snowBallPos); 
            
        p_77659_2_.spawnEntityInWorld(par1);
        }
    	
    	Random rand = new Random();
    	int snowPos = rand.nextInt(50) + 1;
    	
		p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);
    	p_77659_2_.setBlock(p_77659_3_.serverPosX + snowPos, p_77659_3_.serverPosY, p_77659_3_.serverPosZ + snowPos, Blocks.snow_layer);    	
    	
    	return p_77659_1_;
    }
}

