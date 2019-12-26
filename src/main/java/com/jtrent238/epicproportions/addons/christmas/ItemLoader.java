package com.jtrent238.epicproportions.addons.christmas;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasPainting;
import com.jtrent238.epicproportions.addons.christmas.items.ItemBulb;
import com.jtrent238.epicproportions.addons.christmas.items.ItemBulbHolder;
import com.jtrent238.epicproportions.addons.christmas.items.ItemCandyCaneArmor;
import com.jtrent238.epicproportions.addons.christmas.items.ItemCandyCaneDoor;
import com.jtrent238.epicproportions.addons.christmas.items.ItemCandyCaneIngot;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFilament;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFrozenCoal;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFrozenDiamond;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFrozenEmerald;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFrozenGoldIngot;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFrozenIronIngot;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFrozenLapis;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFrozenRedstone;
import com.jtrent238.epicproportions.addons.christmas.items.ItemGiantSnowball;
import com.jtrent238.epicproportions.addons.christmas.items.ItemGingerBreadArmor;
import com.jtrent238.epicproportions.addons.christmas.items.ItemGingerBreadDoor;
import com.jtrent238.epicproportions.addons.christmas.items.ItemJingleBells;
import com.jtrent238.epicproportions.addons.christmas.items.ItemSled;
import com.jtrent238.epicproportions.addons.christmas.items.ItemSnowWand;
import com.jtrent238.epicproportions.addons.christmas.items.ItemStocking;
import com.jtrent238.epicproportions.addons.christmas.items.blockplacers.ItemChristmasPresent;
import com.jtrent238.epicproportions.addons.christmas.items.blockplacers.ItemChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.items.blockplacers.ItemSnowman;
import com.jtrent238.epicproportions.addons.christmas.items.blockplacers.ItemSnowmanCreepy;
import com.jtrent238.epicproportions.addons.christmas.items.spawners.ItemSpawnGingerBreadMan;
import com.jtrent238.epicproportions.addons.christmas.items.spawners.ItemSpawnSanta;
import com.jtrent238.epicproportions.addons.christmas.items.spawners.ItemSpawnXmasCapitanCookie;
import com.jtrent238.epicproportions.addons.christmas.items.spawners.ItemSpawnXmasJen;
import com.jtrent238.epicproportions.addons.christmas.items.spawners.ItemSpawnXmasPat;
import com.jtrent238.epicproportions.addons.christmas.items.structureplacers.ItemGingerbreadHousePlacer;
import com.jtrent238.epicproportions.addons.christmas.items.structureplacers.ItemNorthPolePlacer;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemCandyCaneAxe;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemCandyCaneHoe;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemCandyCanePickaxe;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemCandyCaneShovel;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemGingerBreadAxe;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemGingerBreadHoe;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemGingerBreadPickaxe;
import com.jtrent238.epicproportions.addons.christmas.items.tools.ItemGingerBreadShovel;
import com.jtrent238.epicproportions.addons.christmas.items.tools.weapons.ItemCandyCaneSword;
import com.jtrent238.epicproportions.addons.christmas.items.tools.weapons.ItemGingerBreadSword;
import com.jtrent238.epicproportions.addons.christmas.items.ItemFilament;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHangingEntity;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ItemLoader {

	public static Item ItemCandyCane;
	public static Item ItemCandyCaneIngot;
	public static Item ItemChristmasTree;
	public static Item ItemStocking_red;
	public static Item ItemStocking_green;
	public static Item ItemGumDrop;
	public static Item ItemGingerBreadMan;
	public static Item ItemGingerBreadSword;
	public static Item ItemGingerBreadPickaxe;
	public static Item ItemGingerBreadAxe;
	public static Item ItemGingerBreadShovel;
	public static Item ItemGingerBreadHoe;
	public static Item ItemCandyCaneSword;
	public static Item ItemCandyCanePickaxe;
	public static Item ItemCandyCaneAxe;
	public static Item ItemCandyCaneShovel;
	public static Item ItemCandyCaneHoe;
	public static Item ItemGingerBreadDoor;
	public static Item ItemCandyCaneDoor;
	public static Item ItemBulb;
	public static Item ItemFilament;
	public static Item ItemFruitCake;
	public static Item ItemJingleBells;
	public static Item ItemSnowWand;
	public static Item ItemGingerBreadHelm;
	public static Item ItemGingerBreadChest;
	public static Item ItemGingerBreadLegs;
	public static Item ItemGingerBreadBoots;
	public static Item ItemCandyCaneHelm;
	public static Item ItemCandyCaneChest;
	public static Item ItemCandyCaneLegs;
	public static Item ItemCandyCaneBoots;
	public static Item ItemGiantSnowball;
	public static Item ItemXmasPaintng;
	public static Item ItemSpawnSanta;
	public static Item ItemSpawnGingerBreadMan;
	public static Item ItemSpawnXmasCapitanCookie;
	public static Item ItemSpawnXmasPat;
	public static Item ItemSpawnXmasJen;
	public static Item ItemSled;
	public static Item ItemBulbHolder;
	public static Item ItemFrozenIronIngot;
	public static Item ItemFrozenGoldIngot;
	public static Item ItemFrozenEmerald;
	public static Item ItemFrozenDiamond;
	public static Item ItemFrozenCoal;
	public static Item ItemFrozenLapis;
	public static Item ItemFrozenRedstone;
	public static Item ItemChristmasPresent;
	public static Item ItemEggNog;
	public static Item ItemPepperMintBark;
	public static Item ItemSnowman;
	public static Item ItemSnowmanCreepy;
	
	public static Item ItemGingerbreadHousePlacer;
	public static Item ItemNorthPolePlacer;

	
	
	/**
	 * Load Items.
	 */
	public static void LoadItems() {
		
		ItemCandyCane = new ItemFood(5, 5, false).setUnlocalizedName("ItemCandyCane").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCane").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//ItemCandyCaneIngot = new ItemCandyCaneIngot().setUnlocalizedName("ItemCandyCaneIngot").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneIngot").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemChristmasTree = new ItemChristmasTree().setUnlocalizedName("ItemChristmasTree").setTextureName(epicproportionsmod_christmas.MODID + ":ItemChristmasTree").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemStocking_red = new ItemStocking().setUnlocalizedName("ItemStocking_red").setTextureName(epicproportionsmod_christmas.MODID + ":ItemStocking_red").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemStocking_green = new ItemStocking().setUnlocalizedName("ItemStocking_green").setTextureName(epicproportionsmod_christmas.MODID + ":ItemStocking_green").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGumDrop = new ItemFood(2, 2, false).setUnlocalizedName("ItemGumDrop").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGumDrop").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadMan = new ItemFood(6, 6, false).setUnlocalizedName("ItemGingerBreadMan").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadMan").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadSword = new ItemGingerBreadSword(ToolMaterial.EMERALD).setUnlocalizedName("ItemGingerBreadSword").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadSword").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadPickaxe = new ItemGingerBreadPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("ItemGingerBreadPickaxe").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadPickaxe").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadAxe = new ItemGingerBreadAxe(ToolMaterial.EMERALD).setUnlocalizedName("ItemGingerBreadAxe").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadAxe").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadShovel = new ItemGingerBreadShovel(ToolMaterial.EMERALD).setUnlocalizedName("ItemGingerBreadShovel").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadShovel").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadHoe = new ItemGingerBreadHoe(ToolMaterial.EMERALD).setUnlocalizedName("ItemGingerBreadHoe").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadHoe").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadDoor = new ItemGingerBreadDoor(Material.cake, DoorType.gingerbread).setUnlocalizedName("ItemGingerBreadDoor").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadDoor");//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneSword = new ItemCandyCaneSword(ToolMaterial.EMERALD).setUnlocalizedName("ItemCandyCaneSword").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneSword").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCanePickaxe = new ItemCandyCanePickaxe(ToolMaterial.EMERALD).setUnlocalizedName("ItemCandyCanePickaxe").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCanePickaxe").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneAxe = new ItemCandyCaneAxe(ToolMaterial.EMERALD).setUnlocalizedName("ItemCandyCaneAxe").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneAxe").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneShovel = new ItemCandyCaneShovel(ToolMaterial.EMERALD).setUnlocalizedName("ItemCandyCaneShovel").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneShovel").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneHoe = new ItemCandyCaneHoe(ToolMaterial.EMERALD).setUnlocalizedName("ItemCandyCaneHoe").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneHoe").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneDoor = new ItemCandyCaneDoor(Material.cake, DoorType.peppermint).setUnlocalizedName("ItemCandyCaneDoor").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneDoor").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadHelm = new ItemGingerBreadArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("ItemGingerBreadHelm").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadHelm").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadChest = new ItemGingerBreadArmor(ItemArmor.ArmorMaterial.DIAMOND, 1, 1).setUnlocalizedName("ItemGingerBreadChest").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadChest").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadLegs = new ItemGingerBreadArmor(ItemArmor.ArmorMaterial.DIAMOND, 2, 2).setUnlocalizedName("ItemGingerBreadLegs").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadLegs").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGingerBreadBoots = new ItemGingerBreadArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3).setUnlocalizedName("ItemGingerBreadBoots").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerBreadBoots").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneHelm = new ItemCandyCaneArmor(ItemArmor.ArmorMaterial.DIAMOND, 0, 0).setUnlocalizedName("ItemCandyCaneHelm").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneHelm").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneChest = new ItemCandyCaneArmor(ItemArmor.ArmorMaterial.DIAMOND, 1, 1).setUnlocalizedName("ItemCandyCaneChest").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneChest").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneLegs = new ItemCandyCaneArmor(ItemArmor.ArmorMaterial.DIAMOND, 2, 2).setUnlocalizedName("ItemCandyCaneLegs").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneLegs").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemCandyCaneBoots = new ItemCandyCaneArmor(ItemArmor.ArmorMaterial.DIAMOND, 3, 3).setUnlocalizedName("ItemCandyCaneBoots").setTextureName(epicproportionsmod_christmas.MODID + ":ItemCandyCaneBoots").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//ItemPepperMintDoor = new ItemPepperMintDoor(ToolMaterial.EMERALD).setUnlocalizedName("ItemPepperMintDoor").setTextureName(epicproportionsmod_christmas.MODID + ":ItemPepperMintDoor").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemBulb = new ItemBulb(0, ItemBulb, null, null, null).setUnlocalizedName("ItemBulb").setTextureName(epicproportionsmod_christmas.MODID + ":ItemBulb").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas).setHasSubtypes(true);
		ItemFilament = new ItemFilament().setUnlocalizedName("ItemFilament").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFilament").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFruitCake = new ItemFood(6, 6, false).setUnlocalizedName("ItemFruitCake").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFruitCake").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemJingleBells = new ItemJingleBells().setUnlocalizedName("ItemJingleBells").setTextureName(epicproportionsmod_christmas.MODID + ":ItemJingleBells").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSnowWand = new ItemSnowWand().setUnlocalizedName("ItemSnowWand").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSnowWand").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemGiantSnowball = new ItemGiantSnowball().setUnlocalizedName("ItemGiantSnowball").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGiantSnowball").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemXmasPaintng = new ItemHangingEntity(EntityXmasPainting.class).setUnlocalizedName("ItemXmasPaintng").setTextureName(epicproportionsmod_christmas.MODID + ":ItemXmasPanting");//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSled = new ItemSled().setUnlocalizedName("ItemSled").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSled");//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemBulbHolder = new ItemBulbHolder().setUnlocalizedName("ItemBulbHolder").setTextureName(epicproportionsmod_christmas.MODID + ":ItemBulbHolder").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFrozenIronIngot = new ItemFrozenIronIngot().setUnlocalizedName("ItemFrozenIronIngot").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFrozenIronIngot").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFrozenGoldIngot = new ItemFrozenGoldIngot().setUnlocalizedName("ItemFrozenGoldIngot").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFrozenGoldIngot").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFrozenEmerald = new ItemFrozenEmerald().setUnlocalizedName("ItemFrozenEmerald").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFrozenEmerald").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFrozenDiamond = new ItemFrozenDiamond().setUnlocalizedName("ItemFrozenDiamond").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFrozenDiamond").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFrozenCoal = new ItemFrozenCoal().setUnlocalizedName("ItemFrozenCoal").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFrozenCoal").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFrozenLapis = new ItemFrozenLapis().setUnlocalizedName("ItemFrozenLapis").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFrozenLapis").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemFrozenRedstone = new ItemFrozenRedstone().setUnlocalizedName("ItemFrozenRedstone").setTextureName(epicproportionsmod_christmas.MODID + ":ItemFrozenRedstone").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemChristmasPresent = new ItemChristmasPresent().setUnlocalizedName("ItemChristmasPresent").setTextureName(epicproportionsmod_christmas.MODID + ":ItemChristmasPresent").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemEggNog = new ItemFood(3, 3, false).setUnlocalizedName("ItemEggNog").setTextureName(epicproportionsmod_christmas.MODID + ":ItemEggNog").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemPepperMintBark= new ItemFood(3, 3, false).setUnlocalizedName("ItemPepperMintBark").setTextureName(epicproportionsmod_christmas.MODID + ":ItemPepperMintBark").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSnowman = new ItemSnowman().setUnlocalizedName("ItemSnowman").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSnowman").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSnowmanCreepy = new ItemSnowmanCreepy().setUnlocalizedName("ItemSnowmanCreepy").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSnowmanCreepy").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		
		ItemSpawnSanta = new ItemSpawnSanta().setUnlocalizedName("ItemSpawnSanta").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSpawnSanta").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSpawnGingerBreadMan = new ItemSpawnGingerBreadMan().setUnlocalizedName("ItemSpawnGingerBreadMan").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSpawnGingerBreadMan").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSpawnXmasCapitanCookie = new ItemSpawnXmasCapitanCookie().setUnlocalizedName("ItemSpawnXmasCapitanCookie").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSpawnXmasCapitanCookie").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSpawnXmasPat = new ItemSpawnXmasPat().setUnlocalizedName("ItemSpawnXmasPat").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSpawnXmasPat").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemSpawnXmasJen = new ItemSpawnXmasJen().setUnlocalizedName("ItemSpawnXmasJen").setTextureName(epicproportionsmod_christmas.MODID + ":ItemSpawnXmasJen").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		
		ItemGingerbreadHousePlacer = new ItemGingerbreadHousePlacer(0).setUnlocalizedName("ItemGingerbreadHousePlacer").setTextureName(epicproportionsmod_christmas.MODID + ":ItemGingerbreadHousePlacer").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		ItemNorthPolePlacer = new ItemNorthPolePlacer(0).setUnlocalizedName("ItemNorthPolePlacer").setTextureName(epicproportionsmod_christmas.MODID + ":ItemNorthPolePlacer").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		registerItems();
	}

	/**
	 * Register Items.
	 */
	private static void registerItems(){
		
		GameRegistry.registerItem(ItemCandyCane, ItemCandyCane.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(ItemCandyCaneIngot, ItemCandyCaneIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemChristmasTree, ItemChristmasTree.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemStocking_red, ItemStocking_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemStocking_green, ItemStocking_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGumDrop, ItemGumDrop.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadMan, ItemGingerBreadMan.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadSword, ItemGingerBreadSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadPickaxe, ItemGingerBreadPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadAxe, ItemGingerBreadAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadShovel, ItemGingerBreadShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadHoe, ItemGingerBreadHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneSword, ItemCandyCaneSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCanePickaxe, ItemCandyCanePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneAxe, ItemCandyCaneAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneShovel, ItemCandyCaneShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneHoe, ItemCandyCaneHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadDoor, ItemGingerBreadDoor.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBulb, ItemBulb.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFilament, ItemFilament.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFruitCake, ItemFruitCake.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemJingleBells, ItemJingleBells.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSnowWand, ItemSnowWand.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadHelm, ItemGingerBreadHelm.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadChest, ItemGingerBreadChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadLegs, ItemGingerBreadLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGingerBreadBoots, ItemGingerBreadBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneHelm, ItemCandyCaneHelm.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneChest, ItemCandyCaneChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneLegs, ItemCandyCaneLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCandyCaneBoots, ItemCandyCaneBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGiantSnowball, ItemGiantSnowball.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemXmasPaintng, ItemXmasPaintng.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSled, ItemSled.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBulbHolder, ItemBulbHolder.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFrozenIronIngot, ItemFrozenIronIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFrozenGoldIngot, ItemFrozenGoldIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFrozenEmerald, ItemFrozenEmerald.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFrozenDiamond, ItemFrozenDiamond.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFrozenCoal, ItemFrozenCoal.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFrozenLapis, ItemFrozenLapis.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFrozenRedstone, ItemFrozenRedstone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemChristmasPresent, ItemChristmasPresent.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemEggNog, ItemEggNog.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPepperMintBark, ItemPepperMintBark.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSnowman, ItemSnowman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSnowmanCreepy, ItemSnowmanCreepy.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(ItemSpawnSanta, ItemSpawnSanta.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSpawnGingerBreadMan, ItemSpawnGingerBreadMan.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSpawnXmasCapitanCookie, ItemSpawnXmasCapitanCookie.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSpawnXmasPat, ItemSpawnXmasPat.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSpawnXmasJen, ItemSpawnXmasJen.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(ItemGingerbreadHousePlacer, ItemGingerbreadHousePlacer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemNorthPolePlacer, ItemNorthPolePlacer.getUnlocalizedName().substring(5));
	}
}
