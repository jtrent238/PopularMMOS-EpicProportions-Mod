package com.jtrent238.epicproportions.entity;

import cpw.mods.fml.client.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;
import java.util.*;

import com.jtrent238.epicproportions.ItemLoader;
import com.jtrent238.epicproportions.TradeHandler;

@SuppressWarnings("unchecked")
public class Entilyjtrent238 extends EntityVillager// implements IBossDisplayData, IMerchant, INpc
{
	//private static Map jtrent238SellingList;
	World world = null;
	private int attackTimer;
	/** This villager's current customer. */
    private EntityPlayer buyingPlayer;
    /** Initialises the MerchantRecipeList.java */
    private MerchantRecipeList buyingList;
    private float field_82191_bN;
    private int randomTickDivider;
    private boolean isMating;
    private boolean isPlaying;
    Village villageObj;
    /** This villager's current customer. */
    /** Initialises the MerchantRecipeList.java */
    private int timeUntilReset;
    /** addDefaultEquipmentAndRecipies is called if this is true */
    private boolean needsInitilization;
    private int wealth;
    /** Last player to trade with this villager, used for aggressivity. */
    private String lastBuyingPlayer;
    private boolean isLookingForHome;
	private EntityPlayer theCustomer;
	private MerchantRecipeList theRecipes;
	private static ArrayList recipeList;
	private static Object villager;
	private static MerchantRecipeList mylist;
	private static MerchantRecipeList trades;
	private EntityPlayer p_70932_1_;
	private MerchantRecipeList p_70930_1_;
	private ArrayList merchantrecipelist;
	private int p_70950_1_;
	private String tradehandler;
	private IExtendedEntityProperties properties;
	private CrashReportCategory CrashInfo_Entilyjtrent238;
	/** Selling list of Villagers items. */
    public static final Map jtrent238SellingList = new HashMap();
    /** Selling list of Blacksmith items. */
    private static final String __OBFID = "CL_00001707";
	private static final Map villagersSellingList = jtrent238SellingList;
	private static final MerchantRecipeList list = mylist;
    public Entilyjtrent238(World var1)
    {
        super(var1);
        world = var1;
        experienceValue = 500;
        this.isImmuneToFire = true;
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
       // this.tasks.addTask(9, new EntityAITradePlayer(this));
       // this.tasks.addTask(10, new EntityAILookAtTradePlayer(this));
        this.tasks.addTask(11, new EntityAIMoveIndoors(this));
        this.tasks.addTask(12, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(13, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(14, new EntityAIMoveTowardsRestriction(this, 0.6D));
        this.tasks.addTask(15, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(16, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
        this.hasCustomNameTag();
        this.setCustomNameTag("jtrent238");
        this.registerExtendedProperties(tradehandler, properties);
        addRandomArmor();
        DungeonHooks.addDungeonMob("jtrent238", 180);
        this.setProfession(22);
        this.registerVillageTradeHandler(22, new TradeHandler());
        this.getProfession();
        //this.addEntityCrashInfo(CrashInfo_Entilyjtrent238);

        

    }
    

    

	private void registerVillageTradeHandler(int i, TradeHandler tradeHandler2) {

		
	}




	@SideOnly(Side.CLIENT)
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(Entilyjtrent238.class, new RenderLiving(new ModelBiped(), 0){private int jtrent238;

		protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("epicproportionsmod:Entilyjtrent238.png");}
		/*
		@SideOnly(Side.CLIENT)
		public void villagerHandler(){
			VillagerRegistry.instance().registerVillagerId(jtrent238);
	    	VillagerRegistry.instance().registerVillageTradeHandler(0, new TradeHandler());
	    	VillagerRegistry.instance().getRegisteredVillagers(); 
	    	VillagerRegistry.instance().registerVillagerSkin(0, new ResourceLocation("epicproportionsmod", "test.png"));
	   }
*//*
public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9){
super.doRender(par1EntityLiving, par2, par4, par6, par8, par9);
BossStatus.setBossStatus((Entilyjtrent238)par1EntityLiving, true);
}
*/
});
    }
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
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

        this.playSound("", 1.0F, 1.0F);
        return flag;
    }
protected void addRandomArmor(){

}

protected void dropRareDrop(int par1){
this.dropItem(Items.nether_star, 2);
this.dropItem(ItemLoader.itemSwordOfEpicProportions_Part1, 1);
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
    	this.entityDropItem(new ItemStack(Items.diamond, 16), 0F);
        this.entityDropItem(new ItemStack(Items.apple, 16), 1F);
        this.entityDropItem(new ItemStack(Items.written_book, 5), 1.1F);
        this.entityDropItem(new ItemStack(Items.bread, 8), 1.2F);
        this.entityDropItem(new ItemStack(Items.potionitem, 32), 1.3F);
        this.entityDropItem(new ItemStack(Items.emerald, 8), 1.4F);
        this.entityDropItem(new ItemStack(Items.baked_potato, 12), 1.5F);
        this.entityDropItem(new ItemStack(Items.blaze_rod, 3), 1.6F);
        this.entityDropItem(new ItemStack(Items.beef, 6), 1.7F);
        this.entityDropItem(new ItemStack(Items.flint, 16), 1.8F);
        this.entityDropItem(new ItemStack(Items.potato, 8), 1.9F);
        this.entityDropItem(new ItemStack(Items.bucket, 1), 1.10F);
        this.entityDropItem(new ItemStack(Items.speckled_melon, 64), 2F);
        this.entityDropItem(new ItemStack(Items.painting, 16), 2.1F);
        this.entityDropItem(new ItemStack(Items.golden_carrot, 8), 2.2F);
        this.entityDropItem(new ItemStack(Items.porkchop, 6), 2.3F);
        this.entityDropItem(new ItemStack(Items.item_frame, 12), 2.4F);
        this.entityDropItem(new ItemStack(Items.bone, 12), 2.5F);
        this.entityDropItem(new ItemStack(Items.fish, 12), 2.6F);
        this.entityDropItem(new ItemStack(Items.gunpowder, 12), 2.7F);
        this.entityDropItem(new ItemStack(Items.lava_bucket, 12), 2.8F);
        this.entityDropItem(new ItemStack(Items.lead, 12), 2.9F);
        this.entityDropItem(new ItemStack(Items.reeds, 12), 2.10F);
        this.entityDropItem(new ItemStack(Items.tnt_minecart, 12), 3.0F);
        this.entityDropItem(new ItemStack(Items.map, 12), 3.1F);
    	this.entityDropItem(new ItemStack(Items.chicken, 16), 3.2F);
        this.entityDropItem(new ItemStack(Items.bowl, 16), 3.3F);
        this.entityDropItem(new ItemStack(Items.command_block_minecart, 5), 3.4F);
        this.entityDropItem(new ItemStack(Items.blaze_powder, 8), 3.5F);
        this.entityDropItem(new ItemStack(Items.wooden_hoe, 32), 3.6F);
        this.entityDropItem(new ItemStack(Items.golden_carrot, 8), 3.7F);
        this.entityDropItem(new ItemStack(Items.chainmail_boots, 12), 3.8F);
        this.entityDropItem(new ItemStack(Items.shears, 3), 3.9F);
        this.entityDropItem(new ItemStack(Items.wooden_axe, 6), 4.0F);
        this.entityDropItem(new ItemStack(Items.quartz, 16), 4.1F);
        this.entityDropItem(new ItemStack(Items.iron_sword, 8), 4.2F);
        this.entityDropItem(new ItemStack(Items.gold_ingot, 1), 4.3F);
        this.entityDropItem(new ItemStack(Items.record_stal, 64), 4.4F);
        this.entityDropItem(new ItemStack(Items.repeater, 16), 4.5F);
        this.entityDropItem(new ItemStack(Items.golden_chestplate, 8), 4.6F);
        this.entityDropItem(new ItemStack(Items.fishing_rod, 6), 4.7F);
        this.entityDropItem(new ItemStack(Items.map, 12), 4.8F);
        this.entityDropItem(new ItemStack(Items.writable_book, 12), 4.9F);
        this.entityDropItem(new ItemStack(Items.arrow, 12), 5.0F);
        this.entityDropItem(new ItemStack(Items.wheat_seeds, 12), 5.1F);
        this.entityDropItem(new ItemStack(Items.iron_hoe, 12), 5.2F);
        this.entityDropItem(new ItemStack(Items.iron_axe, 12), 5.3F);
        this.entityDropItem(new ItemStack(Items.melon_seeds, 12), 5.4F);
        this.entityDropItem(new ItemStack(Items.record_ward, 12), 5.5F);
        this.entityDropItem(new ItemStack(Items.leather_chestplate, 12), 5.6F);
		
		 }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return this.isTrading() ? "mob.villager.haggle" : "mob.villager.idle";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.villager.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.villager.death";
    }

/*
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
/*
	public boolean interact(EntityPlayer entity2){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
		return true;
	}
*/
	public String getEntityName(){
		return "jtrent238";
	}


/**
* Will return how many at most can spawn in a chunk at once.
*/
	
public int getMaxSpawnedInChunk()
{
   return 1;
}

/**
 * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
 *//*
public boolean interact(EntityPlayer p_70085_1_)
{
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
    boolean flag = itemstack != null && itemstack.getItem() == Items.spawn_egg;

    if (!flag && this.isEntityAlive() && !this.isTrading() && !this.isChild() && !p_70085_1_.isSneaking())
    {
        if (!this.worldObj.isRemote)
        {
            this.setCustomer(p_70085_1_);
            p_70085_1_.displayGUIMerchant(this, this.getCustomNameTag());
        }

        return true;
    }
    else
    {
        return super.interact(p_70085_1_);
    }
}*/
/*
protected void entityInit()
{
    super.entityInit();
    this.dataWatcher.addObject(16, Integer.valueOf(0));
}
*/
/**
 * (abstract) Protected helper method to write subclass entity data to NBT.
 */
/*
public void writeEntityToNBT(NBTTagCompound p_70014_1_)
{
    super.writeEntityToNBT(p_70014_1_);
    //p_70014_1_.setInteger("Profession", this.getProfession());
    p_70014_1_.setInteger("Riches", this.wealth);

    if (this.buyingList != null)
    {
        p_70014_1_.setTag("Offers", this.buyingList.getRecipiesAsTags());
    }
}
*/
/**
 * (abstract) Protected helper method to read subclass entity data from NBT.
 */
/*
public void readEntityFromNBT(NBTTagCompound p_70037_1_)
{
    super.readEntityFromNBT(p_70037_1_);
    //this.setProfession(p_70037_1_.getInteger("Profession"));
    this.wealth = p_70037_1_.getInteger("Riches");

    if (p_70037_1_.hasKey("Offers", 10))
    {
        NBTTagCompound nbttagcompound1 = p_70037_1_.getCompoundTag("Offers");
        this.buyingList = new MerchantRecipeList(nbttagcompound1);
    }
}


public void setCustomer(EntityPlayer p_70932_1_)
{
    this.buyingPlayer = p_70932_1_;
}


public EntityPlayer getCustomer()
{
    return this.buyingPlayer;
}


public boolean isTrading()
{
    return this.buyingPlayer != null;
}


public void useRecipe(MerchantRecipe p_70933_1_)
{
    p_70933_1_.incrementToolUses();
    this.livingSoundTime = -this.getTalkInterval();
    this.playSound("mob.villager.yes", this.getSoundVolume(), this.getSoundPitch());

    if (p_70933_1_.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1)))
    {
        this.timeUntilReset = 40;
        this.needsInitilization = true;

        if (this.buyingPlayer != null)
        {
            this.lastBuyingPlayer = this.buyingPlayer.getCommandSenderName();
        }
        else
        {
            this.lastBuyingPlayer = null;
        }
    }

    if (p_70933_1_.getItemToBuy().getItem() == Items.emerald)
    {
        this.wealth += p_70933_1_.getItemToBuy().stackSize;
    }
}
*/
/*
public void func_110297_a_(ItemStack p_110297_1_)
{
    if (!this.worldObj.isRemote && this.livingSoundTime > -this.getTalkInterval() + 20)
    {
        this.livingSoundTime = -this.getTalkInterval();

        if (p_110297_1_ != null)
        {
            this.playSound("mob.villager.yes", this.getSoundVolume(), this.getSoundPitch());
        }
        else
        {
            this.playSound("mob.villager.no", this.getSoundVolume(), this.getSoundPitch());
        }
    }
}
*/
/*
public MerchantRecipeList getRecipes(EntityPlayer p_70934_1_)
{
    if (this.buyingList == null)
    {
        this.addDefaultEquipmentAndRecipies(1);
    }

    return this.buyingList;
}*/
/*
private void addDefaultEquipmentAndRecipies(int p_70950_1_)
{
	
	if (this.buyingList != null)
    {
        this.field_82191_bN = MathHelper.sqrt_float((float)this.buyingList.size()) * 0.2F;
    }
    else
    {
        this.field_82191_bN = 0.0F;
    }

    MerchantRecipeList merchantrecipelist;
    merchantrecipelist = new MerchantRecipeList();
    VillagerRegistry.manageVillagerTrades(merchantrecipelist, this, this.getProfession(), this.rand);
   int k;
    label50:
    
        /*
            func_146091_a(Items.wheat, this.rand, this.adjustProbability(0.9F));
            func_146091_a(Item.getItemFromBlock(Blocks.wool), this.rand, this.adjustProbability(0.5F));
            func_146091_a(Items.chicken, this.rand, this.adjustProbability(0.5F));
            func_146091_a(Items.cooked_fished, this.rand, this.adjustProbability(0.4F));
            */
         /*   if (this.rand.nextFloat() < this.adjustProbability(0.5F))
            {
                merchantrecipelist.add(new MerchantRecipe(new ItemStack(ItemLoader.itemJenSword, 10), new ItemStack(Items.emerald), new ItemStack(Items.flint, 4 + this.rand.nextInt(2), 0)));
            }
*/
          //  break;
            /*
        case 1:
            func_146091_a(merchantrecipelist, Items.paper, this.rand, this.adjustProbability(0.8F));
            func_146091_a(merchantrecipelist, Items.book, this.rand, this.adjustProbability(0.8F));
            func_146091_a(merchantrecipelist, Items.written_book, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Item.getItemFromBlock(Blocks.bookshelf), this.rand, this.adjustProbability(0.8F));
            func_146089_b(merchantrecipelist, Item.getItemFromBlock(Blocks.glass), this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.compass, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.clock, this.rand, this.adjustProbability(0.2F));

            if (this.rand.nextFloat() < this.adjustProbability(0.07F))
            {
                Enchantment enchantment = Enchantment.enchantmentsBookList[this.rand.nextInt(Enchantment.enchantmentsBookList.length)];
                int i1 = MathHelper.getRandomIntegerInRange(this.rand, enchantment.getMinLevel(), enchantment.getMaxLevel());
                ItemStack itemstack = Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(enchantment, i1));
                k = 2 + this.rand.nextInt(5 + i1 * 10) + 3 * i1;
                merchantrecipelist.add(new MerchantRecipe(new ItemStack(Items.book), new ItemStack(Items.emerald, k), itemstack));
            }

            break;
            */
            /*
        case 2:
            func_146089_b(merchantrecipelist, Items.ender_eye, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.experience_bottle, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.redstone, this.rand, this.adjustProbability(0.4F));
            func_146089_b(merchantrecipelist, Item.getItemFromBlock(Blocks.glowstone), this.rand, this.adjustProbability(0.3F));
            Item[] aitem = new Item[] {Items.iron_sword, Items.diamond_sword, Items.iron_chestplate, Items.diamond_chestplate, Items.iron_axe, Items.diamond_axe, Items.iron_pickaxe, Items.diamond_pickaxe};
            Item[] aitem1 = aitem;
            int j = aitem.length;
            k = 0;

            while (true)
            {
                if (k >= j)
                {
                    break label50;
                }

                Item item = aitem1[k];

                if (this.rand.nextFloat() < this.adjustProbability(0.05F))
                {
                    merchantrecipelist.add(new MerchantRecipe(new ItemStack(item, 1, 0), new ItemStack(Items.emerald, 2 + this.rand.nextInt(3), 0), EnchantmentHelper.addRandomEnchantment(this.rand, new ItemStack(item, 1, 0), 5 + this.rand.nextInt(15))));
                }

                ++k;
            }
            */
            /*
        case 3:
            func_146091_a(merchantrecipelist, Items.coal, this.rand, this.adjustProbability(0.7F));
            func_146091_a(merchantrecipelist, Items.iron_ingot, this.rand, this.adjustProbability(0.5F));
            func_146091_a(merchantrecipelist, Items.gold_ingot, this.rand, this.adjustProbability(0.5F));
            func_146091_a(merchantrecipelist, Items.diamond, this.rand, this.adjustProbability(0.5F));
            func_146089_b(merchantrecipelist, Items.iron_sword, this.rand, this.adjustProbability(0.5F));
            func_146089_b(merchantrecipelist, Items.diamond_sword, this.rand, this.adjustProbability(0.5F));
            func_146089_b(merchantrecipelist, Items.iron_axe, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.diamond_axe, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.iron_pickaxe, this.rand, this.adjustProbability(0.5F));
            func_146089_b(merchantrecipelist, Items.diamond_pickaxe, this.rand, this.adjustProbability(0.5F));
            func_146089_b(merchantrecipelist, Items.iron_shovel, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.diamond_shovel, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.iron_hoe, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.diamond_hoe, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.iron_boots, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.diamond_boots, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.iron_helmet, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.diamond_helmet, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.iron_chestplate, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.diamond_chestplate, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.iron_leggings, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.diamond_leggings, this.rand, this.adjustProbability(0.2F));
            func_146089_b(merchantrecipelist, Items.chainmail_boots, this.rand, this.adjustProbability(0.1F));
            func_146089_b(merchantrecipelist, Items.chainmail_helmet, this.rand, this.adjustProbability(0.1F));
            func_146089_b(merchantrecipelist, Items.chainmail_chestplate, this.rand, this.adjustProbability(0.1F));
            func_146089_b(merchantrecipelist, Items.chainmail_leggings, this.rand, this.adjustProbability(0.1F));
            break;
        case 4:
            func_146091_a(merchantrecipelist, Items.coal, this.rand, this.adjustProbability(0.7F));
            func_146091_a(merchantrecipelist, Items.porkchop, this.rand, this.adjustProbability(0.5F));
            func_146091_a(merchantrecipelist, Items.beef, this.rand, this.adjustProbability(0.5F));
            func_146089_b(merchantrecipelist, Items.saddle, this.rand, this.adjustProbability(0.1F));
            func_146089_b(merchantrecipelist, Items.leather_chestplate, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.leather_boots, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.leather_helmet, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.leather_leggings, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.cooked_porkchop, this.rand, this.adjustProbability(0.3F));
            func_146089_b(merchantrecipelist, Items.cooked_beef, this.rand, this.adjustProbability(0.3F));
            */
    //}
{
    //if (merchantrecipelist.isEmpty())
    {
        //func_146091_a(Items.gold_ingot, this.rand, 1.0F);
    }

    //Collections.shuffle(merchantrecipelist);
/*
    if (this.buyingList == null)
    {
        this.buyingList = new MerchantRecipeList();
    }

    for (int l = 0; l < p_70950_1_ && l < merchantrecipelist.size(); ++l)
    {
        //this.buyingList.addToListWithCheck((MerchantRecipe)merchantrecipelist.get(l));
    }
*/
    	
	//jtrent238SellingList.put(Items.coal, new Tuple(Integer.valueOf(16), Integer.valueOf(24)));
	//recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), new ItemStack(ItemLoader.itemBirthdayPresent, 1)));
	//recipeList.add(ItemLoader.itemBirthdayPresent);
	//recipeList.add(ItemLoader.itemBombyStructurePlacer);
	//recipeList.add(ItemLoader.itemJenAxe);
	//recipeList.add(ItemLoader.itemBombyStructurePlacer);
	//recipeList.add(ItemLoader.itemEpicProportionsStar);
}

/**
 * Adjusts the probability of obtaining a given recipe being offered by a villager
 */
/*
private float adjustProbability(float p_82188_1_)
{
    float f1 = p_82188_1_ + this.field_82191_bN;
    return f1 > 0.9F ? 0.9F - (f1 - 0.9F) : f1;
}
*/
/**
 * based on the villagers profession add items, equipment, and recipies adds par1 random items to the list of things
 * that the villager wants to buy. (at most 1 of each wanted type is added)
 */
/*
private void addDefaultEquipmentAndRecipies(int p_70950_1_){

            func_146091_a(Items.wheat, this.rand, this.adjustProbability(100F));

    }
*/
/*
private int trades() {
	return 0;
}
*/
/*
@SideOnly(Side.CLIENT)
public void setRecipes(MerchantRecipeList p_70930_1_) {}

public static void func_146091_a(Item p_146091_1_, Random p_146091_2_, float p_146091_3_)
{
	jtrent238SellingList.put(Items.coal, new Tuple(Integer.valueOf(16), Integer.valueOf(24)));
	//recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), new ItemStack(ItemLoader.itemBirthdayPresent, 1)));
	//recipeList.add(ItemLoader.itemBirthdayPresent);
	//recipeList.add(ItemLoader.itemBombyStructurePlacer);
	//recipeList.add(ItemLoader.itemJenAxe);
	//recipeList.add(ItemLoader.itemBombyStructurePlacer);
	//recipeList.add(ItemLoader.itemEpicProportionsStar);
	
	
    
}
*/
/*
@Override
public void func_110297_a_(ItemStack p_110297_1_) {
	new ItemStack(Items.emerald, 2);
	new ItemStack(Items.baked_potato, 2);
	new ItemStack(Items.beef, 2);
	new ItemStack(Items.blaze_rod, 2);
	new ItemStack(Items.bowl, 2);
	
}
*/

/*
private static ItemStack func_146088_a(Item p_146088_0_, Random p_146088_1_)
{
    return new ItemStack(p_146088_0_, func_146092_b(p_146088_0_, p_146088_1_), 0);
}
*/
/*
private static int func_146092_b(Item p_146092_0_, Random p_146092_1_)
{
    Tuple tuple = (Tuple)jtrent238SellingList.get(p_146092_0_);
    return tuple == null ? 1 : (((Integer)tuple.getFirst()).intValue() >= ((Integer)tuple.getSecond()).intValue() ? ((Integer)tuple.getFirst()).intValue() : ((Integer)tuple.getFirst()).intValue() + p_146092_1_.nextInt(((Integer)tuple.getSecond()).intValue() - ((Integer)tuple.getFirst()).intValue()));
}
*/
/*
public static void func_146089_b(Item p_146089_1_, Random p_146089_2_, float p_146089_3_)
{
    if (p_146089_2_.nextFloat() < p_146089_3_)
    {
        int i = func_146090_c(p_146089_1_, p_146089_2_);
        ItemStack itemstack;
        ItemStack itemstack1;

        if (i < 0)
        {
            itemstack = new ItemStack(Items.emerald, 1, 0);
            itemstack1 = new ItemStack(p_146089_1_, -i, 0);
        }
        else
        {
            itemstack = new ItemStack(Items.emerald, i, 0);
            itemstack1 = new ItemStack(p_146089_1_, 1, 0);
        }

        p_146089_0_.add(new MerchantRecipe(itemstack, itemstack1));
    }
}
*/
/*
private static int func_146090_c(Item p_146089_1_, Random p_146089_2_) {
	return 0;
}
*/
/*
private boolean isTrading() {
	return true;
}
*/
/*
@Override
public void setCustomer(EntityPlayer p_70932_1_) {
	
}
*/
/*
@Override
public EntityPlayer getCustomer() {
	
	return p_70932_1_;
}
*/
/*
@Override
public MerchantRecipeList getRecipes(EntityPlayer p_70934_1_) {
	
	recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), new ItemStack(ItemLoader.itemBirthdayPresent, 1)));
	
	return p_70930_1_;
}
*/
/*
@Override
public void setRecipes(MerchantRecipeList p_70930_1_) {
	
	recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), new ItemStack(ItemLoader.itemBirthdayPresent, 1)));
	
}
*/
/*
@Override
public void useRecipe(MerchantRecipe p_70933_1_) {
	
}
*/
/*
@Override
public void func_110297_a_(ItemStack p_110297_1_) {
	
}


}
*/

/**
 * Adjusts the probability of obtaining a given recipe being offered by a villager
 */
/*private float adjustProbability(float p_82188_1_)
{
    float f1 = p_82188_1_ + this.field_82191_bN;
    return f1 > 0.9F ? 0.9F - (f1 - 0.9F) : f1;
}

static
{
	jtrent238SellingList.put(Items.coal, new Tuple(Integer.valueOf(16), Integer.valueOf(24)));
	jtrent238SellingList.put(Items.iron_ingot, new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
    villagersSellingList.put(Items.gold_ingot, new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
    villagersSellingList.put(Items.diamond, new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
    villagersSellingList.put(Items.paper, new Tuple(Integer.valueOf(24), Integer.valueOf(36)));
    villagersSellingList.put(Items.book, new Tuple(Integer.valueOf(11), Integer.valueOf(13)));
    villagersSellingList.put(Items.written_book, new Tuple(Integer.valueOf(1), Integer.valueOf(1)));
    villagersSellingList.put(Items.ender_pearl, new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
    villagersSellingList.put(Items.ender_eye, new Tuple(Integer.valueOf(2), Integer.valueOf(3)));
    villagersSellingList.put(Items.porkchop, new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
    villagersSellingList.put(Items.beef, new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
    villagersSellingList.put(Items.chicken, new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
    villagersSellingList.put(Items.cooked_fished, new Tuple(Integer.valueOf(9), Integer.valueOf(13)));
    villagersSellingList.put(Items.wheat_seeds, new Tuple(Integer.valueOf(34), Integer.valueOf(48)));
    villagersSellingList.put(Items.melon_seeds, new Tuple(Integer.valueOf(30), Integer.valueOf(38)));
    villagersSellingList.put(Items.pumpkin_seeds, new Tuple(Integer.valueOf(30), Integer.valueOf(38)));
    villagersSellingList.put(Items.wheat, new Tuple(Integer.valueOf(18), Integer.valueOf(22)));
    villagersSellingList.put(Item.getItemFromBlock(Blocks.wool), new Tuple(Integer.valueOf(14), Integer.valueOf(22)));
    villagersSellingList.put(Items.rotten_flesh, new Tuple(Integer.valueOf(36), Integer.valueOf(64)));
    
}
*/
/*
@Override
public void setRecipes(MerchantRecipeList p_70930_1_) {
	recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 2), new ItemStack(Items.apple, 1)));
	
}

@Override
public void func_110297_a_(ItemStack p_110297_1_) {
	
}

@Override
public MerchantRecipeList getRecipes(EntityPlayer p_70934_1_) {
	
	return Entilyjtrent238.trades;
}*/
}