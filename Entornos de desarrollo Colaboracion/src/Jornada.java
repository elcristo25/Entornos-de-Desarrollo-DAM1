import java.sql.Date;

/**
 * 
 * @author dam120
 *
 */
public class Jornada {
	
	private Date fecha;
	private char tipo;
	
	public Jornada() {
		
	}
	
	public Jornada(Date _fecha, char _tipo) {
		this.fecha = _fecha;
		this.tipo = _tipo;
	}
	
	public Jornada(Jornada _jornada) {
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
	
	
	
}
