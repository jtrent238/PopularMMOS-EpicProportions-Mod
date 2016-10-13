package com.jtrent238.epicproportions.render;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.model.ModelJenStatue;
import com.jtrent238.epicproportions.model.ModelPatStatue;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderJenStatue extends TileEntitySpecialRenderer {

	
	ResourceLocation texture = new ResourceLocation("epicproportionsmod:EntityJen");
	
	private ModelJenStatue model;
	
	public RenderJenStatue() {
		this.model = new ModelJenStatue();
	}
	
	
	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float p_147500_8_) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		this.bindTexture(texture);
		
			GL11.glPushMatrix();
				this.model.renderModel(null, 0.0625F, 0.0625F, 0.0625F, 0.0625F, 0.0625F, 0.0625F);
			GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

}
