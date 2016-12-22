package com.jtrent238.epicproportions.addons.christmas.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class TileEntityBlockChristmasTree extends TileEntity {
	
	private ItemStack theitem;

	public void writeToNBT(NBTTagCompound p_145841_1_, Class p_145826_0_, String p_145826_1_)
    {
		addMapping(TileEntityBlockChristmasTree.class, "ChristmasTree");
    }

	public int getSize() {
		return 0;
	}

	public ItemStack getItem(int i) {
		return theitem;
	}


}
