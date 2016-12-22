package com.jtrent238.epicproportions.addons.christmas.blocks;


import com.jtrent238.epicproportions.addons.christmas.ItemLoader;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockChristmasTree;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockChristmasTree  extends BlockContainer{

	public BlockChristmasTree(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.textureName = ("epicproportionsmod_christmas:ChristmasTree");
	}

	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBlockChristmasTree();
	}

	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	  {
	    return new ItemStack(ItemLoader.ItemChristmasTree);
	  }
	
	
}
