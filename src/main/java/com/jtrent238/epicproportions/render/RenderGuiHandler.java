package com.jtrent238.epicproportions.render;

import com.jtrent238.epicproportions.gui.GuiModInfo;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class RenderGuiHandler {

	@SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Post event)
    {
		if (event.type != ElementType.EXPERIENCE) return;
		new GuiModInfo(Minecraft.getMinecraft());
    }
	
}
