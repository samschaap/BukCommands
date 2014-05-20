/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.sheepcraft.bukcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author samschaap
 */
public class TimeCommandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("time")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, Console can't set the time... :(");
            } else {
                Player player = (Player) cs;
                if (strings.length == 0) {
                    player.sendMessage(ChatColor.RED + "Use: /time <day/night>");
                } else if (strings.length > 1) {
                    player.sendMessage(ChatColor.RED + "Use: /time <day/night>");
                } else if (strings.length == 1) {
                    if (strings[0].equalsIgnoreCase("day")) {
                        player.getWorld().setTime(0);
                        player.sendMessage(ChatColor.GREEN + "Time set to day in world " + player.getWorld().getName());
                    } else if (strings[0].equalsIgnoreCase("night")) {
                        player.getWorld().setTime(16000);
                        player.sendMessage(ChatColor.GREEN + "Time set to night in world " + player.getWorld().getName());
                    }
                }
            }

        }
        return true;
    }
}
