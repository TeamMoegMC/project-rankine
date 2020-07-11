package com.cannolicatfish.rankine.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ItemToxin extends Item {
    private static int type;

    public ItemToxin(int type, Properties properties) {
        super(properties);
        ItemToxin.type = type;
    }


    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (type == 0) //Mercury
        {
            ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.WEAKNESS, 7 * 20, 0));
            ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 7 * 20, 0));
            ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.BLINDNESS, 7 * 20, 0));
            if (isSelected)
            {
                ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.POISON, 7 * 20, 0));
            }
        }
        if (type == 1)
        {
            ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.WITHER, 7 * 20, 0));
        }
    }


}
