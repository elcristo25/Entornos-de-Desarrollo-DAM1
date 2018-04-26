package CapaDeNegocio;
import java.sql.Date;
/**
 * 
 * @author dam120
 *
 */
public class Jornada {
	
	private int id;
	private Date fecha;
	private char tipo;
	
	public Jornada() {
		
	}
	
	public Jornada(int _id,Date _fecha, char _tipo) {
		this.id = _id;
		this.fecha = _fecha;
		this.tipo = _tipo;
	}
	
	public Jornada(Jornada _jornada) {
		this.id = _jornada.getId();
		this.fecha = _jornada.getFecha();
		this.tipo = _jornada.getTipo();
	}

	public Date getFecha() {
		return fecha;
	}

	public char getTipo() {
		return tipo;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
