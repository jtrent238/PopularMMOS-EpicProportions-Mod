package com.jtrent238.epicproportions.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.Entity;
import net.minecraft.event.ClickEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;
import com.jtrent238.epicproportions.ServerProxy;
import com.jtrent238.epicproportions.TradeHandler;
import com.jtrent238.epicproportions.VersionChecker;
import com.jtrent238.epicproportions.common.CommonProxy;
import com.jtrent238.epicproportions.entity.EntilyJenArrow;
import com.jtrent238.epicproportions.entity.EntilyPatArrow;
import com.jtrent238.epicproportions.entity.Entilyjtrent238;
import com.jtrent238.epicproportions.entity.EntityBanana;
import com.jtrent238.epicproportions.entity.EntityBellie;
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
import com.jtrent238.epicproportions.entity.EntityLuckyEgg;
import com.jtrent238.epicproportions.entity.EntityNinjaMaster;
import com.jtrent238.epicproportions.entity.EntityNinjaStar;
import com.jtrent238.epicproportions.entity.EntityPat;
import com.jtrent238.epicproportions.entity.EntityPatGolem;
import com.jtrent238.epicproportions.entity.EntityPopo;
import com.jtrent238.epicproportions.entity.EntitySparky;
import com.jtrent238.epicproportions.eventhandler.OnJoinEvent;
import com.jtrent238.epicproportions.eventhandler.OnOpenPresentEvent;
import com.jtrent238.epicproportions.eventhandler.OnPickupJenFlowerEvent;
import com.jtrent238.epicproportions.eventhandler.OnPickupJenStarEvent;
import com.jtrent238.epicproportions.eventhandler.OnPickupPatStarEvent;
import com.jtrent238.epicproportions.model.ModelBlockling_Small;
import com.jtrent238.epicproportions.model.ModelCandyPopper;
import com.jtrent238.epicproportions.model.ModelFred2_0;
import com.jtrent238.epicproportions.model.ModelJenGolem;
import com.jtrent238.epicproportions.model.ModelKitty;
import com.jtrent238.epicproportions.model.ModelLuckyChicken;
import com.jtrent238.epicproportions.model.ModelPatGolem;
import com.jtrent238.epicproportions.model.ModelPopo1;
import com.jtrent238.epicproportions.render.ItemRenderJenChest;
import com.jtrent238.epicproportions.render.ItemRenderPatChest;
import com.jtrent238.epicproportions.render.JenChestRenderer;
import com.jtrent238.epicproportions.render.PatChestRenderer;
import com.jtrent238.epicproportions.render.RenderChests;
import com.jtrent238.epicproportions.render.RenderJenArrow;
import com.jtrent238.epicproportions.render.RenderJenChest;
import com.jtrent238.epicproportions.render.RenderJenStatue;
import com.jtrent238.epicproportions.render.RenderNinjaStar;
import com.jtrent238.epicproportions.render.RenderPatArrow;
import com.jtrent238.epicproportions.render.RenderPatChest;
import com.jtrent238.epicproportions.render.RenderPatStatue;
import com.jtrent238.epicproportions.tileentity.TileEntityJenChest;
import com.jtrent238.epicproportions.tileentity.TileEntityJenStatue;
import com.jtrent238.epicproportions.tileentity.TileEntityLoader;
import com.jtrent238.epicproportions.tileentity.TileEntityPatChest;
import com.jtrent238.epicproportions.tileentity.TileEntityPatStatue;
//import com.sun.media.jfxmedia.logging.Logger;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy {
  
    private static Minecraft theMinecraft;
 
    // Version checking instance
 	public static VersionChecker versionChecker;
 	public static boolean haveWarnedVersionOutOfDate = false;
 
	
 	
	public void init(FMLInitializationEvent e) {
    super.init (e);
    //System.out.print("client init fired!");
    
    // Register client-specific stuff (e.g. renderer & packet-handler callback etc)
  
    

		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJenChest.class, new JenChestRenderer());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockLoader.blockJenChest), new ItemRenderJenChest());
		
		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPatChest.class, new PatChestRenderer());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockLoader.blockPatChest), new ItemRenderPatChest());
	
		RenderingRegistry.registerEntityRenderingHandler(EntityBomby.class, new RenderLiving(new ModelCreeper(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBomby.png");}});//Sets Bomby Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie.png");}});//Sets CaptianCookie Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityCaptianCookie_Evil.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityCaptianCookie_Evil.png");}});//Sets CaptianCookie Render
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
	    RenderingRegistry.registerEntityRenderingHandler(EntityPatGolem.class, new RenderLiving(new ModelPatGolem(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPatGolem.png");}});//Pat Golem Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityJenGolem.class, new RenderLiving(new ModelJenGolem(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityJenGolem.png");}});//Jen Golem Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityBellie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityBellie.png");}});//Sets Bellie Render
	    RenderingRegistry.registerEntityRenderingHandler(EntityLuckyChicken.class, new RenderLiving(new ModelLuckyChicken(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityLuckyChicken.png");}});//Sets Bellie Render
	    
	    RenderingRegistry.registerEntityRenderingHandler(EntilyPatArrow.class, new RenderPatArrow(){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityPatArrow.png");}});//Pat Arrow Render #1
	    RenderingRegistry.registerEntityRenderingHandler(EntilyJenArrow.class, new RenderJenArrow(){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:EntityJenArrow.png");}});//Jen Arrow Render #1
	    RenderingRegistry.registerEntityRenderingHandler(EntilyPatArrow.class, new RenderPatArrow());//Pat Arrow Render #2
	    RenderingRegistry.registerEntityRenderingHandler(EntilyJenArrow.class, new RenderJenArrow());//Jen Arrow Render #2
	    //RenderingRegistry.registerEntityRenderingHandler(EntityNinjaStar.class, new RenderSnowball(new ItemStack(ItemLoader.ItemNinjaStar).getItem()));
	    //RenderingRegistry.registerEntityRenderingHandler(EntityNinjaStar.class, new RenderSnowball(ItemLoader.ItemNinjaStar));
	    
	    VillagerRegistry.instance().registerVillagerSkin(22, new ResourceLocation("epicproportionsmod", "VillagerOfEpicProportions.png"));
    	VillagerRegistry.instance().registerVillagerSkin(23, new ResourceLocation("epicproportionsmod", "JenVillager.png"));
    	VillagerRegistry.instance().registerVillagerSkin(24, new ResourceLocation("epicproportionsmod", "PatVillager.png"));
    	VillagerRegistry.instance().registerVillagerSkin(25, new ResourceLocation("epicproportionsmod", "TESTVILLAGER.png"));

    	
    	TileEntitySpecialRenderer render0 = new RenderPatStatue();
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPatStatue.class, render0);
    	TileEntitySpecialRenderer render1 = new RenderJenStatue();
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJenStatue.class, render1);
    	
	
		//return RenderingRegistry.addNewArmourRendererPrefix(armor);

		RenderChests.RenderTileEntitys();
		TileEntityLoader.mainRegistry();
		
		FMLCommonHandler.instance().bus().register(new OnJoinEvent());
		FMLCommonHandler.instance().bus().register(new OnPickupJenFlowerEvent());
		FMLCommonHandler.instance().bus().register(new OnPickupJenStarEvent());
		FMLCommonHandler.instance().bus().register(new OnPickupPatStarEvent());
		FMLCommonHandler.instance().bus().register(new OnOpenPresentEvent());
		//FMLCommonHandler.instance().bus().register(new GuiMainMenu());
		
		
		//FMLCommonHandler.instance().bus().register(new GameSettings());
    	
		
		
  }
  

  public void postInit(FMLPostInitializationEvent e) {
	 
	  ClientProxy.versionChecker = new VersionChecker();
	    Thread versionCheckThread = new Thread(ClientProxy.versionChecker, "Version Check");
	    versionCheckThread.start();
  }
  
  
  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
  public void onEvent(PlayerTickEvent event)
  {
    
      if (!ClientProxy.haveWarnedVersionOutOfDate && event.player.worldObj.isRemote 
            && !ClientProxy.versionChecker.isLatestVersion())
      {
          ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, 
                "http://www.planetminecraft.com/mod/popularmmos-epicproportions-mod-season-9/");
          ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
          ChatComponentText versionWarningChatComponent = 
                new ChatComponentText("Your EpicProportions Mod is not latest version!  Click here to update.");
          versionWarningChatComponent.setChatStyle(clickableChatStyle);
          event.player.addChatMessage(versionWarningChatComponent);
          ClientProxy.haveWarnedVersionOutOfDate = true;
      }
    
  }
  
  @Override
  public void registerRenderThings()
  {
  RenderingRegistry.registerEntityRenderingHandler(EntityNinjaStar.class, new RenderSnowball(ItemLoader.ItemNinjaStar));
  RenderingRegistry.registerEntityRenderingHandler(EntityLuckyEgg.class, new RenderSnowball(ItemLoader.ItemLuckyEgg));
  RenderingRegistry.registerEntityRenderingHandler(EntilyPatArrow.class, new RenderPatArrow());
  RenderingRegistry.registerEntityRenderingHandler(EntilyJenArrow.class, new RenderJenArrow());
  }

  @Override
  public void registerSounds() {}
  }

