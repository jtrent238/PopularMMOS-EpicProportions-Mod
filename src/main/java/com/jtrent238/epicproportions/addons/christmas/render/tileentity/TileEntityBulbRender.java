package com.jtrent238.epicproportions.addons.christmas.render.tileentity;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.addons.christmas.items.ItemBulb;
import com.jtrent238.epicproportions.addons.christmas.model.ModelChristmasLightBulb;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBulb;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityBulbRender extends TileEntitySpecialRenderer{
	
private final ModelChristmasLightBulb model;
public TileEntityBulbRender() {this.model = new ModelChristmasLightBulb();}
@Override
public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) { 
GL11.glPushMatrix();
GL11.glTranslatef((float)x+0.5F, (float)y+1.0F, (float)z+0.5F);
ResourceLocation textures = (new ResourceLocation("epicproportionsmod_christmas:BlockBulb" + "_" + ItemBulb.field_150923_a));
Minecraft.getMinecraft().renderEngine.bindTexture(textures);
GL11.glPushMatrix();
GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
GL11.glPushMatrix();
GL11.glRotatef(te.getBlockMetadata() * 90, 0.0F, 1.0F, 0.0F);
this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
GL11.glPopMatrix();
GL11.glPopMatrix();
GL11.glPopMatrix();}
}