package com.jtrent238.epicproportions.entity;

import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBomby
  extends PetBase
{
  public EntityBomby(World world)
  {
    super(world);
  }
    /*func_94058_c(getName());
    
    func_70105_a(0.5F, 0.5F);
    
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
  }
  */
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
}
