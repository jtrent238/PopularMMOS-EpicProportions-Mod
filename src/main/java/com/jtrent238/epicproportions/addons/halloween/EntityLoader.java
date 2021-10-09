package com.jtrent238.epicproportions.addons.halloween;

import com.jtrent238.epicproportions.addons.halloween.entity.EntityGhost;
import com.jtrent238.epicproportions.addons.halloween.entity.EntityScareCrow;
import com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyCaptianCookie;
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
		
	//Jen Registry
	    EntityRegistry.registerGlobalEntityID(EntitySpookyCaptianCookie.class, "EntitySpookyCaptianCookie",EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.addSpawn(EntitySpookyCaptianCookie.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	//ScareCrow Registry
	    EntityRegistry.registerGlobalEntityID(EntityScareCrow.class, "EntityScareCrow",EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.addSpawn(EntityScareCrow.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	//Ghost Registry
	    EntityRegistry.registerGlobalEntityID(EntityGhost.class, "EntityGhost",EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.addSpawn(EntityGhost.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	//Pumpkin Head Registry
	    //EntityRegistry.registerGlobalEntityID(EntityPumpkinHead.class, "EntityPumpkinHead",EntityRegistry.findGlobalUniqueEntityId());
	    //EntityRegistry.addSpawn(EntityGhost.class, 8, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
    	}
}
