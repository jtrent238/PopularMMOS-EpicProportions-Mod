package com.jtrent238.epicproportions;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatBasic;
import net.minecraft.util.ChatComponentTranslation;

public class Stats {

	public static StatBase presentsbroken;

	public static void RegisterStats() {
		
		presentsbroken = new StatBasic("stat.presentsbroken", new ChatComponentTranslation("stat.presentsbroken", new Object[0])).initIndependentStat().registerStat();
		
	}
}
