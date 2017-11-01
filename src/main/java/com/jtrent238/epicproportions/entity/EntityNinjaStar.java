package com.jtrent238.epicproportions.entity;

import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;
public class EntityNinjaStar extends EntityThrowable
{
/*
* If you're wondering why I have all of
* these constructors for no reason, It's
* used by Forge to use this class, If you
* don't have these, your minecraft is going
* to crash!
*/
public EntityNinjaStar(World par1World, double par2, double par4, double par6)
{
super(par1World, par2, par4, par6);
}
public EntityNinjaStar(World par1World, EntityLivingBase par2EntityLivingBase)
{
super(par1World, par2EntityLivingBase);
}
public EntityNinjaStar(World par1World)
{
super(par1World);
}
@Override
/**
 * Called when this EntityThrowable hits a block or entity.
 */
protected void onImpact(MovingObjectPosition mop)
{
	if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
 
		System.out.println("EntityNinjaStar landed!");
	}
	
//If this hit's a block, continue
if(mop.typeOfHit == MovingObjectType.BLOCK)
{
/*
* You might be wondering what
* all these case and break are
* These are use to switch the number
* mop.sideHit
*
* Example:
* If mop.sideHit == 3 whatever is in
* case 3 Happens!
*/
switch(mop.sideHit)
{
case 0: //BOTTOM
mop.blockY--;
break;
case 1: //TOP
mop.blockY++;
break;
case 2: //EAST
mop.blockZ--;
break;
case 3: //WEST
mop.blockZ++;
break;
case 4: //NORTH
mop.blockX--;
break;
case 5: //SOUTH
mop.blockX++;
break;
}
/* This method creates the explosion!
* It uses the entity (Can be null)
* the three coordinates, the strength
* and if it should spawn smoke particles
* around after exploding, the last parameter
* is if it should set neighboring blocks on fire
*/
//this.worldObj.newExplosion(this, mop.blockX, mop.blockY, mop.blockZ, 2.0F, true, true);
//mop.entityHit.attackEntityFrom(DamageSource.generic, 2);

	/*if(this.isCollided == true){
		
	}*/

this.playSound("epicproportionsmod:NinjaStarHit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));


}

if (mop.entityHit != null)
{
    mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 5F);
    this.playSound("epicproportionsmod:NinjaStarHit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

}

if (!this.worldObj.isRemote && this.rand.nextInt(8) == 0)
{
    byte b0 = 1;

    if (this.rand.nextInt(32) == 0)
    {
        b0 = 4;
    }

}

for (int j = 0; j < 8; ++j)
{
    this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
}

//If the Server is online and works, kill this entity
if (!this.worldObj.isRemote)
{
this.setDead();
}
}

}
