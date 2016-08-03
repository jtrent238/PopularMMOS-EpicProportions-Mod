package com.jtrent238.epicproportions.items.armor;

import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
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
	 
		public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
			par1ItemStack.addEnchantment(Enchantment.unbreaking, enchant);
			par1ItemStack.addEnchantment(Enchantment.aquaAffinity, enchant);
			par1ItemStack.addEnchantment(Enchantment.blastProtection, enchant);
			par1ItemStack.addEnchantment(Enchantment.featherFalling, enchant);
			par1ItemStack.addEnchantment(Enchantment.fireProtection, enchant);
			par1ItemStack.addEnchantment(Enchantment.projectileProtection, enchant);
			par1ItemStack.addEnchantment(Enchantment.protection, enchant);
			par1ItemStack.addEnchantment(Enchantment.respiration, enchant);
			par1ItemStack.addEnchantment(Enchantment.thorns, enchant);
			
	}
}