package Modelo;

public class Attr {
	//private String lang;
	private Object forecast;
	private Object cityName;
	
	
/*
	@Override
	public String toString() {
		return "Attr [lang=" + lang + "]";
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
*/
	
	public Object getForecast() {
		return forecast;
	}

	public Object getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setForecast(Object forecast) {
		this.forecast = forecast;
	}

	
	
	
	
	
}
