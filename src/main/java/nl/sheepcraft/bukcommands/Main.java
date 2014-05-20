package nl.sheepcraft.bukcommands;

import nl.sheepcraft.bukcommands.commands.BroadcastCommandExecutor;
import nl.sheepcraft.bukcommands.commands.FakedeopCommandExecutor;
import nl.sheepcraft.bukcommands.commands.FakeopCommandExecutor;
import nl.sheepcraft.bukcommands.commands.FlyCommandExecutor;
import nl.sheepcraft.bukcommands.commands.GamemodeCommandExecutor;
import nl.sheepcraft.bukcommands.commands.HealCommandExecutor;
import nl.sheepcraft.bukcommands.commands.ResourcedlCommandExecutor;
import nl.sheepcraft.bukcommands.commands.SkullCommandExecutor;
import nl.sheepcraft.bukcommands.commands.SpawnCommandExecutor;
import nl.sheepcraft.bukcommands.commands.TimeCommandExecutor;
import nl.sheepcraft.bukcommands.commands.WeatherCommandExecutor;
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
        getCommand("gm").setExecutor(new GamemodeCommandExecutor());        
        getCommand("fly").setExecutor(new FlyCommandExecutor());
        getCommand("skull").setExecutor(new SkullCommandExecutor());
        getCommand("heal").setExecutor(new HealCommandExecutor());
        getCommand("resourcedl").setExecutor(new ResourcedlCommandExecutor());
        getCommand("fakeop").setExecutor(new FakeopCommandExecutor());
        getCommand("fakedeop").setExecutor(new FakedeopCommandExecutor());
        getCommand("time").setExecutor(new TimeCommandExecutor());        
        getCommand("weather").setExecutor(new WeatherCommandExecutor());        
    }

}
