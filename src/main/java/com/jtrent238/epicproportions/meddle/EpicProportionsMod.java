package com.jtrent238.epicproportions.meddle;

import java.io.File;

import com.jtrent238.epicproportions.meddle.common.CommonProxy;
import com.jtrent238.epicproportions.meddle.items.itemgemofepicproportions;

import cpw.mods.fml.common.Mod;
import net.fybertech.meddle.Meddle;
import net.fybertech.meddle.MeddleMod;
import net.fybertech.meddleapi.ConfigFile;
import net.fybertech.meddleapi.MeddleAPI;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

@MeddleMod(id="epicproportionsmod1", name="jtrent238's EpicProportions Mod", version=(com.jtrent238.epicproportions.EpicProportionsMod.MODVERSION), author="jtrent238")

public class EpicProportionsMod {
	
	public static itemgemofepicproportions itemgemofepicproportions = new itemgemofepicproportions();
	public static CommonProxy proxy;
	
	private static final int DEFAULT_ITEM_ID = 6541;
	private int itemgemofepicproportionsID = 9842;
	
	
	private void loadConfig()
	{
		ConfigFile config = new ConfigFile(new File(Meddle.getConfigDir(), com.jtrent238.epicproportions.EpicProportionsMod.MODID + ".cfg"));
		config.load();
		
		itemgemofepicproportionsID = config.get(ConfigFile.key("itemgemofepicproportionsID", DEFAULT_ITEM_ID));
		
		if (config.hasChanged()) config.save();
	}
	
	
	public void init()
	{
		loadConfig();	
		Meddle.LOGGER.info("[" + com.jtrent238.epicproportions.EpicProportionsMod.MODNAME + "]" + " Using item id " + itemgemofepicproportionsID);
		
		MeddleAPI.registerItem(itemgemofepicproportionsID, "itemgemofepicproportions",  itemgemofepicproportions);
		
		//CraftingManager.getInstance().addRecipe(new ItemStack(journeyStone), " S ", "RER", " S ", Character.valueOf('S'), Blocks.stone, Character.valueOf('R'), Items.redstone, Character.valueOf('E'), Items.ender_pearl); 
		
		proxy = (CommonProxy)MeddleAPI.createProxyInstance("com.jtrent238.epicproportions.meddle.CommonProxy", "com.jtrent238.epicproportions.meddle.ClientProxy");
		proxy.init();		
	}
	
}