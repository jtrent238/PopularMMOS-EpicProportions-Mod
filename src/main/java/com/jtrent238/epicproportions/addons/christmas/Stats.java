package com.jtrent238.epicproportions.addons.christmas;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatBasic;
import net.minecraft.util.ChatComponentTranslation;

public class Stats {

	public static StatBase JingleBellsJingled;

	public static void RegisterStats() {
		
		JingleBellsJingled = new StatBasic("stat.JingleBellsJingled", new ChatComponentTranslation("stat.JingleBellsJingled", new Object[0])).initIndependentStat().registerStat();
		
	}
}
