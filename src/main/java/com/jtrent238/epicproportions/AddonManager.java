package com.jtrent238.epicproportions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;

import com.jtrent238.epicproportions.lib.LogHelper;

import cpw.mods.fml.common.Loader;
import scala.collection.immutable.List;
import scala.collection.immutable.Map;
import scala.util.parsing.json.JSONArray;
import scala.util.parsing.json.JSONObject;

public class AddonManager {

	public static ArrayList<String> LoadedAddons = new ArrayList<String>();
	
	static ArrayList<String> AddonName = new ArrayList<String>();
	static ArrayList<String> AddonId = new ArrayList<String>();
	static ArrayList<String> ModId = new ArrayList<String>();
	static ArrayList<String> AddonVersion = new ArrayList<String>();
	static ArrayList<String> AddonAuthor = new ArrayList<String>();
	
	private static boolean halloweenloaded;
	private static boolean christmasloaded;
	
	private static String name= "Addon Name: ";
	private static String id= "Addon ID: ";
	private static String version= "Addon Version: ";
	private static String author= "Addon Author: ";
	
	
	//private static Map<String, Object> map;
	//static Map<String, Object> MapAddonName = (Map<String, Object>) new HashMap<>();
	//static Map<String, Object> MapAddonId = (Map<String, Object>) new HashMap<>();
	//static Map<String, Object> MapAddonVersion = (Map<String, Object>) new HashMap<>();
	//static Map<String, Object> MapAddonAuthor = (Map<String, Object>) new HashMap<>();


	
	public static void registerAddons() {
		
		//JSONObject joAddonName = new JSONObject(MapAddonName);
		//JSONObject joAddonId = new JSONObject((Map<String, Object>) MapAddonId);
		//JSONObject joAddonVersion = new JSONObject((Map<String, Object>) MapAddonVersion);
		//JSONObject joAddonAuthor = new JSONObject((Map<String, Object>) MapAddonAuthor);
		
		//Halloween Addon
		if(Loader.isModLoaded("epicproportionsmod_halloween")){
			//Halloween Addon
			AddonName.add(0, com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween.ADDONNAME);
				//((HashMap<Object, Object>) MapAddonName).put("AddonName", "Halloween Addon");
			AddonId.add(0, com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween.ADDONID);
				//((HashMap<Object, Object>) MapAddonId).put("AddonId", "epicproportionsmod_halloween");
			ModId.add(0, com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween.ADDONID);
			//((HashMap<Object, Object>) MapModId).put("ModId", "epicproportionsmod_christmas");
			AddonVersion.add(0, com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween.MODVERSION);
				//((HashMap<Object, Object>) MapAddonVersion).put("AddonVersion", "1.0.1.1");
			AddonAuthor.add(0, com.jtrent238.epicproportions.addons.halloween.epicproportionsmod_halloween.MODAUTHOR);
				//((HashMap<Object, Object>) MapAddonAuthor).put("AddonAuthor", "jtrent238");
			halloweenloaded = true;
		
		}
			else
				System.out.println("Halloween Addon NOT FOUND!!!");
		
		//Christmas Addon
		if(Loader.isModLoaded("epicproportionsmod_christmas")){
			AddonName.add(1, com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas.ADDONNAME);
				//((HashMap<Object, Object>) MapAddonName).put("AddonName", "Christmas Addon");
			AddonId.add(1, com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas.ADDONID);
				//((HashMap<Object, Object>) MapAddonId).put("AddonId", "epicproportionsmod_christmas");
			ModId.add(1, com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas.MODID);
			//((HashMap<Object, Object>) MapModId).put("ModId", "epicproportionsmod_christmas");
			AddonVersion.add(1, com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas.MODVERSION);
				//((HashMap<Object, Object>) MapAddonVersion).put("AddonVersion", "1.0.0.0");
			AddonAuthor.add(1, com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas.MODAUTHOR);
				//((HashMap<Object, Object>) MapAddonAuthor).put("AddonAuthor", "jtrent238");
			christmasloaded = true;
		}
			else
				System.out.println("Christmas Addon NOT FOUND!!!");
		
		if(halloweenloaded == true){
			LoadedAddons.add("Halloween Addon (" + AddonId.get(0) + ")");
			System.out.println(AddonName.get(0) + " FOUND");
			System.out.println(name + AddonName.get(0));
			System.out.println(id + AddonId.get(0));
			System.out.println(version + AddonVersion.get(0));
			System.out.println(author + AddonAuthor.get(0));
		}
		if(halloweenloaded == false) {
			LogHelper.log(Level.SEVERE, "Could not load Halloween Addon");
		}
		
		if(christmasloaded == true){
			LoadedAddons.add("Christmas Addon (" + AddonId.get(1) + ")");
			System.out.println(AddonName.get(1) + " FOUND");
			System.out.println(name + AddonName.get(1));
			System.out.println(id + AddonId.get(1));
			System.out.println(version + AddonVersion.get(1));
			System.out.println(author + AddonAuthor.get(1));
		}
		if(christmasloaded == false) {
			LogHelper.log(Level.SEVERE, "Could not load Christmas Addon");
		}
	}
	
}
