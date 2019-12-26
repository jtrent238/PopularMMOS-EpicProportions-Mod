package com.jtrent238.epicproportions.addons.christmas.worldgen;

import java.util.Random;
import java.util.logging.Level;

import com.jtrent238.epicproportions.addons.christmas.BlockLoader;
import com.jtrent238.epicproportions.addons.christmas.world.DimensionIDs;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenCactus;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraft.world.gen.feature.WorldGenSand;
import net.minecraft.world.gen.feature.WorldGenWaterlily;
import net.minecraft.world.gen.feature.WorldGenerator;


public class ModWorldGen implements IWorldGenerator {
	
	private int winterwonderland = DimensionIDs.DIMWINTERWONDERLAND;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
	    
	    case 2: //winter wonderland
	    	this.runGenerator(this.gen_frozen_coal_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_frozen_iron_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_frozen_gold_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_frozen_redstone_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_frozen_diamond_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_frozen_emerald_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_frozen_lapis_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}
	private WorldGenerator gen_frozen_coal_ore; //Generates Frozen Coal Ore (used in Winter Wonderland)
	private WorldGenerator gen_frozen_iron_ore; //Generates Frozen Iron Ore (used in Winder Wonderland)
	private WorldGenerator gen_frozen_gold_ore; //Generates Frozen Gold Ore (used in Winder Wonderland)
	private WorldGenerator gen_frozen_redstone_ore; //Generates Frozen Redstone Ore (used in Winder Wonderland)
	private WorldGenerator gen_frozen_diamond_ore; //Generates Frozen Diamond Ore (used in Winder Wonderland)
	private WorldGenerator gen_frozen_emerald_ore; //Generates Frozen Emerald Ore (used in Winder Wonderland)
	private WorldGenerator gen_frozen_lapis_ore; //Generates Frozen Lapis Ore (used in Winder Wonderland)

	public ModWorldGen() {
	    this.gen_frozen_coal_ore = new WorldGenMinable(BlockLoader.BlockFrozenCoalOre, 8);
	    this.gen_frozen_iron_ore = new WorldGenMinable(BlockLoader.BlockFrozenIronIngotOre, 8);
	    this.gen_frozen_gold_ore = new WorldGenMinable(BlockLoader.BlockFrozenGoldIngotOre, 8);
	    this.gen_frozen_redstone_ore = new WorldGenMinable(BlockLoader.BlockFrozenRedstoneOre, 8);
	    this.gen_frozen_diamond_ore = new WorldGenMinable(BlockLoader.BlockFrozenDiamondOre, 8);
	    this.gen_frozen_emerald_ore = new WorldGenMinable(BlockLoader.BlockFrozenEmeraldOre, 8);
	    this.gen_frozen_lapis_ore = new WorldGenMinable(BlockLoader.BlockFrozenLapisOre, 8);
	    
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);
	    }
	}

	
	
}