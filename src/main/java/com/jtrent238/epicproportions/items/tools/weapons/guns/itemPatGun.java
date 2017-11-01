package com.jtrent238.epicproportions.items.tools.weapons.guns;

import java.util.List;

import org.lwjgl.opengl.GL11;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.ItemLoader;
import com.jtrent238.epicproportions.entity.EntilyPatArrow;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class itemPatGun extends Item{

public itemPatGun(){
super();
setMaxDamage(100);
maxStackSize = 1;
setFull3D();

}

@Override
@SideOnly(Side.CLIENT)
public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
list.add(EnumChatFormatting.ITALIC + StatCollector.translateToLocal("tooltip." + EpicProportionsMod.MODID + "." + "itemPatGun"+ "." + "ammotype" ));
 }

public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, final EntityPlayer par3EntityPlayer){

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(ItemLoader.itemPatArrow))
        {
            float f = 100.0F;

            EntilyPatArrow entityarrow = new EntilyPatArrow(par2World, par3EntityPlayer, f * 2.0F)
            {

				public void onCollideWithPlayer(EntityPlayer entity){
					super.onCollideWithPlayer(entity);
					int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
					int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
					int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
					World world = this.worldObj;
					
if(true){
//world.createExplosion((Entity)null, i, j, k, 4F, true);
}

				}

            	public void onUpdate(){
				     super.onUpdate();
				     int i = MathHelper.floor_double(this.boundingBox.minX + 0.001D);
				     int j = MathHelper.floor_double(this.boundingBox.minY + 0.001D);
				     int k = MathHelper.floor_double(this.boundingBox.minZ + 0.001D);
				     World world = this.worldObj;
				     Entity entity = (Entity)par3EntityPlayer;
				     
				     if (this.worldObj.getBlock(i, j, k) != Blocks.air || this.worldObj.getBlock(i, j-1, k) != Blocks.air ||
				     this.worldObj.getBlock(i, j+1, k) != Blocks.air ||
				     this.worldObj.getBlock(i+1, j, k) != Blocks.air || this.worldObj.getBlock(i-1, j, k) != Blocks.air
				     || this.worldObj.getBlock(i, j, k+1) != Blocks.air || this.worldObj.getBlock(i, j, k-1) != Blocks.air){
				       	
if(true){
//world.createExplosion((Entity)null, i, j, k, 4F, true);
}

				       	this.kill();
				     }

            	}

            	};

                entityarrow.setIsCritical(true);
                entityarrow.setDamage(100.0);
                entityarrow.setKnockbackStrength(500);

                if(true){
                	entityarrow.setFire(100);
				}

            	par1ItemStack.damageItem(1, par3EntityPlayer);
            	par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
            {
                entityarrow.canBePickedUp = 2;
            }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(ItemLoader.itemPatArrow);
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(entityarrow);
            }
            World world = par2World;
            EntityPlayer entity = par3EntityPlayer;
			int i = (int)entity.posX;
			int j = (int)entity.posY;
			int k = (int)entity.posZ;
            
if(true){
//world.playSoundEffect((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "explode", 1.0F, 1.0F);
}

        }

        return par1ItemStack;
    }



    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }

    public static class EntityArrowCustom extends EntityArrow {
		public EntityArrowCustom(World a) {
			super(a);
		}

		public EntityArrowCustom(World a, EntityLivingBase b, float c) {
			super(a, b, c);
		}
	}

	public static class RenderCustom extends Render {
		private static final ResourceLocation tex = new ResourceLocation("PatBullet.png");

		public RenderCustom() {
			super();
			shadowSize = 0.1F;
		}

		public void render(EntityArrowCustom bullet, double d, double d1, double d2, float f, float f1) {
			bindEntityTexture(bullet);
			GL11.glPushMatrix();
			GL11.glTranslatef((float) d, (float) d1, (float) d2);
			GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(90F - bullet.prevRotationPitch - (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1.0F, 0.0F, 0.0F);
			ModelBase model = new ModelModel();
			if (model != null)
				model.render(bullet, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
		}

		@Override
		public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
			render((EntityArrowCustom) entity, d, d1, d2, f, f1);
		}

		@Override
		protected ResourceLocation getEntityTexture(Entity entity) {
			return tex;
		}
	}

	// Date: 6/29/2017 8:36:30 PM
	// Template version 1.1
	// Java generated by Techne
	// Keep in mind that you still need to fill in some blanks
	// - ZeuX

	public static class ModelModel extends ModelBase {
		// fields
		ModelRenderer Shape1;
		ModelRenderer Shape2;

		public ModelModel() {
			textureWidth = 64;
			textureHeight = 32;

			Shape1 = new ModelRenderer(this, 0, 0);
			Shape1.addBox(0F, 0F, 0F, 3, 1, 1);
			Shape1.setRotationPoint(0F, 0F, 0F);
			Shape1.setTextureSize(64, 32);
			Shape1.mirror = true;
			setRotation(Shape1, 0F, 0F, 0F);
			Shape2 = new ModelRenderer(this, 0, 0);
			Shape2.addBox(0F, 0F, 0F, 1, 1, 1);
			Shape2.setRotationPoint(-1F, 0F, 0F);
			Shape2.setTextureSize(64, 32);
			Shape2.mirror = true;
			setRotation(Shape2, 0F, 0F, 0F);
		}

		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			super.render(entity, f, f1, f2, f3, f4, f5);
			setRotationAngles(f, f1, f2, f3, f4, f5, entity);

			Shape1.render(f5);
			Shape2.render(f5);
		}

		private void setRotation(ModelRenderer model, float x, float y, float z) {
			model.rotateAngleX = x;
			model.rotateAngleY = y;
			model.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)

		{
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

		}

	}

}