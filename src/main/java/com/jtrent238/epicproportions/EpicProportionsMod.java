package com.jtrent238.epicproportions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.jtrent238.epicproportions.biome.BiomeDecorator;
import com.jtrent238.epicproportions.blocks.blockModFlower;
import com.jtrent238.epicproportions.command.CommandChangelog;
import com.jtrent238.epicproportions.command.CommandModInfo;
import com.jtrent238.epicproportions.common.CommonProxy;
import com.jtrent238.epicproportions.dim.Dimension;
import com.jtrent238.epicproportions.dim.EpicProportionsBiomes;
import com.jtrent238.epicproportions.dim.WorldProviderEpicProportions;
import com.jtrent238.epicproportions.eventhandler.OnJoinEvent;
import com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordSpawner;
import com.jtrent238.epicproportions.lib.LogHelper;
import com.jtrent238.epicproportions.lib.ModInfoFileData;
import com.jtrent238.epicproportions.lib.WriteModInfoToFile;
import com.jtrent238.epicproportions.network.MyMessage;
import com.jtrent238.epicproportions.render.RenderGuiHandler;
import com.jtrent238.epicproportions.tileentity.TileEntityLoader;
import com.jtrent238.epicproportions.world.biome.BiomeGenJen;
import com.jtrent238.epicproportions.world.biome.BiomeGenPat;
import com.jtrent238.epicproportions.world.type.WorldTypeEpicProportions;
import com.jtrent238.epicproportions.worldgen.ModWorldGen;
import com.jtrent238.epicproportions.worldgen.WorldGenModFlower;
import com.jtrent238.epicproportions.worldgen.WorldGenPumpkin_Jen;
import com.jtrent238.epicproportions.worldgen.WorldGenPumpkin_Pat;
import com.jtrent238.epicproportions.worldgen.structures.StructureVillagePieces;
import com.jtrent238.epicproportions.worldgen.structures.WorldGenBomby;
import com.jtrent238.epicproportions.worldgen.structures.structureTntSword;

import akka.Main;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
//import jdk.nashorn.internal.objects.annotations.Getter;
import net.fybertech.meddle.MeddleMod;
import net.minecraft.block.Block;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.event.terraingen.BiomeEvent;

@Mod(modid="epicproportionsmod", name="jtrent238's EpicProportions Mod", version=(EpicProportionsMod.MODVERSION))
@MeddleMod(id="epicproportionsmod", name="jtrent238's EpicProportions Mod", version=(EpicProportionsMod.MODVERSION), author="jtrent238")
public class EpicProportionsMod implements ITweaker
{

	
	@SidedProxy(clientSide="com.jtrent238.epicproportions.client.ClientProxy", serverSide="com.jtrent238.epicproportions.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String MODID = "epicproportionsmod";
    
	// Version checking instance
		/*
	public static VersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;
		*/

	 
	//structureTntSword jtrent238_0 = new structureTntSword();
	//itemTNTSwordSpawner jtrent238_1 = new itemTNTSwordSpawner();

	@Instance(MODID)
    public static EpicProportionsMod instance;

	public static final String MODVERSION = "1.3.8.7";

	public static final String APIVERSION = "1.0.0.0";
	public static final String MODNAME = "jtrent238's EpicProportions Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	
	public static final String WIKI_URL = "https://github.com/jtrent238/PopularMMOS-EpicProportions-Mod/wiki";
	public static final String CHANGELOG_URL = "";
	
	//public static final LogManager logger = LogManager.getLogManager();
	public static final Class<LogHelper> logger = LogHelper.class;
	
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
	static boolean JTRENT238_SPAWN;

	static boolean ENABLE_SWORD_OF_EPICPROPORTIONS;
	private boolean PRESENT_ON_JOIN_CHANCE;
	public static boolean BIRTHDAYPRESENT_CUSTOM;
	public static boolean ENABLE_DEVMODE;
	public static boolean ENABLE_DEVLOGGING;
	private String chance;
	private static int VILLAGER_ID_1;
	private static int VILLAGER_ID_2;
	private static int VILLAGER_ID_3;
	private static int VILLAGER_ID_4;
	private Object BLOCK_ID_1;

	public boolean isChristmasLoaded;

	private String[] args;

	private ServerCommandManager command;

	private boolean ENABLE_BOMBY_STRUCTURE_GEN;

	static int ENTITY_ID_PGOLEM;

	static int ENTITY_ID_JGOLEM;

	 static int ENTITY_ID_CPTCOOKIE;

	 static int ENTITY_ID_PAT;

	 static int ENTITY_ID_JEN;

	 static int ENTITY_ID_FRED;

	 static int ENTITY_ID_NMASTER;

	 static int ENTITY_ID_CMAN;

	 static int ENTITY_ID_CPTCOOKIELITTLE;

	 static int ENTITY_ID_JTRENT238;

	 static int ENTITY_ID_PTNT;

	 static int ENTITY_ID_PARROW;

	 static int ENTITY_ID_JARROW;

	 static int ENTITY_ID_CLOWN;

	 static int ENTITY_ID_CPOPPER;

	 static int ENTITY_ID_SPARKY;

	 static int ENTITY_ID_KITTY;

	 static int ENTITY_ID_KAMI;

	 static int ENTITY_ID_POPO;

	 static int ENTITY_ID_BANANA;

	 static int ENTITY_ID_BLOCKLING;

	 static int ENTITY_ID_BLOCKLINGSML;

	static int ENTITY_ID_BOMBY;

	public static int DIM_EPICPROPORTIONS;

	

	static boolean ENABLE_PRESENT_TESTER;
	static boolean ENABLE_PRESENT_NORMAL;
	static boolean ENABLE_PRESENT_BAD;
	static boolean ENABLE_PRESENT_MEGA;
	
	static boolean ENABLE_SUPER_PAT_MULTITOOL;
	static boolean ENABLE_SUPER_JEN_MULTITOOL;
	static boolean ENABLE_SUPER_JEN_SWORD;
	static boolean ENABLE_SUPER_JEN_PICKAXE;
	static boolean ENABLE_SUPER_JEN_SHOVEL;
	static boolean ENABLE_SUPER_JEN_AXE;
	static boolean ENABLE_SUPER_JEN_HOE;
	static boolean ENABLE_SUPER_PAT_SWORD;
	static boolean ENABLE_SUPER_PAT_PICKAXE;
	static boolean ENABLE_SUPER_PAT_SHOVEL;
	static boolean ENABLE_SUPER_PAT_AXE;
	static boolean ENABLE_SUPER_PAT_HOE;

	

	public static boolean ENABLE_DETAILED_MOD_INFO;

	static boolean ENABLE_SUPER_JEN_ARMOR;

	static boolean ENABLE_SUPER_PAT_ARMOR;

	private static int VILLAGER_ID_5;


	public static boolean BIRTHDAYPRESENT_CUSTOM_DROPS;

	public static final String CATEGORY_TWEAKS = "tweaks";
	public static final String CATEGORY_ENTITYIDS = "entityids";
	public static final String CATEGORY_VILLAGERIDS = "villagerids";
	public static final String CATEGORY_INFO = "information";
	public static final String CATEGORY_BLOCKS = "blocks";
	public static final String CATEGORY_DEVMODE = "Developer Mode";
	public static final String CATEGORY_BIOMEIDS = "BiomeIds";
	public static final String CATEGORY_DIMIDS = "DimentionIds";
	
	private static int BIOME_ID_PAT;
	private static int BIOME_ID_JEN;
	
	public static final BiomeGenBase BIOMEPAT = (new BiomeGenPat(getBIOME_ID_PAT())).setColor(9286496).setBiomeName("FuriousDestroyer");
	public static final BiomeGenBase BIOMEJEN = (new BiomeGenJen(getBIOME_ID_JEN())).setColor(9286496).setBiomeName("SuperGirlyGamer");
	
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {
		
		//Thread.currentThread().setName("EpicProportionsMod");
		
	}
	
	public static Random rand;

	private static int p_i1986_1_;
	
	// Version checking instance
	//public static VersionChecker versionChecker;
	//public static boolean haveWarnedVersionOutOfDate = false;
	
	//Enchantments
	
	//@Getter
		
	public static WorldType WorldTypeEpicProportions = new WorldTypeEpicProportions(15, "EpicProportions");

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event) throws IOException
{
	//Thread.currentThread().setName("EpicProportionsMod");
	//ModInfoFileData.main(args);
	//LogHelper.init();
	//LogHelper.main(args);
	
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
	
	isChristmasLoaded = Loader.isModLoaded("epicproportionsmod_christmas");
	
	if (isChristmasLoaded) {
		
		System.out.println("Christmas Addon Loaded");
		try {
            LogHelper.log(Level.INFO, "Loaded Christmas Addon");
        }
        catch (Exception e) {
            LogHelper.log(Level.SEVERE, "Could not load Christmas Addon");
            e.printStackTrace(System.err);
        }
    
		}
	
	/*
	 * Is Addons Loaded End
	 */
	//***********************************************************************************
	/*
	 * Developer Mode Stuff
	 */
	
	if(ENABLE_DEVMODE == true){
		System.out.println("Developer Mode Enabled");
		Level SEVERE;
		LogHelper.log(Level.SEVERE, "***WARNING*** >>> Developer Mode Enabled <<<");
		
		if(ENABLE_DEVLOGGING == true){
			System.out.println("Developer Logging Enabled");
		}
	}
	
	if(ENABLE_DEVMODE == false){
		ENABLE_DEVLOGGING = false;
	}
	/*
	 * Developer Mode Stuff End
	 */
	//***********************************************************************************
	
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	event.getModConfigurationDirectory();
	event.getModConfigurationDirectory();
	event.getModLog();
	event.getModMetadata();
	event.getModState();
	event.getSide();
	event.getVersionProperties();
	
	
	config.load();
	config.getLoadedConfigVersion();
	
	
	BIRTHDAYPRESENT_CREATIVE = config.get(CATEGORY_TWEAKS, "Allow Present Drops in Creative", false).getBoolean(false);
	BIRTHDAYPRESENT_CUSTOM_DROPS = config.get(CATEGORY_TWEAKS, "Allow Custom Present Drops", false).getBoolean(false);
	BIRTHDAYPRESENT_CUSTOM = config.get(CATEGORY_TWEAKS, "Allow Custom Birthday Presents", false).getBoolean(false);
	PRESENT_ON_JOIN_CHANCE= config.get(CATEGORY_TWEAKS, "Chance to get a present on Join New world", 100) != null;
	JTRENT238_SPAWN = config.get(CATEGORY_TWEAKS, "Allow jtrent238 to Spawn", true).getBoolean(true);
	ENABLE_SWORD_OF_EPICPROPORTIONS = config.get(CATEGORY_TWEAKS, "Enable Sword of Epic Proportions", true).getBoolean(true);
	ENABLE_SUPER_JEN_ARMOR = config.get(CATEGORY_TWEAKS, "Enable Super FuriousDestroyer Armor", true).getBoolean(true);
	ENABLE_SUPER_PAT_ARMOR = config.get(CATEGORY_TWEAKS, "Enable Super SuperGirlyGamer Armor", true).getBoolean(true);
	
	ENABLE_SUPER_PAT_SWORD = config.get(CATEGORY_TWEAKS, "Enable Super FuriousDestroyer Sword", true).getBoolean(true);
	ENABLE_SUPER_PAT_PICKAXE = config.get(CATEGORY_TWEAKS, "Enable Super FuriousDestroyer Pickaxe", true).getBoolean(true);
	ENABLE_SUPER_PAT_SHOVEL = config.get(CATEGORY_TWEAKS, "Enable Super FuriousDestroyer Shovel", true).getBoolean(true);
	ENABLE_SUPER_PAT_AXE = config.get(CATEGORY_TWEAKS, "Enable Super FuriousDestroyer Axe", true).getBoolean(true);
	ENABLE_SUPER_PAT_HOE = config.get(CATEGORY_TWEAKS, "Enable Super FuriousDestroyer Hoe", true).getBoolean(true);
	ENABLE_SUPER_PAT_MULTITOOL = config.get(CATEGORY_TWEAKS, "Enable Super FuriousDestroyer MultiTool", true).getBoolean(true);
	
	ENABLE_SUPER_JEN_SWORD = config.get(CATEGORY_TWEAKS, "Enable Super SuperGirlyGamer Sword", true).getBoolean(true);
	ENABLE_SUPER_JEN_PICKAXE = config.get(CATEGORY_TWEAKS, "Enable Super SuperGirlyGamer Pickaxe", true).getBoolean(true);
	ENABLE_SUPER_JEN_SHOVEL = config.get(CATEGORY_TWEAKS, "Enable Super SuperGirlyGamer Shovel", true).getBoolean(true);
	ENABLE_SUPER_JEN_AXE = config.get(CATEGORY_TWEAKS, "Enable Super SuperGirlyGamer Axe", true).getBoolean(true);
	ENABLE_SUPER_JEN_HOE = config.get(CATEGORY_TWEAKS, "Enable Super SuperGirlyGamer Hoe", true).getBoolean(true);
	ENABLE_SUPER_JEN_MULTITOOL = config.get(CATEGORY_TWEAKS, "Enable Super SuperGirlyGamer MultiTool", true).getBoolean(true);
	
	ENABLE_BOMBY_STRUCTURE_GEN =  config.get(CATEGORY_TWEAKS, "Enable Bomby Structure Generation **Bugged**", false).getBoolean(false);
	
	ENABLE_DETAILED_MOD_INFO = config.get(CATEGORY_TWEAKS, "Enable Detail Mod Info", false).getBoolean(false);
	ENABLE_DEVMODE = config.get(CATEGORY_DEVMODE, "Enable Dev Mode", false).getBoolean(false);
	ENABLE_DEVLOGGING = config.get(CATEGORY_DEVMODE, "Enable Dev Logging", false).getBoolean(false);
	
	ENABLE_PRESENT_TESTER  =  config.get(CATEGORY_TWEAKS, "Enable Birthday Present Tester", true).getBoolean(true);
	ENABLE_PRESENT_NORMAL  =  config.get(CATEGORY_TWEAKS, "Enable Normal Birthday Present", true).getBoolean(true);
	ENABLE_PRESENT_BAD  =  config.get(CATEGORY_TWEAKS, "Enable Bad Birthday Present", true).getBoolean(true);
	ENABLE_PRESENT_MEGA  =  config.get(CATEGORY_TWEAKS, "Enable Mega Birthday Present", true).getBoolean(true);

	
		//Entity Ids
	ENTITY_ID_BOMBY = config.getInt("Bomby", CATEGORY_ENTITYIDS, 660, 256, 65535, "Entity ID:");
	ENTITY_ID_CPTCOOKIE = (config.getInt("Captian Cookie", CATEGORY_ENTITYIDS, 661, 256, 65535, "Entity ID:"));
	ENTITY_ID_PAT = config.getInt("FuriousDestroyer", CATEGORY_ENTITYIDS, 662, 256, 65535, "Entity ID:");
	ENTITY_ID_JEN = config.getInt("SuperGirlyGamer", CATEGORY_ENTITYIDS, 663, 256, 65535, "Entity ID:");
	ENTITY_ID_FRED = config.getInt("Fred 2.0", CATEGORY_ENTITYIDS, 664, 256, 65535, "Entity ID:");
	ENTITY_ID_NMASTER = config.getInt("Ninja Master", CATEGORY_ENTITYIDS, 665, 256, 65535, "Entity ID:");
	ENTITY_ID_CMAN = config.getInt("Candy Man", CATEGORY_ENTITYIDS, 666, 256, 65535, "Entity ID:");
	ENTITY_ID_CPTCOOKIELITTLE = config.getInt("Captian Cookie Little", CATEGORY_ENTITYIDS, 667, 256, 65535, "Entity ID:");
	ENTITY_ID_JTRENT238 = config.getInt("jtrent238", CATEGORY_ENTITYIDS, 668, 256, 65535, "Entity ID:");
	ENTITY_ID_PTNT = config.getInt("EntilyPatTNTPrimed", CATEGORY_ENTITYIDS, 669, 256, 65535, "Entity ID:");
	ENTITY_ID_PARROW = config.getInt("EntilyPatArrow", CATEGORY_ENTITYIDS, 670, 256, 65535, "Entity ID:");
	ENTITY_ID_JARROW = config.getInt("EntilyJenArrow", CATEGORY_ENTITYIDS, 671, 256, 65535, "Entity ID:");
	ENTITY_ID_CLOWN = config.getInt("Clown", CATEGORY_ENTITYIDS, 672, 256, 65535, "Entity ID:");
	ENTITY_ID_CPOPPER = config.getInt("Candy Popper", CATEGORY_ENTITYIDS, 673, 256, 65535, "Entity ID:");
	ENTITY_ID_SPARKY = config.getInt("Sparky", CATEGORY_ENTITYIDS, 674, 256, 65535, "Entity ID:");
	ENTITY_ID_KITTY = config.getInt("Kitty", CATEGORY_ENTITYIDS, 675, 256, 65535, "Entity ID:");
	ENTITY_ID_KAMI = config.getInt("Kami", CATEGORY_ENTITYIDS, 676, 256, 65535, "Entity ID:");
	ENTITY_ID_POPO = config.getInt("Popo", CATEGORY_ENTITYIDS, 677, 256, 65535, "Entity ID:");
	ENTITY_ID_BANANA = config.getInt("Banana", CATEGORY_ENTITYIDS, 678, 256, 65535, "Entity ID:");
	ENTITY_ID_BLOCKLING = config.getInt("EntityBlockling", CATEGORY_ENTITYIDS, 679, 256, 65535, "Entity ID:");
	ENTITY_ID_BLOCKLINGSML = config.getInt("EntityBlockling_Small", CATEGORY_ENTITYIDS, 680, 256, 65535, "Entity ID:");
	ENTITY_ID_PGOLEM = config.getInt("FuriousDestroyer Golem", CATEGORY_ENTITYIDS, 681, 256, 65535, "Entity ID:");
	ENTITY_ID_JGOLEM = config.getInt("SuperGirlyGamer Golem", CATEGORY_ENTITYIDS, 682, 256, 65535, "Entity ID:");
	
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
	setVILLAGER_ID_1(config.getInt("VillagerOfEpicProportions", CATEGORY_VILLAGERIDS, 22, 6, 100, "Villager ID:"));
	setVILLAGER_ID_2(config.getInt("JenVillager", CATEGORY_VILLAGERIDS, 23, 6, 100, "Villager ID:"));
	setVILLAGER_ID_3(config.getInt("PatVillager", CATEGORY_VILLAGERIDS, 24, 6, 100, "Villager ID:"));
	setVILLAGER_ID_4(config.getInt("TESTVillager", CATEGORY_VILLAGERIDS, 25, 6, 100, "Villager ID:"));
	//setVILLAGER_ID_5(config.getInt("SantaVillager", CATEGORY_VILLAGERIDS, 26, 6, 100, "Villager ID:"));
	
		//Villager Ids
	
		//Block Ids
	//BLOCK_ID_1 = config.getInt(BlockLoader.blockFartBomb, CATEGORY_BLOCKS, defaultValue, minValue, maxValue, comment);
		//Block Ids
	
	//Biome IDS
	setBIOME_ID_PAT(config.getInt("FuriousDestroyer Biome", CATEGORY_BIOMEIDS, 72, 70, 100, "Biome ID:"));
	setBIOME_ID_JEN(config.getInt("SuperGirlyGamer Biome", CATEGORY_BIOMEIDS, 73, 70, 100, "Biome ID:"));
	//Biome IDS
	
	//Dimenstion IDS
	DIM_EPICPROPORTIONS(config.getInt("EpicProportions Dim", CATEGORY_DIMIDS, 206, 200, 300, "Dimention ID:"));
	
	//Dimenstion IDS
	
	//config.addCustomCategoryComment(CATEGORY_INFO, "This Configfile is still [WIP] and may not work properly. ***Some things won't work!");
	config.addCustomCategoryComment(CATEGORY_DEVMODE, "Developer Mode Settings ***WARNING MAY BREAK YOUR GAME!***");
	//config.getCategoryNames();
	config.addCustomCategoryComment(CATEGORY_ENTITYIDS, "Entity IDS ***Changeing IDS currently does nothing untill I figure out a way to set this so it don't courrupt worlds where the mod was preveously played with old ids.!***");
	
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

	
	




	private void DIM_EPICPROPORTIONS(int int1) {
	
}

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
	
	//Thread.currentThread().setName("EpicProportionsMod");
	
	ItemLoader.LoadItems();
	BlockLoader.loadBlocks();
	Recipes.registerRecpies();
	EntityLoader.LoadEntitys();
	Achievements.loadAchievements();
	Stats.RegisterStats();
	CrashReportHelper.getCrash();
	OreDict.addores();
	BiomeDict.registerBiomes();
	Dimension.registerWorldProvider();
	Dimension.registerDimensions();
	
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
	
	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	//String p_149857_0_ = null;
	//GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenModFlower(blockModFlower.func_149857_e(p_149857_0_)), 0);
	
    if(ENABLE_BOMBY_STRUCTURE_GEN == true){
    	MapGenStructureIO.registerStructure(WorldGenBomby.class, "generateBombyStructure");
    	GameRegistry.registerWorldGenerator(new WorldGenBomby(), 0);
    	
    	if(ENABLE_DEVLOGGING == true){
    		System.out.println("Bomby Structure Registered");
    	}
    }
    
    
    /*
    GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenPumpkin_Pat(), 0);
    GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenPumpkin_Jen(), 0);
	*/
    
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
	ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 0, 1, 1));
	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 1, 3, 10));
	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.ItemMegaBirthdayPresentPlacer), 1, 3, 10));
	
	ChestGenHooks bombyStructure = ChestGenHooks.getInfo("bombyStructure");
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(Items.gunpowder), 0, 3, 15));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond), 0, 1, 3));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemBirthdayPresent), 0, 2, 25));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemSuperJenPick), 0, 1, 5));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemTNTLauncher), 0, 1, 3));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemgemofepicproportions), 0, 1, 4));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenSword), 0, 1, 4));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemPatIngot), 0, 1, 2));
	bombyStructure.addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemJenPick), 0, 1, 1));
	
	//ChestGenHooks.getInfo("bombyStructure");
	//WeightedRandomChestContent.generateChestContents(p_76293_0_, p_76293_1_, p_76293_2_, p_76293_3_);
	
	
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





		/*
		 * Development Creative Tab
		 */
	/*
public static CreativeTabs EpicProportionsMod_Dev = new CreativeTabs("EpicProportionsMod_Dev")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.itemTellMeRandomJoke).getItem();
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
	 */

		/*
		 * Development Creative Tab
		 */








@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		//Thread.currentThread().setName("EpicProportionsMod");
		
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(BlockLoader.blockFlowerChocolate));
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(BlockLoader.blockFlowerForJen));
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(BlockLoader.blockFlowerLove));
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(BlockLoader.blockFlowerPinkHeart));
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(BlockLoader.blockFlowerRainbow));
		MinecraftForge.EVENT_BUS.register(new WorldGenModFlower(BlockLoader.blockFlowerRedHeart));
		MinecraftForge.EVENT_BUS.register(new CustomPresentDrops());
		MinecraftForge.EVENT_BUS.register(new VersionChecker());
		MinecraftForge.EVENT_BUS.register(new CommandModInfo());
		//MinecraftForge.EVENT_BUS.register(new PotionLoader(33, false, 8171462));
		//MinecraftForge.EVENT_BUS.register(new PotionLoader(33, false, 8171462));
		MinecraftForge.EVENT_BUS.register(new WorldGenPumpkin_Pat());
		MinecraftForge.EVENT_BUS.register(new WorldGenPumpkin_Jen());
		MinecraftForge.EVENT_BUS.register(new StructureVillagePieces());
		//MinecraftForge.EVENT_BUS.register(new Yggdrasil());
		MinecraftForge.EVENT_BUS.register(new LogHelper());
		//MinecraftForge.EVENT_BUS.register(new CommandModInfo());
        //MinecraftForge.EVENT_BUS.register(new BiomeGenPat(getBIOME_ID_PAT()));
        //MinecraftForge.EVENT_BUS.register(new BiomeGenJen(getBIOME_ID_JEN()));
        //MinecraftForge.EVENT_BUS.register(new WorldProviderEpicProportions());
        //MinecraftForge.EVENT_BUS.register(new EpicProportionsBiomes(ENTITY_ID_0, null));
		//MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
		//MinecraftForge.ORE_GEN_BUS.register(new BiomeDecorator());
        
	    Recipes.registerRecpies();

	    MinecraftForge.EVENT_BUS.register(new CommandChangelog());
	    
	    //MUhTTawz.maAzeRcL();
	}
	
	
}

@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
	//Thread.currentThread().setName("EpicProportionsMod");
     MinecraftServer server = MinecraftServer.getServer();
     // Get's the current server instance
     
     ICommandManager command = server.getCommandManager();
     ServerCommandManager manager = (ServerCommandManager) command;
     
     manager.registerCommand(new CommandModInfo());
     manager.registerCommand(new CommandChangelog());
}

/**
 * @return the vILLAGER_ID_1
 */
public static int getVILLAGER_ID_1() {
	return VILLAGER_ID_1;
}

/**
 * @param vILLAGER_ID_1 the vILLAGER_ID_1 to set
 */
public void setVILLAGER_ID_1(int vILLAGER_ID_1) {
	VILLAGER_ID_1 = vILLAGER_ID_1;
}

/**
 * @return the vILLAGER_ID_2
 */
public static int getVILLAGER_ID_2() {
	return VILLAGER_ID_2;
}

/**
 * @param vILLAGER_ID_2 the vILLAGER_ID_2 to set
 */
public void setVILLAGER_ID_2(int vILLAGER_ID_2) {
	VILLAGER_ID_2 = vILLAGER_ID_2;
}

/**
 * @return the vILLAGER_ID_3
 */
public static int getVILLAGER_ID_3() {
	return VILLAGER_ID_3;
}

/**
 * @param vILLAGER_ID_3 the vILLAGER_ID_3 to set
 */
public void setVILLAGER_ID_3(int vILLAGER_ID_3) {
	VILLAGER_ID_3 = vILLAGER_ID_3;
}

/**
 * @return the vILLAGER_ID_4
 */
public static int getVILLAGER_ID_4() {
	return VILLAGER_ID_4;
}

/**
 * @param vILLAGER_ID_4 the vILLAGER_ID_4 to set
 */
public void setVILLAGER_ID_4(int vILLAGER_ID_4) {
	VILLAGER_ID_4 = vILLAGER_ID_4;
}

/**
 * @return the vILLAGER_ID_5
 */
public static int getVILLAGER_ID_5() {
	return VILLAGER_ID_5;
}

/**
 * @param vILLAGER_ID_5 the vILLAGER_ID_5 to set
 */
public void setVILLAGER_ID_5(int vILLAGER_ID_5) {
	VILLAGER_ID_5 = vILLAGER_ID_5;
}


@Override
public void acceptOptions(List<String> arg0, File arg1, File arg2, String arg3) {
	
}

@Override
public String[] getLaunchArguments() {
	return null;
}

@Override
public String getLaunchTarget() {
	return null;
}

@Override
public void injectIntoClassLoader(LaunchClassLoader arg0) {
	
}
/**
 * @return the bIOME_ID_PAT
 */
public static int getBIOME_ID_PAT() {
	return BIOME_ID_PAT;
}

/**
 * @param bIOME_ID_PAT the bIOME_ID_PAT to set
 */
public static void setBIOME_ID_PAT(int bIOME_ID_PAT) {
	BIOME_ID_PAT = bIOME_ID_PAT;
}

/**
 * @return the bIOME_ID_JEN
 */
public static int getBIOME_ID_JEN() {
	return BIOME_ID_JEN;
}

/**
 * @param bIOME_ID_JEN the bIOME_ID_JEN to set
 */
public static void setBIOME_ID_JEN(int bIOME_ID_JEN) {
	BIOME_ID_JEN = bIOME_ID_JEN;
}

{



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
	if(ENABLE_DEVLOGGING == true){
		
		System.out.println("***********************WARNING***********************");
		System.out.println("Developer Logging Enabled, Let the Console Spam begin");
		System.out.println("*****************************************************");
		
	}
		}

@SuppressWarnings("unchecked")
public class DimEpicProportions {
	public Object instance;
	public int DIMID = DIM_EPICPROPORTIONS;
}
	}
