package com.techcrafter;

import com.techcrafter.items.ItemManager;
import com.techcrafter.listeners.MenuListener;
import com.techcrafter.recipes.RecipeManager;
import com.techcrafter.commands.TechCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    private MenuListener menuListener;

    @Override
    public void onEnable() {
        instance = this;
        ItemManager.init();
        RecipeManager.registerRecipes();

        menuListener = new MenuListener();
        getServer().getPluginManager().registerEvents(menuListener, this);

        this.getCommand("tech").setExecutor(new TechCommand());
    }

    public static Main getInstance() {
        return instance;
    }

    public MenuListener getMenuListener() {
        return menuListener;
    }
}
