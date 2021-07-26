package com.bombfactory;

import org.bukkit.plugin.java.JavaPlugin;

public class BombFactory extends JavaPlugin{

	 // Fired when plugin is first enabled
	
    @Override
    public void onEnable() 
    {
    	getLogger().info("Enabling BombFactory 1.0");
    	this.getCommand("bombfactory").setExecutor(new CommandBombFactory());
    	 getServer().getPluginManager().registerEvents(new EventPlayerEat(), this);
    }
    
    // Fired when plugin is disabled
    
    @Override
    public void onDisable() 
    {
    	getLogger().info("Disabling BombFactory 1.0");
    }
	
}
