package com.jtrent238.epicproportions.entity;

import java.util.Iterator;
import java.util.List;

import com.jtrent238.epicproportions.entity.ai.EntityAIFollowOwnerPet;
import com.jtrent238.epicproportions.entity.ai.EntityAIOwnerHurtByTargetPet;
import com.jtrent238.epicproportions.entity.ai.EntityAIOwnerHurtTargetPet;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockColored;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBomby extends EntityTameable/*/extends EntityCreeper/*/ /*/EntityLiving/*/
  /*/extends PetBase/*/
{
  private EntityAIBase aiSit;
private EntityCreature EntityBomby;
/**
 * Time when this creeper was last in an active state (Messed up code here, probably causes creeper animation to go
 * weird)
 */
private int lastActiveTime;
/** The amount of time since the creeper was close enough to the player to ignite */
private int timeSinceIgnited;
private int fuseTime = 30;
/** Explosion radius for this creeper. */
private int explosionRadius = 3;
private boolean bombyTame;
private boolean randomExplode = false;
private static final String __OBFID = "CL_00001684";

public EntityBomby(World world)
  {
    super(world);
    //this.setScale(0.5F);
    //this.setSize(0.5F, 0.5F);
    this.isChild();
    this.entityAge = 0;
    this.allowLeashing();
    this.setAttackTarget(getLastAttacker());
    this.setCustomNameTag("Bomby");
  
  /*
    func_94058_c(getName());
    
    func_70105_a(0.5F, 0.5F);
    */
    this.tasks.addTask(1, new EntityAISwimming(this));
    //this.tasks.addTask(2, this.aiSit);
    this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
    //this.tasks.addTask(4, new EntityAIAttackOnCollide(EntityBomby, 1.0D, true));
    //this.tasks.addTask(5, new EntityAIFollowOwnerPet(this, 1.0D, 10.0F, 2.0F));
    //this.tasks.addTask(7, new EntityAIWander(EntityBomby, 1.0D));
    this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(10, new EntityAILookIdle(this));
    
    if(bombyTame == true){
    	this.getOwner();
    	this.setSize(1000, 1000);

    	if(randomExplode  == true){
    		
    	}
    }
    
    
    
    //this.tasks.addTask(11, new EntityAIOwnerHurtTargetPet(this));
    
    /*
    this.field_70714_bg.func_75776_a(1, new EntityAISwimming(this));
    this.field_70714_bg.func_75776_a(2, this.aiSit);
    this.field_70714_bg.func_75776_a(3, new EntityAILeapAtTarget(this, 0.4F));
    this.field_70714_bg.func_75776_a(4, new EntityAIAttackOnCollide(this, 1.0D, true));
    this.field_70714_bg.func_75776_a(5, new EntityAIFollowOwnerPet(this, 1.0D, 10.0F, 2.0F));
    
    this.field_70714_bg.func_75776_a(7, new EntityAIWander(this, 1.0D));
    
    this.field_70714_bg.func_75776_a(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    this.field_70714_bg.func_75776_a(9, new EntityAILookIdle(this));
    this.field_70715_bh.func_75776_a(1, new EntityAIOwnerHurtByTargetPet(this));
    this.field_70715_bh.func_75776_a(2, new EntityAIOwnerHurtTargetPet(this));
    this.field_70715_bh.func_75776_a(3, new EntityAIHurtByTarget(this, true));
  */
  }
  
public EntityBomby createChild(EntityAgeable p_90011_1_)
{
	EntityBomby entitybomby = new EntityBomby(this.worldObj);
    String s = this.func_152113_b();

    if (s != null && s.trim().length() > 0)
    {
    	entitybomby.func_152115_b(s);
    	entitybomby.setTamed(true);
    }

    return entitybomby;
}

	public void setTamed(boolean p_70903_1_)
		{
			super.setTamed(p_70903_1_);

				if (p_70903_1_)
					{
						this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
						}
					else
						{
							this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
							}
			}

    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        int i = this.isTamed() ? 4 : 2;
        return p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)i);
    }

    

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound p_70014_1_)
    {
        super.writeEntityToNBT(p_70014_1_);
        p_70014_1_.setBoolean("CanExplode", this.canExplode());
        //p_70014_1_.setByte("CollarColor", (byte)this.getCollarColor());
    }

    private boolean canExplode() {
		return false; //False for now
	}

	/**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound p_70037_1_)
    {
        super.readEntityFromNBT(p_70037_1_);
        this.setCanExplode(p_70037_1_.getBoolean("CanExplode"));
/*
        if (p_70037_1_.hasKey("CollarColor", 99))
        {
            this.setCollarColor(p_70037_1_.getByte("CollarColor"));
        }*/
    }
    
private void setCanExplode(boolean boolean1) {
		
	}

/**
 * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
 */
public boolean interact(EntityPlayer p_70085_1_)
{
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
/*
    if (this.isTamed())
    {
        if (this.func_152114_e(p_70085_1_) && !this.worldObj.isRemote && !this.isBreedingItem(itemstack))
        {
            this.aiSit.setSitting(!this.isSitting());
        }
    }*/
    /*else*/ if (/*this.aiTempt.isRunning() && itemstack != null && */itemstack.getItem() == Items.fish && p_70085_1_.getDistanceSqToEntity(this) < 9.0D)
    {
        if (!p_70085_1_.capabilities.isCreativeMode)
        {
            --itemstack.stackSize;
        }

        if (itemstack.stackSize <= 0)
        {
            p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null);
        }

        if (!this.worldObj.isRemote)
        {
            if (this.rand.nextInt(3) == 0)
            {
                this.setTamed(true);
                //this.setTameSkin(1 + this.worldObj.rand.nextInt(3));
                this.func_152115_b(p_70085_1_.getUniqueID().toString());
                this.playTameEffect(true);
                //this.aiSit.setSitting(true);
                this.worldObj.setEntityState(this, (byte)7);
            }
            else
            {
                this.playTameEffect(false);
                this.worldObj.setEntityState(this, (byte)6);
            }
        }

        return true;
        
    }
    this.setTamed(true);
    return super.interact(p_70085_1_);
}



public String getName()
  {
    return "Bomby";
  }
  /*
  protected void func_110147_ax()
  {
    super.func_110147_ax();
    func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(50.0D);
    func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3D);
  }
  
  public void func_70636_d()
  {
    super.func_70636_d();
    if (getOwner() == this)
    {
      Iterator entities = this.field_70170_p.field_72996_f.iterator();
      while (entities.hasNext())
      {
        Entity entity = (Entity)entities.next();
        if (((entity instanceof EntityYoutuber)) && 
          (((EntityYoutuber)entity).getYoutuber() == Youtubers.GetYoutuberIDbyName("FuriousDestroyer")) && 
          (func_70068_e(entity) < 5.0D))
        {
          setOwner(entity);
          setTamed(true);
        }
      }
      if (getOwner() == this) {
        super.getPlayerOwner();
      }
    }
  }
  
  public boolean func_70085_c(EntityPlayer p_70085_1_)
  {
    ItemStack itemstack = p_70085_1_.field_71071_by.func_70448_g();
    if (isTamed()) {
      if (itemstack != null) {
        if (itemstack.func_77973_b() == Items.field_151016_H) {
          if (this.field_70180_af.func_111145_d(18) < 50.0F)
          {
            if (!p_70085_1_.field_71075_bZ.field_75098_d) {
              itemstack.field_77994_a -= 1;
            }
            func_70691_i(5.0F);
            if (itemstack.field_77994_a <= 0) {
              p_70085_1_.field_71071_by.func_70299_a(p_70085_1_.field_71071_by.field_70461_c, (ItemStack)null);
            }
            return true;
          }
        }
      }
    }
    return super.func_70085_c(p_70085_1_);
  }
  
  public boolean func_70652_k(Entity par1Entity)
  {
    float size = 2.0F;
    this.field_70170_p.func_72876_a(this, this.field_70165_t, this.field_70163_u, this.field_70161_v, size, false);
    return true;
  }
  
  public boolean func_70097_a(DamageSource Dmg, float amount)
  {
    if (Dmg.func_94541_c())
    {
      amount = 0.0F;
      return false;
    }
    return super.func_70097_a(Dmg, amount);
  }
  */

/**
     * Params: (Float)Render tick. Returns the intensity of the Bomby flash when it is ignited.
     */
    @SideOnly(Side.CLIENT)
    public float getBombyFlashIntensity(float p_70831_1_)
    {
        return ((float)this.lastActiveTime + (float)(this.timeSinceIgnited - this.lastActiveTime) * p_70831_1_) / (float)(this.fuseTime - 2);
    }

public boolean getSitting() {
	return false;
}

public boolean getPowered() {
	return false;
}


}
