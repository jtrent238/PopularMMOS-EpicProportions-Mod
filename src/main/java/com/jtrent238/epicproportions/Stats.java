package com.jtrent238.epicproportions;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatBasic;
import net.minecraft.util.ChatComponentTranslation;

public class Stats {

	public static StatBase presentsbroken;
	public static StatBase KilledPat;
	public static StatBase KilledJen;
	public static StatBase KilledCC;

	public static void RegisterStats() {
		
		presentsbroken = new StatBasic("stat.presentsbroken", new ChatComponentTranslation("stat.presentsbroken", new Object[0])).initIndependentStat().registerStat();
		KilledPat = new StatBasic("stat.KilledPat", new ChatComponentTranslation("stat.KilledPat", new Object[0])).initIndependentStat().registerStat();
		KilledJen = new StatBasic("stat.KilledJen", new ChatComponentTranslation("stat.KilledJen", new Object[0])).initIndependentStat().registerStat();
		KilledCC = new StatBasic("stat.KilledCC", new ChatComponentTranslation("stat.KilledCC", new Object[0])).initIndependentStat().registerStat();
		
	}
}
