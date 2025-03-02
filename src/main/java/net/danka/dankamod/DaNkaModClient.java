package net.danka.dankamod;

import net.danka.dankamod.entity.ModEntities;
import net.danka.dankamod.entity.client.DaNkaModel;
import net.danka.dankamod.entity.client.DaNkaRenderer;
import net.danka.dankamod.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;


public class DaNkaModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.DANKA, DaNkaRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DANKA, DaNkaModel::getTexturedModelData);
    }
}
