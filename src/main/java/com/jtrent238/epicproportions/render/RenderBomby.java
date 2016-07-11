package com.jtrent238.epicproportions.render;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.entity.EntityBomby;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderBomby
extends RenderLiving
{
private static final ResourceLocation Texture = new ResourceLocation("textures/entity/creeper/creeper.png");

public RenderBomby(ModelBase p_i1269_1_, float p_i1269_3_)
{
  super(p_i1269_1_, p_i1269_3_);
}

/*protected void func_77043_a(EntityLivingBase p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_)
{
  double scaler = 0.35D;
  GL11.glScaled(scaler, scaler, scaler);
  super.func_77043_a(p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
}

public void func_76986_a(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
{
  super.func_76986_a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
}
*/
protected ResourceLocation getEntityTexture(EntityBomby p_110775_1_)
{
  return Texture;
}

protected ResourceLocation func_110775_a(Entity p_110775_1_)
{
  return getEntityTexture((EntityBomby)p_110775_1_);
}

@Override
protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
	return Texture;
}
}
