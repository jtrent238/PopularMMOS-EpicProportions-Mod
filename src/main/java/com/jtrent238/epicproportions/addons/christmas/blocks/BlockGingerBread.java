package com.jtrent238.epicproportions.addons.christmas.blocks;

import java.util.List;

import com.jtrent238.epicproportions.addons.christmas.BlockLoader;
import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockGingerBread extends Block{

	public BlockGingerBread(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("BlockGingerBread");
		this.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		this.setHardness(0.3F);
	}
	/*
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 6; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}
	
			
	@Override
	public IIcon getIcon(int side, int meta) {
	    if (meta > 5)
	        meta = 0;
	    this.setBlockTextureName("epicproportionsmod_christmas:BlockGingerBread" + "_" + meta);
	    
		return blockIcon;

	    //return BlockLoader.BlockGingerBread.getIcon(side, meta);
	}
			 
	
	@Override
    public void registerBlockIcons(IIconRegister reg) { }
	
	@Override
	public int damageDropped(int meta) {
	    return meta;
	}
	*/
}
