package com.jtrent238.epicproportions.addons.christmas.blocks;


import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBlockChristmasPresents_Red;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockChristmasPresents_Red extends BlockContainer{

	public BlockChristmasPresents_Red(Material p_i45394_1_, float f, float f1, float f2, float f3, float f4, float f5) {
		super(p_i45394_1_);
		this.textureName = ("epicproportionsmod_christmas:ChristmasPresents_Red");
		this.setBlockBounds(f, f1, f2, f3, f4, f5);
		this.getBlockBoundsMaxX();
		this.getBlockBoundsMaxY();
		this.getBlockBoundsMaxZ();
		this.getBlockBoundsMinX();
		this.getBlockBoundsMinY();
		this.getBlockBoundsMinZ();
		this.getBlockColor();
		
	}

	public Block setBlockTextureName(String p_149658_1_)
    {
		this.textureName = ("epicproportionsmod_christmas:ChristmasPresents_Red");
        return this;
    }
	
	   @SideOnly(Side.CLIENT)
	    protected String getTextureName()
	    {
	        return this.textureName;
	    }
	   
	    private boolean isTileProvider = this instanceof ITileEntityProvider;
	    /**
	     * Called throughout the code as a replacement for block instanceof BlockContainer
	     * Moving this to the Block base class allows for mods that wish to extend vanilla
	     * blocks, and also want to have a tile entity on that block, may.
	     *
	     * Return true from this function to specify this block has a tile entity.
	     *
	     * @param metadata Metadata of the current block
	     * @return True if block has a tile entity, false otherwise
	     */
	    public boolean hasTileEntity(int metadata)
	    {
	        return isTileProvider;
	    }
	    
	    
	    /**
	     * Called throughout the code as a replacement for ITileEntityProvider.createNewTileEntity
	     * Return the same thing you would from that function.
	     * This will fall back to ITileEntityProvider.createNewTileEntity(World) if this block is a ITileEntityProvider
	     *
	     * @param metadata The Metadata of the current block
	     * @return A instance of a class extending TileEntity
	     */
	    public TileEntity createTileEntity(World world, int metadata)
	    {
	        if (isTileProvider)
	        {
	            return ((ITileEntityProvider)this).createNewTileEntity(world, metadata);
	        }
	        return new TileEntityBlockChristmasPresents_Red();
	    }
	    
	    
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBlockChristmasPresents_Red();
	}

}
