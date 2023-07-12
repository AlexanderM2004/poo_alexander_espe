//Clase hija
package JerarquiaProductos;

public class ProductoEstandar extends Productos{

	
	//declaracion de variables y arreglos
	String seccion;
	double[] precifin = new double[100];
	
	//Creacion del constructor
	public ProductoEstandar(String nomb, double preci, String seccion) {
		super(nomb, preci);
		this.seccion = seccion;
	}

	//Creacion de los metodos getter and setter
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	//Sobreescritura deñl metodo abstracto
	@Override
	public double obtenerPrecioPedido(int cant, int i) {
		if(cant >=5) {
			double subtotal = preci*cant;
			double desc = subtotal * 0.10;
			precifin[i] = subtotal - desc;
			System.out.println("Subtotal: "+subtotal);
			System.out.println("Descuento: "+desc);
			System.out.println("Precio Final: "+precifin[i]);
			
		}else {
			double subtotal = preci*cant;
			precifin[i] = subtotal;
			System.out.println("Precio Final: "+precifin[i]);
		}
		
		return precifin[i];
	}
}
