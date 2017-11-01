package com.jtrent238.epicproportions.addons.halloween.render;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.addons.halloween.entity.EntityGhost;
import com.jtrent238.epicproportions.addons.halloween.model.ModelGhost;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderGhost extends RenderLiving
{

	public RenderGhost(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		// TODO Auto-generated method stub
		return null;
	}

}