package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PFlota extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PFlota frame = new PFlota();
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
	public PFlota() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(95, 24, 126, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(39, 27, 46, 17);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(95, 73, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(24, 76, 46, 14);
		contentPane.add(lblNombre);
	}
}
