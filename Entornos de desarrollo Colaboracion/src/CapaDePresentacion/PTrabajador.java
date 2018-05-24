package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PTrabajador extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNIF;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtSenior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTrabajador frame = new PTrabajador();
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
	public PTrabajador() {
		setTitle("Gestion de PTrabajador");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(29, 45, 46, 14);
		contentPane.add(lblId);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(108, 42, 192, 20);
		contentPane.add(txtID);
		
		JLabel lblNif = new JLabel("NIF");
		lblNif.setBounds(29, 76, 46, 14);
		contentPane.add(lblNif);
		
		txtNIF = new JTextField();
		txtNIF.setColumns(10);
		txtNIF.setBounds(108, 73, 192, 20);
		contentPane.add(txtNIF);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(29, 104, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(108, 101, 192, 20);
		contentPane.add(txtNombre);
		
		JLabel lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setBounds(29, 139, 46, 14);
		contentPane.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(108, 136, 192, 20);
		contentPane.add(txtApellidos);
		
		JLabel lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setBounds(29, 174, 46, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(108, 171, 192, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(29, 210, 46, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(108, 207, 192, 20);
		contentPane.add(txtTelefono);
		
		JLabel lblSenion = new JLabel("SENION");
		lblSenion.setBounds(29, 241, 46, 14);
		contentPane.add(lblSenion);
		
		txtSenior = new JTextField();
		txtSenior.setColumns(10);
		txtSenior.setBounds(108, 238, 192, 20);
		contentPane.add(txtSenior);
	}
	
	

}
