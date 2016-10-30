package com.jtrent238.epicproportions.addons.halloween;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockSpookyIngot), "XXX", "XXX", "XXX", 'X', ItemLoader.itemSpookyIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSpookyIngot), "EEE", "EIE", "EEE", 'E', ItemLoader.itemSpookyEssence, 'I', com.jtrent238.epicproportions.ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSpookyIngot), "EEE", "EIE", "EEE", 'E', ItemLoader.itemSpookyEssence, 'I', com.jtrent238.epicproportions.ItemLoader.itemJenIngot);
		
	}
	
	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		GameRegistry.addSmelting(BlockLoader.blockSpookyEssenceOre, new ItemStack (ItemLoader.itemSpookyEssence, 1), 2F );
		
		}
	
	}

	
	
	
