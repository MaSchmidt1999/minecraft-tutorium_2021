package de.otto.minecrafttutorium;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftTutorium extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("heal").setExecutor(new Commands());
        this.getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
