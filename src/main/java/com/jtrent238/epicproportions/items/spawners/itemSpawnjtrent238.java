package com.jtrent238.epicproportions.items.spawners;

import com.jtrent238.epicproportions.entity.Entilyjtrent238;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class itemSpawnjtrent238 extends Item
{
    @SideOnly(Side.CLIENT)
    private IIcon theIcon;
    private static final String __OBFID = "CL_00000070";
    
    
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    
    	/*
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if (p_77648_3_.isRemote)
        {
            return true;
        }
        else
        {
            Block block = p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);
            p_77648_4_ += Facing.offsetsXForSide[p_77648_7_];
            p_77648_5_ += Facing.offsetsYForSide[p_77648_7_];
            p_77648_6_ += Facing.offsetsZForSide[p_77648_7_];
            double d0 = 0.0D;

            if (p_77648_7_ == 1 && block.getRenderType() == 11)
            {
                d0 = 0.5D;
            }

            Entity entity = spawnCreature(p_77648_3_, p_77648_1_.getItemDamage(), (double)p_77648_4_ + 0.5D, (double)p_77648_5_ + d0, (double)p_77648_6_ + 0.5D);

            if (entity != null)
            {
                if (entity instanceof EntityLivingBase && p_77648_1_.hasDisplayName())
                {
                    ((Entilyjtrent238)entity).setCustomNameTag(p_77648_1_.getDisplayName());
                }

                if (!p_77648_2_.capabilities.isCreativeMode)
                {
                    --p_77648_1_.stackSize;
                }
            }

            return true;
        }
    }
     	*/
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    	/*
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        if (p_77659_2_.isRemote)
        {
            return p_77659_1_;
        }
        else
        {
            MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(p_77659_2_, p_77659_3_, true);

            if (movingobjectposition == null)
            {
                return p_77659_1_;
            }
            else
            {
                if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
                {
                    int i = movingobjectposition.blockX;
                    int j = movingobjectposition.blockY;
                    int k = movingobjectposition.blockZ;

                    if (!p_77659_2_.canMineBlock(p_77659_3_, i, j, k))
                    {
                        return p_77659_1_;
                    }

                    if (!p_77659_3_.canPlayerEdit(i, j, k, movingobjectposition.sideHit, p_77659_1_))
                    {
                        return p_77659_1_;
                    }

                    if (p_77659_2_.getBlock(i, j, k) instanceof BlockLiquid)
                    {
                        Entity entity = new Entilyjtrent238(p_77659_2_);

                        if (entity != null)
                        {
                            if (entity instanceof Entilyjtrent238 && p_77659_1_.hasDisplayName())
                            {
                                ((Entilyjtrent238)entity).setCustomNameTag(p_77659_1_.getDisplayName());
                            }

                            if (!p_77659_3_.capabilities.isCreativeMode)
                            {
                                --p_77659_1_.stackSize;
                            }
                        }
                    }
                }

                return p_77659_1_;
            }
        }
    }
		*/
    /**
     * Spawns the creature specified by the egg's type in the location specified by the last three parameters.
     * Parameters: world, entityID, x, y, z.
     */
    	/*
    public static Entity spawnCreature(World p_77840_0_, int p_77840_1_, double p_77840_2_, double p_77840_4_, double p_77840_6_)
    {
        if (!EntityList.entityEggs.containsKey(Integer.valueOf(p_77840_1_)))
        {
            return null;
        }
        else
        {
            Entity entity = null;

            for (int j = 0; j < 1; ++j)
            {
                entity = new Entilyjtrent238(p_77840_0_);

                if (entity != null && entity instanceof EntityLivingBase)
                {
                	Entilyjtrent238 entityliving = (Entilyjtrent238)entity;
                    entity.setLocationAndAngles(p_77840_2_, p_77840_4_, p_77840_6_, MathHelper.wrapAngleTo180_float(p_77840_0_.rand.nextFloat() * 360.0F), 0.0F);
                    entityliving.rotationYawHead = entityliving.rotationYaw;
                    entityliving.renderYawOffset = entityliving.rotationYaw;
                    entityliving.onSpawnWithEgg((IEntityLivingData)null);
                    p_77840_0_.spawnEntityInWorld(entity);
                    entityliving.playLivingSound();
                }
            }

            return entity;
        }
    }
		*/
    
  //This allows Right Click to spawn entity
    
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer entityplayer)
    {
    if(!world.isRemote)
    {
    	Entilyjtrent238 par1 = new Entilyjtrent238(world); //Just change"MyEntityCow" to any entity you would like to spawn
    par1.setPosition(entityplayer.posX, entityplayer.posY+2,entityplayer.posZ+2); //These are the coordinates where he will appear 
    world.spawnEntityInWorld(par1);
    }
    //entityplayer.addChatMessage("Its Captian Cookie!"); //This is a message you can add when he is spawned
    itemstack.damageItem(1, entityplayer); return itemstack;
    }
    
}