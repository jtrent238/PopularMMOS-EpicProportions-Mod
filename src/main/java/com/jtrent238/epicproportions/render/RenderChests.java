package com.jtrent238.epicproportions.render;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.render.tileentity.TileEntityChestPatRenderer;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;

public class RenderChests extends TileEntityChestRenderer{
	
	private static final String MODID = EpicProportionsMod.MODID;

	private static void registerTileEntity() {
	
		GameRegistry(TileEntityChestPatRenderer.class, MODID);
	}

	private static void GameRegistry(Class<TileEntityChestPatRenderer> class1, String modid2) {
		
	}

	public static void RenderTileEntitys() {
		
	}

}
