package com.techcrafter;

import org.bukkit.plugin.java.JavaPlugin;

public class TechCrafter extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("TechCrafter plugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("TechCrafter plugin has been disabled.");
    }
}

