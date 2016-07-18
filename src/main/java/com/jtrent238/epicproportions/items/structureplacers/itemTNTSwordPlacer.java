package com.jtrent238.epicproportions.items.structureplacers;

import com.jtrent238.epicproportions.EpicProportionsMod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemTNTSwordPlacer extends Item{

public itemTNTSwordPlacer(int par1){
setMaxDamage(0);
maxStackSize = 1;
setUnlocalizedName("itemTNTSwordPlacer");
setTextureName("epicproportionsmod:itemTNTSwordPlacer");
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
}
}

return true;
}




}
