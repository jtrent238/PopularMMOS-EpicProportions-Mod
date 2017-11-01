package com.jtrent238.epicproportions.items;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.Stats;
import com.jtrent238.epicproportions.entity.EntityNinjaStar;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNinjaStar extends Item
{
public ItemNinjaStar()
{
//this.setUnlocalizedName("grenade"); //Sets the name of this item, Has to be unique!
//this.setCreativeTab(CreativeTabs.tabCombat); //This Item will be in the Combat Creative Tab!
//this.setTextureName(GrenadeMod.MODID + ":" + "grenade"); //The texture for this item is the Grenade!
}

/**
 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
 */
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
	
	par3EntityPlayer.addStat(Stats.NinjaStarsThrown, 1);
	par3EntityPlayer.triggerAchievement(Achievements.achievementNinjaStar);
	
//This if statement is here to check that the Server is working
if (!par2World.isRemote)
{
/* This method in World spawn in an entity,
* You can use with anything that extends
* the Entity class, in this case it's
* the EntityGrenade class
*/
par2World.spawnEntityInWorld(new EntityNinjaStar(par2World, par3EntityPlayer));
//Decrease an item from the stack because you used it!
 --par1ItemStack.stackSize;
} return par1ItemStack;
}

/**
 * Render Pass sensitive version of hasEffect()
 */
public boolean hasEffect(ItemStack par1ItemStack, int pass)
{
//This means it will look "special" in the inventory
return false;
}
}