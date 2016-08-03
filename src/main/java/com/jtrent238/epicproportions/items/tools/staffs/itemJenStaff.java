package com.jtrent238.epicproportions.items.tools.staffs;

import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class itemJenStaff  extends Item{

	private EntityPlayer p_77659_3_;
	private ItemStack p_77659_1_;
	private Object p_77644_3_;
	private ItemStack world;

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		//itemstack.damageItem(100, entityplayer);
			if (!world.isRemote)
			{
					
				Vec3 look = entityplayer.getLookVec();
				EntitySmallFireball fireball2 = new EntitySmallFireball(world, entityplayer, 1, 1, 1);
				fireball2.setPosition(
						entityplayer.posX + look.xCoord * 5,
						entityplayer.posY + look.yCoord * 5,
						entityplayer.posZ + look.zCoord * 5);
				fireball2.accelerationX = look.xCoord * 0.1;
				fireball2.accelerationY = look.yCoord * 0.1;
				fireball2.accelerationZ = look.zCoord * 0.1;
				world.spawnEntityInWorld(fireball2);
				world.playSoundAtEntity(entityplayer, "epicproportionsmod:jen_staff_thunder", 1.0F, 1.0F);
				this.setItemDamage(itemJenStaff.getItemDamage() - 1);
				
				//p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
		        //return p_77659_1_;
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
