package com.jtrent238.epicproportions.addons.halloween;

import com.jtrent238.epicproportions.addons.halloween.blocks.blockCreepy;
import com.jtrent238.epicproportions.addons.halloween.blocks.blockHalloweenEssenceOre;
import com.jtrent238.epicproportions.addons.halloween.blocks.blockHalloweenIngot;
import com.jtrent238.epicproportions.addons.halloween.blocks.blockSpookyEssenceOre;
import com.jtrent238.epicproportions.addons.halloween.blocks.blockSpookyIngot;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockLoader {

	public static Block blockSpookyIngot;
	public static Block blockSpookyEssenceOre;
	public static Block blockHalloweenIngot;
	public static Block blockHalloweenEssenceOre;
	public static Block blockCreepy;
	
	
	
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		blockSpookyIngot = new blockSpookyIngot(MapColor.brownColor).setBlockName("blockSpookyIngot").setBlockTextureName("epicproportionsmod_halloween:blockSpookyIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
		blockSpookyEssenceOre = new blockSpookyEssenceOre(Material.ground).setBlockName("blockSpookyEssenceOre").setBlockTextureName("epicproportionsmod_halloween:blockSpookyEssenceOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
		blockHalloweenIngot = new blockHalloweenIngot(MapColor.brownColor).setBlockName("blockHalloweenIngot").setBlockTextureName("epicproportionsmod_halloween:blockHalloweenIngot").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
		blockHalloweenEssenceOre = new blockHalloweenEssenceOre(Material.ground).setBlockName("blockHalloweenEssenceOre").setBlockTextureName("epicproportionsmod_halloween:blockHalloweenEssenceOre").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
		blockCreepy = new blockCreepy(Material.ground).setBlockName("blockCreepy").setBlockTextureName("epicproportionsmod_halloween:blockCreepy").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
		
		
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		GameRegistry.registerBlock(blockSpookyIngot, "blockSpookyIngot");
		GameRegistry.registerBlock(blockSpookyEssenceOre, "blockSpookyEssenceOre");
		GameRegistry.registerBlock(blockHalloweenIngot, "blockHalloweenIngot");
		GameRegistry.registerBlock(blockHalloweenEssenceOre, "blockHalloweenEssenceOre");
		GameRegistry.registerBlock(blockCreepy, "blockCreepy");
		
	}
	
	
}
