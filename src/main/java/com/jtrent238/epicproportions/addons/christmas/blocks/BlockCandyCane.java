package com.jtrent238.epicproportions.addons.christmas.blocks;


import com.jtrent238.epicproportions.addons.christmas.BlockLoader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockCandyCane extends Block{

	public BlockCandyCane(Material rock) {
		super(rock);
	}

	/**
     * Determines if this block can be used as the base of a beacon.
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z position
     * @param beaconX Beacons X Position
     * @param beaconY Beacons Y Position
     * @param beaconZ Beacons Z Position
     * @return True, to support the beacon, and make it active with this block.
     */
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
    {
        return this == BlockLoader.BlockCandyCane;
    }
}
