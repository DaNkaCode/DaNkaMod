package net.danka.dankamod.entity.client;

import net.danka.dankamod.DaNkaMod;
import net.danka.dankamod.entity.custom.DaNkaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DaNkaRenderer extends MobEntityRenderer<DaNkaEntity, DaNkaModel<DaNkaEntity>> {
    private static final Identifier TEXTURE = new Identifier(DaNkaMod.MOD_ID, "textures/entity/danka.png");

    public DaNkaRenderer(EntityRendererFactory.Context context) {
        super(context, new DaNkaModel<>(context.getPart(ModModelLayers.DANKA)), 0.6f);
    }

    @Override
    public Identifier getTexture(DaNkaEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(DaNkaEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(1f, 1f, 1f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
    }
}
