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
import com.jtrent238.epicproportions.items.itemjen;
import com.jtrent238.epicproportions.items.itempat;
import com.jtrent238.epicproportions.items.ammo.itemJenArrow;
import com.jtrent238.epicproportions.items.ammo.itemPatArrow;
import com.jtrent238.epicproportions.items.armor.ItemJenArmor;
import com.jtrent238.epicproportions.items.armor.ItemPatArmor;
import com.jtrent238.epicproportions.items.armor.ItemSuperJenArmor;
import com.jtrent238.epicproportions.items.armor.ItemSuperPatArmor;
import com.jtrent238.epicproportions.items.blockplacers.itemBirthdayPresent;
import com.jtrent238.epicproportions.items.spawners.itemSpawnBomby;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCandyMan;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCandyPopper;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCaptianCookie;
import com.jtrent238.epicproportions.items.spawners.itemSpawnClown;
import com.jtrent238.epicproportions.items.spawners.itemSpawnCookieLittle;
import com.jtrent238.epicproportions.items.spawners.itemSpawnFred2_0;
import com.jtrent238.epicproportions.items.spawners.itemSpawnJen;
import com.jtrent238.epicproportions.items.spawners.itemSpawnKitty;
import com.jtrent238.epicproportions.items.spawners.itemSpawnNinjaMaster;
import com.jtrent238.epicproportions.items.spawners.itemSpawnPat;
import com.jtrent238.epicproportions.items.spawners.itemSpawnSparky;
import com.jtrent238.epicproportions.items.spawners.itemSpawnjtrent238;
import com.jtrent238.epicproportions.items.structureplacers.itemBombyStructurePlacer;
import com.jtrent238.epicproportions.items.structureplacers.itemHouseOfEpicProportionsPlacer;
import com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordPlacer;
import com.jtrent238.epicproportions.items.tools.itemJenAxe;
import com.jtrent238.epicproportions.items.tools.itemJenHoe;
import com.jtrent238.epicproportions.items.tools.itemJenMultiTool;
import com.jtrent238.epicproportions.items.tools.itemJenPick;
import com.jtrent238.epicproportions.items.tools.itemJenShovel;
import com.jtrent238.epicproportions.items.tools.itemPatAxe;
import com.jtrent238.epicproportions.items.tools.itemPatHoe;
import com.jtrent238.epicproportions.items.tools.itemPatMultiTool;
import com.jtrent238.epicproportions.items.tools.itemPatPick;
import com.jtrent238.epicproportions.items.tools.itemPatShovel;
import com.jtrent238.epicproportions.items.tools.staffs.itemJenStaff;
import com.jtrent238.epicproportions.items.tools.staffs.itemPatStaff;
import com.jtrent238.epicproportions.items.tools.weapons.itemJenSword;
import com.jtrent238.epicproportions.items.tools.weapons.itemPatSword;
import com.jtrent238.epicproportions.items.tools.weapons.bows.itemJenBow;
import com.jtrent238.epicproportions.items.tools.weapons.bows.itemPatBow;

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
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemRecord;
import net.minecraft.potion.Potion;

public class ItemLoader {

	
	public static Item itemgemofepicproportions;
	public static Item itemPatIngot;
	public static Item itemJenIngot;
	public static Item itemJenslips;
	public static Item itemCaptainCookieCookie;
	public static Item itemJenStar;
	public static Item itemPatStar;
	public static Item itemEpicProportionsStar;
	public static Item itemPatArrow;
	public static Item itemJenArrow;
	public static Item itemBirthdayPresent;
	public static Item itempat;
	public static Item itemjen;
	
	public static Item itemTNTSwordPlacer;
	public static Item itemHouseOfEpicProportionsPlacer;
	public static Item itemBombyStructurePlacer;
	
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
	public static Item itemPatStaff;
	public static Item itemJenStaff;
	public static Item itemPatBow;
	public static Item itemJenBow;
	public static Item itemPatMultiTool;
	public static Item itemJenMultiTool;
	
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
	public static Item itemSpawnClown;
	public static Item itemSpawnCandyPopper;
	public static Item itemSpawnSparky;
	public static Item itemSpawnKitty;
	
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
	
		//Pat Armor
	public static Item itemSuperPatHelmet;
	public static Item itemSuperPatChestplate;
	public static Item itemSuperPatLeggings;
	public static Item itemSuperPatBoots;
		//Jen Armor
	public static Item itemSuperJenHelmet;
	public static Item itemSuperJenChestplate;
	public static Item itemSuperJenLeggings;
	public static Item itemSuperJenBoots;
	
		//Armor Material
	public static ArmorMaterial PAT_ARMOR = EnumHelper.addArmorMaterial("PAT_ARMOR", 16, new int[] {3, 8, 6, 3}, 30);
	public static ArmorMaterial JEN_ARMOR = EnumHelper.addArmorMaterial("JEN_ARMOR", 17, new int[] {3, 8, 6, 3}, 30);
	
	public static ArmorMaterial SUPER_PAT_ARMOR = EnumHelper.addArmorMaterial("PAT_ARMOR", 16, new int[] {3, 8, 6, 3}, 30);
	public static ArmorMaterial SUPER_JEN_ARMOR = EnumHelper.addArmorMaterial("JEN_ARMOR", 17, new int[] {3, 8, 6, 3}, 30);
	


	/**
	 * Load Items.
	 */
public static void LoadItems() {

	itemgemofepicproportions = new itemgemofepicproportions().setUnlocalizedName("itemgemofepicproportions").setTextureName("epicproportionsmod:itemgemofepicproportions").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatIngot = new itemPatIngot().setUnlocalizedName("itemPatIngot").setTextureName("epicproportionsmod:itemPatIngot").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenIngot = new itemJenIngot().setUnlocalizedName("itemJenIngot").setTextureName("epicproportionsmod:itemJenIngot").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenslips = new itemJenslips(ItemArmor.ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("itemJenslips").setTextureName("epicproportionsmod:itemJenslips").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemCaptainCookieCookie = new itemCaptainCookieCookie("cookie_cd").setUnlocalizedName("itemCaptainCookieCookie").setTextureName("epicproportionsmod:itemCaptainCookieCookie").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemTNTSwordPlacer = new itemTNTSwordPlacer(0).setUnlocalizedName("itemTNTSwordPlacer").setTextureName("epicproportionsmod:itemTNTSwordPlacer").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenStar = new itemJenStar().setUnlocalizedName("itemJenStar").setTextureName("epicproportionsmod:itemJenStar").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatStar = new itemPatStar().setUnlocalizedName("itemPatStar").setTextureName("epicproportionsmod:itemPatStar").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemEpicProportionsStar = new itemEpicProportionsStar().setUnlocalizedName("itemEpicProportionsStar").setTextureName("epicproportionsmod:itemEpicProportionsStar").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemPatArrow = new itemPatArrow().setUnlocalizedName("itemPatArrow").setTextureName("epicproportionsmod:itemPatArrow").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenArrow = new itemJenArrow().setUnlocalizedName("itemJenArrow").setTextureName("epicproportionsmod:itemJenArrow").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemBirthdayPresent = new itemBirthdayPresent().setUnlocalizedName("itemBirthdayPresent").setTextureName("epicproportionsmod:itemBirthdayPresent").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemHouseOfEpicProportionsPlacer = new itemHouseOfEpicProportionsPlacer(0).setUnlocalizedName("itemHouseOfEpicProportionsPlacer").setTextureName("epicproportionsmod:itemHouseOfEpicProportionsPlacer").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemBombyStructurePlacer = new itemBombyStructurePlacer(0).setUnlocalizedName("itemBombyStructurePlacer").setTextureName("epicproportionsmod:itemBombyStructurePlacer").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itempat = new itempat().setUnlocalizedName("itempat").setTextureName("epicproportionsmod:itempat")/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
	itemjen = new itemjen().setUnlocalizedName("itemjen").setTextureName("epicproportionsmod:itemjen")/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
	
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
	itemPatStaff = new itemPatStaff().setUnlocalizedName("itemPatStaff").setTextureName("epicproportionsmod:itemPatStaff").setCreativeTab(EpicProportionsMod.EpicProportionsMod).setFull3D();
	itemJenStaff = new itemJenStaff().setUnlocalizedName("itemJenStaff").setTextureName("epicproportionsmod:itemJenStaff").setCreativeTab(EpicProportionsMod.EpicProportionsMod).setFull3D();
	itemPatBow = new itemPatBow(ToolMaterial.EMERALD).setUnlocalizedName("itemPatBow").setTextureName("epicproportionsmod:itemPatBow").setCreativeTab(EpicProportionsMod.EpicProportionsMod).setFull3D();
	itemJenBow = new itemJenBow(ToolMaterial.EMERALD).setUnlocalizedName("itemJenBow").setTextureName("epicproportionsmod:itemJenBow").setCreativeTab(EpicProportionsMod.EpicProportionsMod).setFull3D();
	itemPatMultiTool = new itemPatMultiTool(ToolMaterial.EMERALD).setUnlocalizedName("itemPatMultiTool").setTextureName("epicproportionsmod:itemPatMultiTool").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemJenMultiTool = new itemJenMultiTool(ToolMaterial.EMERALD).setUnlocalizedName("itemJenMultiTool").setTextureName("epicproportionsmod:itemJenMultiTool").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	
	
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
	itemSpawnClown = new itemSpawnClown().setUnlocalizedName("itemSpawnClown").setTextureName("epicproportionsmod:itemSpawnClown").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnCandyPopper = new itemSpawnCandyPopper().setUnlocalizedName("itemSpawnCandyPopper").setTextureName("epicproportionsmod:itemSpawnCandyPopper").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnSparky = new itemSpawnSparky().setUnlocalizedName("itemSpawnSparky").setTextureName("epicproportionsmod:itemSpawnSparky").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	itemSpawnKitty = new itemSpawnKitty().setUnlocalizedName("itemSpawnKitty").setTextureName("epicproportionsmod:itemSpawnKitty").setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	
	//Armor
		//PatArmor
	itemPatHelmet = new ItemPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("itemPatHelmet").setTextureName("epicproportionsmod:itemPatHelmet").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; //0 for helmet
	itemPatChestplate = new ItemPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 1, 1).setUnlocalizedName("itemPatChestplate").setTextureName("epicproportionsmod:itemPatChestplate").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 1 for chestplate
	itemPatLeggings = new ItemPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 2, 2).setUnlocalizedName("itemPatLeggings").setTextureName("epicproportionsmod:itemPatLeggings").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 2 for leggings
	itemPatBoots = new ItemPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3).setUnlocalizedName("itemPatBoots").setTextureName("epicproportionsmod:itemPatBoots").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 3 for boots
		//JenArmor
	itemJenHelmet = new ItemJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("itemJenHelmet").setTextureName("epicproportionsmod:itemJenHelmet").setCreativeTab(EpicProportionsMod.EpicProportionsMod); //0 for helmet
	itemJenChestplate = new ItemJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 1, 1).setUnlocalizedName("itemJenChestplate").setTextureName("epicproportionsmod:itemJenChestplate").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 1 for chestplate
	itemJenLeggings = new ItemJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 2, 2).setUnlocalizedName("itemJenLeggings").setTextureName("epicproportionsmod:itemJenLeggings").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 2 for leggings
	itemJenBoots = new ItemJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3).setUnlocalizedName("itemJenBoots").setTextureName("epicproportionsmod:itemJenBoots").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 3 for boots

		//Super PatArmor
	itemSuperPatHelmet = new ItemSuperPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("itemSuperPatHelmet").setTextureName("epicproportionsmod:itemSuperPatHelmet").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; //0 for helmet
	itemSuperPatChestplate = new ItemSuperPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 1, 1).setUnlocalizedName("itemSuperPatChestplate").setTextureName("epicproportionsmod:itemSuperPatChestplate").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 1 for chestplate
	itemSuperPatLeggings = new ItemSuperPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 2, 2).setUnlocalizedName("itemSuperPatLeggings").setTextureName("epicproportionsmod:itemSuperPatLeggings").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 2 for leggings
	itemSuperPatBoots = new ItemSuperPatArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3).setUnlocalizedName("itemSuperPatBoots").setTextureName("epicproportionsmod:itemSuperPatBoots").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 3 for boots
		//Super JenArmor
	itemSuperJenHelmet = new ItemSuperJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("itemSuperJenHelmet").setTextureName("epicproportionsmod:itemSuperJenHelmet").setCreativeTab(EpicProportionsMod.EpicProportionsMod); //0 for helmet
	itemSuperJenChestplate = new ItemSuperJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 1, 1).setUnlocalizedName("itemSuperJenChestplate").setTextureName("epicproportionsmod:itemSuperJenChestplate").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 1 for chestplate
	itemSuperJenLeggings = new ItemSuperJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 2, 2).setUnlocalizedName("itemSuperJenLeggings").setTextureName("epicproportionsmod:itemSuperJenLeggings").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 2 for leggings
	itemSuperJenBoots = new ItemSuperJenArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3).setUnlocalizedName("itemSuperJenBoots").setTextureName("epicproportionsmod:itemSuperJenBoots").setCreativeTab(EpicProportionsMod.EpicProportionsMod);; // 3 for boots


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
	GameRegistry.registerItem(itemTNTSwordPlacer, itemTNTSwordPlacer.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenStar, itemJenStar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatStar, itemPatStar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemEpicProportionsStar, itemEpicProportionsStar.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatArrow, itemPatArrow.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenArrow, itemJenArrow.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemBirthdayPresent, itemBirthdayPresent.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemHouseOfEpicProportionsPlacer, itemHouseOfEpicProportionsPlacer.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemBombyStructurePlacer, itemBombyStructurePlacer.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itempat, itempat.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemjen, itemjen.getUnlocalizedName().substring(5));
	
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
	GameRegistry.registerItem(itemPatStaff, itemPatStaff.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenStaff, itemJenStaff.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatBow, itemPatBow.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenBow, itemJenBow.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatMultiTool, itemPatMultiTool.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenMultiTool, itemJenMultiTool.getUnlocalizedName().substring(5));
	
	
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
	GameRegistry.registerItem(itemSpawnClown, itemSpawnClown.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnCandyPopper, itemSpawnCandyPopper.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnSparky, itemSpawnSparky.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSpawnKitty, itemSpawnKitty.getUnlocalizedName().substring(5));
	
	//Armor
			//PatArmor
	GameRegistry.registerItem(itemPatHelmet, itemPatHelmet.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatChestplate, itemPatChestplate.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatLeggings, itemPatLeggings.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemPatBoots, itemPatBoots.getUnlocalizedName().substring(5));
			//JenArmor
	GameRegistry.registerItem(itemJenHelmet, itemJenHelmet.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenChestplate, itemJenChestplate.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenLeggings, itemJenLeggings.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemJenBoots, itemJenBoots.getUnlocalizedName().substring(5));
			//Super PatArmor
	GameRegistry.registerItem(itemSuperPatHelmet, itemSuperPatHelmet.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSuperPatChestplate, itemSuperPatChestplate.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSuperPatLeggings, itemSuperPatLeggings.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSuperPatBoots, itemSuperPatBoots.getUnlocalizedName().substring(5));
			//Super JenArmor
	GameRegistry.registerItem(itemSuperJenHelmet, itemSuperJenHelmet.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSuperJenChestplate, itemSuperJenChestplate.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSuperJenLeggings, itemSuperJenLeggings.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(itemSuperJenBoots, itemSuperJenBoots.getUnlocalizedName().substring(5));
	
}

}
