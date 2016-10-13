package com.jtrent238.epicproportions.gui;

import com.jtrent238.epicproportions.EpicProportionsMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

public class GuiModInfo extends Gui
{
	private static ResourceLocation res_string;
	private static final ResourceLocation res = res_string;
	String text0 = "******************************************************************" ;
	String text1 = EpicProportionsMod.MODNAME;
    String text2 = "By: " + EpicProportionsMod.MODAUTHOR;
    String text3 = "You are Running " + EpicProportionsMod.MODVERSION + " of " + EpicProportionsMod.MODNAME;
    String text4 = "******************************************************************";
 		
 
    public GuiModInfo(Minecraft mc)
    {
        ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        int width = scaled.getScaledWidth();
        int height = scaled.getScaledHeight();
 
        drawCenteredString(mc.fontRenderer, text0, width / 2, (height / 2) - 22, Integer.parseInt("2aff11", 16));
        drawCenteredString(mc.fontRenderer, text1, width / 2, (height / 2) - 12, Integer.parseInt("2aff11", 16));
        drawCenteredString(mc.fontRenderer, text2, width / 2, (height / 2) - 2, Integer.parseInt("2aff11", 16));
        drawCenteredString(mc.fontRenderer, text3, width / 2, (height / 2) - (-8), Integer.parseInt("2aff11", 16));
        drawCenteredString(mc.fontRenderer, text4, width / 2, (height / 2) - (-18), Integer.parseInt("2aff11", 16));
        mc.getTextureManager().getTexture(res);
    }
    
    
}