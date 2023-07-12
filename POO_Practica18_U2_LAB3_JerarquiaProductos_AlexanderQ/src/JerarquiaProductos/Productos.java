//Clase Padre
package JerarquiaProductos;

public abstract class Productos {

	//declaracion de variables y arreglos
	String nomb;
	double preci;
	
	//Creacion del constructor
	public Productos(String nomb, double preci) {
		super();
		this.nomb = nomb;
		this.preci = preci;
	}

	//Creacion de los metodos getter and setter
	public String getNomb() {
		return nomb;
	}

	public void setNomb(String nomb) {
		this.nomb = nomb;
	}

	public double getPreci() {
		return preci;
	}

	public void setPreci(double preci) {
		this.preci = preci;
	}
	
	//Metodo Abstracto
	public abstract double obtenerPrecioPedido(int cant, int i);
}
