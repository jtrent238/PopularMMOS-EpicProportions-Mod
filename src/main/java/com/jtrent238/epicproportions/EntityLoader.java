package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.entity.EntilyJenArrow;
import com.jtrent238.epicproportions.entity.EntilyPatArrow;
import com.jtrent238.epicproportions.entity.EntilyPatTNTPrimed;
import com.jtrent238.epicproportions.entity.Entilyjtrent238;
import com.jtrent238.epicproportions.entity.EntityBanana;
import com.jtrent238.epicproportions.entity.EntityBellie;
import com.jtrent238.epicproportions.entity.EntityBlockling;
import com.jtrent238.epicproportions.entity.EntityBlockling_Small;
import com.jtrent238.epicproportions.entity.EntityBomby;
import com.jtrent238.epicproportions.entity.EntityCandyMan;
import com.jtrent238.epicproportions.entity.EntityCandyPopper;
import com.jtrent238.epicproportions.entity.EntityCaptianCookie;
import com.jtrent238.epicproportions.entity.EntityCaptianCookieLittle;
import com.jtrent238.epicproportions.entity.EntityCaptianCookie_Evil;
import com.jtrent238.epicproportions.entity.EntityClown;
import com.jtrent238.epicproportions.entity.EntityFred2_0;
import com.jtrent238.epicproportions.entity.EntityJen;
import com.jtrent238.epicproportions.entity.EntityJenGolem;
import com.jtrent238.epicproportions.entity.EntityKami;
import com.jtrent238.epicproportions.entity.EntityKitty;
import com.jtrent238.epicproportions.entity.EntityLuckyChicken;
import com.jtrent238.epicproportions.entity.EntityNinjaMaster;
import com.jtrent238.epicproportions.entity.EntityNinjaStar;
import com.jtrent238.epicproportions.entity.EntityPat;
import com.jtrent238.epicproportions.entity.EntityPatGolem;
import com.jtrent238.epicproportions.entity.EntityPopo;
import com.jtrent238.epicproportions.entity.EntitySparky;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelOcelot;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntitySheep;

import com.jtrent238.epicproportions.model.ModelBlockling_Small;
import com.jtrent238.epicproportions.model.ModelBomby;
import com.jtrent238.epicproportions.model.ModelCandyPopper;
import com.jtrent238.epicproportions.model.ModelFred2_0;
import com.jtrent238.epicproportions.model.ModelKitty;
import com.jtrent238.epicproportions.model.ModelPopo1;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;
//import sun.security.krb5.Config;



public class EntityLoader {

	


	
	public static final Entity EntityFred2_0 = null;
	private static int jtrent238;
	public static int Ted;
	private static String MyEntityID_1;
	public Object instance;
	
	public static void LoadEntitys() {
		
	//Bomby Registry
	    EntityRegistry.registerGlobalEntityID(EntityBomby.class, "EntityBomby", EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityBomby.class, new RenderLiving(new ModelCreeper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBomby.png");}});//Sets Bomby Texture
	    
	//Captian Cookie Registry
	    EntityRegistry.registerGlobalEntityID(EntityCaptianCookie.class, "EntityCaptianCookie",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityCaptianCookie.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	//Evil Captian Cookie Registry
	    EntityRegistry.registerGlobalEntityID(EntityCaptianCookie_Evil.class, "EntityCaptianCookie_Evil",EntityRegistry.findGlobalUniqueEntityId());
	//Pat Registry
	    EntityRegistry.registerGlobalEntityID(EntityPat.class, "EntityPat",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityPat.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPat.png");}});//Sets Pat Texture
	    EntityRegistry.addSpawn(EntityPat.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	//Jen Registry
	    EntityRegistry.registerGlobalEntityID(EntityJen.class, "EntityJen",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityJen.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityJen.png");}});//Sets Jen Texture
	    EntityRegistry.addSpawn(EntityJen.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	//Fred 2.0 Registry
	    EntityRegistry.registerGlobalEntityID(EntityFred2_0.class, "EntityFred2_0",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityFred2_0.class, new RenderLiving(new ModelFred2_0(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityFred2_0.png");}});//Fred 2.0 Texture
	    EntityRegistry.addSpawn(EntityFred2_0.class, 8, 4, 6, EnumCreatureType.monster, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	//Ninja Master Registry
	    EntityRegistry.registerGlobalEntityID(EntityNinjaMaster.class, "EntityNinjaMaster",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityNinjaMaster.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityNinjaMaster.png");}});//NinjaMaster Texture
	    EntityRegistry.addSpawn(EntityNinjaMaster.class, 2, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	//The Candy Man Master Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyMan.class, "EntityCandyMan",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCandyMan.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCandyMan.png");}});//The Candy Man Texture
	    EntityRegistry.addSpawn(EntityCandyMan.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	//Captian Cookie Little Registry
	    EntityRegistry.registerGlobalEntityID(EntityCaptianCookieLittle.class, "EntityCaptianCookieLittle",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookieLittle.class, new RenderLiving(new ModelVillager(0), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookieLittle.png");}});//The Captian Cookie Little Texture
	    
	  //jtrent238 Registry
	    EntityRegistry.registerGlobalEntityID(Entilyjtrent238.class, "Entilyjtrent238", jtrent238/*/EntityRegistry.findGlobalUniqueEntityId()/*/);
	   // RenderingRegistry.registerEntityRenderingHandler(Entilyjtrent238.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:Entilyjtrent238.png");}});//jtrent238 Texture
	   
	    if(EpicProportionsMod.JTRENT238_SPAWN == true){
	    EntityRegistry.addSpawn(Entilyjtrent238.class, 1, 1, 1, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
	    	}
	    /*VillagerRegistry.instance().registerVillagerId(jtrent238);
	    	VillagerRegistry.instance().registerVillageTradeHandler(8, new TradeHandler());
	    	VillagerRegistry.instance().getRegisteredVillagers(); 
	    	VillagerRegistry.instance().registerVillagerSkin(8, new ResourceLocation("epicproportionsmod", "test.png"));
	    	VillagerRegistry.instance().equals(Entilyjtrent238.class);*/
	    // EntityRegistry.addSpawn(EntityPat.class, 25, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.icePlains);
	  
	  //PatTNT Registry
	    EntityRegistry.registerGlobalEntityID(EntilyPatTNTPrimed.class, "EntilyPatTNTPrimed",EntityRegistry.findGlobalUniqueEntityId());
	   
	  //Pat Arrow Registry
	    //EntityRegistry.registerGlobalEntityID(EntilyPatArrow.class, "EntilyPatArrow",EntityRegistry.findGlobalUniqueEntityId());
	  //Jen Arrow Registry
	    //EntityRegistry.registerGlobalEntityID(EntilyJenArrow.class, "EntilyJenArrow",EntityRegistry.findGlobalUniqueEntityId());
	   
	  //Clown Registry
	    EntityRegistry.registerGlobalEntityID(EntityClown.class, "EntityClown",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityClown.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityClown.png");}});//jtrent238 Texture
	    EntityRegistry.addSpawn(EntityClown.class, 1, 4, 6, EnumCreatureType.monster, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
	  
	   //CandyPopper Registry
	    EntityRegistry.registerGlobalEntityID(EntityCandyPopper.class, "EntityCandyPopper",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCandyPopper.class, new RenderLiving(new ModelCandyPopper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCandyPopper.png");}});//CandyPopper Texture
	
	    //Sparky Registry
	    EntityRegistry.registerGlobalEntityID(EntitySparky.class, "EntitySparky",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntitySparky.class, new RenderLiving(new ModelWolf(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntitySparky.png");}});//Sparky Texture
	    
	    //Kitty Registry
	    EntityRegistry.registerGlobalEntityID(EntityKitty.class, "EntityKitty",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityKitty.class, new RenderLiving(new ModelKitty(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityKitty.png");}});//Kitty Texture
	    EntityRegistry.addSpawn(EntityKitty.class, 1, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		  
	  //Kami Registry
	    EntityRegistry.registerGlobalEntityID(EntityKami.class, "EntityKami",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityKami.class, new RenderLiving(new ModelSheep1(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityKami.png");}});//Kami Texture
	    EntityRegistry.addSpawn(EntityKami.class, 1, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	  //Popo Registry
	    EntityRegistry.registerGlobalEntityID(EntityPopo.class, "EntityPopo",EntityRegistry.findGlobalUniqueEntityId());
	   // RenderingRegistry.registerEntityRenderingHandler(EntityPopo.class, new RenderLiving(new ModelPopo1(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPopo.png");}});//Popo Texture
	    EntityRegistry.addSpawn(EntityPopo.class, 1, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	  //Banana Registry
	    EntityRegistry.registerGlobalEntityID(EntityBanana.class, "EntityBanana",EntityRegistry.findGlobalUniqueEntityId());
	   // RenderingRegistry.registerEntityRenderingHandler(EntityBanana.class, new RenderLiving(new ModelCow(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBanana.png");}});//Banana Texture
	    EntityRegistry.addSpawn(EntityPopo.class, 1, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	  //Blockling Registry
	    EntityRegistry.registerGlobalEntityID(EntityBlockling.class, "EntityBlockling",EntityRegistry.findGlobalUniqueEntityId());
	    
	  //Small Blockling Registry
	    EntityRegistry.registerGlobalEntityID(EntityBlockling_Small.class, "EntityBlockling_Small",EntityRegistry.findGlobalUniqueEntityId());
	   // RenderingRegistry.registerEntityRenderingHandler(EntityBlockling_Small.class, new RenderLiving(new ModelBlockling_Small(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBlockling_Small.png");}});//Small Blockling Texture
		
	    
	  //Pat Golem Registry
	    EntityRegistry.registerGlobalEntityID(EntityPatGolem.class, "EntityPatGolem",EntityRegistry.findGlobalUniqueEntityId());
	   
	  //Jen Golem Registry
	    EntityRegistry.registerGlobalEntityID(EntityJenGolem.class, "EntityJenGolem",EntityRegistry.findGlobalUniqueEntityId());
	   
	    EntityRegistry.registerGlobalEntityID(EntityBellie.class, "EntityBellie",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityBellie.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		

	    EntityRegistry.registerGlobalEntityID(EntityLuckyChicken.class, "EntityLuckyChicken",EntityRegistry.findGlobalUniqueEntityId());
	    //RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Texture
	    EntityRegistry.addSpawn(EntityLuckyChicken.class, 15, 14, 16, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mushroomIsland);
		
	    //EntityRegistry.registerModEntity(EntityNinjaStar.class, "NinjaStar", 4, 967, 80, 3, true);
    	
	  //VillagerOfEpicProportions Registry
	    VillagerRegistry.instance().registerVillagerId(EpicProportionsMod.getVILLAGER_ID_1());
    	VillagerRegistry.instance().registerVillageTradeHandler(EpicProportionsMod.getVILLAGER_ID_1(), new TradeHandler());
    	VillagerRegistry.instance().getRegisteredVillagers(); 
    	VillagerRegistry.instance().getClass();
	
    	//JenVillager Registry
	    VillagerRegistry.instance().registerVillagerId(EpicProportionsMod.getVILLAGER_ID_2());
    	VillagerRegistry.instance().registerVillageTradeHandler(EpicProportionsMod.getVILLAGER_ID_2(), new TradeHandler());
    	VillagerRegistry.instance().getRegisteredVillagers(); 
    	VillagerRegistry.instance().getClass();
	
	
    	//PatVillager Registry
	    VillagerRegistry.instance().registerVillagerId(EpicProportionsMod.getVILLAGER_ID_3());
    	VillagerRegistry.instance().registerVillageTradeHandler(EpicProportionsMod.getVILLAGER_ID_3(), new TradeHandler());
    	VillagerRegistry.instance().getRegisteredVillagers(); 
    	VillagerRegistry.instance().getClass();
    	
    	
    	//TEST Registry
	    VillagerRegistry.instance().registerVillagerId(EpicProportionsMod.getVILLAGER_ID_4());
    	VillagerRegistry.instance().registerVillageTradeHandler(EpicProportionsMod.getVILLAGER_ID_4(), new TradeHandler());
    	VillagerRegistry.instance().getRegisteredVillagers(); 
    	VillagerRegistry.instance().getClass();
	
    	//Santa Registry
	    VillagerRegistry.instance().registerVillagerId(/*64*/29627/*/EpicProportionsMod.getVILLAGER_ID_5()/*/);
    	VillagerRegistry.instance().registerVillageTradeHandler(/*64*/29627 /*/EpicProportionsMod.getVILLAGER_ID_5()/*/, new TradeHandler());
    	VillagerRegistry.instance().getRegisteredVillagers(); 
    	VillagerRegistry.instance().getClass();

    	}
	{
	
	}
	//

}
