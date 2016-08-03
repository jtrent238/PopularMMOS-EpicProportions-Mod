package com.jtrent238.epicproportions.items.tools;

import java.util.Set;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class itemPickOfEpicProportions extends ItemPickaxe{

	public itemPickOfEpicProportions(float p_i45333_1_, ToolMaterial EMERALD, Set p_i45333_3_) {
		super(EMERALD);
		this.efficiencyOnProperMaterial = 50000.0F;
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
