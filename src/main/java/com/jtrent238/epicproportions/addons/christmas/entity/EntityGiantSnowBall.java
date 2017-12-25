package com.jtrent238.epicproportions.addons.christmas.entity;

import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;

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
import net.minecraft.init.Blocks;
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
public class EntityGiantSnowBall extends EntityThrowable
{
/*
* If you're wondering why I have all of
* these constructors for no reason, It's
* used by Forge to use this class, If you
* don't have these, your minecraft is going
* to crash!
*/
public EntityGiantSnowBall(World par1World, double par2, double par4, double par6)
{
super(par1World, par2, par4, par6);
}
public EntityGiantSnowBall(World par1World, EntityLivingBase par2EntityLivingBase)
{
super(par1World, par2EntityLivingBase);
}
public EntityGiantSnowBall(World par1World)
{
super(par1World);
}
//@Override
/**
 * Called when this EntityThrowable hits a block or entity.
 */
protected void onImpact(MovingObjectPosition mop)
{
	if(EpicProportionsMod.ENABLE_DEVLOGGING == true){
 
		System.out.println("EntityGiantSnowBall landed!");
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

this.playSound("epicproportionsmod_christmas:bigsnowball_hit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

}

if (mop.entityHit != null)
{
    mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0.5F);
    this.playSound("epicproportionsmod_christmas:bigsnowball_hit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

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
	Vec3 look = this.getLookVec();
	//EntityGiantSnowBall BigSBall = new EntityGiantSnowBall(worldObj, 1, 1, 1);
	//BigSBall.setPosition(
	//		this.posX + look.xCoord * 5,
	//		this.posY + look.yCoord * 5,
	//		this.posZ + look.zCoord * 5);
	//BigSBall.lastTickPosX = look.xCoord * 0.1;
	//BigSBall.lastTickPosY = look.yCoord * 0.1;
	//BigSBall.lastTickPosZ = look.zCoord * 0.1;
	//worldObj.spawnEntityInWorld(BigSBall);
    this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    this.worldObj.setBlock(serverPosX, serverPosY, serverPosZ, Blocks.snow);
    //this.worldObj.setBlock((int) BigSBall.lastTickPosX, (int) BigSBall.lastTickPosY, (int) BigSBall.lastTickPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX, serverPosY, serverPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX + 1, serverPosY, serverPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX + 2, serverPosY, serverPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX + 3, serverPosY, serverPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX, serverPosY + 1, serverPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX, serverPosY + 2, serverPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX, serverPosY + 3, serverPosZ, Blocks.snow);
    this.worldObj.setBlock(serverPosX, serverPosY, serverPosZ + 1, Blocks.snow);
    this.worldObj.setBlock(serverPosX, serverPosY, serverPosZ + 2, Blocks.snow);
    this.worldObj.setBlock(serverPosX, serverPosY, serverPosZ + 3, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX + 1, chunkCoordY, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX + 2, chunkCoordY, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX + 3, chunkCoordY, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY + 1, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY + 2, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY + 3, chunkCoordZ, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY, chunkCoordZ + 1, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY, chunkCoordZ + 2, Blocks.snow);
    this.worldObj.setBlock(chunkCoordX, chunkCoordY, chunkCoordZ + 3, Blocks.snow);
    this.worldObj.createExplosion(this, serverPosX, serverPosY, serverPosZ, 0F, inGround);
    //worldObj.createExplosion(BigSBall, chunkCoordX, chunkCoordY, chunkCoordZ, 0F, inGround);
}

//If the Server is online and works, kill this entity
if (!this.worldObj.isRemote)
{
this.setDead();
}
}

}
