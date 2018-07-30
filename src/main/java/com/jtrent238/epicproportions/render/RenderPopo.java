package com.jtrent238.epicproportions.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.entity.EntityPopo;

@SideOnly(Side.CLIENT)
public class RenderPopo extends RenderLiving
{
    private static final ResourceLocation sheepTextures = new ResourceLocation("epicproportionsmod:EntityPopo_fur.png");
    private static final ResourceLocation shearedSheepTextures = new ResourceLocation("epicproportionsmod:EntityPopo.png");
    private static final String __OBFID = "CL_00001021";

    public RenderPopo(ModelBase p_i1266_1_, ModelBase p_i1266_2_, float p_i1266_3_)
    {
        super(p_i1266_1_, p_i1266_3_);
        this.setRenderPassModel(p_i1266_2_);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityPopo p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
            return 1;
        }
        
    

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityPopo p_110775_1_)
    {
        return shearedSheepTextures;
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityPopo)p_77032_1_, p_77032_2_, p_77032_3_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityPopo)p_110775_1_);
    }
}