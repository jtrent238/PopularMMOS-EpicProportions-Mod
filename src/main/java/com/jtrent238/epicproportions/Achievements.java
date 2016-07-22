
package com.jtrent238.epicproportions;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import com.jtrent238.epicproportions.blocks.blockModFlower;
import com.jtrent238.epicproportions.eventhandler.FlowerForJenPickupEvent;
import com.jtrent238.epicproportions.eventhandler.InstallEvent;
import com.jtrent238.epicproportions.eventhandler.PresentOnMineEvent;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


	public class Achievements {
    
	public static Achievement achievementinstall;
    public static Achievement achievementpresent;
    public static Achievement achievementflowerforjen;
    public static Achievement achievementpat;
    public static Achievement achievementjen;
    public static Achievement achievementpopped;
    
    

    
  
    
   
    
    public static void loadAchievements()
    {
    	achievementinstall = new Achievement("achievement.install", "install", 0, 0, new ItemStack(Items.golden_apple, 1), (Achievement)null).initIndependentStat().registerStat();
    	achievementpresent = new Achievement("achievement.happybirthday", "happybirthday", 0, 1, new ItemStack(ItemLoader.itemBirthdayPresent), (Achievement)null).initIndependentStat().registerStat();
    	achievementflowerforjen = new Achievement("achievement.flowerforjen", "flowerforjen", 0, 2, new ItemStack(BlockLoader.blockFlowerForJen), (Achievement)null).initIndependentStat().registerStat();
    	achievementpat = new Achievement("achievement.iampat", "iampat", 0, 3, new ItemStack(ItemLoader.itemPatHelmet), (Achievement)null).initIndependentStat().registerStat();
    	achievementjen = new Achievement("achievement.iamjen", "iamjen", 0, 4, new ItemStack(ItemLoader.itemJenHelmet), (Achievement)null).initIndependentStat().registerStat();
    	achievementpopped = new Achievement("achievement.popped", "popped", 0, 5, new ItemStack(Items.sugar), (Achievement)null).initIndependentStat().registerStat();
    	
    	AchievementPage.registerAchievementPage(new AchievementPage(EpicProportionsMod.MODID + EpicProportionsMod.MODVERSION + "Achievements", new Achievement[]{achievementinstall, achievementpresent, achievementflowerforjen, achievementpat, achievementjen, achievementpopped}));
    	
    	
    	FMLCommonHandler.instance().bus().register(new InstallEvent());
    	FMLCommonHandler.instance().bus().register(new PresentOnMineEvent());
    	FMLCommonHandler.instance().bus().register(new FlowerForJenPickupEvent());
    	
    
    	
    	
    	
    	
    }
    
    
}
