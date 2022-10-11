
package net.mcreator.palamod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PalatoolsAxeItem extends AxeItem {
	public PalatoolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3811;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 14;
			}

			public int getEnchantmentValue() {
				return 98;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PalaModModItems.PALAINGOT.get()));
			}
		},

				1, -3f,

				new Item.Properties().tab(PaladiumItemGroup.tab));
	}

}
