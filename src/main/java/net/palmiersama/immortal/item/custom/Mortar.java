package net.palmiersama.immortal.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Mortar extends Item {

    public Mortar(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return itemStack.copy();
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}
