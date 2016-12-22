package com.jtrent238.epicproportions.addons.christmas;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeHandler implements IVillageTradeHandler
{
	private static final int santa = 1364;

	//private static final int Ted = EntityLoader.Ted;

	//public static MerchantRecipeList manipulateTradesForVillager;


	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
	{
		switch(villager.getProfession()) {
		case 64: //Santa
			// standard trade
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 0)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 2)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 3)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 4)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 5)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 6)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 7)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 8)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 9)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 10)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemCandyCane, 4), new ItemStack(ItemLoader.ItemBulb, 16, 11)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 0), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 1), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 2), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 3), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 4), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 5), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 6), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 7), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 8), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 9), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 10), new ItemStack(ItemLoader.ItemJingleBells)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.ItemBulb, 1, 11), new ItemStack(ItemLoader.ItemJingleBells)));
			
			
			
			
			break;
		
		default:
			break;
		
	
		}
		
	}
}