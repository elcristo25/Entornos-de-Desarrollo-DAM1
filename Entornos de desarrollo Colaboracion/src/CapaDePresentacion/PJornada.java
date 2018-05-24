package CapaDePresentacion;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.Element;
import javax.swing.text.TableView.TableRow;

import CapaDeDatos.*;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.awt.event.ActionEvent;


public class PJornada extends JFrame {

	
	SimuladorBaseDeDatos db = new SimuladorBaseDeDatos();
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtFecha;
	private JTextField txtTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PJornada frame = new PJornada();
					frame.setVisible(true);
					frame.RellenarListado();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private void RellenarListado() {
		

		String[] columnas = {"ID", "Fecha", "Tipo"}; 
		String[][] datos = new String[3][db.jornadas.size()];
		if(db.jornadas.size()>0) {
			for(int i =0; i<datos[0].length;i++) {
				System.out.println(db.jornadas.get(i).getId());
				System.out.println(db.jornadas.get(i).getFecha());
				System.out.println(db.jornadas.get(i).getTipo());
				datos[0][i] = String.valueOf(db.jornadas.get(i).getId());
				datos[1][i] = String.valueOf(db.jornadas.get(i).getFecha());
				datos[2][i] = String.valueOf(db.jornadas.get(i).getTipo());
			}
		
		}

	}
	
	/**
	 * Create the frame.
	 */
	public PJornada() {
		setAutoRequestFocus(false);
		setTitle("\t\t.:.JORNADA.:.");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(73, 35, 95, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(30, 38, 33, 14);
		contentPane.add(lblId);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(73, 71, 95, 20);
		contentPane.add(txtFecha);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(30, 74, 33, 14);
		contentPane.add(lblFecha);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(73, 107, 95, 20);
		contentPane.add(txtTipo);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(30, 110, 33, 14);
		contentPane.add(lblTipo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( ValidarId(txtId.getText())) {
					if(ValidarFecha(txtFecha.getText().substring(0, 4),txtFecha.getText().substring(5, 7),txtFecha.getText().substring(8, 9))) {
						if(ValidarTipo(txtTipo.getText())) {
							int i = Integer.parseInt(txtId.getText());
							int year = Integer.valueOf(txtFecha.getText().substring(0, 4));
							int month = Integer.valueOf(txtFecha.getText().substring(5, 7));
							int day = Integer.valueOf(txtFecha.getText().substring(8, 9));
							Date d = new Date(year, month, day);
							char c = txtTipo.getText().charAt(0);
							Jornada jornada = new Jornada(i,d,c);
							db.InsertarJornada(jornada);
							RellenarListado();
						}
					}
				}
				
				
			}
		});
		btnGuardar.setBounds(243, 34, 113, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(243, 89, 113, 23);
		contentPane.add(btnEliminar);
	}
	
	private boolean ValidarId(String id) {
		
		return false;
	}
	
	private boolean ValidarFecha(String year, String month, String day) {
		
		return false;
	}
	
	private boolean ValidarTipo(String tipo) {
		
		return false;
	}
}
