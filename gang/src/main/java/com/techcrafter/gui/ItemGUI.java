package com.techcrafter.gui;

import com.techcrafter.items.CustomItem;
import com.techcrafter.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemGUI implements Listener {
    private static final String GUI_TITLE = "§bآیتم‌های TechCrafter";

    public static void openGUI(Player player) {
        Inventory gui = Bukkit.createInventory(null, 27, GUI_TITLE);
        for (CustomItem item : ItemManager.getAllItems()) {
            gui.addItem(item.createItem());
        }
        player.openInventory(gui);
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (!e.getView().getTitle().equals(GUI_TITLE)) return;
        e.setCancelled(true);
        if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) return;
        Player player = (Player) e.getWhoClicked();
        player.getInventory().addItem(e.getCurrentItem());
        player.sendMessage("§aآیتم دریافت شد!");
    }
}
