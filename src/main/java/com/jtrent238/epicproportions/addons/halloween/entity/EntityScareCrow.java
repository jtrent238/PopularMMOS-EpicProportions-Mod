package com.jtrent238.epicproportions.addons.halloween.entity;

import java.util.Random;


import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityScareCrow extends EntityGolem{

	public EntityScareCrow(World p_i1686_1_) {
		super(p_i1686_1_);
	}

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        //return "epicproportionsmod_halloween:scarecrow_say";
        return "epicproportionsmod_halloween:scarecrow_say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "epicproportionsmod_halloween:scarecrow_hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "epicproportionsmod_halloween:scarecrow_death";
    }
    
    /**
     * Drop items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
    	Random rn = new Random();
    	int max = 6;
    	int min = 1;
    	int result = rn.nextInt(max - min + 1) + min;
    	//System.out.println(result);
    	
    	int dropAmount = result;
    	int dropType = rn.nextInt((max - 1) - (min - 1) + 1) + (min - 1);
    	//System.out.println(dropType);
    	
    	if(dropType < 0 || dropType > 2) {
    		//Logger.logMsg(Logger.INFO, "Droptype was not between 0 and 2! Setting to 0!");
    		dropType = 0;
    		System.out.println(dropType);
    	}
    	
		switch(dropType){
			case 0:
				this.entityDropItem(new ItemStack(Blocks.hay_block, dropAmount), 1F);
				break;
			case 1:
				this.entityDropItem(new ItemStack(Blocks.planks, dropAmount), 1F);
				break;
			case 2:
				this.entityDropItem(new ItemStack(Blocks.hay_block, dropAmount), 1F);
				this.entityDropItem(new ItemStack(Blocks.planks, dropAmount), 1F);
				break;
			default:
				break;
    	}

    }
    
}
