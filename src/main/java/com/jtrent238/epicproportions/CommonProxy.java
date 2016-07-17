package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.worldgen.ModWorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void init(FMLInitializationEvent e) {
	    GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}
}