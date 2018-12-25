package com.jtrent238.epicproportions.addons.christmas.blocks;

import java.util.List;

import com.jtrent238.epicproportions.addons.christmas.ItemLoader;
import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBulb;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class BlockBulb extends BlockContainer
{
	public static final String[][] bulbBlocks = new String[][] {{"BlockBulb_blue"}, {"BlockBulb_cyan"}, {"BlockBulb_green"}, {"BlockBulb_lightBlue"}, {"BlockBulb_lime"}, {"BlockBulb_magenta"}, {"BlockBulb_orange"}, {"BlockBulb_pink"}, {"BlockBulb_purple"}, {"BlockBulb_red"}, {"BlockBulb_white"}, {"BlockBulb_yellow"} };
	   
	public static final String[] field_149859_a = new String[] {};
    public static final String[] field_149858_b = new String[] {};
   
    private World p_149941_1_;
	private int p_149941_2_;
	private int p_149941_3_;
	private int p_149941_4_;
	
	BlockSourceImpl blocksourceimpl = new BlockSourceImpl(p_149941_1_, p_149941_2_, p_149941_3_, p_149941_4_);
    
    @SideOnly(Side.CLIENT)
    private IIcon[] field_149861_N;
    private int field_149862_O;
    private static final String __OBFID = "CL_00000246";

    public BlockBulb(int p_i2173_1_)
    {
        super(Material.plants);
        this.field_149862_O = p_i2173_1_;
        //this.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
        //this.setBlockName(bulbBlocks.toString());
        //this.setBlockTextureName(epicproportionsmod_christmas.MODID + ":" + bulbBlocks);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ >= this.field_149861_N.length)
        {
            p_149691_2_ = 0;
        }

        return this.field_149861_N[p_149691_2_];
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149861_N = new IIcon[bulbBlocks[this.field_149862_O].length];

        for (int i = 0; i < this.field_149861_N.length; ++i)
        {
            this.field_149861_N[i] = p_149651_1_.registerIcon(bulbBlocks[this.field_149862_O][i]);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        for (int i = 0; i < this.field_149861_N.length; ++i)
        {
            p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
        }
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityBulb();
    }
    
/*	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	  {
	    return new ItemStack(ItemLoader.ItemBulb);
	  }*/
}
