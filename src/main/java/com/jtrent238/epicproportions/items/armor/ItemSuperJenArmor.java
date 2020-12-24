package com.jtrent238.epicproportions.items.armor;

import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSuperJenArmor  extends ItemArmor{

	private String textureName;
	private int armorType;
	private boolean hasenchanted;
	private static final int enchant = ItemLoader.superenchantlvl;


	public ItemSuperJenArmor(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("ItemSuperJenArmor");
	    this.setTextureName("epicproportionsmod:ItemSuperJenArmor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return "epicproportionsmod:textures/armor/ItemSuperJenArmor_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	 @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack p_77636_1_)
	    {
	        return true;
	    }
	 
	 @Override
	    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
	 {
	if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ItemLoader.itemSuperJenHelmet))
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40));
		player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40));

	if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ItemLoader.itemSuperJenChestplate))
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40));
		player.addPotionEffect(new PotionEffect(Potion.heal.id, 40));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));

	if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ItemLoader.itemSuperJenLeggings))
	    player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 40));
	 	player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40));
	 	player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40));

	if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ItemLoader.itemSuperJenBoots))
	    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
	 	player.addPotionEffect(new PotionEffect(Potion.jump.id, 40));
	 }
	 
		public void onCreated(ItemStack stack, World par2World, EntityPlayer par3EntityPlayer)
	    {
			stack.addEnchantment(Enchantment.unbreaking, enchant);
			stack.addEnchantment(Enchantment.aquaAffinity, enchant);
			stack.addEnchantment(Enchantment.blastProtection, enchant);
			stack.addEnchantment(Enchantment.featherFalling, enchant);
			stack.addEnchantment(Enchantment.fireProtection, enchant);
			stack.addEnchantment(Enchantment.projectileProtection, enchant);
			stack.addEnchantment(Enchantment.protection, enchant);
			stack.addEnchantment(Enchantment.respiration, enchant);
			stack.addEnchantment(Enchantment.thorns, enchant);
			
	}
	 public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
		    int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, stack);
		    if (lvl <= 0) {
		    	stack.addEnchantment(Enchantment.unbreaking, enchant);
				stack.addEnchantment(Enchantment.aquaAffinity, enchant);
				stack.addEnchantment(Enchantment.blastProtection, enchant);
				stack.addEnchantment(Enchantment.featherFalling, enchant);
				stack.addEnchantment(Enchantment.fireProtection, enchant);
				stack.addEnchantment(Enchantment.projectileProtection, enchant);
				stack.addEnchantment(Enchantment.protection, enchant);
				stack.addEnchantment(Enchantment.respiration, enchant);
				stack.addEnchantment(Enchantment.thorns, enchant);
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
				stack.addEnchantment(Enchantment.aquaAffinity, enchant);
				stack.addEnchantment(Enchantment.blastProtection, enchant);
				stack.addEnchantment(Enchantment.featherFalling, enchant);
				stack.addEnchantment(Enchantment.fireProtection, enchant);
				stack.addEnchantment(Enchantment.projectileProtection, enchant);
				stack.addEnchantment(Enchantment.protection, enchant);
				stack.addEnchantment(Enchantment.respiration, enchant);
				stack.addEnchantment(Enchantment.thorns, enchant);
		    } 
	    }


		

}