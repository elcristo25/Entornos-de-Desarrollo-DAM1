package CapaDeDatos;

import java.util.ArrayList;
import java.util.Iterator;


public class SimuladorBaseDeDatos {
	public ArrayList<Jornada> jornadas = new ArrayList<>();
	public ArrayList<Tramo> tramos = new ArrayList<>();
	public ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	public ArrayList<Flota> flotas = new ArrayList<>();
	public ArrayList<Informe> informes = new ArrayList<>();
	
	
	public String InsertarJornada(Jornada _nuevaJornada) {
		return this.jornadas.add(_nuevaJornada) ? "OK" : "Error al insetar"; 
	}
	public String InsertarTramos(Tramo _nuevoTramos) {
		return this.tramos.add(_nuevoTramos) ? "OK" : "Error al insetar"; 
	}
	public String InsertarVehiculo(Vehiculo _nuevoVehiculo) {
		return this.vehiculos.add(_nuevoVehiculo) ? "OK" : "Error al insetar"; 
	}
	public String InsertarFlotas(Flotas _nuevoFlotas) {
		return this.flotas.add(_nuevoFlotas) ? "OK" : "Error al insetar"; 
	}
	public String InsertarInforme(Informe _nuevoInforme) {
		return this.informes.add(_nuevoInforme) ? "OK" : "Error al insetar"; 
	}
	
	public String BorrarJornada(int _Id) {

		Iterator<Jornada> it = jornadas.iterator();
		if(it.hasNext()) {
			Jornada next = it.next();
			if(next.getId()==_Id) {
				it.remove();
				return "OK";
			}
		}
		return "Error al borrar";
	}
	
	public String BorrarTramos(int _Id) {
		Iterator<Tramos> it = tramos.iterator();
		if(it.hasNext()) {
			Tramos next = it.next();
			if(next.getId()==_Id) {
				it.remove();
				return "OK";
			}
		}
		return "Error al borrar";
	}
	
	public String BorrarVehiculo(int _Id) {
		Iterator<Vehiculo> it = vehiculos.iterator();
		if(it.hasNext()) {
			Vehiculo next = it.next();
			if(next.getId()==_Id) {
				it.remove();
				return "OK";
			}
		}
		return "Error al borrar";
	}
	
	public String BorrarInformes(int _Id) {
		Iterator<Informes> it = informes.iterator();
		if(it.hasNext()) {
			Informes next = it.next();
			if(next.getId()==_Id) {
				it.remove();
				return "OK";
			}
		}
		return "Error al borrar";
	}
	
	public String BorrarFlotas(int _Id) {
		Iterator<Flotas> it = flotas.iterator();
		if(it.hasNext()) {
			Flotas next = it.next();
			if(next.getId()==_Id) {
				it.remove();
				return "OK";
			}
		}
		return "Error al borrar";
	}
}
