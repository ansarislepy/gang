package com.techcrafter.commands;

import com.techcrafter.Main;
import com.techcrafter.listeners.MenuListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TechCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("این دستور فقط برای بازیکنان است.");
            return true;
        }

        Player player = (Player) sender;

        // استفاده از منوی Listener
        MenuListener menuListener = Main.getInstance().getMenuListener();

        if (menuListener != null) {
            menuListener.openMenu(player);
        } else {
            player.sendMessage("خطا: منو بارگذاری نشده است.");
        }

        return true;
    }
}
