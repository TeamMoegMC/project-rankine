package com.cannolicatfish.rankine;


import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "generalSettings";
    public static final String CATEGORY_ALLOYS = "alloySettings";
    public static final String CATEGORY_WORLDGEN = "worldgenSettings";

    public static final String SUBCATEGORY_EVENTS = "event";
    public static final String SUBCATEGORY_ALLOYS = "alloys";
    public static final String SUBCATEGORY_OREGEN = "oregen";
    public static final String SUBCATEGORY_OVERWORLD = "overworldOres";
    public static final String SUBCATEGORY_NETHER = "netherOres";
    public static final String SUBCATEGORY_END = "endOres";


    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.BooleanValue DISABLE_WOODEN_SWORD;
    public static ForgeConfigSpec.BooleanValue DISABLE_WOODEN_AXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_WOODEN_SHOVEL;
    public static ForgeConfigSpec.BooleanValue DISABLE_WOODEN_PICKAXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_WOODEN_HOE;
    public static ForgeConfigSpec.BooleanValue DISABLE_STONE_SWORD;
    public static ForgeConfigSpec.BooleanValue DISABLE_STONE_AXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_STONE_SHOVEL;
    public static ForgeConfigSpec.BooleanValue DISABLE_STONE_PICKAXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_STONE_HOE;
    public static ForgeConfigSpec.BooleanValue DISABLE_IRON_SWORD;
    public static ForgeConfigSpec.BooleanValue DISABLE_IRON_AXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_IRON_SHOVEL;
    public static ForgeConfigSpec.BooleanValue DISABLE_IRON_PICKAXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_IRON_HOE;
    public static ForgeConfigSpec.BooleanValue DISABLE_GOLDEN_SWORD;
    public static ForgeConfigSpec.BooleanValue DISABLE_GOLDEN_AXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_GOLDEN_SHOVEL;
    public static ForgeConfigSpec.BooleanValue DISABLE_GOLDEN_PICKAXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_GOLDEN_HOE;
    public static ForgeConfigSpec.BooleanValue DISABLE_DIAMOND_SWORD;
    public static ForgeConfigSpec.BooleanValue DISABLE_DIAMOND_AXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_DIAMOND_SHOVEL;
    public static ForgeConfigSpec.BooleanValue DISABLE_DIAMOND_PICKAXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_DIAMOND_HOE;
    public static ForgeConfigSpec.BooleanValue DISABLE_NETHERITE_SWORD;
    public static ForgeConfigSpec.BooleanValue DISABLE_NETHERITE_AXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_NETHERITE_SHOVEL;
    public static ForgeConfigSpec.BooleanValue DISABLE_NETHERITE_PICKAXE;
    public static ForgeConfigSpec.BooleanValue DISABLE_NETHERITE_HOE;

    public static ForgeConfigSpec.BooleanValue ALLOY_CORROSION;
    public static ForgeConfigSpec.BooleanValue ALLOY_HEAT;
    public static ForgeConfigSpec.BooleanValue ALLOY_TOUGHNESS;
    public static ForgeConfigSpec.DoubleValue ALLOY_WEAR_MINING_AMT;
    public static ForgeConfigSpec.DoubleValue ALLOY_WEAR_DAMAGE_AMT;
    public static ForgeConfigSpec.BooleanValue AMALGAM_EXTRAS;

    public static ForgeConfigSpec.BooleanValue ENABLE_AMALGAM_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_CUPRONICKEL_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_STERLING_SILVER_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_BRASS_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_NICKEL_SILVER_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_CAST_IRON_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_DURALUMIN_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_MAGNESIUM_ALLOY_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_ROSE_METAL_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_GALINSTAN_TOOLS;
    public static ForgeConfigSpec.BooleanValue ENABLE_ALNICO_TOOLS;

    public static ForgeConfigSpec.BooleanValue TOTAL_CONVERSION;
    public static ForgeConfigSpec.DoubleValue T1_BEEHIVE_OVEN_CHANCE;
    public static ForgeConfigSpec.DoubleValue T2_BEEHIVE_OVEN_CHANCE;
    public static ForgeConfigSpec.DoubleValue T3_BEEHIVE_OVEN_CHANCE;

    public static ForgeConfigSpec.BooleanValue FLINT_DROP;
    public static ForgeConfigSpec.DoubleValue FLINT_DROP_CHANCE;
    public static ForgeConfigSpec.BooleanValue FORAGING;
    public static ForgeConfigSpec.DoubleValue FORAGING_CHANCE;
    public static ForgeConfigSpec.BooleanValue MANDATORY_AXE;
    public static ForgeConfigSpec.BooleanValue STARTING_BOOK;
    public static ForgeConfigSpec.BooleanValue VILLAGER_TRADES;
    public static ForgeConfigSpec.BooleanValue WANDERING_TRADE_SPECIAL;
    public static ForgeConfigSpec.BooleanValue IGNEOUS_COBBLE_GEN;
    public static ForgeConfigSpec.IntValue OPAL_ORE_HL;
    public static ForgeConfigSpec.IntValue INTERSPINIFEX_ORE_HL;
    public static ForgeConfigSpec.IntValue DIAMOND_ORE_HL;
    public static ForgeConfigSpec.DoubleValue DIAMON_CHANCE;
    public static ForgeConfigSpec.DoubleValue ILMENITE_CHANCE;
    public static ForgeConfigSpec.DoubleValue INTERSPINIFEX_CHANCE;
    public static ForgeConfigSpec.DoubleValue GLOBAL_BREAK_EXHAUSTION;
    public static ForgeConfigSpec.BooleanValue FLAT_BEDROCK;
    public static ForgeConfigSpec.IntValue BEDROCK_LAYERS;
    public static ForgeConfigSpec.IntValue NOISE_SCALE;
    public static ForgeConfigSpec.IntValue NOISE_OFFSET;
    public static ForgeConfigSpec.IntValue METEOR_CHANCE;
    public static ForgeConfigSpec.IntValue EVAPORATION_TOWER_SPEED;
    public static ForgeConfigSpec.BooleanValue RANKINE_FAUNA;
    public static ForgeConfigSpec.DoubleValue NUGGET_CHANCE;
    public static ForgeConfigSpec.IntValue NUGGET_DISTANCE;
    public static ForgeConfigSpec.DoubleValue GRAVEL_CONCRETE_SPEED;
    public static ForgeConfigSpec.DoubleValue ROMAN_CONCRETE_SPEED;
    public static ForgeConfigSpec.IntValue ORE_DETECTOR_RANGE;
    public static ForgeConfigSpec.BooleanValue ORE_DETECTOR_MSG;

    public static ForgeConfigSpec.IntValue LASER_QUARRY_RANGE;
    public static ForgeConfigSpec.IntValue LASER_QUARRY_SPEED;


    public static ForgeConfigSpec.BooleanValue SPEED_PENDANT_RECIPE;
    public static ForgeConfigSpec.BooleanValue HASTE_PENDANT_RECIPE;
    public static ForgeConfigSpec.BooleanValue HEALTH_PENDANT_RECIPE;
    public static ForgeConfigSpec.BooleanValue LEVITATION_PENDANT_RECIPE;
    public static ForgeConfigSpec.BooleanValue REPULSION_PENDANT_RECIPE;
    public static ForgeConfigSpec.BooleanValue LUCK_PENDANT_RECIPE;


    //OVERWORLD ORES
    public static ForgeConfigSpec.BooleanValue NATIVE_COPPER_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_COPPER_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_COPPER_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_COPPER_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_COPPER_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_COPPER_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_TIN_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_TIN_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_TIN_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_TIN_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_TIN_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_TIN_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_LEAD_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_LEAD_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_LEAD_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_LEAD_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_LEAD_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_LEAD_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_SILVER_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_SILVER_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_SILVER_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_SILVER_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_SILVER_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_SILVER_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_ALUMINUM_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_ALUMINUM_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_ALUMINUM_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_ALUMINUM_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_ALUMINUM_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_ALUMINUM_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_GOLD_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_GOLD_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_GOLD_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_GOLD_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_GOLD_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_GOLD_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_BISMUTH_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_BISMUTH_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_BISMUTH_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_BISMUTH_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_BISMUTH_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_BISMUTH_ORE_HL;

    public static ForgeConfigSpec.BooleanValue STIBNITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue STIBNITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue STIBNITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue STIBNITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue STIBNITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue STIBNITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue HALITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue HALITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue HALITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue HALITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue HALITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue HALITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue PINK_HALITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue PINK_HALITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue PINK_HALITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue PINK_HALITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue PINK_HALITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue PINK_HALITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue MALACHITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue MALACHITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue MALACHITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue MALACHITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue MALACHITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue MALACHITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue CASSITERITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue CASSITERITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue CASSITERITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue CASSITERITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue CASSITERITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue CASSITERITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue BAUXITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue BAUXITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue BAUXITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue BAUXITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue BAUXITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue BAUXITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue SPHALERITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue SPHALERITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue SPHALERITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue SPHALERITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue SPHALERITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue SPHALERITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue LIGNITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue LIGNITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue LIGNITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue LIGNITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue LIGNITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue LIGNITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue SUBBITUMINOUS_COAL_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue SUBBITUMINOUS_COAL_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue SUBBITUMINOUS_COAL_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue SUBBITUMINOUS_COAL_ORE_SIZE;
    public static ForgeConfigSpec.IntValue SUBBITUMINOUS_COAL_ORE_COUNT;
    public static ForgeConfigSpec.IntValue SUBBITUMINOUS_COAL_ORE_HL;

    public static ForgeConfigSpec.BooleanValue BITUMINOUS_COAL_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue BITUMINOUS_COAL_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue BITUMINOUS_COAL_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue BITUMINOUS_COAL_ORE_SIZE;
    public static ForgeConfigSpec.IntValue BITUMINOUS_COAL_ORE_COUNT;
    public static ForgeConfigSpec.IntValue BITUMINOUS_COAL_ORE_HL;

    public static ForgeConfigSpec.BooleanValue MAGNETITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue MAGNETITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue MAGNETITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue MAGNETITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue MAGNETITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue MAGNETITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue MAGNESITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue MAGNESITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue MAGNESITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue MAGNESITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue MAGNESITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue MAGNESITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue PENTLANDITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue PENTLANDITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue PENTLANDITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue PENTLANDITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue PENTLANDITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue PENTLANDITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue GALENA_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue GALENA_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue GALENA_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue GALENA_ORE_SIZE;
    public static ForgeConfigSpec.IntValue GALENA_ORE_COUNT;
    public static ForgeConfigSpec.IntValue GALENA_ORE_HL;

    public static ForgeConfigSpec.BooleanValue ACANTHITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue ACANTHITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue ACANTHITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue ACANTHITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue ACANTHITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue ACANTHITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue PYROLUSITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue PYROLUSITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue PYROLUSITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue PYROLUSITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue PYROLUSITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue PYROLUSITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue PETALITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue PETALITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue PETALITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue PETALITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue PETALITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue PETALITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue CINNABAR_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue CINNABAR_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue CINNABAR_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue CINNABAR_ORE_SIZE;
    public static ForgeConfigSpec.IntValue CINNABAR_ORE_COUNT;
    public static ForgeConfigSpec.IntValue CINNABAR_ORE_HL;

    public static ForgeConfigSpec.BooleanValue CHROMITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue CHROMITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue CHROMITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue CHROMITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue CHROMITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue CHROMITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue CELESTINE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue CELESTINE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue VANADINITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue VANADINITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue VANADINITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue VANADINITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue VANADINITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue VANADINITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue LAZURITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue LAZURITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue LAZURITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue LAZURITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue LAZURITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue LAZURITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue EMERALD_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue EMERALD_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue EMERALD_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue EMERALD_ORE_SIZE;
    public static ForgeConfigSpec.IntValue EMERALD_ORE_COUNT;
    public static ForgeConfigSpec.IntValue EMERALD_ORE_HL;

    public static ForgeConfigSpec.BooleanValue AQUAMARINE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue AQUAMARINE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue AQUAMARINE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue AQUAMARINE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue AQUAMARINE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue AQUAMARINE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue MAJORITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue MAJORITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue MAJORITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue MAJORITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue MAJORITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue MAJORITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue PLUMBAGO_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue PLUMBAGO_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue PLUMBAGO_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue PLUMBAGO_ORE_SIZE;
    public static ForgeConfigSpec.IntValue PLUMBAGO_ORE_COUNT;
    public static ForgeConfigSpec.IntValue PLUMBAGO_ORE_HL;


    //NETHER ORES
    public static ForgeConfigSpec.BooleanValue NATIVE_ARSENIC_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_ARSENIC_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_ARSENIC_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_ARSENIC_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_ARSENIC_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_ARSENIC_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_SULFUR_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_SULFUR_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_SULFUR_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_SULFUR_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_SULFUR_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_SULFUR_ORE_HL;

    public static ForgeConfigSpec.BooleanValue ANTHRACITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue ANTHRACITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue ANTHRACITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue ANTHRACITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue ANTHRACITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue ANTHRACITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue COBALTITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue COBALTITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue COBALTITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue COBALTITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue COBALTITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue COBALTITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue MOLYBDENITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue MOLYBDENITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue MOLYBDENITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue MOLYBDENITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue MOLYBDENITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue MOLYBDENITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue BISMUTHINITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue BISMUTHINITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue BISMUTHINITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue BISMUTHINITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue BISMUTHINITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue BISMUTHINITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue ILMENITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue ILMENITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue ILMENITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue ILMENITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue ILMENITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue ILMENITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue WOLFRAMITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue WOLFRAMITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue WOLFRAMITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue WOLFRAMITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue WOLFRAMITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue WOLFRAMITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue SPERRYLITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue SPERRYLITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue SPERRYLITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue SPERRYLITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue SPERRYLITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue SPERRYLITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue MOISSANITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue MOISSANITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue MOISSANITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue MOISSANITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue MOISSANITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue MOISSANITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue GREENOCKITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue GREENOCKITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue GREENOCKITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue GREENOCKITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue GREENOCKITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue GREENOCKITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue COLUMBITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue COLUMBITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue COLUMBITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue COLUMBITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue COLUMBITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue COLUMBITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue TANTALITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue TANTALITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue TANTALITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue TANTALITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue TANTALITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue TANTALITE_ORE_HL;

    //END ORES
    public static ForgeConfigSpec.BooleanValue NATIVE_GALLIUM_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_GALLIUM_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_GALLIUM_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_GALLIUM_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_GALLIUM_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_GALLIUM_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_INDIUM_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_INDIUM_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_INDIUM_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_INDIUM_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_INDIUM_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_INDIUM_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_SELENIUM_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_SELENIUM_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_SELENIUM_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_SELENIUM_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_SELENIUM_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_SELENIUM_ORE_HL;

    public static ForgeConfigSpec.BooleanValue NATIVE_TELLURIUM_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue NATIVE_TELLURIUM_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_TELLURIUM_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue NATIVE_TELLURIUM_ORE_SIZE;
    public static ForgeConfigSpec.IntValue NATIVE_TELLURIUM_ORE_COUNT;
    public static ForgeConfigSpec.IntValue NATIVE_TELLURIUM_ORE_HL;

    public static ForgeConfigSpec.BooleanValue URANINITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue URANINITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue URANINITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue URANINITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue URANINITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue URANINITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue FLUORITE_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue FLUORITE_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue FLUORITE_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue FLUORITE_ORE_SIZE;
    public static ForgeConfigSpec.IntValue FLUORITE_ORE_COUNT;
    public static ForgeConfigSpec.IntValue FLUORITE_ORE_HL;

    public static ForgeConfigSpec.BooleanValue XENOTIME_ORE_ENABLED;
    public static ForgeConfigSpec.IntValue XENOTIME_ORE_MIN_HEIGHT;
    public static ForgeConfigSpec.IntValue XENOTIME_ORE_MAX_HEIGHT;
    public static ForgeConfigSpec.IntValue XENOTIME_ORE_SIZE;
    public static ForgeConfigSpec.IntValue XENOTIME_ORE_COUNT;
    public static ForgeConfigSpec.IntValue XENOTIME_ORE_HL;

    public static ForgeConfigSpec.IntValue RED_GRANITE_HL;
    public static ForgeConfigSpec.IntValue GRANODIORITE_HL;
    public static ForgeConfigSpec.IntValue HORNBLENDE_ANDESITE_HL;
    public static ForgeConfigSpec.IntValue THOLEIITIC_BASALT_HL;
    public static ForgeConfigSpec.IntValue GABBRO_HL;
    public static ForgeConfigSpec.IntValue ANORTHOSITE_HL;
    public static ForgeConfigSpec.IntValue RHYOLITE_HL;
    public static ForgeConfigSpec.IntValue LIMESTONE_HL;
    public static ForgeConfigSpec.IntValue MARBLE_HL;
    public static ForgeConfigSpec.IntValue GNEISS_HL;
    public static ForgeConfigSpec.IntValue SCHIST_HL;
    public static ForgeConfigSpec.IntValue SLATE_HL;
    public static ForgeConfigSpec.IntValue SHALE_HL;
    public static ForgeConfigSpec.IntValue BRECCIA_HL;
    public static ForgeConfigSpec.IntValue IRONSTONE_HL;
    public static ForgeConfigSpec.IntValue PUMICE_HL;
    public static ForgeConfigSpec.IntValue SCORIA_HL;
    public static ForgeConfigSpec.IntValue PERIDOTITE_HL;
    public static ForgeConfigSpec.IntValue KIMBERLITE_HL;
    public static ForgeConfigSpec.IntValue KOMATIITE_HL;
    public static ForgeConfigSpec.IntValue WADSLEYITE_HL;
    public static ForgeConfigSpec.IntValue RINGWOODITE_HL;
    public static ForgeConfigSpec.IntValue BRIDGMANITE_HL;
    public static ForgeConfigSpec.IntValue FERROPERICLASE_HL;
    public static ForgeConfigSpec.IntValue PEROVSKITE_HL;






    static {
        COMMON_BUILDER.comment("General Settings").push(CATEGORY_GENERAL);
        setupFirstBlockConfig();
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Alloy Settings").push(CATEGORY_ALLOYS);
        setupSecondBlockConfig();
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Worldgen Settings").push(CATEGORY_WORLDGEN);
        setupThirdBlockConfig();
        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    private static void setupFirstBlockConfig() {
        COMMON_BUILDER.comment("General Mod Settings").push(SUBCATEGORY_EVENTS);

            STARTING_BOOK = COMMON_BUILDER.comment("Enables the Rankine Journal (a guide to the mod)")
                    .define("startingBook",true);
            MANDATORY_AXE = COMMON_BUILDER.comment("An axe is required to harvest logs")
                    .define("axesOnly",false);
            FLINT_DROP = COMMON_BUILDER.comment("Enables an extra chance for stones to drop flint when mining with a flint / bronze / pewter / colored golds pickaxes.")
                    .define("flintDrop",true);
            FLINT_DROP_CHANCE = COMMON_BUILDER.comment("Chance for a dirt block to drop a vegetable if foraging is enabled")
                    .defineInRange("flintDropChance", 0.15D, 0.00D, 1.00D);
            FORAGING = COMMON_BUILDER.comment("Is it possible to find vegetables when mining dirt?")
                    .define("foraging",true);
            FORAGING_CHANCE = COMMON_BUILDER.comment("Chance for a dirt block to drop a vegetable if foraging is enabled")
                    .defineInRange("foragingChance", 0.100D, 0.000D, 1.000D);
            IGNEOUS_COBBLE_GEN = COMMON_BUILDER.comment("Change the output of a cobblestone generator from cobblestone to random igneous rocks.")
                    .define("igneousGen",true);
            VILLAGER_TRADES = COMMON_BUILDER.comment("Adds trades for Project Rankine to Villagers and the Wandering Trader.")
                    .define("villageTrades",true);
            WANDERING_TRADE_SPECIAL = COMMON_BUILDER.comment("Adds a trade to the Wandering Trader for a random tool which is not restricted by alloy constraints. May be unbalanced due to complete randomness.")
                    .define("wanderingSpecial",false);
            GLOBAL_BREAK_EXHAUSTION = COMMON_BUILDER.comment("Amount of additional exhaustion when breaking a block")
                    .defineInRange("breakExhaustion", 0.00D, 0.00D, 1.00D);
            TOTAL_CONVERSION = COMMON_BUILDER.comment("Enable for the Beehive Oven to convert all the blocks at once rather than one by one.")
                    .define("beehiveOvenConversion",false);
            T1_BEEHIVE_OVEN_CHANCE = COMMON_BUILDER.comment("Chance on random tick for the beehive oven (T1) to cook a block")
                    .defineInRange("t1BeehiveOvenTime", 0.40D, 0.00D, 1.00D);
            T2_BEEHIVE_OVEN_CHANCE = COMMON_BUILDER.comment("Chance on random tick for the magnesium beehive oven (T2) to cook a block")
                    .defineInRange("t2BeehiveOvenTime", 0.7D, 0.00D, 1.00D);
            T3_BEEHIVE_OVEN_CHANCE = COMMON_BUILDER.comment("Chance on random tick for the zircon beehive oven (T3) to cook a block")
                    .defineInRange("t3BeehiveOvenTime", 1.0D, 0.00D, 1.00D);
            EVAPORATION_TOWER_SPEED = COMMON_BUILDER.comment("Speed (in ticks) at which the evaporation tower generates resources.")
                    .defineInRange("evaporationTowerSpeed", 800, 20, 12000);
            GRAVEL_CONCRETE_SPEED = COMMON_BUILDER.comment("Movement speed multiplier for walking on gravel concrete")
                    .defineInRange("gravelConcreteSpeed", 1.20D, 0.00D, 3.00D);
            ROMAN_CONCRETE_SPEED = COMMON_BUILDER.comment("Movement speed multiplier for walking on roman concrete")
                    .defineInRange("romanConcreteSpeed", 1.40D, 0.00D, 5.00D);
            ORE_DETECTOR_RANGE = COMMON_BUILDER.comment("Number of blocks away that the metal detector can detect ore.")
                    .defineInRange("metalDetectorRange", 20, 0, 64);
            ORE_DETECTOR_MSG = COMMON_BUILDER.comment("Set to false to disable the ore detector from outputting the block found.")
                    .define("oreDetectorMessage",true);
            LASER_QUARRY_RANGE = COMMON_BUILDER.comment("Max range of the laser quarry.")
                    .defineInRange("laserQuarryRange", 5, 0, 11);
            LASER_QUARRY_SPEED = COMMON_BUILDER.comment("Max speed of the laser quarry in ticks.")
                    .defineInRange("laserQuarrySpeed", 10, 10, 300);


            COMMON_BUILDER.comment("Vanilla Tools").push("vanillaTools");
                COMMON_BUILDER.comment("Wooden Tools").push("woodenTools");
                    DISABLE_WOODEN_SWORD = COMMON_BUILDER.comment("Disable the use of the wooden sword (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableWoodenSword",true);
                    DISABLE_WOODEN_AXE = COMMON_BUILDER.comment("Disable the use of the wooden axe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableWoodenAxe",true);
                    DISABLE_WOODEN_SHOVEL = COMMON_BUILDER.comment("Disable the use of the wooden shovel (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableWoodenShovel",true);
                    DISABLE_WOODEN_PICKAXE = COMMON_BUILDER.comment("Disable the use of the wooden pickaxe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableWoodenPickaxe",true);
                    DISABLE_WOODEN_HOE = COMMON_BUILDER.comment("Disable the use of the wooden hoe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableWoodenHoe",true);
                COMMON_BUILDER.pop();
                
                COMMON_BUILDER.comment("Stone Tools").push("stoneTools");
                    DISABLE_STONE_SWORD = COMMON_BUILDER.comment("Disable the use of the stone sword (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableStoneSword",true);
                    DISABLE_STONE_AXE = COMMON_BUILDER.comment("Disable the use of the stone axe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableStoneAxe",true);
                    DISABLE_STONE_SHOVEL = COMMON_BUILDER.comment("Disable the use of the stone shovel (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableStoneShovel",true);
                    DISABLE_STONE_PICKAXE = COMMON_BUILDER.comment("Disable the use of the stone pickaxe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableStonePickaxe",true);
                    DISABLE_STONE_HOE = COMMON_BUILDER.comment("Disable the use of the stone hoe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableStoneHoe",true);
                COMMON_BUILDER.pop();

                COMMON_BUILDER.comment("Iron Tools").push("ironTools");
                    DISABLE_IRON_SWORD = COMMON_BUILDER.comment("Disable the use of the iron sword (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableIronSword",true);
                    DISABLE_IRON_AXE = COMMON_BUILDER.comment("Disable the use of the iron axe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableIronAxe",true);
                    DISABLE_IRON_SHOVEL = COMMON_BUILDER.comment("Disable the use of the iron shovel (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableIronShovel",true);
                    DISABLE_IRON_PICKAXE = COMMON_BUILDER.comment("Disable the use of the iron pickaxe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableIronPickaxe",true);
                    DISABLE_IRON_HOE = COMMON_BUILDER.comment("Disable the use of the iron hoe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableIronHoe",true);
                COMMON_BUILDER.pop();
        
                COMMON_BUILDER.comment("Gold Tools").push("goldTools");
                    DISABLE_GOLDEN_SWORD = COMMON_BUILDER.comment("Disable the use of the gold sword (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableGoldSword",true);
                    DISABLE_GOLDEN_AXE = COMMON_BUILDER.comment("Disable the use of the gold axe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableGoldAxe",true);
                    DISABLE_GOLDEN_SHOVEL = COMMON_BUILDER.comment("Disable the use of the gold shovel (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableGoldShovel",true);
                    DISABLE_GOLDEN_PICKAXE = COMMON_BUILDER.comment("Disable the use of the gold pickaxe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableGoldPickaxe",true);
                    DISABLE_GOLDEN_HOE = COMMON_BUILDER.comment("Disable the use of the gold hoe (still allows crafting for other recipes). This is enabled by default for progression.")
                            .define("disableGoldHoe",true);
                COMMON_BUILDER.pop();

                COMMON_BUILDER.comment("Diamond Tools").push("diamondTools");
                    DISABLE_DIAMOND_SWORD = COMMON_BUILDER.comment("Disable the use of the diamond sword (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableDiamondSword",true);
                    DISABLE_DIAMOND_AXE = COMMON_BUILDER.comment("Disable the use of the diamond axe (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableDiamondAxe",true);
                    DISABLE_DIAMOND_SHOVEL = COMMON_BUILDER.comment("Disable the use of the diamond shovel (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableDiamondShovel",true);
                    DISABLE_DIAMOND_PICKAXE = COMMON_BUILDER.comment("Disable the use of the diamond pickaxe (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableDiamondPickaxe",true);
                    DISABLE_DIAMOND_HOE = COMMON_BUILDER.comment("Disable the use of the diamond hoe (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableDiamondHoe",true);
                COMMON_BUILDER.pop();

                COMMON_BUILDER.comment("Netherite Tools").push("netheriteTools");
                    DISABLE_NETHERITE_SWORD = COMMON_BUILDER.comment("Disable the use of the netherite sword (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableNetheriteSword",true);
                    DISABLE_NETHERITE_AXE = COMMON_BUILDER.comment("Disable the use of the netherite axe (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableNetheriteAxe",true);
                    DISABLE_NETHERITE_SHOVEL = COMMON_BUILDER.comment("Disable the use of the netherite shovel (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableNetheriteShovel",true);
                    DISABLE_NETHERITE_PICKAXE = COMMON_BUILDER.comment("Disable the use of the netherite pickaxe (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableNetheritePickaxe",true);
                    DISABLE_NETHERITE_HOE = COMMON_BUILDER.comment("Disable the use of the netherite hoe (still allows crafting for other recipes). This is disabled by default for progression.")
                            .define("disableNetheriteHoe",true);
                COMMON_BUILDER.pop();
            COMMON_BUILDER.pop();
        

            COMMON_BUILDER.comment("Pendant Recipes").push("pendantRecipes");
                SPEED_PENDANT_RECIPE = COMMON_BUILDER.comment("Enable the recipe for speed pendant.")
                        .define("speedPendantRecipe",true);
                HASTE_PENDANT_RECIPE = COMMON_BUILDER.comment("Enable the recipe for haste pendant.")
                        .define("hastePendantRecipe",true);
                HEALTH_PENDANT_RECIPE = COMMON_BUILDER.comment("Enable the recipe for health pendant.")
                        .define("healthPendantRecipe",true);
                LEVITATION_PENDANT_RECIPE = COMMON_BUILDER.comment("Enable the recipe for levitation pendant.")
                        .define("levitationPendantRecipe",true);
                REPULSION_PENDANT_RECIPE = COMMON_BUILDER.comment("Enable the recipe for repulsion pendant.")
                        .define("repulsionPendantRecipe",true);
                LUCK_PENDANT_RECIPE = COMMON_BUILDER.comment("Enable the recipe for luck pendant.")
                        .define("luckPendantRecipe",true);
            COMMON_BUILDER.pop();

        COMMON_BUILDER.pop();
    }

    private static void setupSecondBlockConfig() {
        COMMON_BUILDER.comment("Alloy Settings").push(SUBCATEGORY_ALLOYS);

            ALLOY_CORROSION = COMMON_BUILDER.comment("Enables the corrosion negative modifier for alloy tools (chance to consume extra points of durability in water and rain)")
                    .define("alloyCorrosion",true);
            ALLOY_HEAT = COMMON_BUILDER.comment("Enables the heat negative modifier for alloy tools (chance to consume extra points of durability in hot environments and lava)")
                    .define("alloyHeat",true);
            ALLOY_TOUGHNESS = COMMON_BUILDER.comment("Enables the toughness negative modifier for alloy tools (chance to consume/resist loss of an extra point of durability)")
                    .define("alloyToughness",true);
            ALLOY_WEAR_MINING_AMT = COMMON_BUILDER.comment("Modifies the severity of the wear effect on mining speed (ex. 0.25 means mining speed will be reduced to 75% of the original value as durability is lost)")
                    .defineInRange("alloyWearMiningAmount", 0.25D, 0.00D, 0.99D);
            ALLOY_WEAR_DAMAGE_AMT = COMMON_BUILDER.comment("Modifies the severity of the wear effect on damage (ex. 0.25 means damage will be reduced to 75% of the original value as durability is lost)")
                    .defineInRange("alloyWearDamageAmount", 0.25D, 0.00D, 0.99D);
            AMALGAM_EXTRAS = COMMON_BUILDER.comment("Enables the disabled metals for amalgam alloy (Fe, Pt, W, Ta)")
                    .define("amalgamExtras",false);
            ENABLE_AMALGAM_TOOLS = COMMON_BUILDER.comment("Enables the construction of Amalgam Tools in the Coal Forge.")
                    .define("amalgamToolsEnabled",true);

            COMMON_BUILDER.comment("Experimental Alloy Tools").push("experimental");
                ENABLE_CUPRONICKEL_TOOLS = COMMON_BUILDER.comment("Enables the construction of Cupronickel Tools in the Coal Forge.")
                        .define("cupronickelToolsEnabled",true);
                ENABLE_STERLING_SILVER_TOOLS = COMMON_BUILDER.comment("Enables the construction of Sterling Silver Tools in the Coal Forge.")
                    .define("sterlingSilverToolsEnabled",true);
                ENABLE_BRASS_TOOLS = COMMON_BUILDER.comment("Enables the construction of Brass Tools in the Coal Forge.")
                        .define("brassToolsEnabled",true);
                ENABLE_NICKEL_SILVER_TOOLS = COMMON_BUILDER.comment("Enables the construction of Nickel-silver Tools in the Coal Forge.")
                        .define("nickelSilverToolsEnabled",true);
                ENABLE_CAST_IRON_TOOLS = COMMON_BUILDER.comment("Enables the construction of Cast Iron Tools in the Coal Forge.")
                        .define("castIronToolsEnabled",true);
                ENABLE_DURALUMIN_TOOLS = COMMON_BUILDER.comment("Enables the construction of Duralumin Tools in the Coal Forge.")
                        .define("duraluminToolsEnabled",true);
                ENABLE_MAGNESIUM_ALLOY_TOOLS = COMMON_BUILDER.comment("Enables the construction of Magnesium Alloy Tools in the Coal Forge.")
                    .define("magnesiumAlloyToolsEnabled",true);
                ENABLE_ROSE_METAL_TOOLS = COMMON_BUILDER.comment("Enables the construction of Rose's Metal Tools in the Coal Forge.")
                        .define("roseMetalToolsEnabled",true);
                ENABLE_GALINSTAN_TOOLS = COMMON_BUILDER.comment("Enables the construction of Galinstan Tools in the Coal Forge.")
                        .define("galinstanToolsEnabled",true);
                ENABLE_ALNICO_TOOLS = COMMON_BUILDER.comment("Enables the construction of Alnico Tools in the Coal Forge.")
                        .define("alnicoToolsEnabled",true);
            COMMON_BUILDER.pop();


        COMMON_BUILDER.pop();
    }

    private static void setupThirdBlockConfig() {
        COMMON_BUILDER.comment("Bedrock Generation").push("bedrock");
        FLAT_BEDROCK = COMMON_BUILDER.comment("Generates with a flat bedrock layer (includes the Nether)")
                .define("flatBedrock",false);
        BEDROCK_LAYERS = COMMON_BUILDER.comment("Layers of bedrock to generate if flatBedrock is true")
                .defineInRange("bedrockLayers", 1, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Stone Layer Generation").push("layeringNoise");
        NOISE_SCALE = COMMON_BUILDER.comment("This determines how smooth stone layers generate. Larger values means smoother. Default value is 125.")
                .defineInRange("noiseScale", 125, 1, 1000);
        NOISE_OFFSET = COMMON_BUILDER.comment("This determines how close the overlap of noise layers is. A value of 0 means all layers are shaped identically. Default value is 256")
                .defineInRange("noiseOffset", 256, 0, 16*64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Meteorite Generation").push("meteorite");
        METEOR_CHANCE = COMMON_BUILDER.comment("The 1 in X chunks a meteroite will spawn. Set to 0 to disable")
                .defineInRange("meteorChance", 85, 0, 1000);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Intrusion Ore Settings").push("intrusionOres");
        DIAMON_CHANCE = COMMON_BUILDER.comment("Chance for an kimberlite intrusion block to be replaced by a diamond ore")
                .defineInRange("diamondOreChance", 0.035D, 0.00D, 1.00D);
        ILMENITE_CHANCE = COMMON_BUILDER.comment("Chance for an kimberlite intrusion block to be replaced by an ilmenite ore")
                .defineInRange("ilmeniteOreChance", 0.005D, 0.00D, 1.00D);
        INTERSPINIFEX_CHANCE = COMMON_BUILDER.comment("Chance for an komatiite intrusion block to be replaced by an interspinifex ore")
                .defineInRange("interspinifexOreChance", 0.07D, 0.00D, 1.00D);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Rankine Tree Generation").push("rankineTrees");
        RANKINE_FAUNA = COMMON_BUILDER.comment("Enable/Disable Project Rankine trees and berry bushes in world.")
                .define("generateTrees",true);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Nuggets Around Ores").push("oreNuggets");
        NUGGET_CHANCE = COMMON_BUILDER.comment("Chance for a rankine stone block to drop a nugget of a nearby ore.")
                .defineInRange("nuggetChance", 0.15D, 0.00D, 1.00D);
        NUGGET_DISTANCE = COMMON_BUILDER.comment("")
                .defineInRange("nuggetRange", 5, 1, 64);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Miscellaneous Block Harvest Levels").push("harvestLevels");
        DIAMOND_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Diamond Ore")
                .defineInRange("diamondOreHL", 3, 0, 5);
        INTERSPINIFEX_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Interspinifex Ore")
                .defineInRange("interspinifexOreHL", 3, 0, 5);
        OPAL_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Opal Ore")
                .defineInRange("opalOreHL", 2, 0, 5);
        RED_GRANITE_HL = COMMON_BUILDER.comment("Harvest Level of Red Granite")
                .defineInRange("redGraniteHL", 0, 0, 5);
        GRANODIORITE_HL = COMMON_BUILDER.comment("Harvest Level of Granodiorite")
                .defineInRange("granodioriteHL", 0, 0, 5);
        HORNBLENDE_ANDESITE_HL = COMMON_BUILDER.comment("Harvest Level of Hornblende Andesite")
                .defineInRange("hornblendeAndesiteHL", 0, 0, 5);
        THOLEIITIC_BASALT_HL = COMMON_BUILDER.comment("Harvest Level of Tholeiitic Basalt")
                .defineInRange("basaltHL", 0, 0, 5);
        GABBRO_HL = COMMON_BUILDER.comment("Harvest Level of Gabbro")
                .defineInRange("gabbroHL", 0, 0, 5);
        ANORTHOSITE_HL = COMMON_BUILDER.comment("Harvest Level of Anorthosite")
                .defineInRange("anorthositeHL", 0, 0, 5);
        RHYOLITE_HL = COMMON_BUILDER.comment("Harvest Level of Rhyp;ite")
                .defineInRange("rhyolitteHL", 0, 0, 5);
        LIMESTONE_HL = COMMON_BUILDER.comment("Harvest Level of Limestone")
                .defineInRange("limestoneHL", 0, 0, 5);
        MARBLE_HL = COMMON_BUILDER.comment("Harvest Level of Marble")
                .defineInRange("marbleHL", 0, 0, 5);
        GNEISS_HL = COMMON_BUILDER.comment("Harvest Level of Gneiss")
                .defineInRange("gneissHL", 0, 0, 5);
        SCHIST_HL = COMMON_BUILDER.comment("Harvest Level of Schist")
                .defineInRange("schistHL", 0, 0, 5);
        SLATE_HL = COMMON_BUILDER.comment("Harvest Level of Slate")
                .defineInRange("slateHL", 0, 0, 5);
        SHALE_HL = COMMON_BUILDER.comment("Harvest Level of Shale")
                .defineInRange("shaleHL", 0, 0, 5);
        BRECCIA_HL = COMMON_BUILDER.comment("Harvest Level of Breccia")
                .defineInRange("brecciaHL", 0, 0, 5);
        IRONSTONE_HL = COMMON_BUILDER.comment("Harvest Level of Ironstone")
                .defineInRange("ironstoneHL", 1, 0, 5);
        PUMICE_HL = COMMON_BUILDER.comment("Harvest Level of Pumice")
                .defineInRange("pumiveHL", 1, 0, 5);
        SCORIA_HL = COMMON_BUILDER.comment("Harvest Level of Scoria")
                .defineInRange("scoriaHL", 1, 0, 5);
        PERIDOTITE_HL = COMMON_BUILDER.comment("Harvest Level of Peridotite")
                .defineInRange("peridotiteHL", 2, 0, 5);
        KIMBERLITE_HL = COMMON_BUILDER.comment("Harvest Level of Kimberlite")
                .defineInRange("kimberliteHL", 2, 0, 5);
        KOMATIITE_HL = COMMON_BUILDER.comment("Harvest Level of Komatiite")
                .defineInRange("komatiiteHL", 2, 0, 5);
        WADSLEYITE_HL = COMMON_BUILDER.comment("Harvest Level of Wadsleyite")
                .defineInRange("wadsleyiteHL", 2, 0, 5);
        RINGWOODITE_HL = COMMON_BUILDER.comment("Harvest Level of Ringwoodite")
                .defineInRange("ringwooditeHL", 2, 0, 5);
        BRIDGMANITE_HL = COMMON_BUILDER.comment("Harvest Level of Bridgmanite")
                .defineInRange("bridgmaniteHL", 2, 0, 5);
        FERROPERICLASE_HL = COMMON_BUILDER.comment("Harvest Level of Ferropericlase")
                .defineInRange("ferropericlaseHL", 2, 0, 5);
        PEROVSKITE_HL = COMMON_BUILDER.comment("Harvest Level of Perovskite")
                .defineInRange("perovskiteHL", 2, 0, 5);
        COMMON_BUILDER.pop();



        //Oregen config
        COMMON_BUILDER.comment("Oregen Settings").push(SUBCATEGORY_OREGEN);
        COMMON_BUILDER.comment("Overworld Ore Settings").push(SUBCATEGORY_OVERWORLD);

        COMMON_BUILDER.comment("Native Copper Ore Settings").push("nativeCopperOre");
        NATIVE_COPPER_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Copper ore)")
                .define("nativeCopperOreEnabled",true);
        NATIVE_COPPER_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Copper ore at (make sure it is less than the maximum)")
                .defineInRange("nativeCopperOreMin", 55, 0, 256);
        NATIVE_COPPER_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Copper ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeCopperOreMax", 75, 0, 256);
        NATIVE_COPPER_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Copper ore vein")
                .defineInRange("nativeCopperOreSixe", 12, 0, 256);
        NATIVE_COPPER_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Copper ore veins to generate per chunk")
                .defineInRange("nativeCopperOreCount", 5, 0, 256);
        NATIVE_COPPER_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Copper Ore")
                .defineInRange("nativeCopperOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Tn Ore Settings").push("nativeTinOre");
        NATIVE_TIN_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Tin ore)")
                .define("nativeTinOreEnabled",true);
        NATIVE_TIN_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Tin ore at (make sure it is less than the maximum)")
                .defineInRange("nativeTinOreMin", 55, 0, 256);
        NATIVE_TIN_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Tin ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeTinOreMax", 75, 0, 256);
        NATIVE_TIN_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Tin ore vein")
                .defineInRange("nativeTinOreSize", 12, 0, 256);
        NATIVE_TIN_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Tin ore veins to generate per chunk")
                .defineInRange("nativeTinOreCount", 4, 0, 256);
        NATIVE_TIN_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Tin Ore")
                .defineInRange("nativeTinOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Lead Ore Settings").push("nativeLeadOre");
        NATIVE_LEAD_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Lead ore)")
                .define("nativeLeadOreEnabled",true);
        NATIVE_LEAD_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Lead ore at (make sure it is less than the maximum)")
                .defineInRange("nativeLeadOreMin", 55, 0, 256);
        NATIVE_LEAD_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Lead ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeLeadOreMax", 75, 0, 256);
        NATIVE_LEAD_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Lead ore vein")
                .defineInRange("nativeLeadOreSize", 12, 0, 256);
        NATIVE_LEAD_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Lead ore veins to generate per chunk")
                .defineInRange("nativeLeadOreCount", 2, 0, 256);
        NATIVE_LEAD_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Lead Ore")
                .defineInRange("nativeLeadOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Silver Ore Settings").push("nativeSilverOre");
        NATIVE_SILVER_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Silver ore)")
                .define("nativeSilverOreEnabled",true);
        NATIVE_SILVER_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Silver ore at (make sure it is less than the maximum)")
                .defineInRange("nativeSilverOreMin", 55, 0, 256);
        NATIVE_SILVER_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Silver ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeSilverOreMax", 75, 0, 256);
        NATIVE_SILVER_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Silver ore vein")
                .defineInRange("nativeSilverOreSize", 12, 0, 256);
        NATIVE_SILVER_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Silver ore veins to generate per chunk")
                .defineInRange("nativeSilverOreCount", 2, 0, 256);
        NATIVE_SILVER_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Silver Ore")
                .defineInRange("nativeSilverOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Aluminum Ore Settings").push("nativeAluminumOre");
        NATIVE_ALUMINUM_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Aluminum ore)")
                .define("nativeAluminumOreEnabled",true);
        NATIVE_ALUMINUM_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Aluminum ore at (make sure it is less than the maximum)")
                .defineInRange("nativeAluminumOreMin", 55, 0, 256);
        NATIVE_ALUMINUM_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Aluminum ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeAluminumOreMax", 75, 0, 256);
        NATIVE_ALUMINUM_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Aluminum ore vein")
                .defineInRange("nativeAluminumOreSize", 12, 0, 256);
        NATIVE_ALUMINUM_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Aluminum ore veins to generate per chunk")
                .defineInRange("nativeAluminumOreCount", 3, 0, 256);
        NATIVE_ALUMINUM_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Aluminum Ore")
                .defineInRange("nativeAluminumOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Gold Ore Settings").push("nativeGoldOre");
        NATIVE_GOLD_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Gold ore)")
                .define("nativeGoldOreEnabled",true);
        NATIVE_GOLD_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Gold ore at (make sure it is less than the maximum)")
                .defineInRange("nativeGoldOreMin", 10, 0, 256);
        NATIVE_GOLD_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Gold ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeGoldOreMax", 75, 0, 256);
        NATIVE_GOLD_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Gold ore vein")
                .defineInRange("nativeGoldOreSize", 12, 0, 256);
        NATIVE_GOLD_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Gold ore veins to generate per chunk")
                .defineInRange("nativeGoldOreCount", 4, 0, 256);
        NATIVE_GOLD_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Gold Ore")
                .defineInRange("nativeGoldOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Bismuth Ore Settings").push("nativeBismuthOre");
        NATIVE_BISMUTH_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Bismuth ore)")
                .define("nativeBismuthOreEnabled",true);
        NATIVE_BISMUTH_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Bismuth ore at (make sure it is less than the maximum)")
                .defineInRange("nativeBismuthOreMin", 50, 0, 256);
        NATIVE_BISMUTH_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Bismuth ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeBismuthOreMax", 75, 0, 256);
        NATIVE_BISMUTH_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Bismuth ore vein")
                .defineInRange("nativeBismuthOreSize", 5, 0, 256);
        NATIVE_BISMUTH_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Bismuth ore veins to generate per chunk")
                .defineInRange("nativeBismuthOreCount", 1, 0, 256);
        NATIVE_BISMUTH_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Bismuth Ore")
                .defineInRange("nativeBismuthOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Stibnite Ore Settings").push("stibniteOre");
        STIBNITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Stibnite ore)")
                .define("stibniteOreEnabled",true);
        STIBNITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Stibnite ore at (make sure it is less than the maximum)")
                .defineInRange("stibniteOreMin", 55, 0, 256);
        STIBNITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Stibnite ore at (make sure it is greater than the minimum)")
                .defineInRange("stibniteOreMax", 75, 0, 256);
        STIBNITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Stibnite ore vein")
                .defineInRange("stibniteOreSize", 7, 0, 256);
        STIBNITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Stibnite ore veins to generate per chunk")
                .defineInRange("stibniteOreCount", 3, 0, 256);
        STIBNITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Stibnite Ore")
                .defineInRange("stibniteOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Halite Ore Settings").push("haliteOre");
        HALITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Halite ore)")
                .define("haliteOreEnabled",true);
        HALITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Halite ore at (make sure it is less than the maximum)")
                .defineInRange("haliteOreMin", 50, 0, 256);
        HALITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Halite ore at (make sure it is greater than the minimum)")
                .defineInRange("haliteOreMax", 70, 0, 256);
        HALITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Halite ore vein")
                .defineInRange("haliteOreSize", 20, 0, 256);
        HALITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Halite ore veins to generate per chunk")
                .defineInRange("haliteOreCount", 1, 0, 256);
        HALITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Halite Ore")
                .defineInRange("haliteOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Pink Halite Ore Settings").push("pinkHaliteOre");
        PINK_HALITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Pink Halite ore)")
                .define("pinkHaliteOreEnabled",true);
        PINK_HALITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Pink Halite ore at (make sure it is less than the maximum)")
                .defineInRange("pinkHaliteOreMin", 70, 0, 256);
        PINK_HALITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Pink Halite ore at (make sure it is greater than the minimum)")
                .defineInRange("pinkHaliteOreMax", 128, 0, 256);
        PINK_HALITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Pink Halite ore vein")
                .defineInRange("pinkHaliteOreSize", 20, 0, 256);
        PINK_HALITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Pink Halite ore veins to generate per chunk")
                .defineInRange("pinkHaliteOreCount", 2, 0, 256);
        PINK_HALITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Pink Halite Ore")
                .defineInRange("pinkHaliteOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Malachite Ore Settings").push("malachiteOre");
        MALACHITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Malachite ore)")
                .define("malachiteOreEnabled",true);
        MALACHITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Malachite ore at (make sure it is less than the maximum)")
                .defineInRange("malachiteOreMin", 35, 0, 256);
        MALACHITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Malachite ore at (make sure it is greater than the minimum)")
                .defineInRange("malachiteOreMax", 60, 0, 256);
        MALACHITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Malachite ore vein")
                .defineInRange("malachiteOreSize", 16, 0, 256);
        MALACHITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Malachite ore veins to generate per chunk")
                .defineInRange("malachiteOreCount", 2, 0, 256);
        MALACHITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Malachite Ore")
                .defineInRange("malachiteOreHL", 1, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Cassiterite Ore Settings").push("cassiteriteOre");
        CASSITERITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Cassiterite ore)")
                .define("cassiteriteOreEnabled",true);
        CASSITERITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Cassiterite ore at (make sure it is less than the maximum)")
                .defineInRange("cassiteriteOreMin", 35, 0, 256);
        CASSITERITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Cassiterite ore at (make sure it is greater than the minimum)")
                .defineInRange("cassiteriteOreMax", 60, 0, 256);
        CASSITERITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Cassiterite ore vein")
                .defineInRange("cassiteriteOreSize", 16, 0, 256);
        CASSITERITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Cassiterite ore veins to generate per chunk")
                .defineInRange("cassiteriteOreCount", 2, 0, 256);
        CASSITERITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Cassiterite Ore")
                .defineInRange("CassiteriteOreHL", 1, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Bauxite Ore Settings").push("bauxiteOre");
        BAUXITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Bauxite ore)")
                .define("bauxiteOreEnabled",true);
        BAUXITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Bauxite ore at (make sure it is less than the maximum)")
                .defineInRange("bauxiteOreMin", 35, 0, 256);
        BAUXITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Bauxite ore at (make sure it is greater than the minimum)")
                .defineInRange("bauxiteOreMax", 60, 0, 256);
        BAUXITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Bauxite ore vein")
                .defineInRange("bauxiteOreSize", 16, 0, 256);
        BAUXITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Bauxite ore veins to generate per chunk")
                .defineInRange("bauxiteOreCount", 2, 0, 256);
        BAUXITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Bauxite Ore")
                .defineInRange("bauxiteOreHL", 1, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Sphalerite Ore Settings").push("sphaleriteOre");
        SPHALERITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Sphalerite ore)")
                .define("sphaleriteOreEnabled",true);
        SPHALERITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Sphalerite ore at (make sure it is less than the maximum)")
                .defineInRange("sphaleriteOreMin", 35, 0, 256);
        SPHALERITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Sphalerite ore at (make sure it is greater than the minimum)")
                .defineInRange("sphaleriteOreMax", 60, 0, 256);
        SPHALERITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Sphalerite ore vein")
                .defineInRange("sphaleriteOreSize", 16, 0, 256);
        SPHALERITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Sphalerite ore veins to generate per chunk")
                .defineInRange("sphaleriteOreCount", 2, 0, 256);
        SPHALERITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Sphalerite Ore")
                .defineInRange("sphaleriteOreHL", 1, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Lignite Ore Settings").push("ligniteOre");
        LIGNITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Lignite ore)")
                .define("ligniteOreEnabled",true);
        LIGNITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Lignite ore at (make sure it is less than the maximum)")
                .defineInRange("ligniteOreMin", 55, 0, 256);
        LIGNITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Lignite ore at (make sure it is greater than the minimum)")
                .defineInRange("ligniteOreMax", 75, 0, 256);
        LIGNITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Lignite ore vein")
                .defineInRange("ligniteOreSize", 20, 0, 256);
        LIGNITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Lignite ore veins to generate per chunk")
                .defineInRange("ligniteOreCount", 2, 0, 256);
        LIGNITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Lignite Ore")
                .defineInRange("ligniteOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Subbituminous Coal Ore Settings").push("subbituminousCoalOre");
        SUBBITUMINOUS_COAL_ORE_ENABLED = COMMON_BUILDER.comment("Enables Subbituminous Coal ore)")
                .define("subbituminousCoalOreEnabled",true);
        SUBBITUMINOUS_COAL_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Subbituminous Coal ore at (make sure it is less than the maximum)")
                .defineInRange("subbituminousCoalOreMin", 35, 0, 256);
        SUBBITUMINOUS_COAL_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Subbituminous Coal ore at (make sure it is greater than the minimum)")
                .defineInRange("subbituminousCoalOreMax", 55, 0, 256);
        SUBBITUMINOUS_COAL_ORE_SIZE = COMMON_BUILDER.comment("Size of Subbituminous Coal ore vein")
                .defineInRange("subbituminousCoalOreSize", 20, 0, 256);
        SUBBITUMINOUS_COAL_ORE_COUNT = COMMON_BUILDER.comment("Number of Subbituminous Coal ore veins to generate per chunk")
                .defineInRange("subbituminousCoalOreCount", 4, 0, 256);
        SUBBITUMINOUS_COAL_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Subbituminous Coal Ore")
                .defineInRange("subbituminousCoalOreHL", 1, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Bituminous Coal Ore Settings").push("bituminousCoalOre");
        BITUMINOUS_COAL_ORE_ENABLED = COMMON_BUILDER.comment("Enables Bituminous Coal ore)")
                .define("bituminousCoalOreEnabled",true);
        BITUMINOUS_COAL_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Bituminous Coal ore at (make sure it is less than the maximum)")
                .defineInRange("bituminousCoalOreMin", 15, 0, 256);
        BITUMINOUS_COAL_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Bituminous Coal ore at (make sure it is greater than the minimum)")
                .defineInRange("bituminousCoalOreMax", 35, 0, 256);
        BITUMINOUS_COAL_ORE_SIZE = COMMON_BUILDER.comment("Size of Bituminous Coal ore vein")
                .defineInRange("bituminousCoalOreSize", 20, 0, 256);
        BITUMINOUS_COAL_ORE_COUNT = COMMON_BUILDER.comment("Number of Bituminous Coal ore veins to generate per chunk")
                .defineInRange("bituminousCoalOreCount", 4, 0, 256);
        BITUMINOUS_COAL_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Bituminous Coal Ore")
                .defineInRange("bituminousCoalOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Magnetite Ore Settings").push("magnetiteOre");
        MAGNETITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Magnetite ore)")
                .define("magnetiteOreEnabled",true);
        MAGNETITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Magnetite ore at (make sure it is less than the maximum)")
                .defineInRange("magnetiteOreMin", 10, 0, 256);
        MAGNETITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Magnetite ore at (make sure it is greater than the minimum)")
                .defineInRange("magnetiteOreMax", 50, 0, 256);
        MAGNETITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Magnetite ore vein")
                .defineInRange("magnetiteOreSize", 20, 0, 256);
        MAGNETITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Magnetite ore veins to generate per chunk")
                .defineInRange("magnetiteOreCount", 3, 0, 256);
        MAGNETITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Magnetite Ore")
                .defineInRange("magnetiteOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Magnesite Ore Settings").push("magnesiteOre");
        MAGNESITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Magnesite ore)")
                .define("magnesiteOreEnabled",true);
        MAGNESITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Magnesite ore at (make sure it is less than the maximum)")
                .defineInRange("magnesiteOreMin", 10, 0, 256);
        MAGNESITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Magnesite ore at (make sure it is greater than the minimum)")
                .defineInRange("magnesiteOreMax", 45, 0, 256);
        MAGNESITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Magnesite ore vein")
                .defineInRange("magnesiteOreSize", 18, 0, 256);
        MAGNESITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Magnesite ore veins to generate per chunk")
                .defineInRange("magnesiteOreCount", 2, 0, 256);
        MAGNESITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Magnesite Ore")
                .defineInRange("magnesiteOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Pentlandite Ore Settings").push("pentlanditeOre");
        PENTLANDITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Pentlandite ore)")
                .define("pentlanditeOreEnabled",true);
        PENTLANDITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Pentlandite ore at (make sure it is less than the maximum)")
                .defineInRange("pentlanditeOreMin", 10, 0, 256);
        PENTLANDITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Pentlandite ore at (make sure it is greater than the minimum)")
                .defineInRange("pentlanditeOreMax", 45, 0, 256);
        PENTLANDITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Pentlandite ore vein")
                .defineInRange("pentlanditeOreSize", 16, 0, 256);
        PENTLANDITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Pentlandite ore veins to generate per chunk")
                .defineInRange("pentlanditeOreCount", 2, 0, 256);
        PENTLANDITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Pentlandite Ore")
                .defineInRange("pentlanditeOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Galena Ore Settings").push("galenaOre");
        GALENA_ORE_ENABLED = COMMON_BUILDER.comment("Enables Galena ore)")
                .define("galenaOreEnabled",true);
        GALENA_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Galena ore at (make sure it is less than the maximum)")
                .defineInRange("galenaOreMin", 10, 0, 256);
        GALENA_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Galena ore at (make sure it is greater than the minimum)")
                .defineInRange("galenaOreMax", 45, 0, 256);
        GALENA_ORE_SIZE = COMMON_BUILDER.comment("Size of Galena ore vein")
                .defineInRange("galenaOreSize", 16, 0, 256);
        GALENA_ORE_COUNT = COMMON_BUILDER.comment("Number of Galena ore veins to generate per chunk")
                .defineInRange("galenaOreCount", 2, 0, 256);
        GALENA_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Galena Ore")
                .defineInRange("galenaOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Acanthite Ore Settings").push("acanthiteOre");
        ACANTHITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Acanthite ore)")
                .define("acanthiteOreEnabled",true);
        ACANTHITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Acanthite ore at (make sure it is less than the maximum)")
                .defineInRange("acanthiteOreMin", 10, 0, 256);
        ACANTHITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Acanthite ore at (make sure it is greater than the minimum)")
                .defineInRange("acanthiteOreMax", 45, 0, 256);
        ACANTHITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Acanthite ore vein")
                .defineInRange("acanthiteOreSize", 15, 0, 256);
        ACANTHITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Acanthite ore veins to generate per chunk")
                .defineInRange("acanthiteOreCount", 2, 0, 256);
        ACANTHITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Acanthite Ore")
                .defineInRange("acanthiteOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Pyrolusite Ore Settings").push("pyrolusiteOre");
        PYROLUSITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Pyrolusite ore)")
                .define("pyrolusiteOreEnabled",true);
        PYROLUSITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Pyrolusite ore at (make sure it is less than the maximum)")
                .defineInRange("pyrolusiteOreMin", 10, 0, 256);
        PYROLUSITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Pyrolusite ore at (make sure it is greater than the minimum)")
                .defineInRange("pyrolusiteOreMax", 45, 0, 256);
        PYROLUSITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Pyrolusite ore vein")
                .defineInRange("pyrolusiteOreSize", 15, 0, 256);
        PYROLUSITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Pyrolusite ore veins to generate per chunk")
                .defineInRange("pyrolusiteOreCount", 2, 0, 256);
        PYROLUSITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Pyrolusite Ore")
                .defineInRange("pyrolusiteOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Petalite Ore Settings").push("petaliteOre");
        PETALITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Petalite ore)")
                .define("petaliteOreEnabled",true);
        PETALITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Petalite ore at (make sure it is less than the maximum)")
                .defineInRange("petaliteOreMin", 10, 0, 256);
        PETALITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Petalite ore at (make sure it is greater than the minimum)")
                .defineInRange("petaliteOreMax", 30, 0, 256);
        PETALITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Petalite ore vein")
                .defineInRange("petaliteOreSize", 5, 0, 256);
        PETALITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Petalite ore veins to generate per chunk")
                .defineInRange("petaliteOreCount", 1, 0, 256);
        PETALITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Petalite Ore")
                .defineInRange("petaliteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Cinnabar Ore Settings").push("cinnabarOre");
        CINNABAR_ORE_ENABLED = COMMON_BUILDER.comment("Enables Cinnabar ore)")
                .define("cinnabarOreEnabled",true);
        CINNABAR_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Cinnabar ore at (make sure it is less than the maximum)")
                .defineInRange("cinnabarOreMin", 20, 0, 256);
        CINNABAR_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Cinnabar ore at (make sure it is greater than the minimum)")
                .defineInRange("cinnabarOreMax", 45, 0, 256);
        CINNABAR_ORE_SIZE = COMMON_BUILDER.comment("Size of Cinnabar ore vein")
                .defineInRange("cinnabarOreSize", 20, 0, 256);
        CINNABAR_ORE_COUNT = COMMON_BUILDER.comment("Number of Cinnabar ore veins to generate per chunk")
                .defineInRange("cinnabarOreCount", 3, 0, 256);
        CINNABAR_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Cinnabar Ore")
                .defineInRange("cinnabarOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Chromite Ore Settings").push("chromiteOre");
        CHROMITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Chromite ore)")
                .define("chromiteOreEnabled",true);
        CHROMITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Chromite ore at (make sure it is less than the maximum)")
                .defineInRange("chromiteOreMin", 0, 0, 256);
        CHROMITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Chromite ore at (make sure it is greater than the minimum)")
                .defineInRange("chromiteOreMax", 15, 0, 256);
        CHROMITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Chromite ore vein")
                .defineInRange("chromiteOreSize", 10, 0, 256);
        CHROMITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Chromite ore veins to generate per chunk")
                .defineInRange("chromiteOreCount", 1, 0, 256);
        CHROMITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Chromite Ore")
                .defineInRange("chromiteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Celestine Ore Settings").push("celestineOre");
        CELESTINE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Celestine ore)")
                .define("celestineOreEnabled",true);
        CELESTINE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Celestine ore at (make sure it is less than the maximum)")
                .defineInRange("celestineOreMin", 50, 0, 256);
        CELESTINE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Celestine ore at (make sure it is greater than the minimum)")
                .defineInRange("celestineOreMax", 70, 0, 256);
        CELESTINE_ORE_SIZE = COMMON_BUILDER.comment("Size of Celestine ore vein")
                .defineInRange("celestineOreSize", 8, 0, 256);
        CELESTINE_ORE_COUNT = COMMON_BUILDER.comment("Number of Celestine ore veins to generate per chunk")
                .defineInRange("celestineOreCount", 1, 0, 256);
        CELESTINE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Celestine Ore")
                .defineInRange("celestineOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Vanadinite Ore Settings").push("vanadiniteOre");
        VANADINITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Vanadinite ore)")
                .define("vanadiniteOreEnabled",true);
        VANADINITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Vanadinite ore at (make sure it is less than the maximum)")
                .defineInRange("vanadiniteOreMin", 50, 0, 256);
        VANADINITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Vanadinite ore at (make sure it is greater than the minimum)")
                .defineInRange("vanadiniteOreMax", 70, 0, 256);
        VANADINITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Vanadinite ore vein")
                .defineInRange("vanadiniteOreSize", 8, 0, 256);
        VANADINITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Vanadinite ore veins to generate per chunk")
                .defineInRange("vanadiniteOreCount", 1, 0, 256);
        VANADINITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Vanadinite Ore")
                .defineInRange("vanadiniteOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Lazurite Ore Settings").push("lazuriteOre");
        LAZURITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Lazurite ore)")
                .define("lazuriteOreEnabled",true);
        LAZURITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Lazurite ore at (make sure it is less than the maximum)")
                .defineInRange("lazuriteOreMin", 40, 0, 256);
        LAZURITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Lazurite ore at (make sure it is greater than the minimum)")
                .defineInRange("lazuriteOreMax", 70, 0, 256);
        LAZURITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Lazurite ore vein")
                .defineInRange("lazuriteOreSize", 20, 0, 256);
        LAZURITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Lazurite ore veins to generate per chunk")
                .defineInRange("lazuriteOreCount", 3, 0, 256);
        LAZURITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Lazurite Ore")
                .defineInRange("lazuriteOreHL", 1, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Emerald Ore Settings").push("emeraldOre");
        EMERALD_ORE_ENABLED = COMMON_BUILDER.comment("Enables Emerald ore)")
                .define("emeraldOreEnabled",true);
        EMERALD_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Emerald ore at (make sure it is less than the maximum)")
                .defineInRange("emeraldOreMin", 10, 0, 256);
        EMERALD_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Emerald ore at (make sure it is greater than the minimum)")
                .defineInRange("emeraldOreMax", 60, 0, 256);
        EMERALD_ORE_SIZE = COMMON_BUILDER.comment("Size of Emerald ore vein")
                .defineInRange("emeraldOreSize", 7, 0, 256);
        EMERALD_ORE_COUNT = COMMON_BUILDER.comment("Number of Emerald ore veins to generate per chunk")
                .defineInRange("emeraldOreCount", 1, 0, 256);
        EMERALD_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Emerald Ore")
                .defineInRange("emeraldOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Aquamarine Ore Settings").push("aquamarineOre");
        AQUAMARINE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Aquamarine ore)")
                .define("aquamarineOreEnabled",true);
        AQUAMARINE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Aquamarine ore at (make sure it is less than the maximum)")
                .defineInRange("aquamarineOreMin", 10, 0, 256);
        AQUAMARINE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Aquamarine ore at (make sure it is greater than the minimum)")
                .defineInRange("aquamarineOreMax", 60, 0, 256);
        AQUAMARINE_ORE_SIZE = COMMON_BUILDER.comment("Size of Aquamarine ore vein")
                .defineInRange("aquamarineOreSize", 7, 0, 256);
        AQUAMARINE_ORE_COUNT = COMMON_BUILDER.comment("Number of Aquamarine ore veins to generate per chunk")
                .defineInRange("aquamarineOreCount", 1, 0, 256);
        AQUAMARINE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Aquamarine Ore")
                .defineInRange("aquamarineOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Majorite Ore Settings").push("majoriteOre");
        MAJORITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Majorite ore)")
                .define("majoriteOreEnabled",true);
        MAJORITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Majorite ore at (make sure it is less than the maximum)")
                .defineInRange("majoriteOreMin", 5, 0, 256);
        MAJORITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Majorite ore at (make sure it is greater than the minimum)")
                .defineInRange("majoriteOreMax", 15, 0, 256);
        MAJORITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Majorite ore vein")
                .defineInRange("majoriteOreSize", 5, 0, 256);
        MAJORITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Majorite ore veins to generate per chunk")
                .defineInRange("majoriteOreCount", 1, 0, 256);
        MAJORITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Majorite Ore")
                .defineInRange("majoriteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Plumbago Ore Settings (Only generates in marble)").push("plumbagoOre");
        PLUMBAGO_ORE_ENABLED = COMMON_BUILDER.comment("Enables Plumbago ore)")
                .define("plumbagoOreEnabled",true);
        PLUMBAGO_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Plumbago ore at (make sure it is less than the maximum)")
                .defineInRange("plumbagoOreMin", 5, 0, 256);
        PLUMBAGO_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Plumbago ore at (make sure it is greater than the minimum)")
                .defineInRange("plumbagoOreMax", 15, 0, 256);
        PLUMBAGO_ORE_SIZE = COMMON_BUILDER.comment("Size of Plumbago ore vein")
                .defineInRange("plumbagoOreSize", 15, 0, 256);
        PLUMBAGO_ORE_COUNT = COMMON_BUILDER.comment("Number of Plumbago ore veins to generate per chunk")
                .defineInRange("plumbagoOreCount", 1, 0, 256);
        PLUMBAGO_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Plumbago Ore")
                .defineInRange("plumbagoOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        //end overworld
        COMMON_BUILDER.pop();


        //NETHER ORES
        COMMON_BUILDER.comment("Nether Ore Settings").push(SUBCATEGORY_NETHER);

        COMMON_BUILDER.comment("Native Arsenic Ore Settings").push("nativeArsenicOre");
        NATIVE_ARSENIC_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Arsenic ore)")
                .define("nativeArsenicOreEnabled",true);
        NATIVE_ARSENIC_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Arsenic ore at (make sure it is less than the maximum)")
                .defineInRange("nativeArsenicOreMin", 30, 0, 256);
        NATIVE_ARSENIC_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Arsenic ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeArsenicOreMax", 90, 0, 256);
        NATIVE_ARSENIC_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Arsenic ore vein")
                .defineInRange("nativeArsenicOreSize", 12, 0, 256);
        NATIVE_ARSENIC_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Arsenic ore veins to generate per chunk")
                .defineInRange("nativeArsenicOreCount", 4, 0, 256);
        NATIVE_ARSENIC_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Arsenic Ore")
                .defineInRange("nativeArsenicOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Sulfur Ore Settings").push("nativeSulfurOre");
        NATIVE_SULFUR_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Sulfur ore)")
                .define("nativeSulfurOreEnabled",true);
        NATIVE_SULFUR_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Sulfur ore at (make sure it is less than the maximum)")
                .defineInRange("nativeSulfurOreMin", 30, 0, 256);
        NATIVE_SULFUR_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Sulfur ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeSulfurOreMax", 90, 0, 256);
        NATIVE_SULFUR_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Sulfur ore vein")
                .defineInRange("nativeSulfurOreSize", 12, 0, 256);
        NATIVE_SULFUR_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Sulfur ore veins to generate per chunk")
                .defineInRange("nativeSulfurOreCount", 8, 0, 256);
        NATIVE_SULFUR_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Sulfur Ore")
                .defineInRange("nativeSulfurOreHL", 0, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Anthracite Ore Settings").push("anthraciteOre");
        ANTHRACITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Anthracite ore)")
                .define("anthraciteOreEnabled",true);
        ANTHRACITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Anthracite ore at (make sure it is less than the maximum)")
                .defineInRange("anthraciteOreMin", 30, 0, 256);
        ANTHRACITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Anthracite ore at (make sure it is greater than the minimum)")
                .defineInRange("anthraciteOreMax", 90, 0, 256);
        ANTHRACITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Anthracite ore vein")
                .defineInRange("anthraciteOreSize", 20, 0, 256);
        ANTHRACITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Anthracite ore veins to generate per chunk")
                .defineInRange("anthraciteOreCount", 6, 0, 256);
        ANTHRACITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Anthracite Ore")
                .defineInRange("anthraciteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Cobaltite Ore Settings").push("cobaltiteOre");
        COBALTITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Cobaltite ore)")
                .define("cobaltiteOreEnabled",true);
        COBALTITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Cobaltite ore at (make sure it is less than the maximum)")
                .defineInRange("cobaltiteOreMin", 30, 0, 256);
        COBALTITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Cobaltite ore at (make sure it is greater than the minimum)")
                .defineInRange("cobaltiteOreMax", 90, 0, 256);
        COBALTITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Cobaltite ore vein")
                .defineInRange("cobaltiteOreSize", 10, 0, 256);
        COBALTITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Cobaltite ore veins to generate per chunk")
                .defineInRange("cobaltiteOreCount", 3, 0, 256);
        COBALTITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Cobaltite Ore")
                .defineInRange("cobaltiteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Bismuthinite Ore Settings").push("bismuthiniteOre");
        BISMUTHINITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Bismuthinite ore)")
                .define("bismuthiniteOreEnabled",true);
        BISMUTHINITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Bismuthinite ore at (make sure it is less than the maximum)")
                .defineInRange("bismuthiniteOreMin", 90, 0, 256);
        BISMUTHINITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Bismuthinite ore at (make sure it is greater than the minimum)")
                .defineInRange("bismuthiniteOreMax", 128, 0, 256);
        BISMUTHINITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Bismuthinite ore vein")
                .defineInRange("bismuthiniteOreSize", 15, 0, 256);
        BISMUTHINITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Bismuthinite ore veins to generate per chunk")
                .defineInRange("bismuthiniteOreCount", 1, 0, 256);
        BISMUTHINITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Bismuthinite Ore")
                .defineInRange("bismuthiniteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Ilmenite Ore Settings").push("ilmeniteOre");
        ILMENITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Ilmenite ore)")
                .define("ilmeniteOreEnabled",true);
        ILMENITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Ilmenite ore at (make sure it is less than the maximum)")
                .defineInRange("ilmeniteOreMin", 90, 0, 256);
        ILMENITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Ilmenite ore at (make sure it is greater than the minimum)")
                .defineInRange("ilmeniteOreMax", 128, 0, 256);
        ILMENITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Ilmenite ore vein")
                .defineInRange("ilmeniteOreSize", 20, 0, 256);
        ILMENITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Ilmenite ore veins to generate per chunk")
                .defineInRange("ilmeniteOreCount", 1, 0, 256);
        ILMENITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Ilmenite Ore")
                .defineInRange("ilmeniteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Wolframite Ore Settings").push("wolframiteOre");
        WOLFRAMITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Wolframite ore)")
                .define("wolframiteOreEnabled",true);
        WOLFRAMITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Wolframite ore at (make sure it is less than the maximum)")
                .defineInRange("wolframiteOreMin", 90, 0, 256);
        WOLFRAMITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Wolframite ore at (make sure it is greater than the minimum)")
                .defineInRange("wolframiteOreMax", 128, 0, 256);
        WOLFRAMITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Wolframite ore vein")
                .defineInRange("wolframiteOreSize", 20, 0, 256);
        WOLFRAMITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Wolframite ore veins to generate per chunk")
                .defineInRange("wolframiteOreCount", 1, 0, 256);
        WOLFRAMITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Wolframite Ore")
                .defineInRange("wolframiteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Sperrylite Ore Settings").push("sperryliteOre");
        SPERRYLITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Sperrylite ore)")
                .define("sperryliteOreEnabled",true);
        SPERRYLITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Sperrylite ore at (make sure it is less than the maximum)")
                .defineInRange("sperryliteOreMin", 90, 0, 256);
        SPERRYLITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Sperrylite ore at (make sure it is greater than the minimum)")
                .defineInRange("sperryliteOreMax", 128, 0, 256);
        SPERRYLITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Sperrylite ore vein")
                .defineInRange("sperryliteOreSize", 20, 0, 256);
        SPERRYLITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Sperrylite ore veins to generate per chunk")
                .defineInRange("sperryliteOreCount", 1, 0, 256);
        SPERRYLITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Sperrylite Ore")
                .defineInRange("sperryliteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Moissanite Ore Settings").push("moissaniteOre");
        MOISSANITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Moissanite ore)")
                .define("moissaniteOreEnabled",true);
        MOISSANITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Moissanite ore at (make sure it is less than the maximum)")
                .defineInRange("moissaniteOreMin", 31, 0, 256);
        MOISSANITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Moissanite ore at (make sure it is greater than the minimum)")
                .defineInRange("moissaniteOreMax", 90, 0, 256);
        MOISSANITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Moissanite ore vein")
                .defineInRange("moissaniteOreSize", 15, 0, 256);
        MOISSANITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Moissanite ore veins to generate per chunk")
                .defineInRange("moissaniteOreCount", 2, 0, 256);
        MOISSANITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Moissanite Ore")
                .defineInRange("moissaniteOreHL", 2, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Columbite Ore Settings").push("columbiteOre");
        COLUMBITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Columbite ore)")
                .define("columbiteOreEnabled",true);
        COLUMBITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Columbite ore at (make sure it is less than the maximum)")
                .defineInRange("columbiteOreMin", 1, 0, 256);
        COLUMBITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Columbite ore at (make sure it is greater than the minimum)")
                .defineInRange("columbiteOreMax", 30, 0, 256);
        COLUMBITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Columbite ore vein")
                .defineInRange("columbiteOreSize", 10, 0, 256);
        COLUMBITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Columbite ore veins to generate per chunk")
                .defineInRange("columbiteOreCount", 1, 0, 256);
        COLUMBITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Columbite Ore")
                .defineInRange("columbiteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Tantalite Ore Settings").push("tantaliteOre");
        TANTALITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Tantalite ore)")
                .define("tantaliteOreEnabled",true);
        TANTALITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Tantalite ore at (make sure it is less than the maximum)")
                .defineInRange("tantaliteOreMin", 1, 0, 256);
        TANTALITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Tantalite ore at (make sure it is greater than the minimum)")
                .defineInRange("tantaliteOreMax", 30, 0, 256);
        TANTALITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Tantalite ore vein")
                .defineInRange("tantaliteOreSize", 7, 0, 256);
        TANTALITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Tantalite ore veins to generate per chunk")
                .defineInRange("tantaliteOreCount", 1, 0, 256);
        TANTALITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Tantalite Ore")
                .defineInRange("tantaliteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        //end nether
        COMMON_BUILDER.pop();


        //END ORES
        COMMON_BUILDER.comment("End Ore Settings").push(SUBCATEGORY_END);

        COMMON_BUILDER.comment("Native Gallium Ore Settings").push("nativeGalliumOre");
        NATIVE_GALLIUM_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Gallium ore)")
                .define("nativeGalliumOreEnabled",true);
        NATIVE_GALLIUM_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Gallium ore at (make sure it is less than the maximum)")
                .defineInRange("nativeGalliumOreMin", 0, 0, 256);
        NATIVE_GALLIUM_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Gallium ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeGalliumOreMax", 100, 0, 256);
        NATIVE_GALLIUM_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Gallium ore vein")
                .defineInRange("nativeGalliumOreSize", 12, 0, 256);
        NATIVE_GALLIUM_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Gallium ore veins to generate per chunk")
                .defineInRange("nativeGalliumOreCount", 4, 0, 256);
        NATIVE_GALLIUM_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Gallium Ore")
                .defineInRange("nativeGalliumOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Indium Ore Settings").push("nativeIndiumOre");
        NATIVE_INDIUM_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Indium ore)")
                .define("nativeIndiumOreEnabled",true);
        NATIVE_INDIUM_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Indium ore at (make sure it is less than the maximum)")
                .defineInRange("nativeIndiumOreMin", 0, 0, 256);
        NATIVE_INDIUM_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Indium ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeIndiumOreMax", 100, 0, 256);
        NATIVE_INDIUM_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Indium ore vein")
                .defineInRange("nativeIndiumOreSize", 12, 0, 256);
        NATIVE_INDIUM_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Indium ore veins to generate per chunk")
                .defineInRange("nativeIndiumOreCount", 4, 0, 256);
        NATIVE_INDIUM_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Indium Ore")
                .defineInRange("nativeIndiumOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Selenium Ore Settings").push("nativeSeleniumOre");
        NATIVE_SELENIUM_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Selenium ore)")
                .define("nativeSeleniumOreEnabled",true);
        NATIVE_SELENIUM_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Selenium ore at (make sure it is less than the maximum)")
                .defineInRange("nativeSeleniumOreMin", 0, 0, 256);
        NATIVE_SELENIUM_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Selenium ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeSeleniumOreMax", 100, 0, 256);
        NATIVE_SELENIUM_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Selenium ore vein")
                .defineInRange("nativeSeleniumOreSize", 12, 0, 256);
        NATIVE_SELENIUM_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Selenium ore veins to generate per chunk")
                .defineInRange("nativeSeleniumOreCount", 4, 0, 256);
        NATIVE_SELENIUM_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Selenium Ore")
                .defineInRange("nativeSeleniumOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Native Tellurium Ore Settings").push("nativeTelluriumOre");
        NATIVE_TELLURIUM_ORE_ENABLED = COMMON_BUILDER.comment("Enables Native Tellurium ore)")
                .define("nativeTelluriumOreEnabled",true);
        NATIVE_TELLURIUM_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Native Tellurium ore at (make sure it is less than the maximum)")
                .defineInRange("nativeTelluriumOreMin", 0, 0, 256);
        NATIVE_TELLURIUM_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Native Tellurium ore at (make sure it is greater than the minimum)")
                .defineInRange("nativeTelluriumOreMax", 100, 0, 256);
        NATIVE_TELLURIUM_ORE_SIZE = COMMON_BUILDER.comment("Size of Native Tellurium ore vein")
                .defineInRange("nativeTelluriumOreSize", 12, 0, 256);
        NATIVE_TELLURIUM_ORE_COUNT = COMMON_BUILDER.comment("Number of Native Tellurium ore veins to generate per chunk")
                .defineInRange("nativeTelluriumOreCount", 4, 0, 256);
        NATIVE_TELLURIUM_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Native Tellurium Ore")
                .defineInRange("nativeTelluriumOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Uraninite Ore Settings").push("uraniniteOre");
        URANINITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Uraninite ore)")
                .define("uraniniteOreEnabled",true);
        URANINITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Uraninite ore at (make sure it is less than the maximum)")
                .defineInRange("uraniniteOreMin", 0, 0, 256);
        URANINITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Uraninite ore at (make sure it is greater than the minimum)")
                .defineInRange("uraniniteOreMax", 100, 0, 256);
        URANINITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Uraninite ore vein")
                .defineInRange("uraniniteOreSize", 20, 0, 256);
        URANINITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Uraninite ore veins to generate per chunk")
                .defineInRange("uraniniteOreCount", 4, 0, 256);
        URANINITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Uraninite Ore")
                .defineInRange("uraniniteOreHL", 4, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Fluorite Ore Settings").push("fluoriteOre");
        FLUORITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Fluorite ore)")
                .define("fluoriteOreEnabled",true);
        FLUORITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Fluorite ore at (make sure it is less than the maximum)")
                .defineInRange("fluoriteOreMin", 0, 0, 256);
        FLUORITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Fluorite ore at (make sure it is greater than the minimum)")
                .defineInRange("fluoriteOreMax", 100, 0, 256);
        FLUORITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Fluorite ore vein")
                .defineInRange("fluoriteOreSize", 12, 0, 256);
        FLUORITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Fluorite ore veins to generate per chunk")
                .defineInRange("fluoriteOreCount", 8, 0, 256);
        FLUORITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Fluorite Ore")
                .defineInRange("fluoriteOreHL", 4, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Xenotime Ore Settings").push("xenotimeOre");
        XENOTIME_ORE_ENABLED = COMMON_BUILDER.comment("Enables Xenotime ore)")
                .define("xenotimeOreEnabled",true);
        XENOTIME_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Xenotime ore at (make sure it is less than the maximum)")
                .defineInRange("xenotimeOreMin", 0, 0, 256);
        XENOTIME_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Xenotime ore at (make sure it is greater than the minimum)")
                .defineInRange("xenotimeOreMax", 100, 0, 256);
        XENOTIME_ORE_SIZE = COMMON_BUILDER.comment("Size of Xenotime ore vein")
                .defineInRange("xenotimeOreSize", 10, 0, 256);
        XENOTIME_ORE_COUNT = COMMON_BUILDER.comment("Number of Xenotime ore veins to generate per chunk")
                .defineInRange("xenotimeOreCount", 4, 0, 256);
        XENOTIME_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Xenotime Ore")
                .defineInRange("xenotimeOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Greenockite Ore Settings").push("greenockiteOre");
        GREENOCKITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Greenockite ore)")
                .define("greenockiteOreEnabled",true);
        GREENOCKITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Greenockite ore at (make sure it is less than the maximum)")
                .defineInRange("greenockiteOreMin", 0, 0, 256);
        GREENOCKITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Greenockite ore at (make sure it is greater than the minimum)")
                .defineInRange("greenockiteOreMax", 100, 0, 256);
        GREENOCKITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Greenockite ore vein")
                .defineInRange("greenockiteOreSize", 10, 0, 256);
        GREENOCKITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Greenockite ore veins to generate per chunk")
                .defineInRange("greenockiteOreCount", 1, 0, 256);
        GREENOCKITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Greenockite Ore")
                .defineInRange("greenockiteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        COMMON_BUILDER.comment("Molybdenite Ore Settings").push("molybdeniteOre");
        MOLYBDENITE_ORE_ENABLED = COMMON_BUILDER.comment("Enables Molybdenite ore)")
                .define("molybdeniteOreEnabled",true);
        MOLYBDENITE_ORE_MIN_HEIGHT = COMMON_BUILDER.comment("Minimum height to generate Molybdenite ore at (make sure it is less than the maximum)")
                .defineInRange("molybdeniteOreMin", 0, 0, 256);
        MOLYBDENITE_ORE_MAX_HEIGHT = COMMON_BUILDER.comment("Maximum height to generate Molybdenite ore at (make sure it is greater than the minimum)")
                .defineInRange("molybdeniteOreMax", 100, 0, 256);
        MOLYBDENITE_ORE_SIZE = COMMON_BUILDER.comment("Size of Molybdenite ore vein")
                .defineInRange("molybdeniteOreSize", 10, 0, 256);
        MOLYBDENITE_ORE_COUNT = COMMON_BUILDER.comment("Number of Molybdenite ore veins to generate per chunk")
                .defineInRange("molybdeniteOreCount", 4, 0, 256);
        MOLYBDENITE_ORE_HL = COMMON_BUILDER.comment("Harvest Level of Molybdenite Ore")
                .defineInRange("molybdeniteOreHL", 3, 0, 5);
        COMMON_BUILDER.pop();

        //end end
        COMMON_BUILDER.pop();

        //end oregen
        COMMON_BUILDER.pop();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path path) {

        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.setConfig(configData);
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }


}
