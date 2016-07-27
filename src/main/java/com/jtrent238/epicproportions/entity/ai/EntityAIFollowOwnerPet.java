package com.jtrent238.epicproportions.entity.ai;

import com.jtrent238.epicproportions.entity.EntityBomby;

import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIFollowOwnerPet extends EntityAIBase {

	public EntityAIFollowOwnerPet(EntityBomby entityBomby, double d, float f, float g) {
	}

	@Override
	public boolean shouldExecute() {
		return false;
	}

}
