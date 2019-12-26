package com.jtrent238.epicproportions.addons.christmas.blocks;


import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;

import net.minecraft.block.Block;
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

public class BlockNorthPole extends Block{

	public BlockNorthPole(Material material, String blockColor) {
		
        super(material);

        this.setBlockName("BlockNorthPole" + "_" + blockColor);
        this.setBlockTextureName(epicproportionsmod_christmas.MODID + ":BlockNorthPole_" + blockColor);
        this.setHardness(0.1F);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
    }

}