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

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 699);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(700, 68, 176, 31);
	contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Ciudad", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel.setBounds(612, 180, 294, 254);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(42, 459, 135, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(205, 459, 135, 179);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(366, 459, 135, 179);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(530, 459, 135, 179);
		contentPane.add(panel_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(700, 459, 135, 179);
		contentPane.add(panel_1_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Mapa", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_2.setBounds(42, 36, 538, 407);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Amsterdam");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(271, 185, 92, 16);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Madrid");
		lblNewLabel_1.setBounds(172, 346, 44, 16);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Lisboa");
		lblNewLabel_7.setBounds(86, 361, 46, 16);
		panel_2.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Paris");
		lblNewLabel_2.setBounds(260, 267, 46, 14);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Roma");
		lblNewLabel_3.setBounds(319, 362, 46, 14);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Londres");
		lblNewLabel_5.setBounds(195, 198, 66, 14);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Dublin");
		lblNewLabel_9.setBounds(148, 168, 46, 14);
		panel_2.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Berlin");
		lblNewLabel_6.setBounds(365, 228, 46, 14);
		panel_2.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Estocolmo");
		lblNewLabel_8.setBounds(412, 93, 79, 14);
		panel_2.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 23, 518, 373);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("../AppMeteorologia/AppMeteorologia/imagenes/1.jpg"));
	}
}
