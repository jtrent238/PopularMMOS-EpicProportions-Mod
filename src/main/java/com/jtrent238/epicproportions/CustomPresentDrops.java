package com.jtrent238.epicproportions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.block.Block;

public class CustomPresentDrops {

	
	public static Block Common;
	public static Block Rare;
	public static float DropChance_Rare;
	public static int Amount_Common;
	public static int DropChance_Common;
	private BufferedReader readIn;
	private Integer dimX;
	private Integer dimY;
	private Integer dimZ;
	private String[][][] blockNameArray;
	private int[][][] blockMetaArray;
	
	protected void readArrays(String parName)
	{
	    try 
	    {
	        System.out.println("Reading file = "+ parName +".txt");
	        readIn = new BufferedReader(new InputStreamReader(getClass().getClassLoader()
	            .getResourceAsStream("assets/epicproportions/config/"+ parName +".txt"), "UTF-8"));
	        dimX = Integer.valueOf(readIn.readLine());
	        dimY = Integer.valueOf(readIn.readLine());
	        dimZ = Integer.valueOf(readIn.readLine());
	        blockNameArray = new String[dimX][dimY][dimZ];
	        blockMetaArray = new int[dimX][dimY][dimZ];
	        System.out.println("Dimensions of structure = "+dimX+", "+dimY+", "+dimZ);
	        for (int indY = 0; indY < dimY; indY++) // Y first to organize in vertical layers
	        {
	            for (int indX = 0; indX < dimX; indX++)
	            {
	                for (int indZ = 0; indZ < dimZ; indZ++)
	                {
	                    blockNameArray[indX][indY][indZ] = readIn.readLine();
	                    blockMetaArray[indX][indY][indZ] = Integer.valueOf(readIn.readLine());
	                }
	            }
	        }
	    } 
	    catch (FileNotFoundException e) 
	    {
	        // replace this with better exception handling

	        e.printStackTrace();
	    } 
	    catch (IOException e) 
	    {
	        // replace this with better exception handling


	        e.printStackTrace();
	    }
	    // remember to close the stream to avoid memory leaks     


	    try 
	    {
	        readIn.close();
	    } 
	    catch (IOException e)
	    {
	       // replace this with better exception handling


	        e.printStackTrace();
	    }
	}
}