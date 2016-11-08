package com.jtrent238.epicproportions.addons.halloween;

import java.util.HashMap;
import java.util.Map;


import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

	public static void addores() {

		OreDictionary.registerOre("oreSpooky",     BlockLoader.blockSpookyEssenceOre);
		
		
		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();

        replacements.put(new ItemStack(ItemLoader.itemSpookyIngot), "ingotSpooky");

	}

}
