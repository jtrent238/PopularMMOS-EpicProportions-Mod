package com.jtrent238.epicproportions.addons.christmas.common;


import com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {
	
	
	private static final String modid = epicproportionsmod_halloween.MODID;
	private String owner;

	public void init(FMLInitializationEvent e) {
		 
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    
	}

	
}
