package com.jtrent238.epicproportions.addons.halloween;

import com.jtrent238.epicproportions.addons.halloween.blocks.blockSpookyEssenceOre;
import com.jtrent238.epicproportions.addons.halloween.blocks.blockSpookyIngot;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockLoader {

	public static Block blockSpookyIngot;
	public static Block blockSpookyEssenceOre;

	
	
	
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		blockSpookyIngot = new blockSpookyIngot(MapColor.brownColor).setBlockName("blockSpookyIngot").setBlockTextureName("epicproportionsmod_halloween:blockSpookyIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
		blockSpookyEssenceOre = new blockSpookyEssenceOre(Material.ground).setBlockName("blockSpookyEssenceOre").setBlockTextureName("epicproportionsmod_halloween:blockSpookyEssenceOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
		
		
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		GameRegistry.registerBlock(blockSpookyIngot, "blockSpookyIngot");
		GameRegistry.registerBlock(blockSpookyEssenceOre, "blockSpookyEssenceOre");
		
	}
	
	
}
