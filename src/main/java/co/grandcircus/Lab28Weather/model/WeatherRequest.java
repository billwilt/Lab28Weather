package co.grandcircus.Lab28Weather.model;

public class WeatherRequest {
	
	private String startPeriodName;
	
	private String data;
	
	private String time;
	
	private String weather;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(String startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
