package com.jtrent238.epicproportions.entity;

import com.jtrent238.epicproportions.entity.ai.EntityAIFollowOwnerPet;
import com.jtrent238.epicproportions.entity.ai.EntityAIOwnerHurtByTargetPet;
import com.jtrent238.epicproportions.entity.ai.EntityAIOwnerHurtTargetPet;
import com.jtrent238.epicproportions.entity.ai.EntityAISitPet;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityBlockling extends EntityLiving{

	public EntityBlockling(World p_i1595_1_) {
		super(p_i1595_1_);
		
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAIFollowOwnerPet(this));
        this.tasks.addTask(4, new EntityAISitPet(this));
        this.tasks.addTask(5, new EntityAIOwnerHurtTargetPet(this));
        this.tasks.addTask(6, new EntityAIOwnerHurtByTargetPet(this));

    	}

	/**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }

    
}
