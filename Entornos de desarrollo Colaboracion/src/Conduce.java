
public class Conduce {
	private Trabajador tr;
	private Vehiculo ve;

	public Conduce() {
	
	}

	public Conduce(Trabajador tr, Vehiculo ve) {
		this.tr=tr;
		this.ve=ve;
	}

	public Conduce(Conduce c) {
		this.tr=c.tr;
		this.ve=c.ve;
	}

	public Trabajador getTr() {
		return tr;
	}

	public void setTr(Trabajador tr) {
		this.tr = tr;
	}

	public Vehiculo getVe() {
		return ve;
	}

	public void setVehiculo(Vehiculo ve) {
		this.ve=ve;
	}
}
