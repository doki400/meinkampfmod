package net.doki.rizzard.init;


import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class RizzardTiers {
    public static final ForgeTier BUNGEE = new ForgeTier(
            3, 400, 40, 3, 3, TagInit.NEEDS_TRICEP_TOOL, () -> Ingredient.of(ModItems.RIZZICK::get));
}
