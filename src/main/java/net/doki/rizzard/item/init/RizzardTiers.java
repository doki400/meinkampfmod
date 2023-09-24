package net.doki.rizzard.item.init;


import net.doki.rizzard.item.ModItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class RizzardTiers {
    public static final ForgeTier BUNGEE = new ForgeTier(
            3, 300, 2, 3, 3, TagInit.NEEDS_TRICEP_TOOL, () -> Ingredient.of(ModItems.RIZZICK::get));
}
