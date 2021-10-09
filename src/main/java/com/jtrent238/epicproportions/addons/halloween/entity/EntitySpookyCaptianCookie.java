package com.jtrent238.epicproportions.addons.halloween.entity;

import com.jtrent238.epicproportions.addons.halloween.ItemLoader;
import com.jtrent238.epicproportions.entity.EntityCaptianCookie;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.concurrent.ThreadLocalRandom;

public class EntitySpookyCaptianCookie extends EntityCaptianCookie{

	public EntitySpookyCaptianCookie(World var1) {
		super(var1);
	}

    /**
     * Drop items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
    	int randomSpookyEssence = ThreadLocalRandom.current().nextInt(1, 4 + 1);
    	this.entityDropItem(new ItemStack(ItemLoader.itemSpookyEssence, randomSpookyEssence), 4F);
    }
}
