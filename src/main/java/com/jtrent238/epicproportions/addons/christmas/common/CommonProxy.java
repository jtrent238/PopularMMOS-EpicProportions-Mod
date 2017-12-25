package com.jtrent238.epicproportions.addons.christmas.common;


import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {
	
	
	private static final String modid = epicproportionsmod_christmas.MODID;
	private String owner;
	public void registerRenderThings() {}
	public void registerSounds() {}
	
	public void init(FMLInitializationEvent e) {
		 
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event){
	    
	}
}
