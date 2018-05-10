package CapaDeDatos;

import java.util.ArrayList;


public class SimuladorBaseDeDatos {
	ArrayList<Jornada> jornadas;
	ArrayList<Tramo> tramos;
	ArrayList<Tarea> tareas;
	
	public String InsertarJornada(Jornada _nuevaJornada) {
		return this.jornadas.add(_nuevaJornada) ? "OK" : "Error al insetar"; 
	}
	
	public String InsertarTramo(Tramo _nuevoTramo) {
		return this.tramos.add(_nuevoTramo) ? "OK" : "Error al insetar"; 
	}
	
	public String InsertarTarea(Tarea _nuevaTarea) {
		return this.tareas.add(_nuevaTarea) ? "OK" : "Error al insetar"; 
	}
}
