package com.jtrent238.epicproportions.addons.christmas;


import com.jtrent238.epicproportions.addons.christmas.blocks.BlockBulb;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockCandyCane;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockCandyCaneIngot;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockCandyCaneOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockChristmasPresent;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockChristmasPresents_Red;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrostedGlass;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrostedGlassPane;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenCoal;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenCoalOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenCobbleStone;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenDiamond;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenDiamondOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenEmerald;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenEmeraldOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenGoldIngot;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenGoldIngotOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenIronIngot;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenIronIngotOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenLapis;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenLapisOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenRedstone;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenRedstoneOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrozenStone;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBread;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBreadCarpet;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBreadDoor;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBreadStairs;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBread_Meta;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockLights;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockNorthPole;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockPortalWinterWonderLand;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockSnowman;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockSnowmanCreepy;
import com.jtrent238.epicproportions.addons.christmas.items.ItemBulb;
import com.jtrent238.epicproportions.addons.christmas.util.WinterWonderLandDimensionTeleporter;
import com.jtrent238.epicproportions.blocks.BlockModStairs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {

	public static Block BlockChristmasPresent;
	public static Block BlockChristmasPresents_Red;
	public static Block BlockChristmasTree;
	public static Block BlockCandyCaneOre;
	//public static Block BlockCandyCaneIngot;
	public static Block BlockCandyCane;
	public static Block tree_bottom;
	public static Block BlockLights;
	public static Block BlockGingerBread;
	public static Block BlockFrostedGlass;
	public static Block BlockFrostedGlassPane;
	public static Block BlockGingerBreadDoor;
	public static Block BlockPepperMintDoor;
	public static Block BlockBulb;
	public static Block BlockGingerBreadCarpet;
	public static Block BlockGingerBread_Meta;
	public static Block BlockGingerBreadStairs;
	public static Block BlockGingerBreadSlab;
	public static Block BlockNorthPoleRed;
	public static Block BlockNorthPoleWhite;
	public static Block Block0Bulb;
	public static Block BlockBulb_blue;
	public static Block BlockBulb_cyan;
	public static Block BlockBulb_green;
	public static Block BlockBulb_lightBlue;
	public static Block BlockBulb_lime;
	public static Block BlockBulb_magenta;
	public static Block BlockBulb_orange;
	public static Block BlockBulb_pink;
	public static Block BlockBulb_purple;
	public static Block BlockBulb_red;
	public static Block BlockBulb_white;
	public static Block BlockBulb_yellow;
	public static Block BlockFrozenIronIngot;
	public static Block BlockFrozenGoldIngot;
	public static Block BlockFrozenEmerald;
	public static Block BlockFrozenDiamond;
	public static Block BlockFrozenCoal;
	public static Block BlockFrozenLapis;
	public static Block BlockFrozenRedstone;
	public static Block BlockFrozenIronIngotOre;
	public static Block BlockFrozenGoldIngotOre;
	public static Block BlockFrozenEmeraldOre;
	public static Block BlockFrozenDiamondOre;
	public static Block BlockFrozenCoalOre;
	public static Block BlockFrozenLapisOre;
	public static Block BlockFrozenRedstoneOre;
	public static Block BlockFrozenStone;
	public static Block BlockFrozenCobbleStone;
	public static Block BlockPortalWinterWonderLand;
	public static Block BlockSnowman;
	public static Block BlockSnowmanCreepy;
	
	/**
	 * Load Blocks.
	 * @param meta 
	 */
	public static void loadBlocks() {
		
		BlockChristmasPresent = new BlockChristmasPresent(Material.cloth).setBlockName("BlockChristmasPresent").setHardness(0.1F).setStepSound(Block.soundTypeStone);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//BlockChristmasPresents_Red = new BlockChristmasPresents_Red(Material.cloth, 0, 0, 0, 0, 0, 0).setBlockName("BlockChristmasPresents_Red").setHardness(0.1F).setStepSound(Block.soundTypeStone);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockChristmasTree = new BlockChristmasTree(Material.cloth).setBlockName("BlockChristmasTree").setHardness(0.1F).setStepSound(Block.soundTypeStone)/*.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas)*/;
		BlockCandyCaneOre = new BlockCandyCaneOre(Material.rock).setBlockName("BlockCandyCaneOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockCandyCaneOre").setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//BlockCandyCaneIngot = new BlockCandyCaneIngot(Material.iron).setBlockName("BlockCandyCaneIngot").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockCandyCaneIngot").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockCandyCane = new BlockCandyCane(Material.rock).setBlockName("BlockCandyCane").setHardness(1.5F).setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockCandyCane").setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockLights = new BlockLights(Material.rock).setBlockName("BlockLights").setHardness(0F).setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockLights").setStepSound(Block.soundTypeStone);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockGingerBread  = new BlockGingerBread(Material.cake).setBlockName("BlockGingerBread").setHardness(1.5F).setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockGingerBread").setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrostedGlass  = new BlockFrostedGlass(Material.glass, false).setBlockName("BlockFrostedGlass").setHardness(0.1F).setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrostedGlass").setStepSound(Block.soundTypeGlass).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrostedGlassPane  = new BlockFrostedGlassPane(epicproportionsmod_christmas.MODID + ":BlockFrostedGlassPane_connected", epicproportionsmod_christmas.MODID + ":BlockFrostedGlassPane_disconnected", Material.glass, false).setBlockName("BlockFrostedGlassPane").setHardness(0.1F).setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrostedGlassPane").setStepSound(Block.soundTypeGlass).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//BlockGingerBreadDoor = new BlockGingerBreadDoor(Material.wood).setBlockName("BlockGingerBreadDoor").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockGingerBreadDoor").setHardness(2F).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		//BlockBulb = new BlockBulb(Material.wood).setBlockName("BlockBulb" + "_" + ItemBulb.field_150923_a).setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb" + "_" + ItemBulb.field_150923_a).setHardness(0F);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockGingerBreadCarpet = new BlockGingerBreadCarpet().setBlockName("BlockGingerBreadCarpet").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockGingerBreadCarpet");
		BlockGingerBreadStairs = new BlockModStairs(BlockGingerBread, 0).setBlockName("BlockGingerBreadStairs").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockGingerBread");//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//BlockGingerBreadSlab = new BlockGingerBreadSlab().setBlockName("BlockGingerBreadSlab").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockGingerBread");
		BlockNorthPoleRed = new BlockNorthPole(Material.iron, "red");
		BlockNorthPoleWhite = new BlockNorthPole(Material.iron, "white");
		BlockBulb_blue = new BlockBulb(0).setBlockName("BlockBulb_blue").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_blue").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_cyan = new BlockBulb(1).setBlockName("BlockBulb_cyan").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_cyan").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_green = new BlockBulb(2).setBlockName("BlockBulb_green").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_green").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_lightBlue = new BlockBulb(3).setBlockName("BlockBulb_lightBlue").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_lightBlue").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_lime = new BlockBulb(4).setBlockName("BlockBulb_lime").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_lime").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_magenta = new BlockBulb(5).setBlockName("BlockBulb_magenta").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_magenta").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_orange = new BlockBulb(6).setBlockName("BlockBulb_orange").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_orange").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_pink = new BlockBulb(7).setBlockName("BlockBulb_pink").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_blue").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_purple = new BlockBulb(8).setBlockName("BlockBulb_purple").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_purple").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_red = new BlockBulb(9).setBlockName("BlockBulb_red").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_red").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_white = new BlockBulb(10).setBlockName("BlockBulb_white").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_white").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockBulb_yellow = new BlockBulb(11).setBlockName("BlockBulb_yellow").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockBulb_yellow").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenIronIngot = new BlockFrozenIronIngot(Material.rock).setBlockName("BlockFrozenIronIngot").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenIronIngot").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenGoldIngot = new BlockFrozenGoldIngot(Material.rock).setBlockName("BlockFrozenGoldIngot").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenGoldIngot").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenEmerald = new BlockFrozenEmerald(Material.rock).setBlockName("BlockFrozenEmerald").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenEmerald").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenDiamond = new BlockFrozenDiamond(Material.rock).setBlockName("BlockFrozenDiamond").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenDiamond").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenCoal = new BlockFrozenCoal(Material.rock).setBlockName("BlockFrozenCoal").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenCoal").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenLapis = new BlockFrozenLapis(Material.rock).setBlockName("BlockFrozenLapis").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenLapis").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenRedstone = new BlockFrozenRedstone(Material.rock).setBlockName("BlockFrozenRedstone").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenRedstone").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenIronIngotOre = new BlockFrozenIronIngotOre(Material.rock).setBlockName("BlockFrozenIronIngotOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenIronIngotOre").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenGoldIngotOre = new BlockFrozenGoldIngotOre(Material.rock).setBlockName("BlockFrozenGoldIngotOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenGoldIngotOre").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenEmeraldOre = new BlockFrozenEmeraldOre(Material.rock).setBlockName("BlockFrozenEmeraldOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenEmeraldOre").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenDiamondOre = new BlockFrozenDiamondOre(Material.rock).setBlockName("BlockFrozenDiamondOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenDiamondOre").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenCoalOre = new BlockFrozenCoalOre(Material.rock).setBlockName("BlockFrozenCoalOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenCoalOre").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenLapisOre = new BlockFrozenLapisOre(Material.rock).setBlockName("BlockFrozenLapisOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenLapisOre").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenRedstoneOre = new BlockFrozenRedstoneOre(Material.rock).setBlockName("BlockFrozenRedstoneOre").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenRedstoneOre").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenStone = new BlockFrozenStone(Material.rock).setBlockName("BlockFrozenStone").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenStone").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrozenCobbleStone = new BlockFrozenCobbleStone(Material.rock).setBlockName("BlockFrozenCobbleStone").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockFrozenCobbleStone").setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockPortalWinterWonderLand = new BlockPortalWinterWonderLand("WinterWonderLand").setBlockName("BlockPortalWinterWonderLand").setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockPortalWinterWonderLand")/*.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas)*/;
		
		BlockSnowman = new BlockSnowman(Material.cloth).setBlockName("BlockSnowman").setHardness(0.1F).setStepSound(Block.soundTypeStone)/*.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas)*/;
		BlockSnowmanCreepy = new BlockSnowmanCreepy(Material.cloth).setBlockName("BlockSnowmanCreepy").setHardness(0.1F).setStepSound(Block.soundTypeStone)/*.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas)*/;
		
		registerBlocks();
	}
	
	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		GameRegistry.registerBlock(BlockChristmasPresent, "BlockChristmasPresent");
		//GameRegistry.registerBlock(BlockChristmasPresents_Red, "BlockChristmasPresents_Red");
		GameRegistry.registerBlock(BlockChristmasTree, "BlockChristmasTree");
		GameRegistry.registerBlock(BlockCandyCaneOre, "BlockCandyCaneOre");
		//GameRegistry.registerBlock(BlockCandyCaneIngot, "BlockCandyCaneIngot");
		GameRegistry.registerBlock(BlockCandyCane, "BlockCandyCane");
		GameRegistry.registerBlock(BlockLights, "BlockLights");
		GameRegistry.registerBlock(BlockGingerBread, "BlockGingerBread");
		GameRegistry.registerBlock(BlockFrostedGlass, "BlockFrostedGlass");
		GameRegistry.registerBlock(BlockFrostedGlassPane, "BlockFrostedGlassPane");
		//GameRegistry.registerBlock(BlockBulb, "BlockBulb");
		GameRegistry.registerBlock(BlockGingerBreadCarpet, "BlockGingerBreadCarpet");
		GameRegistry.registerBlock(BlockGingerBreadStairs, "BlockGingerBreadStairs");
		GameRegistry.registerBlock(BlockNorthPoleRed, "BlockNorthPoleRed");
		GameRegistry.registerBlock(BlockNorthPoleWhite, "BlockNorthPoleWhite");
		//GameRegistry.registerBlock(BlockGingerBreadSlab, "BlockGingerBreadSlab");
		GameRegistry.registerBlock(BlockBulb_blue, "BlockBulb_blue");
		GameRegistry.registerBlock(BlockBulb_cyan, "BlockBulb_cyan");
		GameRegistry.registerBlock(BlockBulb_green, "BlockBulb_green");
		GameRegistry.registerBlock(BlockBulb_lightBlue, "BlockBulb_lightBlue");
		GameRegistry.registerBlock(BlockBulb_lime, "BlockBulb_lime");
		GameRegistry.registerBlock(BlockBulb_magenta, "BlockBulb_magenta");
		GameRegistry.registerBlock(BlockBulb_orange, "BlockBulb_orange");
		GameRegistry.registerBlock(BlockBulb_pink, "BlockBulb_pink");
		GameRegistry.registerBlock(BlockBulb_purple, "BlockBulb_purple");
		GameRegistry.registerBlock(BlockBulb_red, "BlockBulb_red");
		GameRegistry.registerBlock(BlockBulb_white, "BlockBulb_white");
		GameRegistry.registerBlock(BlockBulb_yellow, "BlockBulb_yellow");
		GameRegistry.registerBlock(BlockFrozenIronIngot, "BlockFrozenIronIngot");
		GameRegistry.registerBlock(BlockFrozenGoldIngot, "BlockFrozenGoldIngot");
		GameRegistry.registerBlock(BlockFrozenEmerald, "BlockFrozenEmerald");
		GameRegistry.registerBlock(BlockFrozenDiamond, "BlockFrozenDiamond");
		GameRegistry.registerBlock(BlockFrozenCoal, "BlockFrozenCoal");
		GameRegistry.registerBlock(BlockFrozenLapis, "BlockFrozenLapis");
		GameRegistry.registerBlock(BlockFrozenRedstone, "BlockFrozenRedstone");
		GameRegistry.registerBlock(BlockFrozenIronIngotOre, "BlockFrozenIronIngotOre");
		GameRegistry.registerBlock(BlockFrozenGoldIngotOre, "BlockFrozenGoldIngotOre");
		GameRegistry.registerBlock(BlockFrozenEmeraldOre, "BlockFrozenEmeraldOre");
		GameRegistry.registerBlock(BlockFrozenDiamondOre, "BlockFrozenDiamondOre");
		GameRegistry.registerBlock(BlockFrozenCoalOre, "BlockFrozenCoalOre");
		GameRegistry.registerBlock(BlockFrozenLapisOre, "BlockFrozenLapisOre");
		GameRegistry.registerBlock(BlockFrozenRedstoneOre, "BlockFrozenRedstoneOre");
		GameRegistry.registerBlock(BlockFrozenStone, "BlockFrozenStone");
		GameRegistry.registerBlock(BlockFrozenCobbleStone, "BlockFrozenCobbleStone");
		GameRegistry.registerBlock(BlockPortalWinterWonderLand, "BlockPortalWinterWonderLand");
		
		GameRegistry.registerBlock(BlockSnowman, "BlockSnowman");
		GameRegistry.registerBlock(BlockSnowmanCreepy, "BlockSnowmanCreepy");
		
		//GameRegistry.registerBlock(BlockGingerBread = new BlockGingerBread(Material.cake), "BlockGingerBread");



	}
}
