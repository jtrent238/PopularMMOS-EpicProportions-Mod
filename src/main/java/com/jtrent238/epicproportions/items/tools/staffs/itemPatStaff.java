package com.jtrent238.epicproportions.items.tools.staffs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
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
				}
			
			return itemstack;
			}
}
