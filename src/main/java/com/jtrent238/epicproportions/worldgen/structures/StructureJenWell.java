package com.jtrent238.epicproportions.worldgen.structures;

import java.util.Random;

import com.jtrent238.epicproportions.BlockLoader;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class StructureJenWell {
	{ 
		
	}
		public void load(){
	}


	public void generate(World world, Random random, int i2, int k2){

	int i = i2 + random.nextInt(15);
	int k = k2 + random.nextInt(15);

	int j = world.getHeightValue(i,k)-1;
	/*/if((random.nextInt(1000000)+1)<=100000){/*/
	if((random.nextInt(100)+1)<=1000000000){
		
	boolean place = true;

	for (int y = 0; y<15; y++)
	for (int z = 0; z<12; z++)
	for (int x = 0; x<1; x++)


	if(world.getBlock(i+x,j+y+1,k+z)!=Blocks.air)
	place = true;


	if(place){

		world.setBlock(i+0, j+0, k+0, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+1, j+0, k+0, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+2, j+0, k+0, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+0, j+0, k+1, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+1, j+0, k+1, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+2, j+0, k+1, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+0, j+0, k+2, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+1, j+0, k+2, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+2, j+0, k+2, BlockLoader.blockJenIngot, 0, 2);
		world.setBlock(i+0, j+1, k+0, Block.getBlockById(4), 0, 2);
		world.setBlock(i+1, j+1, k+0, Block.getBlockById(4), 0, 2);
		world.setBlock(i+2, j+1, k+0, Block.getBlockById(4), 0, 2);
		world.setBlock(i+0, j+1, k+1, Block.getBlockById(4), 0, 2);
		world.setBlock(i+1, j+1, k+1, Block.getBlockById(138), 0, 2);
		world.setBlock(i+2, j+1, k+1, Block.getBlockById(4), 0, 2);
		world.setBlock(i+0, j+1, k+2, Block.getBlockById(4), 0, 2);
		world.setBlock(i+1, j+1, k+2, Block.getBlockById(4), 0, 2);
		world.setBlock(i+2, j+1, k+2, Block.getBlockById(4), 0, 2);
		world.setBlock(i+0, j+2, k+0, Block.getBlockById(4), 0, 2);
		world.setBlock(i+1, j+2, k+0, Block.getBlockById(4), 0, 2);
		world.setBlock(i+2, j+2, k+0, Block.getBlockById(4), 0, 2);
		world.setBlock(i+0, j+2, k+1, Block.getBlockById(4), 0, 2);
		world.setBlock(i+1, j+2, k+1, Block.getBlockById(0), 0, 2);
		world.setBlock(i+2, j+2, k+1, Block.getBlockById(4), 0, 2);
		world.setBlock(i+0, j+2, k+2, Block.getBlockById(4), 0, 2);
		world.setBlock(i+1, j+2, k+2, Block.getBlockById(4), 0, 2);
		world.setBlock(i+2, j+2, k+2, Block.getBlockById(4), 0, 2);
		world.setBlock(i+0, j+3, k+0, Block.getBlockById(85), 0, 2);
		world.setBlock(i+1, j+3, k+0, Block.getBlockById(0), 0, 2);
		world.setBlock(i+2, j+3, k+0, Block.getBlockById(85), 0, 2);
		world.setBlock(i+0, j+3, k+1, Block.getBlockById(0), 0, 2);
		world.setBlock(i+1, j+3, k+1, Block.getBlockById(0), 0, 2);
		world.setBlock(i+2, j+3, k+1, Block.getBlockById(0), 0, 2);
		world.setBlock(i+0, j+3, k+2, Block.getBlockById(85), 0, 2);
		world.setBlock(i+1, j+3, k+2, Block.getBlockById(0), 0, 2);
		world.setBlock(i+2, j+3, k+2, Block.getBlockById(85), 0, 2);
		world.setBlock(i+0, j+4, k+0, Block.getBlockById(85), 0, 2);
		world.setBlock(i+1, j+4, k+0, Block.getBlockById(0), 0, 2);
		world.setBlock(i+2, j+4, k+0, Block.getBlockById(85), 0, 2);
		world.setBlock(i+0, j+4, k+1, Block.getBlockById(0), 0, 2);
		world.setBlock(i+1, j+4, k+1, Block.getBlockById(0), 0, 2);
		world.setBlock(i+2, j+4, k+1, Block.getBlockById(0), 0, 2);
		world.setBlock(i+0, j+4, k+2, Block.getBlockById(85), 0, 2);
		world.setBlock(i+1, j+4, k+2, Block.getBlockById(0), 0, 2);
		world.setBlock(i+2, j+4, k+2, Block.getBlockById(85), 0, 2);
		world.setBlock(i+0, j+5, k+0, Block.getBlockById(67), 2, 2);
		world.setBlock(i+1, j+5, k+0, Block.getBlockById(67), 2, 2);
		world.setBlock(i+2, j+5, k+0, Block.getBlockById(67), 1, 2);
		world.setBlock(i+0, j+5, k+1, Block.getBlockById(67), 0, 2);
		world.setBlock(i+1, j+5, k+1, Block.getBlockById(20), 0, 2);
		world.setBlock(i+2, j+5, k+1, Block.getBlockById(67), 1, 2);
		world.setBlock(i+0, j+5, k+2, Block.getBlockById(67), 3, 2);
		world.setBlock(i+1, j+5, k+2, Block.getBlockById(67), 3, 2);
		world.setBlock(i+2, j+5, k+2, Block.getBlockById(67), 3, 2);
}}
	}

	}

