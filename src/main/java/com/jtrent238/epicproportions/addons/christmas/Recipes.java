package com.jtrent238.epicproportions.addons.christmas;


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
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadSword), "X", "X", "S", 'X', ItemLoader.ItemGingerBreadMan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadPickaxe), "XXX", "BSB", "BSB", 'X', ItemLoader.ItemGingerBreadMan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadAxe), "XXB", "XSB", "BSB", 'X', ItemLoader.ItemGingerBreadMan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadShovel), "BXB", "BSB", "BSB", 'X', ItemLoader.ItemGingerBreadMan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadHoe), "XXB", "BSB", "BSB", 'X', ItemLoader.ItemGingerBreadMan, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockGingerBread), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemGingerBreadMan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneSword), "X", "X", "S", 'X', ItemLoader.ItemCandyCane, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCanePickaxe), "XXX", "BSB", "BSB", 'X', ItemLoader.ItemCandyCane, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneAxe), "XXB", "XSB", "BSB", 'X', ItemLoader.ItemCandyCane, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneShovel), "BXB", "BSB", "BSB", 'X', ItemLoader.ItemCandyCane, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneHoe), "XXB", "BSB", "BSB", 'X', ItemLoader.ItemCandyCane, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockCandyCane), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemCandyCane);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 0), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 14), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 1));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 1), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 13), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 2));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 2), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 11), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 4));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 3), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 10), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 5));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 4), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 9), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 6));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 5), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 6), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 9));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 6), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 5), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 10));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 7), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 4), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 11));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 8), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 3), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 12));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 9), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 2), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 13));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 10), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 1), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 14));
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBulb, 4, 11), "XXX", "XFX", "DID", 'X', new ItemStack(Blocks.stained_glass_pane, 1 , 0), 'F' , ItemLoader.ItemFilament, 'I', Items.iron_ingot, 'D', new ItemStack(Items.dye, 1 , 15));
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 0), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 0), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 1), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 1), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 2), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 2), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 3), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 3), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 4), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 4), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 5), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 5), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 6), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 6), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 7), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 7), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 8), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 8), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 9), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 9), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 10), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 10), 'B' , ItemLoader.ItemBulbHolder);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockBulb, 1, 11), "A", "B", 'A', new ItemStack(ItemLoader.ItemBulb, 4 , 11), 'B' , ItemLoader.ItemBulbHolder);
		
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemFilament, 16), "ISI", "SIS", "ISI", 'I', Items.iron_ingot, 'S' , Items.string);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneHelm), "XXX", "XBX", 'X', ItemLoader.ItemCandyCane);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneChest), "XBX", "XXX","XXX", 'X', ItemLoader.ItemCandyCane);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneLegs), "XXX", "XBX","XBX", 'X', ItemLoader.ItemCandyCane);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCandyCaneBoots), "XBX", "XBX", 'X', ItemLoader.ItemCandyCane);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadHelm), "XXX", "XBX", 'X', ItemLoader.ItemGingerBreadMan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadChest), "XBX", "XXX","XXX", 'X', ItemLoader.ItemGingerBreadMan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadLegs), "XXX", "XBX","XBX", 'X', ItemLoader.ItemGingerBreadMan);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGingerBreadBoots), "XBX", "XBX", 'X', ItemLoader.ItemGingerBreadMan);
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockGingerBreadCarpet, 2), "XX", 'X', BlockLoader.BlockGingerBread);
			

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
		GameRegistry.addSmelting(BlockLoader.BlockFrozenCoal, new ItemStack (Blocks.coal_block, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenCoalOre, new ItemStack (Blocks.coal_ore, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenDiamond, new ItemStack (Blocks.diamond_block, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenDiamondOre, new ItemStack (Blocks.diamond_ore, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenEmerald, new ItemStack (Blocks.emerald_block, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenEmeraldOre, new ItemStack (Blocks.emerald_ore, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenGoldIngot, new ItemStack (Blocks.gold_block, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenGoldIngotOre, new ItemStack (Blocks.gold_ore, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenIronIngot, new ItemStack (Blocks.iron_block, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenIronIngotOre, new ItemStack (Blocks.iron_ore, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenLapis, new ItemStack (Blocks.lapis_block, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenLapisOre, new ItemStack (Blocks.lapis_ore, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenRedstone, new ItemStack (Blocks.redstone_block, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenRedstoneOre, new ItemStack (Blocks.redstone_ore, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenCobbleStone, new ItemStack (Blocks.cobblestone, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockFrozenStone, new ItemStack (Blocks.stone, 1), 2F );
		
		GameRegistry.addSmelting(ItemLoader.ItemFrozenCoal, new ItemStack (Items.coal, 1), 2F );
		GameRegistry.addSmelting(ItemLoader.ItemFrozenDiamond, new ItemStack (Items.diamond, 1), 2F );
		GameRegistry.addSmelting(ItemLoader.ItemFrozenEmerald, new ItemStack (Items.emerald, 1), 2F );
		GameRegistry.addSmelting(ItemLoader.ItemFrozenGoldIngot, new ItemStack (Items.gold_ingot, 1), 2F );
		GameRegistry.addSmelting(ItemLoader.ItemFrozenIronIngot, new ItemStack (Items.iron_ingot, 1), 2F );
		GameRegistry.addSmelting(ItemLoader.ItemFrozenLapis, new ItemStack (Items.dye, 1 , 4), 2F );
		GameRegistry.addSmelting(ItemLoader.ItemFrozenRedstone, new ItemStack (Items.redstone, 1), 2F );
	   }
	
	public static void addOreDictionarySmelteryRecipes ()
    {

		
}
	}

	
	
	
