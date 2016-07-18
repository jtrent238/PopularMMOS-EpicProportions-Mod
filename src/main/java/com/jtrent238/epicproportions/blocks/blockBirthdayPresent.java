package com.jtrent238.epicproportions.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

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
        return drops;
    }

}

//event.entityPlayer.addChatComponentMessage(new ChatComponentText("§b§lHappy Birthday" + event.entityPlayer.getDisplayName() + "§b§l!"));
