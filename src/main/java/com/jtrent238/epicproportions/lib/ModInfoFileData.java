package com.jtrent238.epicproportions.lib;

import java.io.IOException;

import com.jtrent238.epicproportions.EpicProportionsMod;

import net.minecraft.client.Minecraft;
import net.minecraft.profiler.PlayerUsageSnooper;

public class ModInfoFileData {

	private static	String text0 = "******************************************************************" ;
	private static	String text1 = EpicProportionsMod.MODNAME;
	private static String text2 = "By: " + EpicProportionsMod.MODAUTHOR;
    private static String text3 = "You are Running " + EpicProportionsMod.MODVERSION + " of " + EpicProportionsMod.MODNAME;
    private static String text4 = "******************************************************************";
    
    
    private static String text5 = "##################################################################";
    private static String text6 = "#######################  Minecraft Information ##################";
    private static String text7 = "##################################################################";
    private static boolean text8 = Minecraft.getMinecraft().isJava64bit();
    //private static long text9 = Minecraft.getSystemTime();
    //private static PlayerUsageSnooper text10 = Minecraft.getMinecraft().getPlayerUsageSnooper();
    private static boolean text11 = Minecraft.getMinecraft().isDemo();
	
    
	 public static void main(String[] args) throws IOException {
		 
		 String file_name = EpicProportionsMod.MODID + ".info.txt";
		 
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
	 WriteModInfoToFile data = new WriteModInfoToFile(file_name, true);
	 data.writeToFile(text0);
	 data.writeToFile(text1);
	 data.writeToFile(text2);
	 data.writeToFile(text3);
	 data.writeToFile(text4);
	 	
	 
	 if(EpicProportionsMod.ENABLE_DETAILED_MOD_INFO == true){
		 
		 data.writeToFile(text5);
		 data.writeToFile(text6);
		 data.writeToFile(text7);
		 data.writeToFile(text8);
		 //data.writeToFile(text9);
		 //data.writeToFile(text10);
		 data.writeToFile(text11);
		 
	 	}
	 }
}
