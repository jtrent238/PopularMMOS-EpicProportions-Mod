package com.jtrent238.epicproportions.items.tools.weapons.guns;

import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.entity.EntityFartBombPrimed;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class itemNukeLauncher extends Item{

public itemNukeLauncher(){
super();
setMaxDamage(100);
maxStackSize = 1;
setFull3D();

}

@Override
@SideOnly(Side.CLIENT)
public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
list.add(EnumChatFormatting.ITALIC + StatCollector.translateToLocal("tooltip." + EpicProportionsMod.MODID + "." + "itemNukeLauncher"+ "." + "ammotype" ));
 }

public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, final EntityPlayer par3EntityPlayer){

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(Item.getItemById(46)))
        {
            float f = 100.0F;

            EntityFartBombPrimed entityarrow = new EntityFartBombPrimed(par2World)
            {

				public void onCollideWithPlayer(EntityPlayer entity){
					super.onCollideWithPlayer(entity);
					int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
					int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
					int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
					World world = this.worldObj;
					
if(true){
//world.createExplosion((Entity)null, i, j, k, 4F, true);
}

				}

            	public void onUpdate(){
				     super.onUpdate();
				     int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
				     int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
				     int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
				     World world = this.worldObj;
				     Entity entity = (Entity)par3EntityPlayer;
				     
				     if (this.worldObj.getBlock(i, j, k) != Blocks.air || this.worldObj.getBlock(i, j-1, k) != Blocks.air ||
				     this.worldObj.getBlock(i, j+1, k) != Blocks.air ||
				     this.worldObj.getBlock(i+1, j, k) != Blocks.air || this.worldObj.getBlock(i-1, j, k) != Blocks.air
				     || this.worldObj.getBlock(i, j, k+1) != Blocks.air || this.worldObj.getBlock(i, j, k-1) != Blocks.air){
				       	
if(true){
//world.createExplosion((Entity)null, i, j, k, 4F, true);
}

				       	this.kill();
				     }

            	}

            	};

                
                if(true){
                	entityarrow.setFire(100);
				}

            	par1ItemStack.damageItem(1, par3EntityPlayer);
            	par2World.playSoundAtEntity(par3EntityPlayer, EpicProportionsMod.MODID + ":NukeLauncher_boom", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
            {
                }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Item.getItemById(46));
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(entityarrow);
            }
            World world = par2World;
            EntityPlayer entity = par3EntityPlayer;
			int i = (int)entity.posX;
			int j = (int)entity.posY;
			int k = (int)entity.posZ;
            
if(true){
//world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "explode", 1.0F, 1.0F);
}

        }

        return par1ItemStack;
    }



    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }


}