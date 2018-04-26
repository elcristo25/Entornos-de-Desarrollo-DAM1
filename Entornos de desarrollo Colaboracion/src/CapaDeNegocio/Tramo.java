package CapaDeNegocio;
/**
 * 
 * @author dam120
 *
 */
public class Tramo{
	
	private int id;
	private int inicio;
	private int fin;
	private int numPaneles;
	
	public Tramo() {
		
	}
	
	public Tramo(int _id, int _inicio, int _fin, int _numPaneles) {
		this.id = _id;
		this.inicio = _inicio;
		this.fin = _fin;
		this.numPaneles = _numPaneles;
	}
	
	public Tramo(Tramo _tramo) {
		this.id = _tramo.getId();
		this.inicio = _tramo.getInicio();
		this.fin = _tramo.getFin();
		this.numPaneles = _tramo.getNumPaneles();
	}

	public int getId() {
		return id;
	}

	public int getInicio() {
		return inicio;
	}

	public int getFin() {
		return fin;
	}

	public int getNumPaneles() {
		return numPaneles;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public void setNumPaneles(int numPaneles) {
		this.numPaneles = numPaneles;
	}
	
	
}
