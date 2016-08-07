package com.jtrent238.epicproportions.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ServerProxy;
import com.jtrent238.epicproportions.TradeHandler;
import com.jtrent238.epicproportions.common.CommonProxy;
import com.jtrent238.epicproportions.entity.Entilyjtrent238;
import com.jtrent238.epicproportions.entity.EntityBanana;
import com.jtrent238.epicproportions.entity.EntityBlockling_Small;
import com.jtrent238.epicproportions.entity.EntityBomby;
import com.jtrent238.epicproportions.entity.EntityCandyMan;
import com.jtrent238.epicproportions.entity.EntityCandyPopper;
import com.jtrent238.epicproportions.entity.EntityCaptianCookie;
import com.jtrent238.epicproportions.entity.EntityCaptianCookieLittle;
import com.jtrent238.epicproportions.entity.EntityClown;
import com.jtrent238.epicproportions.entity.EntityFred2_0;
import com.jtrent238.epicproportions.entity.EntityJen;
import com.jtrent238.epicproportions.entity.EntityKami;
import com.jtrent238.epicproportions.entity.EntityKitty;
import com.jtrent238.epicproportions.entity.EntityNinjaMaster;
import com.jtrent238.epicproportions.entity.EntityPat;
import com.jtrent238.epicproportions.entity.EntityPopo;
import com.jtrent238.epicproportions.entity.EntitySparky;
import com.jtrent238.epicproportions.eventhandler.OnJoinEvent;
import com.jtrent238.epicproportions.model.ModelBlockling_Small;
import com.jtrent238.epicproportions.model.ModelCandyPopper;
import com.jtrent238.epicproportions.model.ModelFred2_0;
import com.jtrent238.epicproportions.model.ModelKitty;
import com.jtrent238.epicproportions.model.ModelPopo1;
import com.jtrent238.epicproportions.render.ItemRenderJenChest;
import com.jtrent238.epicproportions.render.ItemRenderPatChest;
import com.jtrent238.epicproportions.render.JenChestRenderer;
import com.jtrent238.epicproportions.render.PatChestRenderer;
import com.jtrent238.epicproportions.render.RenderChests;
import com.jtrent238.epicproportions.render.RenderJenChest;
import com.jtrent238.epicproportions.render.RenderPatChest;
import com.jtrent238.epicproportions.tileentity.TileEntityJenChest;
import com.jtrent238.epicproportions.tileentity.TileEntityPatChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy {
  public void init(FMLInitializationEvent e) {
    super.init (e);
    //System.out.print("client init fired!");
    
    // Register client-specific stuff (e.g. renderer & packet-handler callback etc)
  

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJenChest.class, new JenChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockLoader.blockJenChest), new ItemRenderJenChest());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPatChest.class, new PatChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockLoader.blockPatChest), new ItemRenderPatChest());
	
		RenderingRegistry.registerEntityRenderingHandler(EntityBomby.class, new RenderLiving(new ModelCreeper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBomby.png");}});//Sets Bomby Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityPat.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPat.png");}});//Sets Pat Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityJen.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityJen.png");}});//Sets Jen Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityNinjaMaster.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityNinjaMaster.png");}});//NinjaMaster Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityCandyMan.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCandyMan.png");}});//The Candy Man Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookieLittle.class, new RenderLiving(new ModelVillager(0), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookieLittle.png");}});//The Captian Cookie Little Render
	    RenderingRegistry.registerEntityRenderingHandler(Entilyjtrent238.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:Entilyjtrent238.png");}});//jtrent238 Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityClown.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityClown.png");}});//jtrent238 Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityCandyPopper.class, new RenderLiving(new ModelCandyPopper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCandyPopper.png");}});//CandyPopper Render
	    RenderingRegistry.registerEntityRenderingHandler(EntitySparky.class, new RenderLiving(new ModelWolf(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntitySparky.png");}});//Sparky Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityKitty.class, new RenderLiving(new ModelKitty(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityKitty.png");}});//Kitty Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityKami.class, new RenderLiving(new ModelSheep1(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityKami.png");}});//Kami Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityPopo.class, new RenderLiving(new ModelPopo1(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPopo.png");}});//Popo Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityBanana.class, new RenderLiving(new ModelCow(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBanana.png");}});//Banana Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityBlockling_Small.class, new RenderLiving(new ModelBlockling_Small(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBlockling_Small.png");}});//Small Blockling Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityFred2_0.class, new RenderLiving(new ModelFred2_0(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityFred2_0.png");}});//Small Blockling Render
	    
    	VillagerRegistry.instance().registerVillagerSkin(22, new ResourceLocation("epicproportionsmod", "VillagerOfEpicProportions.png"));
    	VillagerRegistry.instance().registerVillagerSkin(23, new ResourceLocation("epicproportionsmod", "JenVillager.png"));
    	VillagerRegistry.instance().registerVillagerSkin(24, new ResourceLocation("epicproportionsmod", "PatVillager.png"));
    	VillagerRegistry.instance().registerVillagerSkin(25, new ResourceLocation("epicproportionsmod", "TESTVILLAGER.png"));

	
		//return RenderingRegistry.addNewArmourRendererPrefix(armor);

		RenderChests.RenderTileEntitys();

		//FMLCommonHandler.instance().bus().register(new OnJoinEvent());
		//FMLCommonHandler.instance().bus().register(new GameSettings());
    	
  }
  
  @SubscribeEvent
  public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

  	event.player.addChatComponentMessage(new ChatComponentText("§b§lHello" + " " + "§e§l" + event.player.getDisplayName() + "§b§l!"));
  	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§a§l" + EpicProportionsMod.MODNAME + " " + "§2§lMade By:jtrent238"));
  	event.player.addChatComponentMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§6§lYou are running" + "§b§l" + " " + EpicProportionsMod.MODVERSION + " " + "§6§lof" + "§6§l" + " " + EpicProportionsMod.MODNAME + "!"));
  	//event.player.addChatComponentMessage(new ChatComponentText("§e§lLearn more at: §b§lhttp://bit.ly/FoodModWiki"));
  	event.player.triggerAchievement(Achievements.achievementinstall);
  	//event.player.addEntityCrashInfo(EpicProportionsMod.CRASHINFO);
  	//event.player.clonePlayer(playerclone, true);
  	event.player.extinguish();
  	event.player.getDisplayName();
  	//event.player.writeToNBT(EpicProportionsMod.NBTJOIN);
  	event.player.getBedLocation();
  	event.player.shouldHeal();
  	event.getListenerList();
  	event.hashCode();
  	Minecraft.getSystemTime();
  	Minecraft.isAmbientOcclusionEnabled();
  	Minecraft.isGuiEnabled();
  	Minecraft.getMinecraft();
  	Minecraft.getGLMaximumTextureSize();
  	Minecraft.isFancyGraphicsEnabled();
  	//Log.getLog(arg0, arg1, arg2);
  	//event.notifyAll();
  }
}
