package com.jtrent238.epicproportions.addons.halloween.client;

import com.jtrent238.epicproportions.addons.halloween.common.CommonProxy;
import com.jtrent238.epicproportions.addons.halloween.entity.EntityGhost;
import com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyCaptianCookie;
import com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyJen;
import com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyPat;
import com.jtrent238.epicproportions.addons.halloween.model.ModelGhost;
import com.jtrent238.epicproportions.entity.EntityJen;
import com.jtrent238.epicproportions.entity.EntityPat;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
  

	public void init(FMLInitializationEvent e) {
    super.init (e);

    RenderingRegistry.registerEntityRenderingHandler(EntitySpookyPat.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_halloween:EntitySpookyPat.png");}});//Sets Pat Render
    RenderingRegistry.registerEntityRenderingHandler(EntitySpookyJen.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_halloween:EntitySpookyJen.png");}});//Sets Jen Render
    RenderingRegistry.registerEntityRenderingHandler(EntitySpookyCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_halloween:EntitySpookyCaptianCookie.png");}});//Sets Captain Cookie Render
    RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new RenderLiving(new ModelGhost(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_halloween:EntityGhost.png");}});//Sets Captain Cookie Render
    
	}

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
  
  
}
