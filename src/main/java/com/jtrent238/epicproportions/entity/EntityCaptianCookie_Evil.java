package com.jtrent238.epicproportions.entity;

import java.util.Random;

import com.jtrent238.epicproportions.Achievements;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DungeonHooks;

public class EntityCaptianCookie_Evil extends EntityGolem implements IBossDisplayData
	{
		World world = null;
		private int attackTimer;
		private DamageSource damageSource;
		private EntityPlayer entityAttackedBy;
	    public EntityCaptianCookie_Evil(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 240;
	        this.isImmuneToFire = true;
	        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
	        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
	        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
	        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
	        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityJen.class, 0, true));
	        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPat.class, 0, true));
	        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityCaptianCookie.class, 0, true));
	        this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	        this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityNinjaMaster.class, 0, true));
	        this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, EntityBomby.class, 0, true));
	        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityJenGolem.class, 0, true));
	        this.targetTasks.addTask(11, new EntityAINearestAttackableTarget(this, EntityPatGolem.class, 0, true));
	        this.targetTasks.addTask(12, new EntityAINearestAttackableTarget(this, Entilyjtrent238.class, 0, true));
	        this.targetTasks.addTask(13, new EntityAINearestAttackableTarget(this, Entity.class, 0, true));
	        this.addRandomArmor();
	        this.getActivePotionEffect(Potion.damageBoost);
	        this.hurtResistantTime = 2;
	        this.isImmuneToFire = true;
	        this.getArmorItemForSlot(4, 4);
	        this.getArmorItemForSlot(3, 4);
	        this.getArmorItemForSlot(2, 4);
	        this.getArmorItemForSlot(1, 4);
	        this.setAbsorptionAmount(6);
	        this.setCurrentItemOrArmor(0, itemstack_swordofepicproportions);
	        this.hasCustomNameTag();
	        this.setCustomNameTag("§4Captian Cookie");
	        addRandomArmor();
	        //DungeonHooks.addDungeonMob("Captian Cookie", 180);
	    }
	    
	    ItemStack itemstack_swordofepicproportions = new ItemStack(ItemLoader.itemSwordOfEpicProportions);
	   
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	        //this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(6.8D);
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(1600.0D);
	        //this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
	        //this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000000.0D);
	    }

	    public boolean attackEntityAsMob(Entity p_70652_1_)
	    {
	        this.attackTimer = 10;
	        this.worldObj.setEntityState(this, (byte)4);
	        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

	        if (flag)
	        {
	            p_70652_1_.motionY += 0.4000000059604645D;
	        }

	        this.playSound("epicproportionsmod:sword_swing", 1.0F, 1.0F);
	        return flag;
	    }
	    
	    public boolean attackEntityFrom()
	    {
			
	    	if (getHealth() <= 0.0F)
	    	{
	    	    onDeath(damageSource);
	    	    if (entityAttackedBy instanceof EntityPlayer)
	    	    {
	    	        ((EntityPlayer)entityAttackedBy)
	    	              .addStat(Achievements.achievementcookies, 1);
	    	    }
	    	}
	    	
	    	return hasAttacked;
	    }
	    
	    
protected void addRandomArmor(){

}

protected void dropRareDrop(int par1){
this.dropItem(ItemLoader.itemCaptainCookieCookie, 1);
}


    	public boolean isAIEnabled()
		{
			   return true;
    	}
    	   
    	/**
         * Determines if an entity can be despawned, used on idle far away entities
         */
        protected boolean canDespawn()
        {
            return false;
        }
        
	    /**
	     * Drop items of this living's type
	     */
	    protected void dropFewItems(boolean var1, int var2)
	    {
	    	this.entityDropItem(new ItemStack(Items.cookie, 16), 4F);
	    	this.entityDropItem(new ItemStack(Items.nether_star, 1), 2F);

	    }

	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    protected String getLivingSound()
	    {
	        return "epicproportionsmod:evil_laugh";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return "epicproportionsmod:captaincookie_hurt";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return "epicproportionsmod:captaincookie_death";
	    }

	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		protected void fall(float l){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			super.fall(l);
			Entity entity = this;
			
		}

    	public void onCriticalHit(Entity entity2) {
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		public void onKillEntity(EntityLiving entityLiving){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
		}

		public boolean interact(EntityPlayer entity2){
			int i = (int)this.posX;
			int j = (int)this.posY;
			int k = (int)this.posZ;
			Entity entity = this;
			
			return true;
		}

		public String getEntityName(){
			return "Captian Cookie";
		}

	
   /**
    * Will return how many at most can spawn in a chunk at once.
    */
   public int getMaxSpawnedInChunk()
   {
       return 1;
   }
   
   
}
