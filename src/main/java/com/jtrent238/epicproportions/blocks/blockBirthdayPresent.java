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
import com.jtrent238.epicproportions.VersionChecker;

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

public class blockBirthdayPresent extends Block{

	@SideOnly(Side.CLIENT)
    private IIcon field_150116_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150115_b;
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	private boolean Halloweenloaded;
	private boolean isTConstructModLoaded;
	private String get_drops_as_string;
	

    
	public blockBirthdayPresent(Material ground) {
		super(ground);
		//this.getEnableStats();
		//this.presentOpened();
		}
	
	public boolean enableStats(){
		
		return true;
	}
	
	/**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    /*public void harvestBlock(World p_149636_1_, EntityPlayer p_149636_2_, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_)
    {
        p_149636_2_.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
        p_149636_2_.addStat(Stats.presentsbroken, 1);
        p_149636_2_.triggerAchievement(Achievements.achievementpresent);
        p_149636_2_.addExperience(15);
        p_149636_2_.addExhaustion(0.025F);
        //this.dropBlockAsItem(p_149636_1_, p_149636_3_, p_149636_4_, p_149636_5_, new ItemStack(this.drop));
        
        if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
        	System.out.println("Birthday Present opened!");
        	System.out.println("Drops: " + this.drop);
        }
    }*/
	
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	  {
	    return new ItemStack(ItemLoader.itemBirthdayPresent);
	  }
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return this.drop; //ItemLoader.itemBirthdayPresent;
    }
	
	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
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
    
    public void PresentDrops( Item drop, int meta, int least_quantity, int most_quantity){
    	this.drop = drop;
        this.meta = meta;
        this.least_quantity = least_quantity;
        this.most_quantity = most_quantity;
    }
    
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(Items.gold_nugget, world.rand.nextInt(4) + 1));
        drops.add(new ItemStack(Items.coal, world.rand.nextInt(3) + 1));
        drops.add(new ItemStack(Items.iron_ingot, world.rand.nextInt(2) + 1));
        drops.add(new ItemStack(Items.gold_ingot, world.rand.nextInt(2) + 1));
        drops.add(new ItemStack(Items.dye, world.rand.nextInt(3) + 2, 4));
        drops.add(new ItemStack(Items.redstone, world.rand.nextInt(2) + 2));
        drops.add(new ItemStack(ItemLoader.itemPatIngot, world.rand.nextInt(1) + 1));
        drops.add(new ItemStack(ItemLoader.itemJenIngot, world.rand.nextInt(1) + 1));
        if (world.rand.nextFloat() < 0.5F)
            drops.add(new ItemStack(Items.diamond));
        if (world.rand.nextFloat() < 0.3F)
            drops.add(new ItemStack(Items.golden_apple));
        
        
        Halloweenloaded = Loader.isModLoaded("epicproportionsmod_halloween");
    	
    	if (Halloweenloaded){

    		drops.add(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemSpookyIngot, world.rand.nextInt(1) + 1));
    		drops.add(new ItemStack(com.jtrent238.epicproportions.addons.halloween.ItemLoader.itemSpookyEssence, world.rand.nextInt(1) + 1));
            
    	}
        
        	//Custom Drops
        if (Configuration.allowedProperties.equals(EpicProportionsMod.BIRTHDAYPRESENT_CUSTOM_DROPS) == true)
        {
        	System.out.println("Custom Birthday Present Drops Enabled ***This is still Work In Progress!***");
        	/*
        drops.add(new ItemStack(CustomPresentDrops.Common, world.rand.nextInt(CustomPresentDrops.DropChance_Common) + CustomPresentDrops.Amount_Common));
        if (world.rand.nextFloat() < CustomPresentDrops.DropChance_Rare)
            drops.add(new ItemStack(CustomPresentDrops.Rare));
            */
        	
        }
      //Creative Drops
        if (EpicProportionsMod.BIRTHDAYPRESENT_CREATIVE == true)
        {
        	System.out.println("Creative Birthday Present Drops Enabled ***This is still Work In Progress!***");
        }
        
        get_drops_as_string = drops.toString();
        
        return drops;
    }
    

    
    @SideOnly(Side.CLIENT)
    public void presentOpened(){
    	EntityClientPlayerMP event1 = Minecraft.getMinecraft().thePlayer;
    		/*
    	if(true){
    	if(entity instanceof EntityPlayer)((EntityPlayer)entity).addStat(Achievements.achievementpresent, l);
    	}
    		 */
    	//event1.addStat(Stats.presentsbroken, 1);
    	//event1.triggerAchievement(Achievements.achievementpresent);
    	//event1.addChatComponentMessage(new ChatComponentText("§b§lHappy Birthday" + event1.getDisplayName() + "§b§l!"));

 }
    
    
    
    protected void readArrays(String parName)
    {
        BufferedReader readIn = null;
    	try 
        {
            System.out.println("Reading file = "+parName+".txt");
            readIn = new BufferedReader(new InputStreamReader(getClass().getClassLoader()
                .getResourceAsStream("assets/epicproportionsmod/birthday_presents/items"+parName+".txt"), "UTF-8"));
            Integer name = Integer.valueOf(readIn.readLine());
            Integer item = Integer.valueOf(readIn.readLine());
            Integer amount = Integer.valueOf(readIn.readLine());
            Integer chance = Integer.valueOf(readIn.readLine());
            String[][][] blockNameArray = new String[item][amount][chance];
            int[][][] blockMetaArray = new int[item][amount][chance];
            System.out.println("Custom Present Drops = "+name+" "+item+", "+amount+", "+chance);
            for (int indY = 0; indY < amount; indY++) // Y first to organize in vertical layers
            {
                for (int indX = 0; item < item; item++)
                {
                    for (int indZ = 0; indZ < chance; indZ++)
                    {
                        blockNameArray[indX][indY][indZ] = readIn.readLine();
                        blockMetaArray[indX][indY][indZ] = Integer.valueOf(readIn.readLine());
                    }
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            // replace this with better exception handling

            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            // replace this with better exception handling


            e.printStackTrace();
        }
        // remember to close the stream to avoid memory leaks     


        try 
        {
            readIn.close();
        } 
        catch (IOException e)
        {
           // replace this with better exception handling


            e.printStackTrace();
        }
    }
    
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer p5EP) {
    	
		Item item = null;
		if(p5EP.inventory.currentItem == item.getIdFromItem(ItemLoader.ItemBirthdayPresentTester)){

			p5EP.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + StatCollector.translateToLocal("This Present is safe")));
	    	
    	}
    }
}
    



//event.entityPlayer.addChatComponentMessage(new ChatComponentText("§b§lHappy Birthday" + event.entityPlayer.getDisplayName() + "§b§l!"));
