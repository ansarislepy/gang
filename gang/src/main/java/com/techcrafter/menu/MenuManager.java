package com.techcrafter.menus;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.HashMap;
import java.util.Map;

public class MenuManager {

    private static Map<String, ItemStack> categories = new HashMap<>();

    public static void init(JavaPlugin plugin) {
        // تعریف دسته‌بندی‌ها
        categories.put("برق", createMenuItem(Material.REDSTONE, "§eبرق"));
        categories.put("Power", createMenuItem(Material.BLAZE_POWDER, "§6Power"));
        categories.put("Crafting Tables", createMenuItem(Material.CRAFTING_TABLE, "§bCrafting Tables"));
        categories.put("Supreme++", createMenuItem(Material.NETHER_STAR, "§dSupreme++"));
        categories.put("Farm Builds", createMenuItem(Material.WHEAT, "§aFarm Builds"));
        categories.put("Power Connectors", createMenuItem(Material.REDSTONE_TORCH, "§cPower Connectors"));
        categories.put("Storage Systems", createMenuItem(Material.CHEST, "§9Storage Systems"));
        // بقیه دسته‌ها را اینجا اضافه کن
    }

    public static void openCategoryMenu(Player player) {
        Inventory inv = Bukkit.createInventory(null, 9, "§6دسته‌بندی‌های TechCrafter");

        int i = 0;
        for (ItemStack item : categories.values()) {
            inv.setItem(i++, item);
        }

        player.openInventory(inv);
    }

    private static ItemStack createMenuItem(Material mat, String name) {
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            item.setItemMeta(meta);
        }
        return item;
    }
}
