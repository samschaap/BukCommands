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
public class FakedeopCommandExecutor implements CommandExecutor {
    
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("fakedeop")) {
            Player player = (Player) cs;
            if (strings.length == 0) {
                player.sendMessage(ChatColor.RED + "Use: /fakedeop <player>");
            } else if (strings.length > 1) {
                player.sendMessage(ChatColor.RED + "Use: /fakedeop <player>");
            } else if (strings.length == 1) {
                Player fakedeopped = (Player) Bukkit.getPlayer(strings[0]);
                if (fakedeopped == null) {
                    player.sendMessage(ChatColor.RED + "That player isn't online!");
                } else {
                    player.sendMessage(ChatColor.GREEN + "Fake-deopped " + fakedeopped.getName());
                    fakedeopped.sendMessage(ChatColor.YELLOW + "You are no longer op!");
                }
            }
        }
        return true;
    }
    
}
