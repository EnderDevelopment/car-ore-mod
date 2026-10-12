package com.singhkushaldeep7.caroremod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class CarOreBlock extends Block {
    public CarOreBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 3.0F));
    }
}