package com.jtrent238.epicproportions.render;

import com.jtrent238.epicproportions.entity.EntitySparky;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RenderSparky extends RenderLiving
{

	public RenderSparky(ModelWolf p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
	}
 /*
    private static ResourceLocation sparkyloc;
	private static final ResourceLocation resourcesparky = sparkyloc;

	public RenderSparky(ModelBase modelbase, float f)
    {
        super(modelbase, f);
    }
 
    public void func_177_a(EntitySparky entity, double d, double d1, double d2,
            float f, float f1)
    {
        super.doRender(entity, d, d1, d2, f, f1);
    }
 
    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2,
            float f, float f1)
    {
        func_177_a((EntitySparky)entityliving, d, d1, d2, f, f1);
    }
 
    public void doRender(Entity entity, double d, double d1, double d2,
            float f, float f1)
    {
        func_177_a((EntitySparky)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return resourcesparky;
		*/

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return null;
	}
	}




    


 
 

 
