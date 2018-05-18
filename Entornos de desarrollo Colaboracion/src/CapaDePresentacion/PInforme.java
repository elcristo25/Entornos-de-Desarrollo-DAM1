package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PInforme extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PInforme frame = new PInforme();
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
	public PInforme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(30, 25, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(115, 22, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION:");
		lblDescripcion.setBounds(30, 77, 79, 14);
		contentPane.add(lblDescripcion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 74, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
