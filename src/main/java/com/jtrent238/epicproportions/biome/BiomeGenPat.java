package com.jtrent238.epicproportions.biome;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.entity.EntityPat;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenPat extends BiomeGenBase{

	public static int treesPerChunk;

	public BiomeGenPat(int id){
		super(id);
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPat.class, 5, 2, 10));
		
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;
		
		
		this.topBlock = BlockLoader.BlockPatGrass;
		this.fillerBlock = BlockLoader.BlockPatDirt;
		
	}
	
}