package com.jtrent238.epicproportions.blocks;

import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.World;
import net.minecraft.util.IIcon;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.Block;

import java.util.Random;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;

import java.util.List;

import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class BlockCustomPlant_grass {

	public BlockCustomPlant_grass() {
	}

	public static Block BlockJenGrass;
	public static Block BlockPatGrass;
	

	public Object instance;

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {

		GameRegistry.registerBlock(BlockJenGrass, "BlockJenGrass_Plant");
		GameRegistry.registerBlock(BlockPatGrass, "BlockPatGrass_Plant");
	}

	public void registerRenderers() {
	}

	public void load() {
	}

	static {

		BlockJenGrass = (Block) (new BlockCustomFlower()).setHardness(0.01F).setResistance(2.0F).setLightLevel(0.0F).setBlockTextureName("epicproportionsmod:BlockJenGrass").setBlockName("BlockJenGrass_Plant").setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		//Block.blockRegistry.addObject(180, "BlockJenGrass", BlockJenGrass);
		//GameRegistry.registerBlock(BlockJenGrass, "BlockJenGrass_Plant");
		
		BlockPatGrass = (Block) (new BlockCustomFlower()).setHardness(0.01F).setResistance(2.0F).setLightLevel(0.0F).setBlockTextureName("epicproportionsmod:BlockPatGrass").setBlockName("BlockPatGrass_Plant").setStepSound(Block.soundTypeGrass).setCreativeTab(EpicProportionsMod.EpicProportionsMod);
		//Block.blockRegistry.addObject(181, "BlockPatGrass", BlockPatGrass);
		//GameRegistry.registerBlock(BlockPatGrass, "BlockPatGrass_Plant");
	}

	public void generateSurface(World world, java.util.Random randomGenerator, int chunkX, int chunkZ) {
		for (int i = 0; i < 40; i++) {
			int l6 = chunkX + randomGenerator.nextInt(16) + 8;
			int i11 = randomGenerator.nextInt(128);
			int l14 = chunkZ + randomGenerator.nextInt(16) + 8;
			(new WorldGenFlowers(BlockCustomPlant_grass.BlockJenGrass)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockCustomPlant_grass.BlockPatGrass)).generate(world, randomGenerator, l6, i11, l14);
			
			(new WorldGenFlowers(BlockLoader.blockFlowerChocolate)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.blockFlowerForJen)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.blockFlowerLove)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.blockFlowerPinkHeart)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.blockFlowerRainbow)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.blockFlowerRedHeart)).generate(world, randomGenerator, l6, i11, l14);
			}
	}

	public static class BlockCustomFlower extends BlockFlower {
		IIcon la;

		public BlockCustomFlower() {
			super(0);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
			return this.la;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void registerBlockIcons(IIconRegister reg) {
			la = reg.registerIcon("epicproportionsmod:BlockJenGrass");
			la = reg.registerIcon("epicproportionsmod:BlockPatGrass");
		}

		@SideOnly(Side.CLIENT)
		@SuppressWarnings("unchecked")
		public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
			for (int i = 0; i < 1; ++i) {
				p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
			}
		}

		public int quantityDropped(Random par1Random) {
			return 1;
		}

		/*public Item getItemDropped(int par1, Random par2Random, int par3) {
			return Item.getItemFromBlock(BlockJenGrass);
		}*/
	}
}
