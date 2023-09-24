package net.doki.rizzard.item.init;

import net.doki.rizzard.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial MIND = new ModArmorMaterial(
            new int[] { 1000, 1000, 1000, 1000},
            new int[] { 11, 11, 11, 11},
            20,
            SoundEvents.PORTAL_TRIGGER,
            () -> Ingredient.of(ModItems.RIZZICK::get),
            "mind",
            3f,
            0.1f

    );
}
