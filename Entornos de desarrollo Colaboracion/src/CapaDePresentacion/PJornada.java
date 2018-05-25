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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
	/**
	 * Método que valida un identificador para la jornada. Serán válidos los identificadores formados por un número de hasta 3 dígitos mayores que 0.
	 * @param id String que almacena el identificador a validar.
	 * @return True en caso de ser un identificador válido, false en caso contrario.
	 */
	private boolean ValidarId(String id) {
		try {
			int i = Integer.parseInt(id);
			if(i>0 && i<999) {
				return true;
			}
			return false;
		}catch(Exception ex) {
			return false;
		}
		
	}
	/**
	 * Método que valida una fecha introducida mediante 3 strings. Será válido si la fecha existe.
	 * @param year String que almacena el año de la fecha.
	 * @param month String que almacena el mes de la fecha.
	 * @param day Strign que almacena el día de la fecha.
	 * @return True si la fecha es válida, false en caso contrario.
	 */
	private boolean ValidarFecha(String year, String month, String day) {
		try {
			Date fecha  = new Date(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	/**
	 * Método que valida el tipo de jornada. Sólo son válidos C, jornada Completa; o P, jornada Parcial.
	 * @param tipo Cadena string que almacena el tipo de jornada. 
	 * @return True si la jornada es válida, false en caso contrario.
	 */
	private boolean ValidarTipo(String tipo) {
		if(tipo.length()==1 && (tipo.charAt(0)=='C' || tipo.charAt(0)=='P')) {
			return true;
		}
		return false;
	}
}
