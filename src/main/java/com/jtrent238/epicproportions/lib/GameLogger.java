package com.jtrent238.epicproportions.lib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jtrent238.epicproportions.EpicProportionsMod;

/**
 * Custom logger to log all details from mod to help with peoples issues.
 */
public class GameLogger {

	public static GameLogger log = new GameLogger();

	static File FoodModFolder;
	static File FoodModLogFolder;
	static File configFoodModFolder;
	
	private static String dir = System.getenv("AppData") + "/.minecraft/";

	private static boolean configured;

	private Logger myLog;

	/**
	 * Configure the FoodMod logger
	 */
	private static void configureLogging() {
		log.myLog = Logger.getLogger(EpicProportionsMod.MODID + "-DIMENSION");
		configured = true;
	}

	public static void log(String targetLog, Level level, String msg, Object... data) {
		Logger.getLogger(targetLog).log(level, String.format(msg, data));
	}

	public static void log(Level level, String msg) {
		if (!configured) {
			configureLogging();
		}
		log.myLog.log(level, String.format(msg));
	}

	public static void log(String targetLog, Level level, Throwable ex, String msg, Object... data) {
		Logger.getLogger(targetLog).log(level, String.format(msg, data), ex);
	}

	public static void log(Level level, Throwable ex, String msg, Object... data) {
		if (!configured) {
			configureLogging();
		}
		log.myLog.log(level, String.format(msg, data), ex);
	}

	public static void severe(String msg, Object... data) {
		log(Level.SEVERE, msg);
	}

	public static void warning(String msg, Object... data) {
		log(Level.WARNING, msg);
	}

	/**
	 * 
	 * @param msg
	 */
	public static void info(String msg) {
		log(Level.INFO, msg);
	}

	/**
	 * Gets this FoodMod Logger.
	 * 
	 * @return
	 */
	public Logger getLogger() {
		return myLog;
	}

	/**
	 * Creates FoodMod folder.
	 * Creates Config folder in FoodMod folder.
	 */
	/*public static void createFolders() {
		FoodModFolder = new File(dir, "FoodMod");
		FoodModLogFolder = new File(dir + "FoodMod/FoodModLog/");
		configFoodModFolder = new File(dir + "FoodMod/Configs/");
		
		if (FoodModFolder.exists() != true || configFoodModFolder.exists() != true) {
			FoodModFolder.mkdirs();
			FoodModLogFolder.mkdirs();
			configFoodModFolder.mkdirs();
		}
	}
*/
	/**
	 * Write text to the FoodModLog.log.
	 * 
	 * @param level
	 * @param text
	 */
	@SuppressWarnings("resource")
	public static void writeToFile(Level level, String text) {
		File file;
		FileWriter writer;
		String newLine = System.getProperty("line.separator");
		try {
			file = new File(EpicProportionsMod.MODID, EpicProportionsMod.MODID + ".log");
			file.createNewFile(); // if file already exists will do nothing 
			FileOutputStream oFile = new FileOutputStream(file, true); 
			writer = new FileWriter(file, true);
			writer.write("[" + EpicProportionsMod.MODID + "]" + "[" + level + "]" + " : " + text + newLine);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets Base file path
	 */
	public static String getFilePath(){
		return dir;
	}
}