package com.techcrafter.menu;

import com.techcrafter.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemMenu {

    public static void openItemMenu(Player player) {
        Inventory inv = Bukkit.createInventory(null, 9, "Items Menu");

        int i = 0;
        // استفاده مستقیم از لیست آیتم‌ها
        for (ItemStack item : ItemManager.items) {
            inv.setItem(i++, item);
        }

        player.openInventory(inv);
    }
}
