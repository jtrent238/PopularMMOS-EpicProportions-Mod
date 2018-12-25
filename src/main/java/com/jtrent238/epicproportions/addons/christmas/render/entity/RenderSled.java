package com.jtrent238.epicproportions.addons.christmas.render.entity;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;
import com.jtrent238.epicproportions.addons.christmas.entity.EntitySled;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntitySled;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderSled extends TileEntitySpecialRenderer {

	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderSled(){
        texture = new ResourceLocation(epicproportionsmod_christmas.MODID, "models/EntitySledTexture.png");
        objModelLocation = new ResourceLocation(epicproportionsmod_christmas.MODID, "models/EntitySledModel.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
}

	public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
		TileEntitySled te2 = (TileEntitySled) te;
		
		float rotation = te2.rotation + (timeSinceLastTick / 2F);
		float scale = te2.scale / 28F;
		
		bindTexture(texture);

		GL11.glPushMatrix();
		GL11.glTranslated(posX, posY, posZ + 0.25F);
		GL11.glScalef(scale, scale, scale);
		GL11.glPushMatrix();
		//GL11.glRotatef(rotation, 0F, 1F, 0.5F);
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
}


}