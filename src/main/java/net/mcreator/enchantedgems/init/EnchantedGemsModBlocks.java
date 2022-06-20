
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.enchantedgems.block.TigersEyeOreBlock;
import net.mcreator.enchantedgems.block.TigersEyeBlockBlock;
import net.mcreator.enchantedgems.block.OpalOreBlock;
import net.mcreator.enchantedgems.block.OpalBlockBlock;
import net.mcreator.enchantedgems.EnchantedGemsMod;

public class EnchantedGemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EnchantedGemsMod.MODID);
	public static final RegistryObject<Block> TIGERS_EYE_ORE = REGISTRY.register("tigers_eye_ore", () -> new TigersEyeOreBlock());
	public static final RegistryObject<Block> TIGERS_EYE_BLOCK = REGISTRY.register("tigers_eye_block", () -> new TigersEyeBlockBlock());
	public static final RegistryObject<Block> OPAL_ORE = REGISTRY.register("opal_ore", () -> new OpalOreBlock());
	public static final RegistryObject<Block> OPAL_BLOCK = REGISTRY.register("opal_block", () -> new OpalBlockBlock());
}
