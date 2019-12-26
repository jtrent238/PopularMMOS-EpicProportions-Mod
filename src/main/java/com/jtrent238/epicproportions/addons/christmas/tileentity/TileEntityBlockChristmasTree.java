package com.jtrent238.epicproportions.addons.christmas.tileentity;

import com.jtrent238.epicproportions.addons.christmas.ItemLoader;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBlockChristmasTree extends TileEntity {

	/* Rotation */
    public float rotation = 0;
   /* Scale */
   public float scale = (float) 0.5;

   @Override
   public void updateEntity(){
       /* Increments 0.5  This can be changed */
       if (worldObj.isRemote) rotation += 0.5;
       /* Whatever you want your scale to be */
      if (worldObj.isRemote) scale = (float) 0.5;
   }

	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public ItemStack getItem(int i) {
		return new ItemStack(ItemLoader.ItemChristmasTree);
	}
}