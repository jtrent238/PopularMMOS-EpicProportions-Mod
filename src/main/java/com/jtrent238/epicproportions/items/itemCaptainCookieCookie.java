package com.jtrent238.epicproportions.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockJukebox;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class itemCaptainCookieCookie extends ItemRecord
{
 private static final Map records = new HashMap();


 public final String recordName;


 public itemCaptainCookieCookie(String recordName)
 {
 super(recordName);


 this.recordName = recordName;
 this.maxStackSize = 1;


 

 records.put(recordName, this);
 }


 @Override
 public void registerIcons(IIconRegister iconRegister)
 {
 itemIcon = iconRegister.registerIcon("epicproportionsmod:" + "record_" + recordName);
 }


 @Override
 public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
 {
 //TODO: world.getBlock()
 if (world.getBlock(x, y, z) == Blocks.jukebox && world.getBlockMetadata(x, y, z) == 0)
 {
 if (world.isRemote)
 return true;
 else
 {
 //TODO: .insertRecord()
 ((BlockJukebox)Blocks.jukebox).func_149926_b(world, x, y, z, itemStack);
 //TODO: Item.getIdFromItem()
 world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x, y, z, Item.getIdFromItem(this));
 --itemStack.stackSize;
 return true;
 }
 } 
 else
 return false;
 }


 /**
  * allows items to add custom lines of information to the mouseover description
  */
 @SideOnly(Side.CLIENT)
 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_)
 {
     p_77624_3_.add(this.getRecordNameLocal());
 }

 @SideOnly(Side.CLIENT)
 public String getRecordNameLocal()
 {
	 return StatCollector.translateToLocal("hmm... Something seems odd about this cookie.");
	 //return StatCollector.translateToLocal("Captain Cookie Music CD");
 }


 @Override
 public EnumRarity getRarity(ItemStack itemStack)
 {
 return EnumRarity.rare;
 }


 public static itemCaptainCookieCookie getRecord(String par0Str)
 {
 return (itemCaptainCookieCookie)records.get(par0Str);
 }


 @Override
 public ResourceLocation getRecordResource(String name)
 {
 return new ResourceLocation("epicproportionsmod:" + name);
 }
}

 