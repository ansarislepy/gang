package com.techcrafter.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class QuantumArmor {

    public static void register(JavaPlugin plugin) {
        plugin.getLogger().info("QuantumArmor items registered.");
        // Register recipes or events here
    }

    public static ItemStack createHelmet() {
        ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET);
        ItemMeta meta = helmet.getItemMeta();
        meta.setDisplayName("§bQuantum Helmet");
        meta.setLore(List.of("§7Flight", "§7Auto-Heal", "§7Energy Powered"));
        helmet.setItemMeta(meta);
        return helmet;
    }
}
