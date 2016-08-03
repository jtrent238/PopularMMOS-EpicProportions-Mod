/**
 * 
 */
package com.jtrent238.epicproportions.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

/**
 * @author trent
 *
 */
public class itemHoeOfEpicProportions  extends ItemHoe{

	private float field_150934_a;

	public itemHoeOfEpicProportions(ToolMaterial EMERALD) {
		super(EMERALD);
		this.field_150934_a = 50000.0F;
	}
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
