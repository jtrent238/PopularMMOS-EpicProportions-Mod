package com.jtrent238.epicproportions.items.tools;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.jtrent238.epicproportions.ItemLoader;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class itemSuperPatMultiTool extends ItemPickaxe {

	private static final int enchant = ItemLoader.superenchantlvl;
	private boolean hasenchanted;


    public itemSuperPatMultiTool(ToolMaterial material) {
        super(material);
    }
    
    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "spade");
    }
    
    private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
    	    Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, 
    	    Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, 
    	    Blocks.soul_sand, Blocks.mycelium});
    
    @Override
    public float func_150893_a(ItemStack stack, Block block) {
        return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
    }
    
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (!player.canPlayerEdit(x, y, z, side, stack)) {
            return false;
        } else {
            UseHoeEvent event = new UseHoeEvent(player, stack, world, x, y, z);
            if (MinecraftForge.EVENT_BUS.post(event)) {
                return false;
            }

            if (event.getResult() == Result.ALLOW) {
                stack.damageItem(1, player);
                return true;
            }

            Block block = world.getBlock(x, y, z);

            if (side != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
                Block block1 = Blocks.farmland;
                world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);

                if (world.isRemote) {
                    return true;
                } else {
                    world.setBlock(x, y, z, block1);
                    stack.damageItem(1, player);
                    return true;
                }
            } else {
                return false;
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return true;
    }
    
    
    public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.addEnchantment(Enchantment.efficiency, enchant);
		par1ItemStack.addEnchantment(Enchantment.fortune, enchant);
		par1ItemStack.addEnchantment(Enchantment.unbreaking, enchant);
		par1ItemStack.addEnchantment(Enchantment.fireAspect, enchant);
		par1ItemStack.addEnchantment(Enchantment.knockback, enchant);
		par1ItemStack.addEnchantment(Enchantment.looting, enchant);
		par1ItemStack.addEnchantment(Enchantment.smite, enchant);
		
}
    /**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    /*
    public void onUpdate(ItemStack par1ItemStack, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) 
    {
    	if(hasenchanted == false){
    		par1ItemStack.addEnchantment(Enchantment.efficiency, enchant);
    		par1ItemStack.addEnchantment(Enchantment.fortune, enchant);
    		par1ItemStack.addEnchantment(Enchantment.unbreaking, enchant);
    		par1ItemStack.addEnchantment(Enchantment.fireAspect, enchant);
    		par1ItemStack.addEnchantment(Enchantment.knockback, enchant);
    		par1ItemStack.addEnchantment(Enchantment.looting, enchant);
    		par1ItemStack.addEnchantment(Enchantment.smite, enchant);
    	this.hasenchanted(true);
    	}
    	
    	return;
    }


	private void hasenchanted(boolean b) {
		
	}
	*/
}