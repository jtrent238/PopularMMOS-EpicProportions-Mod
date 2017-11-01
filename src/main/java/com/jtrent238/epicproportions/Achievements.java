
package com.jtrent238.epicproportions;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import com.jtrent238.epicproportions.blocks.blockModFlower;
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
    
	private static final String modid = EpicProportionsMod.MODID;
	public static Achievement achievementinstall;
    public static Achievement achievementpresent;
    public static Achievement achievementflowerforjen;
    public static Achievement achievementpat;
    public static Achievement achievementjen;
    public static Achievement achievementpopped;
    public static Achievement achievementcookies;
    public static Achievement achievementkillpat;
    public static Achievement achievementkilljen;
    public static Achievement achievementfunny;
    public static Achievement achievementPatStar;
    public static Achievement achievementJenStar;
    public static Achievement achievementPatArmor;
    public static Achievement achievementPatArmor_Super;
    public static Achievement achievementJenArmor;
    public static Achievement achievementJenArmor_Super;
    public static Achievement achievementSwordOfEpicProportions;
    public static Achievement achievementPickaxeOfEpicProportions;
    public static Achievement achievementAxeOfEpicProportions;
    public static Achievement achievementShovelOfEpicProportions;
    public static Achievement achievementHoeOfEpicProportions;
    public static Achievement achievementNinjaStar;


    
  
    
   
    
    public static void loadAchievements()
    {
    	achievementinstall = new Achievement("achievement." + modid + ".install", "install", 0, 0, new ItemStack(ItemLoader.itemgemofepicproportions, 1), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementpresent = new Achievement("achievement." + modid + ".happybirthday", "happybirthday", 0, 1, new ItemStack(ItemLoader.itemBirthdayPresent), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementflowerforjen = new Achievement("achievement." + modid + "flowerforjen", "flowerforjen", 0, 2, new ItemStack(BlockLoader.blockFlowerForJen), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementpat = new Achievement("achievement." + modid + ".iampat", "iampat", 0, 3, new ItemStack(ItemLoader.itempat), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementjen = new Achievement("achievement." + modid + ".iamjen", "iamjen", 0, 4, new ItemStack(ItemLoader.itemjen), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementpopped = new Achievement("achievement." + modid + ".popped", "popped", 0, 5, new ItemStack(Items.sugar), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementcookies = new Achievement("achievement." + modid + ".cookies", "cookies", 0, 6, new ItemStack(Items.cookie), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementkillpat = new Achievement("achievement." + modid + ".killpat", "killpat", 0, 7, new ItemStack(ItemLoader.itemJenSword), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementkilljen = new Achievement("achievement." + modid + ".killjen", "killjen", 0, 8, new ItemStack(ItemLoader.itemPatSword), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementfunny = new Achievement("achievement." + modid + ".funny", "funny", 0, 9, new ItemStack(ItemLoader.itemSpawnClown), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementPatStar = new Achievement("achievement." + modid + ".patstar", "patstar", 1, 0, new ItemStack(ItemLoader.itemPatStar), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementJenStar = new Achievement("achievement." + modid + ".jenstar", "jenstar", 1, 1, new ItemStack(ItemLoader.itemJenStar), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementPatArmor = new Achievement("achievement." + modid + ".patarmor", "patarmor", 1, 2, new ItemStack(ItemLoader.itemPatChestplate), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementPatArmor_Super = new Achievement("achievement." + modid + ".patarmor_super", "patarmor_super", 1, 3, new ItemStack(ItemLoader.itemSuperPatChestplate), (Achievement)achievementPatArmor).initIndependentStat().registerStat();
    	achievementJenArmor = new Achievement("achievement." + modid + ".jenarmor", "jenarmor", 1, 4, new ItemStack(ItemLoader.itemJenChestplate), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementJenArmor_Super = new Achievement("achievement." + modid + ".jenarmor_super", "jenarmor_super", 1, 5, new ItemStack(ItemLoader.itemSuperJenChestplate), (Achievement)achievementJenArmor).initIndependentStat().registerStat();
    	achievementSwordOfEpicProportions = new Achievement("achievement." + modid + ".swordofepicproportions", "swordofepicproportions", 1, 6, new ItemStack(ItemLoader.itemSwordOfEpicProportions), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementPickaxeOfEpicProportions = new Achievement("achievement." + modid + ".pickaxeofepicproportions", "pickaxeofepicproportions", 1, 7, new ItemStack(ItemLoader.itemPickOfEpicProportions), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementAxeOfEpicProportions = new Achievement("achievement." + modid + ".axeofepicproportions", "axeofepicproportions", 1, 8, new ItemStack(ItemLoader.itemAxeOfEpicProportions), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementShovelOfEpicProportions = new Achievement("achievement." + modid + ".shovelofepicproportions", "shovelofepicproportions", 1, 9, new ItemStack(ItemLoader.itemShovelOfEpicProportions), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementHoeOfEpicProportions = new Achievement("achievement." + modid + ".hoeofepicproportions", "hoeofepicproportions", 2, 0, new ItemStack(ItemLoader.itemHoeOfEpicProportions), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	achievementNinjaStar = new Achievement("achievement." + modid + ".achievementNinjaStar", "achievementNinjaStar", 2, 1, new ItemStack(ItemLoader.ItemNinjaStar), (Achievement)achievementinstall).initIndependentStat().registerStat();
    	
    	
    	AchievementPage.registerAchievementPage(new AchievementPage(EpicProportionsMod.MODID + EpicProportionsMod.MODVERSION + "Achievements", new Achievement[]{
    			achievementinstall, 
    			achievementpresent, 
    			achievementflowerforjen, 
    			achievementpat, 
    			achievementjen, 
    			achievementpopped, 
    			achievementcookies, 
    			achievementkillpat, 
    			achievementkilljen, 
    			achievementfunny,
    			achievementJenStar,
    			achievementPatStar,
    			achievementPatArmor,
    			achievementPatArmor_Super,
    			achievementJenArmor,
    			achievementJenArmor_Super,
    			achievementSwordOfEpicProportions,
    			achievementPickaxeOfEpicProportions,
    			achievementAxeOfEpicProportions,
    			achievementShovelOfEpicProportions,
    			achievementHoeOfEpicProportions,
    			achievementNinjaStar
    			}));

    }
    
    
}
