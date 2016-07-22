package com.jtrent238.epicproportions.eventhandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class OnJoinEvent {
	
	
	private EntityPlayer playerclone;

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
    	//event.notifyAll();
    }

    
	
}