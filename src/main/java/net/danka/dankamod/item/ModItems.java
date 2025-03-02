package net.danka.dankamod.item;

import net.danka.dankamod.DaNkaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item ICE_COIN = register("ice_coin", new Item(new FabricItemSettings()));
    public static final Item ICE_CRYSTAL = register("ice_crystal", new Item(new FabricItemSettings()));
    public static final Item FROSTY_METAL = register("frosty_metal", new Item(new FabricItemSettings()));
    public static final Item RAW_FROSTY_METAL = register("raw_frosty_metal", new Item(new FabricItemSettings()));


    public static final Item ICE_SWORD = register("ice_sword", new SwordItem(ModToolMaterial.ICE_CRYSTAL, 7, 3f, new FabricItemSettings()));


    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DaNkaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DaNkaMod.LOGGER.info("Registering Mod Items for " + DaNkaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ICE_COIN);
        entries.add(ICE_CRYSTAL);
        entries.add(FROSTY_METAL);
        entries.add(ICE_SWORD);
        entries.add(RAW_FROSTY_METAL);
    }
}
