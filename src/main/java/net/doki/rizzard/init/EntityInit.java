package net.doki.rizzard.init;

import net.doki.rizzard.Rizzard;
import net.doki.rizzard.entity.Rizzler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Rizzard.MOD_ID);

    public static final RegistryObject<EntityType<Rizzler>> RIZZLER = ENTITIES.register("rizzler",
            () -> EntityType.Builder.<Rizzler>of(Rizzler::new, MobCategory.CREATURE)
                    .sized(10.0f, 10.0f)
                    .build(new ResourceLocation(Rizzard.MOD_ID, "rizzler").toString()));

}

