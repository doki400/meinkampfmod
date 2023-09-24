package net.doki.rizzard.item;

import net.doki.rizzard.Rizzard;
import net.doki.rizzard.item.init.ArmorMaterialInit;
import net.doki.rizzard.item.init.RizzardTiers;
import net.doki.rizzard.item.init.TagInit;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Rizzard.MOD_ID);

    public static final RegistryObject<Item> RIZZICK = ITEMS.register("rizzick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETSPEND = ITEMS.register("netspend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<PickaxeItem> TRICEP = ITEMS.register("tricep",
            () -> new PickaxeItem(
                    RizzardTiers.BUNGEE,
                    7,
                    2.5f,
                    new Item.Properties()
            ));
    public static final RegistryObject<ArmorItem> MINDCAP = ITEMS.register("mindcap",
            () -> new ArmorItem(
            ArmorMaterialInit.MIND,
            ArmorItem.Type.HELMET,
            new Item.Properties()
    ));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
