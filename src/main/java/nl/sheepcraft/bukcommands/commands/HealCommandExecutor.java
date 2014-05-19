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
public class HealCommandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("heal")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, I can't heal Console... :(");
            } else {
                Player player = (Player) cs;
                if (strings.length == 0) {
                    player.setHealth(20.0);
                    player.setFoodLevel(20);
                    player.sendMessage(ChatColor.GREEN + "You have been healed.");
                } else if (strings.length == 1) {
                    Player healed = (Player) Bukkit.getPlayer(strings[0]);
                    if (healed == null) {
                        player.sendMessage(ChatColor.RED + "That player isn't online!");
                    } else {
                        player.sendMessage(ChatColor.GREEN + "Healed " + healed.getName());
                        healed.setHealth(20.0);
                        healed.setFoodLevel(20);
                        healed.sendMessage(ChatColor.GREEN + "You have been healed.");
                    }
                }
            }
        }
        return true;
    }

}
