package com.jtrent238.epicproportions;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import com.jtrent238.epicproportions.lib.LogHelper;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

	private static boolean isHalloweenLoaded;

	public static void addores() {

		OreDictionary.registerOre("orePat",     BlockLoader.blockPatOre);
		OreDictionary.registerOre("oreJen",     BlockLoader.blockJenOre);

		
		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();

        replacements.put(new ItemStack(ItemLoader.itemPatIngot), "ingotPat");
        replacements.put(new ItemStack(ItemLoader.itemJenIngot), "ingotJen");

	}

}
