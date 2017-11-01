package com.jtrent238.epicproportions.addons.halloween;

import java.util.HashMap;
import java.util.Map;


import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

	public static void addores() {

		OreDictionary.registerOre("ore_Spooky",     BlockLoader.blockSpookyEssenceOre);
			OreDictionary.registerOre("ingot_Spooky",     ItemLoader.itemSpookyIngot);
			OreDictionary.registerOre("block_Spooky",     BlockLoader.blockSpookyIngot);
		OreDictionary.registerOre("ore_Halloween",     BlockLoader.blockHalloweenEssenceOre);
			OreDictionary.registerOre("ingot_Halloween",     ItemLoader.itemHalloweenIngot);
			OreDictionary.registerOre("block_Halloween",     BlockLoader.blockHalloweenIngot);
		
		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();

        replacements.put(new ItemStack(ItemLoader.itemSpookyIngot), "ingotSpooky");

	}

}
