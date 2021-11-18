package Modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import Vista.VistaPrincipal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.google.gson.Gson;


public class Conexion {
	
	
	
	public static ArrayList<Dia> diast = new ArrayList<Dia>();
	public static ArrayList<Dia> diaCiudades = new ArrayList<Dia>();
	
	/*
	public static void main(String[] args) throws IOException {
		Conexion c = new Conexion();
		ArrayList<String> urls = c.devolverclaves();
		c.diaCiudades(urls);
	}
	*/
	
	public static ArrayList<Dia> getDiast() {
		return diast;
	}

	public static void setDiast(ArrayList<Dia> diast) {
		Conexion.diast = diast;
	}
	

	public static ArrayList<Dia> getDiaCiudades() {
		return diaCiudades;
	}

	public static void setDiaCiudades(ArrayList<Dia> diaCiudades) {
		Conexion.diaCiudades = diaCiudades;
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
	
	public void pasarUrl(String enlace) throws MalformedURLException {
		
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
			//System.out.println(inputText);
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
		//System.out.println(c2.getCityName());
		String days = "";
		days = q.fromObjetToString(c2.getForecast());
		
		Forecastday c3 = gson.fromJson(days, Forecastday.class);
		//System.out.println(c3.getForecastDay());
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
	
	public ArrayList<String> devolverclaves() throws IOException {
		
		ArrayList<String> urls= new ArrayList<String>();
		
		Properties prop = new Properties();
		InputStream is = null;

		try {
		  is=new FileInputStream("config.properties");
		  prop.load(is);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		Enumeration en = prop.keys();
		
		for (Enumeration e = prop.keys(); e.hasMoreElements() ; ) {
		    // Obtenemos el objeto
		    Object obj = e.nextElement();
		   // System.out.println(obj + ": " + prop.getProperty(obj.toString()));
		    
		    urls.add(prop.getProperty(obj.toString()));
		    
		    
		}
		return urls;
	}
	
	public void diaCiudades(ArrayList<String> enlaces) throws MalformedURLException {
		
		
			//System.out.println(enlaces.size());
			for (int i = 0; i < enlaces.size(); i++) {
				URL url = new URL(enlaces.get(i));

				String inputText = "";
				
				try {

					  // Volcamos lo recibido al buffer
					  BufferedReader in = null;
					  in = new BufferedReader(new InputStreamReader(url.openStream()));
					  
					  String inputLine;
					 
					while ((inputLine = in.readLine()) != null) {
						
						      inputText = inputText + inputLine;
						     
						}
					// System.out.println(inputText);
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
				// System.out.println(c2.getCityName().toString());
				Forecastday c3 = gson.fromJson(days, Forecastday.class);
				// System.out.println(c3.getForecastDay());
				
					String convert = q.fromObjetToString(c3.getForecastDay().get(0));
					Dia c4 = gson.fromJson(convert, Dia.class);
					
					c4.setCiudad(c2.getCityName().toString());
					//System.out.println(c4.getWeather());
					diaCiudades.add(c4);
					
				//	System.out.println(diaCiudades.get(i).getCiudad() + " " + diaCiudades.get(i).getWeather());
			}
		
	}
}
