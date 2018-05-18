package CapaDePresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class PTramo extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtInicio;
	private JTextField txtFin;
	private JTextField txtNumPeajes;
	private ButtonGroup btnGroup;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTramo frame = new PTramo();
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
	public PTramo() {
		setTitle(".:.GESTION DE TRAMOS.:.");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 522, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(116, 34, 104, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(43, 37, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblInicio = new JLabel("INICIO:");
		lblInicio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInicio.setBounds(43, 91, 46, 14);
		contentPane.add(lblInicio);
		
		JLabel lblFin = new JLabel("FIN:");
		lblFin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFin.setBounds(43, 145, 46, 14);
		contentPane.add(lblFin);
		
		JLabel lblPeajes = new JLabel("NUM. PEAJES:");
		lblPeajes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeajes.setBounds(10, 198, 79, 14);
		contentPane.add(lblPeajes);
		
		txtInicio = new JTextField();
		txtInicio.setColumns(10);
		txtInicio.setBounds(116, 88, 104, 20);
		contentPane.add(txtInicio);
		
		txtFin = new JTextField();
		txtFin.setColumns(10);
		txtFin.setBounds(116, 142, 104, 20);
		contentPane.add(txtFin);
		
		txtNumPeajes = new JTextField();
		txtNumPeajes.setColumns(10);
		txtNumPeajes.setBounds(116, 196, 104, 20);
		contentPane.add(txtNumPeajes);
		
		JRadioButton rdbtnTramoControlado = new JRadioButton("Tramo controlado");
		rdbtnTramoControlado.setBounds(275, 61, 160, 23);
		contentPane.add(rdbtnTramoControlado);
		
		JRadioButton rdbtnTramoNoControlado = new JRadioButton("Tramo no controlado");
		rdbtnTramoNoControlado.setBounds(275, 141, 160, 23);
		contentPane.add(rdbtnTramoNoControlado);
		
		btnGroup = new ButtonGroup();
		
		btnGroup.add(rdbtnTramoControlado);
		btnGroup.add(rdbtnTramoNoControlado);
	}
}
