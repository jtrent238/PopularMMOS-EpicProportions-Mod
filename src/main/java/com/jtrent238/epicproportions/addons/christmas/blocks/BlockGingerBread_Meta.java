package com.jtrent238.epicproportions.addons.christmas.blocks;

import com.jtrent238.epicproportions.addons.christmas.epicproportionsmod_christmas;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockGingerBread_Meta extends ItemBlockWithMetadata {

    public BlockGingerBread_Meta(Block block, int meta, World p_149643_1_, int p_149643_2_, int p_149643_4_) {
            super(block, block);
            this.setCreativeTab(epicproportionsmod_christmas.EpicProportionsMod_Christmas);
            this.setTextureName("epicproportionsmod_christmas:BlockGingerBread" + "_" + block.getDamageValue(p_149643_1_, p_149643_2_, p_149643_2_, p_149643_4_));
    }
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
    
    }