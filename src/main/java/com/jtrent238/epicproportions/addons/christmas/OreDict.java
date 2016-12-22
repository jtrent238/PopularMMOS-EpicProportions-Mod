package com.jtrent238.epicproportions.addons.christmas;

import java.util.HashMap;
import java.util.Map;


import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {


	public static void addores() {

		OreDictionary.registerOre("oreCandyCane",     BlockLoader.BlockCandyCaneOre);

		
		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();

        //replacements.put(new ItemStack(ItemLoader.ItemCandyCaneIngot), "ingotCandyCane");
        replacements.put(new ItemStack(ItemLoader.ItemCandyCane), "ingotCandyCane");

	}

}
