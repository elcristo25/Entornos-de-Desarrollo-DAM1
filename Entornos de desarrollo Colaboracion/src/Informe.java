
public class Informe {
	private int id;
    private String descripcion;

    public Informe(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Informe() {
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
}
