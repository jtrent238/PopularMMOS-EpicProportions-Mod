package com.jtrent238.epicproportions.addons.christmas;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockBulb;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockCandyCane;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockCandyCaneIngot;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockCandyCaneOre;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockChristmasPresents_Red;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockChristmasTree;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrostedGlass;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockFrostedGlassPane;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBread;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBreadCarpet;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBreadDoor;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBreadStairs;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockGingerBread_Meta;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockLights;
import com.jtrent238.epicproportions.addons.christmas.items.ItemBulb;
import com.jtrent238.epicproportions.blocks.BlockModStairs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {

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
	
	
	/**
	 * Load Blocks.
	 * @param meta 
	 */
	public static void loadBlocks() {
		
		//BlockChristmasPresents_Red = new BlockChristmasPresents_Red(Material.cloth, 0, 0, 0, 0, 0, 0).setBlockName("BlockChristmasPresents_Red").setHardness(0.1F).setStepSound(Block.soundTypeStone);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockChristmasTree = new BlockChristmasTree(Material.cloth).setBlockName("BlockChristmasTree").setHardness(0.1F).setStepSound(Block.soundTypeStone);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockCandyCaneOre = new BlockCandyCaneOre(Material.rock).setBlockName("BlockCandyCaneOre").setBlockTextureName("epicproportionsmod_christmas:BlockCandyCaneOre").setHardness(1.5F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//BlockCandyCaneIngot = new BlockCandyCaneIngot(Material.iron).setBlockName("BlockCandyCaneIngot").setBlockTextureName("epicproportionsmod_christmas:BlockCandyCaneIngot").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockCandyCane = new BlockCandyCane(Material.rock).setBlockName("BlockCandyCane").setHardness(1.5F).setBlockTextureName("epicproportionsmod_christmas:BlockCandyCane").setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockLights = new BlockLights(Material.rock).setBlockName("BlockLights").setHardness(0F).setBlockTextureName("epicproportionsmod_christmas:BlockLights").setStepSound(Block.soundTypeStone);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockGingerBread  = new BlockGingerBread(Material.cake).setBlockName("BlockGingerBread").setHardness(1.5F).setBlockTextureName("epicproportionsmod_christmas:BlockGingerBread").setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrostedGlass  = new BlockFrostedGlass(Material.glass, false).setBlockName("BlockFrostedGlass").setHardness(0.1F).setBlockTextureName("epicproportionsmod_christmas:BlockFrostedGlass").setStepSound(Block.soundTypeGlass).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockFrostedGlassPane  = new BlockFrostedGlassPane("epicproportionsmod_christmas:BlockFrostedGlassPane_connected", "epicproportionsmod_christmas:BlockFrostedGlassPane_disconnected", Material.glass, false).setBlockName("BlockFrostedGlassPane").setHardness(0.1F).setBlockTextureName("epicproportionsmod_christmas:BlockFrostedGlassPane").setStepSound(Block.soundTypeGlass).setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//BlockGingerBreadDoor = new BlockGingerBreadDoor(Material.wood).setBlockName("BlockGingerBreadDoor").setBlockTextureName("epicproportionsmod_christmas:BlockGingerBreadDoor").setHardness(2F).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockBulb = new BlockBulb(Material.wood).setBlockName("BlockBulb" + "_" + ItemBulb.field_150923_a).setBlockTextureName("epicproportionsmod_christmas:BlockBulb" + "_" + ItemBulb.field_150923_a).setHardness(0F);//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		BlockGingerBreadCarpet = new BlockGingerBreadCarpet().setBlockName("BlockGingerBreadCarpet").setBlockTextureName("epicproportionsmod_christmas:BlockGingerBreadCarpet");
		BlockGingerBreadStairs = new BlockModStairs(BlockGingerBread, 0).setBlockName("BlockGingerBreadStairs").setBlockTextureName("epicproportionsmod_christmas:BlockGingerBread");//.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		//BlockGingerBreadSlab = new BlockGingerBreadSlab().setBlockName("BlockGingerBreadSlab").setBlockTextureName("epicproportionsmod_christmas:BlockGingerBread");
		registerBlocks();
	}
	
	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		//GameRegistry.registerBlock(BlockChristmasPresents_Red, "BlockChristmasPresents_Red");
		GameRegistry.registerBlock(BlockChristmasTree, "BlockChristmasTree");
		GameRegistry.registerBlock(BlockCandyCaneOre, "BlockCandyCaneOre");
		//GameRegistry.registerBlock(BlockCandyCaneIngot, "BlockCandyCaneIngot");
		GameRegistry.registerBlock(BlockCandyCane, "BlockCandyCane");
		GameRegistry.registerBlock(BlockLights, "BlockLights");
		GameRegistry.registerBlock(BlockGingerBread, "BlockGingerBread");
		GameRegistry.registerBlock(BlockFrostedGlass, "BlockFrostedGlass");
		GameRegistry.registerBlock(BlockFrostedGlassPane, "BlockFrostedGlassPane");
		GameRegistry.registerBlock(BlockBulb, "BlockBulb");
		GameRegistry.registerBlock(BlockGingerBreadCarpet, "BlockGingerBreadCarpet");
		GameRegistry.registerBlock(BlockGingerBreadStairs, "BlockGingerBreadStairs");
		//GameRegistry.registerBlock(BlockGingerBreadSlab, "BlockGingerBreadSlab");
		
		
		//GameRegistry.registerBlock(BlockGingerBread = new BlockGingerBread(Material.cake), "BlockGingerBread");



	}
}
