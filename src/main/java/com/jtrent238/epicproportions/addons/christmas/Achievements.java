package com.jtrent238.epicproportions.addons.christmas;


import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements {
    
	private static final String modid = epicproportionsmod_christmas.MODID;
	public static Achievement achievementJingleBells;


    
  
    
   
    
    public static void loadAchievements()
    {
    	achievementJingleBells = new Achievement("achievement." + modid + ".JingleBells", "JingleBells", 0, 0, new ItemStack(ItemLoader.ItemJingleBells, 1), (Achievement)achievementJingleBells).initIndependentStat().registerStat();
    	
    	
    	AchievementPage.registerAchievementPage(new AchievementPage(epicproportionsmod_christmas.MODID + epicproportionsmod_christmas.MODVERSION + "Achievements", new Achievement[]{
    			achievementJingleBells
    			}));

    }
    
    
}
