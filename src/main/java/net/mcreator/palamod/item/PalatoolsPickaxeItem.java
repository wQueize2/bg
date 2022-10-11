
package net.mcreator.palamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.palamod.PalaModModElements;

@PalaModModElements.ModElement.Tag
public class PalatoolsPickaxeItem extends PalaModModElements.ModElement {
	@ObjectHolder("pala_mod:palatools_pickaxe")
	public static final Item block = null;

	public PalatoolsPickaxeItem(PalaModModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("palatools_pickaxe"));
	}
}
