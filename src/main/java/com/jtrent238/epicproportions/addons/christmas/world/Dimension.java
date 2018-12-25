package com.jtrent238.epicproportions.addons.christmas.world;

import net.minecraftforge.common.DimensionManager;

public class Dimension {
	
	/**
	 * Register dimensions.
	 * @param register
	 */
	public static void registerDimensions(){
		DimensionManager.registerDimension(DimensionIDs.DIMWINTERWONDERLAND, DimensionIDs.DIMWINTERWONDERLAND);
	}
	
	/**
	 * Regster dimension world providers with the dimension manager.
	 */
	public static void registerWorldProvider(){
		DimensionManager.registerProviderType(DimensionIDs.DIMWINTERWONDERLAND, WorldProviderWinterWonderLand.class, true);
	}
}