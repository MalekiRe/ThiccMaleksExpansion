package net.fabricmc.thiccmaleksexpansion;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.thiccmaleksexpansion.items.ItemHelper;
import net.fabricmc.thiccmaleksexpansion.items.ItemInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MainInitializer implements ModInitializer {
	public static final ItemGroup RESOURCES_GROUP = FabricItemGroupBuilder.build(
			new Identifier("thiccmaleksexpansion", "resources_group"),
			() -> new ItemStack(ItemInitializer.items.get(0).item));
	ItemInitializer initializer = new ItemInitializer();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		for(ItemHelper itemHelper : ItemInitializer.items)
			Registry.register(Registry.ITEM, new Identifier("thiccmaleksexpansion", itemHelper.name), itemHelper.item);
		System.out.println("Hello Fabric world!");
	}
}
