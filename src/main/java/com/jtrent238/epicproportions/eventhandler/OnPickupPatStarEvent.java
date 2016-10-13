package com.jtrent238.epicproportions.eventhandler;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import net.minecraft.item.ItemStack;

public class OnPickupPatStarEvent {

	private Result ALLOW;
	private ItemStack itemstack = new ItemStack(ItemLoader.itemPatStar);
	
	@SubscribeEvent
    public void PickupPatStar(PlayerEvent.ItemPickupEvent event) {
		
		event.setResult(ALLOW);
		
    	//event.player.triggerAchievement(Achievements.achievementPatStar);
    	
    
	
	if (event.pickedUp.getEntityItem() == itemstack)
	{
	event.player.addStat(Achievements.achievementPatStar, 1);
	event.setResult(ALLOW);
	}
	
}

}