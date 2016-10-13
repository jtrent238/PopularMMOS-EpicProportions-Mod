package com.jtrent238.epicproportions.eventhandler;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import net.minecraft.item.ItemStack;

public class OnPickupJenStarEvent {
	
	private Result ALLOW;
	private ItemStack itemstack = new ItemStack(ItemLoader.itemJenStar);
	
	@SubscribeEvent
    public void PickupJenStar(PlayerEvent.ItemPickupEvent event) {
		
		event.setResult(ALLOW);
		
    	//event.player.triggerAchievement(Achievements.achievementJenStar);
    	
    
	
	if (event.pickedUp.getEntityItem() == itemstack)
	{
	event.player.addStat(Achievements.achievementJenStar, 1);
	}
	
}

}