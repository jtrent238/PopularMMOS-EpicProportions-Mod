package com.jtrent238.epicproportions.addons.christmas;


import com.jtrent238.epicproportions.ForgeSubscribe;
import com.jtrent238.epicproportions.addons.christmas.common.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid="epicproportionsmod_christmas", name="jtrent238's EpicProportions Mod - Christmas Addon", version=(epicproportionsmod_christmas.MODVERSION), dependencies="after:epicproportionsmod")
public class epicproportionsmod_christmas
{

	
	@SidedProxy(clientSide="com.jtrent238.epicproportions.addons.christmas.client.ClientProxy", serverSide="com.jtrent238.epicproportions.addons.christmas.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "epicproportionsmod_christmas";
	public static final String ADDONID = "christmas";

	@Instance(MODID)
    public static epicproportionsmod_christmas instance;
	public static final String MODVERSION = "1.0.0.0";
	public static final String MODNAME = "jtrent238's EpicProportions Mod - Christmas Addon";
	public static final String ADDONNAME = "Christmas Addon";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	

}






@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	
	ItemLoader.LoadItems();
	BlockLoader.loadBlocks();
	Recipes.registerRecpies();
	EntityLoader.LoadEntitys();
	OreDict.addores();
	Achievements.loadAchievements();
	Stats.RegisterStats();

	
}


public static CreativeTabs EpicProportionsMod_Christmas = new CreativeTabs("EpicProportionsMod_Christmas")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.ItemCandyCane).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "EpicProportionsMod_Christmas.png";
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
		
	    //Recipes.registerRecpies();

	    
	}
	
	
}




					
}
