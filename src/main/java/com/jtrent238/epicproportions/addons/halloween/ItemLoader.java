package com.jtrent238.epicproportions.addons.halloween;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.addons.halloween.items.itemHalloweenEssence;
import com.jtrent238.epicproportions.addons.halloween.items.itemHalloweenIngot;
import com.jtrent238.epicproportions.addons.halloween.items.itemSpookyEssence;
import com.jtrent238.epicproportions.addons.halloween.items.itemSpookyIngot;
import com.jtrent238.epicproportions.addons.halloween.items.blockplacers.itemWitchesCauldron;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_0;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_1;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_10;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_11;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_12;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_13;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_14;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_15;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_16;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_17;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_18;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_19;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_2;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_20;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_21;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_22;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_3;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_4;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_5;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_6;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_7;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_8;
import com.jtrent238.epicproportions.addons.halloween.items.candy.itemCandy_9;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail_Cow;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail_Creeper;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail_Jen;
import com.jtrent238.epicproportions.addons.halloween.items.pails.itemHalloweenPail_Pat;
import com.jtrent238.epicproportions.addons.halloween.items.spawners.itemSpawnGhost;
import com.jtrent238.epicproportions.addons.halloween.items.spawners.itemSpawnScareCrow;
import com.jtrent238.epicproportions.addons.halloween.items.spawners.itemSpawnSpookyCaptainCookie;
import com.jtrent238.epicproportions.addons.halloween.items.spawners.itemSpawnSpookyJen;
import com.jtrent238.epicproportions.addons.halloween.items.spawners.itemSpawnSpookyPat;
import com.jtrent238.epicproportions.addons.halloween.items.structureplacers.itemAlterPlacer;
import com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordPlacer;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {

	public static Item itemSpookyEssence;
	public static Item itemSpookyIngot;
	public static Item itemHalloweenEssence;
	public static Item itemHalloweenIngot;
	public static Item itemHalloweenPail;
	public static Item itemHalloweenPail_Pat;
	public static Item itemHalloweenPail_Jen;
	public static Item itemHalloweenPail_Creeper;
	public static Item itemHalloweenPail_Cow;
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
	public static Item itemCandy_16;
	public static Item itemCandy_17;
	public static Item itemCandy_18;
	public static Item itemCandy_19;
	public static Item itemCandy_20;
	public static Item itemCandy_21;
	public static Item itemCandy_22;
	public static Item itemAlterPlacer;
	public static Item itemWitchesCauldron;
	
	//SpawnEggs//
	public static Item itemSpawnSpookyPat;
	public static Item itemSpawnSpookyJen;
	public static Item itemSpawnSpookyCaptainCookie;
	public static Item itemSpawnGhost;
	public static Item itemSpawnScareCrow;
	
	/**
	 * Load Items.
	 */
public static void LoadItems() {

	itemSpookyEssence = new itemSpookyEssence().setUnlocalizedName("itemSpookyEssence").setTextureName("epicproportionsmod_halloween:itemSpookyEssence").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemSpookyIngot = new itemSpookyIngot().setUnlocalizedName("itemSpookyIngot").setTextureName("epicproportionsmod_halloween:itemSpookyIngot").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenEssence = new itemHalloweenEssence().setUnlocalizedName("itemHalloweenEssence").setTextureName("epicproportionsmod_halloween:itemHalloweenEssence").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenIngot = new itemHalloweenIngot().setUnlocalizedName("itemHalloweenIngot").setTextureName("epicproportionsmod_halloween:itemHalloweenIngot").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail = new itemHalloweenPail(0).setUnlocalizedName("itemHalloweenPail").setTextureName("epicproportionsmod_halloween:itemHalloweenPail").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail_Pat = new itemHalloweenPail_Pat(1).setUnlocalizedName("itemHalloweenPail_Pat").setTextureName("epicproportionsmod_halloween:itemHalloweenPail_Pat").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail_Jen = new itemHalloweenPail_Jen(2).setUnlocalizedName("itemHalloweenPail_Jen").setTextureName("epicproportionsmod_halloween:itemHalloweenPail_Jen").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail_Creeper = new itemHalloweenPail_Creeper(3).setUnlocalizedName("itemHalloweenPail_Creeper").setTextureName("epicproportionsmod_halloween:itemHalloweenPail_Creeper").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemHalloweenPail_Cow = new itemHalloweenPail_Cow(4).setUnlocalizedName("itemHalloweenPail_Cow").setTextureName("epicproportionsmod_halloween:itemHalloweenPail_Cow").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
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
	itemCandy_16 = new itemCandy_16(22, 22, false).setUnlocalizedName("itemCandy_16").setTextureName("epicproportionsmod_halloween:itemCandy_16").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_17 = new itemCandy_17(22, 22, false).setUnlocalizedName("itemCandy_17").setTextureName("epicproportionsmod_halloween:itemCandy_17").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_18 = new itemCandy_18(22, 22, false).setUnlocalizedName("itemCandy_18").setTextureName("epicproportionsmod_halloween:itemCandy_18").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_19 = new itemCandy_19(22, 22, false).setUnlocalizedName("itemCandy_19").setTextureName("epicproportionsmod_halloween:itemCandy_19").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_20 = new itemCandy_20(22, 22, false).setUnlocalizedName("itemCandy_20").setTextureName("epicproportionsmod_halloween:itemCandy_20").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_21 = new itemCandy_21(22, 22, false).setUnlocalizedName("itemCandy_21").setTextureName("epicproportionsmod_halloween:itemCandy_21").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemCandy_22 = new itemCandy_22(22, 22, false).setUnlocalizedName("itemCandy_22").setTextureName("epicproportionsmod_halloween:itemCandy_22").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemAlterPlacer = new itemAlterPlacer(0).setUnlocalizedName("itemAlterPlacer").setTextureName("epicproportionsmod_halloween:itemAlterPlacer").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemWitchesCauldron = new itemWitchesCauldron().setUnlocalizedName("itemWitchesCauldron").setTextureName("epicproportionsmod_halloween:itemWitchesCauldron").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	
	//SpawnEggs//
	itemSpawnSpookyPat = new itemSpawnSpookyPat().setUnlocalizedName("itemSpawnSpookyPat").setTextureName("epicproportionsmod_halloween:itemSpawnSpookyPat").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemSpawnSpookyJen = new itemSpawnSpookyJen().setUnlocalizedName("itemSpawnSpookyJen").setTextureName("epicproportionsmod_halloween:itemSpawnSpookyJen").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemSpawnSpookyCaptainCookie = new itemSpawnSpookyCaptainCookie().setUnlocalizedName("itemSpawnSpookyCaptainCookie").setTextureName("epicproportionsmod_halloween:itemSpawnSpookyCaptainCookie").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemSpawnGhost = new itemSpawnGhost().setUnlocalizedName("itemSpawnGhost").setTextureName("epicproportionsmod_halloween:itemSpawnGhost").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	itemSpawnScareCrow = new itemSpawnScareCrow().setUnlocalizedName("itemSpawnScareCrow").setTextureName("epicproportionsmod_halloween:itemSpawnScareCrow").setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
	
		registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

	GameRegistry.registerItem(itemSpookyEssence, itemSpookyEssence.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpookyIngot, itemSpookyIngot.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenEssence, itemHalloweenEssence.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenIngot, itemHalloweenIngot.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail, itemHalloweenPail.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail_Pat, itemHalloweenPail_Pat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail_Jen, itemHalloweenPail_Jen.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail_Creeper, itemHalloweenPail_Creeper.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHalloweenPail_Cow, itemHalloweenPail_Cow.getUnlocalizedName().substring(5));
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
	GameRegistry.registerItem(itemCandy_16, itemCandy_16.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_17, itemCandy_17.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_18, itemCandy_18.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_19, itemCandy_19.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_20, itemCandy_20.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_21, itemCandy_21.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCandy_22, itemCandy_22.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemAlterPlacer, itemAlterPlacer.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemWitchesCauldron, itemWitchesCauldron.getUnlocalizedName().substring(5));
	
	
	//SpawnEggs//
	GameRegistry.registerItem(itemSpawnSpookyPat, itemSpawnSpookyPat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnSpookyJen, itemSpawnSpookyJen.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnSpookyCaptainCookie, itemSpawnSpookyCaptainCookie.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnGhost, itemSpawnGhost.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnScareCrow, itemSpawnScareCrow.getUnlocalizedName().substring(5));
}

}
