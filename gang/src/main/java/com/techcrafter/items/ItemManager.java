package com.techcrafter.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ItemManager {

    private static Map<String, CustomItem> items = new HashMap<>();

    public static void init() {
        items.put("Copper Wire", createItem("سیم مسی", Material.STRING));
        items.put("Small Motor", createItem("موتور کوچک", Material.PISTON));
        items.put("Advanced Battery", createItem("باتری پیشرفته", Material.REDSTONE_BLOCK));

        items.put("Advanced Energy Core", createItem("هسته انرژی پیشرفته", Material.BLAZE_ROD));
        items.put("Super Generator", createItem("سوپر ژنراتور", Material.DISPENSER));
        items.put("Lightning Battery", createItem("باتری لایتنینگ", Material.LIGHTNING_ROD));

        items.put("Supreme Core", createItem("Supreme Core", Material.NETHER_STAR));
        items.put("God Module", createItem("God Module", Material.DRAGON_EGG));
        items.put("Transcendent Alloy", createItem("Transcendent Alloy", Material.NETHERITE_INGOT));
    }

    private static CustomItem createItem(String name, Material material) {
        ItemStack itemStack = new ItemStack(material);
        // می‌تونی اینجا متا رو هم تنظیم کنی مثل نام فارسی
        return new CustomItem(name, itemStack);
    }

    public static Collection<CustomItem> getAllItems() {
        return items.values();
    }
}
