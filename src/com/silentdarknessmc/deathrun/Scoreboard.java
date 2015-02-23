package com.silentdarknessmc.deathrun;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class Scoreboard implements Listener {
	public static List<Player> vips = new ArrayList<Player>();
	public static List<Player> runners = new ArrayList<Player>();
	public static List<Player> deaths = new ArrayList<Player>();
	public static List<Player> spectators = new ArrayList<Player>();
	public static List<Player> playerswaiting = new ArrayList<Player>();
	
	public static org.bukkit.scoreboard.Scoreboard sboard;
	
	@SuppressWarnings("deprecation")
	public static void DeathrunScoreboard() {
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		sboard = manager.getNewScoreboard();
		
		Objective objective = sboard.registerNewObjective("DeathRun", "Minigame");
		objective.setDisplayName(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Deathrun" + ChatColor.DARK_AQUA + "]");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);

		Team team = sboard.registerNewTeam("Team");
		team.setDisplayName(ChatColor.DARK_AQUA + "");
		
		int a = runners.size();
		int b = deaths.size();
		int c = spectators.size();
		int d = playerswaiting.size();
		int e = vips.size();
		
		Score blank1 = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "      "));
		blank1.setScore(11);
		
		Score runners = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "Runners" + "  " + a));
		runners.setScore(10);
		
		Score blank2 = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "     "));
		blank2.setScore(9);

		Score deaths = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "Deaths" + "    " + b));
		deaths.setScore(8);
		
		Score blank3 = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "    "));
		blank3.setScore(7);

		Score spectators = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "Spectators" + " " + c));
		spectators.setScore(6);
		
		Score blank4 = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "   "));
		blank4.setScore(5);

		Score pwaiting = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "Players Waiting" + " " + d));
		pwaiting.setScore(4);
		
		Score blank5 = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "  "));
		blank5.setScore(3);

		Score vips = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + "VIPs" + "      " + e));
		vips.setScore(2);
		
		Score blank6 = objective.getScore(Bukkit.getOfflinePlayer(ChatColor.GOLD + " "));
		blank6.setScore(1);
	}
}