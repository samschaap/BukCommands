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

/**
 *
 * @author samschaap
 */
public class BukcommandsCommandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if(cmnd.getName().equalsIgnoreCase("bukcommands")) {
            cs.sendMessage(ChatColor.GREEN + "This server is using BukCommands :)");
        }
        return true;
    }
    
}
