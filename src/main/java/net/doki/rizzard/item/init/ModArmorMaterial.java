package net.doki.rizzard.item.init;

import net.doki.rizzard.Rizzard;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ModArmorMaterial implements ArmorMaterial {
    private final int[] durabitliyForType;
    private final int[] defenseForType;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

    public ModArmorMaterial(int[] durabitliyForType, int[] defenseForType, int enchantability, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, String name, float toughness, float knockbackResistance) {
        this.durabitliyForType = durabitliyForType;
        this.defenseForType = defenseForType;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return this.durabitliyForType[type.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.defenseForType[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return Rizzard.MOD_ID + ":" + name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
