package com.jtrent238.epicproportions.items.structureplacers;

import java.util.List;

import com.jtrent238.epicproportions.BlockLoader;
import com.jtrent238.epicproportions.EpicProportionsMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemMegaBirthdayPresentPlacer extends Item{



public ItemMegaBirthdayPresentPlacer(int par1){
setMaxDamage(0);
maxStackSize = 1;
setUnlocalizedName("ItemMegaBirthdayPresentPlacer");
setTextureName("epicproportionsmod:ItemMegaBirthdayPresentPlacer");
setCreativeTab(EpicProportionsMod.EpicProportionsMod);
}

@Override
@SideOnly(Side.CLIENT)
public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
list.add(EnumChatFormatting.GOLD + StatCollector.translateToLocal("tooltip." + EpicProportionsMod.MODID + "." + "ItemMegaBirthdayPresentPlacer" + "." + "bday"));
list.add(EnumChatFormatting.ITALIC + StatCollector.translateToLocal("tooltip." + EpicProportionsMod.MODID + "." + "ItemMegaBirthdayPresentPlacer" + "." + "inside"));
list.add(EnumChatFormatting.YELLOW.BOLD.ITALIC.UNDERLINE + StatCollector.translateToLocal("tooltip." + EpicProportionsMod.MODID + "." + "ItemMegaBirthdayPresentPlacer" + "." + "big"));
 }

public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 1;
}
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return 1.0F;
}
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
float var4 = 1.0F;

if(true){
boolean place = true;

if(place){
	
	//stuff here
	world.setBlock(i+0, j+0, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+0, k+0, 14, 14);
	world.setBlock(i+1, j+0, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+0, k+0, 14, 14);
	world.setBlock(i+2, j+0, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+0, k+0, 14, 14);
	world.setBlock(i+3, j+0, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+0, k+0, 4, 4);
	world.setBlock(i+4, j+0, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+0, k+0, 14, 14);
	world.setBlock(i+5, j+0, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+0, k+0, 14, 14);
	world.setBlock(i+6, j+0, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+0, k+0, 14, 14);
	world.setBlock(i+0, j+0, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+0, k+1, 14, 14);
	world.setBlock(i+1, j+0, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+0, k+1, 14, 14);
	world.setBlock(i+2, j+0, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+0, k+1, 14, 14);
	world.setBlock(i+3, j+0, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+0, k+1, 4, 4);
	world.setBlock(i+4, j+0, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+0, k+1, 14, 14);
	world.setBlock(i+5, j+0, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+0, k+1, 14, 14);
	world.setBlock(i+6, j+0, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+0, k+1, 14, 14);
	world.setBlock(i+0, j+0, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+0, k+2, 14, 14);
	world.setBlock(i+1, j+0, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+0, k+2, 14, 14);
	world.setBlock(i+2, j+0, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+0, k+2, 14, 14);
	world.setBlock(i+3, j+0, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+0, k+2, 4, 4);
	world.setBlock(i+4, j+0, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+0, k+2, 14, 14);
	world.setBlock(i+5, j+0, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+0, k+2, 14, 14);
	world.setBlock(i+6, j+0, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+0, k+2, 14, 14);
	world.setBlock(i+0, j+0, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+0, k+3, 4, 4);
	world.setBlock(i+1, j+0, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+0, k+3, 4, 4);
	world.setBlock(i+2, j+0, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+0, k+3, 4, 4);
	world.setBlock(i+3, j+0, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+0, k+3, 4, 4);
	world.setBlock(i+4, j+0, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+0, k+3, 4, 4);
	world.setBlock(i+5, j+0, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+0, k+3, 4, 4);
	world.setBlock(i+6, j+0, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+0, k+3, 4, 4);
	world.setBlock(i+0, j+0, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+0, k+4, 14, 14);
	world.setBlock(i+1, j+0, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+0, k+4, 14, 14);
	world.setBlock(i+2, j+0, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+0, k+4, 14, 14);
	world.setBlock(i+3, j+0, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+0, k+4, 4, 4);
	world.setBlock(i+4, j+0, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+0, k+4, 14, 14);
	world.setBlock(i+5, j+0, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+0, k+4, 14, 14);
	world.setBlock(i+6, j+0, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+0, k+4, 14, 14);
	world.setBlock(i+0, j+0, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+0, k+5, 14, 14);
	world.setBlock(i+1, j+0, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+0, k+5, 14, 14);
	world.setBlock(i+2, j+0, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+0, k+5, 14, 14);
	world.setBlock(i+3, j+0, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+0, k+5, 4, 4);
	world.setBlock(i+4, j+0, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+0, k+5, 14, 14);
	world.setBlock(i+5, j+0, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+0, k+5, 14, 14);
	world.setBlock(i+6, j+0, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+0, k+5, 14, 14);
	world.setBlock(i+0, j+0, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+0, k+6, 14, 14);
	world.setBlock(i+1, j+0, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+0, k+6, 14, 14);
	world.setBlock(i+2, j+0, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+0, k+6, 14, 14);
	world.setBlock(i+3, j+0, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+0, k+6, 4, 4);
	world.setBlock(i+4, j+0, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+0, k+6, 14, 14);
	world.setBlock(i+5, j+0, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+0, k+6, 14, 14);
	world.setBlock(i+6, j+0, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+0, k+6, 14, 14);
	world.setBlock(i+0, j+1, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+1, k+0, 14, 14);
	world.setBlock(i+1, j+1, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+1, k+0, 14, 14);
	world.setBlock(i+2, j+1, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+1, k+0, 14, 14);
	world.setBlock(i+3, j+1, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+1, k+0, 4, 4);
	world.setBlock(i+4, j+1, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+1, k+0, 14, 14);
	world.setBlock(i+5, j+1, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+1, k+0, 14, 14);
	world.setBlock(i+6, j+1, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+1, k+0, 14, 14);
	world.setBlock(i+0, j+1, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+1, k+1, 14, 14);
	world.setBlock(i+6, j+1, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+1, k+1, 14, 14);
	world.setBlock(i+0, j+1, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+1, k+2, 14, 14);
	world.setBlock(i+2, j+1, k+2, Block.getBlockById(133));
	world.setBlock(i+3, j+1, k+2, BlockLoader.blockPatIngot);
	world.setBlock(i+4, j+1, k+2, Block.getBlockById(22));
	world.setBlock(i+6, j+1, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+1, k+2, 14, 14);
	world.setBlock(i+0, j+1, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+1, k+3, 4, 4);
	world.setBlock(i+2, j+1, k+3, BlockLoader.blockJenIngot);
	world.setBlock(i+3, j+1, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+1, k+3, 4, 4);
	world.setBlock(i+4, j+1, k+3, Block.getBlockById(57));
	world.setBlock(i+6, j+1, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+1, k+3, 4, 4);
	world.setBlock(i+0, j+1, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+1, k+4, 14, 14);
	world.setBlock(i+2, j+1, k+4, Block.getBlockById(152));
	world.setBlock(i+3, j+1, k+4, Block.getBlockById(42));
	world.setBlock(i+4, j+1, k+4, Block.getBlockById(41));
	world.setBlock(i+6, j+1, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+1, k+4, 14, 14);
	world.setBlock(i+0, j+1, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+1, k+5, 14, 14);
	world.setBlock(i+6, j+1, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+1, k+5, 14, 14);
	world.setBlock(i+0, j+1, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+1, k+6, 14, 14);
	world.setBlock(i+1, j+1, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+1, k+6, 14, 14);
	world.setBlock(i+2, j+1, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+1, k+6, 14, 14);
	world.setBlock(i+3, j+1, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+1, k+6, 4, 4);
	world.setBlock(i+4, j+1, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+1, k+6, 14, 14);
	world.setBlock(i+5, j+1, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+1, k+6, 14, 14);
	world.setBlock(i+6, j+1, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+1, k+6, 14, 14);
	world.setBlock(i+0, j+2, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+2, k+0, 14, 14);
	world.setBlock(i+1, j+2, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+2, k+0, 14, 14);
	world.setBlock(i+2, j+2, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+2, k+0, 14, 14);
	world.setBlock(i+3, j+2, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+2, k+0, 4, 4);
	world.setBlock(i+4, j+2, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+2, k+0, 14, 14);
	world.setBlock(i+5, j+2, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+2, k+0, 14, 14);
	world.setBlock(i+6, j+2, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+2, k+0, 14, 14);
	world.setBlock(i+0, j+2, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+2, k+1, 14, 14);
	world.setBlock(i+6, j+2, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+2, k+1, 14, 14);
	world.setBlock(i+0, j+2, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+2, k+2, 14, 14);
	world.setBlock(i+6, j+2, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+2, k+2, 14, 14);
	world.setBlock(i+0, j+2, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+2, k+3, 4, 4);
	world.setBlock(i+3, j+2, k+3, BlockLoader.blockBirthdayPresent);
	world.setBlock(i+6, j+2, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+2, k+3, 4, 4);
	world.setBlock(i+0, j+2, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+2, k+4, 14, 14);
	world.setBlock(i+6, j+2, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+2, k+4, 14, 14);
	world.setBlock(i+0, j+2, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+2, k+5, 14, 14);
	world.setBlock(i+6, j+2, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+2, k+5, 14, 14);
	world.setBlock(i+0, j+2, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+2, k+6, 14, 14);
	world.setBlock(i+1, j+2, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+2, k+6, 14, 14);
	world.setBlock(i+2, j+2, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+2, k+6, 14, 14);
	world.setBlock(i+3, j+2, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+2, k+6, 4, 4);
	world.setBlock(i+4, j+2, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+2, k+6, 14, 14);
	world.setBlock(i+5, j+2, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+2, k+6, 14, 14);
	world.setBlock(i+6, j+2, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+2, k+6, 14, 14);
	world.setBlock(i+0, j+3, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+3, k+0, 14, 14);
	world.setBlock(i+1, j+3, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+3, k+0, 14, 14);
	world.setBlock(i+2, j+3, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+3, k+0, 14, 14);
	world.setBlock(i+3, j+3, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+3, k+0, 4, 4);
	world.setBlock(i+4, j+3, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+3, k+0, 14, 14);
	world.setBlock(i+5, j+3, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+3, k+0, 14, 14);
	world.setBlock(i+6, j+3, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+3, k+0, 14, 14);
	world.setBlock(i+0, j+3, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+3, k+1, 14, 14);
	world.setBlock(i+6, j+3, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+3, k+1, 14, 14);
	world.setBlock(i+0, j+3, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+3, k+2, 14, 14);
	world.setBlock(i+6, j+3, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+3, k+2, 14, 14);
	world.setBlock(i+0, j+3, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+3, k+3, 4, 4);
	world.setBlock(i+6, j+3, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+3, k+3, 4, 4);
	world.setBlock(i+0, j+3, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+3, k+4, 14, 14);
	world.setBlock(i+6, j+3, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+3, k+4, 14, 14);
	world.setBlock(i+0, j+3, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+3, k+5, 14, 14);
	world.setBlock(i+6, j+3, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+3, k+5, 14, 14);
	world.setBlock(i+0, j+3, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+3, k+6, 14, 14);
	world.setBlock(i+1, j+3, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+3, k+6, 14, 14);
	world.setBlock(i+2, j+3, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+3, k+6, 14, 14);
	world.setBlock(i+3, j+3, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+3, k+6, 4, 4);
	world.setBlock(i+4, j+3, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+3, k+6, 14, 14);
	world.setBlock(i+5, j+3, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+3, k+6, 14, 14);
	world.setBlock(i+6, j+3, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+3, k+6, 14, 14);
	world.setBlock(i+0, j+4, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+4, k+0, 14, 14);
	world.setBlock(i+1, j+4, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+4, k+0, 14, 14);
	world.setBlock(i+2, j+4, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+4, k+0, 14, 14);
	world.setBlock(i+3, j+4, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+4, k+0, 4, 4);
	world.setBlock(i+4, j+4, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+4, k+0, 14, 14);
	world.setBlock(i+5, j+4, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+4, k+0, 14, 14);
	world.setBlock(i+6, j+4, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+4, k+0, 14, 14);
	world.setBlock(i+0, j+4, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+4, k+1, 14, 14);
	world.setBlock(i+6, j+4, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+4, k+1, 14, 14);
	world.setBlock(i+0, j+4, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+4, k+2, 14, 14);
	world.setBlock(i+6, j+4, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+4, k+2, 14, 14);
	world.setBlock(i+0, j+4, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+4, k+3, 4, 4);
	world.setBlock(i+6, j+4, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+4, k+3, 4, 4);
	world.setBlock(i+0, j+4, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+4, k+4, 14, 14);
	world.setBlock(i+6, j+4, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+4, k+4, 14, 14);
	world.setBlock(i+0, j+4, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+4, k+5, 14, 14);
	world.setBlock(i+6, j+4, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+4, k+5, 14, 14);
	world.setBlock(i+0, j+4, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+4, k+6, 14, 14);
	world.setBlock(i+1, j+4, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+4, k+6, 14, 14);
	world.setBlock(i+2, j+4, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+4, k+6, 14, 14);
	world.setBlock(i+3, j+4, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+4, k+6, 4, 4);
	world.setBlock(i+4, j+4, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+4, k+6, 14, 14);
	world.setBlock(i+5, j+4, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+4, k+6, 14, 14);
	world.setBlock(i+6, j+4, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+4, k+6, 14, 14);
	world.setBlock(i+0, j+5, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+5, k+0, 14, 14);
	world.setBlock(i+1, j+5, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+5, k+0, 14, 14);
	world.setBlock(i+2, j+5, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+5, k+0, 14, 14);
	world.setBlock(i+3, j+5, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+5, k+0, 4, 4);
	world.setBlock(i+4, j+5, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+5, k+0, 14, 14);
	world.setBlock(i+5, j+5, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+5, k+0, 14, 14);
	world.setBlock(i+6, j+5, k+0, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+5, k+0, 14, 14);
	world.setBlock(i+0, j+5, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+5, k+1, 14, 14);
	world.setBlock(i+1, j+5, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+5, k+1, 14, 14);
	world.setBlock(i+2, j+5, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+5, k+1, 14, 14);
	world.setBlock(i+3, j+5, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+5, k+1, 4, 4);
	world.setBlock(i+4, j+5, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+5, k+1, 14, 14);
	world.setBlock(i+5, j+5, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+5, k+1, 14, 14);
	world.setBlock(i+6, j+5, k+1, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+5, k+1, 14, 14);
	world.setBlock(i+0, j+5, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+5, k+2, 14, 14);
	world.setBlock(i+1, j+5, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+5, k+2, 14, 14);
	world.setBlock(i+2, j+5, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+5, k+2, 4, 4);
	world.setBlock(i+3, j+5, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+5, k+2, 4, 4);
	world.setBlock(i+4, j+5, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+5, k+2, 14, 14);
	world.setBlock(i+5, j+5, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+5, k+2, 14, 14);
	world.setBlock(i+6, j+5, k+2, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+5, k+2, 14, 14);
	world.setBlock(i+0, j+5, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+5, k+3, 4, 4);
	world.setBlock(i+1, j+5, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+5, k+3, 4, 4);
	world.setBlock(i+2, j+5, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+5, k+3, 4, 4);
	world.setBlock(i+3, j+5, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+5, k+3, 4, 4);
	world.setBlock(i+4, j+5, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+5, k+3, 4, 4);
	world.setBlock(i+5, j+5, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+5, k+3, 4, 4);
	world.setBlock(i+6, j+5, k+3, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+5, k+3, 4, 4);
	world.setBlock(i+0, j+5, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+5, k+4, 14, 14);
	world.setBlock(i+1, j+5, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+5, k+4, 14, 14);
	world.setBlock(i+2, j+5, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+5, k+4, 14, 14);
	world.setBlock(i+3, j+5, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+5, k+4, 4, 4);
	world.setBlock(i+4, j+5, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+5, k+4, 4, 4);
	world.setBlock(i+5, j+5, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+5, k+4, 14, 14);
	world.setBlock(i+6, j+5, k+4, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+5, k+4, 14, 14);
	world.setBlock(i+0, j+5, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+5, k+5, 14, 14);
	world.setBlock(i+1, j+5, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+5, k+5, 14, 14);
	world.setBlock(i+2, j+5, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+5, k+5, 14, 14);
	world.setBlock(i+3, j+5, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+5, k+5, 4, 4);
	world.setBlock(i+4, j+5, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+5, k+5, 14, 14);
	world.setBlock(i+5, j+5, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+5, k+5, 14, 14);
	world.setBlock(i+6, j+5, k+5, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+5, k+5, 14, 14);
	world.setBlock(i+0, j+5, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+0, j+5, k+6, 14, 14);
	world.setBlock(i+1, j+5, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+1, j+5, k+6, 14, 14);
	world.setBlock(i+2, j+5, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+2, j+5, k+6, 14, 14);
	world.setBlock(i+3, j+5, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+3, j+5, k+6, 4, 4);
	world.setBlock(i+4, j+5, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+4, j+5, k+6, 14, 14);
	world.setBlock(i+5, j+5, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+5, j+5, k+6, 14, 14);
	world.setBlock(i+6, j+5, k+6, Block.getBlockById(35));
	world.setBlockMetadataWithNotify(i+6, j+5, k+6, 14, 14);
	
}
--itemStack.stackSize;
}


return true;
}


public void removeItem(EntityPlayer ep, ItemStack removeitem) {
	IInventory inv = ep.inventory;
	for(int i=0; i < inv.getSizeInventory(); i++)
	{
		if(inv.getStackInSlot(i) != null)
		{
			ItemStack j = inv.getStackInSlot(i);
			if(j.getItem() != null && j.getItem() == removeitem.getItem())
			{
				inv.setInventorySlotContents(i, null);
			}
		}
	}
}

}
