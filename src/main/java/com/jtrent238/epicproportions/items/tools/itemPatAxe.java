package com.jtrent238.epicproportions.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;

public class itemPatAxe extends ItemAxe{

	public itemPatAxe(ToolMaterial EMERALD) {
		super(EMERALD);
	}

	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, 
		    Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
}
