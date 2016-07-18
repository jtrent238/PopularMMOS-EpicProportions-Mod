package com.jtrent238.epicproportions.worldgen.structures;

import cpw.mods.fml.client.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;
import java.util.Random;

import java.util.Random;


public class structureTntSword
{ 
	public void load(){
}


public void generate(World world, Random random, int i2, int k2){

int i = i2 + random.nextInt(15);
int k = k2 + random.nextInt(15);

int j = world.getHeightValue(i,k)-1;

if((random.nextInt(1000000)+1)<=100000000){
boolean place = true;

for (int y = 0; y<15; y++)
for (int z = 0; z<12; z++)
for (int x = 0; x<1; x++)


if(world.getBlock(i+x,j+y+1,k+z)!=Blocks.air)
place = true;


if(place){
//world.setBlock(i+0, j+0, k+0, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+1, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+2, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+3, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+4, Block.getBlockById(3), 0, 2);
//world.setBlock(i+0, j+0, k+5, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+6, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+7, Block.getBlockById(3), 0, 2);
//world.setBlock(i+0, j+0, k+8, Block.getBlockById(3), 0, 2);
//world.setBlock(i+0, j+0, k+9, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+10, Block.getBlockById(2), 0, 2);
//world.setBlock(i+0, j+0, k+11, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+1, k+0, Block.getBlockById(0), 0, 2);
//world.setBlock(i+0, j+1, k+1, Block.getBlockById(0), 0, 2);
//world.setBlock(i+0, j+1, k+2, Block.getBlockById(31), 1, 2);
world.setBlock(i+0, j+1, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+1, k+4, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+1, k+5, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+1, k+6, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+1, k+7, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+1, k+8, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+1, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+1, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+1, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+5, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+2, k+6, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+7, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+2, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+10, Block.getBlockById(0), 0, 2);
//world.setBlock(i+0, j+2, k+11, Block.getBlockById(18), 1, 2);
world.setBlock(i+0, j+3, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+3, k+1, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+3, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+3, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+3, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+3, k+5, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+3, k+6, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+3, k+7, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+3, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+3, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+3, k+10, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+3, k+11, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+4, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+4, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+3, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+4, k+5, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+4, k+6, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+4, k+7, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+4, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+4, k+9, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+10, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+5, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+5, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+5, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+5, k+3, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+4, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+5, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+6, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+7, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+8, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+9, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+5, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+6, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+6, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+6, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+6, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+7, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+7, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+7, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+7, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+8, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+8, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+8, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+8, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+9, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+9, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+9, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+9, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+10, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+10, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+10, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+10, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+11, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+11, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+11, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+11, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+12, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+12, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+12, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+12, k+11, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+13, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+13, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+13, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+13, k+11, Block.getBlockById(0), 0, 2);
//world.setBlock(i+0, j+14, k+0, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+14, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+3, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+4, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+5, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+14, k+7, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+8, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+9, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+10, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+14, k+11, Block.getBlockById(0), 0, 2);
}}
}

}

