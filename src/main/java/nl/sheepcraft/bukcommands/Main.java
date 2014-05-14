package nl.sheepcraft.bukcommands;

import nl.sheepcraft.bukcommands.commands.BroadcastCommandExecutor;
import nl.sheepcraft.bukcommands.commands.SpawnCommandExecutor;
import nl.sheepcraft.bukcommands.commands.WorkbenchCommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        getCommand("broadcast").setExecutor(new BroadcastCommandExecutor());
        getCommand("spawn").setExecutor(new SpawnCommandExecutor());
        getCommand("workbench").setExecutor(new WorkbenchCommandExecutor());
    }

}
