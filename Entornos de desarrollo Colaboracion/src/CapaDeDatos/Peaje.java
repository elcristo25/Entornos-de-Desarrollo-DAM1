package CapaDeDatos;
public class Peaje {
		
	private int id;
	private int punto;
	private char sentido;
	
	public Peaje(int id, int punto, char sentido) {
		this.id = id;
		this.punto = punto;
		this.sentido = sentido;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPunto() {
		return punto;
	}
	public void setPunto(int punto) {
		this.punto = punto;
	}
	public char getSentido() {
		return sentido;
	}
	public void setSentido(char sentido) {
		this.sentido = sentido;
	}

	
}
