package com.jtrent238.epicproportions.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockJenCraftingTable extends BlockWorkbench {

	int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0;

	Random field_149942_b = new Random();

	IIcon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

	boolean red = false;

	public BlockJenCraftingTable() {
	}

	public void onBlockAdded(World world, int i, int j, int k) {
		EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
		if (entity != null && world != null) {
			int le = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			world.setBlockMetadataWithNotify(i, j, k, le, 2);
		}

		world.scheduleBlockUpdate(i, j, k, this, this.tickRate(world));

	}

	public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
		return red ? 1 : 0;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int i, int par2) {

		if (i == 0)
			return gor;

		else if (i == 1)
			return dol;

		else if (i == 2)
			return st1;

		else if (i == 3)
			return st2;

		else if (i == 4)
			return st4;

		else if (i == 5)
			return st3;

		else
			return gor;

	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.gor = reg.registerIcon("BlockJenCraftingTable");
		this.dol = reg.registerIcon("BlockJenCraftingTable");
		this.st1 = reg.registerIcon("BlockJenCraftingTable");
		this.st2 = reg.registerIcon("BlockJenCraftingTable");
		this.st3 = reg.registerIcon("BlockJenCraftingTable");
		this.st4 = reg.registerIcon("BlockJenCraftingTable");
	}

	public int getRenderType() {
		return 0;
	}

	@Override
	public int tickRate(World world) {
		return 10;
	}

	public int quantityDropped(Random par1Random) {
		return 1;
	}

}

