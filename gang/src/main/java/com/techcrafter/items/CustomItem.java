package com.techcrafter.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItem extends ItemStack {

    public CustomItem(Material material, String displayName) {
        super(material);
        ItemMeta meta = this.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(displayName);
            this.setItemMeta(meta);
        }
    }

    // اگر نیاز به متدهای بیشتری دارید، اینجا اضافه کنید
}
