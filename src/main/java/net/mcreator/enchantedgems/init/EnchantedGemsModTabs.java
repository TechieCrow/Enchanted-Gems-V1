
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedgems.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EnchantedGemsModTabs {
	public static CreativeModeTab TAB_ENCHANTING_GEMS_CREATIVE_TAB;

	public static void load() {
		TAB_ENCHANTING_GEMS_CREATIVE_TAB = new CreativeModeTab("tabenchanting_gems_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EnchantedGemsModItems.TIGERS_EYE_GEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
