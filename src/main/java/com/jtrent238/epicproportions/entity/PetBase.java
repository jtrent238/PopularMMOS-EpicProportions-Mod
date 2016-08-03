package com.jtrent238.epicproportions.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.jtrent238.epicproportions.entity.ai.EntityAISitPet;

import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class PetBase
  extends EntityCreature
{
  protected int regentimer = 0;
  protected EntityAISitPet aiSit = new EntityAISitPet(this);
  
  public PetBase(World world)
  {
    super(world);
  }
  /*
  protected void func_70088_a()
  {
    super.func_70088_a();
    
    this.field_70180_af.func_75682_a(16, Byte.valueOf((byte)0));
    this.field_70180_af.func_75682_a(17, func_110124_au().toString());
    this.field_70180_af.func_75682_a(18, new Float(func_110143_aJ()));
  }
  
  public boolean func_142018_a(EntityLivingBase p_142018_1_, EntityLivingBase p_142018_2_)
  {
    return true;
  }
  
  public UUID getOwnerUUID()
  {
    return UUID.fromString(this.field_70180_af.func_75681_e(17));
  }
  
  public Entity getOwner()
  {
    UUID uuid = UUID.fromString(this.field_70180_af.func_75681_e(17));
    
    Iterator entities = this.field_70170_p.field_72996_f.iterator();
    while (entities.hasNext())
    {
      Entity entity = (Entity)entities.next();
      if (entity.func_110124_au().compareTo(uuid) == 0) {
        return entity;
      }
    }
    return null;
  }
  
  public void setOwner(Entity owner)
  {
    UUID uuid = owner.func_110124_au();
    this.field_70180_af.func_75692_b(17, uuid.toString());
  }
  
  protected boolean func_70650_aV()
  {
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_94059_bO()
  {
    return true;
  }
  
  public void func_70636_d()
  {
    super.func_70636_d();
    this.regentimer += 1;
    if (this.regentimer == 100)
    {
      if (isTamed()) {
        func_70691_i(2.0F);
      } else {
        func_70691_i(1.0F);
      }
      this.regentimer = 0;
    }
    this.field_70180_af.func_75692_b(18, new Float(func_110143_aJ()));
  }
  
  public void setOwner(String uuid)
  {
    this.field_70180_af.func_75692_b(17, uuid);
  }
  
  public void setOwner(long mb, long lb) {}
  
  public void func_70014_b(NBTTagCompound par1NBTTagCompound)
  {
    super.func_70014_b(par1NBTTagCompound);
    
    par1NBTTagCompound.func_74757_a("Sitting", isSitting());
    
    UUID uuid = getOwnerUUID();
    
    par1NBTTagCompound.func_74778_a("OwnerUUID", uuid.toString());
  }
  
  public void func_70037_a(NBTTagCompound par1NBTTagCompound)
  {
    super.func_70037_a(par1NBTTagCompound);
    
    this.aiSit.setSitting(par1NBTTagCompound.func_74767_n("Sitting"));
    setSitting(par1NBTTagCompound.func_74767_n("Sitting"));
    
    setOwner(par1NBTTagCompound.func_74779_i("OwnerUUID"));
  }
  
  protected boolean func_70692_ba()
  {
    return false;
  }
  
  public boolean isTamed()
  {
    return (this.field_70180_af.func_75683_a(16) & 0x4) != 0;
  }
  
  public boolean func_70085_c(EntityPlayer p_70085_1_)
  {
    ItemStack itemstack = p_70085_1_.field_71071_by.func_70448_g();
    if (isTamed()) {
      if ((getOwner() == p_70085_1_) && 
        (itemstack == null))
      {
        setSitting(!isSitting());
        this.aiSit.setSitting(!isSitting());
      }
    }
    return super.func_70085_c(p_70085_1_);
  }
  
  public void setTamed(boolean par1)
  {
    byte b0 = this.field_70180_af.func_75683_a(16);
    if (par1) {
      this.field_70180_af.func_75692_b(16, Byte.valueOf((byte)(b0 | 0x4)));
    } else {
      this.field_70180_af.func_75692_b(16, Byte.valueOf((byte)(b0 & 0xFFFFFFFB)));
    }
  }
  
  public boolean isSitting()
  {
    return (this.field_70180_af.func_75683_a(16) & 0x1) != 0;
  }
  
  public void setSitting(boolean par1)
  {
    byte b0 = this.field_70180_af.func_75683_a(16);
    if (par1) {
      this.field_70180_af.func_75692_b(16, Byte.valueOf((byte)(b0 | 0x1)));
    } else {
      this.field_70180_af.func_75692_b(16, Byte.valueOf((byte)(b0 & 0xFFFFFFFE)));
    }
  }
  
  public void getPlayerOwner()
  {
    Iterator entities = this.field_70170_p.field_73010_i.iterator();
    while (entities.hasNext())
    {
      EntityPlayer entity = (EntityPlayer)entities.next();
      if (func_70068_e(entity) < 5.0D)
      {
        setOwner(entity);
        setTamed(true);
      }
    }
  }
  */
}
