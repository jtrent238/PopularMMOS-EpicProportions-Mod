package com.jtrent238.epicproportions.items.structureplacers;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemJenWellPlacer extends Item{



public itemJenWellPlacer(int par1){
setMaxDamage(0);
maxStackSize = 1;
setUnlocalizedName("itemJenWellPlacer");
setTextureName("epicproportionsmod:itemJenWellPlacer");
setCreativeTab(EpicProportionsMod.EpicProportionsMod);
}
public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 1;
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
	
	world.setBlock(i+0, j+0, k+0, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+1, j+0, k+0, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+2, j+0, k+0, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+0, j+0, k+1, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+1, j+0, k+1, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+2, j+0, k+1, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+0, j+0, k+2, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+1, j+0, k+2, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+2, j+0, k+2, BlockLoader.blockJenIngot, 0, 2);
	world.setBlock(i+0, j+1, k+0, Block.getBlockById(4), 0, 2);
	world.setBlock(i+1, j+1, k+0, Block.getBlockById(4), 0, 2);
	world.setBlock(i+2, j+1, k+0, Block.getBlockById(4), 0, 2);
	world.setBlock(i+0, j+1, k+1, Block.getBlockById(4), 0, 2);
	world.setBlock(i+1, j+1, k+1, Block.getBlockById(138), 0, 2);
	world.setBlock(i+2, j+1, k+1, Block.getBlockById(4), 0, 2);
	world.setBlock(i+0, j+1, k+2, Block.getBlockById(4), 0, 2);
	world.setBlock(i+1, j+1, k+2, Block.getBlockById(4), 0, 2);
	world.setBlock(i+2, j+1, k+2, Block.getBlockById(4), 0, 2);
	world.setBlock(i+0, j+2, k+0, Block.getBlockById(4), 0, 2);
	world.setBlock(i+1, j+2, k+0, Block.getBlockById(4), 0, 2);
	world.setBlock(i+2, j+2, k+0, Block.getBlockById(4), 0, 2);
	world.setBlock(i+0, j+2, k+1, Block.getBlockById(4), 0, 2);
	world.setBlock(i+1, j+2, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+2, k+1, Block.getBlockById(4), 0, 2);
	world.setBlock(i+0, j+2, k+2, Block.getBlockById(4), 0, 2);
	world.setBlock(i+1, j+2, k+2, Block.getBlockById(4), 0, 2);
	world.setBlock(i+2, j+2, k+2, Block.getBlockById(4), 0, 2);
	world.setBlock(i+0, j+3, k+0, Block.getBlockById(85), 0, 2);
	world.setBlock(i+1, j+3, k+0, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+3, k+0, Block.getBlockById(85), 0, 2);
	world.setBlock(i+0, j+3, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+1, j+3, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+3, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+0, j+3, k+2, Block.getBlockById(85), 0, 2);
	world.setBlock(i+1, j+3, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+3, k+2, Block.getBlockById(85), 0, 2);
	world.setBlock(i+0, j+4, k+0, Block.getBlockById(85), 0, 2);
	world.setBlock(i+1, j+4, k+0, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+4, k+0, Block.getBlockById(85), 0, 2);
	world.setBlock(i+0, j+4, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+1, j+4, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+4, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+0, j+4, k+2, Block.getBlockById(85), 0, 2);
	world.setBlock(i+1, j+4, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+4, k+2, Block.getBlockById(85), 0, 2);
	world.setBlock(i+0, j+5, k+0, Block.getBlockById(67), 2, 2);
	world.setBlock(i+1, j+5, k+0, Block.getBlockById(67), 2, 2);
	world.setBlock(i+2, j+5, k+0, Block.getBlockById(67), 1, 2);
	world.setBlock(i+0, j+5, k+1, Block.getBlockById(67), 0, 2);
	world.setBlock(i+1, j+5, k+1, Block.getBlockById(20), 0, 2);
	world.setBlock(i+2, j+5, k+1, Block.getBlockById(67), 1, 2);
	world.setBlock(i+0, j+5, k+2, Block.getBlockById(67), 3, 2);
	world.setBlock(i+1, j+5, k+2, Block.getBlockById(67), 3, 2);
	world.setBlock(i+2, j+5, k+2, Block.getBlockById(67), 3, 2);

	
	}
--itemStack.stackSize;
}


return true;
}


public void removeItem(EntityPlayer ep, ItemStack removeitem) {
	IInventory inv = ep.inventory;
	for(int i=0; i < inv.getSizeInventory(); i++)
	{
		if(inv.getStackInSlot(i) != null)
		{
			ItemStack j = inv.getStackInSlot(i);
			if(j.getItem() != null && j.getItem() == removeitem.getItem())
			{
				inv.setInventorySlotContents(i, null);
			}
		}
	}
}

}
