package CapaDeNegocio;
/***
 * 
 * @author dam120
 *
 */
public class Tarea {
	
	private int id;
	private Jornada jornada;
	private Tramo tramo;
	
	public Tarea() {
		
	}
	
	public Tarea(int _id, Jornada _idJornada, Tramo _idTramo) {
		this.id = _id;
		this.jornada = _idJornada;
		this.tramo = _idTramo;
	}
	
	public Tarea(Tarea _tarea) {
		this.id = _tarea.getId();
		this.jornada = _tarea.getJornada();
		this.tramo = _tarea.getTramo();
	}

	public int getId() {
		return id;
	}

	public Jornada getJornada() {
		return jornada;
	}

	public Tramo getTramo() {
		return tramo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setJornada(Jornada jornada) {
		this.jornada = jornada;
	}

	public void setTramo(Tramo tramo) {
		this.tramo = tramo;
	}

	
	
}
