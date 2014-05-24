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
public class EnchantingCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("enchanting")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, I can't open an enchanting table for Console... :(");
            } else {
                Player player = (Player) cs;
                player.openEnchanting(null, true);
            }
        }
        return true;
    }

}
