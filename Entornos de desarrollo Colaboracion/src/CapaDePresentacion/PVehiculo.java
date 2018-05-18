package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PVehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PVehiculo frame = new PVehiculo();
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
	public PVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 424, 0);
		contentPane.add(label);
		
		JLabel lblMatricula = new JLabel("MATRICULA:");
		lblMatricula.setBounds(38, 28, 67, 14);
		contentPane.add(lblMatricula);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 25, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setBounds(38, 79, 67, 14);
		contentPane.add(lblModelo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 76, 117, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRemolque = new JLabel("REMOLQUE:");
		lblRemolque.setBounds(38, 129, 67, 14);
		contentPane.add(lblRemolque);
		
		textField_3 = new JTextField();
		textField_3.setBounds(115, 126, 117, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}

}
