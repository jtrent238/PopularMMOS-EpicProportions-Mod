package com.jtrent238.epicproportions.worldgen.structures;

import java.util.Random;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;



public class WorldGenPatWell extends WorldGenerator implements IWorldGenerator
{
    public boolean generate(World world, Random par2Random, int i, int j, int k)
    {
        while (world.isAirBlock(i, j, k) && j > 2000)
        {
            --j;
        }

    	

    	
        return true;
    }


    public void generate(Random random, int i2, int k2, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		

		int i = i2 + random.nextInt(15);
		int k = k2 + random.nextInt(15);
		int j = world.getHeightValue(i, k) - 1;
		//int i = chunkX;
		//int j = 0;
		//int k = chunkZ;
		world.getHeightValue(j, j);
		
		while (world.isAirBlock(i, j, k) && j > 2000)
        {
            --j;
        }
		
		if(random.nextInt(100) < 10000){
			

			world.setBlock(i+0, j+0, k+0, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+1, j+0, k+0, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+2, j+0, k+0, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+0, j+0, k+1, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+1, j+0, k+1, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+2, j+0, k+1, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+0, j+0, k+2, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+1, j+0, k+2, BlockLoader.blockPatIngot, 0, 2);
			world.setBlock(i+2, j+0, k+2, BlockLoader.blockPatIngot, 0, 2);
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
			
		if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
			
		System.out.println(EpicProportionsMod.MODID + ">> FuriousDestroyer Well Structure Generated at: " + i2 + "," + k2);
		
		}
		}
	}


	
	
}