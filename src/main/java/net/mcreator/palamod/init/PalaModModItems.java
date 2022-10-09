
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.palamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.palamod.item.HammerItem;
import net.mcreator.palamod.PalaModMod;

public class PalaModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PalaModMod.MODID);
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
}
