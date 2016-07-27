package com.jtrent238.epicproportions.render;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.entity.EntityBomby;
import com.jtrent238.epicproportions.model.ModelBomby;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class RenderBomby
extends RenderLiving /*/extends RenderLiving/*/
{
    private static final ResourceLocation armoredBombyTextures = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
    private static final ResourceLocation BombyTextures = new ResourceLocation("textures/entity/creeper/creeper.png");
    /** The creeper model. */
    private ModelBase bombyModel = new ModelBomby(2.0F);
    private static final String __OBFID = "CL_00000985";

    public RenderBomby()
    {
        super(new ModelBomby(), 0.5F);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityBomby p_77041_1_, float p_77041_2_)
    {
        float f1 = p_77041_1_.getBombyFlashIntensity(p_77041_2_);
        float f2 = 1.0F + MathHelper.sin(f1 * 100.0F) * f1 * 0.01F;

        if (f1 < 0.0F)
        {
            f1 = 0.0F;
        }

        if (f1 > 1.0F)
        {
            f1 = 1.0F;
        }

        f1 *= f1;
        f1 *= f1;
        float f3 = (1.0F + f1 * 0.4F) * f2;
        float f4 = (1.0F + f1 * 0.1F) / f2;
        GL11.glScalef(f3, f4, f3);
    }

    /**
     * Returns an ARGB int color back. Args: entityLiving, lightBrightness, partialTickTime
     */
    protected int getColorMultiplier(EntityBomby p_77030_1_, float p_77030_2_, float p_77030_3_)
    {
        float f2 = p_77030_1_.getBombyFlashIntensity(p_77030_3_);

        if ((int)(f2 * 10.0F) % 2 == 0)
        {
            return 0;
        }
        else
        {
            int i = (int)(f2 * 0.2F * 255.0F);

            if (i < 0)
            {
                i = 0;
            }

            if (i > 255)
            {
                i = 255;
            }

            short short1 = 255;
            short short2 = 255;
            short short3 = 255;
            return i << 24 | short1 << 16 | short2 << 8 | short3;
        }
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityBomby p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        if (p_77032_1_.getPowered())
        {
            if (p_77032_1_.isInvisible())
            {
                GL11.glDepthMask(false);
            }
            else
            {
                GL11.glDepthMask(true);
            }

            if (p_77032_2_ == 1)
            {
                float f1 = (float)p_77032_1_.ticksExisted + p_77032_3_;
                this.bindTexture(armoredBombyTextures);
                GL11.glMatrixMode(GL11.GL_TEXTURE);
                GL11.glLoadIdentity();
                float f2 = f1 * 0.01F;
                float f3 = f1 * 0.01F;
                GL11.glTranslatef(f2, f3, 0.0F);
                this.setRenderPassModel(this.bombyModel);
                GL11.glMatrixMode(GL11.GL_MODELVIEW);
                GL11.glEnable(GL11.GL_BLEND);
                float f4 = 0.5F;
                GL11.glColor4f(f4, f4, f4, 1.0F);
                GL11.glDisable(GL11.GL_LIGHTING);
                GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
                return 1;
            }

            if (p_77032_2_ == 2)
            {
                GL11.glMatrixMode(GL11.GL_TEXTURE);
                GL11.glLoadIdentity();
                GL11.glMatrixMode(GL11.GL_MODELVIEW);
                GL11.glEnable(GL11.GL_LIGHTING);
                GL11.glDisable(GL11.GL_BLEND);
            }
        }

        return -1;
    }

    protected int inheritRenderPass(EntityBomby p_77035_1_, int p_77035_2_, float p_77035_3_)
    {
        return -1;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityBomby p_110775_1_)
    {
        return BombyTextures;
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
        this.preRenderCallback((EntityBomby)p_77041_1_, p_77041_2_);
    }

    /**
     * Returns an ARGB int color back. Args: entityLiving, lightBrightness, partialTickTime
     */
    protected int getColorMultiplier(EntityLivingBase p_77030_1_, float p_77030_2_, float p_77030_3_)
    {
        return this.getColorMultiplier((EntityBomby)p_77030_1_, p_77030_2_, p_77030_3_);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityBomby)p_77032_1_, p_77032_2_, p_77032_3_);
    }

    protected int inheritRenderPass(EntityLivingBase p_77035_1_, int p_77035_2_, float p_77035_3_)
    {
        return this.inheritRenderPass((EntityBomby)p_77035_1_, p_77035_2_, p_77035_3_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityBomby)p_110775_1_);
    }

{

	//private static final ResourceLocation Texture = new ResourceLocation("epicproportionsmod:EntityBomby.png");
/*
public RenderBomby(ModelBomby p_i1269_1_, float p_i1269_3_)
{
  super(p_i1269_1_, p_i1269_3_);
}

@Override
protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
	return null;
}
*/
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

/*
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
*/
}
}
