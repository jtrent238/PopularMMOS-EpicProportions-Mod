package com.jtrent238.epicproportions.addons.halloween.items;

import com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween;
import com.jtrent238.epicproportions.addons.halloween.inventory.InventoryPail;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemHalloweenPail extends Item
{
	public itemHalloweenPail(int par1)
	{
		super();
		// ItemStacks that store an NBT Tag Compound are limited to stack size of 1
		setMaxStackSize(1);
		// you'll want to set a creative tab as well, so you can get your item
		//setCreativeTab(CreativeTabs.tabMisc);
	}

	// Without this method, your inventory will NOT work!!!
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1; // return any value greater than zero
	}
   
    	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			// If player not sneaking, open the inventory gui
			if (!player.isSneaking()) {
				player.openGui(epicproportionsmod_halloween.instance, epicproportionsmod_halloween.GUI_ITEM_INV, world, 0, 0, 0);
			}
			
			// Otherwise, stealthily place some diamonds in there for a nice surprise next time you open it up :)
			else {
				new InventoryPail(player.getHeldItem()).setInventorySlotContents(0, new ItemStack(Items.diamond,4));
			}
		}
		
		return itemstack;
	}
/*
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("inventoryitemmod:" + this.getUnlocalizedName().substring(5));
	}
}*/}