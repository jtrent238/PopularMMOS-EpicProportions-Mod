package com.jtrent238.epicproportions;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public static ArrayList<ItemStack> lootitems = new ArrayList<ItemStack>();

	LootRegistry(){
		addItemsasLoot();
		addToChests();
	}

	public static void registerLoot() {
		addItemsasLoot();
		addToChests();
	}
	public static void addItemsasLoot() {
		
		lootitems.add(new ItemStack(Blocks.dirt));
	}

	public static void addToChests() {
		int numItems = 1;
		for (int i = 0; i < numItems ; i++) {
			
				if(EpicProportionsMod.ENABLE_DEVLOGGING == true) {
					System.out.println("DEBUG: Injected Item with ID " + i + " into the Minecraft LootChests.");
				}
				
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
		 	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(lootitems.get(i), 0, 1, 1));
		}
		
	}
	
}