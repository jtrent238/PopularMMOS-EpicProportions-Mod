package com.jtrent238.epicproportions.items.tools.staffs;

import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class itemJenStaff  extends Item{

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		itemstack.damageItem(10, entityplayer);
			if (!world.isRemote)
			{
					
				Vec3 look = entityplayer.getLookVec();
				EntitySmallFireball fireball2 = new EntitySmallFireball(world, entityplayer, 1, 1, 1);
				fireball2.setPosition(
						entityplayer.posX + look.xCoord * 0,
						entityplayer.posY + look.yCoord * 0,
						entityplayer.posZ + look.zCoord * 0);
				fireball2.motionX = look.xCoord * 0.1;
				fireball2.motionY = look.yCoord * 0.1;
				fireball2.motionZ = look.zCoord * 0.1;
				world.spawnEntityInWorld(fireball2);
				}
			
			return itemstack;
			}
}
