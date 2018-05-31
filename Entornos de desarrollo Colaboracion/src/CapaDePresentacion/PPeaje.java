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
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = txtID.getText();
				String punto = txtPunto.getText();
				String sentido = txtSentido.getText();
				
				if(ValidarId(id)) {
					if(ValidarPunto(punto)) {
						if(ValidarSentido(sentido)) {
							Peaje peaje = new Peaje(Integer.valueOf(id),Integer.valueOf(punto),sentido.charAt(0));
							db.InsertarPeaje(peaje);
						}
					}
				}
				
				//SI TODOS LOS DATOS SON VALIDOS.
				
			}
		});
		btnNewButton.setBounds(141, 195, 89, 23);
		contentPane.add(btnNewButton);
	}
	/**
	 * Validar un id para que sea un numero entre 1 y 1000
	 * @author Mario Fernandez
	 * @param id
	 * @return
	 */
	//Debe ser un numero de 1-1000.
	public boolean ValidarId(String id) {
		   
		try {
			if(id.equals("")) {
				return false;
			}else if(Integer.valueOf(id)>1000) {
				return false;
			}else if(Integer.valueOf(id)<=0) {
				return false;
			}else {
				return true;
		}
		}catch (Exception ex) {
			return false;
		}
		
	}
	
	/**
	 * Validar un punto en el mapa en el que se marca el punto exacto del peaje
	 * @author Mario Fernandez
	 * @param punto
	 * @return
	 */
	//Debe ser un numero de 0-1000.
	public boolean ValidarPunto(String punto) {
		try {
			if(punto.equals("")) {
				return false;
			}else if(Integer.valueOf(punto)>1000) {
				return false;
			}else if(Integer.valueOf(punto)<0) {
				return false;
			}else {
				return true;
		}
		}catch (Exception ex) {
			return false;
		}
	}
	/**
	 * Validar el sentido con una I o una D segun si la direccion es Izquierda=I o Derecha=D
	 * @author Mario Fernandez
	 * @param sentido
	 * @return
	 */
	//Debe ser valido solo I o D.
	public boolean ValidarSentido(String sentido) {
		
			if(sentido.equals("I")) { 
				return true;
			}
			else if (sentido.equals("D")) {
				return true;
			}
			else 
				return false;
		
		
	}
}
