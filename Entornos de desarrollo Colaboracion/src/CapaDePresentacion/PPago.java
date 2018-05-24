package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PPago extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtHora;
	private JTextField txtFecha;
	private JTextField txtMetodoPago;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PPago frame = new PPago();
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
	public PPago() {
		setTitle("Gestion de PPago");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(136, 47, 192, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(57, 50, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblHora = new JLabel("HORA:");
		lblHora.setBounds(57, 88, 46, 14);
		contentPane.add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(136, 85, 192, 20);
		contentPane.add(txtHora);
		
		JLabel lblFecha = new JLabel("FECHA:");
		lblFecha.setBounds(57, 129, 46, 14);
		contentPane.add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(136, 126, 192, 20);
		contentPane.add(txtFecha);
		
		JLabel lblMetodopago = new JLabel("MetodoPago");
		lblMetodopago.setBounds(57, 177, 46, 14);
		contentPane.add(lblMetodopago);
		
		txtMetodoPago = new JTextField();
		txtMetodoPago.setColumns(10);
		txtMetodoPago.setBounds(136, 174, 192, 20);
		contentPane.add(txtMetodoPago);
	}
}
