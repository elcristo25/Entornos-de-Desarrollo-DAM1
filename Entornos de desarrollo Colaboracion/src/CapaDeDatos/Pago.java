package CapaDeDatos;
import java.util.Date;

public class Pago {
	
	private int id;
	private Date fecha;
	private int hora;
	private char metodoPago;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public char getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(char metodoPago) {
		this.metodoPago = metodoPago;
	}
	
}
