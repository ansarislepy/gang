package com.techcrafter.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TechCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("این دستور فقط برای بازیکنان در دسترس است.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("§a[TechCrafter] §fدستور وارد شده ناقص است. از /tech help استفاده کن.");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "help":
                player.sendMessage("§a[TechCrafter] §fدستورات موجود:");
                player.sendMessage("§e/tech help §7- نمایش راهنما");
                player.sendMessage("§e/tech info §7- نمایش اطلاعاتی از پلاگین");
                break;
            case "info":
                player.sendMessage("§aTechCrafter §fنسخه 1.0 - ساخته شده توسط شما :)");
                break;
            default:
                player.sendMessage("§cدستور ناشناخته است. از /tech help استفاده کن.");
                break;
        }

        return true;
    }
}
