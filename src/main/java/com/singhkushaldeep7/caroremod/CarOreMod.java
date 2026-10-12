package com.singhkushaldeep7.caroremod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarOreMod implements ModInitializer {
    public static final String MOD_ID = "caroremod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing CarOreMod");
        // Register blocks, items, and other game content here
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void register(String id, Block block) {
        Registry.register(Registry.BLOCK, asResource(id), block);
    }

    public static void register(String id, Item item) {
        Registry.register(Registry.ITEM, asResource(id), item);
    }
}