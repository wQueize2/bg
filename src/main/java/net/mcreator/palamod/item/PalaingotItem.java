
package net.mcreator.palamod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class PalaingotItem extends Item {

	public PalaingotItem() {
		super(new Item.Properties().tab(PaladiumItemGroup.tab).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Paladium-Mod"));
		list.add(new TextComponent("By Tenoste"));
	}

}
