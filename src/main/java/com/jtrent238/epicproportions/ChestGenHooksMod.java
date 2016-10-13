package com.jtrent238.epicproportions;

import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ChestGenHooksMod {

	private static Object obj;
	private static String villageblacksmith;
	private static Random rnd;
	private static String dungeon;
	private static String bonus;
	private static String stronglib;
	private static String strongcross;
	private static String dispenser;
	private static String strongholdcorridor;
	private static String junglechest;
	private static String desertchest;
	private static String minecorridor;
	private static Random rand;

	private Object network;
	
	public static void Register() {
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenIngot), 0, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatIngot), 0, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 0, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenIngot), 2, 5, 20));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatIngot), 2, 5, 20));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenIngot), 2, 4, 2));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatIngot), 2, 4, 2));
		//ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).getItems(villageblacksmith, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).getInfo(villageblacksmith);
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).getCount(villageblacksmith, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).getItems(bonus, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).getInfo(bonus);
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).getCount(bonus, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).getItems(dungeon, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).getInfo(dungeon);
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).getCount(dungeon, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).getItems(minecorridor, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).getInfo(minecorridor);
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).getCount(minecorridor, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).getItems(desertchest, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).getInfo(desertchest);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).getCount(desertchest, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).getItems(junglechest, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).getInfo(junglechest);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).getCount(junglechest, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).getItems(strongholdcorridor, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).getInfo(strongholdcorridor);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).getCount(strongholdcorridor, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).getItems(dispenser, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).getInfo(dispenser);
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).getCount(dispenser, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).getItems(strongcross, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).getInfo(strongcross);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).getCount(strongcross, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).notifyAll();
		//ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).getCount(rand);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).getMax();
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).getMin();
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).equals(obj);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).getItems(stronglib, rnd);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).getInfo(stronglib);
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).getCount(stronglib, rand);
		//ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).notifyAll();
		
	}

	
	
}
