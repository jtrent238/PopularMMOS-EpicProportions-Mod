package com.jtrent238.epicproportions.addons.christmas.render;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.addons.christmas.model.ModelChristmasPresents;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockChristmasPresents_Red;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderBlockChristmasPresents_Red extends TileEntitySpecialRenderer {

	
	ResourceLocation texture = new ResourceLocation("epicproportionsmod_christmas:ChristmasPresents_Red");
	
	private ModelChristmasPresents model;

	private TileEntity TileEntityBlockChristmasPresents_Red;
	
	public RenderBlockChristmasPresents_Red(double x, double y, double z, float p_147500_8_, Class p_145826_0_, String p_145826_1_) {
		this.model = new ModelChristmasPresents();
	}
	
	
	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float p_147500_8_) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		this.bindTexture(texture);
		this.model.textureHeight = 64;
		this.model.textureWidth = 32;
		
			GL11.glPushMatrix();
				this.model.renderModel(null, 0.0625F, 0.0625F, 0.0625F, 0.0625F, 0.0625F, 0.0625F);
			GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

	
	
}
