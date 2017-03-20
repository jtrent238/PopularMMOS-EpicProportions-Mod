package com.jtrent238.epicproportions;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeHandler implements IVillageTradeHandler
{
	//private static final int Ted = EntityLoader.Ted;

	//public static MerchantRecipeList manipulateTradesForVillager;

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
	{
		switch(villager.getProfession()) {
		case 22: //Villager Of Epic Proportions
			// standard trade
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.itemEpicProportionsStar, 24), new ItemStack(ItemLoader.itemSwordOfEpicProportions_Part1, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.itemSwordOfEpicProportions_Part1, 1), new ItemStack(ItemLoader.itemSwordOfEpicProportions_Part2, 1), new ItemStack(ItemLoader.itemSwordOfEpicProportions_Part3, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.diamond, 6), new ItemStack(ItemLoader.itemBirthdayPresent, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.itemPatIngot, 16), new ItemStack(ItemLoader.itemJenIngot, 16), new ItemStack(ItemLoader.itemTNTSwordPlacer, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.diamond, 6), new ItemStack(ItemLoader.itemJenIngot, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.diamond, 6), new ItemStack(ItemLoader.itemPatIngot, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 4), new ItemStack(Items.diamond, 8), new ItemStack(ItemLoader.itemPatSword, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 4), new ItemStack(Items.diamond, 8), new ItemStack(ItemLoader.itemJenSword, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.itemBirthdayPresent, 1), new ItemStack(ItemLoader.itemgemofepicproportions, 8), new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.itemPatIngot, 64), new ItemStack(ItemLoader.itemPatStar, 2), new ItemStack(ItemLoader.itemgemofepicproportions, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.itemJenIngot, 64), new ItemStack(ItemLoader.itemJenStar, 2), new ItemStack(ItemLoader.itemgemofepicproportions, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.cake, 1), new ItemStack(ItemLoader.itemJenIngot, 8), new ItemStack(ItemLoader.ItemJenCake, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.cake, 1), new ItemStack(ItemLoader.itemPatIngot, 8), new ItemStack(ItemLoader.ItemPatCake, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.tnt, 2), new ItemStack(Items.rotten_flesh, 16), new ItemStack(BlockLoader.blockFartBomb, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.tnt, 2), new ItemStack(ItemLoader.itemJenIngot, 16), new ItemStack(BlockLoader.blockJenTNT, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.tnt, 2), new ItemStack(ItemLoader.itemPatIngot, 16), new ItemStack(BlockLoader.blockPatTNT, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.tnt, 2), new ItemStack(Blocks.dirt, 16), new ItemStack(BlockLoader.blockTrollTNT, 1)));
			recipeList.add(new MerchantRecipe(new ItemStack(Blocks.tnt, 2), new ItemStack(ItemLoader.itemEpicProportionsStar, 16), new ItemStack(BlockLoader.BlockNuke, 1)));
			
			
			
			
			break;
		
		default:
			break;
		
	
		}
		
	}
}