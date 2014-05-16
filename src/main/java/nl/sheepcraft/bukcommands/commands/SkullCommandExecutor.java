/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.sheepcraft.bukcommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

/**
 *
 * @author samschaap
 */
public class SkullCommandExecutor implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (cmnd.getName().equalsIgnoreCase("skull")) {
            if (!(cs instanceof Player)) {
                cs.sendMessage(ChatColor.RED + "Sorry, I can't spawn a skull for Console... :(");
            } else {
                Player player = (Player) cs;
                if(strings.length != 1) {
                    player.sendMessage(ChatColor.RED + "Use: /skull <player>");
                } else {
                     ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short)
                     SkullType.PLAYER.ordinal());
                     SkullMeta meta = (SkullMeta) skull.getItemMeta();
                     meta.setOwner(strings[0]);
                     skull.setItemMeta(meta);
                     player.getInventory().addItem(skull);
                }
            }
        }
        return true;
    }
    
}
