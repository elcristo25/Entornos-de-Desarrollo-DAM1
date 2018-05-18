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
	private JTable table;

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
		
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		String[] datos = {"", "", ""}; // Cantidad de columnas de la tabla
		
		Iterator<Jornada> it = db.jornadas.iterator();
		if(it.hasNext()) {
			Jornada jor = it.next();
			modelo.addRow(new String[]{String.valueOf(jor.getId()),String.valueOf(jor.getFecha()),String.valueOf(jor.getTipo())});
			System.out.println(String.valueOf(jor.getId())+" "+String.valueOf(jor.getFecha())+" "+String.valueOf(jor.getTipo()));
		}
		this.table = new JTable(modelo);
		
		
		
		/*TableColumn columna = new TableColumn();
		columna.setHeaderValue("ID");
		this.table.addColumn(new TableColumn());
		
		columna = new TableColumn();
		columna.setHeaderValue("Fecha");
		this.table.addColumn(new TableColumn());
		
		columna = new TableColumn();
		columna.setHeaderValue("Tipo");
		this.table.addColumn(new TableColumn());*/
		
		
		
		
	}
	
	/**
	 * Create the frame.
	 */
	public PJornada() {
		setAutoRequestFocus(false);
		setTitle("\t\t.:.JORNADA.:.");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 522, 279);
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
		});
		btnGuardar.setBounds(40, 155, 113, 23);
		contentPane.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(40, 200, 113, 23);
		contentPane.add(btnEliminar);
		
		table = new JTable();
		table.setBounds(211, 35, 285, 195);
		contentPane.add(table);
	}
}
