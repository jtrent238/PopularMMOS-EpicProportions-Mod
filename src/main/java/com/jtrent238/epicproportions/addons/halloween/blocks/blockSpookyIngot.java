package com.jtrent238.epicproportions.addons.halloween.blocks;

import com.jtrent238.epicproportions.addons.halloween.BlockLoader;

import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraft.world.IBlockAccess;

public class blockSpookyIngot extends BlockCompressed{

	public blockSpookyIngot(MapColor brownColor) {
		super(brownColor);
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
        return this == BlockLoader.blockSpookyIngot;
    }
}
