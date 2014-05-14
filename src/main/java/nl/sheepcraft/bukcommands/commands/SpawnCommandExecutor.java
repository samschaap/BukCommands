/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.sheepcraft.bukcommands.commands;

import org.bukkit.Bukkit;
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
public class SpawnCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("spawn")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, I can't teleport Console to spawn... :(");
            } else {
                Player player = (Player) cs;
                World spawnworld = Bukkit.getWorlds().get(0);
                Location spawn = spawnworld.getSpawnLocation();
                player.teleport(spawn);
                player.sendMessage(ChatColor.GREEN + "Teleported to spawn.");
            }
        }
        return true;
    }
}
