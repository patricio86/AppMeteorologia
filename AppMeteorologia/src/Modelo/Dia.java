package Modelo;

public class Dia {
	private String forecastDate;
	private String weather;
	private String minTemp;
	private String maxTemp;
	
	
	public String getForecastDate() {
		return forecastDate;
	}
	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}
	public String getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	@Override
	public String toString() {
		return "Dias [forecastDate= " + forecastDate+" weather=" + weather + ", minTemp=" + minTemp + ", maxTemp="
				+ maxTemp + "]";
	}
	
	
	
}
