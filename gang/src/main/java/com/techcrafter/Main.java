package com.techcrafter;

import com.techcrafter.commands.TechCommand;
import com.techcrafter.listeners.MenuListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    private MenuListener menuListener;

    @Override
    public void onEnable() {
        instance = this;

        // نمونه‌سازی و ثبت لیسنرها
        menuListener = new MenuListener();
        getServer().getPluginManager().registerEvents(menuListener, this);

        // ثبت دستور (Command)
        getCommand("tech").setExecutor(new TechCommand());

        // ثبت دستور و دیگر کدهای onEnable
    }

    public static Main getInstance() {
        return instance;
    }

    public MenuListener getMenuListener() {
        return menuListener;
    }
}
