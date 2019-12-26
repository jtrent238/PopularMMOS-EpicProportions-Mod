package com.jtrent238.epicproportions.addons.christmas.client;

import com.jtrent238.epicproportions.addons.christmas.BlockLoader;
import com.jtrent238.epicproportions.addons.christmas.ItemLoader;
import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;
import com.jtrent238.epicproportions.addons.christmas.common.CommonProxy;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityGiantSnowBall;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityGingerBreadMan;
import com.jtrent238.epicproportions.addons.christmas.entity.EntitySanta;
import com.jtrent238.epicproportions.addons.christmas.entity.EntitySled;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasCaptainCookie;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasJen;
import com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasPat;
import com.jtrent238.epicproportions.addons.christmas.model.ModelGingerBreadMan;
import com.jtrent238.epicproportions.addons.christmas.render.RenderBlockChristmasPresents_Red;
import com.jtrent238.epicproportions.addons.christmas.render.RenderBlockChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.render.RenderBlockLights;
import com.jtrent238.epicproportions.addons.christmas.render.entity.RenderGiantSnowBall;
import com.jtrent238.epicproportions.addons.christmas.render.entity.RenderSled;
import com.jtrent238.epicproportions.addons.christmas.render.tileentity.RenderBulb;
import com.jtrent238.epicproportions.addons.christmas.render.tileentity.RenderTileEntityBlockChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.render.tileentity.RenderTileEntityBlockNorthPole;
import com.jtrent238.epicproportions.addons.christmas.render.tileentity.RenderTileEntityBlockSnowman;
import com.jtrent238.epicproportions.addons.christmas.render.tileentity.RenderTileEntityBlockSnowmanCreepy;
import com.jtrent238.epicproportions.addons.christmas.render.tileentity.TileEntityBulbRender;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockChristmasPresents_Red;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockNorthPole;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockSnowman;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockSnowmanCreepy;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBulb;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntitySled;
import com.jtrent238.epicproportions.entity.EntityJenBoat;
import com.jtrent238.epicproportions.render.RenderJenBoat;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
  
	
	
	
	private String owner;

	public void init(FMLInitializationEvent e) {
    super.init (e);

    //TileEntitySpecialRenderer render0 = new RenderBlockChristmasPresents_Red(0, 0, 0, 0, null, owner);
	//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockChristmasPresents_Red.class, render0);
	
	
	RenderingRegistry.registerEntityRenderingHandler(EntitySanta.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_christmas:EntitySanta.png");}});//Sets Santa Render
	RenderingRegistry.registerEntityRenderingHandler(EntityGingerBreadMan.class, new RenderLiving(new ModelGingerBreadMan(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_christmas:EntityGingerbreadman.png");}});//Sets Santa Render
	RenderingRegistry.registerEntityRenderingHandler(EntityXmasCaptainCookie.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_christmas:EntityXmasCaptainCookie.png");}});
	RenderingRegistry.registerEntityRenderingHandler(EntityXmasPat.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_christmas:EntityXmasPat.png");}});
	RenderingRegistry.registerEntityRenderingHandler(EntityXmasJen.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod_christmas:EntityXmasJen.png");}});
	RenderingRegistry.registerEntityRenderingHandler(EntityGiantSnowBall.class, new RenderGiantSnowBall(ItemLoader.ItemGiantSnowball, 0)); 
	
	//RenderingRegistry.registerEntityRenderingHandler(EntitySled.class, new RenderSled());
	
	//RenderChristmasTree(null, null, 0, 0, 0);
	//RenderChristmasPresents_Red(null, null, 0, 0, 0);
	//RenderChristmasLights(null, null, 0, 0, 0);
	
	//TileEntitySpecialRenderer renderbulb = new TileEntityBulbRender();
	//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBulb.class, renderbulb);
	//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBulb.class, new TileEntityBulbRender());
	}
	
  
	public void registerRenderInformation()
    {
		epicproportionsmod_christmas.BulbModelID = RenderingRegistry.instance().getNextAvailableRenderId();
        RenderingRegistry.instance().registerBlockHandler(epicproportionsmod_christmas.BulbModelID , (ISimpleBlockRenderingHandler) new TileEntityBulbRender());
        }
	
	/*
private void RenderChristmasLights(RenderBlocks RenderXmasLights, IBlockAccess world, int x, int y, int z) {
	RenderingRegistry.instance().renderWorldBlock(RenderXmasLights, world, x, y, z, BlockLoader.BlockLights, 656);
	
	}
	 */

	/*
private void RenderChristmasPresents_Red(RenderBlocks RenderXmasPresents_Red, IBlockAccess world, int x, int y, int z) {
	RenderingRegistry.instance().renderWorldBlock(RenderXmasPresents_Red, world, x, y, z, BlockLoader.BlockChristmasPresents_Red, 655);
	
	}
	*/

	/*
private void RenderChristmasTree(RenderBlocks RenderXmasTree, IBlockAccess world, int x, int y, int z) {
	RenderingRegistry.instance().renderWorldBlock(RenderXmasTree, world, x, y, z, BlockLoader.BlockChristmasTree, 654);
	
	}
	*/


public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }

@Override
public void registerRenderThings()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityGiantSnowBall.class, new RenderSnowball(ItemLoader.ItemGiantSnowball));

		GameRegistry.registerTileEntity(TileEntityBlockChristmasTree.class, "TileEntityBlockChristmasTree");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockChristmasTree.class, new RenderTileEntityBlockChristmasTree());
		
		/*GameRegistry.registerTileEntity(TileEntitySled.class, "TileEntitySled");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySled.class, new RenderSled());*/
		
		GameRegistry.registerTileEntity(TileEntityBulb.class, "TileEntityBulb");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBulb.class, new RenderBulb());
		
		/*GameRegistry.registerTileEntity(TileEntityBlockNorthPole.class, "TileEntityBlockNorthPole");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockNorthPole.class, new RenderTileEntityBlockNorthPole());*/
		
		GameRegistry.registerTileEntity(TileEntityBlockSnowman.class, "TileEntityBlockSnowman");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockSnowman.class, new RenderTileEntityBlockSnowman());
		
		GameRegistry.registerTileEntity(TileEntityBlockSnowmanCreepy.class, "TileEntityBlockSnowmanCreepy");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockSnowmanCreepy.class, new RenderTileEntityBlockSnowmanCreepy());
		
	}
 
}
