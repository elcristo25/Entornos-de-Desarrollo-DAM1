
public class Informe {
	private int id;
    private String descripcion;
    private Flota fl;

    public Informe(int id, String descripcion, Flota fl) {
        this.id = id;
        this.descripcion = descripcion;
        this.fl=fl;
    }

    public Informe() {
    }
    
    public Informe(Informe i) {
    	this.id=i.id;
    	this.descripcion=i.descripcion;
    	this.fl=i.fl;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Flota getFl() {
    	return fl;
    }
    
    public void setfl(Flota fl) {
    	this.fl=fl;
    }
}
