
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enchantedgems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.enchantedgems.world.features.ores.TurquoiseOreFeature;
import net.mcreator.enchantedgems.world.features.ores.TigersEyeOreFeature;
import net.mcreator.enchantedgems.world.features.ores.SapphireOreFeature;
import net.mcreator.enchantedgems.world.features.ores.RubyOreFeature;
import net.mcreator.enchantedgems.world.features.ores.OpalOreFeature;
import net.mcreator.enchantedgems.world.features.ores.OnyxOreFeature;
import net.mcreator.enchantedgems.world.features.ores.MoonstoneOreFeature;
import net.mcreator.enchantedgems.world.features.ores.JadeOreFeature;
import net.mcreator.enchantedgems.world.features.ores.BloodstoneOreFeature;
import net.mcreator.enchantedgems.world.features.ores.AquamarineOreFeature;
import net.mcreator.enchantedgems.EnchantedGemsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class EnchantedGemsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EnchantedGemsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> TIGERS_EYE_ORE = register("tigers_eye_ore", TigersEyeOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TigersEyeOreFeature.GENERATE_BIOMES, TigersEyeOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OPAL_ORE = register("opal_ore", OpalOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OpalOreFeature.GENERATE_BIOMES, OpalOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLOODSTONE_ORE = register("bloodstone_ore", BloodstoneOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, BloodstoneOreFeature.GENERATE_BIOMES, BloodstoneOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TURQUOISE_ORE = register("turquoise_ore", TurquoiseOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TurquoiseOreFeature.GENERATE_BIOMES, TurquoiseOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = register("sapphire_ore", SapphireOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, SapphireOreFeature.GENERATE_BIOMES, SapphireOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ORE = register("ruby_ore", RubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES, RubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ONYX_ORE = register("onyx_ore", OnyxOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OnyxOreFeature.GENERATE_BIOMES, OnyxOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MOONSTONE_ORE = register("moonstone_ore", MoonstoneOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MoonstoneOreFeature.GENERATE_BIOMES, MoonstoneOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> JADE_ORE = register("jade_ore", JadeOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, JadeOreFeature.GENERATE_BIOMES, JadeOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AQUAMARINE_ORE = register("aquamarine_ore", AquamarineOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, AquamarineOreFeature.GENERATE_BIOMES, AquamarineOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
