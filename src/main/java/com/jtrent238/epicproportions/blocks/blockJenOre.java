package com.jtrent238.epicproportions.blocks;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class blockJenOre extends BlockOre{

	public blockJenOre(Material ground) {
		super();
	}
	@Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        return 5;
    }
}
