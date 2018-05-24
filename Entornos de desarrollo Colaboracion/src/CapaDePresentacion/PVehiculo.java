package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PVehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtModelo;
	private JTextField txtRemolque;

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
		lblMatricula.setBounds(38, 28, 113, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(161, 25, 117, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setBounds(38, 79, 113, 14);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(161, 76, 117, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblRemolque = new JLabel("REMOLQUE:");
		lblRemolque.setBounds(38, 129, 113, 14);
		contentPane.add(lblRemolque);
		
		txtRemolque = new JTextField();
		txtRemolque.setBounds(161, 126, 117, 20);
		contentPane.add(txtRemolque);
		txtRemolque.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGuardar.setBounds(206, 228, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(305, 228, 89, 23);
		contentPane.add(btnEliminar);
	}

}
