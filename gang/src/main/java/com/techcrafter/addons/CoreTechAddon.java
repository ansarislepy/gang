package com.techcrafter.addons;

import com.techcrafter.TechCrafter;
import com.techcrafter.machines.Grinder;

public class CoreTechAddon {

    private TechCrafter plugin;

    public CoreTechAddon(TechCrafter plugin) {
        this.plugin = plugin;
    }

    public void enable() {
        plugin.getLogger().info("CoreTechAddon enabled.");
        Grinder.register(plugin);
    }

    public void disable() {
        plugin.getLogger().info("CoreTechAddon disabled.");
    }
}
