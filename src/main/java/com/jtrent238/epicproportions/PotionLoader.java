package com.jtrent238.epicproportions;

import com.google.common.collect.Maps;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.StringUtils;

public class PotionLoader
{
    /** The array of potion types. */
    public static final PotionLoader[] potionTypes = new PotionLoader[32];
    public static final PotionLoader field_76423_b = null;
    //public static final PotionLoader potionCloud = (new PotionLoader(33, false, 8171462)).setPotionName("potion.potionCloud").setIconIndex(0, 0).func_111184_a(SharedMonsterAttributes.movementSpeed, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224D, 2);
    public static final PotionLoader field_76442_z = null;
    public static final PotionLoader field_76409_A = null;
    public static final PotionLoader field_76410_B = null;
    public static final PotionLoader field_76411_C = null;
    public static final PotionLoader field_76405_D = null;
    public static final PotionLoader field_76406_E = null;
    public static final PotionLoader field_76407_F = null;
    public static final PotionLoader field_76408_G = null;
    /** The Id of a Potion object. */
    public final int id;
    private final Map field_111188_I = Maps.newHashMap();
    /** This field indicated if the effect is 'bad' - negative - for the entity. */
    private final boolean isBadEffect;
    /** Is the color of the liquid for this potion. */
    private final int liquidColor;
    /** The name of the Potion. */
    private String name = "";
    /** The index for the icon displayed when the potion effect is active. */
    private int statusIconIndex = -1;
    private double effectiveness;
    private boolean usable;
    private static final String __OBFID = "CL_00001528";

    protected PotionLoader(int p_i1573_1_, boolean p_i1573_2_, int p_i1573_3_)
    {
        this.id = p_i1573_1_;
        //potionTypes[p_i1573_1_] = this;
        this.isBadEffect = p_i1573_2_;

        if (p_i1573_2_)
        {
            this.effectiveness = 0.5D;
        }
        else
        {
            this.effectiveness = 1.0D;
        }

        this.liquidColor = p_i1573_3_;
    }

    /**
     * Sets the index for the icon displayed in the player's inventory when the status is active.
     */
    protected PotionLoader setIconIndex(int p_76399_1_, int p_76399_2_)
    {
        this.statusIconIndex = p_76399_1_ + p_76399_2_ * 8;
        return this;
    }

    /**
     * returns the ID of the potion
     */
    public int getId()
    {
        return this.id;
    }

    public void performEffect(EntityLivingBase p_76394_1_, int p_76394_2_)
    {
        //if (this.id == potionCloud.id)
        {
            if (p_76394_1_.getHealth() < p_76394_1_.getMaxHealth())
            {
                p_76394_1_.heal(1.0F);
            }
        }

    }

    
    /**
     * Returns true if the potion has an instant effect instead of a continuous one (eg Harming)
     */
    public boolean isInstant()
    {
        return false;
    }

    /**
     * checks if Potion effect is ready to be applied this tick.
     */
    public boolean isReady(int p_76397_1_, int p_76397_2_)
    {
        int k;

        //if (this.id == potionCloud.id)
        {
            k = 50 >> p_76397_2_;
            return k > 0 ? p_76397_1_ % k == 0 : true;
        }
		//return isBadEffect;
        
    }

    /**
     * Set the potion name.
     */
    public PotionLoader setPotionName(String p_76390_1_)
    {
        this.name = p_76390_1_;
        return this;
    }

    /**
     * returns the name of the potion
     */
    public String getName()
    {
        return this.name;
    }

    protected PotionLoader setEffectiveness(double p_76404_1_)
    {
        this.effectiveness = p_76404_1_;
        return this;
    }

    /**
     * Returns true if the potion has a associated status icon to display in then inventory when active.
     */
    @SideOnly(Side.CLIENT)
    public boolean hasStatusIcon()
    {
        return this.statusIconIndex >= 0;
    }

    /**
     * Returns the index for the icon to display when the potion is active.
     */
    @SideOnly(Side.CLIENT)
    public int getStatusIconIndex()
    {
        return this.statusIconIndex;
    }

    /**
     * This method returns true if the potion effect is bad - negative - for the entity.
     */
    @SideOnly(Side.CLIENT)
    public boolean isBadEffect()
    {
        return this.isBadEffect;
    }

    @SideOnly(Side.CLIENT)
    public static String getDurationString(com.jtrent238.epicproportions.PotionEffect potioneffect)
    {
        if (potioneffect.getIsPotionDurationMax())
        {
            return "**:**";
        }
        else
        {
            int i = potioneffect.getDuration();
            return StringUtils.ticksToElapsedTime(i);
        }
    }

    public double getEffectiveness()
    {
        return this.effectiveness;
    }

    public boolean isUsable()
    {
        return this.usable;
    }

    /**
     * Returns the color of the potion liquid.
     */
    public int getLiquidColor()
    {
        return this.liquidColor;
    }

    public PotionLoader func_111184_a(IAttribute p_111184_1_, String p_111184_2_, double p_111184_3_, int p_111184_5_)
    {
        AttributeModifier attributemodifier = new AttributeModifier(UUID.fromString(p_111184_2_), this.getName(), p_111184_3_, p_111184_5_);
        this.field_111188_I.put(p_111184_1_, attributemodifier);
        return this;
    }

    public void removeAttributesModifiersFromEntity(EntityLivingBase p_111187_1_, BaseAttributeMap p_111187_2_, int p_111187_3_)
    {
        Iterator iterator = this.field_111188_I.entrySet().iterator();

        while (iterator.hasNext())
        {
            Entry entry = (Entry)iterator.next();
            IAttributeInstance iattributeinstance = p_111187_2_.getAttributeInstance((IAttribute)entry.getKey());

            if (iattributeinstance != null)
            {
                iattributeinstance.removeModifier((AttributeModifier)entry.getValue());
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public Map func_111186_k()
    {
        return this.field_111188_I;
    }

    public void applyAttributesModifiersToEntity(EntityLivingBase p_111185_1_, BaseAttributeMap p_111185_2_, int p_111185_3_)
    {
        Iterator iterator = this.field_111188_I.entrySet().iterator();

        while (iterator.hasNext())
        {
            Entry entry = (Entry)iterator.next();
            IAttributeInstance iattributeinstance = p_111185_2_.getAttributeInstance((IAttribute)entry.getKey());

            if (iattributeinstance != null)
            {
                AttributeModifier attributemodifier = (AttributeModifier)entry.getValue();
                iattributeinstance.removeModifier(attributemodifier);
                iattributeinstance.applyModifier(new AttributeModifier(attributemodifier.getID(), this.getName() + " " + p_111185_3_, this.func_111183_a(p_111185_3_, attributemodifier), attributemodifier.getOperation()));
            }
        }
    }

    public double func_111183_a(int p_111183_1_, AttributeModifier p_111183_2_)
    {
        return p_111183_2_.getAmount() * (double)(p_111183_1_ + 1);
    }
    
    /* ======================================== FORGE START =====================================*/
    
    /**
     * If the standard PotionEffect text (name and duration) should be drawn when this potion is active. 
     * @param effect the active PotionEffect
     * @return true to draw the standard text
     */
    public boolean shouldRenderInvText(PotionEffect effect)
    {
        return true;
    }
    
    /**
     * Called to draw the this Potion onto the player's inventory when it's active.
     * This can be used to e.g. render Potion icons from your own texture.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param effect the active PotionEffect
     * @param mc the Minecraft instance, for convenience
     */
    @SideOnly(Side.CLIENT)
    public void renderInventoryEffect(int x, int y, PotionEffect effect, net.minecraft.client.Minecraft mc) { }
}