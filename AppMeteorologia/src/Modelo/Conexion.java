package Modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import Vista.VentanaPrincipal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.google.gson.Gson;


public class Conexion {
	
	public static ArrayList<Dia> diast = new ArrayList<Dia>();
	
	
	
	public static ArrayList<Dia> getDiast() {
		return diast;
	}

	public static void setDiast(ArrayList<Dia> diast) {
		Conexion.diast = diast;
	}
	

	public void urlString(String ciudad) throws IOException {
		FileReader fr;
		
		fr = new FileReader("config.properties");
		
		Properties configuracion = new Properties();
		configuracion.load(fr);
		Set<String> ciudades = configuracion.stringPropertyNames(); // devuelve y almacena las claves en un array de string
		
		String fichero = configuracion.getProperty(ciudad); // devuelve el valor(url) en funcion de la clave
		
		
		pasarUrl(fichero); // lee el fichero json del enlace pasado por parametro
		
	}
	
	private static void pasarUrl(String enlace) throws MalformedURLException {
		
		URL url = new URL(enlace);

		String inputText = "";
		
		try {

			  // Volcamos lo recibido al buffer
			  BufferedReader in = null;
			  in = new BufferedReader(new InputStreamReader(url.openStream()));
			  
			  String inputLine;
			 
			while ((inputLine = in.readLine()) != null) {
				
				      inputText = inputText + inputLine;
				     
				}
			System.out.println(inputText);
			} catch(Exception t){
				t.printStackTrace();
			}
		
		// gson
		Gson gson = new Gson();
		Conexion q = new Conexion();
		
		City c = gson.fromJson(inputText, City.class);
		String con = "";
		con = q.fromObjetToString(c.getCity());
		
		
		Attr c2 = gson.fromJson(con, Attr.class);
		String days = "";
		days = q.fromObjetToString(c2.getForecast());
		
		Forecastday c3 = gson.fromJson(days, Forecastday.class);
		System.out.println(c3.getForecastDay());
		for (int i = 0; i < c3.getForecastDay().size(); i++) {
			String convert = q.fromObjetToString(c3.getForecastDay().get(i));
			Dia c4 = gson.fromJson(convert, Dia.class);
			diast.add(c4); // almacenamos cada objeto con la infomación climatologica en el arraylist
		 }
		
	}
	
	public String fromObjetToString(Object data) {
		String json = null;

		try {
			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writeValueAsString(data);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;

	}
}
