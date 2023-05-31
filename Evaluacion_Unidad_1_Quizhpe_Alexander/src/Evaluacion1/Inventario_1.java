package Evaluacion1;
//Importar libreria
	import java.util.Scanner;
public class Inventario_1 {
	//Arreglos
	String[] procc = null;
	float[] pvp = null;
	String[] provee = null;
	Scanner tecla = new Scanner(System.in);
	
	public Inventario_1() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void IngresarProduc(int prod) {
		//Dar tamaño al arreglo
		procc = new String[prod];
		pvp = new float[prod];
		provee = new String[prod];
		
		//Ingresar datos al arreglo
		for (int i = 0; i < prod; i++) {
			tecla.nextLine(); // Esperar tecla
			System.out.print("Nombre del producto: ");
			procc[i] = tecla.nextLine();
			System.out.print("PVP del producto: ");
			pvp[i] = tecla.nextFloat();
			System.out.print("Provedor del producto: ");
			provee[i] = tecla.nextLine();
		}
	}
	
	//Mostrar datos al arreglo producto
	public void mostrarprod(int prod) {
		//Mostrar datos al arreglo producto
		for (int i = 0; i < prod; i++) {
			System.out.println("Producto: " + procc[i]);
			System.out.println("PVP: "+pvp[i]);
		}
	}
	
	//Mostrar datos al arreglo proveedor
	public void mostrarprovee(int prod) {
		//Mostrar datos al arreglo proveedor
		for (int i = 0; i < prod; i++) {
			System.out.println("Proveedor: " + provee[i]);
		}
	}
	
	public void ingrepedido(int prod) {
		System.out.println("Menu de productos disponible");
		for (int i = 0; i < prod; i++) {
			System.out.println("Producto: " + procc[i]);
			System.out.println("PVP: "+pvp[i]);
		}
		System.out.println(" ");
	}

}
