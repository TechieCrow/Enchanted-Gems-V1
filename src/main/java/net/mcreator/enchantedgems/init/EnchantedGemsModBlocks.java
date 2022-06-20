
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
import net.mcreator.enchantedgems.block.SapphirePolishedBlockBlock;
import net.mcreator.enchantedgems.block.SapphireOreBlock;
import net.mcreator.enchantedgems.block.SapphireBlockBlock;
import net.mcreator.enchantedgems.block.RubyPolishedBlockBlock;
import net.mcreator.enchantedgems.block.RubyOreBlock;
import net.mcreator.enchantedgems.block.RubyBlockBlock;
import net.mcreator.enchantedgems.block.PearlBlockBlock;
import net.mcreator.enchantedgems.block.OpalPolishedBlockBlock;
import net.mcreator.enchantedgems.block.OpalOreBlock;
import net.mcreator.enchantedgems.block.OpalBlockBlock;
import net.mcreator.enchantedgems.block.OnyxPolishedBlockBlock;
import net.mcreator.enchantedgems.block.OnyxOreBlock;
import net.mcreator.enchantedgems.block.OnyxBlockBlock;
import net.mcreator.enchantedgems.block.MoonstonePolishedBlockBlock;
import net.mcreator.enchantedgems.block.MoonstoneOreBlock;
import net.mcreator.enchantedgems.block.MoonstoneBlockBlock;
import net.mcreator.enchantedgems.block.JadePolishedBlockBlock;
import net.mcreator.enchantedgems.block.JadeOreBlock;
import net.mcreator.enchantedgems.block.JadeBlockBlock;
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
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_POLISHED_BLOCK = REGISTRY.register("sapphire_polished_block",
			() -> new SapphirePolishedBlockBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_POLISHED_BLOCK = REGISTRY.register("ruby_polished_block", () -> new RubyPolishedBlockBlock());
	public static final RegistryObject<Block> PEARL_BLOCK = REGISTRY.register("pearl_block", () -> new PearlBlockBlock());
	public static final RegistryObject<Block> ONYX_BLOCK = REGISTRY.register("onyx_block", () -> new OnyxBlockBlock());
	public static final RegistryObject<Block> ONYX_ORE = REGISTRY.register("onyx_ore", () -> new OnyxOreBlock());
	public static final RegistryObject<Block> ONYX_POLISHED_BLOCK = REGISTRY.register("onyx_polished_block", () -> new OnyxPolishedBlockBlock());
	public static final RegistryObject<Block> MOONSTONE_BLOCK = REGISTRY.register("moonstone_block", () -> new MoonstoneBlockBlock());
	public static final RegistryObject<Block> MOONSTONE_ORE = REGISTRY.register("moonstone_ore", () -> new MoonstoneOreBlock());
	public static final RegistryObject<Block> MOONSTONE_POLISHED_BLOCK = REGISTRY.register("moonstone_polished_block",
			() -> new MoonstonePolishedBlockBlock());
	public static final RegistryObject<Block> JADE_BLOCK = REGISTRY.register("jade_block", () -> new JadeBlockBlock());
	public static final RegistryObject<Block> JADE_ORE = REGISTRY.register("jade_ore", () -> new JadeOreBlock());
	public static final RegistryObject<Block> JADE_POLISHED_BLOCK = REGISTRY.register("jade_polished_block", () -> new JadePolishedBlockBlock());
}
