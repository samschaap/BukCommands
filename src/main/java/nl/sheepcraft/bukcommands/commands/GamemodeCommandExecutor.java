/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.sheepcraft.bukcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author samschaap
 */
public class GamemodeCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("gm")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, I can't set gamemode for Console... :(");
            } else {
                Player player = (Player) cs;
                if(strings.length < 1) {
                    player.sendMessage(ChatColor.RED + "Use: /gm <0/1/2>");
                }
                if(strings[0].equalsIgnoreCase("0")) {
                    player.setGameMode(GameMode.SURVIVAL);
                } else if(strings[0].equalsIgnoreCase("1")) {
                    player.setGameMode(GameMode.CREATIVE);
                } else if(strings[0].equalsIgnoreCase("2")) {
                    player.setGameMode(GameMode.ADVENTURE);
                }
            }
        }
        return true;
    }
}
