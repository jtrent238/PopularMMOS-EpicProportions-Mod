package com.jtrent238.epicproportions.eventhandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import sun.applet.Main;
import sun.rmi.runtime.Log;

import java.sql.Date;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import ibxm.Player;

public class OnJoinEvent {
	
	
	private EntityPlayer playerclone;
	private String arg0;
	private String arg1;
	private int arg2;

	@SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

    	event.player.addChatComponentMessage(new ChatComponentText("§b§lHello" + " " + "§e§l" + event.player.getDisplayName() + "§b§l!"));
    	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§a§l" + EpicProportionsMod.MODNAME + " " + "§2§lMade By:jtrent238"));
    	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§6§lYou are running" + "§b§l" + " " + EpicProportionsMod.MODVERSION + " " + "§6§lof" + "§6§l" + " " + EpicProportionsMod.MODNAME + "!"));
    	//event.player.addChatComponentMessage(new ChatComponentText("§e§lLearn more at: §b§lhttp://bit.ly/FoodModWiki"));
    	event.player.triggerAchievement(Achievements.achievementinstall);
    	//event.player.addEntityCrashInfo(EpicProportionsMod.CRASHINFO);
    	//event.player.clonePlayer(playerclone, true);
    	event.player.extinguish();
    	event.player.getDisplayName();
    	//event.player.writeToNBT(EpicProportionsMod.NBTJOIN);
    	event.player.getBedLocation();
    	event.player.shouldHeal();
    	event.getListenerList();
    	event.hashCode();
    	Minecraft.getSystemTime();
    	Minecraft.isAmbientOcclusionEnabled();
    	Minecraft.isGuiEnabled();
    	Minecraft.getMinecraft();
    	Minecraft.getGLMaximumTextureSize();
    	Minecraft.isFancyGraphicsEnabled();
    	//Log.getLog(arg0, arg1, arg2);
    	//event.notifyAll();

    	
    }
			/*
	public void firstJoin(PlayerLoggedInEvent event) {
	      EntityPlayer player = event.player;
	      NBTTagCompound entityData = player.getEntityData();
	      if(entityData.getBoolean("firstJoin")) {
	         entityData.setBoolean("firstJoin", false);
	         player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.itemBirthdayPresent));
	      }
	   }
	   		*/
	
	@SubscribeEvent
	   public void firstJoin(PlayerLoggedInEvent event) {
	      EntityPlayer player = event.player;
	      NBTTagCompound entityData = player.getEntityData();
	      Calendar calendar = Calendar.getInstance();
	      if(!entityData.getBoolean("joinedBefore")) {
	         entityData.setBoolean("joinedBefore", true);
	         
	         player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.itemBirthdayPresent));
	         
			if (calendar.get(2) + 1 == 4 && calendar.get(5) == 4){
	         player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.itemBirthdayPresent));
			}
	      }
	   }
	
	public <FreePresentOnJoin> int getchance(){
		
		int randomchance = 50;
		return randomchance;
		
	}
	
	
}