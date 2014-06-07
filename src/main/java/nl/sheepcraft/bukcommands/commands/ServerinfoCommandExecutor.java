/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.sheepcraft.bukcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author samschaap
 */
public class ServerinfoCommandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("serverinfo")) {
            Server server = Bukkit.getServer();
            cs.sendMessage(ChatColor.GREEN + "===== " + ChatColor.DARK_GREEN + "Server Info" + ChatColor.GREEN + " =====");
            cs.sendMessage(ChatColor.DARK_GREEN + "Version: " + ChatColor.GREEN + server.getBukkitVersion());
            cs.sendMessage(ChatColor.DARK_GREEN + "Server ID: " + ChatColor.GREEN + server.getServerId());
            cs.sendMessage(ChatColor.DARK_GREEN + "Server Name: " + ChatColor.GREEN + server.getServerName());
            cs.sendMessage(ChatColor.DARK_GREEN + "IP: " + ChatColor.GREEN + server.getIp());
            cs.sendMessage(ChatColor.DARK_GREEN + "MOTD: " + ChatColor.GREEN + server.getMotd());
        }
        return true;
    }

}
