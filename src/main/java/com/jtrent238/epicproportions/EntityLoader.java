package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.entity.EntilyJenArrow;
import com.jtrent238.epicproportions.entity.EntilyPatArrow;
import com.jtrent238.epicproportions.entity.EntilyPatTNTPrimed;
import com.jtrent238.epicproportions.entity.Entilyjtrent238;
import com.jtrent238.epicproportions.entity.EntityBomby;
import com.jtrent238.epicproportions.entity.EntityCandyMan;
import com.jtrent238.epicproportions.entity.EntityCaptianCookie;
import com.jtrent238.epicproportions.entity.EntityCaptianCookieLittle;
import com.jtrent238.epicproportions.entity.EntityFred2_0;
import com.jtrent238.epicproportions.entity.EntityJen;
import com.jtrent238.epicproportions.entity.EntityNinjaMaster;
import com.jtrent238.epicproportions.entity.EntityPat;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntitySheep;

import com.jtrent238.epicproportions.model.ModelFred2_0;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	
	public static void LoadEntitys() {
	//Bomby Registry
	    EntityRegistry.registerGlobalEntityID(EntityBomby.class, "EntityBomby",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityBomby.class, new RenderLiving(new ModelCreeper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBomby.png");}});//Sets Bomby Texture
	
	//Captian Cookie Registry
	    EntityRegistry.registerGlobalEntityID(EntityCaptianCookie.class, "EntityCaptianCookie",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityCaptianCookie.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna);
		
	//Pat Registry
	    EntityRegistry.registerGlobalEntityID(EntityPat.class, "EntityPat",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityPat.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPat.png");}});//Sets Pat Texture
	    EntityRegistry.addSpawn(EntityPat.class, 10, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna);
		
	//Jen Registry
	    EntityRegistry.registerGlobalEntityID(EntityJen.class, "EntityJen",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityJen.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityJen.png");}});//Sets Jen Texture
	    EntityRegistry.addSpawn(EntityJen.class, 10, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna);
		
	//Fred 2.0 Registry
	    EntityRegistry.registerGlobalEntityID(EntityFred2_0.class, "EntityFred2_0",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityFred2_0.class, new RenderLiving(new ModelFred2_0(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityFred2_0.png");}});//Fred 2.0 Texture
	    
	//Ninja Master Registry
	    EntityRegistry.registerGlobalEntityID(EntityNinjaMaster.class, "EntityNinjaMaster",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityNinjaMaster.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityNinjaMaster.png");}});//NinjaMaster Texture
	    EntityRegistry.addSpawn(EntityNinjaMaster.class, 2, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna);
		
	//The Candy Man Master Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyMan.class, "EntityCandyMan",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityCandyMan.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCandyMan.png");}});//The Candy Man Texture
	    EntityRegistry.addSpawn(EntityCandyMan.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna);
		
	//Captian Cookie Little Registry
	    EntityRegistry.registerGlobalEntityID(EntityCaptianCookieLittle.class, "EntityCaptianCookieLittle",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookieLittle.class, new RenderLiving(new ModelVillager(0), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookieLittle.png");}});//The Captian Cookie Little Texture
	    
	  //jtrent238 Registry
	    EntityRegistry.registerGlobalEntityID(Entilyjtrent238.class, "Entilyjtrent238",EntityRegistry.findGlobalUniqueEntityId());
	    RenderingRegistry.registerEntityRenderingHandler(Entilyjtrent238.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:Entilyjtrent238.png");}});//jtrent238 Texture
	    EntityRegistry.addSpawn(Entilyjtrent238.class, 1, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna);
	 
	   // EntityRegistry.addSpawn(EntityPat.class, 25, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.icePlains);
	  
	  //PatTNT Registry
	    EntityRegistry.registerGlobalEntityID(EntilyPatTNTPrimed.class, "EntilyPatTNTPrimed",EntityRegistry.findGlobalUniqueEntityId());
	   
	  //Pat Arrow Registry
	    EntityRegistry.registerGlobalEntityID(EntilyPatArrow.class, "EntilyPatArrow",EntityRegistry.findGlobalUniqueEntityId());
	  //Jen Arrow Registry
	    EntityRegistry.registerGlobalEntityID(EntilyJenArrow.class, "EntilyJenArrow",EntityRegistry.findGlobalUniqueEntityId());
	   
	}
	

}
