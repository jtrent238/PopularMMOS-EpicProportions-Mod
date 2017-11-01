package com.jtrent238.epicproportions.biome;

import com.jtrent238.epicproportions.biome.BiomeGenPat;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomePat;
	public static BiomeGenBase biomeJen;
	
	public static void initializeBiome(){
		
		biomePat = new BiomeGenPat(137).setBiomeName("FuriousDestroyer").setTemperatureRainfall(1.2F, 0.9F);
		biomeJen = new BiomeGenJen(138).setBiomeName("SuperGirlyGamer").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomePat, Type.FOREST);
		BiomeDictionary.registerBiomeType(biomeJen, Type.FOREST);
		BiomeManager.addSpawnBiome(biomePat);
		BiomeManager.addSpawnBiome(biomeJen);
	}

}
