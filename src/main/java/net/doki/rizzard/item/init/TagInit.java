package net.doki.rizzard.item.init;

import net.doki.rizzard.Rizzard;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_TRICEP_TOOL = tag("needs.tricep.tool");

    public static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(Rizzard.MOD_ID, name));
    }
}
