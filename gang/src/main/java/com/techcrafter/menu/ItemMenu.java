package com.techcrafter.menus;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import java.util.Map;
import com.techcrafter.items.ItemManager;

public class ItemMenu {

    public static void openItemMenu(Player player, String category) {
        Map<String, ItemStack> allItems = ItemManager.items;
        Inventory inv = Bukkit.createInventory(null, 27, "§6آیتم‌های " + category);

        int i = 0;
        for (Map.Entry<String, ItemStack> entry : allItems.entrySet()) {
            // اینجا می‌تونی دسته‌بندی رو چک کنی
