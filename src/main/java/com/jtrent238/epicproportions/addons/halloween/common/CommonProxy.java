package com.jtrent238.epicproportions.addons.halloween.common;

import com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween;
import com.jtrent238.epicproportions.addons.halloween.container.ContainerPail;
import com.jtrent238.epicproportions.addons.halloween.gui.GuiPailInventory;
import com.jtrent238.epicproportions.addons.halloween.inventory.InventoryPail;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler{
	
	
	private static final String modid = epicproportionsmod_halloween.MODID;
	private String owner;

	public void init(FMLInitializationEvent e) {
	    
		}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    
	}

	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		// Hooray, no 'magic' numbers - we know exactly which Gui this refers to
		if (guiId == epicproportionsmod_halloween.GUI_ITEM_INV)
		{
			// Use the player's held item to create the inventory
			return new ContainerPail(player, player.inventory, new InventoryPail(player.getHeldItem()));
		}
		return null;
	}

	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		if (guiId == epicproportionsmod_halloween.GUI_ITEM_INV)
		{
			// We have to cast the new container as our custom class
			// and pass in currently held item for the inventory
			return new GuiPailInventory((ContainerPail) new ContainerPail(player, player.inventory, new InventoryPail(player.getHeldItem())));
		}
		return null;
	}

	
}
