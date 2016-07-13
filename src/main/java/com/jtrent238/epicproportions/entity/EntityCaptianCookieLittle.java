package com.jtrent238.epicproportions.entity;

import com.jtrent238.epicproportions.EntityLoader;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.World;

public class EntityCaptianCookieLittle extends EntityLiving{

	public EntityCaptianCookieLittle(World p_i1595_1_) {
		super(p_i1595_1_);
		this.isChild();
	}
	/*
	public EntityCaptianCookieLittle createChild(EntityAgeable p_90011_1_)
    {
        return new EntityCaptianCookieLittle(this.worldObj);
    }
    */
}
