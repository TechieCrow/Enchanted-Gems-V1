
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.enchantedgems.block.TurquoisePolishedBlockBlock;
import net.mcreator.enchantedgems.block.TurquoiseOreBlock;
import net.mcreator.enchantedgems.block.TurquoiseBlockBlock;
import net.mcreator.enchantedgems.block.TigersEyePolishedBlockBlock;
import net.mcreator.enchantedgems.block.TigersEyeOreBlock;
import net.mcreator.enchantedgems.block.TigersEyeBlockBlock;
import net.mcreator.enchantedgems.block.OpalPolishedBlockBlock;
import net.mcreator.enchantedgems.block.OpalOreBlock;
import net.mcreator.enchantedgems.block.OpalBlockBlock;
import net.mcreator.enchantedgems.block.BloodstonePolishedBlockBlock;
import net.mcreator.enchantedgems.block.BloodstoneOreBlock;
import net.mcreator.enchantedgems.block.BloodstoneBlockBlock;
import net.mcreator.enchantedgems.EnchantedGemsMod;

public class EnchantedGemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EnchantedGemsMod.MODID);
	public static final RegistryObject<Block> TIGERS_EYE_ORE = REGISTRY.register("tigers_eye_ore", () -> new TigersEyeOreBlock());
	public static final RegistryObject<Block> TIGERS_EYE_BLOCK = REGISTRY.register("tigers_eye_block", () -> new TigersEyeBlockBlock());
	public static final RegistryObject<Block> OPAL_ORE = REGISTRY.register("opal_ore", () -> new OpalOreBlock());
	public static final RegistryObject<Block> OPAL_BLOCK = REGISTRY.register("opal_block", () -> new OpalBlockBlock());
	public static final RegistryObject<Block> BLOODSTONE_ORE = REGISTRY.register("bloodstone_ore", () -> new BloodstoneOreBlock());
	public static final RegistryObject<Block> BLOODSTONE_BLOCK = REGISTRY.register("bloodstone_block", () -> new BloodstoneBlockBlock());
	public static final RegistryObject<Block> TIGERS_EYE_POLISHED_BLOCK = REGISTRY.register("tigers_eye_polished_block",
			() -> new TigersEyePolishedBlockBlock());
	public static final RegistryObject<Block> OPAL_POLISHED_BLOCK = REGISTRY.register("opal_polished_block", () -> new OpalPolishedBlockBlock());
	public static final RegistryObject<Block> BLOODSTONE_POLISHED_BLOCK = REGISTRY.register("bloodstone_polished_block",
			() -> new BloodstonePolishedBlockBlock());
	public static final RegistryObject<Block> TURQUOISE_ORE = REGISTRY.register("turquoise_ore", () -> new TurquoiseOreBlock());
	public static final RegistryObject<Block> TURQUOISE_BLOCK = REGISTRY.register("turquoise_block", () -> new TurquoiseBlockBlock());
	public static final RegistryObject<Block> TURQUOISE_POLISHED_BLOCK = REGISTRY.register("turquoise_polished_block",
			() -> new TurquoisePolishedBlockBlock());
}
