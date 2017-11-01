package com.jtrent238.epicproportions.biome.decorators;

import com.jtrent238.epicproportions.biome.BiomeGenPat;
import com.jtrent238.epicproportions.biome.ModBiomes;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDecoratorHelper {

    private static WorldGenerator glowStone;

    public BiomeDecoratorHelper(){
        //		glowStone = new WorldGenMinable(Blocks.glowstone, 30, Blockss.lightStone);
    }

    protected static void decorateBiome(BiomeGenBase biome) {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, BiomeDecoratorMod.chunk_X, BiomeDecoratorMod.chunk_Z));
        //perpere ores for generation
        initOres();
        //GenerateOres
        generateOreInBiome(biome);

        
            
        
    }

    /**
     * Prepare ores for generation
     */
    private static void initOres() {
        //glowstone used fotr testing generation
        //glowStone = new WorldGenMinable(Blocks.glowstone, 30, Blockss.lightStone);
    }

    /**
     * Geberate Ores In a Biome
     * @param biome
     */
    private static void generateOreInBiome(BiomeGenBase biome){
        if(biome == ModBiomes.pat){
            genStandardOre(20, glowStone, 0, 128);
        }if(biome == ModBiomes.jen){
            genStandardOre(20, glowStone, 0, 128);
        }
    }

    /**
     * Generate ores in chunks.
     * @param spawnWeight
     * @param generatorToSpawn
     * @param minSpawnHeight
     * @param maxYSpawnHeight
     */
    private static void genStandardOre(int spawnWeight, WorldGenerator generatorToSpawn, int minSpawnHeight, int maxYSpawnHeight) {
        for (int l = 0; l < spawnWeight; ++l) {
            int i1 = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16);
            int j1 = BiomeDecoratorMod.randomGenerator.nextInt(maxYSpawnHeight - minSpawnHeight) + minSpawnHeight;
            int k1 = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16);
            generatorToSpawn.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, i1, j1, k1);
        }
    }
}