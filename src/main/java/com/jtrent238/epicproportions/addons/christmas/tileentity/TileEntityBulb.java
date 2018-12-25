package com.jtrent238.epicproportions.addons.christmas.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityBulb extends TileEntity {

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
}