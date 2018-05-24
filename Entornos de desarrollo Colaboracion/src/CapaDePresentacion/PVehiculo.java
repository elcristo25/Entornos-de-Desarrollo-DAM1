package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CapaDeDatos.SimuladorBaseDeDatos;
import CapaDeDatos.Vehiculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class PVehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtModelo;
	private ButtonGroup btnGroup;
	private SimuladorBaseDeDatos bd;
	private JTextField textField;

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
		setTitle("GESTI\u00D3N DE VEH\u00CDCULOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 424, 0);
		contentPane.add(label);
		
		JLabel lblMatricula = new JLabel("MATRICULA:");
		lblMatricula.setBounds(38, 87, 67, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(178, 84, 117, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setBounds(38, 137, 67, 14);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(178, 134, 117, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblRemolque = new JLabel("REMOLQUE:");
		lblRemolque.setBounds(38, 185, 67, 14);
		contentPane.add(lblRemolque);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String matricula = txtMatricula.getText();
				ValidarMatricula(matricula);
				Vehiculo v = new Vehiculo(1234,"7894 JJJ","Audi A6",true);
				bd.InsertarVehiculo(v);
			}
		});
		btnGuardar.setBounds(206, 228, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(305, 228, 89, 23);
		contentPane.add(btnEliminar);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBounds(285, 181, 109, 23);
		contentPane.add(rdbtnNo);
		
		JRadioButton rdbtnSi = new JRadioButton("SI");
		rdbtnSi.setBounds(134, 181, 109, 23);
		contentPane.add(rdbtnSi);
		
		btnGroup = new ButtonGroup();

		btnGroup.add(rdbtnSi);
		btnGroup.add(rdbtnNo);
		
		textField = new JTextField();
		textField.setBounds(178, 33, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(38, 36, 46, 14);
		contentPane.add(lblId);
	}
	
	
	
	private boolean ValidarMatricula(String matricula) {
		if(matricula)
		
		
		return true;
	}
}
