package com.jtrent238.epicproportions.common;

import com.jtrent238.epicproportions.ConfigHandler;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.client.SaveHandler;
import com.jtrent238.epicproportions.command.CommandModInfo;
import com.jtrent238.epicproportions.lib.LogHelper;
import com.jtrent238.epicproportions.tileentity.TileEntityJenChest;
import com.jtrent238.epicproportions.tileentity.TileEntityPatChest;
import com.jtrent238.epicproportions.worldgen.ModWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	
	
	private static final String modid = EpicProportionsMod.MODID;
	private String owner;

	public void init(FMLInitializationEvent e) {
	    //GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	    //FMLCommonHandler.instance().bus().register(new MyEventHandler());
        //MinecraftForge.EVENT_BUS.register(new MyEventHandler());
        //System.out.print("common init fired!");
	
		LogHelper.init();
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
	
	   /**
     * Creates a new NBTTagCompound for the world, with the given NBTTag as the "Player"
     */
    public NBTTagCompound cloneNBTCompound(NBTTagCompound p_76082_1_)
    {
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        this.updateTagCompound(nbttagcompound1, p_76082_1_);
        return nbttagcompound1;
    }
    
	public void updateTagCompound(NBTTagCompound p_76064_1_, NBTTagCompound p_76064_2_)
    {
        p_76064_1_.setString(EpicProportionsMod.MODID + "." + "modversion", EpicProportionsMod.MODVERSION);
        p_76064_1_.setString(EpicProportionsMod.MODID + "." + "modname", EpicProportionsMod.MODNAME);
        p_76064_1_.setString(EpicProportionsMod.MODID + "." + "modid", EpicProportionsMod.MODID);
        p_76064_1_.setString(EpicProportionsMod.MODID + "." + "modname", EpicProportionsMod.MODAUTHOR);
        
        
        if (p_76064_2_ != null)
        {
            p_76064_1_.setTag("Player", p_76064_2_);
        }
    }

	public void registerTileEntities(){
		
		GameRegistry.registerTileEntity(TileEntityJenChest.class, owner);
			TileEntity.addMapping(TileEntityJenChest.class, owner);
		GameRegistry.registerTileEntity(TileEntityPatChest.class, owner);
			TileEntity.addMapping(TileEntityPatChest.class, owner);

		
	}
}