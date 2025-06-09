package com.techcrafter.recipes;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import com.techcrafter.items.ItemManager;

public class RecipeManager {

    public static void init(JavaPlugin plugin) {
        // مثال دستور ساخت برای Supreme Core
        ItemStack supremeCore = ItemManager.items.get("Supreme Core");
        if (supremeCore == null) return;

        NamespacedKey key = new NamespacedKey(plugin, "supreme_core");
        ShapedRecipe recipe = new ShapedRecipe(key, supremeCore);

        recipe.shape("NNN", "NEN", "NNN");
        recipe.setIngredient('N', Material.NETHERITE_INGOT);
        recipe.setIngredient('E', Material.ENDER_EYE);

        Bukkit.addRecipe(recipe);

        // بقیه دستور ساخت‌ها را اینجا اضافه کن
    }
}
