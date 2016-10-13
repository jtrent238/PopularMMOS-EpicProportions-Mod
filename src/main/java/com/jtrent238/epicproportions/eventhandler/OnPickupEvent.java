package com.jtrent238.epicproportions.eventhandler;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class OnPickupEvent {

	public EntityPlayer player;
	private Result ALLOW;

	
	@SubscribeEvent
	public void onItemPickup(EntityItemPickupEvent event, Item item, Block block) {
		
		event.setResult(ALLOW);
	
		
		if (block == BlockLoader.blockFlowerForJen) {
			   player.triggerAchievement(Achievements.achievementflowerforjen);
			  }
		if (item == ItemLoader.itemPatStar) {
			   player.triggerAchievement(Achievements.achievementPatStar);
			  }
		if (item == ItemLoader.itemJenStar) {
			   player.triggerAchievement(Achievements.achievementJenStar);
			  }
	}

	}
	

