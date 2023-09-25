package net.doki.rizzard.init;

import net.doki.rizzard.Rizzard;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Rizzard.MOD_ID);

    public static final RegistryObject<Item> RIZZICK = ITEMS.register("rizzick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETSPEND = ITEMS.register("netspend",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<ShovelItem> TRICEP = ITEMS.register("tricep",
            () -> new ShovelItem(
                    RizzardTiers.BUNGEE,
                    7,
                    3.5f,
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
