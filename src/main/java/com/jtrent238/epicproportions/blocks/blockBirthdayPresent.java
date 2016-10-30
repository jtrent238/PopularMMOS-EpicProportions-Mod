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
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;
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
	

    
	public blockBirthdayPresent(Material ground) {
		super(ground);
		this.getEnableStats();
		
		}
	
	public boolean enableStats(){
		
		return true;
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
    
  
  
    public static final Item CopperIngot = GameRegistry.findItem("TConstruct", "CopperIngot");
    public static final ItemStack CopperIngotItemStack = new ItemStack(CopperIngot);
    public static final Item TinIngot = GameRegistry.findItem("TConstruct", "TinIngot");
    public static final ItemStack TinIngotItemStack = new ItemStack(TinIngot);

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
        
        
        if (EpicProportionsMod.isTConstructModLoaded) {
        	
        	GameRegistry.findItem("TConstruct", "CopperIngot");
            GameRegistry.findItem("TConstruct", "TinIngot");

        	drops.add(new ItemStack(GameRegistry.findItem("TConstruct", "CopperIngot"), world.rand.nextInt(1) + 1));
            drops.add(new ItemStack(GameRegistry.findItem("TConstruct", "TinIngot"), world.rand.nextInt(1) + 1));
            
            drops.add(new ItemStack(CopperIngot, world.rand.nextInt(1) + 1));
            drops.add(new ItemStack(TinIngot, world.rand.nextInt(1) + 1));
    		
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
        if (Configuration.allowedProperties.equals(EpicProportionsMod.BIRTHDAYPRESENT_CREATIVE) == true)
        {
        	System.out.println("Creative Birthday Present Drops Enabled ***This is still Work In Progress!***");
        }
        
        
        return drops;
    }
    

    
    @SideOnly(Side.CLIENT)
    public void presentOpened(BlockEvent.BreakEvent event){
    	EntityPlayer event1 = Minecraft.getMinecraft().thePlayer;
    		/*
    	if(true){
    	if(entity instanceof EntityPlayer)((EntityPlayer)entity).addStat(Achievements.achievementpresent, l);
    	}
    		 */
    	event1.addStat(Stats.presentsbroken, 1);
    	event1.triggerAchievement(Achievements.achievementpresent);
    	event1.addChatComponentMessage(new ChatComponentText("§b§lHappy Birthday" + event1.getDisplayName() + "§b§l!"));

 }
    
    
    
    protected void readArrays(String parName)
    {
        BufferedReader readIn = null;
    	try 
        {
            System.out.println("Reading file = "+parName+".txt");
            readIn = new BufferedReader(new InputStreamReader(getClass().getClassLoader()
                .getResourceAsStream("assets/epicproportionsmod/birthday_presents"+parName+".txt"), "UTF-8"));
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
    
    
}
    



//event.entityPlayer.addChatComponentMessage(new ChatComponentText("§b§lHappy Birthday" + event.entityPlayer.getDisplayName() + "§b§l!"));
