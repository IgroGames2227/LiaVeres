package com.algorithmlx.liaveres.common.object.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class MatterSword extends SwordItem
{
    public MatterSword()
    {
        super(ItemTier.IRON,  12,2F, new Properties());
    }
}
