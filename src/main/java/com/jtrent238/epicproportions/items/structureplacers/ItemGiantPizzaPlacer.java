package com.jtrent238.epicproportions.items.structureplacers;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGiantPizzaPlacer extends Item{



public ItemGiantPizzaPlacer(int par1){
setMaxDamage(0);
maxStackSize = 1;
setUnlocalizedName("ItemGiantPizzaPlacer");
setTextureName("epicproportionsmod:ItemGiantPizzaPlacer");
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
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int x, int y, int z, int l, float a, float b, float c){
float var4 = 1.0F;

if(true){
boolean place = true;

if(place){
	
	//Structure Data Here
	
	world.setBlock(x+0, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+5, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+6, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+7, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+8, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+9, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+10, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+11, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+12, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+0, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+5, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+6, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+7, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+8, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+9, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+10, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+11, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+12, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+1, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+5, y+0, z+2, Block.getBlockById(121));
	world.setBlock(x+6, y+0, z+2, Block.getBlockById(121));
	world.setBlock(x+7, y+0, z+2, Block.getBlockById(121));
	world.setBlock(x+8, y+0, z+2, Block.getBlockById(121));
	world.setBlock(x+9, y+0, z+2, Block.getBlockById(121));
	world.setBlock(x+10, y+0, z+2, Block.getBlockById(121));
	world.setBlock(x+11, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+12, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+2, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+3, Block.getBlockById(121));
	world.setBlock(x+5, y+0, z+3, Block.getBlockById(152));
	world.setBlock(x+6, y+0, z+3, Block.getBlockById(152));
	world.setBlock(x+7, y+0, z+3, Block.getBlockById(152));
	world.setBlock(x+8, y+0, z+3, Block.getBlockById(152));
	world.setBlock(x+9, y+0, z+3, Block.getBlockById(152));
	world.setBlock(x+10, y+0, z+3, Block.getBlockById(152));
	world.setBlock(x+11, y+0, z+3, Block.getBlockById(121));
	world.setBlock(x+12, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+3, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+4, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+4, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+4, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+4, Block.getBlockById(121));
	world.setBlock(x+4, y+0, z+4, Block.getBlockById(152));
	world.setBlock(x+5, y+0, z+4, Block.getBlockById(155));
	world.setBlock(x+6, y+0, z+4, Block.getBlockById(155));
	world.setBlock(x+7, y+0, z+4, Block.getBlockById(152));
	world.setBlock(x+8, y+0, z+4, Block.getBlockById(155));
	world.setBlock(x+9, y+0, z+4, Block.getBlockById(155));
	world.setBlock(x+10, y+0, z+4, Block.getBlockById(155));
	world.setBlock(x+11, y+0, z+4, Block.getBlockById(152));
	world.setBlock(x+12, y+0, z+4, Block.getBlockById(121));
	world.setBlock(x+13, y+0, z+4, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+4, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+4, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+5, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+5, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+5, Block.getBlockById(121));
	world.setBlock(x+3, y+0, z+5, Block.getBlockById(152));
	world.setBlock(x+4, y+0, z+5, Block.getBlockById(155));
	world.setBlock(x+5, y+0, z+5, Block.getBlockById(80));
	world.setBlock(x+6, y+0, z+5, Block.getBlockById(80));
	world.setBlock(x+7, y+0, z+5, Block.getBlockById(80));
	world.setBlock(x+8, y+0, z+5, Block.getBlockById(80));
	world.setBlock(x+9, y+0, z+5, Block.getBlockById(80));
	world.setBlock(x+10, y+0, z+5, Block.getBlockById(80));
	world.setBlock(x+11, y+0, z+5, Block.getBlockById(155));
	world.setBlock(x+12, y+0, z+5, Block.getBlockById(152));
	world.setBlock(x+13, y+0, z+5, Block.getBlockById(121));
	world.setBlock(x+14, y+0, z+5, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+5, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+6, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+6, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+6, Block.getBlockById(121));
	world.setBlock(x+3, y+0, z+6, Block.getBlockById(152));
	world.setBlock(x+4, y+0, z+6, Block.getBlockById(155));
	world.setBlock(x+5, y+0, z+6, Block.getBlockById(80));
	world.setBlock(x+6, y+0, z+6, Block.getBlockById(152));
	world.setBlock(x+7, y+0, z+6, Block.getBlockById(80));
	world.setBlock(x+8, y+0, z+6, Block.getBlockById(80));
	world.setBlock(x+9, y+0, z+6, Block.getBlockById(152));
	world.setBlock(x+10, y+0, z+6, Block.getBlockById(80));
	world.setBlock(x+11, y+0, z+6, Block.getBlockById(155));
	world.setBlock(x+12, y+0, z+6, Block.getBlockById(152));
	world.setBlock(x+13, y+0, z+6, Block.getBlockById(121));
	world.setBlock(x+14, y+0, z+6, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+6, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+7, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+7, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+7, Block.getBlockById(121));
	world.setBlock(x+3, y+0, z+7, Block.getBlockById(152));
	world.setBlock(x+4, y+0, z+7, Block.getBlockById(155));
	world.setBlock(x+5, y+0, z+7, Block.getBlockById(80));
	world.setBlock(x+6, y+0, z+7, Block.getBlockById(80));
	world.setBlock(x+7, y+0, z+7, Block.getBlockById(80));
	world.setBlock(x+8, y+0, z+7, Block.getBlockById(80));
	world.setBlock(x+9, y+0, z+7, Block.getBlockById(80));
	world.setBlock(x+10, y+0, z+7, Block.getBlockById(80));
	world.setBlock(x+11, y+0, z+7, Block.getBlockById(155));
	world.setBlock(x+12, y+0, z+7, Block.getBlockById(152));
	world.setBlock(x+13, y+0, z+7, Block.getBlockById(121));
	world.setBlock(x+14, y+0, z+7, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+7, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+8, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+8, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+8, Block.getBlockById(121));
	world.setBlock(x+3, y+0, z+8, Block.getBlockById(152));
	world.setBlock(x+4, y+0, z+8, Block.getBlockById(155));
	world.setBlock(x+5, y+0, z+8, Block.getBlockById(152));
	world.setBlock(x+6, y+0, z+8, Block.getBlockById(80));
	world.setBlock(x+7, y+0, z+8, Block.getBlockById(80));
	world.setBlock(x+8, y+0, z+8, Block.getBlockById(80));
	world.setBlock(x+9, y+0, z+8, Block.getBlockById(80));
	world.setBlock(x+10, y+0, z+8, Block.getBlockById(152));
	world.setBlock(x+11, y+0, z+8, Block.getBlockById(155));
	world.setBlock(x+12, y+0, z+8, Block.getBlockById(152));
	world.setBlock(x+13, y+0, z+8, Block.getBlockById(121));
	world.setBlock(x+14, y+0, z+8, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+8, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+9, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+9, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+9, Block.getBlockById(121));
	world.setBlock(x+3, y+0, z+9, Block.getBlockById(152));
	world.setBlock(x+4, y+0, z+9, Block.getBlockById(155));
	world.setBlock(x+5, y+0, z+9, Block.getBlockById(80));
	world.setBlock(x+6, y+0, z+9, Block.getBlockById(80));
	world.setBlock(x+7, y+0, z+9, Block.getBlockById(152));
	world.setBlock(x+8, y+0, z+9, Block.getBlockById(80));
	world.setBlock(x+9, y+0, z+9, Block.getBlockById(80));
	world.setBlock(x+10, y+0, z+9, Block.getBlockById(80));
	world.setBlock(x+11, y+0, z+9, Block.getBlockById(155));
	world.setBlock(x+12, y+0, z+9, Block.getBlockById(152));
	world.setBlock(x+13, y+0, z+9, Block.getBlockById(121));
	world.setBlock(x+14, y+0, z+9, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+9, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+10, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+10, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+10, Block.getBlockById(121));
	world.setBlock(x+3, y+0, z+10, Block.getBlockById(152));
	world.setBlock(x+4, y+0, z+10, Block.getBlockById(155));
	world.setBlock(x+5, y+0, z+10, Block.getBlockById(80));
	world.setBlock(x+6, y+0, z+10, Block.getBlockById(80));
	world.setBlock(x+7, y+0, z+10, Block.getBlockById(80));
	world.setBlock(x+8, y+0, z+10, Block.getBlockById(80));
	world.setBlock(x+9, y+0, z+10, Block.getBlockById(80));
	world.setBlock(x+10, y+0, z+10, Block.getBlockById(152));
	world.setBlock(x+11, y+0, z+10, Block.getBlockById(155));
	world.setBlock(x+12, y+0, z+10, Block.getBlockById(152));
	world.setBlock(x+13, y+0, z+10, Block.getBlockById(121));
	world.setBlock(x+14, y+0, z+10, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+10, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+11, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+11, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+11, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+11, Block.getBlockById(121));
	world.setBlock(x+4, y+0, z+11, Block.getBlockById(152));
	world.setBlock(x+5, y+0, z+11, Block.getBlockById(155));
	world.setBlock(x+6, y+0, z+11, Block.getBlockById(155));
	world.setBlock(x+7, y+0, z+11, Block.getBlockById(155));
	world.setBlock(x+8, y+0, z+11, Block.getBlockById(155));
	world.setBlock(x+9, y+0, z+11, Block.getBlockById(155));
	world.setBlock(x+10, y+0, z+11, Block.getBlockById(155));
	world.setBlock(x+11, y+0, z+11, Block.getBlockById(152));
	world.setBlock(x+12, y+0, z+11, Block.getBlockById(121));
	world.setBlock(x+13, y+0, z+11, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+11, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+11, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+12, Block.getBlockById(121));
	world.setBlock(x+5, y+0, z+12, Block.getBlockById(152));
	world.setBlock(x+6, y+0, z+12, Block.getBlockById(152));
	world.setBlock(x+7, y+0, z+12, Block.getBlockById(152));
	world.setBlock(x+8, y+0, z+12, Block.getBlockById(152));
	world.setBlock(x+9, y+0, z+12, Block.getBlockById(152));
	world.setBlock(x+10, y+0, z+12, Block.getBlockById(152));
	world.setBlock(x+11, y+0, z+12, Block.getBlockById(121));
	world.setBlock(x+12, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+12, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+5, y+0, z+13, Block.getBlockById(121));
	world.setBlock(x+6, y+0, z+13, Block.getBlockById(121));
	world.setBlock(x+7, y+0, z+13, Block.getBlockById(121));
	world.setBlock(x+8, y+0, z+13, Block.getBlockById(121));
	world.setBlock(x+9, y+0, z+13, Block.getBlockById(121));
	world.setBlock(x+10, y+0, z+13, Block.getBlockById(121));
	world.setBlock(x+11, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+12, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+13, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+5, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+6, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+7, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+8, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+9, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+10, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+11, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+12, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+14, Block.getBlockById(0));
	world.setBlock(x+0, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+1, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+2, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+3, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+4, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+5, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+6, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+7, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+8, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+9, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+10, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+11, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+12, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+13, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+14, y+0, z+15, Block.getBlockById(0));
	world.setBlock(x+15, y+0, z+15, Block.getBlockById(0));
	
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
