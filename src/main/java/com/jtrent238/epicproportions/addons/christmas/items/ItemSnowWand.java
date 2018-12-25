package com.jtrent238.epicproportions.addons.christmas.items;

import java.util.Random;

import com.jtrent238.epicproportions.addons.christmas.entity.EntityGiantSnowBall;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemSnowWand extends Item{

	
	
	Random rand = new Random();

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		itemstack.damageItem(10, entityplayer);
			if (!world.isRemote)
			{
					
				Vec3 look = entityplayer.getLookVec();
				EntityGiantSnowBall BigSBall = new EntityGiantSnowBall(world, 1, 1, 1);
				BigSBall.setPosition(
						entityplayer.posX + look.xCoord * 5,
						entityplayer.posY + look.yCoord * 5,
						entityplayer.posZ + look.zCoord * 5);
				BigSBall.lastTickPosX = look.xCoord * 0.1;
				BigSBall.lastTickPosY = look.yCoord * 0.1;
				BigSBall.lastTickPosZ = look.zCoord * 0.1;
				world.spawnEntityInWorld(BigSBall);
				world.playSoundAtEntity(entityplayer, "epicproportionsmod_christmas:SnowWand_Blow", 1.0F, 1.0F);
				this.setItemDamage(ItemSnowWand.getItemDamage() - 1);
					
				
				Block block = Blocks.snow_layer;
	    		int snow_posX = (int) entityplayer.posX;
	    		int snow_posY = (int) entityplayer.posY;
	    		int snow_posZ = (int) entityplayer.posZ;
	            
	            for (int SnowLoop = 0; SnowLoop < 100; SnowLoop++) {
	        		int snowmax = 250;
	        		int snowmin = -250;
	                int randomSnow = rand.nextInt((snowmax - snowmin) + 1) + snowmin;
	            	world.setBlock(snow_posX + randomSnow, snow_posY + randomSnow, snow_posZ - randomSnow, block);
	            	world.setBlock(snow_posX - randomSnow, snow_posY - randomSnow, snow_posZ + randomSnow, block);
	            	world.setBlock(snow_posX - randomSnow, snow_posY + randomSnow, snow_posZ - randomSnow, block);
	            	world.setBlock(snow_posX + randomSnow, snow_posY - randomSnow, snow_posZ + randomSnow, block);
	            
					EntityFallingBlock FallingSnow = new EntityFallingBlock(world, snow_posX, snow_posY, snow_posZ, Blocks.snow, randomSnow);
					FallingSnow.setPosition(
							snow_posX, snow_posY, snow_posZ);
					FallingSnow.lastTickPosX = snow_posX * randomSnow;
					FallingSnow.lastTickPosY = snow_posY * randomSnow;
					FallingSnow.lastTickPosZ = snow_posZ * randomSnow;
					world.spawnEntityInWorld(FallingSnow);
	            }
			}
			
			return itemstack;
			}
	
	private void setItemDamage(int i) {
		
	}

	private static int getItemDamage() {
		return 100;
	}
	
	/**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 250;
    }
    
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.block;
    }
}