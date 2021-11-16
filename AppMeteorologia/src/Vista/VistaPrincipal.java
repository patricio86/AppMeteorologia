package Vista;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

import Controlador.Controlador;

public class VistaPrincipal2 extends JFrame {

	public JPanel contentPane;
	public JComboBox comboBox;
	public JPanel panel_1;
	public JPanel panel_2;
	public JPanel panel_3;
	public JPanel panel_4;
	public JPanel panel_5;
	public JLabel infotemmax1;
	public JLabel infotemmin1;
	public JLabel infotemest1;
	public JLabel infotemmax2;
	public JLabel infotemmin2;
	public JLabel infotemest2;
	public JLabel infotemmax3;
	public JLabel infotemmin3;
	public JLabel infotemest3;
	public JLabel infotemmax4;
	public JLabel infotemmin4 ;
	public JLabel infotemest4;
	public JLabel infotemmax5;
	public JLabel infotemmin5;
	public JLabel infotemest5;
	public JLabel labelimg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		VistaPrincipal2 frame = new VistaPrincipal2();
		frame.setVisible(true);
		//frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creamos el objeto controlador para enlazar la vista con el modelo
		Controlador con = new Controlador(frame);
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal2() {
		setBackground(new Color(255, 0, 102));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(670, 68, 176, 31);
		comboBox.addItem("Córdoba");
		comboBox.addItem("Ciudad Real");
		comboBox.addItem("Valdepeñas");
		contentPane.add(comboBox);
		
		panel_1 = new JPanel();
		panel_1.setBounds(42, 459, 135, 179);
		panel_1.setBorder(new TitledBorder(null, "Fecha1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_1 = new JLabel("T max: ");
		lbl_1.setBounds(10, 35, 63, 22);
		panel_1.add(lbl_1);
		
		JLabel lbl_2 = new JLabel("T min: ");
		lbl_2.setBounds(10, 67, 48, 13);
		panel_1.add(lbl_2);
		
		JLabel lbl_3 = new JLabel("Est");
		lbl_3.setBounds(10, 92, 32, 13);
		panel_1.add(lbl_3);
		
		infotemmax1 = new JLabel("--------");
		infotemmax1.setBounds(90, 35, 32, 22);
		panel_1.add(infotemmax1);
		
		infotemmin1 = new JLabel("--------");
		infotemmin1.setBounds(90, 60, 35, 22);
		panel_1.add(infotemmin1);
		
		infotemest1 = new JLabel("----------");
		infotemest1.setBounds(90, 90, 35, 22);
		panel_1.add(infotemest1);
		
		
		panel_2 = new JPanel();
		panel_2.setBounds(205, 459, 135, 179);
		panel_2.setBorder(new TitledBorder(null, "Fecha2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("T max:");
		lblNewLabel_1_1.setBounds(10, 32, 41, 22);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("T min:");
		lblNewLabel_2_1.setBounds(10, 64, 41, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Estado");
		lblNewLabel_3_1.setBounds(10, 87, 52, 13);
		panel_2.add(lblNewLabel_3_1);
		
		
		infotemmax2 = new JLabel("-------");
		infotemmax2.setBounds(90, 35, 35, 22);
		panel_2.add(infotemmax2);
		
		infotemmin2 = new JLabel("---------");
		infotemmin2.setBounds(90, 60, 35, 22);
		panel_2.add(infotemmin2);
		
		infotemest2 = new JLabel("---------");
		infotemest2.setBounds(90, 90, 35, 22);
		panel_2.add(infotemest2);
		

		
		panel_3 = new JPanel();
		panel_3.setBounds(366, 459, 135, 179);
		panel_3.setBorder(new TitledBorder(null, "Fecha3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("T max: ");
		lblNewLabel_1_1_1.setBounds(10, 30, 48, 22);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("T min:");
		lblNewLabel_2_1_1.setBounds(10, 62, 48, 13);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Estado");
		lblNewLabel_3_1_1.setBounds(10, 91, 48, 13);
		panel_3.add(lblNewLabel_3_1_1);
		
		infotemmax3 = new JLabel("-------");
		infotemmax3.setBounds(60, 35, 45, 13);
		panel_3.add(infotemmax3);
		
		infotemmin3 = new JLabel("-------");
		infotemmin3.setBounds(60, 62, 45, 13);
		panel_3.add(infotemmin3);
		
		infotemest3 = new JLabel("-------");
		infotemest3.setBounds(60, 91, 45, 13);
		panel_3.add(infotemest3);
		

		panel_4 = new JPanel();
		panel_4.setBounds(530, 459, 135, 179);
		panel_4.setBorder(new TitledBorder(null, "Fecha4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lbl_4= new JLabel("T max: ");
		lbl_4.setBounds(10, 30, 54, 22);
		panel_4.add(lbl_4);
		
		JLabel lbl_24 = new JLabel("T min:");
		lbl_24.setBounds(10, 62, 54, 13);
		panel_4.add(lbl_24);
		
		JLabel lbl_25 = new JLabel("Estado");
		lbl_25.setBounds(10, 91, 54, 13);
		panel_4.add(lbl_25);
		
		infotemmax4 = new JLabel("------");
		infotemmax4.setBounds(64, 35, 45, 13);
		panel_4.add(infotemmax4);
		
		infotemmin4 = new JLabel("------");
		infotemmin4.setBounds(64, 62, 45, 13);
		panel_4.add(infotemmin4);
		
		infotemest4 = new JLabel("------");
		infotemest4.setBounds(64, 91, 45, 13);
		panel_4.add(infotemest4);
		
		
		panel_5 = new JPanel();
		panel_5.setBounds(700, 459, 135, 179);
		panel_5.setBorder(new TitledBorder(null, "Fecha5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		
		JLabel lbl_5= new JLabel("T max: ");
		lbl_5.setBounds(10, 30, 56, 22);
		panel_5.add(lbl_5);
		
		JLabel lbl_15 = new JLabel("T min:");
		lbl_15.setBounds(10, 62, 56, 13);
		panel_5.add(lbl_15);
		
		JLabel lbl_35 = new JLabel("Estado");
		lbl_35.setBounds(10, 91, 56, 13);
		panel_5.add(lbl_35);
		
		infotemmax5 = new JLabel("-----");
		infotemmax5.setBounds(67, 35, 45, 13);
		panel_5.add(infotemmax5);
		
		infotemmin5 = new JLabel("-----");
		infotemmin5.setBounds(67, 62, 45, 13);
		panel_5.add(infotemmin5);
		
		infotemest5 = new JLabel("-----");
		infotemest5.setBounds(67, 91, 45, 13);
		panel_5.add(infotemest5);
		
			
		JPanel panel_mapa = new JPanel();
		panel_mapa.setBorder(new TitledBorder(null, "Mapa", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_mapa.setBounds(42, 36, 538, 407);
		contentPane.add(panel_mapa);
		panel_mapa.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Amsterdam");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(271, 185, 92, 16);
		panel_mapa.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Madrid");
		lblNewLabel_1.setBounds(172, 346, 44, 16);
		panel_mapa.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Lisboa");
		lblNewLabel_7.setBounds(86, 361, 46, 16);
		panel_mapa.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Paris");
		lblNewLabel_2.setBounds(260, 267, 46, 14);
		panel_mapa.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Roma");
		lblNewLabel_3.setBounds(319, 362, 46, 14);
		panel_mapa.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Londres");
		lblNewLabel_5.setBounds(195, 198, 66, 14);
		panel_mapa.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Dublin");
		lblNewLabel_9.setBounds(148, 168, 46, 14);
		panel_mapa.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Berlin");
		lblNewLabel_6.setBounds(365, 228, 46, 14);
		panel_mapa.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Estocolmo");
		lblNewLabel_8.setBounds(412, 93, 79, 14);
		panel_mapa.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		
		JLabel mapa = new JLabel("");
		mapa.setBounds(10, 23, 518, 373);
		panel_mapa.add(mapa);
		mapa.setIcon(new ImageIcon("imagenes/1.jpg"));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBackground(new Color(153, 255, 255));
		lblNewLabel_10.setIcon(new ImageIcon("imagenes/sky-g2ffcc1c93_1920.jpg"));
		lblNewLabel_10.setBounds(0, 0, 930, 671);
		contentPane.add(lblNewLabel_10);
		
		labelimg = new JLabel("");
		labelimg.setIcon(new ImageIcon("C:\\Users\\raul\\Desktop\\Trabajo_Accesos_Interfaces\\App_Metereologica\\imagenes\\cordoba.jpg"));
		labelimg.setBounds(608, 156, 291, 263);
		contentPane.add(labelimg);
		
	}
}
