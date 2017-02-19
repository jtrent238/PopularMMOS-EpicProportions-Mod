package com.jtrent238.epicproportions.dim;

import net.minecraftforge.common.DimensionManager;

public class Dimension {
	
	/**
	 * Sets Dimensions ID's
	 */
	private static final int CANDYLANDDIMENSION = 7;

	/**
	 * Register dimensions.
	 * @param register
	 */
	public static void registerDimensions(){
		DimensionManager.registerDimension(7, 7);
	}
	
	/**
	 * Regster dimension world providers with the dimension manager.
	 */
	public static void registerWorldProvider(){
		DimensionManager.registerProviderType(7, WorldProviderEpicProportions.class, true);
	}
}