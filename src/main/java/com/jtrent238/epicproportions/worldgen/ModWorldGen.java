package com.jtrent238.epicproportions.worldgen;

import java.util.Random;

import com.jtrent238.epicproportions.BlockLoader;

import cpw.mods.fml.common.IWorldGenerator;
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

	private WorldGenerator gen_pat_ore; //Generates Pat Ore (used in Overworld)
	private WorldGenerator gen_jen_ore; //Generates Jen Ore (used in Overworld)

	public ModWorldGen() {
	    this.gen_pat_ore = new WorldGenMinable(BlockLoader.blockPatOre, 8);
	    this.gen_jen_ore = new WorldGenMinable(BlockLoader.blockJenOre, 8);
		
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
	
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.dimensionId) {
	    case 0: //Overworld
	    	this.runGenerator(this.gen_pat_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_jen_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	        break;
		case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}
	

}
