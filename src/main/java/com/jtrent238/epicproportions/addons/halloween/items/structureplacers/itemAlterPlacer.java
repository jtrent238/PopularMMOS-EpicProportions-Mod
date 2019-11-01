package com.jtrent238.epicproportions.addons.halloween.items.structureplacers;


import com.jtrent238.epicproportions.addons.halloween.BlockLoader;
import com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class itemAlterPlacer<IBlockState>  extends Item{

	public itemAlterPlacer(int par1){
		setMaxDamage(0);
		maxStackSize = 1;
		setUnlocalizedName("itemTNTSwordPlacer");
		setTextureName("epicproportionsmod_halloween:itemAlterPlacer");
		setCreativeTab(epicproportionsmod_halloween.EpicProportionsMod_Halloween);
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
		
		int x = i;
		int y = j;
		int z = k;
		
		if(true){
		boolean place = true;
		
		if(place){
			//Structure code here

			world.setBlock(x + 0, y + 0, z + 0, Blocks.dark_oak_stairs, 2, 3);
			world.setBlock(x + 1, y + 0, z + 0, Blocks.dark_oak_stairs, 2, 3);
			world.setBlock(x + 2, y + 0, z + 0, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 3, y + 0, z + 0, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 4, y + 0, z + 0, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 5, y + 0, z + 0, Blocks.dark_oak_stairs, 2, 3);
			world.setBlock(x + 6, y + 0, z + 0, Blocks.dark_oak_stairs, 1, 3);
			world.setBlock(x + 0, y + 0, z + 1, Blocks.dark_oak_stairs, 0, 3);
			world.setBlock(x + 1, y + 0, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 0, z + 1, Blocks.log2, 5, 3);
			world.setBlock(x + 3, y + 0, z + 1, Blocks.log2, 5, 3);
			world.setBlock(x + 4, y + 0, z + 1, Blocks.log2, 5, 3);
			world.setBlock(x + 5, y + 0, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 0, z + 1, Blocks.dark_oak_stairs, 1, 3);
			world.setBlock(x + 0, y + 0, z + 2, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 1, y + 0, z + 2, Blocks.log2, 9, 3);
			world.setBlock(x + 2, y + 0, z + 2, Blocks.planks, 5, 3);
			world.setBlock(x + 3, y + 0, z + 2, Blocks.planks, 5, 3);
			world.setBlock(x + 4, y + 0, z + 2, Blocks.planks, 5, 3);
			world.setBlock(x + 5, y + 0, z + 2, Blocks.log2, 9, 3);
			world.setBlock(x + 6, y + 0, z + 2, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 0, y + 0, z + 3, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 1, y + 0, z + 3, Blocks.log2, 9, 3);
			world.setBlock(x + 2, y + 0, z + 3, Blocks.planks, 5, 3);
			world.setBlock(x + 3, y + 0, z + 3, Blocks.planks, 5, 3);
			world.setBlock(x + 4, y + 0, z + 3, Blocks.planks, 5, 3);
			world.setBlock(x + 5, y + 0, z + 3, Blocks.log2, 9, 3);
			world.setBlock(x + 6, y + 0, z + 3, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 0, y + 0, z + 4, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 1, y + 0, z + 4, Blocks.log2, 9, 3);
			world.setBlock(x + 2, y + 0, z + 4, Blocks.planks, 5, 3);
			world.setBlock(x + 3, y + 0, z + 4, Blocks.planks, 5, 3);
			world.setBlock(x + 4, y + 0, z + 4, Blocks.planks, 5, 3);
			world.setBlock(x + 5, y + 0, z + 4, Blocks.log2, 9, 3);
			world.setBlock(x + 6, y + 0, z + 4, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 0, y + 0, z + 5, Blocks.dark_oak_stairs, 0, 3);
			world.setBlock(x + 1, y + 0, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 0, z + 5, Blocks.log2, 5, 3);
			world.setBlock(x + 3, y + 0, z + 5, Blocks.log2, 5, 3);
			world.setBlock(x + 4, y + 0, z + 5, Blocks.log2, 5, 3);
			world.setBlock(x + 5, y + 0, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 0, z + 5, Blocks.dark_oak_stairs, 1, 3);
			world.setBlock(x + 0, y + 0, z + 6, Blocks.dark_oak_stairs, 0, 3);
			world.setBlock(x + 1, y + 0, z + 6, Blocks.dark_oak_stairs, 3, 3);
			world.setBlock(x + 2, y + 0, z + 6, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 3, y + 0, z + 6, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 4, y + 0, z + 6, Blocks.wooden_slab, 5, 3);
			world.setBlock(x + 5, y + 0, z + 6, Blocks.dark_oak_stairs, 3, 3);
			world.setBlock(x + 6, y + 0, z + 6, Blocks.dark_oak_stairs, 3, 3);
			world.setBlock(x + 0, y + 1, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 1, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 1, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 1, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 1, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 1, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 1, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 1, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 1, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 1, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 1, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 1, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 1, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 1, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 1, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 1, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 1, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 1, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 1, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 1, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 1, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 1, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 1, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 1, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 1, z + 3, BlockLoader.blockWitchesCauldron, 0, 3);
			world.setBlock(x + 4, y + 1, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 1, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 1, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 1, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 1, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 1, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 1, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 1, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 1, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 1, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 1, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 1, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 1, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 1, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 1, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 1, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 1, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 1, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 1, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 1, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 1, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 1, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 1, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 1, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 2, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 2, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 2, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 2, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 2, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 2, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 2, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 2, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 2, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 3, y + 2, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 2, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 2, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 2, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 2, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 2, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 2, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 2, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 2, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 2, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 2, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 2, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 2, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 2, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 2, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 2, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 2, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 2, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 2, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 2, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 2, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 2, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 3, y + 2, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 2, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 2, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 2, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 2, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 2, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 2, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 2, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 2, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 2, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 3, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 3, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 3, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 3, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 3, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 3, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 3, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 3, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 3, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 3, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 3, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 3, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 3, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 3, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 3, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 3, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 3, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 3, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 3, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 3, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 3, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 3, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 3, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 3, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 3, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 3, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 3, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 3, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 3, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 3, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 3, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 3, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 3, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 3, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 3, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 3, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 3, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 3, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 3, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 3, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 3, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 3, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 3, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 3, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 3, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 3, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 3, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 3, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 3, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 4, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 4, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 4, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 4, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 4, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 4, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 4, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 4, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 4, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 4, z + 1, Blocks.log2, 5, 3);
			world.setBlock(x + 3, y + 4, z + 1, Blocks.log2, 5, 3);
			world.setBlock(x + 4, y + 4, z + 1, Blocks.log2, 5, 3);
			world.setBlock(x + 5, y + 4, z + 1, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 4, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 4, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 4, z + 2, Blocks.log2, 9, 3);
			world.setBlock(x + 2, y + 4, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 4, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 4, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 4, z + 2, Blocks.log2, 9, 3);
			world.setBlock(x + 6, y + 4, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 4, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 4, z + 3, Blocks.log2, 9, 3);
			world.setBlock(x + 2, y + 4, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 4, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 4, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 4, z + 3, Blocks.log2, 9, 3);
			world.setBlock(x + 6, y + 4, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 4, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 4, z + 4, Blocks.log2, 9, 3);
			world.setBlock(x + 2, y + 4, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 4, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 4, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 4, z + 4, Blocks.log2, 9, 3);
			world.setBlock(x + 6, y + 4, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 4, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 4, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 2, y + 4, z + 5, Blocks.log2, 5, 3);
			world.setBlock(x + 3, y + 4, z + 5, Blocks.log2, 5, 3);
			world.setBlock(x + 4, y + 4, z + 5, Blocks.log2, 5, 3);
			world.setBlock(x + 5, y + 4, z + 5, Blocks.log2, 1, 3);
			world.setBlock(x + 6, y + 4, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 4, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 4, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 4, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 4, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 4, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 4, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 4, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 5, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 5, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 5, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 5, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 5, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 5, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 5, z + 0, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 5, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 5, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 5, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 5, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 5, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 5, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 5, z + 1, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 5, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 5, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 5, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 5, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 5, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 5, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 5, z + 2, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 5, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 5, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 5, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 5, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 5, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 5, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 5, z + 3, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 5, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 5, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 5, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 5, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 5, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 5, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 5, z + 4, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 5, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 5, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 5, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 5, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 5, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 5, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 5, z + 5, Blocks.air, 0, 3);
			world.setBlock(x + 0, y + 5, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 1, y + 5, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 2, y + 5, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 3, y + 5, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 4, y + 5, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 5, y + 5, z + 6, Blocks.air, 0, 3);
			world.setBlock(x + 6, y + 5, z + 6, Blocks.air, 0, 3);
			
			world.setBlock(x + 2, y + 2, z + 1, Blocks.redstone_torch, 1, 3);
			world.setBlock(x + 4, y + 2, z + 1, Blocks.redstone_torch, 2, 3);
			world.setBlock(x + 1, y + 2, z + 2, Blocks.redstone_torch, 3, 3);
			world.setBlock(x + 5, y + 2, z + 2, Blocks.redstone_torch, 3, 3);
			world.setBlock(x + 1, y + 2, z + 4, Blocks.redstone_torch, 4, 3);
			world.setBlock(x + 5, y + 2, z + 4, Blocks.redstone_torch, 4, 3);
			world.setBlock(x + 2, y + 2, z + 5, Blocks.redstone_torch, 1, 3);
			world.setBlock(x + 4, y + 2, z + 5, Blocks.redstone_torch, 2, 3);
		}
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
