package markisha.clearSkies;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import markisha.events.NoRain;

public class ClearSkies extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new NoRain(), this);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ClearSkies]: Plugin enabled!");
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ClearSkies]: Plugin disabled!");
	}
	
}
