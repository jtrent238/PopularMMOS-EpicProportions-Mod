package com.jtrent238.epicproportions.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.PathNavigate;

public class EntityAISitPet
  extends EntityAIBase
{
  private PetBase theEntity;
  private boolean isSitting;
  private static final String __OBFID = "CL_00001613";
  
  public EntityAISitPet(PetBase par1EntityTameable){
  /*{
    this.theEntity = par1EntityTameable;
    func_75248_a(5);
  }
  
  public boolean func_75250_a()
  {
    if (!this.theEntity.isTamed()) {
      return false;
    }
    if (this.theEntity.func_70090_H()) {
      return false;
    }
    if (!this.theEntity.field_70122_E) {
      return false;
    }
    Entity entitylivingbase = this.theEntity.getOwner();
    return (this.theEntity.func_70068_e(entitylivingbase) < 144.0D) && ((entitylivingbase instanceof EntityLivingBase)) && (((EntityLivingBase)entitylivingbase).func_70643_av() != null) ? false : entitylivingbase == null ? true : this.isSitting;
  }
  
  public void func_75249_e()
  {
    this.theEntity.func_70661_as().func_75499_g();
    this.theEntity.setSitting(true);
  }
  
  public void func_75251_c()
  {
    this.theEntity.setSitting(false);
  }
  
  public void setSitting(boolean par1)
  {
    this.isSitting = par1;
  }*/
}

@Override
public boolean shouldExecute() {
	return false;
}
}
