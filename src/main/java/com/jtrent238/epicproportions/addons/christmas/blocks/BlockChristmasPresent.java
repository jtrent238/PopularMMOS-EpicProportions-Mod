package com.jtrent238.epicproportions.addons.christmas.blocks;

import com.jtrent238.epicproportions.addons.christmas.ItemLoader;
import com.jtrent238.epicproportions.blocks.blockBirthdayPresent;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockChristmasPresent extends blockBirthdayPresent{

	private IIcon field_150115_b;
	private IIcon field_150116_a;

	public BlockChristmasPresent(Material ground) {
		super(ground);
	}

	 /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 0 ? this.field_150115_b : (p_149691_1_ == 1 ? this.field_150116_a : this.blockIcon);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_150116_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_150115_b = p_149651_1_.registerIcon(this.getTextureName() + "_bottom");
    }
    
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
	  {
	    return new ItemStack(ItemLoader.ItemChristmasPresent);
	  }
}
