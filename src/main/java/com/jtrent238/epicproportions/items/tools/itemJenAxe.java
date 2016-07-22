package com.jtrent238.epicproportions.items.tools;

import net.minecraft.item.ItemAxe;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;

public class itemJenAxe  extends ItemAxe{

	public itemJenAxe(ToolMaterial EMERALD) {
		super(EMERALD);
	}
	
	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, 
		    Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});

}
