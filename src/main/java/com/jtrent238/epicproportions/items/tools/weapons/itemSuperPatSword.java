package com.jtrent238.epicproportions.items.tools.weapons;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;

public class itemSuperPatSword extends ItemSword
{
	private static final int enchant = ItemLoader.superenchantlvl;

	private double field_150934_a;

	public itemSuperPatSword(ToolMaterial EMERALD) {
		super(EMERALD);
		this.field_150934_a = 50.0F;
		this.setNoRepair();
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return true;
    }
	
	
	
	/**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 720;
    }
    
    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_)
    {
        return false;
    }
    
    /**
    * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
    */
   /*public Multimap getItemAttributeModifiers()
   {
       
	   Multimap multimap = super.getItemAttributeModifiers();
       multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.field_150934_a, 0));
       return multimap;
   }*/
    
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = HashMultimap.create(); // this part, you need to create a new hash-multimap!
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.field_150934_a, 0));
        return multimap;
    }
    
    public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.addEnchantment(Enchantment.unbreaking, enchant);
		par1ItemStack.addEnchantment(Enchantment.fireAspect, enchant);
		par1ItemStack.addEnchantment(Enchantment.knockback, enchant);
		par1ItemStack.addEnchantment(Enchantment.looting, enchant);
		par1ItemStack.addEnchantment(Enchantment.smite, enchant);
		par1ItemStack.addEnchantment(Enchantment.sharpness, enchant);
    }
    
    public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
	    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, stack);
	    if (lvl <= 0) {
			stack.addEnchantment(Enchantment.unbreaking, enchant);
			stack.addEnchantment(Enchantment.fireAspect, enchant);
			stack.addEnchantment(Enchantment.knockback, enchant);
			stack.addEnchantment(Enchantment.looting, enchant);
			stack.addEnchantment(Enchantment.smite, enchant);
			stack.addEnchantment(Enchantment.sharpness, enchant);
	    } 
	  }
	/**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
public void onUpdate(ItemStack stack, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) 
    {
		int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, stack);
	    if (lvl <= 0) {
			stack.addEnchantment(Enchantment.unbreaking, enchant);
			stack.addEnchantment(Enchantment.fireAspect, enchant);
			stack.addEnchantment(Enchantment.knockback, enchant);
			stack.addEnchantment(Enchantment.looting, enchant);
			stack.addEnchantment(Enchantment.smite, enchant);
			stack.addEnchantment(Enchantment.sharpness, enchant);
	    } 
    }
}

