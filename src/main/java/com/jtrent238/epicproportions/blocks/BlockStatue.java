package com.jtrent238.epicproportions.blocks;

import com.jtrent238.epicproportions.tileentity.TileEntityPatStatue;
import com.jtrent238.epicproportions.tileentity.TileEntityStatue;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockStatue extends Block{

	public BlockStatue(Material p_i45394_1_) {
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
	

}
