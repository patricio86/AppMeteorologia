package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import Modelo.Conexion;
import Vista.VistaPrincipal;


public class Controlador implements ActionListener{

	
	VistaPrincipal ventana = new VistaPrincipal(); // creamos el objeto de la ventana principal
	
	
	public Controlador(VistaPrincipal ventana) throws IOException { // constructor del controlador
		
		this.ventana = ventana;
		this.ventana.comboBox.addActionListener(this);
		Conexion c = new Conexion();
		ArrayList<String> urls = c.devolverclaves();
		c.diaCiudades(urls);
	
		for (int i = 0; i < c.getDiaCiudades().size(); i++) {
			if (c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("berlin")) {
				JLabel gneric = ventana.icberlin;
				compararTiempo(c, i, gneric);
			} else if(c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("madrid")) {
				JLabel gneric = ventana.icmadrid;
				compararTiempo(c, i, gneric);
			} else if(c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("lisboa")) {
				JLabel gneric = ventana.iclisboa;
				compararTiempo(c, i,gneric);
			} else if(c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("roma")) {
				JLabel gneric = ventana.icroma;
				compararTiempo(c, i,gneric);
			} else if(c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("londres")) {
				JLabel gneric = ventana.iclondres;
				compararTiempo(c, i, gneric);
			} else if(c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("dublin")) {
				JLabel gneric = ventana.icdublin;
				compararTiempo(c, i, gneric);
			} else if(c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("amsterdam")) {
				JLabel gneric = ventana.icamsterdan;
				compararTiempo(c, i, gneric);
			} else if(c.getDiaCiudades().get(i).getCiudad().equalsIgnoreCase("estocolmo")) {
				JLabel gneric = ventana.icestocol;
				compararTiempo(c, i, gneric);
			} 
			
			
		}
	}


	
	public void compararTiempo(Conexion c, int i, JLabel gneric) {
		if (c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Nuboso")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\nuboso.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Soleado")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\soleado.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Cubierto")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\cubierto.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Claro")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\soleado.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Despejado")) {
			
			gneric.setIcon(new ImageIcon("imagenes\soleado.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Nieve")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\nieve.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Niebla")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\niebla.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Intervalos de sol")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\intervalossoleado.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Parcialmente despejado")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\intervalossoleado.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Bruma")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\intervalossoleado.png"));
			
		}else if(c.getDiaCiudades().get(i).getWeather().equalsIgnoreCase("Lluvia")) {
			
			gneric.setIcon(new ImageIcon("imagenes\\intervaloslluvioso.png"));
			
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	//	ArrayList<Dia> d1;
		String itemSeleecionado = (String)ventana.comboBox.getSelectedItem();
		
		
		if("madrid".equalsIgnoreCase(itemSeleecionado)) {
			ventana.labelimg.setIcon(new ImageIcon("imagenes/madrid.png"));
			Conexion c1 = new Conexion();
			
			try {
				c1.urlString("madrid");
				
				
				editarPanel(c1);
				
				c1.getDiast().clear();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			

		}else if("lisboa".equalsIgnoreCase(itemSeleecionado)) {
			ventana.labelimg.setIcon(new ImageIcon("imagenes/lisboa.png"));
			Conexion c1 = new Conexion();
			
			
			try {
				c1.urlString("lisboa");
				
				editarPanel(c1);
				
				c1.getDiast().clear();			
				} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	

		}else if("berlin".equalsIgnoreCase(itemSeleecionado)) {
			ventana.labelimg.setIcon(new ImageIcon("imagenes/berlin.png"));
			Conexion c1 = new Conexion();
			
			try {
				c1.urlString("berlin");
				
				
				editarPanel(c1);
				
				c1.getDiast().clear();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			else if("roma".equalsIgnoreCase(itemSeleecionado)) {
				ventana.labelimg.setIcon(new ImageIcon("imagenes/roma.png"));
				Conexion c1 = new Conexion();
				
				try {
					c1.urlString("roma");
					
					
					editarPanel(c1);
					
					c1.getDiast().clear();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
					else if("londres".equalsIgnoreCase(itemSeleecionado)) {
						ventana.labelimg.setIcon(new ImageIcon("imagenes/londres.png"));
						Conexion c1 = new Conexion();
						
						try {
							c1.urlString("londres");
							
							
							editarPanel(c1);
							
							c1.getDiast().clear();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
						else if("dublin".equalsIgnoreCase(itemSeleecionado)) {
							ventana.labelimg.setIcon(new ImageIcon("imagenes/dublin.png"));
							Conexion c1 = new Conexion();
							
							try {
								c1.urlString("dublin");
								
								
								editarPanel(c1);
								
								c1.getDiast().clear();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						}
							else if("amsterdam".equalsIgnoreCase(itemSeleecionado)) {
								ventana.labelimg.setIcon(new ImageIcon("imagenes/amsterdam.png"));
								Conexion c1 = new Conexion();
								
								try {
									c1.urlString("amsterdam");
									
									
									editarPanel(c1);
									
									c1.getDiast().clear();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}	
								else if("estocolmo".equalsIgnoreCase(itemSeleecionado)) {
									ventana.labelimg.setIcon(new ImageIcon("imagenes/estocolmo.png"));
									Conexion c1 = new Conexion();
									
									try {
										c1.urlString("estocolmo");
										
										
										editarPanel(c1);
										
										c1.getDiast().clear();
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}	
		}
	}


	public void editarPanel(Conexion c1) {
		ventana.panel_1.setBorder(new TitledBorder(null, c1.getDiast().get(0).getForecastDate(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.panel_2.setBorder(new TitledBorder(null, c1.getDiast().get(1).getForecastDate(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.panel_3.setBorder(new TitledBorder(null, c1.getDiast().get(2).getForecastDate(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.panel_4.setBorder(new TitledBorder(null, c1.getDiast().get(3).getForecastDate(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ventana.panel_5.setBorder(new TitledBorder(null, c1.getDiast().get(4).getForecastDate(), TitledBorder.LEADING, TitledBorder.TOP, null, null));

		
		ventana.infotemmax1.setText(c1.getDiast().get(0).getMaxTemp());
		ventana.infotemmin1.setText(c1.getDiast().get(0).getMinTemp());
		ventana.infotemest1.setText(c1.getDiast().get(0).getWeather());
		
		ventana.infotemmax2.setText(c1.getDiast().get(1).getMaxTemp());
		ventana.infotemmin2.setText(c1.getDiast().get(1).getMinTemp());
		ventana.infotemest2.setText(c1.getDiast().get(1).getWeather());
		
		ventana.infotemmax3.setText(c1.getDiast().get(2).getMaxTemp());
		ventana.infotemmin3.setText(c1.getDiast().get(2).getMinTemp());
		ventana.infotemest3.setText(c1.getDiast().get(2).getWeather());
		
		ventana.infotemmax4.setText(c1.getDiast().get(3).getMaxTemp());
		ventana.infotemmin4.setText(c1.getDiast().get(3).getMinTemp());
		ventana.infotemest4.setText(c1.getDiast().get(3).getWeather());
		
		ventana.infotemmax5.setText(c1.getDiast().get(4).getMaxTemp());
		ventana.infotemmin5.setText(c1.getDiast().get(4).getMinTemp());
		ventana.infotemest5.setText(c1.getDiast().get(4).getWeather());
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
