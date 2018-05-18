package CapaDeDatos;

import java.util.ArrayList;


public class SimuladorBaseDeDatos {
	public ArrayList<Jornada> jornadas = new ArrayList<>();
	public ArrayList<Tramo> tramos = new ArrayList<>();
	
	public String InsertarJornada(Jornada _nuevaJornada) {
		return this.jornadas.add(_nuevaJornada) ? "OK" : "Error al insetar"; 
	}
	
	public String InsertarTramo(Tramo _nuevoTramo) {
		return this.tramos.add(_nuevoTramo) ? "OK" : "Error al insetar"; 
	}
	
}
