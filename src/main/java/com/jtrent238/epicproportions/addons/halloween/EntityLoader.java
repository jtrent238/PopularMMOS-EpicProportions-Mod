package com.jtrent238.epicproportions.addons.halloween;

import com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyJen;
import com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyPat;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	public static void LoadEntitys() {
		
	
	//Pat Registry
	    EntityRegistry.registerGlobalEntityID(EntitySpookyPat.class, "EntitySpookyPat",EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.addSpawn(EntitySpookyPat.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	//Jen Registry
	    EntityRegistry.registerGlobalEntityID(EntitySpookyJen.class, "EntitySpookyJen",EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.addSpawn(EntitySpookyJen.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
    	}
	{
	
	}
	//

}
