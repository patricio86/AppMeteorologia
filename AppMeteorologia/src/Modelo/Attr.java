package Modelo;

public class Attr {
	private String lang;
	private Object forecast;
	
	
	

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

	public Object getForecast() {
		return forecast;
	}

	public void setForecast(Object forecast) {
		this.forecast = forecast;
	}

	
	
	
	
	
}
