package com.jtrent238.epicproportions.world.biome;

import java.util.Random;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;

import net.minecraft.block.BlockFlower;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;

public class BiomeGenPat extends BiomeGenBase
{
    protected boolean field_150628_aC;
    private static final String __OBFID = "CL_00000180";
    protected static final BiomeGenBase.Height height_pat = new BiomeGenBase.Height(0.2F, 0.2F);
    public static final BiomeGenBase pat = (new BiomeGenPat(EpicProportionsMod.getBIOME_ID_PAT())).setColor(112).setBiomeName("FuriousDestroyer").setHeight(height_pat);
    
    int R = (int) (Math.random( )*256);
    int G = (int)(Math.random( )*256);
    int B= (int)(Math.random( )*256);
    
    public BiomeGenPat(int getBIOME_ID_PAT)
    {
        super(getBIOME_ID_PAT);
        //this.setTemperatureRainfall(0.8F, 0.4F);
        //this.setHeight(height_LowPlains);
        //this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityHorse.class, 5, 2, 6));
        //this.theBiomeDecorator.treesPerChunk = -999;
        //this.theBiomeDecorator.flowersPerChunk = 4;
        //this.theBiomeDecorator.grassPerChunk = 10;
        this.flowers.clear();
        
        this.color = /*255 182 193 */12695295;
        this.waterColorMultiplier = 0;
        this.fillerBlock = BlockLoader.BlockPatDirt;
        this.topBlock = BlockLoader.BlockPatGrass;
    }


}