package net.palmiersama.immortal.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.palmiersama.immortal.Immortal;
import net.palmiersama.immortal.block.ModBlocks;
import net.palmiersama.immortal.item.custom.Mortar;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Immortal.MOD_ID);

    public static final RegistryObject<Item> GINSENG = ITEMS.register("ginseng",
            () -> new ItemNameBlockItem(ModBlocks.GINSENG_CROP.get(),
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(1).
                            effect(() -> new MobEffectInstance(MobEffects.HEAL, 80, 0), 0.5f).alwaysEat().build()).tab(ModCreativeModeTab.IMMORTAL_TAB)));

    public static final RegistryObject<Item> GINSENG_POWDER = ITEMS.register("ginseng_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMORTAL_TAB)));

    public static final RegistryObject<Item> WOOD_MORTAR = ITEMS.register("wood_mortar",
            () -> new Mortar(new Item.Properties().tab(ModCreativeModeTab.IMMORTAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SPIRIT_STONE = ITEMS.register("spirit_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMORTAL_TAB)));

    public static final RegistryObject<Item> PILL = ITEMS.register("pill",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMORTAL_TAB)));

    public static final RegistryObject<Item> QI_PILL = ITEMS.register("qi_pill",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IMMORTAL_TAB)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }


}
