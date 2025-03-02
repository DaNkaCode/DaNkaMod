package net.danka.dankamod;

import net.danka.dankamod.entity.ModEntities;
import net.danka.dankamod.entity.custom.DaNkaEntity;
import net.danka.dankamod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaNkaMod implements ModInitializer {
	public static final String MOD_ID = "dankamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		FabricDefaultAttributeRegistry.register(ModEntities.DANKA, DaNkaEntity.createDaNkaAttributes());
	}
}