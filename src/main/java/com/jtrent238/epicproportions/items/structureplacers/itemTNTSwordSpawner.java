package com.jtrent238.epicproportions.items.structureplacers;

import java.util.Random;

import com.jtrent238.epicproportions.EpicProportionsMod;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemTNTSwordSpawner{

public itemTNTSwordSpawner(){}

public static Item block;public static Object instance;public void load(){
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){
}


static{
//block = (new ItemtNTSWORDPLACER(428));
//Item.itemRegistry.addObject(428, "TNTSWORDPLACER", block);

}

static class ItemtNTSWORDPLACER extends Item{

public ItemtNTSWORDPLACER(int par1){
setMaxDamage(0);
maxStackSize = 64;
setUnlocalizedName("itemTNTSwordSpawner");
setTextureName("epicproportionsmod:itemTNTSwordSpawner");
setCreativeTab(EpicProportionsMod.EpicProportionsMod);
}
public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 0;
}
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return 1.0F;
}
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
float var4 = 1.0F;

if(true){
boolean place = true;

if(place){
world.setBlock(i+0, j+0, k+0, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+1, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+2, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+3, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+4, Block.getBlockById(3), 0, 2);
world.setBlock(i+0, j+0, k+5, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+6, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+7, Block.getBlockById(3), 0, 2);
world.setBlock(i+0, j+0, k+8, Block.getBlockById(3), 0, 2);
world.setBlock(i+0, j+0, k+9, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+10, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+0, k+11, Block.getBlockById(2), 0, 2);
world.setBlock(i+0, j+1, k+2, Block.getBlockById(31), 1, 2);
world.setBlock(i+0, j+1, k+4, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+1, k+5, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+1, k+7, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+1, k+8, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+2, k+5, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+2, k+7, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+2, k+11, Block.getBlockById(18), 1, 2);
world.setBlock(i+0, j+3, k+1, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+3, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+3, k+5, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+3, k+6, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+3, k+7, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+3, k+10, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+3, k+11, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+2, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+3, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+5, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+4, k+6, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+4, k+7, Block.getBlockById(5), 2, 2);
world.setBlock(i+0, j+4, k+9, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+4, k+10, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+3, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+4, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+5, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+6, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+7, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+8, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+5, k+9, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+6, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+6, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+6, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+7, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+7, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+7, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+8, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+8, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+8, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+9, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+9, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+9, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+10, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+10, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+10, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+11, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+11, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+11, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+12, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+12, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+12, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+13, k+5, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+13, k+6, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+13, k+7, Block.getBlockById(46), 0, 2);
world.setBlock(i+0, j+14, k+0, Block.getBlockById(5), 0, 2);
world.setBlock(i+0, j+14, k+6, Block.getBlockById(46), 0, 2);
}
}

return true;
}




}}
