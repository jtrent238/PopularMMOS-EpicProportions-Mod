package com.jtrent238.epicproportions.addons.halloween.items.spawners;

import com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyCaptianCookie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemSpawnSpookyCaptainCookie       extends Item
{


    //This allows Right Click to spawn entity
    public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer entityplayer)
    {
    if(!world.isRemote)
    {
    	EntitySpookyCaptianCookie par1 = new EntitySpookyCaptianCookie(world); //Just change"MyEntityCow" to any entity you would like to spawn
    par1.setPosition(entityplayer.posX, entityplayer.posY+2,entityplayer.posZ+2); //These are the coordinates where he will appear 
    world.spawnEntityInWorld(par1);
    }
    //entityplayer.addChatMessage("Its Captian Cookie!"); //This is a message you can add when he is spawned
    itemstack.damageItem(1, entityplayer); return itemstack;
    }
    
}