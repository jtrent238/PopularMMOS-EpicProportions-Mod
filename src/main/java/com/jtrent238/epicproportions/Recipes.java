package com.jtrent238.epicproportions;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.Type;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

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
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatSword), "X", "X", "S", 'X', ItemLoader.itemPatIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenSword), "X", "X", "S", 'X', ItemLoader.itemJenIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockPatIngot), "XXX", "XXX","XXX", 'X', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockJenIngot), "XXX", "XXX","XXX", 'X', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatIngot, 9), "X", 'X', BlockLoader.blockPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenIngot, 9), "X", 'X', BlockLoader.blockJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenPick), "XXX", "BSB", "BSB", 'X', ItemLoader.itemJenIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatPick), "XXX", "BSB", "BSB", 'X', ItemLoader.itemPatIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatAxe), "XXB", "XSB", "BSB", 'X', ItemLoader.itemPatIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenAxe), "XXB", "XSB", "BSB", 'X', ItemLoader.itemJenIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemEpicProportionsStar), "JBP", "JNP", "JBP", 'P', ItemLoader.itemPatStar, 'J' , ItemLoader.itemJenStar, 'N' , Items.nether_star);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.beacon), "GGG", "GPG", "OOO", 'P', ItemLoader.itemPatStar, 'G' , Blocks.glass, 'O' , Blocks.obsidian);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.beacon), "GGG", "GJG", "OOO", 'J', ItemLoader.itemJenStar, 'G' , Blocks.glass, 'O' , Blocks.obsidian);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.beacon), "GGG", "GEG", "OOO", 'E', ItemLoader.itemEpicProportionsStar, 'G' , Blocks.glass, 'O' , Blocks.obsidian);
		
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
		GameRegistry.addSmelting(BlockLoader.blockPatOre, new ItemStack (ItemLoader.itemPatIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.blockJenOre, new ItemStack (ItemLoader.itemJenIngot, 1), 2F );
			   }
	
	}

	
	
	
