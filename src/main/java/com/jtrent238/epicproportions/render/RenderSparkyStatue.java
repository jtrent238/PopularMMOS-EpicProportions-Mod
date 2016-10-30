package com.jtrent238.epicproportions.render;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.model.ModelSparkyStatue;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderSparkyStatue extends TileEntitySpecialRenderer {

	
	ResourceLocation texture = new ResourceLocation("epicproportionsmod:EntitySparky");
	
	private ModelSparkyStatue model;
	
	public RenderSparkyStatue() {
		this.model = new ModelSparkyStatue();
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
