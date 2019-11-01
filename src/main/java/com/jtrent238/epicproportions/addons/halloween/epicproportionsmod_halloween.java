package com.jtrent238.epicproportions.addons.halloween;


import com.jtrent238.epicproportions.ForgeSubscribe;
import com.jtrent238.epicproportions.addons.halloween.common.CommonProxy;
import com.jtrent238.epicproportions.addons.halloween.worldgen.ModWorldGen;
import com.jtrent238.epicproportions.api.API;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="epicproportionsmod_halloween", name="jtrent238's EpicProportions Mod - Halloween Addon", version=(epicproportionsmod_halloween.MODVERSION), dependencies="required-after:epicproportionsmod")
@API(owner = "jtrent238", provides = "EpicproportionsModAPI", apiVersion = com.jtrent238.epicproportions.EpicProportionsMod.APIVERSION, addonName = epicproportionsmod_halloween.ADDONNAME, addonID = epicproportionsmod_halloween.ADDONID)

public class epicproportionsmod_halloween
{

	
	@SidedProxy(clientSide="com.jtrent238.epicproportions.addons.halloween.client.ClientProxy", serverSide="com.jtrent238.epicproportions.addons.halloween.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	
	public static final String MODID = "epicproportionsmod_halloween";
	public static final String ADDONID = "halloween";

	@Instance(MODID)
    public static epicproportionsmod_halloween instance;


	/** This is used to keep track of GUIs that we make*/
	private static int modGuiIndex = 0;
	
	public static final String MODVERSION = "1.0.1.2";
	public static final String MODNAME = "PopularMMOS EpicProportions Mod - Halloween Addon";
	public static final String ADDONNAME = "Halloween Addon";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";

	
	/** Set our custom inventory Gui index to the next available Gui index */
	public static final int GUI_ITEM_INV = modGuiIndex++;
	
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
	// register CommonProxy as our GuiHandler
	NetworkRegistry.INSTANCE.registerGuiHandler(MODID, new CommonProxy());
	
	ItemLoader.LoadItems();
	BlockLoader.loadBlocks();
	Recipes.registerRecpies();
	EntityLoader.LoadEntitys();
	OreDict.addores();
	//Achievements.loadAchievements();
	//Stats.RegisterStats();

	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	
}


public static CreativeTabs EpicProportionsMod_Halloween = new CreativeTabs("EpicProportionsMod_Halloween")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.itemHalloweenPail).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "EpicProportionsMod_Halloween.png";
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
