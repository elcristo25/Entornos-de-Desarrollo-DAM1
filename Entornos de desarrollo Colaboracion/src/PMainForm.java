import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CapaDeDatos.*;
import CapaDePresentacion.*;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PMainForm extends JFrame {

	private JPanel contentPane;
	
	SimuladorBaseDeDatos datos = new SimuladorBaseDeDatos();
	
	/**
	 * Create the frame.
	 */
	public PMainForm() {
		setTitle(".:.Gestion de Autopistas.:.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 203);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestionarTramos = new JButton("Gestionar Tramos");
		btnGestionarTramos.setBounds(22, 24, 130, 23);
		contentPane.add(btnGestionarTramos);
		
		JButton btnGestionarJornadas = new JButton("Gestionar Jornadas");
		btnGestionarJornadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PJornada panelJornada = new PJornada();
				panelJornada.setVisible(true);
			}
		});
		btnGestionarJornadas.setBounds(22, 71, 130, 23);
		contentPane.add(btnGestionarJornadas);
		
		JButton btnGestionarTareas = new JButton("Gestionar Tareas");
		btnGestionarTareas.setBounds(22, 118, 130, 23);
		contentPane.add(btnGestionarTareas);
		
		JButton btnGestionar = new JButton("Gestionar Pagos");
		btnGestionar.setBounds(326, 118, 130, 23);
		contentPane.add(btnGestionar);
		
		JButton btnGestionarPeajes = new JButton("Gestionar Peajes");
		btnGestionarPeajes.setBounds(174, 118, 130, 23);
		contentPane.add(btnGestionarPeajes);
		
		JButton btnGestionarVehiculo = new JButton("Gestionar Vehiculos");
		btnGestionarVehiculo.setBounds(174, 71, 130, 23);
		contentPane.add(btnGestionarVehiculo);
		
		JButton btnGestionarFlota = new JButton("Gestionar Flota");
		btnGestionarFlota.setBounds(174, 24, 130, 23);
		contentPane.add(btnGestionarFlota);
		
		JButton btnGestionarinformes = new JButton("GestionarInformes");
		btnGestionarinformes.setBounds(326, 24, 130, 23);
		contentPane.add(btnGestionarinformes);
		
		JButton btnGestionarTrabajadores = new JButton("Gestionar Trabajadores");
		btnGestionarTrabajadores.setBounds(326, 71, 130, 23);
		contentPane.add(btnGestionarTrabajadores);
	}
}
