package com.jtrent238.epicproportions;

import java.util.Random;

import com.jtrent238.epicproportions.eventhandler.OnJoinEvent;
import com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordSpawner;
import com.jtrent238.epicproportions.render.RenderChests;
import com.jtrent238.epicproportions.tileentity.TileEntityLoader;
import com.jtrent238.epicproportions.worldgen.WorldGenModFlower;
import com.jtrent238.epicproportions.worldgen.structures.structureTntSword;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="epicproportionsmod", name="jtrent238's EpicProportions Mod", version=(EpicProportionsMod.MODVERSION))
public class EpicProportionsMod
{

	
	public static final String MODID = "epicproportionsmod";
    
   

	//structureTntSword jtrent238_0 = new structureTntSword();
	//itemTNTSwordSpawner jtrent238_1 = new itemTNTSwordSpawner();

	@Instance(MODID)
    public static EpicProportionsMod instance;
	public static final String MODVERSION = "1.0.6.4";
	public static final String MODNAME = "jtrent238's EpicProportions Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static CrashReportCategory CRASHINFO;
	public static NBTTagCompound NBTJOIN;



	private Object obj;



	private String villageblacksmith;



	private Random rnd;



	private String dungeon;



	private String bonus;



	private String stronglib;



	private String strongcross;



	private String dispenser;



	private String strongholdcorridor;



	private String junglechest;



	private String desertchest;



	private String minecorridor;

	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	public static Random rand;

	private static int p_i1986_1_;
	
	// Version checking instance
	//public static VersionChecker versionChecker;
	//public static boolean haveWarnedVersionOutOfDate = false;
	
	//Enchantments
	
	
		

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	/*
	//Achievements
	Achievements.loadAchievements();
	Achievements.registerPage();
    */
	
	FMLCommonHandler.instance().bus().register(new OnJoinEvent());
	}


private void setHarvestLevel(String string, int i) {

	
}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	BlockLoader.loadBlocks();
	ItemLoader.LoadItems();
	EntityLoader.LoadEntitys();
	TileEntityLoader.mainRegistry();
	RenderChests.RenderTileEntitys();
	Achievements.loadAchievements();
	//ModLoader.LoadMods();
	//InventoryLoader.LoadInventorys();
	//SoundEvents.LoadSounds();
	Recipes.registerRecpies();
	
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
	
	
	//MinecraftForge.addGrassSeed(new ItemStack(FoodModItems.StrawberrySeeds), 5);
	//NetworkRegistry.instance().registerGuiHandler(instance, guiHandler);
	//Not Implemented Yet//NetworkRegistry.INSTANCE.registerGuiHandler(FridgeGUI.instance, new GuiHandler());
	//GameRegistry.registerWorldGenerator(mStructureGenerator);

	// iterate through all the villager types and add their new trades
		for (int i = 0; i < 5; ++i) {
			VillagerRegistry.instance().registerVillageTradeHandler(i, new TradeHandler());
		}
}


public static CreativeTabs EpicProportionsMod = new CreativeTabs("EpicProportionsMod")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.itemgemofepicproportions).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "EpicProportionsMod.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	
	}
	
;







@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower());
	    Recipes.registerRecpies();

	}
	
	
}



}
