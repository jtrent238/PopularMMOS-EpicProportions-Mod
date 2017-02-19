package com.jtrent238.epicproportions.blocks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.CustomPresentDrops;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;
import com.jtrent238.epicproportions.Stats;

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
	
	 
	
	
	public blockBirthdayPresent_Bad(Material ground) {
		super(ground);
		this.getEnableStats();
		//this.presentOpened();
		
		}
	
	public boolean enableStats(){
		
		return true;
	}
	/*
	public void breakBlock(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	  {
	    ((EntityPlayer)par5EntityLivingBase).triggerAchievement(Achievements.achievementpresent);
	    ((EntityPlayer)par5EntityLivingBase).addStat(Stats.presentsbroken, 1);
	  }
	*/
	
	   /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void breakBlock(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_)
    {
        p_149636_2_.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
        p_149636_2_.addStat(Stats.presentsbroken, 1);
        p_149636_2_.triggerAchievement(Achievements.achievementpresent);
        p_149636_2_.addExperience(15);
        p_149636_2_.addExhaustion(0.025F);
        
        switch (drop) {
        case 0:  droptype = "Explode";
                 break;
        case 1:  droptype = "Lava";
                 break;
        default: droptype = "Invalid Drop";
                 break;
	}
		
		};

		public void drop(World p_149636_1_, EntityPlayer p_149636_2_){
			
			if(drop == 0){
				
				double p_72876_2_ = 0;
				double p_72876_4_ = 0;
				double p_72876_6_ = 0;
				float p_72876_8_ = 0;
				boolean p_72876_9_ = false;
				
				p_149636_1_.createExplosion(p_149636_2_, p_72876_2_, p_72876_4_, p_72876_6_, p_72876_8_, p_72876_9_);
				
			}
			

			if(drop == 1){
				
				int max = 25;
				int min = 4;
				
				int p_147449_1_ = (int) p_149636_2_.posX + rand.nextInt((max - min) + 1) + min;
				int p_147449_2_ = (int) p_149636_2_.posY;
				int p_147449_3_ = (int) p_149636_2_.posZ;
				Block p_147449_4_ = Blocks.flowing_lava;
				
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);
				p_149636_1_.setBlock(p_147449_1_, p_147449_2_, p_147449_3_, p_147449_4_);

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
