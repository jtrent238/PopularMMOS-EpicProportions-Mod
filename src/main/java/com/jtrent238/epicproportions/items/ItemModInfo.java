package com.jtrent238.epicproportions.items;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.gui.GuiModInfo;
import com.jtrent238.epicproportions.gui.handler.GuiModInfoHandler;
import com.jtrent238.epicproportions.items.tools.staffs.itemPatStaff;
import com.mojang.realmsclient.client.Request.Get;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class ItemModInfo extends Item{
	
	@Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {

        if (!world.isRemote) {
            entityPlayer.openGui(EpicProportionsMod.instance, GuiModInfoHandler.MOD_INFO_GUI, entityPlayer.worldObj, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
        }

        return itemStack;
    }
}