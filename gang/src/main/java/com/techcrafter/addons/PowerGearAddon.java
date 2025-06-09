package com.techcrafter.addons;

import com.techcrafter.TechCrafter;
import com.techcrafter.items.QuantumArmor;

public class PowerGearAddon {

    private TechCrafter plugin;

    public PowerGearAddon(TechCrafter plugin) {
        this.plugin = plugin;
    }

    public void enable() {
        plugin.getLogger().info("PowerGearAddon enabled.");
        QuantumArmor.register(plugin);
    }

    public void disable() {
        plugin.getLogger().info("PowerGearAddon disabled.");
    }
}
