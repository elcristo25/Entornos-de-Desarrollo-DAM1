package CapaDeDatos;
public class Trabajador {
private int id;
private String nif;
private String nombre;
private String apellidos;
private String direccion;
private String Telefono;
private boolean senior;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNif() {
	return nif;
}
public void setNif(String nif) {
	this.nif = nif;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return Telefono;
}
public void setTelefono(String telefono) {
	Telefono = telefono;
}
public boolean isSenior() {
	return senior;
}
public void setSenior(boolean senior) {
	this.senior = senior;
}
public Trabajador(int id, String nif, String nombre, String apellidos, String direccion, String telefono,
		boolean senior) {
	super();
	if(id <=0) {
		this.setId(0);
		
	}

	if(apellidos.length()<0 || apellidos.length()>35) {
		this.setApellidos("");
		
	}
	this.id = id;
	this.nif = nif;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direccion = direccion;
	Telefono = telefono;
	this.senior = senior;
}

public Trabajador(){}


}
