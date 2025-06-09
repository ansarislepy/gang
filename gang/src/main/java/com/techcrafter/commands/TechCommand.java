package com.techcrafter.commands;

import com.techcrafter.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TechCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cفقط بازیکنان می‌توانند این دستور را اجرا کنند.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("§a[TechCrafter] §fبرای باز کردن منو از /tech open استفاده کنید.");
            return true;
        }

        if (args[0].equalsIgnoreCase("open")) {
            Main.getInstance().getMenuListener().openMenu(player);
            return true;
        }

        player.sendMessage("§cدستور نامعتبر است.");
        return true;
    }
}
