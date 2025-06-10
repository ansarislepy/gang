package com.techcrafter.gui;

import com.techcrafter.items.CustomItem;
import com.techcrafter.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemGUI {

    public static void openItemMenu(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "§6آیتم‌های TechCrafter");

        int i = 0;
        for (ItemStack item : ItemManager.getAllItems()) {
            inv.setItem(i++, item);
        }

        player.openInventory(inv);
    }
}
