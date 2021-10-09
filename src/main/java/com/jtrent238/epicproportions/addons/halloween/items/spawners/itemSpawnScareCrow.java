package com.jtrent238.epicproportions.addons.halloween.items.spawners;

import com.jtrent238.epicproportions.addons.halloween.entity.EntityScareCrow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemSpawnScareCrow extends Item
{


    //This allows Right Click to spawn entity
    public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer entityplayer)
    {
    if(!world.isRemote)
    {
    	EntityScareCrow par1 = new EntityScareCrow(world);
    par1.setPosition(entityplayer.posX, entityplayer.posY+2,entityplayer.posZ+2); //These are the coordinates where he will appear 
    world.spawnEntityInWorld(par1);
    }
    //entityplayer.addChatMessage("Its Captian Cookie!"); //This is a message you can add when he is spawned
    itemstack.damageItem(1, entityplayer); return itemstack;
    }
    
}