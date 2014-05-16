package nl.sheepcraft.bukcommands;

import org.bukkit.plugin.java.JavaPlugin;

import nl.sheepcraft.bukcommands.commands.BroadcastCommandExecutor;
import nl.sheepcraft.bukcommands.commands.FlyCommandExecutor;
import nl.sheepcraft.bukcommands.commands.GamemodeCommandExecutor;
import nl.sheepcraft.bukcommands.commands.SpawnCommandExecutor;
import nl.sheepcraft.bukcommands.commands.WorkbenchCommandExecutor;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        getCommand("broadcast").setExecutor(new BroadcastCommandExecutor());
        getCommand("spawn").setExecutor(new SpawnCommandExecutor());
        getCommand("workbench").setExecutor(new WorkbenchCommandExecutor());
        getCommand("gm").setExecutor(new GamemodeCommandExecutor());        
        getCommand("fly").setExecutor(new FlyCommandExecutor());
    }

}
