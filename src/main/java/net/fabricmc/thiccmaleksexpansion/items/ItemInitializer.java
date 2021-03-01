package net.fabricmc.thiccmaleksexpansion.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.thiccmaleksexpansion.MainInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.rmi.registry.Registry;

import java.util.ArrayList;

public class ItemInitializer {
    public static ArrayList<ItemHelper> items = new ArrayList<>();
    public static final Item copper_ingot = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public ItemInitializer()
    {
        String[] ingots = {"copper_ingot", "tin_ingot", "silver_ingot", "lead_ingot", "invar_ingot", "nickel_ingot", "electrum_ingot", "aluminum_ingot", "bronze_ingot",
        "constantan_ingot", "enderium_ingot", "iridium_ingot", "lumium_ingot", "mithril_ingot",
        "platinum_ingot", "signalum_ingot", "steel_ingot"};
        for(String s : ingots)
            addIngot(s);


    }
    public void addIngot(String name) {
        items.add(new ItemHelper(new Item(new FabricItemSettings().group(MainInitializer.RESOURCES_GROUP)), "ingot/"+name));
    }


}
