package com.jtrent238.epicproportions.items.tools.staffs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class itemPatStaff extends Item{

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		itemstack.damageItem(10, entityplayer);
			if (!world.isRemote)
			{
					
				Vec3 look = entityplayer.getLookVec();
				EntityLargeFireball fireball2 = new EntityLargeFireball(world, entityplayer, 1, 1, 1);
				fireball2.setPosition(
						entityplayer.posX + look.xCoord * 5,
						entityplayer.posY + look.yCoord * 5,
						entityplayer.posZ + look.zCoord * 5);
				fireball2.accelerationX = look.xCoord * 0.1;
				fireball2.accelerationY = look.yCoord * 0.1;
				fireball2.accelerationZ = look.zCoord * 0.1;
				world.spawnEntityInWorld(fireball2);
				world.playSoundAtEntity(entityplayer, "epicproportionsmod:pat_staff_thunder", 1.0F, 1.0F);
				this.setItemDamage(itemPatStaff.getItemDamage() - 1);
					
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
