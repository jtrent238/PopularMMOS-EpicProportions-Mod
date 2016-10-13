package com.jtrent238.epicproportions.blocks;

import com.jtrent238.epicproportions.tileentity.TileEntityPatStatue;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPatStatue extends BlockContainer{

	public BlockPatStatue(Material p_i45394_1_) {
		super(p_i45394_1_);
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
		return new TileEntityPatStatue();
	}

}
