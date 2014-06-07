package nl.sheepcraft.bukcommands;

import java.io.IOException;
import nl.sheepcraft.bukcommands.commands.BroadcastCommandExecutor;
import nl.sheepcraft.bukcommands.commands.BukcommandsCommandExecutor;
import nl.sheepcraft.bukcommands.commands.EnchantingCommandExecutor;
import nl.sheepcraft.bukcommands.commands.FakedeopCommandExecutor;
import nl.sheepcraft.bukcommands.commands.FakeopCommandExecutor;
import nl.sheepcraft.bukcommands.commands.FlyCommandExecutor;
import nl.sheepcraft.bukcommands.commands.GamemodeCommandExecutor;
import nl.sheepcraft.bukcommands.commands.HealCommandExecutor;
import nl.sheepcraft.bukcommands.commands.PlayerinfoCommandExecutor;
import nl.sheepcraft.bukcommands.commands.ResourcedlCommandExecutor;
import nl.sheepcraft.bukcommands.commands.ServerinfoCommandExecutor;
import nl.sheepcraft.bukcommands.commands.SetspawnCommandExecutor;
import nl.sheepcraft.bukcommands.commands.SkullCommandExecutor;
import nl.sheepcraft.bukcommands.commands.SpawnCommandExecutor;
import nl.sheepcraft.bukcommands.commands.TimeCommandExecutor;
import nl.sheepcraft.bukcommands.commands.WeatherCommandExecutor;
import nl.sheepcraft.bukcommands.commands.WorkbenchCommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.MetricsLite;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        //Commands
        getLogger().info("Loading commands...");
        getCommand("bukcommands").setExecutor(new BukcommandsCommandExecutor());
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
        getCommand("playerinfo").setExecutor(new PlayerinfoCommandExecutor());
        getCommand("enchanting").setExecutor(new EnchantingCommandExecutor());
        getCommand("setspawn").setExecutor(new SetspawnCommandExecutor());
        getCommand("serverinfo").setExecutor(new ServerinfoCommandExecutor());
        //Metrics
        try {
            MetricsLite metrics = new MetricsLite(this);
            metrics.start();
        } catch (IOException e) {
            // Failed to submit the stats :-(
        }
    }

}
