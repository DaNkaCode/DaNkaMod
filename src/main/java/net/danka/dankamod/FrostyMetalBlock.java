package net.danka.dankamod;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


public class FrostyMetalBlock extends Block {
    public FrostyMetalBlock() {
        super(Settings.of(Material.STONE
                .strength(2.0f, 3.0f)
                .sounds(BlockSoundGroup.STONE) 
                .requiresTool());
    }
}