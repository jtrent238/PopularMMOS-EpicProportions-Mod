package com.jtrent238.epicproportions.addons.halloween;

import com.jtrent238.epicproportions.addons.halloween.items.itemSpookyEssence;
import com.jtrent238.epicproportions.addons.halloween.items.itemSpookyIngot;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_0;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_1;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_10;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_11;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_12;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_13;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_14;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_15;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_2;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_3;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_4;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_5;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_6;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_7;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_8;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_9;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail_Creeper;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail_Jen;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail_Pat;
import com.jtrent238.epicproportions.addons.halloween.items.spawners.itemSpawnSpookyJen;
import com.jtrent238.epicproportions.addons.halloween.items.spawners.itemSpawnSpookyPat;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {

	public static Item itemSpookyEssence;
	public static Item itemSpookyIngot;
	public static Item itemHalloweenPail;
	public static Item itemHalloweenPail_Pat;
	public static Item itemHalloweenPail_Jen;
	public static Item itemHalloweenPail_Creeper;
	public static Item itemCandy_0;
	public static Item itemCandy_1;
	public static Item itemCandy_2;
	public static Item itemCandy_3;
	public static Item itemCandy_4;
	public static Item itemCandy_5;
	public static Item itemCandy_6;
	public static Item itemCandy_7;
	public static Item itemCandy_8;
	public static Item itemCandy_9;
	public static Item itemCandy_10;
	public static Item itemCandy_11;
	public static Item itemCandy_12;
	public static Item itemCandy_13;
	public static Item itemCandy_14;
	public static Item itemCandy_15;
	
	//SpawnEggs//
	public static Item itemSpawnSpookyPat;
	public static Item itemSpawnSpookyJen;
	

	/**
	 * Load Items.
	 */
public static void LoadItems() {

	itemSpookyEssence = new itemSpookyEssence().setUnlocalizedName("itemSpookyEssence").setTextureName("epicproportionsmod_halloween:itemSpookyEssence").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemSpookyIngot = new itemSpookyIngot().setUnlocalizedName("itemSpookyIngot").setTextureName("epicproportionsmod_halloween:itemSpookyIngot").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail = new itemHalloweenPail().setUnlocalizedName("itemHalloweenPail").setTextureName("epicproportionsmod_halloween:itemHalloweenPail").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail_Pat = new itemHalloweenPail_Pat().setUnlocalizedName("itemHalloweenPail_Pat").setTextureName("epicproportionsmod_halloween:itemHalloweenPail_Pat").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail_Jen = new itemHalloweenPail_Jen().setUnlocalizedName("itemHalloweenPail_Jen").setTextureName("epicproportionsmod_halloween:itemHalloweenPail_Jen").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail_Creeper = new itemHalloweenPail_Creeper().setUnlocalizedName("itemHalloweenPail_Creeper").setTextureName("epicproportionsmod_halloween:itemHalloweenPail_Creeper").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_0 = new itemCandy_0(22, 22, false).setUnlocalizedName("itemCandy_0").setTextureName("epicproportionsmod_halloween:itemCandy_0").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_1 = new itemCandy_1(22, 22, false).setUnlocalizedName("itemCandy_1").setTextureName("epicproportionsmod_halloween:itemCandy_1").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_2 = new itemCandy_2(22, 22, false).setUnlocalizedName("itemCandy_2").setTextureName("epicproportionsmod_halloween:itemCandy_2").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_3 = new itemCandy_3(22, 22, false).setUnlocalizedName("itemCandy_3").setTextureName("epicproportionsmod_halloween:itemCandy_3").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_4 = new itemCandy_4(22, 22, false).setUnlocalizedName("itemCandy_4").setTextureName("epicproportionsmod_halloween:itemCandy_4").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_5 = new itemCandy_5(22, 22, false).setUnlocalizedName("itemCandy_5").setTextureName("epicproportionsmod_halloween:itemCandy_5").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_6 = new itemCandy_6(22, 22, false).setUnlocalizedName("itemCandy_6").setTextureName("epicproportionsmod_halloween:itemCandy_6").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_7 = new itemCandy_7(22, 22, false).setUnlocalizedName("itemCandy_7").setTextureName("epicproportionsmod_halloween:itemCandy_7").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_8 = new itemCandy_8(22, 22, false).setUnlocalizedName("itemCandy_8").setTextureName("epicproportionsmod_halloween:itemCandy_8").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_9 = new itemCandy_9(22, 22, false).setUnlocalizedName("itemCandy_9").setTextureName("epicproportionsmod_halloween:itemCandy_9").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_10 = new itemCandy_10(22, 22, false).setUnlocalizedName("itemCandy_10").setTextureName("epicproportionsmod_halloween:itemCandy_10").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_11 = new itemCandy_11(22, 22, false).setUnlocalizedName("itemCandy_11").setTextureName("epicproportionsmod_halloween:itemCandy_11").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_12 = new itemCandy_12(22, 22, false).setUnlocalizedName("itemCandy_12").setTextureName("epicproportionsmod_halloween:itemCandy_12").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_13 = new itemCandy_13(22, 22, false).setUnlocalizedName("itemCandy_13").setTextureName("epicproportionsmod_halloween:itemCandy_13").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_14 = new itemCandy_14(22, 22, false).setUnlocalizedName("itemCandy_14").setTextureName("epicproportionsmod_halloween:itemCandy_14").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_15 = new itemCandy_15(22, 22, false).setUnlocalizedName("itemCandy_15").setTextureName("epicproportionsmod_halloween:itemCandy_15").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);

	
	//SpawnEggs//
	itemSpawnSpookyPat = new itemSpawnSpookyPat().setUnlocalizedName("itemSpawnSpookyPat").setTextureName("epicproportionsmod_halloween:itemSpawnSpookyPat").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemSpawnSpookyJen = new itemSpawnSpookyJen().setUnlocalizedName("itemSpawnSpookyJen").setTextureName("epicproportionsmod_halloween:itemSpawnSpookyJen").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	
	
		registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

	GameRegistry.registerItem(itemSpookyEssence, itemSpookyEssence.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpookyIngot, itemSpookyIngot.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail, itemHalloweenPail.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail_Pat, itemHalloweenPail_Pat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail_Jen, itemHalloweenPail_Jen.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail_Creeper, itemHalloweenPail_Creeper.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_0, itemCandy_0.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_1, itemCandy_1.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_2, itemCandy_2.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_3, itemCandy_3.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_4, itemCandy_4.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_5, itemCandy_5.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_6, itemCandy_6.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_7, itemCandy_7.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_8, itemCandy_8.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_9, itemCandy_9.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_10, itemCandy_10.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_11, itemCandy_11.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_12, itemCandy_12.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_13, itemCandy_13.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_14, itemCandy_14.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_15, itemCandy_15.getUnlocalizedName().substring(5));
	
	
	//SpawnEggs//
	GameRegistry.registerItem(itemSpawnSpookyPat, itemSpawnSpookyPat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnSpookyJen, itemSpawnSpookyJen.getUnlocalizedName().substring(5));
	
}

}
