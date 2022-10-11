
package net.mcreator.palamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.palamod.itemgroup.PaladiumItemGroup;
import net.mcreator.palamod.PalaModModElements;

@PalaModModElements.ModElement.Tag
public class PalatoolsHoeItem extends PalaModModElements.ModElement {
	@ObjectHolder("pala_mod:palatools_hoe")
	public static final Item block = null;

	public PalatoolsHoeItem(PalaModModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3811;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 14;
			}

			public int getEnchantability() {
				return 98;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PalaingotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(PaladiumItemGroup.tab)) {
		}.setRegistryName("palatools_hoe"));
	}
}
