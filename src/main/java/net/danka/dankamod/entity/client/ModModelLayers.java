package net.danka.dankamod.entity.client;

import net.danka.dankamod.DaNkaMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer DANKA =
            new EntityModelLayer(new Identifier(DaNkaMod.MOD_ID, "danka"), "main");
}
