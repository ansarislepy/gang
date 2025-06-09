package com.techcrafter.listeners;

import com.techcrafter.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {

    public void openMenu(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "§6TechCrafter Menu");
        int i = 0;
        for (ItemStack item : ItemManager.items.values()) {
            if (i >= inv.getSize()) break;
            inv.setItem(i, item);
            i++;
        }
        player.openInventory(inv);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (!e.getView().getTitle().equals("§6TechCrafter Menu")) return;

        e.setCancelled(true);

        Player player = (Player) e.getWhoClicked();
        ItemStack clicked = e.getCurrentItem();
        if (clicked == null || clicked.getType().isAir()) return;

        player.sendMessage("§aشما آیتم " + clicked.getItemMeta().getDisplayName() + " را انتخاب کردید.");
        // اگر خواستی می‌تونی اینجا کد ساخت فوری آیتم با دادن مواد یا هر منطق دیگه بذاری
    }
}
