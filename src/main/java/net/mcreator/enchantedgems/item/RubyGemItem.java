
package net.mcreator.enchantedgems.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.enchantedgems.init.EnchantedGemsModTabs;

public class RubyGemItem extends Item {
	public RubyGemItem() {
		super(new Item.Properties().tab(EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
