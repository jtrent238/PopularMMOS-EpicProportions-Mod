package com.jtrent238.epicproportions.gui.handler;

import com.jtrent238.epicproportions.gui.GuiModInfo;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiModInfoHandler implements IGuiHandler {

	public static final int MOD_INFO_GUI = 1645;
	private Minecraft mc;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_INFO_GUI)
            return new GuiModInfo(mc);

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == MOD_INFO_GUI)
            return new GuiModInfo(mc);

        return null;
    }
}