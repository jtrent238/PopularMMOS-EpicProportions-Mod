package com.jtrent238.epicproportions.addons.christmas;


import com.jtrent238.epicproportions.ForgeSubscribe;
import com.jtrent238.epicproportions.addons.christmas.common.CommonProxy;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityGiantSnowBall;
import com.jtrent238.epicproportions.addons.christmas.entity.EntitySled;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBulb;
import com.jtrent238.epicproportions.addons.christmas.world.Dimension;
import com.jtrent238.epicproportions.addons.christmas.world.biomes.ModBiomes;
import com.jtrent238.epicproportions.addons.christmas.worldgen.ModWorldGen;
import com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween;
import com.jtrent238.epicproportions.api.API;
import com.jtrent238.epicproportions.entity.EntilyJenArrow;
import com.jtrent238.epicproportions.entity.EntityJenBoat;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid="epicproportionsmod_christmas", name="jtrent238's EpicProportions Mod - Christmas Addon", version=(epicproportionsmod_christmas.MODVERSION), dependencies="after:epicproportionsmod")
@API(owner = "jtrent238", provides = "EpicproportionsModAPI", apiVersion = com.jtrent238.epicproportions.EpicProportionsMod.APIVERSION, addonName = epicproportionsmod_christmas.ADDONNAME, addonID = epicproportionsmod_christmas.ADDONID)

public class epicproportionsmod_christmas
{

	
	@SidedProxy(clientSide="com.jtrent238.epicproportions.addons.christmas.client.ClientProxy", serverSide="com.jtrent238.epicproportions.addons.christmas.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "epicproportionsmod_christmas";
	public static final String ADDONID = "christmas";

	@Instance(MODID)
    public static epicproportionsmod_christmas instance;
	public static final String MODVERSION = "1.0.2.1";
	public static final String MODNAME = "PopularMMOS EpicProportions Mod - Christmas Addon";
	public static final String ADDONNAME = "Christmas Addon";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	
	private int modEntityID = EntityRegistry.findGlobalUniqueEntityId();
	
	public static int BulbModelID;
	
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
	
	ModBiomes.registerWithBiomeDictionary();
	Dimension.registerWorldProvider();
	Dimension.registerDimensions();
	
	EntityRegistry.registerModEntity(EntityGiantSnowBall.class, "GiantSnowBall", EntityRegistry.findGlobalUniqueEntityId(), MODID, 80, 3, true);

	proxy.registerRenderThings();
	
	//GameRegistry.registerTileEntity(TileEntityBulb.class, "Bulb");
	//TileEntity.addMapping(TileEntityBulb.class, "Bulb_Mapping");
	BulbModelID = 72;
	
	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	EntityRegistry.registerModEntity(EntitySled.class, "Sled", ++modEntityID , MODID, 80, 3, false);
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
