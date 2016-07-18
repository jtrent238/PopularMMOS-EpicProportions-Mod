package com.jtrent238.epicproportions;

import com.jtrent238.epicproportions.blocks.blockBirthdayPresent;
import com.jtrent238.epicproportions.blocks.blockFartBomb;
import com.jtrent238.epicproportions.blocks.blockJenChest;
import com.jtrent238.epicproportions.blocks.blockJenIngot;
import com.jtrent238.epicproportions.blocks.blockJenOre;
import com.jtrent238.epicproportions.blocks.blockPatChest;
import com.jtrent238.epicproportions.blocks.blockPatIngot;
import com.jtrent238.epicproportions.blocks.blockPatOre;
import com.jtrent238.epicproportions.blocks.blockPatTNT;
import com.jtrent238.epicproportions.items.itemgemofepicproportions;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

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
	
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		blockFartBomb = new blockFartBomb().setBlockName("blockFartBomb").setBlockTextureName("epicproportionsmod:blockFartBomb").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatIngot = new blockPatIngot(Material.iron).setBlockName("blockPatIngot").setBlockTextureName("epicproportionsmod:blockPatIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenIngot = new blockJenIngot(Material.iron).setBlockName("blockJenIngot").setBlockTextureName("epicproportionsmod:blockJenIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatOre = new blockPatOre(Material.ground).setBlockName("blockPatOre").setBlockTextureName("epicproportionsmod:blockPatOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenOre = new blockJenOre(Material.ground).setBlockName("blockJenOre").setBlockTextureName("epicproportionsmod:blockJenOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockPatTNT = new blockPatTNT().setBlockName("blockPatTNT").setBlockTextureName("epicproportionsmod:blockPatTNT").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockBirthdayPresent = new blockBirthdayPresent(Material.ground).setBlockName("blockBirthdayPresent").setBlockTextureName("epicproportionsmod:blockBirthdayPresent").setHardness(0.5F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockPatChest = new blockPatChest(0).setBlockName("blockPatChest").setBlockTextureName("epicproportionsmod:blockPatChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenChest = new blockJenChest(0).setBlockName("blockJenChest").setBlockTextureName("epicproportionsmod:blockJenChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		
		
		
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
			
	}
}
