package com.techcrafter.menu;

import com.techcrafter.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemMenu implements Listener {

    private final Inventory inv;

    public ItemMenu() {
        inv = Bukkit.createInventory(null, 27, "§6منوی ساخت ایتم‌ها");
        initializeItems();
    }

    private void initializeItems() {
        int slot = 0;
        for (ItemStack item : ItemManager.items.values()) {
            if (slot >= inv.getSize()) break;
            inv.setItem(slot++, item);
        }
    }

    public void open(Player player) {
        player.openInventory(inv);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals("§6منوی ساخت ایتم‌ها")) return;
        event.setCancelled(true);

        if (event.getCurrentItem() == null) return;
        if (!event.getCurrentItem().hasItemMeta()) return;

        Player player = (Player) event.getWhoClicked();

        player.getInventory().addItem(event.getCurrentItem());
        player.sendMessage("§aشما آیتم " + event.getCurrentItem().getItemMeta().getDisplayName() + " را دریافت کردید.");
        player.closeInventory();
    }
}
