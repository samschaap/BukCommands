/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.sheepcraft.bukcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author samschaap
 */
public class SetspawnCommandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if(cmnd.getName().equalsIgnoreCase("setspawn")) {
            if(!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, I can't set spawn for Console... :(");
            } else {
                Player player = (Player) cs;
                Location spawnloc = player.getLocation();
                World spawnworld = player.getWorld();
                spawnworld.setSpawnLocation(spawnloc.getBlockX(), spawnloc.getBlockY(), spawnloc.getBlockZ());
                player.sendMessage(ChatColor.GREEN + "Spawn location set to " + spawnloc.toString() + " in " + spawnworld.getName());
            }
        }
        return true;
    }
    
}
