package com.jtrent238.epicproportions.addons.christmas.blocks;

import java.util.Random;

import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;
import com.jtrent238.epicproportions.addons.christmas.tileentity.TileEntityBulb;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBulb extends Block{

	int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

	Random field_149942_b = new Random();

	IIcon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

	boolean red = false;
	
	public BlockBulb(Material p_i45394_1_) {
		super(p_i45394_1_);
		//this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setLightLevel(6F);
		//this.setBlockName("BlockLight");
		//this.setBlockTextureName("BlockBulb_red");
		this.setLightOpacity(0);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
		this.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
		//this.blockRegistry.addObject(176, "BlockLight", block);
		this.setHarvestLevel("pickaxe", 0);
	}
	
	public TileEntity createNewTileEntity(World var1, int var2){return new TileEntityBulb();}
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int i, int par2){

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
public void registerBlockIcons(IIconRegister reg){
this.gor = reg.registerIcon("BlockBulb_red");
this.dol = reg.registerIcon("BlockBulb_red");
this.st1 = reg.registerIcon("BlockBulb_red");
this.st2 = reg.registerIcon("BlockBulb_red");
this.st3 = reg.registerIcon("BlockBulb_red");
this.st4 = reg.registerIcon("BlockBulb_red");
}
public boolean isOpaqueCube()
{
return false;
}

public boolean renderAsNormalBlock()
{
return false;
}

public int getRenderType(){
return -1;
}
@Override
public int tickRate(World world)
{
    return 10;
}

public int quantityDropped(Random par1Random){
return 1;
}

}
