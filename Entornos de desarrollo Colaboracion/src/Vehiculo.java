
public class Vehiculo {
	
	private String matricula;
	private String modelo;
	private boolean remolque;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String matricula, String modelo, boolean remolque) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.remolque = remolque;
	}
	
	public Vehiculo(Vehiculo v) {
		this.matricula = v.matricula;
		this.modelo = v.modelo;
		this.remolque = v.remolque;
	}
}
