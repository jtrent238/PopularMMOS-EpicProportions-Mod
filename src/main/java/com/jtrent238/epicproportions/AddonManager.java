package com.jtrent238.epicproportions;

import java.util.ArrayList;

import cpw.mods.fml.common.Loader;

public class AddonManager {

	static ArrayList<String> AddonName = new ArrayList<String>();
	static ArrayList<String> AddonId = new ArrayList<String>();
	static ArrayList<String> AddonVersion = new ArrayList<String>();
	static ArrayList<String> AddonAuthor = new ArrayList<String>();
	
	private static boolean halloweenloaded;
	private static boolean christmasloaded;
	
	private static String name= "Addon Name: ";
	private static String id= "Addon ID: ";
	private static String version= "Addon Version: ";
	private static String author= "Addon Author: ";

	
	public static void registerAddons() {
		
		//Halloween Addon
		if(Loader.isModLoaded("epicproportionsmod_halloween")){
			//Halloween Addon
			AddonName.add(0, "Halloween Addon");
			AddonId.add(0, "epicproportionsmod_halloween");
			AddonVersion.add(0, "1.0.1.1");
			AddonAuthor.add(0, "jtrent238");
			halloweenloaded = true;
		}
			else
				System.out.println("Halloween Addon NOT FOUND!!!");
		
		//Christmas Addon
		if(Loader.isModLoaded("epicproportionsmod_christmas")){
			AddonName.add(1, "Christmas Addon");
			AddonId.add(1, "epicproportionsmod_christmas");
			AddonVersion.add(1, "1.0.0.0");
			AddonAuthor.add(1, "jtrent238");
			christmasloaded = true;
		}
			else
				System.out.println("Christmas Addon NOT FOUND!!!");
		
		if(halloweenloaded == true){
			System.out.println(AddonName.get(0) + " FOUND");
			System.out.println(name + AddonName.get(0));
			System.out.println(id + AddonId.get(0));
			System.out.println(version + AddonVersion.get(0));
			System.out.println(author + AddonAuthor.get(0));
		}
		if(christmasloaded == true){
			System.out.println(AddonName.get(1) + " FOUND");
			System.out.println(name + AddonName.get(1));
			System.out.println(id + AddonId.get(1));
			System.out.println(version + AddonVersion.get(1));
			System.out.println(author + AddonAuthor.get(1));
		}
	}
}
