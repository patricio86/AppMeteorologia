package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;

import Modelo.Conexion;
import Vista.VentanaPrincipal;



public class Controlador implements ActionListener{

	
	VentanaPrincipal ventana = new VentanaPrincipal(); // creamos el objeto de la ventana principal
	
	
	public Controlador(VentanaPrincipal ventana) { // constructor del controlador
		
		this.ventana = ventana;
		this.ventana.comboBox.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String itemSeleecionado = (String)ventana.comboBox.getSelectedItem();
		
		
		if("valdepeñas".equalsIgnoreCase(itemSeleecionado)) {
			ventana.labelimg.setIcon(new ImageIcon("imagenes/1.jpg"));
			Conexion c1 = new Conexion();
			
			try {
				c1.urlString("valdepenas");
				for (int i = 0; i < c1.getDiast().size(); i++) {
					System.out.println(c1.getDiast().get(i).toString());
				}
				c1.getDiast().clear();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
		}else if("Córdoba".equalsIgnoreCase(itemSeleecionado)) {
			ventana.labelimg.setIcon(new ImageIcon("imagenes/cordoba.jpg"));
			Conexion c1 = new Conexion();
			
			
			try {
				c1.urlString("cordoba");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
		}else if("ciudad real".equalsIgnoreCase(itemSeleecionado)) {
			ventana.labelimg.setIcon(new ImageIcon("imagenes/berlin.png"));
			Conexion c1 = new Conexion();
			
			try {
				c1.urlString("ciudadreal");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
