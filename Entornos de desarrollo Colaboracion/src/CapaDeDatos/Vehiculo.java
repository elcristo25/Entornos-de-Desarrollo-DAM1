package CapaDeDatos;
/**
 * @author: Jesus Ruiz Alonso
 */
public class Vehiculo {
	private int id;
	private String matricula;
	private String modelo;
	private boolean remolque;
	private Informe in;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(int id,String matricula, String modelo, boolean remolque, Informe in) {
		this.id=id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.remolque = remolque;
		this.in=in;
	}
	
	//USAR ESTE
	public Vehiculo(int id,String matricula, String modelo, boolean remolque) {
		this.id=id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.remolque = remolque;
	}
	
	public Vehiculo(Vehiculo v) {
		this.id=v.id;
		this.matricula = v.matricula;
		this.modelo = v.modelo;
		this.remolque = v.remolque;
		this.in=v.in;
	}
	
	public int getId() {
		return  id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isRemolque() {
        return remolque;
    }

    public void setRemolque(boolean remolque) {
        this.remolque = remolque;
    }
    
    public Informe getIn() {
    	return in;
    }
    
    public void setIn(Informe in) {
    	this.in=in;
    }

    }
