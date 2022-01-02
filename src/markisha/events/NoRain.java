package markisha.events;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class NoRain implements Listener {

	@EventHandler
	public void onRain(WeatherChangeEvent e) {
		World w = e.getWorld();
		w.setClearWeatherDuration(10);
	}

}
