package com.jtrent238.coremod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

@Mod(modid="jtcoremod", name="jtrent238's Core Mod", version="1.0.0.0")
public class coremod
{
	private static final String coremod = null;
	private static final String MODID = coremod;

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
    NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());




  } ;
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {}
}
