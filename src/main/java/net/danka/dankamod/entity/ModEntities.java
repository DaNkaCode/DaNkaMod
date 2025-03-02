package net.danka.dankamod.entity;

import net.danka.dankamod.DaNkaMod;
import net.danka.dankamod.entity.custom.DaNkaEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<DaNkaEntity> DANKA = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DaNkaMod.MOD_ID, "danka"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DaNkaEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2f)).build());
}
