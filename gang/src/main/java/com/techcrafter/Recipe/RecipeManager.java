package com.techcrafter.recipes;

import com.techcrafter.Main;
import com.techcrafter.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class RecipeManager {

    public static void registerRecipes() {
        registerCopperWire();
        registerSmallMotor();
        registerAdvancedBattery();

        registerAdvancedEnergyCore();
        registerSuperGenerator();
        registerLightningBattery();

        registerSupremeCore();
        registerGodModule();
        registerTranscendentAlloy();
    }

    private static void registerCopperWire() {
        ItemStack item = ItemManager.items.get("Copper Wire");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "copper_wire");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("SSS", "   ", "   ");
        recipe.setIngredient('S', Material.STRING);
        Bukkit.addRecipe(recipe);
    }

    private static void registerSmallMotor() {
        ItemStack item = ItemManager.items.get("Small Motor");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "small_motor");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("IPI", "PRP", "IPI");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('P', Material.PISTON);
        recipe.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(recipe);
    }

    private static void registerAdvancedBattery() {
        ItemStack item = ItemManager.items.get("Advanced Battery");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "advanced_battery");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("RRR", "RBR", "RRR");
        recipe.setIngredient('R', Material.REDSTONE);
        recipe.setIngredient('B', Material.BLAZE_POWDER);
        Bukkit.addRecipe(recipe);
    }

    private static void registerAdvancedEnergyCore() {
        ItemStack item = ItemManager.items.get("Advanced Energy Core");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "advanced_energy_core");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(" B ", "BCB", " B ");
        recipe.setIngredient('B', Material.BLAZE_POWDER);
        recipe.setIngredient('C', Material.COAL);
        Bukkit.addRecipe(recipe);
    }

    private static void registerSuperGenerator() {
        ItemStack item = ItemManager.items.get("Super Generator");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "super_generator");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("G G", " G ", "GGG");
        recipe.setIngredient('G', Material.DISPENSER);
        Bukkit.addRecipe(recipe);
    }

    private static void registerLightningBattery() {
        ItemStack item = ItemManager.items.get("Lightning Battery");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "lightning_battery");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("LLL", "LBL", "LLL");
        recipe.setIngredient('L', Material.LIGHTNING_ROD);
        recipe.setIngredient('B', Material.BLAZE_POWDER);
        Bukkit.addRecipe(recipe);
    }

    private static void registerSupremeCore() {
        ItemStack item = ItemManager.items.get("Supreme Core");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "supreme_core");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("NSN", "SDS", "NSN");
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('S', Material.NETHER_STAR);
        recipe.setIngredient('D', Material.DRAGON_EGG);
        Bukkit.addRecipe(recipe);
    }

    private static void registerGodModule() {
        ItemStack item = ItemManager.items.get("God Module");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "god_module");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("DDD", "DGD", "DDD");
        recipe.setIngredient('D', Material.DRAGON_EGG);
        recipe.setIngredient('G', Material.GHAST_TEAR);
        Bukkit.addRecipe(recipe);
    }

    private static void registerTranscendentAlloy() {
        ItemStack item = ItemManager.items.get("Transcendent Alloy");
        NamespacedKey key = new NamespacedKey(Main.getInstance(), "transcendent_alloy");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("NNN", "NIN", "NNN");
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('I', Material.IRON_INGOT);
        Bukkit.addRecipe(recipe);
    }
}
