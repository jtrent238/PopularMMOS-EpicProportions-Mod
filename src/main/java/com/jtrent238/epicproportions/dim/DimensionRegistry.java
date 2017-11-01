package com.jtrent238.epicproportions.dim;

import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	
	public static void mainRegistry(){
		registerDimension();
	}
	
	public static final int dimensionId = 8;
	
	public static void registerDimension(){
		DimensionManager.registerProviderType(dimensionId, WorldProviderEpic.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
		
	}

}