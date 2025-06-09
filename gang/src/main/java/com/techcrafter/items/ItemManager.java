package com.techcrafter.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class ItemManager {

    public static Map<String, ItemStack> items = new HashMap<>();

    public static void init() {
        // بخش برق
        items.put("Copper Wire", createItem(Material.STRING, "§6سیم مسی"));
        items.put("Small Motor", createItem(Material.PISTON, "§aموتور کوچک"));
        items.put("Advanced Battery", createItem(Material.REDSTONE_BLOCK, "§cباتری پیشرفته"));

        // بخش Power
        items.put("Advanced Energy Core", createItem(Material.BLAZE_ROD, "§eهسته انرژی پیشرفته"));
        items.put("Super Generator", createItem(Material.DISPENSER, "§bسوپر ژنراتور"));
        items.put("Lightning Battery", createItem(Material.LIGHTNING_ROD, "§9باتری لایتنینگ"));

        // بخش Supreme++
        items.put("Supreme Core", createItem(Material.NETHER_STAR, "§dSupreme Core"));
        items.put("God Module", createItem(Material.DRAGON_EGG, "§5God Module"));
        items.put("Transcendent Alloy", createItem(Material.NETHERITE_INGOT, "§8Transcendent Alloy"));
    }

    private static ItemStack createItem(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            item.setItemMeta(meta);
        }
        return item;
    }
}
