package com.jtrent238.epicproportions.items.armor;

import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemSuperPatArmor  extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public ItemSuperPatArmor(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("ItemSuperPatArmor");
	    this.setTextureName("epicproportionsmod:ItemSuperPatArmor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return "epicproportionsmod:textures/armor/ItemSuperPatArmor_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	 @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack p_77636_1_)
	    {
	        return true;
	    }
	 
	 @Override
	    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
	 {
		 
	if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ItemLoader.itemSuperPatHelmet))
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40));
		player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40));

	if (player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ItemLoader.itemSuperPatChestplate))
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40));
		player.addPotionEffect(new PotionEffect(Potion.heal.id, 40));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40));

	if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ItemLoader.itemSuperPatLeggings))
	    player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 40));
	 	player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40));
	 	player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40));

	if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ItemLoader.itemSuperPatBoots))
	    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
	 	player.addPotionEffect(new PotionEffect(Potion.jump.id, 40));
	 }
}