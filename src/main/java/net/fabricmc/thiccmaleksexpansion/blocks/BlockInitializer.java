package net.fabricmc.thiccmaleksexpansion.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.thiccmaleksexpansion.MainInitializer;
import net.fabricmc.thiccmaleksexpansion.items.ItemHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.util.ArrayList;

public class BlockInitializer {
    public static ArrayList<BlockHelper> blocks = new ArrayList<>();

    public BlockInitializer()
    {
        String[] ores = {"copper_ore", "tin_ore", "silver_ore", "lead_ore", "nickel_ore", "aluminum_ore",
                            "iridium_ore", "mithril_ore", "platinum_ore"};
        for(String s : ores)
            addOre(s);


    }
    public void addOre(String name) {
        blocks.add(new BlockHelper(new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f)), "ore/"+name));
    }
}
