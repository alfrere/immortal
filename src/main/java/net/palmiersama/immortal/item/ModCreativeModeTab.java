package net.palmiersama.immortal.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab IMMORTAL_TAB = new CreativeModeTab("immortal_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WOOD_MORTAR.get());
        }
    };

}
