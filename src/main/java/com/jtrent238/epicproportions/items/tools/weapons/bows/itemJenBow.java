package com.jtrent238.epicproportions.items.tools.weapons.bows;

import com.jtrent238.epicproportions.ItemLoader;
import com.jtrent238.epicproportions.entity.EntilyJenArrow;
import com.jtrent238.epicproportions.entity.EntilyPatArrow;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class itemJenBow extends ItemBow
{
    public static final String[] bowPullIconNameArray = new String[] {"pulling_0", "pulling_1", "pulling_2"};
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    private static final String __OBFID = "CL_00001777";
	
	public itemJenBow(ToolMaterial BOW) {
		super();
		//this.setCreativeTab(FoodMod.FoodMod);
		//this.setFull3D();
		//this.setUnlocalizedName("itemcandybow");
		
	}
	
	 public void registerIcons(IIconRegister p_94581_1_)
	    {
	        this.itemIcon = p_94581_1_.registerIcon(this.getIconString() + "_standby");
	        this.iconArray = new IIcon[bowPullIconNameArray.length];

	        for (int i = 0; i < this.iconArray.length; ++i)
	        {
	            this.iconArray[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + bowPullIconNameArray[i]);
	        }
	    }
	    
	 /**
	     * used to cycle through icons based on their used duration, i.e. for the bow
	     */
	    @SideOnly(Side.CLIENT)
	    public IIcon getItemIconForUseDuration(int p_94599_1_)
	    {
	        return this.iconArray[p_94599_1_];
	    }
	    
	    /**
	     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	     */
	    public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_)
	    {
	        int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;

	        ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        j = event.charge;

	        boolean flag = p_77615_3_.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, p_77615_1_) > 0;

	        if (flag || p_77615_3_.inventory.hasItem(ItemLoader.itemJenArrow))
	        {
	            float f = (float)j / 20.0F;
	            f = (f * f + f * 2.0F) / 3.0F;

	            if ((double)f < 0.1D)
	            {
	                return;
	            }

	            if (f > 1.0F)
	            {
	                f = 1.0F;
	            }

	            EntilyJenArrow entityjenarrow = new EntilyJenArrow(p_77615_2_, p_77615_3_, f * 2.0F);

	            if (f == 1.0F)
	            {
	            	entityjenarrow.setIsCritical(true);
	            }

	            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, p_77615_1_);

	            if (k > 0)
	            {
	            	entityjenarrow.setDamage(entityjenarrow.getDamage() + (double)k * 0.5D + 0.5D);
	            }

	            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, p_77615_1_);

	            if (l > 0)
	            {
	            	entityjenarrow.setKnockbackStrength(l);
	            }

	            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, p_77615_1_) > 0)
	            {
	            	entityjenarrow.setFire(100);
	            }

	            p_77615_1_.damageItem(1, p_77615_3_);
	            p_77615_2_.playSoundAtEntity(p_77615_3_, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

	            if (flag)
	            {
	            	entityjenarrow.canBePickedUp = 2;
	            }
	            else
	            {
	                p_77615_3_.inventory.consumeInventoryItem(ItemLoader.itemJenArrow);
	            }

	            if (!p_77615_2_.isRemote)
	            {
	                p_77615_2_.spawnEntityInWorld(entityjenarrow);
	            }
	        }
	    }
	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
	    {
	        ArrowNockEvent event = new ArrowNockEvent(p_77659_3_, p_77659_1_);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return event.result;
	        }

	        if (p_77659_3_.capabilities.isCreativeMode || p_77659_3_.inventory.hasItem(ItemLoader.itemJenArrow))
	        {
	            p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
	        }

	        return p_77659_1_;
	    }

    }