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
		Trabajador t= new Trabajador();
		Trabajador t2 = new Trabajador(9, "45781245Ñ", "nombre", "apell", "dir", "-4444", false);
		
		setTitle(".:.Gestion de Autopistas.:.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 233);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestionarPagos = new JButton("Gestionar Pagos");
		btnGestionarPagos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PPago panelPago = new PPago();
				panelPago.setVisible(true);
			}
		});
		btnGestionarPagos.setBounds(33, 30, 161, 23);
		contentPane.add(btnGestionarPagos);
		
		JButton btnGestionarJornadas = new JButton("Gestionar Jornadas");
		btnGestionarJornadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PJornada panelJornada = new PJornada();
				panelJornada.setVisible(true);
			}
		});
		btnGestionarJornadas.setBounds(227, 109, 182, 23);
		contentPane.add(btnGestionarJornadas);
		
		JButton btnGestionarTramos = new JButton("Gestionar Tramos");
		btnGestionarTramos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PTramo panelTramo = new PTramo();
				panelTramo.setVisible(true);
			}
			
		});
		btnGestionarTramos.setBounds(33, 136, 161, 23);
		contentPane.add(btnGestionarTramos);
		
		JButton btnGestionarPeajes = new JButton("Gestionar Peajes");
		btnGestionarPeajes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PPeaje panelPeaje = new PPeaje();
				panelPeaje.setVisible(true);
			}
		});
		btnGestionarPeajes.setBounds(442, 136, 169, 23);
		contentPane.add(btnGestionarPeajes);
		
		JButton btnGestionarVehiculo = new JButton("Gestionar Vehiculos");
		btnGestionarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PVehiculo panelVehiculo = new PVehiculo();
				panelVehiculo.setVisible(true);
			}
		});
		btnGestionarVehiculo.setBounds(33, 83, 161, 23);
		contentPane.add(btnGestionarVehiculo);
		
		JButton btnGestionarFlota = new JButton("Gestionar Flota");
		btnGestionarFlota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PFlota panelFlota = new PFlota();
				panelFlota.setVisible(true);
			}
		});
		btnGestionarFlota.setBounds(442, 83, 169, 23);
		contentPane.add(btnGestionarFlota);
		
		JButton btnGestionarinformes = new JButton("Gestionar Informes");
		btnGestionarinformes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PInforme panelInforme = new PInforme();
				panelInforme.setVisible(true);
			}
		});
		btnGestionarinformes.setBounds(443, 30, 169, 23);
		contentPane.add(btnGestionarinformes);
		
		JButton btnGestionarTrabajadores = new JButton("Gestionar Trabajadores");
		btnGestionarTrabajadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PTrabajador panelTrabajador = new PTrabajador();
				panelTrabajador.setVisible(true);
			}
		});
		btnGestionarTrabajadores.setBounds(227, 52, 183, 23);
		contentPane.add(btnGestionarTrabajadores);
	}
}
