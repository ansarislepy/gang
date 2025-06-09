package com.techcrafter.machines;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.Material;

public class Grinder {

    public static void register(JavaPlugin plugin) {
        plugin.getLogger().info("Grinder machine registered.");
        // Register listeners or commands if needed
    }

    public static boolean isGrinder(Block block) {
        return block.getType() == Material.FURNACE; // simple example
    }
}
