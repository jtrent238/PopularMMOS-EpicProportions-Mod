package com.jtrent238.epicproportions.common;

import com.jtrent238.epicproportions.tileentity.TileEntityJenChest;
import com.jtrent238.epicproportions.tileentity.TileEntityPatChest;
import com.jtrent238.epicproportions.worldgen.ModWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	
	
	public void init(FMLInitializationEvent e) {
	    //GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	    //FMLCommonHandler.instance().bus().register(new MyEventHandler());
        //MinecraftForge.EVENT_BUS.register(new MyEventHandler());
        //System.out.print("common init fired!");
	
	}
	/*
private static final String modid = "epicproportionsmod";
	
	public void registerRenderThings() {

	}

	public int addArmor(String armor) {
		return 0;
	}
	
	public void registerNetworkStuff(){
		//NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new TMGuiHandler());
	}

	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityPatChest.class, modid);
		GameRegistry.registerTileEntity(TileEntityJenChest.class, modid);
	}
	
	*/

	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) {
		return null;
	}

}