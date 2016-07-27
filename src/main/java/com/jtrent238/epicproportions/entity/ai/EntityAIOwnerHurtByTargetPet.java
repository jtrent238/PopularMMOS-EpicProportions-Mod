package com.jtrent238.epicproportions.entity.ai;

import com.jtrent238.epicproportions.entity.EntityBomby;

import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIOwnerHurtByTargetPet extends EntityAIBase {

	public EntityAIOwnerHurtByTargetPet(EntityBomby entityBomby) {
	}

	@Override
	public boolean shouldExecute() {
		return false;
	}

}
