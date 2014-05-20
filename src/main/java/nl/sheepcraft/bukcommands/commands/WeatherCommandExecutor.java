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
public class WeatherCommandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("weather")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, Console can't set weather... :(");
            } else {
                Player player = (Player) cs;
                if (strings.length == 0) {
                    player.sendMessage(ChatColor.RED + "Use: /weather <sun/storm>");
                } else if (strings.length > 1) {
                    player.sendMessage(ChatColor.RED + "Use: /weather <sun/storm>");
                } else if (strings.length == 1) {
                    if (strings[0].equalsIgnoreCase("sun")) {
                        player.getWorld().setStorm(false);
                        player.getWorld().setThundering(false);
                        player.sendMessage(ChatColor.GREEN + "Weather set to sun in world " + player.getWorld().getName());
                    } else if (strings[0].equalsIgnoreCase("storm")) {
                        player.getWorld().setStorm(true);
                        player.getWorld().setThundering(true);
                        player.sendMessage(ChatColor.GREEN + "Weather set to storm in world " + player.getWorld().getName());

                    }
                }
            }
        }
        return true;
    }

}
