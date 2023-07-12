//Clase Hija
package JerarquiaProductos;

public class ProductoOfertado extends Productos {

	//declaracion de variables y arreglos
	int dias;
	double[] precifin = new double[100];
	
	//Creacion del constructor
	public ProductoOfertado(String nomb, double preci, int dias) {
		super(nomb, preci);
		this.dias = dias;
	}

	//Creacion de los metodos getter and setter
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	//Sobreescritura deñl metodo abstracto
	@Override
	public double obtenerPrecioPedido(int cant, int i) {
		if(dias == 1) {
			double subtotal = preci*cant;
			double desc = subtotal * 0.20;
			precifin[i] = subtotal - desc;
			System.out.println("Subtotal: "+subtotal);
			System.out.println("Descuento: "+desc);
			System.out.println("Precio Final: "+precifin[i]);
		}if((dias >=1)&&(dias <=2)) {
			double subtotal = preci*cant;
			double desc = subtotal * 0.15;
			precifin[i] = subtotal - desc;
			System.out.println("Subtotal: "+subtotal);
			System.out.println("Descuento: "+desc);
			System.out.println("Precio Final: "+precifin[i]);
		}if(dias > 2) {
			double subtotal = preci*cant;
			double desc = subtotal * 0.10;
			precifin[i] = subtotal - desc;
			System.out.println("Subtotal: "+subtotal);
			System.out.println("Descuento: "+desc);
			System.out.println("Precio Final: "+precifin[i]);
		}
		
		return precifin[i];
	}
}
