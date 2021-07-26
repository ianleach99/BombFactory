package com.bombfactory;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class CommandBombFactory implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
		Player player = (Player) sender;
		
		if(player.isOp())
		{
			int amount = 1;
			
			if(args.length == 1)
			{
				try {
					amount = Integer.parseInt(args[0]);
				}catch(Exception e)
				{
					player.sendMessage(ChatColor.RED + "Please enter an ammount.");
				}
			}
			
			ItemStack pieBomb = new ItemStack(Material.PUMPKIN_PIE, amount);
			ItemMeta meta = pieBomb.getItemMeta();
			meta.setDisplayName("Pumpkin Pie?");
			
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.ITALIC + "\"Oh... these aren't homemade.\"");
			meta.setLore(lore);
			
			pieBomb.setItemMeta(meta);
			
			player.sendMessage(ChatColor.ITALIC + "They're bombs... Well that's too bad. I wanted to buy one.");
			player.getInventory().addItem(pieBomb);
		}
		
		return true;
	}
	
}
