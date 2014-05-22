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
public class PlayerinfoCommandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("playerinfo")) {
            if (strings.length == 1) {
                Player info = (Player) Bukkit.getPlayer(strings[0]);
                cs.sendMessage(ChatColor.GREEN + "===== " + ChatColor.DARK_GREEN + "Player Info" + ChatColor.GREEN + " =====");
                cs.sendMessage(ChatColor.DARK_GREEN + "Player: " + ChatColor.GREEN + info.getName());
                cs.sendMessage(ChatColor.DARK_GREEN + "IP: " + ChatColor.GREEN + info.getAddress().toString());
                cs.sendMessage(ChatColor.DARK_GREEN + "OP: " + ChatColor.GREEN + info.isOp());
                cs.sendMessage(ChatColor.DARK_GREEN + "Gamemode: " + ChatColor.GREEN + info.getGameMode().name());
            } else {
                cs.sendMessage(ChatColor.RED + "Use: /playerinfo <player>");
            }
        }
        return true;
    }

}
