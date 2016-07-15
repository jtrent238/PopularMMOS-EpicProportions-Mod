package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.items.itemCaptainCookieCookie;
import com.jtrent238.epicproportions.items.itemEpicProportionsStar;
import com.jtrent238.epicproportions.items.itemJenIngot;
import com.jtrent238.epicproportions.items.itemJenStar;
import com.jtrent238.epicproportions.items.itemJenslips;
import com.jtrent238.epicproportions.items.itemPatIngot;
import com.jtrent238.epicproportions.items.itemPatStar;
import com.jtrent238.epicproportions.items.itemSpawnEgg;
import com.jtrent238.epicproportions.items.itemgemofepicproportions;
import com.jtrent238.epicproportions.items.armor.ItemJenArmor;
import com.jtrent238.epicproportions.items.armor.ItemPatArmor;
import com.jtrent238.epicproportions.items.spawners.itemSpawnBomby;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCandyMan;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCaptianCookie;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCookieLittle;
import com.jtrent238.epicproportions.items.spawners.itemSpawnFred2_0;
import com.jtrent238.epicproportions.items.spawners.itemSpawnJen;
import com.jtrent238.epicproportions.items.spawners.itemSpawnNinjaMaster;
import com.jtrent238.epicproportions.items.spawners.itemSpawnPat;
import com.jtrent238.epicproportions.items.spawners.itemSpawnjtrent238;
import com.jtrent238.epicproportions.items.tools.itemJenAxe;
import com.jtrent238.epicproportions.items.tools.itemJenHoe;
import com.jtrent238.epicproportions.items.tools.itemJenPick;
import com.jtrent238.epicproportions.items.tools.itemJenShovel;
import com.jtrent238.epicproportions.items.tools.itemPatAxe;
import com.jtrent238.epicproportions.items.tools.itemPatHoe;
import com.jtrent238.epicproportions.items.tools.itemPatPick;
import com.jtrent238.epicproportions.items.tools.itemPatShovel;
import com.jtrent238.epicproportions.items.tools.weapons.itemJenSword;
import com.jtrent238.epicproportions.items.tools.weapons.itemPatSword;
/*
import com.jtrent238.foodmod.FoodMod;
import com.jtrent238.mcrustmod.items.can_beans_empty;
import com.jtrent238.mcrustmod.items.can_tuna_empty;
import com.jtrent238.mcrustmod.items.ammo.ammo_handmade_shell;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_explosive;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_incendiary;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_basic;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_smoke;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun_slug;
import com.jtrent238.mcrustmod.items.ammo.arrow_hv;
import com.jtrent238.mcrustmod.items.ammo.arrow_wooden;
import com.jtrent238.mcrustmod.items.food.can_beans;
import com.jtrent238.mcrustmod.items.food.can_tuna;
import com.jtrent238.mcrustmod.items.seeds.seed_corn;
import com.jtrent238.mcrustmod.items.seeds.seed_hemp;
import com.jtrent238.mcrustmod.items.seeds.seed_pumpkin;
import com.jtrent238.mcrustmod.items.tools.axe_salvaged;
import com.jtrent238.mcrustmod.items.tools.hammer;
import com.jtrent238.mcrustmod.items.tools.hammer_salvaged;
import com.jtrent238.mcrustmod.items.tools.hatchet;
import com.jtrent238.mcrustmod.items.tools.icepick_salvaged;
import com.jtrent238.mcrustmod.items.tools.lantern;
import com.jtrent238.mcrustmod.items.tools.pickaxe;
import com.jtrent238.mcrustmod.items.tools.stone_hatchet;
import com.jtrent238.mcrustmod.items.tools.stone_pickaxe;
import com.jtrent238.weaponmod.Itemcheeseknife;
*/
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemRecord;

public class ItemLoader {

	
	public static Item itemgemofepicproportions;
	public static Item itemPatIngot;
	public static Item itemJenIngot;
	public static Item itemJenslips;
	public static Item itemCaptainCookieCookie;
	public static Item itemJenStar;
	public static Item itemPatStar;
	public static Item itemEpicProportionsStar;
	
	public static Item itemTNTSwordSpawner;
	
	//Weapons & Tools
	public static Item itemPatSword;
	public static Item itemJenSword;
	public static Item itemPatPick;
	public static Item itemJenPick;
	public static Item itemPatAxe;
	public static Item itemJenAxe;
	public static Item itemPatShovel;
	public static Item itemJenShovel;
	public static Item itemPatHoe;
	public static Item itemJenHoe;
	
	//SpawnEggs//
	//public static Item itemSpawnEgg;
	public static Item itemSpawnBomby;
	public static Item itemSpawnCaptianCookie;
	public static Item itemSpawnPat;
	public static Item itemSpawnJen;
	public static Item itemSpawnFred2_0;
	public static Item itemSpawnNinjaMaster;
	public static Item itemSpawnCandyMan;
	public static Item itemSpawnCookieLittle;
	public static Item itemSpawnjtrent238;
	
	//Armor
		//Pat Armor
	public static Item itemPatHelmet;
	public static Item itemPatChestplate;
	public static Item itemPatLeggings;
	public static Item itemPatBoots;
		//Jen Armor
	public static Item itemJenHelmet;
	public static Item itemJenChestplate;
	public static Item itemJenLeggings;
	public static Item itemJenBoots;
		//Armor Material
	public static ArmorMaterial PAT_ARMOR = EnumHelper.addArmorMaterial("PAT_ARMOR", 16, new int[] {3, 8, 6, 3}, 30);
	public static ArmorMaterial JEN_ARMOR = EnumHelper.addArmorMaterial("JEN_ARMOR", 16, new int[] {3, 8, 6, 3}, 30);

		
	/**
	 * Load Items.
	 */
public static void LoadItems() {

	itemgemofepicproportions = new itemgemofepicproportions().setUnlocalizedName("itemgemofepicproportions").setTextureName("epicproportionsmod:itemgemofepicproportions").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatIngot = new itemPatIngot().setUnlocalizedName("itemPatIngot").setTextureName("epicproportionsmod:itemPatIngot").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenIngot = new itemJenIngot().setUnlocalizedName("itemJenIngot").setTextureName("epicproportionsmod:itemJenIngot").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenslips = new itemJenslips().setUnlocalizedName("itemJenslips").setTextureName("epicproportionsmod:itemJenslips").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemCaptainCookieCookie = new itemCaptainCookieCookie("cookie_cd").setUnlocalizedName("itemCaptainCookieCookie").setTextureName("epicproportionsmod:itemCaptainCookieCookie").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	//itemTNTSwordSpawner = new com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordSpawner().setUnlocalizedName("itemTNTSwordSpawner").setTextureName("epicproportionsmod:itemTNTSwordSpawner").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenStar = new itemJenStar().setUnlocalizedName("itemJenStar").setTextureName("epicproportionsmod:itemJenStar").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatStar = new itemPatStar().setUnlocalizedName("itemPatStar").setTextureName("epicproportionsmod:itemPatStar").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemEpicProportionsStar = new itemEpicProportionsStar().setUnlocalizedName("itemEpicProportionsStar").setTextureName("epicproportionsmod:itemEpicProportionsStar").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	//Weapons & Tools
	itemPatSword = new itemPatSword(ToolMaterial.EMERALD).setUnlocalizedName("itemPatSword").setTextureName("epicproportionsmod:itemPatSword").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenSword = new itemJenSword(ToolMaterial.EMERALD).setUnlocalizedName("itemJenSword").setTextureName("epicproportionsmod:itemJenSword").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatPick = new itemPatPick(0, ToolMaterial.EMERALD, null).setUnlocalizedName("itemPatPick").setTextureName("epicproportionsmod:itemPatPick").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenPick = new itemJenPick(0, ToolMaterial.EMERALD, null).setUnlocalizedName("itemJenPick").setTextureName("epicproportionsmod:itemJenPick").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatAxe = new itemPatAxe(ToolMaterial.EMERALD).setUnlocalizedName("itemPatAxe").setTextureName("epicproportionsmod:itemPatAxe").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenAxe = new itemJenAxe(ToolMaterial.EMERALD).setUnlocalizedName("itemJenAxe").setTextureName("epicproportionsmod:itemJenAxe").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatShovel = new itemPatShovel(ToolMaterial.EMERALD).setUnlocalizedName("itemPatShovel").setTextureName("epicproportionsmod:itemPatShovel").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenShovel = new itemJenShovel(ToolMaterial.EMERALD).setUnlocalizedName("itemJenShovel").setTextureName("epicproportionsmod:itemJenShovel").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatHoe = new itemPatHoe(ToolMaterial.EMERALD).setUnlocalizedName("itemPatHoe").setTextureName("epicproportionsmod:itemPatHoe").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenHoe = new itemJenHoe(ToolMaterial.EMERALD).setUnlocalizedName("itemJenHoe").setTextureName("epicproportionsmod:itemJenHoe").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	//SpawnEggs//
	//itemSpawnEgg = new itemSpawnEgg().setUnlocalizedName("itemSpawnEgg").setTextureName("epicproportionsmod:itemSpawnEgg").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnBomby = new itemSpawnBomby().setUnlocalizedName("itemSpawnBomby").setTextureName("epicproportionsmod:itemSpawnBomby").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnCaptianCookie = new itemSpawnCaptianCookie().setUnlocalizedName("itemSpawnCaptianCookie").setTextureName("epicproportionsmod:itemSpawnCaptianCookie").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnPat = new itemSpawnPat().setUnlocalizedName("itemSpawnPat").setTextureName("epicproportionsmod:itemSpawnPat").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnJen = new itemSpawnJen().setUnlocalizedName("itemSpawnJen").setTextureName("epicproportionsmod:itemSpawnJen").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnFred2_0 = new itemSpawnFred2_0().setUnlocalizedName("itemSpawnFred2_0").setTextureName("epicproportionsmod:itemSpawnFred2_0").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnNinjaMaster = new itemSpawnNinjaMaster().setUnlocalizedName("itemSpawnNinjaMaster").setTextureName("epicproportionsmod:itemSpawnNinjaMaster").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnCandyMan = new itemSpawnCandyMan().setUnlocalizedName("itemSpawnCandyMan").setTextureName("epicproportionsmod:itemSpawnCandyMan").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnCookieLittle = new itemSpawnCookieLittle().setUnlocalizedName("itemSpawnCookieLittle").setTextureName("epicproportionsmod:itemSpawnCookieLittle").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnjtrent238 = new itemSpawnjtrent238().setUnlocalizedName("itemSpawnjtrent238").setTextureName("epicproportionsmod:itemSpawnjtrent238").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	//Armor
		//PatArmor
	itemPatHelmet = new ItemPatArmor("pat_helmet", PAT_ARMOR, "pat", 0); //0 for helmet
	itemPatChestplate = new ItemPatArmor("pat_chestplate", PAT_ARMOR, "pat", 1); // 1 for chestplate
	itemPatLeggings = new ItemPatArmor("pat_leggings", PAT_ARMOR, "pat", 2); // 2 for leggings
	itemPatBoots = new ItemPatArmor("pat_boots", PAT_ARMOR, "pat", 3); // 3 for boots
		//JenArmor
	itemJenHelmet = new ItemJenArmor("jen_helmet", JEN_ARMOR, "jen", 0); //0 for helmet
	itemJenChestplate = new ItemJenArmor("jen_chestplate", JEN_ARMOR, "jen", 1); // 1 for chestplate
	itemJenLeggings = new ItemJenArmor("jen_leggings", JEN_ARMOR, "jen", 2); // 2 for leggings
	itemJenBoots = new ItemJenArmor("jen_boots", JEN_ARMOR, "jen", 3); // 3 for boots

		registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

	GameRegistry.registerItem(itemgemofepicproportions, itemgemofepicproportions.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatIngot, itemPatIngot.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenIngot, itemJenIngot.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenslips, itemJenslips.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemCaptainCookieCookie, itemCaptainCookieCookie.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemTNTSwordSpawner, itemTNTSwordSpawner.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenStar, itemJenStar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatStar, itemPatStar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemEpicProportionsStar, itemEpicProportionsStar.getUnlocalizedName().substring(5));
	
	//Weapons & Tools
	GameRegistry.registerItem(itemPatSword, itemPatSword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenSword, itemJenSword.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatPick, itemPatPick.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenPick, itemJenPick.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatAxe, itemPatAxe.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenAxe, itemJenAxe.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatShovel, itemPatShovel.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenShovel, itemJenShovel.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatHoe, itemPatHoe.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenHoe, itemJenHoe.getUnlocalizedName().substring(5));
	
	//SpawnEggs//
	//GameRegistry.registerItem(itemSpawnEgg, itemSpawnEgg.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnBomby, itemSpawnBomby.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnCaptianCookie, itemSpawnCaptianCookie.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnPat, itemSpawnPat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnJen, itemSpawnJen.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnFred2_0, itemSpawnFred2_0.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnNinjaMaster, itemSpawnNinjaMaster.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnCandyMan, itemSpawnCandyMan.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnCookieLittle, itemSpawnCookieLittle.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnjtrent238, itemSpawnjtrent238.getUnlocalizedName().substring(5));
	
	//GameRegistry.registerItem(itemPatHelmet, itemPatHelmet.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemPatChestplate, itemPatChestplate.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemPatLeggings, itemPatLeggings.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemPatBoots, itemPatBoots.getUnlocalizedName().substring(5));
	
	//GameRegistry.registerItem(itemJenHelmet, itemJenHelmet.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemJenChestplate, itemJenChestplate.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemJenLeggings, itemJenLeggings.getUnlocalizedName().substring(5));
	//GameRegistry.registerItem(itemJenBoots, itemJenBoots.getUnlocalizedName().substring(5));
	
}

}
