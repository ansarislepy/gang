package com.techcrafter.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemManager {

    // لیست آیتم‌ها
    public static List<ItemStack> items = new ArrayList<>();

    // نقشه برای دسترسی سریع با نام آیتم
    private static Map<String, ItemStack> itemMap = new HashMap<>();

    // مقداردهی اولیه آیتم‌ها
    public static void init() {
        items.clear();
        itemMap.clear();

        addItem("Copper Wire", Material.STRING);
        addItem("Small Motor", Material.IRON_INGOT);
        addItem("Advanced Battery", Material.BLAZE_POWDER);
        addItem("Advanced Energy Core", Material.COAL);
        addItem("Super Generator", Material.DISPENSER);
        addItem("Lightning Battery", Material.LIGHTNING_ROD);
        addItem("Supreme Core", Material.NETHERITE_INGOT);
        addItem("God Module", Material.DRAGON_EGG);
        addItem("Transcendent Alloy", Material.NETHERITE_INGOT);

        // اگر آیتم دیگه‌ای داری اینجا اضافه کن
    }

    // متد کمکی برای ایجاد آیتم و اضافه کردن به لیست و نقشه
    private static void addItem(String name, Material material) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            item.setItemMeta(meta);
        }
        items.add(item);
        itemMap.put(name, item);
    }

    // دریافت لیست کامل آیتم‌ها
    public static List<ItemStack> getAllItems() {
        return items;
    }

    // دریافت آیتم با نام
    public static ItemStack getItemByName(String name) {
        return itemMap.get(name);
    }
}
