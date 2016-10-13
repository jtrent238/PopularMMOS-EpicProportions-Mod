package com.jtrent238.epicproportions.eventhandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import sun.applet.Main;
import sun.rmi.runtime.Log;

import java.util.ArrayList;

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

    			/*
        event.player.addChatComponentMessage(new ChatComponentText("Preparing Items"));

    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemgemofepicproportions.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatIngot.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenIngot.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenslips.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemCaptainCookieCookie.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenStar.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatStar.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemEpicProportionsStar.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatArrow.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenArrow.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemBirthdayPresent.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itempat.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemjen.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemTNTSwordPlacer.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemHouseOfEpicProportionsPlacer.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemBombyStructurePlacer.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJensHoleStructurePlacer_1.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJensHoleStructurePlacer_2.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJensHoleStructurePlacer_3.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJensHoleStructurePlacer_4.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJensHoleStructurePlacer_5.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itempatdoor.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemjendoor.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itempatapple.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemjenapple.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatmeat_raw.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatmeat_cooked.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenmeat_raw.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenmeat_cooked.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.ItemCookedPufferFish.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.ItemModInfo.getUnlocalizedName()));
    	
    	
    	//Weapons & Tools
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatSword.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenSword.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatPick.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenPick.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatAxe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenAxe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatShovel.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenShovel.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatHoe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenHoe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatStaff.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenStaff.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatBow.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenBow.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatMultiTool.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenMultiTool.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatSword.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenSword.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatPick.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenPick.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatAxe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenAxe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatShovel.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenShovel.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatHoe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenHoe.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatMultiTool.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenMultiTool.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSwordOfEpicProportions.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSwordOfEpicProportions_Part1.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSwordOfEpicProportions_Part2.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSwordOfEpicProportions_Part3.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPickOfEpicProportions.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemShovelOfEpicProportions.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemHoeOfEpicProportions.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemAxeOfEpicProportions.getUnlocalizedName()));
    	
    	//SpawnEggs//
    	//event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnEgg.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnBomby.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnCaptianCookie.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnPat.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnJen.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnFred2_0.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnNinjaMaster.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnCandyMan.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnCookieLittle.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnjtrent238.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnClown.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnCandyPopper.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnSparky.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnKitty.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnKami.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnPopo.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnBanana.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnBlockling.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnVillagerOfEpicProportions.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnPatVillager.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSpawnJenVillager.getUnlocalizedName()));
    	
    	//Armor
    		//Pat Armor
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatHelmet.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatChestplate.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatLeggings.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemPatBoots.getUnlocalizedName()));
    		//Jen Armor
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenHelmet.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenChestplate.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenLeggings.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemJenBoots.getUnlocalizedName()));
    	
    		//Pat Armor
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatHelmet.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatChestplate.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatLeggings.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperPatBoots.getUnlocalizedName()));
    		//Jen Armor
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenHelmet.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenChestplate.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenLeggings.getUnlocalizedName()));
    	event.player.addChatComponentMessage(new ChatComponentText("Preparing Items >> " + ItemLoader.itemSuperJenBoots.getUnlocalizedName()));
    	
    	event.player.addChatComponentMessage(new ChatComponentText("Items Prepared"));
    			*/
    	
    }

	public void firstJoin(PlayerLoggedInEvent event) {
	      EntityPlayer player = event.player;
	      NBTTagCompound entityData = player.getEntityData();
	      if(entityData.getBoolean("firstJoin")) {
	         entityData.setBoolean("firstJoin", false);
	         player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.itemBirthdayPresent));
	      }
	   }
	
	public <FreePresentOnJoin> int getchance(){
		
		int randomchance = 50;
		return randomchance;
		
	}
	
	
}