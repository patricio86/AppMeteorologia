package Vista;


import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;

import Controlador.Controlador;
import javafx.scene.control.Button;

import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JFrame {

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
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	AudioClip sonido;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		VistaPrincipal frame = new VistaPrincipal();
		frame.setVisible(true);
		//frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creamos el objeto controlador para enlazar la vista con el modelo
		Controlador con = new Controlador(frame);
		
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setBackground(new Color(255, 0, 102));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelimg = new JLabel("");
		labelimg.setIcon(new ImageIcon("imagenes\\"));
		labelimg.setBounds(608, 156, 291, 263);
		contentPane.add(labelimg);
		
		comboBox = new JComboBox();
		comboBox.setBounds(670, 68, 176, 31);
		comboBox.addItem("Madrid");
		comboBox.addItem("Lisboa");
		comboBox.addItem("Roma");
		comboBox.addItem("Berlin");
		comboBox.addItem("Londres");
		comboBox.addItem("Dublin");
		comboBox.addItem("Amsterdam");
		comboBox.addItem("Estocolmo");
		contentPane.add(comboBox);
		
		panel_1 = new JPanel();
		panel_1.setBounds(23, 459, 161, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		
		JLabel lbl_1 = new JLabel("T max: ");
		lbl_1.setBounds(10, 35, 63, 22);
		panel_1.add(lbl_1);
		
		JLabel lbl_2 = new JLabel("T min: ");
		lbl_2.setBounds(10, 67, 48, 13);
		panel_1.add(lbl_2);
		
		JLabel lbl_3 = new JLabel("Estado");
		lbl_3.setBounds(10, 92, 48, 13);
		panel_1.add(lbl_3);
		
		infotemmax1 = new JLabel("--------");
		infotemmax1.setBounds(52, 35, 32, 22);
		panel_1.add(infotemmax1);
		
		infotemmin1 = new JLabel("--------");
		infotemmin1.setBounds(52, 62, 35, 22);
		panel_1.add(infotemmin1);
		
		infotemest1 = new JLabel("----------");
		infotemest1.setBounds(10, 117, 141, 22);
		panel_1.add(infotemest1);
		
		
		panel_2 = new JPanel();
		panel_2.setBounds(193, 459, 163, 179);
		panel_2.setBorder(new TitledBorder(null, "Fecha2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("T max:");
		lblNewLabel_1_1.setBounds(10, 32, 41, 22);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("T min:");
		lblNewLabel_2_1.setBounds(10, 64, 41, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Estado");
		lblNewLabel_3_1.setBounds(10, 95, 52, 13);
		panel_2.add(lblNewLabel_3_1);
		
		
		infotemmax2 = new JLabel("-------");
		infotemmax2.setBounds(54, 32, 35, 22);
		panel_2.add(infotemmax2);
		
		infotemmin2 = new JLabel("---------");
		infotemmin2.setBounds(54, 59, 35, 22);
		panel_2.add(infotemmin2);
		
		infotemest2 = new JLabel("---------");
		infotemest2.setBounds(10, 118, 143, 18);
		panel_2.add(infotemest2);
		

		
		panel_3 = new JPanel();
		panel_3.setBounds(366, 459, 171, 179);
		panel_3.setBorder(new TitledBorder(null, "Fecha3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setOpaque(false);
		
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
		infotemmax3.setBounds(50, 35, 45, 13);
		panel_3.add(infotemmax3);
		
		infotemmin3 = new JLabel("-------");
		infotemmin3.setBounds(50, 62, 45, 13);
		panel_3.add(infotemmin3);
		
		infotemest3 = new JLabel("-------");
		infotemest3.setBounds(10, 121, 151, 13);
		panel_3.add(infotemest3);
		

		panel_4 = new JPanel();
		panel_4.setBounds(547, 459, 167, 179);
		panel_4.setBorder(new TitledBorder(null, "Fecha4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setOpaque(false);
		
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
		infotemmax4.setBounds(48, 35, 45, 13);
		panel_4.add(infotemmax4);
		
		infotemmin4 = new JLabel("------");
		infotemmin4.setBounds(48, 63, 45, 13);
		panel_4.add(infotemmin4);
		
		infotemest4 = new JLabel("------");
		infotemest4.setBounds(10, 115, 147, 13);
		panel_4.add(infotemest4);
		
		
		panel_5 = new JPanel();
		panel_5.setBounds(724, 459, 175, 179);
		panel_5.setBorder(new TitledBorder(null, "Fecha5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setOpaque(false);
		
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
		infotemmax5.setBounds(51, 35, 114, 13);
		panel_5.add(infotemmax5);
		
		infotemmin5 = new JLabel("-----");
		infotemmin5.setBounds(51, 62, 114, 13);
		panel_5.add(infotemmin5);
		
		infotemest5 = new JLabel("-----");
		infotemest5.setBounds(10, 115, 155, 13);
		panel_5.add(infotemest5);
		
			
		JPanel panel_mapa = new JPanel();
		panel_mapa.setBorder(new TitledBorder(null, "Mapa", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_mapa.setBounds(42, 36, 538, 407);
		contentPane.add(panel_mapa);
		panel_mapa.setLayout(null);
		panel_mapa.setOpaque(false);
		
		btnNewButton_6 = new JButton("Amsterdam");
		btnNewButton_6.setOpaque(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBounds(250, 218, 117, 23);
		panel_mapa.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Berlin");
		btnNewButton_7.setOpaque(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setBounds(334, 237, 89, 23);
		panel_mapa.add(btnNewButton_7);
		
		btnNewButton_4 = new JButton("Londres");
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBounds(207, 202, 89, 23);
		panel_mapa.add(btnNewButton_4);
		
		btnNewButton_8 = new JButton("Estocolmo");
		btnNewButton_8.setOpaque(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBounds(394, 148, 114, 23);
		panel_mapa.add(btnNewButton_8);
		
		btnNewButton_1 = new JButton("Lisboa");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBounds(35, 325, 89, 23);
		panel_mapa.add(btnNewButton_1);
		
		btnNewButton_5 = new JButton("Dublin");
		btnNewButton_5.setOpaque(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBounds(133, 182, 89, 23);
		panel_mapa.add(btnNewButton_5);
		
		btnNewButton_3 = new JButton("Roma");
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBounds(290, 362, 89, 23);
		panel_mapa.add(btnNewButton_3);
		
		btnNewButton = new JButton("Madrid");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		
		btnNewButton.setBounds(133, 325, 89, 23);
		panel_mapa.add(btnNewButton);
		
		
		
		
		JLabel mapa = new JLabel("");
		mapa.setBounds(10, 23, 518, 373);
		panel_mapa.add(mapa);
		mapa.setIcon(new ImageIcon("imagenes/1.jpg"));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBackground(new Color(153, 255, 255));
		lblNewLabel_10.setIcon(new ImageIcon("imagenes/sky-g2ffcc1c93_1920.jpg"));
		lblNewLabel_10.setBounds(0, -22, 940, 717);
		contentPane.add(lblNewLabel_10);
		
		JRadioButton btnmusicaon = new JRadioButton("Musica ON");
		btnmusicaon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sintoniatiempo.wav"));
				sonido.play();
			}
		});
		btnmusicaon.setBounds(622, 32, 109, 23);
		contentPane.add(btnmusicaon);
		
		JRadioButton btnmusicaoff = new JRadioButton("Musica OFF");
		btnmusicaoff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido.stop();
			}
		});		
		
		btnmusicaoff.setBounds(761, 32, 109, 23);
		contentPane.add(btnmusicaoff);
		
		ButtonGroup gsonido = new ButtonGroup();
		gsonido.add(btnmusicaon);
		gsonido.add(btnmusicaoff);
		
		
		
	}
}
