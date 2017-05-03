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
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatShovel), "BXB", "BSB", "BSB", 'X', ItemLoader.itemPatIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenShovel), "BXB", "BSB", "BSB", 'X', ItemLoader.itemJenIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatHoe), "XXB", "BSB", "BSB", 'X', ItemLoader.itemPatIngot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenHoe), "XXB", "BSB", "BSB", 'X', ItemLoader.itemJenIngot, 'S' , Items.stick);
		//GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatBow), "XXB", "XSB", "BSB", 'X', ItemLoader.itemPatIngot, 'S' , Items.string);
		//GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenBow), "XXB", "XSB", "BSB", 'X', ItemLoader.itemJenIngot, 'S' , Items.string);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatMultiTool), "HAS", "PRD", "BRB", 'S', ItemLoader.itemPatSword, 'H' , ItemLoader.itemPatHoe, 'A' , ItemLoader.itemPatAxe, 'P' , ItemLoader.itemPatPick, 'D' , ItemLoader.itemPatShovel, 'R', Items.blaze_rod);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenMultiTool), "HAS", "PRD", "BRB", 'S', ItemLoader.itemJenSword, 'H', ItemLoader.itemJenHoe, 'A', ItemLoader.itemJenAxe, 'P', ItemLoader.itemJenPick, 'D', ItemLoader.itemJenShovel, 'R', Items.blaze_rod);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemEpicProportionsStar), "JBP", "JNP", "JBP", 'P', ItemLoader.itemPatStar, 'J' , ItemLoader.itemJenStar, 'N' , Items.nether_star);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.beacon), "GGG", "GPG", "OOO", 'P', ItemLoader.itemPatStar, 'G' , Blocks.glass, 'O' , Blocks.obsidian);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.beacon), "GGG", "GJG", "OOO", 'J', ItemLoader.itemJenStar, 'G' , Blocks.glass, 'O' , Blocks.obsidian);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.beacon), "GGG", "GEG", "OOO", 'E', ItemLoader.itemEpicProportionsStar, 'G' , Blocks.glass, 'O' , Blocks.obsidian);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatHelmet), "XXX", "XBX", 'X', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatChestplate), "XBX", "XXX","XXX", 'X', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatLeggings), "XXX", "XBX","XBX", 'X', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatBoots), "XBX", "XBX", 'X', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenHelmet), "XXX", "XBX", 'X', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenChestplate), "XBX", "XXX","XXX", 'X', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenLeggings), "XXX", "XBX","XBX", 'X', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenBoots), "XBX", "XBX", 'X', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatHelmet), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatHelmet, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatChestplate), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatChestplate, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatLeggings), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatLeggings, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatBoots), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatBoots, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenHelmet), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenHelmet, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenChestplate), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenChestplate, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenLeggings), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenLeggings, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenBoots), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenBoots, 'J', ItemLoader.itemJenStar);
		//GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemTNTSwordPlacer), "BTB", "BWB", "WBW", 'T', Blocks.tnt, 'W', Blocks.planks);	
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPatStaff), "SBB", "BIB", "BBI", 'I', ItemLoader.itemPatIngot, 'S', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemJenStaff), "SBB", "BIB", "BBI", 'I', ItemLoader.itemJenIngot, 'S', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenSword), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenSword, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenPick), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenPick, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenAxe), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenAxe, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenShovel), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenShovel, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenHoe), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenHoe, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperJenMultiTool), "JJJ", "JXJ", "JJJ", 'X', ItemLoader.itemJenMultiTool, 'J', ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatSword), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatSword, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatPick), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatPick, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatAxe), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatAxe, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatShovel), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatShovel, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatHoe), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatHoe, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSuperPatMultiTool), "PPP", "PXP", "PPP", 'X', ItemLoader.itemPatMultiTool, 'P', ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSwordOfEpicProportions), "BB1", "B2B", "3BB", '1', ItemLoader.itemSwordOfEpicProportions_Part1, '2', ItemLoader.itemSwordOfEpicProportions_Part2, '3', ItemLoader.itemSwordOfEpicProportions_Part3);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSwordOfEpicProportions_Part2), "SSS", "SXS", "SSS", 'X', ItemLoader.itemSuperPatSword, 'S', ItemLoader.itemEpicProportionsStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemSwordOfEpicProportions_Part3), "SSS", "SXS", "SSS", 'X', ItemLoader.itemSuperJenSword, 'S', ItemLoader.itemEpicProportionsStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itempatdoor), "IIB", "IIB", "IIB", 'I', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itempatdoor), "BII", "BII", "BII", 'I', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemjendoor), "IIB", "IIB", "IIB", 'I', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemjendoor), "BII", "BII", "BII", 'I', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPickOfEpicProportions), "BB1", "B2B", "3BB", '1', ItemLoader.itemPickOfEpicProportions_Part1, '2', ItemLoader.itemPickOfEpicProportions_Part2, '3', ItemLoader.itemPickOfEpicProportions_Part3);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPickOfEpicProportions_Part2), "SSS", "SXS", "SSS", 'X', ItemLoader.itemSuperPatPick, 'S', ItemLoader.itemEpicProportionsStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemPickOfEpicProportions_Part3), "SSS", "SXS", "SSS", 'X', ItemLoader.itemSuperJenPick, 'S', ItemLoader.itemEpicProportionsStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemShovelOfEpicProportions), "BB3", "B2B", "1BB", '1', ItemLoader.itemShovelOfEpicProportions_Part1, '2', ItemLoader.itemShovelOfEpicProportions_Part2, '3', ItemLoader.itemShovelOfEpicProportions_Part3);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemShovelOfEpicProportions_Part2), "SSS", "SXS", "SSS", 'X', ItemLoader.itemSuperPatShovel, 'S', ItemLoader.itemEpicProportionsStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemShovelOfEpicProportions_Part3), "SSS", "SXS", "SSS", 'X', ItemLoader.itemSuperJenShovel, 'S', ItemLoader.itemEpicProportionsStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itempatapple), "PPP", "PXP", "PPP", 'X', Items.apple, 'P', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.itemjenapple), "JJJ", "JXJ", "JJJ", 'X', Items.apple, 'J', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockPatTNT), "XXX", "XTX", "XXX", 'X', ItemLoader.itemPatIngot, 'T' , Blocks.tnt);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockJenTNT), "XXX", "XTX", "XXX", 'X', ItemLoader.itemJenIngot, 'T' , Blocks.tnt);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockTrollTNT), "XXX", "XTX", "XXX", 'X', Blocks.dirt, 'T' , Blocks.tnt);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.blockFartBomb), "XXX", "GTG", "XXX", 'X', Blocks.dirt, 'T' , Blocks.tnt, 'G', Blocks.gravel);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockNuke), "XXX", "XTX", "XXX", 'X', BlockLoader.blockPatTNT, 'T' , ItemLoader.itemPatStar);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockNuke), "XXX", "XTX", "XXX", 'X', BlockLoader.blockJenTNT, 'T' , ItemLoader.itemJenStar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJenBucket), "XBX", "BXB", 'X', ItemLoader.itemJenIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemPatBucket), "XBX", "BXB", 'X', ItemLoader.itemPatIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockOfEpicProportions), "XXX", "XXX","XXX", 'X', ItemLoader.itemgemofepicproportions);
		
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
		GameRegistry.addSmelting(ItemLoader.itemJenmeat_raw, new ItemStack (ItemLoader.itemJenmeat_cooked, 1), 2F );
		GameRegistry.addSmelting(ItemLoader.itemPatmeat_raw, new ItemStack (ItemLoader.itemPatmeat_cooked, 1), 2F );
		GameRegistry.addSmelting(new ItemStack(Items.fish, 1, 3), new ItemStack (ItemLoader.ItemCookedPufferFish, 1), 2F );
			   }
	
	public static void addOreDictionarySmelteryRecipes ()
    {

		
}
	}

	
	
	
