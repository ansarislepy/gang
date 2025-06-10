package com.techcrafter.listeners;

import com.techcrafter.items.ItemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("Your Menu Title")) {
            event.setCancelled(true);

            // دسترسی به آیتم‌ها بدون استفاده از values()
            for (ItemStack item : ItemManager.items) {
                // کاری با آیتم‌ها انجام بده
            }
        }
    }
}
