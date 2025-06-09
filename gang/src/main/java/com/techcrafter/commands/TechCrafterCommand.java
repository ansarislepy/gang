package com.techcrafter.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TechCrafterCommand implements CommandExecutor {

    private final TechCommand techCommand = new TechCommand();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return techCommand.onCommand(sender, command, label, args);
    }
}
