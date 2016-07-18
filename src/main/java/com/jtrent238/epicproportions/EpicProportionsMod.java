package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.items.structureplacers.itemTNTSwordSpawner;
import com.jtrent238.epicproportions.render.RenderChests;
import com.jtrent238.epicproportions.tileentity.TileEntityLoader;
import com.jtrent238.epicproportions.worldgen.structures.structureTntSword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;

@Mod(modid="epicproportionsmod", name="jtrent238's EpicProportions Mod", version=("com.jtrent238.epicproportions.MODVERSION"))
public class EpicProportionsMod
{

	public static final String MODID = "epicproportionsmod";
	
    
   

	//structureTntSword jtrent238_0 = new structureTntSword();
	//itemTNTSwordSpawner jtrent238_1 = new itemTNTSwordSpawner();

	@Instance(MODID)
    public static EpicProportionsMod instance;
	public static final String MODVERSION = "1.0.5.1";

	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	public static double rand;

	private static int p_i1986_1_;
	
	// Version checking instance
	//public static VersionChecker versionChecker;
	//public static boolean haveWarnedVersionOutOfDate = false;
	
	//Enchantments
	
	
		

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
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

	    Recipes.registerRecpies();

	}
	
	
}











}
