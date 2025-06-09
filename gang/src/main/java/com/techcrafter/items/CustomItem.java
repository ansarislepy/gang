package com.techcrafter.items;

import org.bukkit.inventory.ItemStack;

public class CustomItem {

    private String name;
    private ItemStack itemStack;

    public CustomItem(String name, ItemStack itemStack) {
        this.name = name;
        this.itemStack = itemStack;
    }

    public String getName() {
        return name;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
