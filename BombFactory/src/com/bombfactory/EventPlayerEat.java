package com.bombfactory;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import net.md_5.bungee.api.ChatColor;

public class EventPlayerEat implements Listener
{
	@EventHandler
    public void onPlayerClick(PlayerItemConsumeEvent event)
    {
		 Player player = event.getPlayer();
		 
		 if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("Pumpkin Pie?"))
		 {
			 player.sendMessage(ChatColor.ITALIC + "Pies? These are bombs, from a bomb factory.");
			 player.getWorld().createExplosion(player.getLocation().getX(), 
					 							player.getLocation().getY(), 
					 							player.getLocation().getZ(), 
					 							2.0f, 
					 							false);
		 }
    }
}
