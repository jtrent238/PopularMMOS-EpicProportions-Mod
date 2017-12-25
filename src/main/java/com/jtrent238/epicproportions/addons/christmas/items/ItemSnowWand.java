package com.jtrent238.epicproportions.addons.christmas.items;

import com.jtrent238.epicproportions.addons.christmas.entity.EntityGiantSnowBall;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemSnowWand extends Item{

	
	
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
