package com.jtrent238.epicproportions.addons.christmas.items;

import java.util.Collection;
import java.util.List;

import com.jtrent238.epicproportions.addons.christmas.BlockLoader;
import com.jtrent238.epicproportions.addons.christmas.blocks.BlockBulb;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemBulb extends Item{

	public static final String[] field_150923_a = new String[] {"red", "green","blue", "purple", "cyan", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
    public static final String[] field_150921_b = new String[] {"red", "green","blue", "purple", "cyan", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
    public static final int[] field_150922_c = new int[] {1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150920_d;
    private static final String __OBFID = "CL_00000022";

    
	public ItemBulb(int p_77647_1_, Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_, Collection c){
		this.getMetadata(p_77647_1_);
        this.setMaxDamage(0);
		this.setHasSubtypes(true);
		//this.getSubItems(p_150895_1_, p_150895_2_, p_150895_3_);
		//p_150895_3_.add("bulb" + "_" + itemRand);
		//p_150895_3_.addAll(c);
		
	}
	
	  /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
    {
        for (int i = 0; i < 12; ++i)
        {
            p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
        }
    }
    
    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack p_77667_1_)
    {
        int i = MathHelper.clamp_int(p_77667_1_.getItemDamage(), 0, 15);
        return super.getUnlocalizedName() + "." + field_150923_a[i];
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int p_77617_1_)
    {
        int j = MathHelper.clamp_int(p_77617_1_, 0, 15);
        return this.field_150920_d[j];
    }


    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        this.field_150920_d = new IIcon[field_150921_b.length];

        for (int i = 0; i < field_150921_b.length; ++i)
        {
            this.field_150920_d[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + field_150921_b[i]);
        }
    }
  }
    

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
 //0   public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
 //0   {
    	

 //0   	if (p_77648_3_.isRemote)
 //0       {
 //0           return true;
 //0       }
 //0       else if (p_77648_7_ != 1)
 //0       {
 //0           return false;
 //0       }
 //0       else
 //0       {
 //0           ++p_77648_5_;
 //0           BlockBulb bulb = (BlockBulb)BlockLoader.BlockBulb, field_150921_b;
 //0           int i1 = MathHelper.floor_double((double)(p_77648_2_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
 //0           byte b0 = 0;
 //0           byte b1 = 0;
/*
            if (i1 == 0)
 //0           {
 //0               b1 = 1;
 //0           }

 //0           if (i1 == 1)
 //0           {
 //0               b0 = -1;
 //0           }

 //0           if (i1 == 2)
 //0           {
 //0               b1 = -1;
 //0           }

 //0           if (i1 == 3)
 //0           {
 //0              b0 = 1;
 //0           }
*/
            
 //0                       p_77648_3_.setBlock(p_77648_4_ + b0, p_77648_5_, p_77648_6_ + b1, bulb, i1 + 8, 3);

 //0                   --p_77648_1_.stackSize;
 //0                   return true;
 //0       }
        
 //0   }
    
 //}
