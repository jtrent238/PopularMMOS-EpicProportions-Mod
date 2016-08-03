package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.blocks.blockBirthdayPresent;
import com.jtrent238.epicproportions.blocks.blockBombySpawner;
import com.jtrent238.epicproportions.blocks.blockFartBomb;
import com.jtrent238.epicproportions.blocks.blockJenChest;
import com.jtrent238.epicproportions.blocks.blockJenIngot;
import com.jtrent238.epicproportions.blocks.blockJenOre;
import com.jtrent238.epicproportions.blocks.blockModFlower;
import com.jtrent238.epicproportions.blocks.blockPatChest;
import com.jtrent238.epicproportions.blocks.blockPatIngot;
import com.jtrent238.epicproportions.blocks.blockPatOre;
import com.jtrent238.epicproportions.blocks.blockPatTNT;
import com.jtrent238.epicproportions.blocks.blockTrollTNT;
import com.jtrent238.epicproportions.items.itemgemofepicproportions;

import cpw.mods.fml.common.registry.GameRegistry;
import javafx.scene.paint.Color;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockLoader {

	public static Block blockFartBomb;
	public static Block blockPatIngot;
	public static Block blockJenIngot;
	public static Block blockPatOre;
	public static Block blockJenOre;
	public static Block blockPatTNT;
	public static Block blockBirthdayPresent;
	public static Block blockPatChest;
	public static Block blockJenChest;
	public static Block blockTrollTNT;
	public static Block blockFlowerForJen;
	public static Block blockFlowerRedHeart;
	public static Block blockFlowerPinkHeart;
	public static Block blockFlowerRainbow;
	public static Block blockFlowerLove;
	public static Block blockBombySpawner;

	public static final Block.SoundType soundTypeStone = new Block.SoundType("block_squish", 1.0F, 1.0F);
	
	//public static final BlockFlower jen_flower = (BlockFlower)Block.blockRegistry.getObject("jen_flower");
	//public static final BlockFlower jen_flower2 = (BlockFlower)Block.blockRegistry.getObject("jen_flower2");
	
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		blockFartBomb = new blockFartBomb().setBlockName("blockFartBomb").setBlockTextureName("epicproportionsmod:blockFartBomb").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatIngot = new blockPatIngot(MapColor.diamondColor).setBlockName("blockPatIngot").setBlockTextureName("epicproportionsmod:blockPatIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenIngot = new blockJenIngot(MapColor.pinkColor).setBlockName("blockJenIngot").setBlockTextureName("epicproportionsmod:blockJenIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatOre = new blockPatOre(Material.ground).setBlockName("blockPatOre").setBlockTextureName("epicproportionsmod:blockPatOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenOre = new blockJenOre(Material.ground).setBlockName("blockJenOre").setBlockTextureName("epicproportionsmod:blockJenOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatTNT = new blockPatTNT().setBlockName("blockPatTNT").setBlockTextureName("epicproportionsmod:blockPatTNT").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockBirthdayPresent = new blockBirthdayPresent(Material.ground).setBlockName("blockBirthdayPresent").setBlockTextureName("epicproportionsmod:blockBirthdayPresent").setHardness(0.5F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockPatChest = new blockPatChest(0).setBlockName("blockPatChest").setBlockTextureName("epicproportionsmod:blockPatChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenChest = new blockJenChest(0).setBlockName("blockJenChest").setBlockTextureName("epicproportionsmod:blockJenChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockTrollTNT = new blockTrollTNT().setBlockName("blockTrollTNT").setBlockTextureName("epicproportionsmod:blockTrollTNT").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockFlowerForJen = new blockModFlower(0).setBlockName("blockFlowerForJen").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);;
		blockFlowerRedHeart = new blockModFlower(1).setBlockName("blockFlowerRedHeart").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);;
		blockFlowerPinkHeart = new blockModFlower(2).setBlockName("blockFlowerPinkHeart").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockFlowerRainbow = new blockModFlower(3).setBlockName("blockFlowerRainbow").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockFlowerLove = new blockModFlower(4).setBlockName("blockFlowerLove").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockBombySpawner = new blockBombySpawner().setBlockName("blockBombySpawner").setBlockTextureName("epicproportionsmod:blockBombySpawner").setHardness(3F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		
		
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		GameRegistry.registerBlock(blockFartBomb, "blockFartBomb");
		GameRegistry.registerBlock(blockPatIngot, "blockPatIngot");
		GameRegistry.registerBlock(blockJenIngot, "blockJenIngot");
		GameRegistry.registerBlock(blockPatOre, "blockPatOre");
		GameRegistry.registerBlock(blockJenOre, "blockJenOre");
		GameRegistry.registerBlock(blockPatTNT, "blockPatTNT");
		GameRegistry.registerBlock(blockBirthdayPresent, "blockBirthdayPresent");
		GameRegistry.registerBlock(blockPatChest, "blockPatChest");
		GameRegistry.registerBlock(blockJenChest, "blockJenChest");
		GameRegistry.registerBlock(blockTrollTNT, "blockTrollTNT");
		GameRegistry.registerBlock(blockFlowerForJen, "blockFlowerForJen");
		GameRegistry.registerBlock(blockFlowerRedHeart, "blockFlowerRedHeart");
		GameRegistry.registerBlock(blockFlowerPinkHeart, "blockFlowerPinkHeart");
		GameRegistry.registerBlock(blockFlowerRainbow, "blockFlowerRainbow");
		GameRegistry.registerBlock(blockFlowerLove, "blockFlowerLove");
		GameRegistry.registerBlock(blockBombySpawner, "blockBombySpawner");
		
	}
	
	
}
