package com.jtrent238.epicproportions.eventhandler;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.PlayerData;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class InstallEvent {

	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent e) {
	    if (e.entity instanceof EntityPlayer) {
	        PlayerData.triggerAchievement(Achievements.achievementinstall);
	    }
	}
	
}
