package com.jtrent238.epicproportions.items;

import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.blocks.BlockEpicProportionsPortal;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemEpicProportionsWand extends Item {
	public ItemEpicProportionsWand() {
		super();
		this.maxStackSize = 1;
		setMaxDamage(64);
		setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	}
	public static BlockEpicProportionsPortal portal;
	
	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 list.add(EnumChatFormatting.GRAY.ITALIC + StatCollector.translateToLocal("tooltip." + EpicProportionsMod.MODID + "." + "ItemEpicProportionsWand" + "." + "info"));
	  }
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7,
			float par8, float par9, float par10) {
		if (par7 == 0) {
			par5--;
		}
		if (par7 == 1) {
			par5++;
		}
		if (par7 == 2) {
			par6--;
		}
		if (par7 == 3) {
			par6++;
		}
		if (par7 == 4) {
			par4--;
		}
		if (par7 == 5) {
			par4++;
		}
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
			return false;
		}
		Block i1 = par3World.getBlock(par4, par5, par6);
		if (i1 == Blocks.air) {
			par3World.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
			//portal.tryTroCreatePortal(par3World, par2EntityPlayer.serverPosX, par2EntityPlayer.serverPosY, par2EntityPlayer.serverPosZ);
		}
		par1ItemStack.damageItem(1, par2EntityPlayer);
		return true;
	}
}