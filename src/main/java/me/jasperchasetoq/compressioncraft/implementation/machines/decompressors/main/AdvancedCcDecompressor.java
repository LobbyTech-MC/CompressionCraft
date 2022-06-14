package me.jasperchasetoq.compressioncraft.implementation.machines.decompressors.main;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.compressioncraft.CompressionCraftItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class AdvancedCcDecompressor extends AContainer implements RecipeDisplayItem {


    public AdvancedCcDecompressor(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        addItemHandler(onBreak());
    }
    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COBBLESTONE_1, 1)}, new ItemStack[] {new ItemStack(Material.COBBLESTONE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_STONE_1, 1)}, new ItemStack[] {new ItemStack(Material.STONE, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_FLINT_1, 1)}, new ItemStack[] {new ItemStack(Material.FLINT, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GRAVEL_1, 1)}, new ItemStack[] {new ItemStack(Material.GRAVEL, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_CLAY_1, 1)}, new ItemStack[] {new ItemStack(Material.CLAY, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_COAL_1, 1)}, new ItemStack[] {new ItemStack(Material.COAL, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_IRON_NUGGET_1, 1)}, new ItemStack[] {new ItemStack(Material.IRON_NUGGET, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_IRON_INGOT_1, 1)}, new ItemStack[] {new ItemStack(Material.IRON_INGOT, 8)});
        registerRecipe(4, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GOLD_NUGGET_1, 1)}, new ItemStack[] {new ItemStack(Material.GOLD_NUGGET, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_GOLD_INGOT_1, 1)}, new ItemStack[] {new ItemStack(Material.GOLD_INGOT, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_REDSTONE_1, 1)}, new ItemStack[] {new ItemStack(Material.REDSTONE, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_LAPIS_LAZULI_1, 1)}, new ItemStack[] {new ItemStack(Material.LAPIS_LAZULI, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_DIAMOND_1, 1)}, new ItemStack[] {new ItemStack(Material.DIAMOND, 8)});
        registerRecipe(8, new SlimefunItemStack[]{new SlimefunItemStack(CompressionCraftItems.CC_EMERALD_1, 1)}, new ItemStack[] {new ItemStack(Material.EMERALD, 8)});

    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(SlimefunItems.ELECTRIC_PRESS);
    }
    @Override
    public String getInventoryTitle() {return "&6Advanced CC Decompressor";}
    @Override
    public String getMachineIdentifier() {
        return "CC_DECOMPRESSOR_5";
    }
    @Override
    public int getCapacity() {
        return 1250;
    }
    @Override
    public int getEnergyConsumption() {
        return 125;
    }
    @Override public int getSpeed() {return 5;}

    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }

}
