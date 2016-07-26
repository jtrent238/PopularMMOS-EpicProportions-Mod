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

@Mod(modid="epicproportionsmod", name="jtrent238's EpicProportions Mod", version=("com.jtrent238.epicproportions.MODVERSION"))
public class EpicProportionsMod
{

	
	public static final String MODID = "epicproportionsmod";
    
   

	//structureTntSword jtrent238_0 = new structureTntSword();
	//itemTNTSwordSpawner jtrent238_1 = new itemTNTSwordSpawner();

	@Instance(MODID)
    public static EpicProportionsMod instance;
	public static final String MODVERSION = "1.0.6.3";
	public static final String MODNAME = "jtrent238's EpicProportions Mod";
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



public static CreativeTabs Tab_17827 = new CreativeTabs("Tab_23534")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5608.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22234 = new CreativeTabs("Tab_22291")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7722.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_32466 = new CreativeTabs("Tab_21383")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26637.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20090 = new CreativeTabs("Tab_23403")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12128.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20697 = new CreativeTabs("Tab_11090")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23145.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24593 = new CreativeTabs("Tab_27393")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14442.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_32691 = new CreativeTabs("Tab_27832")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10429.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18533 = new CreativeTabs("Tab_6004")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25763.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16559 = new CreativeTabs("Tab_18865")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24430.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13147 = new CreativeTabs("Tab_16848")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23214.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23186 = new CreativeTabs("Tab_30178")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9131.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_26898 = new CreativeTabs("Tab_717")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13626.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9929 = new CreativeTabs("Tab_24716")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19748.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10790 = new CreativeTabs("Tab_6508")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11431.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13315 = new CreativeTabs("Tab_28213")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21632.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4594 = new CreativeTabs("Tab_15314")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15867.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_1230 = new CreativeTabs("Tab_8798")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9674.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12450 = new CreativeTabs("Tab_5235")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20711.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17671 = new CreativeTabs("Tab_2210")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18576.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_26742 = new CreativeTabs("Tab_10718")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_460.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_26436 = new CreativeTabs("Tab_27142")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_6000.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16525 = new CreativeTabs("Tab_31191")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5638.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30591 = new CreativeTabs("Tab_18033")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32568.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9471 = new CreativeTabs("Tab_16513")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4070.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8874 = new CreativeTabs("Tab_29559")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_499.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16195 = new CreativeTabs("Tab_19130")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9493.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2800 = new CreativeTabs("Tab_30984")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5236.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_774 = new CreativeTabs("Tab_24322")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21863.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3798 = new CreativeTabs("Tab_6558")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_27960.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2820 = new CreativeTabs("Tab_19077")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22851.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15737 = new CreativeTabs("Tab_14074")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4543.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16007 = new CreativeTabs("Tab_2071")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26142.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23697 = new CreativeTabs("Tab_17812")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_27559.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17287 = new CreativeTabs("Tab_21834")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11469.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13585 = new CreativeTabs("Tab_4174")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_303.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19122 = new CreativeTabs("Tab_28131")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18578.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24944 = new CreativeTabs("Tab_31492")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9451.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6591 = new CreativeTabs("Tab_8283")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26410.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9476 = new CreativeTabs("Tab_3600")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7888.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11732 = new CreativeTabs("Tab_3632")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4435.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30197 = new CreativeTabs("Tab_11742")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1255.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13037 = new CreativeTabs("Tab_16682")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30839.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27567 = new CreativeTabs("Tab_18717")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17472.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11906 = new CreativeTabs("Tab_23277")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22917.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16869 = new CreativeTabs("Tab_19772")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19195.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27366 = new CreativeTabs("Tab_5731")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11808.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9338 = new CreativeTabs("Tab_9259")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_27275.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15880 = new CreativeTabs("Tab_10986")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23721.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4843 = new CreativeTabs("Tab_12180")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30072.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_421 = new CreativeTabs("Tab_28488")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11471.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27158 = new CreativeTabs("Tab_29974")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24136.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19472 = new CreativeTabs("Tab_28369")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18861.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6510 = new CreativeTabs("Tab_19487")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17759.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19 = new CreativeTabs("Tab_3403")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23449.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17656 = new CreativeTabs("Tab_10610")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_499.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28566 = new CreativeTabs("Tab_26216")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4918.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10159 = new CreativeTabs("Tab_28040")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22113.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24597 = new CreativeTabs("Tab_23537")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11367.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_533 = new CreativeTabs("Tab_12876")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14989.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4363 = new CreativeTabs("Tab_20996")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19244.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20261 = new CreativeTabs("Tab_18905")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1811.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17366 = new CreativeTabs("Tab_31461")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28065.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28127 = new CreativeTabs("Tab_17219")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25201.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_455 = new CreativeTabs("Tab_23632")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21895.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30748 = new CreativeTabs("Tab_11169")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11633.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18518 = new CreativeTabs("Tab_30299")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4385.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12159 = new CreativeTabs("Tab_12487")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24185.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11444 = new CreativeTabs("Tab_14400")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32344.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20364 = new CreativeTabs("Tab_6249")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21397.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16178 = new CreativeTabs("Tab_18855")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5206.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16467 = new CreativeTabs("Tab_31151")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12625.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19512 = new CreativeTabs("Tab_12111")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16154.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10038 = new CreativeTabs("Tab_8281")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30904.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23478 = new CreativeTabs("Tab_2077")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30135.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15274 = new CreativeTabs("Tab_18433")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10522.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20834 = new CreativeTabs("Tab_7167")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16185.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9221 = new CreativeTabs("Tab_17190")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4713.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_7968 = new CreativeTabs("Tab_18474")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25450.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_702 = new CreativeTabs("Tab_29949")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_834.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_26712 = new CreativeTabs("Tab_3218")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23523.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22179 = new CreativeTabs("Tab_5694")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18955.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4149 = new CreativeTabs("Tab_11443")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3892.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28913 = new CreativeTabs("Tab_23658")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8866.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17920 = new CreativeTabs("Tab_2565")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17166.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6745 = new CreativeTabs("Tab_6198")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12948.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2569 = new CreativeTabs("Tab_10413")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21412.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_7243 = new CreativeTabs("Tab_2852")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13273.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10988 = new CreativeTabs("Tab_16205")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28105.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22059 = new CreativeTabs("Tab_23923")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29315.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11786 = new CreativeTabs("Tab_22781")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5754.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24115 = new CreativeTabs("Tab_5350")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23527.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18315 = new CreativeTabs("Tab_31957")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1479.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31795 = new CreativeTabs("Tab_535")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7714.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17742 = new CreativeTabs("Tab_4241")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5213.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8301 = new CreativeTabs("Tab_7507")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19724.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28045 = new CreativeTabs("Tab_21558")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_552.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_25405 = new CreativeTabs("Tab_3374")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15869.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_7454 = new CreativeTabs("Tab_29375")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_445.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10836 = new CreativeTabs("Tab_24651")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24035.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14999 = new CreativeTabs("Tab_18488")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1930.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22180 = new CreativeTabs("Tab_12569")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15777.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10946 = new CreativeTabs("Tab_14301")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11525.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27224 = new CreativeTabs("Tab_17772")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32441.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10279 = new CreativeTabs("Tab_19721")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22351.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30827 = new CreativeTabs("Tab_5433")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16025.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_654 = new CreativeTabs("Tab_30752")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3589.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30649 = new CreativeTabs("Tab_19173")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10546.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11465 = new CreativeTabs("Tab_5308")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23088.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20895 = new CreativeTabs("Tab_5343")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2981.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28205 = new CreativeTabs("Tab_6329")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28317.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18565 = new CreativeTabs("Tab_21378")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9759.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23163 = new CreativeTabs("Tab_25604")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4610.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11499 = new CreativeTabs("Tab_8051")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10301.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11820 = new CreativeTabs("Tab_14125")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_6318.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22479 = new CreativeTabs("Tab_9204")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17817.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9820 = new CreativeTabs("Tab_27440")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32455.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6012 = new CreativeTabs("Tab_9700")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14405.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13001 = new CreativeTabs("Tab_12021")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13629.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14384 = new CreativeTabs("Tab_7009")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25953.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17819 = new CreativeTabs("Tab_24426")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17143.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9239 = new CreativeTabs("Tab_16719")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15377.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22524 = new CreativeTabs("Tab_5462")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18664.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20099 = new CreativeTabs("Tab_29483")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24955.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19359 = new CreativeTabs("Tab_20523")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4879.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19575 = new CreativeTabs("Tab_32498")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23707.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28870 = new CreativeTabs("Tab_18305")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_31118.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12507 = new CreativeTabs("Tab_4612")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19208.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30066 = new CreativeTabs("Tab_29953")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15451.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3308 = new CreativeTabs("Tab_32082")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17410.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11705 = new CreativeTabs("Tab_26349")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2361.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_26056 = new CreativeTabs("Tab_15922")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_356.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20083 = new CreativeTabs("Tab_28549")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20223.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5681 = new CreativeTabs("Tab_18090")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15942.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10951 = new CreativeTabs("Tab_24564")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12879.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_32715 = new CreativeTabs("Tab_15134")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2432.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6716 = new CreativeTabs("Tab_15766")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14156.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12684 = new CreativeTabs("Tab_5271")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7746.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12367 = new CreativeTabs("Tab_22188")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20729.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20758 = new CreativeTabs("Tab_7715")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16256.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12239 = new CreativeTabs("Tab_22490")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21056.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13099 = new CreativeTabs("Tab_26881")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8937.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_29541 = new CreativeTabs("Tab_5639")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1490.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13192 = new CreativeTabs("Tab_26260")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16024.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12808 = new CreativeTabs("Tab_14454")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18781.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5822 = new CreativeTabs("Tab_10316")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22725.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24928 = new CreativeTabs("Tab_23854")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15827.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8423 = new CreativeTabs("Tab_9486")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_6946.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20798 = new CreativeTabs("Tab_17932")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16815.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8784 = new CreativeTabs("Tab_8383")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13228.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17065 = new CreativeTabs("Tab_10009")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19326.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5983 = new CreativeTabs("Tab_15871")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19204.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_571 = new CreativeTabs("Tab_24309")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10776.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11114 = new CreativeTabs("Tab_11060")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23747.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16578 = new CreativeTabs("Tab_18547")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32073.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_1595 = new CreativeTabs("Tab_4982")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22593.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22110 = new CreativeTabs("Tab_192")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13534.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23146 = new CreativeTabs("Tab_20737")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28856.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_7060 = new CreativeTabs("Tab_32684")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23884.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16098 = new CreativeTabs("Tab_8749")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14812.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24845 = new CreativeTabs("Tab_18409")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18550.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2080 = new CreativeTabs("Tab_8997")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10810.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6653 = new CreativeTabs("Tab_21342")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1582.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9747 = new CreativeTabs("Tab_24019")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28404.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22113 = new CreativeTabs("Tab_17373")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29585.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4522 = new CreativeTabs("Tab_11958")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13500.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_409 = new CreativeTabs("Tab_23268")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14668.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8548 = new CreativeTabs("Tab_22686")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14365.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20236 = new CreativeTabs("Tab_23342")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12391.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16016 = new CreativeTabs("Tab_14986")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9067.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8655 = new CreativeTabs("Tab_19768")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8747.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31992 = new CreativeTabs("Tab_529")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2811.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23949 = new CreativeTabs("Tab_15379")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_834.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5411 = new CreativeTabs("Tab_14883")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18540.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15903 = new CreativeTabs("Tab_29197")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29472.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17791 = new CreativeTabs("Tab_2313")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7205.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24727 = new CreativeTabs("Tab_5410")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16462.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14610 = new CreativeTabs("Tab_8672")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26714.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_25514 = new CreativeTabs("Tab_20781")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18237.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_21107 = new CreativeTabs("Tab_11534")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_6968.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16061 = new CreativeTabs("Tab_4688")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1183.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12365 = new CreativeTabs("Tab_2145")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1535.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30210 = new CreativeTabs("Tab_15380")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30078.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31888 = new CreativeTabs("Tab_2775")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32057.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30562 = new CreativeTabs("Tab_23080")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11907.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10781 = new CreativeTabs("Tab_16698")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16977.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_32563 = new CreativeTabs("Tab_3532")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16692.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15508 = new CreativeTabs("Tab_12318")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28976.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13536 = new CreativeTabs("Tab_1866")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24842.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9348 = new CreativeTabs("Tab_23772")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3247.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3857 = new CreativeTabs("Tab_15626")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5040.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11832 = new CreativeTabs("Tab_677")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23297.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19447 = new CreativeTabs("Tab_23079")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24274.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3026 = new CreativeTabs("Tab_14784")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8028.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13763 = new CreativeTabs("Tab_7306")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11059.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13166 = new CreativeTabs("Tab_18056")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28812.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_21624 = new CreativeTabs("Tab_7930")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18454.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12424 = new CreativeTabs("Tab_4820")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1083.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_25999 = new CreativeTabs("Tab_26023")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_27413.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13275 = new CreativeTabs("Tab_20420")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21768.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18225 = new CreativeTabs("Tab_1033")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2041.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12144 = new CreativeTabs("Tab_14122")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7628.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18408 = new CreativeTabs("Tab_26941")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14644.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13463 = new CreativeTabs("Tab_11016")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20124.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19738 = new CreativeTabs("Tab_23581")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32014.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10236 = new CreativeTabs("Tab_22238")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28774.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20916 = new CreativeTabs("Tab_707")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5280.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17443 = new CreativeTabs("Tab_18874")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29247.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11200 = new CreativeTabs("Tab_2367")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10539.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23775 = new CreativeTabs("Tab_4423")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10166.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8930 = new CreativeTabs("Tab_10659")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20867.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30378 = new CreativeTabs("Tab_32076")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25041.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31474 = new CreativeTabs("Tab_2996")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29808.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6890 = new CreativeTabs("Tab_12386")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5240.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_32044 = new CreativeTabs("Tab_15580")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9813.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28284 = new CreativeTabs("Tab_19905")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30841.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4010 = new CreativeTabs("Tab_28986")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20370.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_552 = new CreativeTabs("Tab_15738")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7795.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24104 = new CreativeTabs("Tab_25818")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30273.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11463 = new CreativeTabs("Tab_30586")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_320.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18494 = new CreativeTabs("Tab_8323")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16747.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3388 = new CreativeTabs("Tab_23324")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26298.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2197 = new CreativeTabs("Tab_10133")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1233.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9879 = new CreativeTabs("Tab_7237")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21486.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9671 = new CreativeTabs("Tab_15601")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11206.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_29433 = new CreativeTabs("Tab_4153")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5664.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2275 = new CreativeTabs("Tab_2792")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32481.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23055 = new CreativeTabs("Tab_29607")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29732.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24272 = new CreativeTabs("Tab_7827")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21351.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15938 = new CreativeTabs("Tab_28829")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5115.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_259 = new CreativeTabs("Tab_24883")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1217.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24553 = new CreativeTabs("Tab_1640")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3770.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_22338 = new CreativeTabs("Tab_6752")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30553.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14371 = new CreativeTabs("Tab_20111")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8477.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18288 = new CreativeTabs("Tab_7219")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8619.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13611 = new CreativeTabs("Tab_16735")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29019.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10638 = new CreativeTabs("Tab_5810")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_892.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_48 = new CreativeTabs("Tab_25033")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4880.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9597 = new CreativeTabs("Tab_16928")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23656.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14634 = new CreativeTabs("Tab_27519")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22621.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11548 = new CreativeTabs("Tab_10244")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10830.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_28446 = new CreativeTabs("Tab_3994")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11152.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16608 = new CreativeTabs("Tab_24839")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19774.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_7108 = new CreativeTabs("Tab_19234")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12005.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9716 = new CreativeTabs("Tab_12783")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29176.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8095 = new CreativeTabs("Tab_16472")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18509.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31870 = new CreativeTabs("Tab_7274")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25884.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14297 = new CreativeTabs("Tab_1685")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7483.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2474 = new CreativeTabs("Tab_18530")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_155.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14722 = new CreativeTabs("Tab_28171")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26337.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23673 = new CreativeTabs("Tab_12565")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21000.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5642 = new CreativeTabs("Tab_3043")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_362.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_1423 = new CreativeTabs("Tab_19745")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13275.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23306 = new CreativeTabs("Tab_22616")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14607.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14711 = new CreativeTabs("Tab_2882")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11463.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5045 = new CreativeTabs("Tab_3045")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11804.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12821 = new CreativeTabs("Tab_1408")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20396.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15502 = new CreativeTabs("Tab_2475")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17726.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20276 = new CreativeTabs("Tab_19184")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_23502.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27184 = new CreativeTabs("Tab_21641")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2995.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8065 = new CreativeTabs("Tab_9312")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20572.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27217 = new CreativeTabs("Tab_6567")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20276.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_29259 = new CreativeTabs("Tab_21120")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22377.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4676 = new CreativeTabs("Tab_5730")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30635.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10199 = new CreativeTabs("Tab_1129")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11233.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_124501 = new CreativeTabs("Tab_22738")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1302.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31039 = new CreativeTabs("Tab_15249")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15145.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16364 = new CreativeTabs("Tab_24944")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32303.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12802 = new CreativeTabs("Tab_3720")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3684.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5687 = new CreativeTabs("Tab_20860")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11424.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9424 = new CreativeTabs("Tab_19996")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20626.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_29262 = new CreativeTabs("Tab_25904")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18937.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_21059 = new CreativeTabs("Tab_2219")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24077.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_198 = new CreativeTabs("Tab_18927")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19616.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4987 = new CreativeTabs("Tab_21970")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32517.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_21497 = new CreativeTabs("Tab_16359")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26221.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_29659 = new CreativeTabs("Tab_18619")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4623.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24549 = new CreativeTabs("Tab_13277")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3768.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3154 = new CreativeTabs("Tab_29109")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19690.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_26464 = new CreativeTabs("Tab_26922")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12280.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30715 = new CreativeTabs("Tab_2010")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10487.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31268 = new CreativeTabs("Tab_13574")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21844.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11518 = new CreativeTabs("Tab_14836")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24098.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15255 = new CreativeTabs("Tab_945")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3750.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30187 = new CreativeTabs("Tab_20958")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18993.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14439 = new CreativeTabs("Tab_13608")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16872.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18193 = new CreativeTabs("Tab_22540")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7083.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9548 = new CreativeTabs("Tab_8797")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22274.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2169 = new CreativeTabs("Tab_19725")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24282.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2952 = new CreativeTabs("Tab_7467")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10094.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30864 = new CreativeTabs("Tab_27931")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_28820.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14343 = new CreativeTabs("Tab_19590")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_27954.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_21668 = new CreativeTabs("Tab_22041")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11725.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18476 = new CreativeTabs("Tab_13196")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9503.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19391 = new CreativeTabs("Tab_25223")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18467.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31653 = new CreativeTabs("Tab_19849")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1618.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13705 = new CreativeTabs("Tab_11357")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18151.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5349 = new CreativeTabs("Tab_16906")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25968.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27183 = new CreativeTabs("Tab_207")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14661.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6674 = new CreativeTabs("Tab_7057")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9232.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14733 = new CreativeTabs("Tab_10841")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18845.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18057 = new CreativeTabs("Tab_28815")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15695.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12037 = new CreativeTabs("Tab_26800")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2869.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_326 = new CreativeTabs("Tab_24997")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9864.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23755 = new CreativeTabs("Tab_18027")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21184.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18129 = new CreativeTabs("Tab_353")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10142.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9357 = new CreativeTabs("Tab_19067")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_32624.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13697 = new CreativeTabs("Tab_30962")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4193.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11456 = new CreativeTabs("Tab_22479")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7567.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24884 = new CreativeTabs("Tab_23176")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22768.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14590 = new CreativeTabs("Tab_30645")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3288.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20426 = new CreativeTabs("Tab_23897")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22824.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16692 = new CreativeTabs("Tab_23513")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9213.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4613 = new CreativeTabs("Tab_2177")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26498.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13966 = new CreativeTabs("Tab_10992")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30758.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_25764 = new CreativeTabs("Tab_26940")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_27115.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13931 = new CreativeTabs("Tab_14193")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_19012.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13259 = new CreativeTabs("Tab_9764")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17276.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19129 = new CreativeTabs("Tab_8680")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30100.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20242 = new CreativeTabs("Tab_25732")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8217.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5260 = new CreativeTabs("Tab_12494")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25002.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9952 = new CreativeTabs("Tab_21971")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_31592.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10445 = new CreativeTabs("Tab_26081")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16330.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_7118 = new CreativeTabs("Tab_13046")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29337.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20560 = new CreativeTabs("Tab_7542")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3729.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20300 = new CreativeTabs("Tab_14308")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2290.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5049 = new CreativeTabs("Tab_24127")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20489.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_4293 = new CreativeTabs("Tab_11702")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5416.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20719 = new CreativeTabs("Tab_117")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24004.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_1251 = new CreativeTabs("Tab_2639")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8673.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23318 = new CreativeTabs("Tab_2406")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9111.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3285 = new CreativeTabs("Tab_29723")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13815.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_10055 = new CreativeTabs("Tab_5340")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_5376.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20893 = new CreativeTabs("Tab_23963")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18773.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6006 = new CreativeTabs("Tab_30676")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_14954.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15305 = new CreativeTabs("Tab_16309")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_12676.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_25166 = new CreativeTabs("Tab_124")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_2753.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_6708 = new CreativeTabs("Tab_2821")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7490.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12780 = new CreativeTabs("Tab_25979")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_15127.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23188 = new CreativeTabs("Tab_1948")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22712.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11449 = new CreativeTabs("Tab_10979")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4430.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_3331 = new CreativeTabs("Tab_22514")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7212.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_731 = new CreativeTabs("Tab_3428")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_26620.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_1997 = new CreativeTabs("Tab_32506")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_9538.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8173 = new CreativeTabs("Tab_29847")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16647.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_29470 = new CreativeTabs("Tab_29335")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24356.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5123 = new CreativeTabs("Tab_4993")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20908.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23659 = new CreativeTabs("Tab_15067")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_30770.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30758 = new CreativeTabs("Tab_19089")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_11757.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16301 = new CreativeTabs("Tab_13285")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1027.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_20936 = new CreativeTabs("Tab_8401")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29338.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_18625 = new CreativeTabs("Tab_2867")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_16089.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_5605 = new CreativeTabs("Tab_20989")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21618.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_31117 = new CreativeTabs("Tab_21178")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17380.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_14276 = new CreativeTabs("Tab_3513")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8201.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_29116 = new CreativeTabs("Tab_21296")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_6623.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30878 = new CreativeTabs("Tab_10287")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_18817.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23337 = new CreativeTabs("Tab_29766")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29158.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17552 = new CreativeTabs("Tab_13985")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_31795.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_2650 = new CreativeTabs("Tab_27841")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_25252.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_7841 = new CreativeTabs("Tab_29415")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_31184.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_17556 = new CreativeTabs("Tab_17850")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_24099.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_16590 = new CreativeTabs("Tab_22222")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21943.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_25965 = new CreativeTabs("Tab_25446")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_10972.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30281 = new CreativeTabs("Tab_15561")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1125.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_23531 = new CreativeTabs("Tab_2871")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_22763.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_9594 = new CreativeTabs("Tab_1407")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_8264.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_15249 = new CreativeTabs("Tab_4665")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_4709.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_19555 = new CreativeTabs("Tab_23062")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_31846.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_30698 = new CreativeTabs("Tab_20469")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_21060.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_11633 = new CreativeTabs("Tab_12618")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_29331.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24939 = new CreativeTabs("Tab_28989")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_3947.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_25569 = new CreativeTabs("Tab_20911")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_7717.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_12491 = new CreativeTabs("Tab_9138")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_20902.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_24129 = new CreativeTabs("Tab_13751")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_13680.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_27171 = new CreativeTabs("Tab_7653")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_1215.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_8895 = new CreativeTabs("Tab_1612")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "Tab_17259.png";
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;
public static CreativeTabs Tab_13158 = new CreativeTabs("Tab_4445")
{
	public Item getTabIconItem() {
		return new ItemStack(Items.diamond).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	}
	;



	{
		
	};

}
