package com.singhkushaldeep7.caroremod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class CarSellingStationBlock extends Block {
    public CarSellingStationBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F, 6.0F));
    }
}