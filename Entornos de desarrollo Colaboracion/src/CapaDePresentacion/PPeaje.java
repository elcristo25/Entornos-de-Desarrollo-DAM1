package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CapaDeDatos.Peaje;
import CapaDeDatos.SimuladorBaseDeDatos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PPeaje extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtPunto;
	private JTextField txtSentido;
	private SimuladorBaseDeDatos db = new SimuladorBaseDeDatos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PPeaje frame = new PPeaje();
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
	public PPeaje() {
		setTitle("Gestion de PPeaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(22, 41, 46, 14);
		contentPane.add(lblId);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(101, 38, 192, 20);
		contentPane.add(txtID);
		
		JLabel lblPunto = new JLabel("Punto");
		lblPunto.setBounds(22, 82, 46, 14);
		contentPane.add(lblPunto);
		
		txtPunto = new JTextField();
		txtPunto.setColumns(10);
		txtPunto.setBounds(101, 79, 192, 20);
		contentPane.add(txtPunto);
		
		JLabel lblSentido = new JLabel("Sentido");
		lblSentido.setBounds(22, 126, 46, 14);
		contentPane.add(lblSentido);
		
		txtSentido = new JTextField();
		txtSentido.setColumns(10);
		txtSentido.setBounds(101, 123, 192, 20);
		contentPane.add(txtSentido);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = txtID.getText();
				String punto = txtPunto.getText();
				String sentido = txtSentido.getText();
				
				
				
				//SI TODOS LOS DATOS SON VALIDOS.
				Peaje peaje = new Peaje(//////////////);
				db.InsertarPeaje(peaje);
			}
		});
		btnNewButton.setBounds(141, 195, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	private boolean ValidarId() {
		
	}
	//Debe ser un numero de 0-1000 y acabar en KM.
	private boolean ValidarPunto() {
		
	}
	//Debe ser valido solo Izquierda o Derecha.
	private boolean ValidarSentido() {
		if(izquierda o derecha)
			return true;
		else
			return false;
	}
}
