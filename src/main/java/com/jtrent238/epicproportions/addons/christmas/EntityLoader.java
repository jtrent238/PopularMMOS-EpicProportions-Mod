package com.jtrent238.epicproportions.addons.christmas;

import com.jtrent238.epicproportions.addons.christmas.entity.EntityGiantSnowBall;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityGingerBreadMan;
import com.jtrent238.epicproportions.addons.christmas.entity.EntitySanta;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasCaptainCookie;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasJen;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasPat;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	

	public static void LoadEntitys() {
		

	//Santa Registry
	    EntityRegistry.registerGlobalEntityID(EntitySanta.class, "EntitySanta",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntitySanta.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	 //Santa Registry
	    EntityRegistry.registerGlobalEntityID(EntityGingerBreadMan.class, "EntityGingerBreadMan",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityGingerBreadMan.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	  //Christmas Capitan Cookie Registry
	    EntityRegistry.registerGlobalEntityID(EntityXmasCaptainCookie.class, "EntityXmasCaptainCookie",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityXmasCaptainCookie.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	  //Christmas Pat Registry
	    EntityRegistry.registerGlobalEntityID(EntityXmasPat.class, "EntityXmasPat",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityXmasPat.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	  //Christmas Jen Registry
	    EntityRegistry.registerGlobalEntityID(EntityXmasJen.class, "EntityXmasJen",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityXmasJen.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	
	  //Giant SnowBall Registry
	    EntityRegistry.registerGlobalEntityID(EntityGiantSnowBall.class, "EntityGiantSnowBall",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    //EntityRegistry.addSpawn(EntityXmasJen.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	
    	}
	{
	
	}
	//

}
