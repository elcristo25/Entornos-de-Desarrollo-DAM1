package TestingPackage;

import CapaDeDatos.Flota;
import CapaDeDatos.Informe;
import CapaDeDatos.Jornada;
import CapaDeDatos.Tramo;
import CapaDeDatos.Vehiculo;

public interface ISimuladorBaseDeDatos {

	String InsertarJornada(Jornada _nuevaJornada);

	String InsertarTramos(Tramo _nuevoTramos);

	String InsertarVehiculo(Vehiculo _nuevoVehiculo);

	String InsertarFlotas(Flota _nuevoFlotas);

	String InsertarInforme(Informe _nuevoInforme);

	String BorrarJornada(int _Id);

	String BorrarTramos(int _Id);

	String BorrarVehiculo(int _Id);

	String BorrarInformes(int _Id);

	String BorrarFlotas(int _Id);

	String BorrarPago(int _Id);

	String BorrarPeaje(int _Id);

	String BorrarTrabajador(int _Id);

}