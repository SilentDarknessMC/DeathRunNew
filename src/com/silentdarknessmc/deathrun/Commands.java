package com.silentdarknessmc.deathrun;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	@SuppressWarnings("deprecation")
	int oplayers = Bukkit.getServer().getOnlinePlayers().length;
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		if (label.equalsIgnoreCase("deathrun")) {
			if(args[0].equalsIgnoreCase("")) {
				player.sendMessage(Main.ChatStarter() + " ===========================================");
				player.sendMessage(Main.ChatStarter() + " /Deathrun Help | Deathrun Help Command");
				player.sendMessage(Main.ChatStarter() + " /Deathrun SetupHelp | Deathrun Setup Help");
				player.sendMessage(Main.ChatStarter() + " /Deathrun AdminHelp | Deathrun Admin Help");
				player.sendMessage(Main.ChatStarter() + " ===========================================");
			}
			
			if(args[0].equalsIgnoreCase("help")) {
				player.sendMessage(Main.ChatStarter() + " ===========================================");
				player.sendMessage(Main.ChatStarter() + " /Deathrun Help | Deathrun Help Command");
				player.sendMessage(Main.ChatStarter() + " /Deathrun SetupHelp | Deathrun Setup Help");
				player.sendMessage(Main.ChatStarter() + " /Deathrun AdminHelp | Deathrun Admin Help");
				player.sendMessage(Main.ChatStarter() + " /Deathrun TrapHelp | Deathrun Trap Help");
				player.sendMessage(Main.ChatStarter() + " ===========================================");
			}
			
			if(args[0].equalsIgnoreCase("setuphelp")) {
				player.sendMessage(Main.ChatStarter() + " ===========================================");
				player.sendMessage(Main.ChatStarter() + " /Deathrun Set Lobby | Set Lobby Location");
				player.sendMessage(Main.ChatStarter() + " /Deathrun Set Death | Set Death Location");
				player.sendMessage(Main.ChatStarter() + " /Deathrun Set Runner | Set Runner Location");
				player.sendMessage(Main.ChatStarter() + " ===========================================");
			}
			
			if(args[0].equalsIgnoreCase("adminhelp")) {
				player.sendMessage(Main.ChatStarter() + " ===========================================");
				player.sendMessage(Main.ChatStarter() + " /Deathrun Start | Start Deathrun Game");
				player.sendMessage(Main.ChatStarter() + " /Deathrun Stop | Stop Deathrun Game");
				player.sendMessage(Main.ChatStarter() + " ===========================================");
			}
			
			if(args[0].equalsIgnoreCase("set")) {
				if(args[1].equalsIgnoreCase("Lobby")) {
					
				}
				
				if(args[1].equalsIgnoreCase("Death")) {
					
				}
				
				if(args[1].equalsIgnoreCase("Runner")) {
					
				}
			}
			
			if(args[0].equalsIgnoreCase("start")) {
				if(oplayers >= 2) {
					Main.Start();
				}
			} else {
				player.sendMessage(Main.ChatStarter() + " There Must Be 2 Players Online To Start The Game!");
			}
			
			if(args[0].equalsIgnoreCase("stop")) {
				Main.Stop();
			}
		}
		return false;
	}
}