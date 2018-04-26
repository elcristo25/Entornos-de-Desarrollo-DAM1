package CapaDeDatos;
/**
 * 
 * @author dam120
 *
 */
public class TNoControlado extends Tramo{
	
	private double desnivel;
	
	public TNoControlado() {
		
	}
	
	public TNoControlado(int _id, int _inicio, int _fin, int _numPaneles) {
		super(_id, _inicio, _fin, _numPaneles);
		
	}
	
	public TNoControlado(TNoControlado _tnocontrolado) {
		super(_tnocontrolado);
		this.desnivel = _tnocontrolado.getDesnivel();
		
	}
	
	public double getDesnivel() {
		return this.desnivel;
	}
	
	public void setDesnivel(double _desnivel) {
		this.desnivel=_desnivel;
	}

}
