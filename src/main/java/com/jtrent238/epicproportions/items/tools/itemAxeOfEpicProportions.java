/**
 * 
 */
package com.jtrent238.epicproportions.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

/**
 * @author trent
 *
 */
public class itemAxeOfEpicProportions extends ItemAxe{

	public itemAxeOfEpicProportions(ToolMaterial EMERALD) {
		super(EMERALD);
		this.efficiencyOnProperMaterial = 50000.0F;
	}

	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, 
		    Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return true;
    }
	
	/**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_)
    {
        return false;
    }
}
