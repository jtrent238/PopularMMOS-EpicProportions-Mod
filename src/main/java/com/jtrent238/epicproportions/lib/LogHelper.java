package com.jtrent238.epicproportions.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.ChestGenHooksMod;
import com.jtrent238.epicproportions.EntityLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;
import com.jtrent238.epicproportions.Recipes;
import com.jtrent238.epicproportions.Stats;
import com.jtrent238.epicproportions.tileentity.TileEntityLoader;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

	public class LogHelper {
		private static Logger logger = Logger.getLogger(EpicProportionsMod.MODNAME);

		public static void init() {
			
			LogHelper.log(Level.ALL, null);
			
			LogHelper.log(Level.INFO, "Preparing items");
				ItemLoader.LoadItems();
			LogHelper.log(Level.INFO, "Items loaded");

			LogHelper.log(Level.INFO, "Preparing blocks");
				BlockLoader.loadBlocks();
			LogHelper.log(Level.INFO, "Blocks loaded");

			LogHelper.log(Level.INFO, "Preparing recipes");
				Recipes.registerRecpies();
			LogHelper.log(Level.INFO, "Recipes loaded");
			
			LogHelper.log(Level.INFO, "Preparing Entitys");
				EntityLoader.LoadEntitys();
			LogHelper.log(Level.INFO, "Entitys loaded");
			
			LogHelper.log(Level.INFO, "Preparing TileEntitys");
				TileEntityLoader.mainRegistry();
			LogHelper.log(Level.INFO, "TileEntitys loaded");
			
			LogHelper.log(Level.INFO, "Preparing Achievements");
				Achievements.loadAchievements();
			LogHelper.log(Level.INFO, "Achievements loaded");
			
			LogHelper.log(Level.INFO, "Preparing Stats");
				Stats.RegisterStats();
			LogHelper.log(Level.INFO, "Stats loaded");
			
				/*
			LogHelper.log(Level.INFO, "Preparing ChestGenHooks");
			ChestGenHooksMod.Register();
			LogHelper.log(Level.INFO, "ChestGenHooks loaded");
				 */
			
			}

		public static void log(Level logLevel, String message) {
			logger.log(logLevel, message);
		}


		

		{
			
		}

		}
		
