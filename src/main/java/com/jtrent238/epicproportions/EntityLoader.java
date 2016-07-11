package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.entity.EntityBomby;
import com.jtrent238.epicproportions.entity.EntityCaptianCookie;
import com.jtrent238.epicproportions.entity.EntityFred2_0;
import com.jtrent238.epicproportions.entity.EntityJen;
import com.jtrent238.epicproportions.entity.EntityNinjaMaster;
import com.jtrent238.epicproportions.entity.EntityPat;
import com.jtrent238.foodmod.EntityCandyPig;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import com.jtrent238.epicproportions.model.ModelFred2_0;
import net.minecraft.util.ResourceLocation;

public class EntityLoader {

	public static void LoadEntitys() {
		//Bomby Registry
	    EntityRegistry.registerGlobalEntityID(EntityBomby.class, "EntityBomby",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityBomby.class, new RenderLiving(new ModelCreeper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBomby.png");}});//Sets Bomby Texture
	  //Captian Cookie Registry
	    EntityRegistry.registerGlobalEntityID(EntityCaptianCookie.class, "EntityCaptianCookie",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	  //Pat Registry
	    EntityRegistry.registerGlobalEntityID(EntityPat.class, "EntityPat",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityPat.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPat.png");}});//Sets Pat Texture
	  //Jen Registry
	    EntityRegistry.registerGlobalEntityID(EntityJen.class, "EntityJen",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityJen.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityJen.png");}});//Sets Jen Texture
	  //Fred 2.0 Registry
	    EntityRegistry.registerGlobalEntityID(EntityFred2_0.class, "EntityFred2_0",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityFred2_0.class, new RenderLiving(new ModelFred2_0(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityFred2_0.png");}});//Fred 2.0 Texture
	  //Ninja Master Registry
	    EntityRegistry.registerGlobalEntityID(EntityNinjaMaster.class, "EntityNinjaMaster",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityNinjaMaster.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityNinjaMaster.png");}});//NinjaMaster Texture
	}
}
