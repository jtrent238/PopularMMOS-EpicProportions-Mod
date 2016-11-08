package com.jtrent238.epicproportions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.jtrent238.epicproportions.biome.BiomeDecorator;
import com.jtrent238.epicproportions.command.CommandModInfo;
import com.jtrent238.epicproportions.common.CommonProxy;
//import com.jtrent238.coremod.CommonProxy;
import com.jtrent238.epicproportions.eventhandler.OnJoinEvent;
import com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordSpawner;
import com.jtrent238.epicproportions.lib.LogHelper;
import com.jtrent238.epicproportions.network.MyMessage;
import com.jtrent238.epicproportions.render.RenderGuiHandler;
import com.jtrent238.epicproportions.tileentity.TileEntityLoader;
import com.jtrent238.epicproportions.worldgen.ModWorldGen;
import com.jtrent238.epicproportions.worldgen.WorldGenModFlower;
import com.jtrent238.epicproportions.worldgen.WorldGenPumpkin_Jen;
import com.jtrent238.epicproportions.worldgen.WorldGenPumpkin_Pat;
import com.jtrent238.epicproportions.worldgen.structures.StructureVillagePieces;
import com.jtrent238.epicproportions.worldgen.structures.structureTntSword;

import akka.Main;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import jdk.nashorn.internal.objects.annotations.Getter;
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
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

@Mod(modid="epicproportionsmod", name="jtrent238's EpicProportions Mod", version=(EpicProportionsMod.MODVERSION))
public class EpicProportionsMod
{

	@SidedProxy(clientSide="com.jtrent238.epicproportions.client.ClientProxy", serverSide="com.jtrent238.epicproportions.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "epicproportionsmod";
    
	// Version checking instance
	public static VersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;

	 
	//structureTntSword jtrent238_0 = new structureTntSword();
	//itemTNTSwordSpawner jtrent238_1 = new itemTNTSwordSpawner();

	@Instance(MODID)
    public static EpicProportionsMod instance;

	public static final String MODVERSION = "1.2.7.5";

	private static final String APIVERSION_NA = "API Not Currently Available.";
	public static final String APIVERSION = APIVERSION_NA/*/"0.0.0.0"/*/;
	public static final String MODNAME = "jtrent238's EpicProportions Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	
	public static final LogManager logger = LogManager.getLogManager();
	
	public static CrashReportCategory CRASHINFO;
	public static NBTTagCompound NBTJOIN;

	public static boolean isTConstructModLoaded;
	public static boolean isHalloweenLoaded;
	
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
	
	private Object network;
	
	private int ENTITY_ID_0;
	private int ENTITY_ID_1;
	private int ENTITY_ID_2;
	private int ENTITY_ID_3;
	private int ENTITY_ID_4;
	private int ENTITY_ID_5;
	private int ENTITY_ID_6;
	private int ENTITY_ID_7;
	private int ENTITY_ID_8;
	private int ENTITY_ID_9;
	private int ENTITY_ID_10;
	private int ENTITY_ID_11;
	private int ENTITY_ID_12;
	private int ENTITY_ID_13;
	private int ENTITY_ID_14;
	private int ENTITY_ID_15;
	private int ENTITY_ID_16;
	private int ENTITY_ID_17;
	private int ENTITY_ID_18;
	private int ENTITY_ID_19;
	private int ENTITY_ID_20;
	private int ENTITY_ID_21;

	private Object ITEM_ID_1;

	public static boolean BIRTHDAYPRESENT_CREATIVE;
	private boolean JTRENT238_SPAWN;

	private boolean ENABLE_SWORD_OF_EPICPROPORTIONS;
	private boolean PRESENT_ON_JOIN_CHANCE;
	private String chance;
	private int VILLAGER_ID_1;
	private int VILLAGER_ID_2;
	private int VILLAGER_ID_3;
	private int VILLAGER_ID_4;
	private Object BLOCK_ID_1;


	public static boolean BIRTHDAYPRESENT_CUSTOM_DROPS;

	public static final String CATEGORY_TWEAKS = "tweaks";
	public static final String CATEGORY_ENTITYIDS = "entityids";
	public static final String CATEGORY_VILLAGERIDS = "villagerids";
	public static final String CATEGORY_INFO = "information";
	public static final String CATEGORY_BLOCKS = "blocks";
	
	
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	public static Random rand;

	private static int p_i1986_1_;
	
	// Version checking instance
	//public static VersionChecker versionChecker;
	//public static boolean haveWarnedVersionOutOfDate = false;
	
	//Enchantments
	
	//@Getter
		

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	//***********************************************************************************
	/*
	 * Is Mods Loaded Start
	 */
	
	isTConstructModLoaded = Loader.isModLoaded("TConstruct");
	
	if (isTConstructModLoaded) {
		
		System.out.println("Tinkers Construct Mod Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Tinkers Construct Mod");
        }
        catch (Exception e) {
            LogHelper.log(Level.SEVERE, "Could not load Tinkers Construct Mod");
            e.printStackTrace(System.err);
        }
    
		}
	
	/*
	 * Is Mods Loaded End
	 */
	//***********************************************************************************
	/*
	 * Is Addons Loaded Start
	 */
	
	isHalloweenLoaded = Loader.isModLoaded("epicproportionsmod_halloween");
	
	if (isHalloweenLoaded) {
		
		System.out.println("Halloween Addon Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Halloween Addon");
        }
        catch (Exception e) {
            LogHelper.log(Level.SEVERE, "Could not load Halloween Addon");
            e.printStackTrace(System.err);
        }
    
		}
	
	/*
	 * Is Addons Loaded End
	 */
	//***********************************************************************************
	
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	event.getModConfigurationDirectory();
	
	config.load();
	config.getLoadedConfigVersion();
	
	
	BIRTHDAYPRESENT_CREATIVE = config.get(CATEGORY_TWEAKS, "Allow Present Drops in Creative", false).getBoolean(false);
	BIRTHDAYPRESENT_CUSTOM_DROPS = config.get(CATEGORY_TWEAKS, "Allow Custom Present Drops", false).getBoolean(false);
	PRESENT_ON_JOIN_CHANCE= config.get(CATEGORY_TWEAKS, "Chance to get a present on Join New world.", 50) != null;
	JTRENT238_SPAWN = config.get(CATEGORY_TWEAKS, "Allow jtrent238 to Spawn", true).getBoolean(true);
	ENABLE_SWORD_OF_EPICPROPORTIONS = config.get(CATEGORY_TWEAKS, "Enable Sword of Epic Proportions", true).getBoolean(true);
	
		//Entity Ids
			/*
	ENTITY_ID_1 = config.getInt("Bomby", CATEGORY_ENTITYIDS, 1, 0, 50, "Entity ID:");
	ENTITY_ID_2 = config.getInt("Captian Cookie", CATEGORY_ENTITYIDS, 2, 0, 50, "Entity ID:");
	ENTITY_ID_3 = config.getInt("FuriousDestroyer", CATEGORY_ENTITYIDS, 3, 0, 50, "Entity ID:");
	ENTITY_ID_4 = config.getInt("SuperGirlyGamer", CATEGORY_ENTITYIDS, 4, 0, 50, "Entity ID:");
	ENTITY_ID_5 = config.getInt("Fred 2.0", CATEGORY_ENTITYIDS, 5, 0, 50, "Entity ID:");
	ENTITY_ID_6 = config.getInt("Ninja Master", CATEGORY_ENTITYIDS, 6, 0, 50, "Entity ID:");
	ENTITY_ID_7 = config.getInt("Candy Man", CATEGORY_ENTITYIDS, 7, 0, 50, "Entity ID:");
	ENTITY_ID_8 = config.getInt("Captian Cookie Little", CATEGORY_ENTITYIDS, 8, 0, 50, "Entity ID:");
	ENTITY_ID_9 = config.getInt("jtrent238", CATEGORY_ENTITYIDS, 9, 0, 50, "Entity ID:");
	ENTITY_ID_10 = config.getInt("EntilyPatTNTPrimed", CATEGORY_ENTITYIDS, 10, 0, 50, "Entity ID:");
	ENTITY_ID_11 = config.getInt("EntilyPatArrow", CATEGORY_ENTITYIDS, 11, 0, 50, "Entity ID:");
	ENTITY_ID_12 = config.getInt("EntilyJenArrow", CATEGORY_ENTITYIDS, 12, 0, 50, "Entity ID:");
	ENTITY_ID_13 = config.getInt("Clown", CATEGORY_ENTITYIDS, 13, 0, 50, "Entity ID:");
	ENTITY_ID_14 = config.getInt("Candy Popper", CATEGORY_ENTITYIDS, 14, 0, 50, "Entity ID:");
	ENTITY_ID_15 = config.getInt("Sparky", CATEGORY_ENTITYIDS, 15, 0, 50, "Entity ID:");
	ENTITY_ID_16 = config.getInt("Kitty", CATEGORY_ENTITYIDS, 16, 0, 50, "Entity ID:");
	ENTITY_ID_17 = config.getInt("Kami", CATEGORY_ENTITYIDS, 17, 0, 50, "Entity ID:");
	ENTITY_ID_18 = config.getInt("Popo", CATEGORY_ENTITYIDS, 18, 0, 50, "Entity ID:");
	ENTITY_ID_19 = config.getInt("Banana", CATEGORY_ENTITYIDS, 19, 0, 50, "Entity ID:");
	ENTITY_ID_20 = config.getInt("EntityBlockling", CATEGORY_ENTITYIDS, 20, 0, 50, "Entity ID:");
	ENTITY_ID_21 = config.getInt("EntityBlockling_Small", CATEGORY_ENTITYIDS, 21, 0, 50, "Entity ID:");
			*/
		//Entity Ids
	
		//Villager Ids
	VILLAGER_ID_1 = config.getInt("VillagerOfEpicProportions", CATEGORY_VILLAGERIDS, 22, 6, 100, "Villager ID:");
	VILLAGER_ID_2 = config.getInt("JenVillager", CATEGORY_VILLAGERIDS, 23, 6, 100, "Villager ID:");
	VILLAGER_ID_3 = config.getInt("PatVillager", CATEGORY_VILLAGERIDS, 24, 6, 100, "Villager ID:");
	VILLAGER_ID_4 = config.getInt("TESTVillager", CATEGORY_VILLAGERIDS, 25, 6, 100, "Villager ID:");
		//Villager Ids
	
		//Block Ids
	//BLOCK_ID_1 = config.getInt(BlockLoader.blockFartBomb, CATEGORY_BLOCKS, defaultValue, minValue, maxValue, comment);
		//Block Ids
	
	config.addCustomCategoryComment(CATEGORY_INFO, "This Configfile is still [WIP] and may not work properly");
	//config.getCategoryNames();
		
	config.save();
	
	event.getModLog();
	event.getModState();
	//Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());
	
	//loadConfiguration(configFile);
	
	System.out.println("epicproportionsmod >>> Configuration File Loaded");
	
	/*
	//Achievements
	Achievements.loadAchievements();
	Achievements.registerPage();
    */
	
	//FMLCommonHandler.instance().bus().register(new OnJoinEvent());
	FMLCommonHandler.instance().bus().register(new ConfigHandler());
	
	 network = NetworkRegistry.INSTANCE.newSimpleChannel("MyChannel");
	   
     //network.registerMessage(MyMessage.Handler.class, MyMessage.class, 0, Side.SERVER);
     // network.registerMessage(SecondMessage.Handler.class, SecondMessage.class, 1, Side.CLIENT);
     // ...
	

}

/*
	private void PRESENT_ON_JOIN_CHANCE(Property property) {
		
	}
*/

	/**
	 * Load our config file and set default values
	 */
	/*private void loadConfiguration(Configuration configFile) {
		configFile.load();
		
		
		ConfigHandler.init(null);
		
	    if (configFile.hasChanged()) {
	    	configFile.save();
	    }
	}

	*/



private void setHarvestLevel(String string, int i) {

	
}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	
	ItemLoader.LoadItems();
	BlockLoader.loadBlocks();
	Recipes.registerRecpies();
	EntityLoader.LoadEntitys();
	Achievements.loadAchievements();
	Stats.RegisterStats();
	CrashReportHelper.getCrash();
	OreDict.addores();
	
	/*
	isTConstructModLoaded = Loader.isModLoaded("TConstruct");
	
	if (isTConstructModLoaded) {
		
		TConstruct.addOreDictionarySmelteryRecipes();
		
        }
    */
		
	
	
	//BlockLoader.loadBlocks();
	//ItemLoader.LoadItems();
	//EntityLoader.LoadEntitys();
	//TileEntityLoader.mainRegistry();
	
	
	//Achievements.loadAchievements();
	//Stats.RegisterStats();
	//ModLoader.LoadMods();
	//InventoryLoader.LoadInventorys();
	//SoundEvents.LoadSounds();
	//Recipes.registerRecpies();
	
	GameRegistry.registerWorldGenerator(new ModWorldGen(), 22);

	
	ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenIngot), 0, 1, 1));
	ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatIngot), 0, 1, 1));
	ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 0, 1, 1));
	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenIngot), 2, 5, 20));
	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatIngot), 2, 5, 20));
	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenIngot), 2, 4, 2));
	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatIngot), 2, 4, 2));
	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatSword), 1, 2, 1));
	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenSword), 1, 2, 1));
	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 1, 3, 10));
	
	
	
	//NetworkRegistry.instance().registerGuiHandler(instance, guiHandler);
	//GameRegistry.registerWorldGenerator(mStructureGenerator);

	// iterate through all the villager types and add their new trades
		/*for (int i = 0; i < 5; ++i) {
			VillagerRegistry.instance().registerVillageTradeHandler(i, new TradeHandler());
		}*/
		
		
}


public static CreativeTabs EpicProportionsMod = new CreativeTabs("EpicProportionsMod")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.itemgemofepicproportions).getItem();
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
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(null));
		MinecraftForge.EVENT_BUS.register(new CustomPresentDrops());
		MinecraftForge.EVENT_BUS.register(new VersionChecker());
		MinecraftForge.EVENT_BUS.register(new CommandModInfo());
		MinecraftForge.EVENT_BUS.register(new PotionLoader(33, false, 8171462));
		MinecraftForge.EVENT_BUS.register(new PotionLoader(33, false, 8171462));
		MinecraftForge.EVENT_BUS.register(new WorldGenPumpkin_Pat());
		MinecraftForge.EVENT_BUS.register(new WorldGenPumpkin_Jen());
		MinecraftForge.EVENT_BUS.register(new StructureVillagePieces());
		
		MinecraftForge.EVENT_BUS.register(new Yggdrasil());
		
        
		
		//MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
		MinecraftForge.ORE_GEN_BUS.register(new BiomeDecorator());
        
	    Recipes.registerRecpies();

	    
	}
	
	
}




					/*
public void modsLoaded(FMLPostInitializationEvent event) {
    if (Loader.isModLoaded("jtcoremod")) {
           try {
               LogHelper.log(Level.INFO, "Loaded jtrent238 Core Mod");
           }
           catch (Exception e) {
               LogHelper.log(Level.SEVERE, "Could not load jtrent238 Core Mod");
               e.printStackTrace(System.err);
           }
       }

{
	
}

}
			 		*/


/**
 * @return the pRESENT_ON_JOIN_CHANCE
 */
/*
public static int getPRESENT_ON_JOIN_CHANCE() {
	return PRESENT_ON_JOIN_CHANCE;
}
*/

/**
 * @param pRESENT_ON_JOIN_CHANCE the pRESENT_ON_JOIN_CHANCE to set
 */
/*
public void setPRESENT_ON_JOIN_CHANCE(int pRESENT_ON_JOIN_CHANCE) {
	PRESENT_ON_JOIN_CHANCE = pRESENT_ON_JOIN_CHANCE;
}
*/
}
