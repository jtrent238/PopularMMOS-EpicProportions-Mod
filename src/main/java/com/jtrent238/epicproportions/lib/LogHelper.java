package com.jtrent238.epicproportions.lib;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		private static LogHelper log;

			static DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
			static Date dateobj = new Date();
	       
		private static String text0 = "******************************************************************" ;
		private static String text1 = EpicProportionsMod.MODNAME;
		private static String text2 = "By: " + EpicProportionsMod.MODAUTHOR;
	    private static String text3 = "You are Running " + EpicProportionsMod.MODVERSION + " of " + EpicProportionsMod.MODNAME;
	    private static String text4 = "The time is: " + df.format(dateobj);
	    private static String text5 = "******************************************************************";
	    
		
		 	
		public static void init() {
			
				
			LogHelper.log(Level.ALL, null);
			/*
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
			*/
				/*
			LogHelper.log(Level.INFO, "Preparing ChestGenHooks");
			ChestGenHooksMod.Register();
			LogHelper.log(Level.INFO, "ChestGenHooks loaded");
				 */
			
			
			}

		public static void log(Level logLevel, String message) {
			logger.log(logLevel, message);
			Logger.getGlobal();
			
		}
		private File LoggerFile;

		

		{
			
		}

		private static LogHelper gameLogger = LogHelper.log;

		public static void log(String targetLog, Level level, String message, Object... data) {
			gameLogger.log(targetLog, level, message, data);
		}

		public static void log(Level level, String message, Object... data) {
			gameLogger.log(level, message);
		}

		public static void log(String targetLog, Level level, Throwable ex, String message, Object... data) {
			gameLogger.log(targetLog, level, ex, message, data);
		}

		public static void log(Level level, Throwable ex, String message, Object... data) {
			gameLogger.log(level, ex, message, data);
		}

		public static void severe(String message) {
			log(Level.SEVERE, message);
		}

		public static void bigWarning(String format, Object... data) {
			StackTraceElement[] trace = Thread.currentThread().getStackTrace();
			log(Level.WARNING, "****************************************");
			log(Level.WARNING, "* " + format, data);
			for (int i = 2; i < 8 && i < trace.length; i++) {
				log(Level.WARNING, "*  at %s%s", trace[i].toString(), i == 7 ? "..." : "");
			}
			log(Level.WARNING, "****************************************");
		}

		public static void warning(String message) {
			log(Level.WARNING, message);
		}

		public static void info(String message) {
			log(Level.INFO, message);
		}

		public static Logger getLogger() {
			return gameLogger.getLogger();
		}

		/**
		 * Writes to the log text file.
		 * @param level
		 * @param text
		 */
		public static void writeToLog(Level level, String text) {
			gameLogger.writeToLog(level, text);
		}
		

		public static void main(String[] args) throws IOException {
			 
			 String file_name = EpicProportionsMod.MODID + ".log";
			 
		 /* try (
					 ReadFile file = new ReadFile(file_name);
					 String[] aryLines = file.OpenFile();
					 int i;
					 for (i=0; i aryLines.length; i++) ()
					 		System.out.println(aryLines[i]);
					 )
		 )
			catch (IOException e) {
				System.out.println("Sorry, dude - no can do!");
			}*/
		 
			 
			 
		 
		 //=========================
		 //	WRITE TO A FILE
		 //=========================
		 WriteLogToFile data = new WriteLogToFile(file_name, true);
		 data.writeToFile(text0);
		 data.writeToFile(text1);
		 data.writeToFile(text2);
		 data.writeToFile(text3);
		 data.writeToFile(text4);
		 data.writeToFile(text5);
		 data.writeToFile(log);
		 
		 	
		 		/*
		 	data.writeToFile( "Preparing items");
		 		ItemLoader.LoadItems();
			data.writeToFile( "Items loaded");
				
			data.writeToFile( "Preparing blocks");
				BlockLoader.loadBlocks();
			data.writeToFile( "Blocks loaded");
		
			data.writeToFile( "Preparing recipes");
				Recipes.registerRecpies();
			data.writeToFile( "Recipes loaded");
			
			data.writeToFile( "Preparing Entitys");
				EntityLoader.LoadEntitys();
			data.writeToFile( "Entitys loaded");
			
			data.writeToFile( "Preparing TileEntitys");
				TileEntityLoader.mainRegistry();
			data.writeToFile( "TileEntitys loaded");

			data.writeToFile( "Preparing Achievements");
				Achievements.loadAchievements();
			data.writeToFile( "Achievements loaded");

			data.writeToFile( "Preparing Stats");
				Stats.RegisterStats();
			data.writeToFile( "Stats loaded");
				*/
		}
	}
	