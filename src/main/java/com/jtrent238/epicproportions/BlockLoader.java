package com.jtrent238.epicproportions;


import com.jtrent238.epicproportions.blocks.BlockBirthdayPresent_Custom;
import com.jtrent238.epicproportions.blocks.BlockCustomPlant_grass;
import com.jtrent238.epicproportions.blocks.BlockEpicProportionsPortal;
import com.jtrent238.epicproportions.blocks.BlockFred2_0Spawner;
import com.jtrent238.epicproportions.blocks.BlockJenCraftingTable;
import com.jtrent238.epicproportions.blocks.BlockJenDirt;
import com.jtrent238.epicproportions.blocks.BlockJenDoor;
import com.jtrent238.epicproportions.blocks.BlockJenGrass;
import com.jtrent238.epicproportions.blocks.BlockJenGrassTall_Plant;
import com.jtrent238.epicproportions.blocks.plants.BlockJenGrass_Plant;
import com.jtrent238.epicproportions.blocks.BlockJenLamp;
import com.jtrent238.epicproportions.blocks.BlockJenLeaves;
import com.jtrent238.epicproportions.blocks.BlockJenLog;
import com.jtrent238.epicproportions.blocks.BlockJenPlanks;
import com.jtrent238.epicproportions.blocks.BlockJenRail;
import com.jtrent238.epicproportions.blocks.BlockJenStone;
import com.jtrent238.epicproportions.blocks.BlockModDoor;
import com.jtrent238.epicproportions.blocks.BlockModFire;
import com.jtrent238.epicproportions.blocks.BlockModStem;
import com.jtrent238.epicproportions.blocks.BlockNuke;
import com.jtrent238.epicproportions.blocks.BlockOfEpicProportions;
import com.jtrent238.epicproportions.blocks.BlockPatCraftingTable;
import com.jtrent238.epicproportions.blocks.BlockPatDirt;
import com.jtrent238.epicproportions.blocks.BlockPatDoor;
import com.jtrent238.epicproportions.blocks.BlockPatGrass;
import com.jtrent238.epicproportions.blocks.BlockPatGrassTall_Plant;
import com.jtrent238.epicproportions.blocks.plants.BlockPatGrass_Plant;
import com.jtrent238.epicproportions.blocks.BlockPatLamp;
import com.jtrent238.epicproportions.blocks.BlockPatLeaves;
import com.jtrent238.epicproportions.blocks.BlockPatLog;
import com.jtrent238.epicproportions.blocks.BlockPatPlanks;
import com.jtrent238.epicproportions.blocks.BlockPatRail;
import com.jtrent238.epicproportions.blocks.BlockPatStone;
import com.jtrent238.epicproportions.blocks.BlockPumpkinJen;
import com.jtrent238.epicproportions.blocks.BlockPumpkinPat;
import com.jtrent238.epicproportions.blocks.BlockStatue;
import com.jtrent238.epicproportions.blocks.blockBirthdayPresent;
import com.jtrent238.epicproportions.blocks.blockBirthdayPresent_Bad;
import com.jtrent238.epicproportions.blocks.blockBirthdayPresent_Green;
import com.jtrent238.epicproportions.blocks.blockBombySpawner;
import com.jtrent238.epicproportions.blocks.blockFartBomb;
import com.jtrent238.epicproportions.blocks.blockJenChest;
import com.jtrent238.epicproportions.blocks.blockJenIngot;
import com.jtrent238.epicproportions.blocks.blockJenOre;
import com.jtrent238.epicproportions.blocks.blockJenTNT;
import com.jtrent238.epicproportions.blocks.blockModFlower;
import com.jtrent238.epicproportions.blocks.blockPatChest;
import com.jtrent238.epicproportions.blocks.blockPatIngot;
import com.jtrent238.epicproportions.blocks.blockPatOre;
import com.jtrent238.epicproportions.blocks.blockPatTNT;
import com.jtrent238.epicproportions.blocks.blockTrollTNT;
import com.jtrent238.epicproportions.blocks.cakes.BlockJenCake;
import com.jtrent238.epicproportions.blocks.cakes.BlockPatCake;
import com.jtrent238.epicproportions.blocks.liquid.blockMoltenPat;
import com.jtrent238.epicproportions.blocks.liquid.blockMoltenJen;
import com.jtrent238.epicproportions.blocks.statues.BlockCaptianCookieStatue;
import com.jtrent238.epicproportions.blocks.statues.BlockJenStatue;
import com.jtrent238.epicproportions.blocks.statues.BlockPatStatue;
import com.jtrent238.epicproportions.blocks.statues.BlockSparkyStatue;
import com.jtrent238.epicproportions.items.itemgemofepicproportions;

import cpw.mods.fml.common.registry.GameRegistry;
//import javafx.scene.paint.Color;
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
	public static Block blockBirthdayPresent_Green;
	public static Block BlockBirthdayPresent_Custom;
	public static Block blockBirthdayPresent_Bad;
	public static Block blockPatChest;
	public static Block blockJenChest;
	public static Block blockTrollTNT;
	public static Block blockFlowerForJen;
	public static Block blockFlowerRedHeart;
	public static Block blockFlowerPinkHeart;
	public static Block blockFlowerRainbow;
	public static Block blockFlowerLove;
	public static Block blockBombySpawner;
	public static Block BlockPatDoor;
	public static Block BlockJenDoor;
	public static Block blockFlowerChocolate;
	public static Block BlockFred2_0Spawner;
	public static Block BlockNuke;
	public static Block BlockStatue;
	public static Block BlockPatStatue;
	public static Block BlockJenStatue;
	public static Block BlockCaptianCookieStatue;
	public static Block BlockSparkyStatue;
	public static Block BlockPumpkinPat;
	public static Block BlockPumpkinPat_lit;
	public static Block BlockPumpkinJen;
	public static Block BlockPumpkinJen_lit;
	public static Block BlockModStem;
	public static Block BlockPatCake;
	public static Block BlockJenCake;
	public static Block BlockPatGrass;
	public static Block BlockPatDirt;
	public static Block BlockJenGrass;
	public static Block BlockJenDirt;
	public static Block BlockEpicProportionsPortal;
	public static Block blockJenTNT;
	public static Block BlockOfEpicProportions;
	public static Block BlockPatLog;
	public static Block BlockPatPlanks;
	public static Block BlockPatLeaves;
	public static Block BlockJenLog;
	public static Block BlockJenPlanks;
	public static Block BlockJenLeaves;
	public static Block blockMoltenPat;
	public static Block blockMoltenJen;
	public static Block BlockJenGrass_Plant;
	public static Block BlockPatGrass_Plant;
	public static Block BlockJenGrassTall_Plant;
	public static Block BlockPatGrassTall_Plant;
	public static Block BlockPatCraftingTable;
	public static Block BlockJenCraftingTable;
	public static Block BlockPatRail;
	public static Block BlockJenRail;
	public static Block BlockTestTrophy;
	public static Block BlockPatLamp;
	public static Block BlockJenLamp;
	public static Block BlockPatLamp_lit;
	public static Block BlockJenLamp_lit;
	public static Block BlockPatStone;
	public static Block BlockJenStone;
	public static Block BlockModFire;
	public static Object lightPortal;
	
	
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
		blockBirthdayPresent_Green = new blockBirthdayPresent_Green(Material.ground).setBlockName("blockBirthdayPresent_Green").setBlockTextureName("epicproportionsmod:blockBirthdayPresent_Green").setHardness(0.5F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		//BlockBirthdayPresent_Custom = new BlockBirthdayPresent_Custom(Material.ground).setBlockName(BlockBirthdayPresent_Custom.getCustomname).setBlockTextureName("epicproportionsmod:" + BlockBirthdayPresent_Custom.getCustomName).setHardness(0.5F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockBirthdayPresent_Bad = new blockBirthdayPresent_Bad(Material.ground).setBlockName("blockBirthdayPresent_Bad").setBlockTextureName("epicproportionsmod:blockBirthdayPresent").setHardness(0.5F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockPatChest = new blockPatChest(0).setBlockName("blockPatChest").setBlockTextureName("epicproportionsmod:blockPatChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockJenChest = new blockJenChest(0).setBlockName("blockJenChest").setBlockTextureName("epicproportionsmod:blockJenChest").setHardness(0.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockTrollTNT = new blockTrollTNT().setBlockName("blockTrollTNT").setBlockTextureName("epicproportionsmod:blockTrollTNT").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		blockFlowerForJen = new blockModFlower(0).setBlockName("blockFlowerForJen").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);;
		blockFlowerRedHeart = new blockModFlower(1).setBlockName("blockFlowerRedHeart").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);;
		blockFlowerPinkHeart = new blockModFlower(2).setBlockName("blockFlowerPinkHeart").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockFlowerRainbow = new blockModFlower(3).setBlockName("blockFlowerRainbow").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockFlowerLove = new blockModFlower(4).setBlockName("blockFlowerLove").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		blockBombySpawner = new blockBombySpawner().setBlockName("blockBombySpawner").setBlockTextureName("epicproportionsmod:blockBombySpawner").setHardness(3F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockJenDoor = new BlockJenDoor(Material.iron).setBlockName("BlockJenDoor")/*/.setBlockTextureName("epicproportionsmod:BlockJenDoor")/*/.setHardness(2F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPatDoor = new BlockPatDoor(Material.iron).setBlockName("BlockPatDoor")/*/.setBlockTextureName("epicproportionsmod:BlockPatDoor")/*/.setHardness(2F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockFlowerChocolate = new blockModFlower(5).setBlockName("blockFlowerChocolate").setBlockTextureName("epicproportionsmod:" + blockModFlower.field_149860_M);
		BlockFred2_0Spawner = new BlockFred2_0Spawner().setBlockName("BlockFred2_0Spawner").setBlockTextureName("epicproportionsmod:BlockFred2_0Spawner").setHardness(3F)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockNuke = new BlockNuke().setBlockName("BlockNuke").setBlockTextureName("epicproportionsmod:BlockNuke").setHardness(0F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockStatue = new BlockStatue(Material.rock).setBlockName("BlockStatue").setBlockTextureName("epicproportionsmod:BlockStatue").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPatStatue = new BlockPatStatue(Material.rock).setBlockName("BlockPatStatue").setBlockTextureName("epicproportionsmod:EntityPat").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockJenStatue = new BlockJenStatue(Material.rock).setBlockName("BlockJenStatue").setBlockTextureName("epicproportionsmod:EntityJen").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockCaptianCookieStatue = new BlockCaptianCookieStatue(Material.rock).setBlockName("BlockCaptianCookieStatue").setBlockTextureName("epicproportionsmod:EntityCaptianCookieStatue").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockSparkyStatue = new BlockSparkyStatue(Material.rock).setBlockName("BlockSparkyStatue").setBlockTextureName("epicproportionsmod:BlockSparkyStatue").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinPat = new BlockPumpkinPat(false).setBlockName("BlockPumpkinPat").setBlockTextureName("epicproportionsmod:BlockPumpkinPat").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinPat_lit = new BlockPumpkinPat(true).setBlockName("BlockPumpkinPat_lit").setBlockTextureName("epicproportionsmod:BlockPumpkinPat").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinJen = new BlockPumpkinJen(false).setBlockName("BlockPumpkinJen").setBlockTextureName("epicproportionsmod:BlockPumpkinJen").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockPumpkinJen_lit = new BlockPumpkinJen(true).setBlockName("BlockPumpkinJen_lit").setBlockTextureName("epicproportionsmod:BlockPumpkinJen").setHardness(1F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		BlockModStem = new BlockModStem(BlockPumpkinPat);
		BlockModStem = new BlockModStem(BlockPumpkinJen);
		BlockPatCake = new BlockPatCake().setBlockName("BlockPatCake").setBlockTextureName("epicproportionsmod:BlockPatCake").setHardness(1F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenCake = new BlockJenCake().setBlockName("BlockJenCake").setBlockTextureName("epicproportionsmod:BlockJenCake").setHardness(1F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatGrass = new BlockPatGrass().setBlockName("BlockPatGrass").setBlockTextureName("epicproportionsmod:BlockPatGrass").setHardness(1.6F).setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatDirt = new BlockPatDirt().setBlockName("BlockPatDirt").setBlockTextureName("epicproportionsmod:BlockPatDirt").setHardness(1.5F).setStepSound(Block.soundTypeGravel).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenGrass = new BlockJenGrass().setBlockName("BlockJenGrass").setBlockTextureName("epicproportionsmod:BlockJenGrass").setHardness(1.6F).setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenDirt = new BlockJenDirt().setBlockName("BlockJenDirt").setBlockTextureName("epicproportionsmod:BlockJenDirt").setHardness(1.5F).setStepSound(Block.soundTypeGravel).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockEpicProportionsPortal = new BlockEpicProportionsPortal("BlockEpicProportionsPortal").setBlockName("BlockEpicProportionsPortal").setBlockTextureName("epicproportionsmod:BlockEpicProportionsPortal").setHardness(0F).setStepSound(Block.soundTypeStone)/*/.setCreativeTab(EpicProportionsMod.EpicProportionsMod)/*/;
		blockJenTNT = new blockJenTNT().setBlockName("blockJenTNT").setBlockTextureName("epicproportionsmod:blockJenTNT").setHardness(0F).setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockOfEpicProportions = new BlockOfEpicProportions(Material.iron).setBlockName("BlockOfEpicProportions").setBlockTextureName("epicproportionsmod:BlockOfEpicProportions").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatLog = new BlockPatLog().setBlockName("BlockPatLog").setBlockTextureName("epicproportionsmod:BlockPatLog").setHardness(2.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatPlanks = new BlockPatPlanks(Material.wood).setBlockName("BlockPatPlanks").setBlockTextureName("epicproportionsmod:BlockPatPlanks").setHardness(2.5F).setStepSound(Block.soundTypeWood).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatLeaves = new BlockPatLeaves().setBlockName("BlockPatLeaves").setBlockTextureName("epicproportionsmod:BlockPatLeaves").setHardness(1F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenLog = new BlockJenLog().setBlockName("BlockJenLog").setBlockTextureName("epicproportionsmod:BlockJenLog").setHardness(2.5F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenPlanks = new BlockJenPlanks(Material.wood).setBlockName("BlockJenPlanks").setBlockTextureName("epicproportionsmod:BlockJenPlanks").setHardness(2.5F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenLeaves = new BlockJenLeaves().setBlockName("BlockJenLeaves").setBlockTextureName("epicproportionsmod:BlockJenLeaves").setHardness(1F).setStepSound(Block.soundTypeStone).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenGrass_Plant = new BlockJenGrass_Plant().setBlockName("BlockJenGrass_Plant").setBlockTextureName("epicproportionsmod:BlockJenGrass_Plant").setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatGrass_Plant = new BlockPatGrass_Plant().setBlockName("BlockPatGrass_Plant").setBlockTextureName("epicproportionsmod:BlockPatGrass_Plant").setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		//BlockJenGrassTall_Plant = new BlockJenGrassTall_Plant().setBlockName("BlockJenGrassTall_Plant").setBlockTextureName("epicproportionsmod:BlockJenGrassTall_Plant").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		//BlockPatGrassTall_Plant = new BlockPatGrassTall_Plant().setBlockName("BlockPatGrassTall_Plant").setBlockTextureName("epicproportionsmod:BlockPatGrassTall_Plant").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		//BlockPatCraftingTable = new BlockPatCraftingTable().setBlockName("BlockPatCraftingTable").setBlockTextureName("epicproportionsmod:BlockPatCraftingTable").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		//BlockJenCraftingTable = new BlockJenCraftingTable().setBlockName("BlockJenCraftingTable").setBlockTextureName("epicproportionsmod:BlockJenCraftingTable").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		//BlockPatRail = new BlockPatRail().setBlockName("BlockPatRail").setBlockTextureName("epicproportionsmod:BlockPatRail").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		//BlockJenRail = new BlockJenRail().setBlockName("BlockJenRail").setBlockTextureName("epicproportionsmod:BlockJenRail").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		BlockPatLamp = new BlockPatLamp(false).setBlockName("BlockPatLamp").setBlockTextureName("epicproportionsmod:BlockPatLamp").setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockPatLamp_lit = new BlockPatLamp(true).setBlockName("BlockPatLamp").setBlockTextureName("epicproportionsmod:BlockPatLamp").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		BlockJenLamp = new BlockJenLamp(false).setBlockName("BlockJenLamp").setBlockTextureName("epicproportionsmod:BlockJenLamp").setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenLamp_lit = new BlockJenLamp(true).setBlockName("BlockJenLamp").setBlockTextureName("epicproportionsmod:BlockJenLamp").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;
		BlockPatStone = new BlockPatStone(Material.ground).setBlockName("BlockPatStone").setBlockTextureName("epicproportionsmod:BlockPatStone").setStepSound(Block.soundTypeMetal).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockJenStone = new BlockJenStone(Material.ground).setBlockName("BlockJenStone").setBlockTextureName("epicproportionsmod:BlockJenStone").setStepSound(Block.soundTypeMetal).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		BlockModFire = new BlockModFire("lightFire").setBlockName("BlockModFire").setBlockTextureName("epicproportionsmod:BlockModFire").setStepSound(Block.soundTypeGrass)/*.setCreativeTab(EpicProportionsMod.EpicProportionsMod)*/;


		
		blockMoltenPat = new blockMoltenPat(Material.lava).setBlockName("blockMoltenPat").setBlockTextureName("epicproportionsmod:blockMoltenPat");
		blockMoltenJen = new blockMoltenJen(Material.lava).setBlockName("blockMoltenJen").setBlockTextureName("epicproportionsmod:blockMoltenJen");


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
		GameRegistry.registerBlock(blockBirthdayPresent_Bad, "blockBirthdayPresent_Bad");
		//GameRegistry.registerBlock(blockBirthdayPresent_Green, "blockBirthdayPresent_Green");
		GameRegistry.registerBlock(blockPatChest, "blockPatChest");
		GameRegistry.registerBlock(blockJenChest, "blockJenChest");
		GameRegistry.registerBlock(blockTrollTNT, "blockTrollTNT");
		GameRegistry.registerBlock(blockFlowerForJen, "blockFlowerForJen");
		GameRegistry.registerBlock(blockFlowerRedHeart, "blockFlowerRedHeart");
		GameRegistry.registerBlock(blockFlowerPinkHeart, "blockFlowerPinkHeart");
		GameRegistry.registerBlock(blockFlowerRainbow, "blockFlowerRainbow");
		GameRegistry.registerBlock(blockFlowerLove, "blockFlowerLove");
		GameRegistry.registerBlock(blockBombySpawner, "blockBombySpawner");
		GameRegistry.registerBlock(BlockPatDoor, "BlockPatDoor");
		GameRegistry.registerBlock(BlockJenDoor, "BlockJenDoor");
		GameRegistry.registerBlock(blockFlowerChocolate, "blockFlowerChocolate");
		GameRegistry.registerBlock(BlockFred2_0Spawner, "BlockFred2_0Spawner");
		GameRegistry.registerBlock(BlockNuke, "BlockNuke");
		//GameRegistry.registerBlock(BlockStatue, "BlockStatue");
		GameRegistry.registerBlock(BlockPatStatue, "BlockPatStatue");
		GameRegistry.registerBlock(BlockJenStatue, "BlockJenStatue");
		GameRegistry.registerBlock(BlockCaptianCookieStatue, "BlockCaptianCookieStatue");
		GameRegistry.registerBlock(BlockSparkyStatue, "BlockSparkyStatue");
		GameRegistry.registerBlock(BlockPumpkinPat, "BlockPumpkinPat");
		GameRegistry.registerBlock(BlockPumpkinPat_lit, "BlockPumpkinPat_lit");
		GameRegistry.registerBlock(BlockPumpkinJen, "BlockPumpkinJen");
		GameRegistry.registerBlock(BlockPumpkinJen_lit, "BlockPumpkinJen_lit");
		GameRegistry.registerBlock(BlockModStem, "BlockModStem");
		GameRegistry.registerBlock(BlockPatCake, "BlockPatCake");
		GameRegistry.registerBlock(BlockJenCake, "BlockJenCake");
		GameRegistry.registerBlock(BlockPatGrass, "BlockPatGrass");
		GameRegistry.registerBlock(BlockPatDirt, "BlockPatDirt");
		GameRegistry.registerBlock(BlockJenGrass, "BlockJenGrass");
		GameRegistry.registerBlock(BlockJenDirt, "BlockJenDirt");
		GameRegistry.registerBlock(BlockEpicProportionsPortal, "BlockEpicProportionsPortal");
		GameRegistry.registerBlock(blockJenTNT, "blockJenTNT");
		GameRegistry.registerBlock(BlockOfEpicProportions, "BlockOfEpicProportions");
		GameRegistry.registerBlock(BlockPatLog, "BlockPatLog");
		GameRegistry.registerBlock(BlockPatPlanks, "BlockPatPlanks");
		GameRegistry.registerBlock(BlockPatLeaves, "BlockPatLeaves");
		GameRegistry.registerBlock(BlockJenLog, "BlockJenLog");
		GameRegistry.registerBlock(BlockJenPlanks, "BlockJenPlanks");
		GameRegistry.registerBlock(BlockJenLeaves, "BlockJenLeaves");
		GameRegistry.registerBlock(BlockJenGrass_Plant, "BlockJenGrass_Plant");
		GameRegistry.registerBlock(BlockPatGrass_Plant, "BlockPatGrass_Plant");
		//GameRegistry.registerBlock(BlockJenGrassTall_Plant, "BlockJenGrassTall_Plant");
		//GameRegistry.registerBlock(BlockPatGrassTall_Plant, "BlockPatGrassTall_Plant");
		//GameRegistry.registerBlock(BlockPatCraftingTable, "BlockPatCraftingTable");
		//GameRegistry.registerBlock(BlockJenCraftingTable, "BlockJenCraftingTable");
		//GameRegistry.registerBlock(BlockPatRail, "BlockPatRail");
		//GameRegistry.registerBlock(BlockJenRail, "BlockJenRail");
		GameRegistry.registerBlock(BlockPatLamp, "BlockPatLamp");
		GameRegistry.registerBlock(BlockJenLamp, "BlockJenLamp");
		GameRegistry.registerBlock(BlockPatLamp_lit, "BlockPatLamp_lit");
		GameRegistry.registerBlock(BlockJenLamp_lit, "BlockJenLamp_lit");
		GameRegistry.registerBlock(BlockPatStone, "BlockPatStone");
		GameRegistry.registerBlock(BlockJenStone, "BlockJenStone");
		//GameRegistry.registerBlock(BlockModFire, "BlockModFire");
		

		
		
		GameRegistry.registerBlock(blockMoltenPat, "blockMoltenPat");
		GameRegistry.registerBlock(blockMoltenJen, "blockMoltenJen");

		

		if(EpicProportionsMod.BIRTHDAYPRESENT_CUSTOM == true){
			GameRegistry.registerBlock(BlockBirthdayPresent_Custom, "BlockBirthdayPresent_Custom");
		}
		
	}
	
	
}
