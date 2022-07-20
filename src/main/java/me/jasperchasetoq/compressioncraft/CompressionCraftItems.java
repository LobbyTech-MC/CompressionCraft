package me.jasperchasetoq.compressioncraft;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CompressionCraftItems {

    private CompressionCraftItems() {}


    //machines Old
    public static final SlimefunItemStack CC_COMPRESSOR_1 = new SlimefunItemStack("CC_COMPRESSOR_1", Material.PISTON, "&eCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_2 = new SlimefunItemStack("CC_COMPRESSOR_2", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_3 = new SlimefunItemStack("CC_COMPRESSOR_3", Material.PISTON, "&aCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_4 = new SlimefunItemStack("CC_COMPRESSOR_4", Material.PISTON, "&2Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_5 = new SlimefunItemStack("CC_COMPRESSOR_5", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_6 = new SlimefunItemStack("CC_COMPRESSOR_6", Material.PISTON, "&4Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_1 = new SlimefunItemStack("CC_DECOMPRESSOR_1", Material.PISTON, "&eDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_2 = new SlimefunItemStack("CC_DECOMPRESSOR_2", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_3 = new SlimefunItemStack("CC_DECOMPRESSOR_3", Material.PISTON, "&aDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_4 = new SlimefunItemStack("CC_DECOMPRESSOR_4", Material.PISTON, "&2Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_5 = new SlimefunItemStack("CC_DECOMPRESSOR_5", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_6 = new SlimefunItemStack("CC_DECOMPRESSOR_6", Material.PISTON, "&4Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");
    //New Machines
    public static final SlimefunItemStack JC_COMPRESSOR_1 = new SlimefunItemStack("JC_COMPRESSOR_1", Material.PISTON, "&eCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_2 = new SlimefunItemStack("JC_COMPRESSOR_2", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_3 = new SlimefunItemStack("JC_COMPRESSOR_3", Material.PISTON, "&aCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_4 = new SlimefunItemStack("JC_COMPRESSOR_4", Material.PISTON, "&2Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_5 = new SlimefunItemStack("JC_COMPRESSOR_5", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_6 = new SlimefunItemStack("JC_COMPRESSOR_6", Material.PISTON, "&4Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_1 = new SlimefunItemStack("JC_DECOMPRESSOR_1", Material.PISTON, "&eDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_2 = new SlimefunItemStack("JC_DECOMPRESSOR_2", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_3 = new SlimefunItemStack("JC_DECOMPRESSOR_3", Material.PISTON, "&aDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_4 = new SlimefunItemStack("JC_DECOMPRESSOR_4", Material.PISTON, "&2Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_5 = new SlimefunItemStack("JC_DECOMPRESSOR_5", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_6 = new SlimefunItemStack("JC_DECOMPRESSOR_6", Material.PISTON, "&4Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");


    public static final SlimefunItemStack CC_JC_LORE_REFRESHER = new SlimefunItemStack("CC_LORE_REFRESHER", Material.BOOKSHELF, "&fLore Refresher", "&fRefreshes CompressionCraft item lore", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(10),"&fCompressionCraft");


    //Compressed Items (Old)

    public static final SlimefunItemStack CC_COBBLESTONE_1 = new SlimefunItemStack("CC_COBBLESTONE_1", Material.COBBLESTONE, "&fCompressed Cobblestone",  "&f8 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_STONE_1 = new SlimefunItemStack("CC_STONE_1", Material.STONE, "&fCompressed Stone",  "&f8 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_ANDESITE_1 = new SlimefunItemStack("CC_ANDESITE_1", Material.ANDESITE, "&fCompressed Andesite",  "&f8 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIORITE_1 = new SlimefunItemStack("CC_DIORITE_1", Material.DIORITE, "&fCompressed Diorite",  "&f8 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GRANITE_1 = new SlimefunItemStack("CC_GRANITE_1", Material.GRANITE, "&fCompressed Granite",  "&f8 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("CC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&fCompressed Cobbled Deepslate",  "&f8 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DEEPSLATE_1 = new SlimefunItemStack("CC_DEEPSLATE_1", Material.DEEPSLATE, "&fCompressed Deepslate",  "&f8 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack CC_FLINT_1 = new SlimefunItemStack("CC_FLINT_1", Material.FLINT, "&fCompressed Flint",  "&f8 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GRAVEL_1 = new SlimefunItemStack("CC_GRAVEL_1", Material.GRAVEL, "&fCompressed Gravel",  "&f8 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIRT_1 = new SlimefunItemStack("CC_DIRT_1", Material.DIRT, "&fCompressed Dirt",  "&f8 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack CC_CLAY_BALL_1 = new SlimefunItemStack("CC_CLAY_BALL_1", Material.CLAY_BALL, "&fCompressed Clay Ball",  "&f8 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack CC_CLAY_1 = new SlimefunItemStack("CC_CLAY_1", Material.CLAY, "&fCompressed Clay",  "&f8 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COAL_1 = new SlimefunItemStack("CC_COAL_1", Material.COAL, "&fCompressed Coal",  "&f8 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COAL_BLOCK_1 = new SlimefunItemStack("CC_COAL_BLOCK_1", Material.COAL_BLOCK, "&fCompressed Coal Block",  "&f8 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_IRON_NUGGET_1 = new SlimefunItemStack("CC_IRON_NUGGET_1", Material.IRON_NUGGET, "&fCompressed Iron Nugget",  "&f8 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack CC_IRON_INGOT_1 = new SlimefunItemStack("CC_IRON_INGOT_1", Material.IRON_INGOT, "&fCompressed Iron Ingot",  "&f8 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack CC_IRON_BLOCk_1 = new SlimefunItemStack("CC_IRON_BLOCK_1", Material.IRON_BLOCK, "&fCompressed Iron Block",  "&f8 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GOLD_NUGGET_1 = new SlimefunItemStack("CC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&fCompressed Gold Nugget",  "&f8 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GOLD_INGOT_1 = new SlimefunItemStack("CC_GOLD_INGOT_1", Material.GOLD_INGOT, "&fCompressed Gold Ingot",  "&f8 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GOLD_BLOCK_1 = new SlimefunItemStack("CC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&fCompressed Gold Block",  "&f8 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_REDSTONE_1 = new SlimefunItemStack("CC_REDSTONE_1", Material.REDSTONE, "&fCompressed Redstone",  "&f8 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_REDSTONE_BLOCK_1 = new SlimefunItemStack("CC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&fCompressed Redstone Block",  "&f8 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_LAPIS_LAZULI_1 = new SlimefunItemStack("CC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&fCompressed Lapis Lazuli",  "&f8 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack CC_LAPIS_BLOCK_1 = new SlimefunItemStack("CC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&fCompressed Lapis Block",  "&f8 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIAMOND_1 = new SlimefunItemStack("CC_DIAMOND_1", Material.DIAMOND, "&fCompressed Diamond",  "&f8 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIAMOND_BLOCK_1 = new SlimefunItemStack("CC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&fCompressed Diamond Block",  "&f8 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_EMERALD_1 = new SlimefunItemStack("CC_EMERALD_1", Material.EMERALD, "&fCompressed Emerald",  "&f8 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack CC_EMERALD_BLOCK_1 = new SlimefunItemStack("CC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&fCompressed Emerald Block",  "&f8 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_AMETHYST_SHARD_1 = new SlimefunItemStack("CC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&fCompressed Amethyst Shard",  "&f8 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack CC_AMETHYST_BLOCK_1 = new SlimefunItemStack("CC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&fCompressed Amethyst Block",  "&f8 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("CC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&fCompressed Small Amethyst Bud",  "&f8 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack CC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("CC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&fCompressed Medium Amethyst Bud",  "&f8 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack CC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("CC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&fCompressed Large Amethyst Bud",  "&f8 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack CC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("CC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&fCompressed Amethyst Cluster",  "&f8 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_2 = new SlimefunItemStack("CC_COBBLESTONE_2", Material.COBBLESTONE, "&fDouble Compressed Cobblestone",  "&f64 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_3 = new SlimefunItemStack("CC_COBBLESTONE_3", Material.COBBLESTONE, "&fTriple Compressed Cobblestone",  "&f512 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_4 = new SlimefunItemStack("CC_COBBLESTONE_4", Material.COBBLESTONE, "&fQuadruple Compressed Cobblestone",  "&f4096 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_5 = new SlimefunItemStack("CC_COBBLESTONE_5", Material.COBBLESTONE, "&fQuintuple Compressed Cobblestone",  "&f32768 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_6 = new SlimefunItemStack("CC_COBBLESTONE_6", Material.COBBLESTONE, "&fSextuple Compressed Cobblestone",  "&f262144 Cobblestone", "&fCompressionCraft");

    //Compressed Items (New)

    public static final SlimefunItemStack JC_COBBLESTONE_1 = new SlimefunItemStack("JC_COBBLESTONE_1", Material.COBBLESTONE, "&fCompressed Cobblestone",  "&f8 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_1 = new SlimefunItemStack("JC_STONE_1", Material.STONE, "&fCompressed Stone",  "&f8 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_1 = new SlimefunItemStack("JC_ANDESITE_1", Material.ANDESITE, "&fCompressed Andesite",  "&f8 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_1 = new SlimefunItemStack("JC_DIORITE_1", Material.DIORITE, "&fCompressed Diorite",  "&f8 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_1 = new SlimefunItemStack("JC_GRANITE_1", Material.GRANITE, "&fCompressed Granite",  "&f8 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&fCompressed Cobbled Deepslate",  "&f8 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_1 = new SlimefunItemStack("JC_DEEPSLATE_1", Material.DEEPSLATE, "&fCompressed Deepslate",  "&f8 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_1 = new SlimefunItemStack("JC_FLINT_1", Material.FLINT, "&fCompressed Flint",  "&f8 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_1 = new SlimefunItemStack("JC_GRAVEL_1", Material.GRAVEL, "&fCompressed Gravel",  "&f8 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_1 = new SlimefunItemStack("JC_DIRT_1", Material.DIRT, "&fCompressed Dirt",  "&f8 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_1 = new SlimefunItemStack("JC_CLAY_BALL_1", Material.CLAY_BALL, "&fCompressed Clay Ball",  "&f8 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_1 = new SlimefunItemStack("JC_CLAY_1", Material.CLAY, "&fCompressed Clay",  "&f8 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_1 = new SlimefunItemStack("JC_SNOW_BALL_1", Material.SNOWBALL, "&fCompressed Snow Ball",  "&f8 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_1 = new SlimefunItemStack("JC_SNOW_BLOCK_1", Material.SNOW_BLOCK, "&fCompressed Snow Block",  "&f8 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_1 = new SlimefunItemStack("JC_COAL_1", Material.COAL, "&fCompressed Coal",  "&f8 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_1 = new SlimefunItemStack("JC_COAL_BLOCK_1", Material.COAL_BLOCK, "&fCompressed Coal Block",  "&f8 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_1 = new SlimefunItemStack("JC_IRON_NUGGET_1", Material.IRON_NUGGET, "&fCompressed Iron Nugget",  "&f8 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_1 = new SlimefunItemStack("JC_IRON_INGOT_1", Material.IRON_INGOT, "&fCompressed Iron Ingot",  "&f8 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_1 = new SlimefunItemStack("JC_IRON_BLOCK_1", Material.IRON_BLOCK, "&fCompressed Iron Block",  "&f8 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_1 = new SlimefunItemStack("JC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&fCompressed Gold Nugget",  "&f8 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_1 = new SlimefunItemStack("JC_GOLD_INGOT_1", Material.GOLD_INGOT, "&fCompressed Gold Ingot",  "&f8 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_1 = new SlimefunItemStack("JC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&fCompressed Gold Block",  "&f8 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_1 = new SlimefunItemStack("JC_REDSTONE_1", Material.REDSTONE, "&fCompressed Redstone",  "&f8 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_1 = new SlimefunItemStack("JC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&fCompressed Redstone Block",  "&f8 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_1 = new SlimefunItemStack("JC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&fCompressed Lapis Lazuli",  "&f8 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_1 = new SlimefunItemStack("JC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&fCompressed Lapis Block",  "&f8 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_1 = new SlimefunItemStack("JC_DIAMOND_1", Material.DIAMOND, "&fCompressed Diamond",  "&f8 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_1 = new SlimefunItemStack("JC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&fCompressed Diamond Block",  "&f8 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_1 = new SlimefunItemStack("JC_EMERALD_1", Material.EMERALD, "&fCompressed Emerald",  "&f8 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_1 = new SlimefunItemStack("JC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&fCompressed Emerald Block",  "&f8 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_1 = new SlimefunItemStack("JC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&fCompressed Amethyst Shard",  "&f8 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_1 = new SlimefunItemStack("JC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&fCompressed Amethyst Block",  "&f8 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&fCompressed Small Amethyst Bud",  "&f8 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&fCompressed Medium Amethyst Bud",  "&f8 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&fCompressed Large Amethyst Bud",  "&f8 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&fCompressed Amethyst Cluster",  "&f8 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_2 = new SlimefunItemStack("JC_COBBLESTONE_2", Material.COBBLESTONE, "&fDouble Compressed Cobblestone",  "&f64 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_2 = new SlimefunItemStack("JC_STONE_2", Material.STONE, "&fDouble Compressed Stone",  "&f64 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_2 = new SlimefunItemStack("JC_ANDESITE_2", Material.ANDESITE, "&fDouble Compressed Andesite",  "&f64 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_2 = new SlimefunItemStack("JC_DIORITE_2", Material.DIORITE, "&fDouble Compressed Diorite",  "&f64 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_2 = new SlimefunItemStack("JC_GRANITE_2", Material.GRANITE, "&fDouble Compressed Granite",  "&f64 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_2 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_2", Material.COBBLED_DEEPSLATE, "&fDouble Compressed Cobbled Deepslate",  "&f64 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_2 = new SlimefunItemStack("JC_DEEPSLATE_2", Material.DEEPSLATE, "&fDouble Compressed Deepslate",  "&f64 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_2 = new SlimefunItemStack("JC_FLINT_2", Material.FLINT, "&fDouble Compressed Flint",  "&f64 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_2 = new SlimefunItemStack("JC_GRAVEL_2", Material.GRAVEL, "&fDouble Compressed Gravel",  "&f64 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_2 = new SlimefunItemStack("JC_DIRT_2", Material.DIRT, "&fDouble Compressed Dirt",  "&f64 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_2 = new SlimefunItemStack("JC_CLAY_BALL_2", Material.CLAY_BALL, "&fDouble Compressed Clay Ball",  "&f64 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_2 = new SlimefunItemStack("JC_CLAY_2", Material.CLAY, "&fDouble Compressed Clay",  "&f64 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_2 = new SlimefunItemStack("JC_SNOW_BALL_2", Material.SNOWBALL, "&fDouble Compressed Snow Ball",  "&f64 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_2 = new SlimefunItemStack("JC_SNOW_BLOCK_2", Material.SNOW_BLOCK, "&fDouble Compressed Snow Block",  "&f64 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_2 = new SlimefunItemStack("JC_COAL_2", Material.COAL, "&fDouble Compressed Coal",  "&f64 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_2 = new SlimefunItemStack("JC_COAL_BLOCK_2", Material.COAL_BLOCK, "&fDouble Compressed Coal Block",  "&f64 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_2 = new SlimefunItemStack("JC_IRON_NUGGET_2", Material.IRON_NUGGET, "&fDouble Compressed Iron Nugget",  "&f64 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_2 = new SlimefunItemStack("JC_IRON_INGOT_2", Material.IRON_INGOT, "&fDouble Compressed Iron Ingot",  "&f64 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_2 = new SlimefunItemStack("JC_IRON_BLOCK_2", Material.IRON_BLOCK, "&fDouble Compressed Iron Block",  "&f64 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_2 = new SlimefunItemStack("JC_GOLD_NUGGET_2", Material.GOLD_NUGGET, "&fDouble Compressed Gold Nugget",  "&f64 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_2 = new SlimefunItemStack("JC_GOLD_INGOT_2", Material.GOLD_INGOT, "&fDouble Compressed Gold Ingot",  "&f64 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_2 = new SlimefunItemStack("JC_GOLD_BLOCK_2", Material.GOLD_BLOCK, "&fDouble Compressed Gold Block",  "&f64 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_2 = new SlimefunItemStack("JC_REDSTONE_2", Material.REDSTONE, "&fDouble Compressed Redstone",  "&f64 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_2 = new SlimefunItemStack("JC_REDSTONE_BLOCK_2", Material.REDSTONE_BLOCK, "&fDouble Compressed Redstone Block",  "&f64 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_2 = new SlimefunItemStack("JC_LAPIS_LAZULI_2", Material.LAPIS_LAZULI, "&fDouble Compressed Lapis Lazuli",  "&f64 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_2 = new SlimefunItemStack("JC_LAPIS_BLOCK_2", Material.LAPIS_BLOCK, "&fDouble Compressed Lapis Block",  "&f64 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_2 = new SlimefunItemStack("JC_DIAMOND_2", Material.DIAMOND, "&fDouble Compressed Diamond",  "&f64 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_2 = new SlimefunItemStack("JC_DIAMOND_BLOCK_2", Material.DIAMOND_BLOCK, "&fDouble Compressed Diamond Block",  "&f64 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_2 = new SlimefunItemStack("JC_EMERALD_2", Material.EMERALD, "&fDouble Compressed Emerald",  "&f64 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_2 = new SlimefunItemStack("JC_EMERALD_BLOCK_2", Material.EMERALD_BLOCK, "&fDouble Compressed Emerald Block",  "&f64 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_2 = new SlimefunItemStack("JC_AMETHYST_SHARD_2", Material.AMETHYST_SHARD, "&fDouble Compressed Amethyst Shard",  "&f64 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_2 = new SlimefunItemStack("JC_AMETHYST_BLOCK_2", Material.AMETHYST_BLOCK, "&fDouble Compressed Amethyst Block",  "&f64 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_2 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_2", Material.SMALL_AMETHYST_BUD, "&fDouble Compressed Small Amethyst Bud",  "&f64 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_2 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_2", Material.MEDIUM_AMETHYST_BUD, "&fDouble Compressed Medium Amethyst Bud",  "&f64 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_2 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_2", Material.LARGE_AMETHYST_BUD, "&fDouble Compressed Large Amethyst Bud",  "&f64 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_2 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_2", Material.AMETHYST_CLUSTER, "&fDouble Compressed Amethyst Cluster",  "&f64 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_3 = new SlimefunItemStack("JC_COBBLESTONE_3", Material.COBBLESTONE, "&fTriple Compressed Cobblestone",  "&f512 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_3 = new SlimefunItemStack("JC_STONE_3", Material.STONE, "&fTriple Compressed Stone",  "&f512 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_3 = new SlimefunItemStack("JC_ANDESITE_3", Material.ANDESITE, "&fTriple Compressed Andesite",  "&f512 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_3 = new SlimefunItemStack("JC_DIORITE_3", Material.DIORITE, "&fTriple Compressed Diorite",  "&f512 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_3 = new SlimefunItemStack("JC_GRANITE_3", Material.GRANITE, "&fTriple Compressed Granite",  "&f512 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_3 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_3", Material.COBBLED_DEEPSLATE, "&fTriple Compressed Cobbled Deepslate",  "&f512 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_3 = new SlimefunItemStack("JC_DEEPSLATE_3", Material.DEEPSLATE, "&fTriple Compressed Deepslate",  "&f512 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_3 = new SlimefunItemStack("JC_FLINT_3", Material.FLINT, "&fTriple Compressed Flint",  "&f512 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_3 = new SlimefunItemStack("JC_GRAVEL_3", Material.GRAVEL, "&fTriple Compressed Gravel",  "&f512 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_3 = new SlimefunItemStack("JC_DIRT_3", Material.DIRT, "&fTriple Compressed Dirt",  "&f512 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_3 = new SlimefunItemStack("JC_CLAY_BALL_3", Material.CLAY_BALL, "&fTriple Compressed Clay Ball",  "&f512 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_3 = new SlimefunItemStack("JC_CLAY_3", Material.CLAY, "&fTriple Compressed Clay",  "&f512 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_3 = new SlimefunItemStack("JC_SNOW_BALL_3", Material.SNOWBALL, "&fTriple Compressed Snow Ball",  "&f512 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_3 = new SlimefunItemStack("JC_SNOW_BLOCK_3", Material.SNOW_BLOCK, "&fTriple Compressed Snow Block",  "&f512 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_3 = new SlimefunItemStack("JC_COAL_3", Material.COAL, "&fTriple Compressed Coal",  "&f512 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_3 = new SlimefunItemStack("JC_COAL_BLOCK_3", Material.COAL_BLOCK, "&fTriple Compressed Coal Block",  "&f512 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_3 = new SlimefunItemStack("JC_IRON_NUGGET_3", Material.IRON_NUGGET, "&fTriple Compressed Iron Nugget",  "&f512 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_3 = new SlimefunItemStack("JC_IRON_INGOT_3", Material.IRON_INGOT, "&fTriple Compressed Iron Ingot",  "&f512 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_3 = new SlimefunItemStack("JC_IRON_BLOCK_3", Material.IRON_BLOCK, "&fTriple Compressed Iron Block",  "&f512 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_3 = new SlimefunItemStack("JC_GOLD_NUGGET_3", Material.GOLD_NUGGET, "&fTriple Compressed Gold Nugget",  "&f512 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_3 = new SlimefunItemStack("JC_GOLD_INGOT_3", Material.GOLD_INGOT, "&fTriple Compressed Gold Ingot",  "&f512 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_3 = new SlimefunItemStack("JC_GOLD_BLOCK_3", Material.GOLD_BLOCK, "&fTriple Compressed Gold Block",  "&f512 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_3 = new SlimefunItemStack("JC_REDSTONE_3", Material.REDSTONE, "&fTriple Compressed Redstone",  "&f512 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_3 = new SlimefunItemStack("JC_REDSTONE_BLOCK_3", Material.REDSTONE_BLOCK, "&fTriple Compressed Redstone Block",  "&f512 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_3 = new SlimefunItemStack("JC_LAPIS_LAZULI_3", Material.LAPIS_LAZULI, "&fTriple Compressed Lapis Lazuli",  "&f512 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_3 = new SlimefunItemStack("JC_LAPIS_BLOCK_3", Material.LAPIS_BLOCK, "&fTriple Compressed Lapis Block",  "&f512 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_3 = new SlimefunItemStack("JC_DIAMOND_3", Material.DIAMOND, "&fTriple Compressed Diamond",  "&f512 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_3 = new SlimefunItemStack("JC_DIAMOND_BLOCK_3", Material.DIAMOND_BLOCK, "&fTriple Compressed Diamond Block",  "&f512 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_3 = new SlimefunItemStack("JC_EMERALD_3", Material.EMERALD, "&fTriple Compressed Emerald",  "&f512 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_3 = new SlimefunItemStack("JC_EMERALD_BLOCK_3", Material.EMERALD_BLOCK, "&fTriple Compressed Emerald Block",  "&f512 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_3 = new SlimefunItemStack("JC_AMETHYST_SHARD_3", Material.AMETHYST_SHARD, "&fTriple Compressed Amethyst Shard",  "&f512 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_3 = new SlimefunItemStack("JC_AMETHYST_BLOCK_3", Material.AMETHYST_BLOCK, "&fTriple Compressed Amethyst Block",  "&f512 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_3 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_3", Material.SMALL_AMETHYST_BUD, "&fTriple Compressed Small Amethyst Bud",  "&f512 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_3 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_3", Material.MEDIUM_AMETHYST_BUD, "&fTriple Compressed Medium Amethyst Bud",  "&f512 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_3 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_3", Material.LARGE_AMETHYST_BUD, "&fTriple Compressed Large Amethyst Bud",  "&f512 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_3 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_3", Material.AMETHYST_CLUSTER, "&fTriple Compressed Amethyst Cluster",  "&f512 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_4 = new SlimefunItemStack("JC_COBBLESTONE_4", Material.COBBLESTONE, "&fQuadruple Compressed Cobblestone",  "&f4096 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_4 = new SlimefunItemStack("JC_STONE_4", Material.STONE, "&fQuadruple Compressed Stone",  "&f4096 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_4 = new SlimefunItemStack("JC_ANDESITE_4", Material.ANDESITE, "&fQuadruple Compressed Andesite",  "&f4096 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_4 = new SlimefunItemStack("JC_DIORITE_4", Material.DIORITE, "&fQuadruple Compressed Diorite",  "&f4096 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_4 = new SlimefunItemStack("JC_GRANITE_4", Material.GRANITE, "&fQuadruple Compressed Granite",  "&f4096 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_4 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_4", Material.COBBLED_DEEPSLATE, "&fQuadruple Compressed Cobbled Deepslate",  "&f4096 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_4 = new SlimefunItemStack("JC_DEEPSLATE_4", Material.DEEPSLATE, "&fQuadruple Compressed Deepslate",  "&f4096 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_4 = new SlimefunItemStack("JC_FLINT_4", Material.FLINT, "&fQuadruple Compressed Flint",  "&f4096 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_4 = new SlimefunItemStack("JC_GRAVEL_4", Material.GRAVEL, "&fQuadruple Compressed Gravel",  "&f4096 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_4 = new SlimefunItemStack("JC_DIRT_4", Material.DIRT, "&fQuadruple Compressed Dirt",  "&f4096 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_4 = new SlimefunItemStack("JC_CLAY_BALL_4", Material.CLAY_BALL, "&fQuadruple Compressed Clay Ball",  "&f4096 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_4 = new SlimefunItemStack("JC_CLAY_4", Material.CLAY, "&fQuadruple Compressed Clay",  "&f4096 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_4 = new SlimefunItemStack("JC_SNOW_BALL_4", Material.SNOWBALL, "&fQuadruple Compressed Snow Ball",  "&f4096 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_4 = new SlimefunItemStack("JC_SNOW_BLOCK_4", Material.SNOW_BLOCK, "&fQuadruple Compressed Snow Block",  "&f4096 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_4 = new SlimefunItemStack("JC_COAL_4", Material.COAL, "&fQuadruple Compressed Coal",  "&f4096 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_4 = new SlimefunItemStack("JC_COAL_BLOCK_4", Material.COAL_BLOCK, "&fQuadruple Compressed Coal Block",  "&f4096 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_4 = new SlimefunItemStack("JC_IRON_NUGGET_4", Material.IRON_NUGGET, "&fQuadruple Compressed Iron Nugget",  "&f4096 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_4 = new SlimefunItemStack("JC_IRON_INGOT_4", Material.IRON_INGOT, "&fQuadruple Compressed Iron Ingot",  "&f4096 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_4 = new SlimefunItemStack("JC_IRON_BLOCK_4", Material.IRON_BLOCK, "&fQuadruple Compressed Iron Block",  "&f4096 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_4 = new SlimefunItemStack("JC_GOLD_NUGGET_4", Material.GOLD_NUGGET, "&fQuadruple Compressed Gold Nugget",  "&f4096 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_4 = new SlimefunItemStack("JC_GOLD_INGOT_4", Material.GOLD_INGOT, "&fQuadruple Compressed Gold Ingot",  "&f4096 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_4 = new SlimefunItemStack("JC_GOLD_BLOCK_4", Material.GOLD_BLOCK, "&fQuadruple Compressed Gold Block",  "&f4096 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_4 = new SlimefunItemStack("JC_REDSTONE_4", Material.REDSTONE, "&fQuadruple Compressed Redstone",  "&f4096 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_4 = new SlimefunItemStack("JC_REDSTONE_BLOCK_4", Material.REDSTONE_BLOCK, "&fQuadruple Compressed Redstone Block",  "&f4096 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_4 = new SlimefunItemStack("JC_LAPIS_LAZULI_4", Material.LAPIS_LAZULI, "&fQuadruple Compressed Lapis Lazuli",  "&f4096 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_4 = new SlimefunItemStack("JC_LAPIS_BLOCK_4", Material.LAPIS_BLOCK, "&fQuadruple Compressed Lapis Block",  "&f4096 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_4 = new SlimefunItemStack("JC_DIAMOND_4", Material.DIAMOND, "&fQuadruple Compressed Diamond",  "&f4096 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_4 = new SlimefunItemStack("JC_DIAMOND_BLOCK_4", Material.DIAMOND_BLOCK, "&fQuadruple Compressed Diamond Block",  "&f4096 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_4 = new SlimefunItemStack("JC_EMERALD_4", Material.EMERALD, "&fQuadruple Compressed Emerald",  "&f4096 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_4 = new SlimefunItemStack("JC_EMERALD_BLOCK_4", Material.EMERALD_BLOCK, "&fQuadruple Compressed Emerald Block",  "&f4096 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_4 = new SlimefunItemStack("JC_AMETHYST_SHARD_4", Material.AMETHYST_SHARD, "&fQuadruple Compressed Amethyst Shard",  "&f4096 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_4 = new SlimefunItemStack("JC_AMETHYST_BLOCK_4", Material.AMETHYST_BLOCK, "&fQuadruple Compressed Amethyst Block",  "&f4096 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_4 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_4", Material.SMALL_AMETHYST_BUD, "&fQuadruple Compressed Small Amethyst Bud",  "&f4096 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_4 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_4", Material.MEDIUM_AMETHYST_BUD, "&fQuadruple Compressed Medium Amethyst Bud",  "&f4096 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_4 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_4", Material.LARGE_AMETHYST_BUD, "&fQuadruple Compressed Large Amethyst Bud",  "&f4096 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_4 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_4", Material.AMETHYST_CLUSTER, "&fQuadruple Compressed Amethyst Cluster",  "&f4096 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_5 = new SlimefunItemStack("JC_COBBLESTONE_5", Material.COBBLESTONE, "&fQuintuple Compressed Cobblestone",  "&f32768 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_5 = new SlimefunItemStack("JC_STONE_5", Material.STONE, "&fQuintuple Compressed Stone",  "&f32768 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_5 = new SlimefunItemStack("JC_ANDESITE_5", Material.ANDESITE, "&fQuintuple Compressed Andesite",  "&f32768 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_5 = new SlimefunItemStack("JC_DIORITE_5", Material.DIORITE, "&fQuintuple Compressed Diorite",  "&f32768 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_5 = new SlimefunItemStack("JC_GRANITE_5", Material.GRANITE, "&fQuintuple Compressed Granite",  "&f32768 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_5 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_5", Material.COBBLED_DEEPSLATE, "&fQuintuple Compressed Cobbled Deepslate",  "&f32768 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_5 = new SlimefunItemStack("JC_DEEPSLATE_5", Material.DEEPSLATE, "&fQuintuple Compressed Deepslate",  "&f32768 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_5 = new SlimefunItemStack("JC_FLINT_5", Material.FLINT, "&fQuintuple Compressed Flint",  "&f32768 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_5 = new SlimefunItemStack("JC_GRAVEL_5", Material.GRAVEL, "&fQuintuple Compressed Gravel",  "&f32768 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_5 = new SlimefunItemStack("JC_DIRT_5", Material.DIRT, "&fQuintuple Compressed Dirt",  "&f32768 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_5 = new SlimefunItemStack("JC_CLAY_BALL_5", Material.CLAY_BALL, "&fQuintuple Compressed Clay Ball",  "&f32768 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_5 = new SlimefunItemStack("JC_CLAY_5", Material.CLAY, "&fQuintuple Compressed Clay",  "&f32768 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_5 = new SlimefunItemStack("JC_SNOW_BALL_5", Material.SNOWBALL, "&fQuintuple Compressed Snow Ball",  "&f32768 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_5 = new SlimefunItemStack("JC_SNOW_BLOCK_5", Material.SNOW_BLOCK, "&fQuintuple Compressed Snow Block",  "&f32768 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_5 = new SlimefunItemStack("JC_COAL_5", Material.COAL, "&fQuintuple Compressed Coal",  "&f32768 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_5 = new SlimefunItemStack("JC_COAL_BLOCK_5", Material.COAL_BLOCK, "&fQuintuple Compressed Coal Block",  "&f32768 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_5 = new SlimefunItemStack("JC_IRON_NUGGET_5", Material.IRON_NUGGET, "&fQuintuple Compressed Iron Nugget",  "&f32768 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_5 = new SlimefunItemStack("JC_IRON_INGOT_5", Material.IRON_INGOT, "&fQuintuple Compressed Iron Ingot",  "&f32768 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_5 = new SlimefunItemStack("JC_IRON_BLOCK_5", Material.IRON_BLOCK, "&fQuintuple Compressed Iron Block",  "&f32768 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_5 = new SlimefunItemStack("JC_GOLD_NUGGET_5", Material.GOLD_NUGGET, "&fQuintuple Compressed Gold Nugget",  "&f32768 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_5 = new SlimefunItemStack("JC_GOLD_INGOT_5", Material.GOLD_INGOT, "&fQuintuple Compressed Gold Ingot",  "&f32768 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_5 = new SlimefunItemStack("JC_GOLD_BLOCK_5", Material.GOLD_BLOCK, "&fQuintuple Compressed Gold Block",  "&f32768 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_5 = new SlimefunItemStack("JC_REDSTONE_5", Material.REDSTONE, "&fQuintuple Compressed Redstone",  "&f32768 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_5 = new SlimefunItemStack("JC_REDSTONE_BLOCK_5", Material.REDSTONE_BLOCK, "&fQuintuple Compressed Redstone Block",  "&f32768 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_5 = new SlimefunItemStack("JC_LAPIS_LAZULI_5", Material.LAPIS_LAZULI, "&fQuintuple Compressed Lapis Lazuli",  "&f32768 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_5 = new SlimefunItemStack("JC_LAPIS_BLOCK_5", Material.LAPIS_BLOCK, "&fQuintuple Compressed Lapis Block",  "&f32768 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_5 = new SlimefunItemStack("JC_DIAMOND_5", Material.DIAMOND, "&fQuintuple Compressed Diamond",  "&f32768 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_5 = new SlimefunItemStack("JC_DIAMOND_BLOCK_5", Material.DIAMOND_BLOCK, "&fQuintuple Compressed Diamond Block",  "&f32768 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_5 = new SlimefunItemStack("JC_EMERALD_5", Material.EMERALD, "&fQuintuple Compressed Emerald",  "&f32768 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_5 = new SlimefunItemStack("JC_EMERALD_BLOCK_5", Material.EMERALD_BLOCK, "&fQuintuple Compressed Emerald Block",  "&f32768 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_5 = new SlimefunItemStack("JC_AMETHYST_SHARD_5", Material.AMETHYST_SHARD, "&fQuintuple Compressed Amethyst Shard",  "&f32768 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_5 = new SlimefunItemStack("JC_AMETHYST_BLOCK_5", Material.AMETHYST_BLOCK, "&fQuintuple Compressed Amethyst Block",  "&f32768 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_5 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_5", Material.SMALL_AMETHYST_BUD, "&fQuintuple Compressed Small Amethyst Bud",  "&f32768 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_5 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_5", Material.MEDIUM_AMETHYST_BUD, "&fQuintuple Compressed Medium Amethyst Bud",  "&f32768 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_5 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_5", Material.LARGE_AMETHYST_BUD, "&fQuintuple Compressed Large Amethyst Bud",  "&f32768 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_5 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_5", Material.AMETHYST_CLUSTER, "&fQuintuple Compressed Amethyst Cluster",  "&f32768 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_6 = new SlimefunItemStack("JC_COBBLESTONE_6", Material.COBBLESTONE, "&fSextuple Compressed Cobblestone",  "&f262144 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_6 = new SlimefunItemStack("JC_STONE_6", Material.STONE, "&fSextuple Compressed Stone",  "&f262144 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_6 = new SlimefunItemStack("JC_ANDESITE_6", Material.ANDESITE, "&fSextuple Compressed Andesite",  "&f262144 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_6 = new SlimefunItemStack("JC_DIORITE_6", Material.DIORITE, "&fSextuple Compressed Diorite",  "&f262144 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_6 = new SlimefunItemStack("JC_GRANITE_6", Material.GRANITE, "&fSextuple Compressed Granite",  "&f262144 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_6 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_6", Material.COBBLED_DEEPSLATE, "&fSextuple Compressed Cobbled Deepslate",  "&f262144 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_6 = new SlimefunItemStack("JC_DEEPSLATE_6", Material.DEEPSLATE, "&fSextuple Compressed Deepslate",  "&f262144 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_6 = new SlimefunItemStack("JC_FLINT_6", Material.FLINT, "&fSextuple Compressed Flint",  "&f262144 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_6 = new SlimefunItemStack("JC_GRAVEL_6", Material.GRAVEL, "&fSextuple Compressed Gravel",  "&f262144 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_6 = new SlimefunItemStack("JC_DIRT_6", Material.DIRT, "&fSextuple Compressed Dirt",  "&f262144 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_6 = new SlimefunItemStack("JC_CLAY_BALL_6", Material.CLAY_BALL, "&fSextuple Compressed Clay Ball",  "&f262144 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_6 = new SlimefunItemStack("JC_CLAY_6", Material.CLAY, "&fSextuple Compressed Clay",  "&f262144 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_6 = new SlimefunItemStack("JC_SNOW_BALL_6", Material.SNOWBALL, "&fSextuple Compressed Snow Ball",  "&f262144 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_6 = new SlimefunItemStack("JC_SNOW_BLOCK_6", Material.SNOW_BLOCK, "&fSextuple Compressed Snow Block",  "&f262144 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_6 = new SlimefunItemStack("JC_COAL_6", Material.COAL, "&fSextuple Compressed Coal",  "&f262144 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_6 = new SlimefunItemStack("JC_COAL_BLOCK_6", Material.COAL_BLOCK, "&fSextuple Compressed Coal Block",  "&f262144 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_6 = new SlimefunItemStack("JC_IRON_NUGGET_6", Material.IRON_NUGGET, "&fSextuple Compressed Iron Nugget",  "&f262144 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_6 = new SlimefunItemStack("JC_IRON_INGOT_6", Material.IRON_INGOT, "&fSextuple Compressed Iron Ingot",  "&f262144 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_6 = new SlimefunItemStack("JC_IRON_BLOCK_6", Material.IRON_BLOCK, "&fSextuple Compressed Iron Block",  "&f262144 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_6 = new SlimefunItemStack("JC_GOLD_NUGGET_6", Material.GOLD_NUGGET, "&fSextuple Compressed Gold Nugget",  "&f262144 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_6 = new SlimefunItemStack("JC_GOLD_INGOT_6", Material.GOLD_INGOT, "&fSextuple Compressed Gold Ingot",  "&f262144 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_6 = new SlimefunItemStack("JC_GOLD_BLOCK_6", Material.GOLD_BLOCK, "&fSextuple Compressed Gold Block",  "&f262144 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_6 = new SlimefunItemStack("JC_REDSTONE_6", Material.REDSTONE, "&fSextuple Compressed Redstone",  "&f262144 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_6 = new SlimefunItemStack("JC_REDSTONE_BLOCK_6", Material.REDSTONE_BLOCK, "&fSextuple Compressed Redstone Block",  "&f262144 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_6 = new SlimefunItemStack("JC_LAPIS_LAZULI_6", Material.LAPIS_LAZULI, "&fSextuple Compressed Lapis Lazuli",  "&f262144 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_6 = new SlimefunItemStack("JC_LAPIS_BLOCK_6", Material.LAPIS_BLOCK, "&fSextuple Compressed Lapis Block",  "&f262144 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_6 = new SlimefunItemStack("JC_DIAMOND_6", Material.DIAMOND, "&fSextuple Compressed Diamond",  "&f262144 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_6 = new SlimefunItemStack("JC_DIAMOND_BLOCK_6", Material.DIAMOND_BLOCK, "&fSextuple Compressed Diamond Block",  "&f262144 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_6 = new SlimefunItemStack("JC_EMERALD_6", Material.EMERALD, "&fSextuple Compressed Emerald",  "&f262144 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_6 = new SlimefunItemStack("JC_EMERALD_BLOCK_6", Material.EMERALD_BLOCK, "&fSextuple Compressed Emerald Block",  "&f262144 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_6 = new SlimefunItemStack("JC_AMETHYST_SHARD_6", Material.AMETHYST_SHARD, "&fSextuple Compressed Amethyst Shard",  "&f262144 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_6 = new SlimefunItemStack("JC_AMETHYST_BLOCK_6", Material.AMETHYST_BLOCK, "&fSextuple Compressed Amethyst Block",  "&f262144 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_6 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_6", Material.SMALL_AMETHYST_BUD, "&fSextuple Compressed Small Amethyst Bud",  "&f262144 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_6 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_6", Material.MEDIUM_AMETHYST_BUD, "&fSextuple Compressed Medium Amethyst Bud",  "&f262144 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_6 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_6", Material.LARGE_AMETHYST_BUD, "&fSextuple Compressed Large Amethyst Bud",  "&f262144 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_6 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_6", Material.AMETHYST_CLUSTER, "&fSextuple Compressed Amethyst Cluster",  "&f262144 Amethyst Cluster", "&fCompressionCraft");

    //Item Groups
    public static final NestedItemGroup JC_CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_GENERAL"), new CustomItemStack(Material.PISTON, "&bCompressionCraft"));
    public static final SubItemGroup JC_CC_ITEM_COMPRESSION = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_ITEM_COMPRESSION"), JC_CC_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressed Items"));
    public static final SubItemGroup JC_CC_MACHINES = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_MACHINES"), JC_CC_GENERAL, new CustomItemStack(Material.FURNACE, "&bMachines"));
    public static final ItemGroup JC_CC_DISABLED = new HiddenItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_DISABLED"), new CustomItemStack(Material.BARRIER, "&4Disabled Items"));

    public static final ItemGroup CompressionCraftGeneral = new ItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CompressionCraft"),
            new CustomItemStack(Material.PISTON, "&bCompressionCraft"));
   /*
   Credit and the source for the hidden item group goes to https://github.com/Sefiraat/Networks/blob/master/src/main/java/io/github/sefiraat/networks/slimefun/NetworksItemGroups.java
    */
    public static class HiddenItemGroup extends ItemGroup {

        public HiddenItemGroup(NamespacedKey key, ItemStack item) {
            super(key, item);
        }

        @Override
        public boolean isHidden(@Nonnull Player p) {
            return true;
        }
    }
}
