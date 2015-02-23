package com.silentdarknessmc.deathrun;

import static org.bukkit.ChatColor.*;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		System.out.println(EnableStarter() + "============================================");
		System.out.println(EnableStarter() + "Enabling SDMC's Deathrun Plugin!");
		System.out.println(EnableStarter() + "Loading Deathrun's Config!");
		this.getConfig();
		this.getConfig().options().copyDefaults(true);
		System.out.println(EnableStarter() + "Successfully Enabled SDMC's Deathrun Plugin!");
		System.out.println(EnableStarter() + "============================================");
		Scoreboard.DeathrunScoreboard();
		registerListeners();
	}
	
	public void onDisable() {
		
	}
	
	public void registerListeners() {
		getCommand("deathrun").setExecutor(new Commands());
		Bukkit.getServer().getPluginManager().registerEvents(new Scoreboard(), this);
	}
	
	public static String EnableStarter() {
		return DARK_AQUA + "[" + GOLD + "Deathrun" + DARK_AQUA + "] " + WHITE;
	}
	
	public static String ChatStarter() {
		return DARK_AQUA + "[" + GOLD + "Deathrun" + DARK_AQUA + "]" + WHITE;
	}
	
	public static void Start() {
		
	}
	
	public static void Stop() {
		
	}
}