package com.jtrent238.epicproportions.addons.christmas.world.genlayer;

import com.jtrent238.epicproportions.addons.christmas.world.biomes.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class WinterWonderLandGenLayerBiomes extends GenLayer {

	// TODO: spawning with temperatures
    protected BiomeGenBase[] allowedBiomes = {
        ModBiomes.winterWonderland,
    };
    
    public WinterWonderLandGenLayerBiomes(long seed) {
		super(seed);
	}
	
	public WinterWonderLandGenLayerBiomes(long seed, GenLayer genlayer) {
		super(seed);
		this.parent = genlayer;
	}
	
    @Override
    public int[] getInts(int x, int z, int width, int depth) {
        int[] dest = IntCache.getIntCache(width * depth);
        for (int dz = 0; dz < depth; dz++) {
            for (int dx = 0; dx < width; dx++) {
                this.initChunkSeed(dx + x, dz + z);
                dest[(dx + dz * width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
            }
        }
        return dest;
    }
}