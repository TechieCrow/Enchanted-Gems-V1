
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.enchantedgems.item.TurquoiseGemItem;
import net.mcreator.enchantedgems.item.TigersEyeGemItem;
import net.mcreator.enchantedgems.item.SapphireGemItem;
import net.mcreator.enchantedgems.item.OpalGemItem;
import net.mcreator.enchantedgems.item.BloodstoneGemItem;
import net.mcreator.enchantedgems.EnchantedGemsMod;

public class EnchantedGemsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnchantedGemsMod.MODID);
	public static final RegistryObject<Item> TIGERS_EYE_ORE = block(EnchantedGemsModBlocks.TIGERS_EYE_ORE,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> TIGERS_EYE_BLOCK = block(EnchantedGemsModBlocks.TIGERS_EYE_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> TIGERS_EYE_GEM = REGISTRY.register("tigers_eye_gem", () -> new TigersEyeGemItem());
	public static final RegistryObject<Item> OPAL_ORE = block(EnchantedGemsModBlocks.OPAL_ORE, EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> OPAL_BLOCK = block(EnchantedGemsModBlocks.OPAL_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> OPAL_GEM = REGISTRY.register("opal_gem", () -> new OpalGemItem());
	public static final RegistryObject<Item> BLOODSTONE_ORE = block(EnchantedGemsModBlocks.BLOODSTONE_ORE,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOODSTONE_BLOCK = block(EnchantedGemsModBlocks.BLOODSTONE_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOODSTONE_GEM = REGISTRY.register("bloodstone_gem", () -> new BloodstoneGemItem());
	public static final RegistryObject<Item> TIGERS_EYE_POLISHED_BLOCK = block(EnchantedGemsModBlocks.TIGERS_EYE_POLISHED_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> OPAL_POLISHED_BLOCK = block(EnchantedGemsModBlocks.OPAL_POLISHED_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> BLOODSTONE_POLISHED_BLOCK = block(EnchantedGemsModBlocks.BLOODSTONE_POLISHED_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> TURQUOISE_ORE = block(EnchantedGemsModBlocks.TURQUOISE_ORE,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> TURQUOISE_BLOCK = block(EnchantedGemsModBlocks.TURQUOISE_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> TURQUOISE_POLISHED_BLOCK = block(EnchantedGemsModBlocks.TURQUOISE_POLISHED_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> TURQUOISE_GEM = REGISTRY.register("turquoise_gem", () -> new TurquoiseGemItem());
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(EnchantedGemsModBlocks.SAPPHIRE_ORE,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(EnchantedGemsModBlocks.SAPPHIRE_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> SAPPHIRE_POLISHED_BLOCK = block(EnchantedGemsModBlocks.SAPPHIRE_POLISHED_BLOCK,
			EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB);
	public static final RegistryObject<Item> SAPPHIRE_GEM = REGISTRY.register("sapphire_gem", () -> new SapphireGemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
