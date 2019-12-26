package com.jtrent238.epicproportions.addons.christmas.blocks;

import com.jtrent238.epicproportions.addons.christmas.ItemLoader;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockSnowmanCreepy;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IRegistry;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.RegistryDefaulted;
import net.minecraft.world.World;

public class BlockSnowmanCreepy extends BlockContainer{

    private World p_149941_1_;
	private int p_149941_2_;
	private int p_149941_3_;
	private int p_149941_4_;
	
	BlockSourceImpl blocksourceimpl = new BlockSourceImpl(p_149941_1_, p_149941_2_, p_149941_3_, p_149941_4_);

	public BlockSnowmanCreepy(Material material) {
        super(material);

        this.setBlockName("BlockSnowman");
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityBlockSnowmanCreepy();
    }
    
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	  {
	    return new ItemStack(ItemLoader.ItemSnowmanCreepy);
	  }
}
 