package com.jtrent238.epicproportions;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatBasic;
import net.minecraft.util.ChatComponentTranslation;

public class Stats {

	public static StatBase presentsbroken;
	public static StatBase KilledPat;
	public static StatBase KilledJen;
	public static StatBase KilledCC;
	public static StatBase SOEP_Crafted;
	public static StatBase SuperToolCrafted;
	public static StatBase SuperArmorCrafted;

	public static void RegisterStats() {
		
		presentsbroken = new StatBasic("stat.presentsbroken", new ChatComponentTranslation("stat.presentsbroken", new Object[0])).initIndependentStat().registerStat();
		KilledPat = new StatBasic("stat.KilledPat", new ChatComponentTranslation("stat.KilledPat", new Object[0])).initIndependentStat().registerStat();
		KilledJen = new StatBasic("stat.KilledJen", new ChatComponentTranslation("stat.KilledJen", new Object[0])).initIndependentStat().registerStat();
		KilledCC = new StatBasic("stat.KilledCC", new ChatComponentTranslation("stat.KilledCC", new Object[0])).initIndependentStat().registerStat();
		SOEP_Crafted = new StatBasic("stat.SOEP_Crafted", new ChatComponentTranslation("stat.SOEP_Crafted", new Object[0])).initIndependentStat().registerStat();
		SuperToolCrafted = new StatBasic("stat.SuperToolCrafted", new ChatComponentTranslation("stat.SuperToolCrafted", new Object[0])).initIndependentStat().registerStat();
		SuperArmorCrafted = new StatBasic("stat.SuperArmorCrafted", new ChatComponentTranslation("stat.SuperArmorCrafted", new Object[0])).initIndependentStat().registerStat();
		
	}
}
