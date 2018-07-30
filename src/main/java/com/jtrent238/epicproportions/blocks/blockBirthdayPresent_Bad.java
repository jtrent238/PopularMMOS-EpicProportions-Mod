package com.jtrent238.epicproportions.blocks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.CustomPresentDrops;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;
import com.jtrent238.epicproportions.Stats;
import com.jtrent238.epicproportions.entity.EntityClown;

import akka.actor.FSM.Event;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.player.AchievementEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class blockBirthdayPresent_Bad extends Block{

	@SideOnly(Side.CLIENT)
    private IIcon field_150116_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150115_b;
	
	private int meta;
	private int least_quantity;
	private int most_quantity;
	private boolean Halloweenloaded;
	private boolean isTConstructModLoaded;
	
	
	Random rand = new Random();

	int  n = rand.nextInt(1) + 0;
	//50 is the maximum and the 1 is our minimum
	
	String droptype;
	int drop = n;
	private int min = 0;
	private int max = 2;
	// nextInt is normally exclusive of the top value,
	// so add 1 to make it inclusive
	int randomNum = ThreadLocalRandom.current().nextInt(min , max  + 1);
	
	 
	
	
	public blockBirthdayPresent_Bad(Material ground) {
		super(ground);
		this.getEnableStats();
		//this.presentOpened();
		
		}
	
	public boolean enableStats(){
		
		return true;
	}
	
	
	
    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_)
    {
        p_149636_2_.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
        p_149636_2_.addStat(Stats.presentsbroken, 1);
        p_149636_2_.triggerAchievement(Achievements.achievementpresent);
        p_149636_2_.addExperience(15);
        p_149636_2_.addExhaustion(0.025F);
        
		int casemax = 3;
		int casemin = 0;
        Random random = new Random();
        int randomCase = rand.nextInt((casemax - casemin) + 1) + casemin;
        
        int i;
		int j;
		int k;
		int goodlucktrap_posX = (int) p_149636_2_.posX - 6;
		int goodlucktrap_posY = (int) p_149636_2_.posY - 1;
		int goodlucktrap_posZ = (int) p_149636_2_.posZ - 5;
		
		switch(randomCase) {
        case 0:  
        	droptype = "Explode";
        
			double p_72876_2_ = 1;
			double p_72876_4_ = 1;
			double p_72876_6_ = 1;
			float p_72876_8_ = 5;
			boolean p_72876_9_ = false;
		
        	p_149636_1_.createExplosion(p_149636_2_, p_72876_2_, p_72876_4_, p_72876_6_, p_72876_8_, p_72876_9_);
                 
        	if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
        		 
        		System.out.println("Case 0");
        	}
        	break;
        	
        case 1:  
        	droptype = "Lava";
        	
        	p_149636_2_.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "Lava was randomly place around you!"));
        	
        	Block p_147449_4_ = Blocks.flowing_lava;
    		int lavatrap_posX = (int) p_149636_2_.posX;
    		int lavatrap_posY = (int) p_149636_2_.posY;
    		int lavatrap_posZ = (int) p_149636_2_.posZ;
            
            for (int LavaLoop = 0; LavaLoop < 100; LavaLoop++) {
        		int lavamax = 25;
        		int lavamin = -25;
                int randomLava = rand.nextInt((lavamax - lavamin) + 1) + lavamin;
            	p_149636_1_.setBlock(lavatrap_posX + randomLava, lavatrap_posY + randomLava, lavatrap_posZ + randomLava, p_147449_4_);
            	p_149636_1_.setBlock(lavatrap_posX - randomLava, lavatrap_posY - randomLava, lavatrap_posZ - randomLava, p_147449_4_);
            	p_149636_1_.setBlock(lavatrap_posX * randomLava, lavatrap_posY * randomLava, lavatrap_posZ * randomLava, p_147449_4_);
            	p_149636_1_.setBlock(lavatrap_posX / randomLava, lavatrap_posY / randomLava, lavatrap_posZ / randomLava, p_147449_4_);
                
            }
    		
    		
        	if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
       		 
        		System.out.println("Case 1");
        	}
    		break;
    		
        case 2:	 
        	droptype = "Fire";
            
    		p_149636_2_.setFire(16);
        	
    		if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
          		 
        		System.out.println("Case 2");
        	}
    		break;
        case 3: 
        	droptype = "GoodLuckTrap";
    		
        	p_149636_2_.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "HA! Lets see you get out of this one!"));
        	
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 0, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.double_stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 1, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.stone_slab, 6, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 2, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 3, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 4, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 5, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 6, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 7, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.air, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 8, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 0, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 1, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.lava, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.lava, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 2, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 3, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 4, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 5, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 6, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.lava, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.lava, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 7, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.nether_brick, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.lava, 8, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 8, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 0, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 1, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 2, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 3, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 4, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 5, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 6, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 7, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 8, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
    		p_149636_1_.setBlock(goodlucktrap_posX + 9, goodlucktrap_posY + 9, goodlucktrap_posZ + 9, Blocks.bedrock, 0, 3);
        	
        	if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
          		 
        		System.out.println("Case 3");
        	}
        	
    		break;

        case 4:
        	droptype = "Mob_Clown";
        	
        	p_149636_2_.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "Hope your not scared of Clowns!"));
        	
        	EntityClown Mob_Clown = new EntityClown(p_149636_1_);
            p_149636_1_.spawnEntityInWorld(Mob_Clown);
            
            for (int MobSpawnLoop = 0; MobSpawnLoop < 25; MobSpawnLoop++) {
        		int MobSpawnMax = 5;
        		int MobSpawnMin = -5;
                int RandomMobSpawn = rand.nextInt((MobSpawnMax - MobSpawnMin) + 1) + MobSpawnMin;
                Mob_Clown.setPosition(p_149636_2_.posX + RandomMobSpawn, p_149636_2_.posY + RandomMobSpawn,p_149636_2_.posZ + RandomMobSpawn); //These are the coordinates where he will appear 
                
            }
            
        	if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
         		 
        		System.out.println("Case 4");
        	}
    	break;
    		 
    default: 
    	droptype = "Invalid Drop";
             break;
             
        }
    }
	   
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	  {
	    return new ItemStack(ItemLoader.itemBirthdayPresent_Bad);
	  }
	
	 /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 0 ? this.field_150115_b : (p_149691_1_ == 1 ? this.field_150116_a : this.blockIcon);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_150116_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_150115_b = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
    }
    


{
      //Creative Drops
        if (EpicProportionsMod.BIRTHDAYPRESENT_CREATIVE == true)
        {
        	System.out.println("Creative Birthday Present Drops Enabled ***This is still Work In Progress!***");
        }
        
    }
    

    
  
public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer p5EP) {
	
	Item item = null;
	if(p5EP.inventory.currentItem == item.getIdFromItem(ItemLoader.ItemBirthdayPresentTester)){

		p5EP.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + StatCollector.translateToLocal("This Present is NOT safe")));
    	
	}
}  
    
    
    
}
    



//event.entityPlayer.addChatComponentMessage(new ChatComponentText("§b§lHappy Birthday" + event.entityPlayer.getDisplayName() + "§b§l!"));
