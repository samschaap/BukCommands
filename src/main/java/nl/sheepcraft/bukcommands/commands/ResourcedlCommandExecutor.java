/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.sheepcraft.bukcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author samschaap
 */
public class ResourcedlCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("resourcedl")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "Sorry, I can't download a resourcepack for Console... :(");
            } else {
                if (args == null) {
                    Player player = (Player) sender;
                    player.sendMessage(ChatColor.RED + "Please follow this command by an URL.");
                } else {
                    Player player = (Player) sender;
                    player.setResourcePack(args[0].toString());
                    player.sendMessage(ChatColor.GREEN + "Resourcepack from URL " + args[0] + " downloading. Make sure you have enabled resource pack downloads in your options!");
                    Bukkit.getLogger().info(player.getName() + " downloaded resourcepack from URL " + args[0]);
                }
            }
        }
        return true;
    }

}
