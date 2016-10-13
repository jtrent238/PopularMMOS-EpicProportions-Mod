package com.jtrent238.epicproportions.items;

import com.jtrent238.epicproportions.gui.GuiModInfo;
import com.jtrent238.epicproportions.items.tools.staffs.itemPatStaff;

import net.minecraft.client.Minecraft;
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
	
	public void onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer, RenderGameOverlayEvent.Post event, Object p_149727_1_)
	{
		if (event.type != ElementType.EXPERIENCE) return;
		new GuiModInfo(Minecraft.getMinecraft());

            
            return ;
        }
    }

