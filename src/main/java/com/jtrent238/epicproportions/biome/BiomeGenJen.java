package com.jtrent238.epicproportions.biome;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.entity.EntityJen;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenJen extends BiomeGenBase{

	public BiomeGenJen(int id){
		super(id);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityJen.class, 5, 2, 10));
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = BlockLoader.BlockJenGrass;
		this.fillerBlock = BlockLoader.BlockJenDirt;
		
	}
	
}