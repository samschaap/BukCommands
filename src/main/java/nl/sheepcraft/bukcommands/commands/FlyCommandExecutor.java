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
public class FlyCommandExecutor implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("fly")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, I can't set fly for Console... :(");
            } else {
                Player player = (Player) cs;
                if (player.getAllowFlight() == false) {
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.GREEN + "Fly enabled.");
                } else {
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.GREEN + "Fly disabled.");
                }
            }
        }
        return true;
    }
    
}
