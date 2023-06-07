package Evaluacion1;
//Importar libreria
	import java.util.Scanner;
public class Inventario_1 {
	//Arreglos
	String[] procc = null;
	float[] pvp = null;
	String[] provee = null;
	float[] producc = null;
	float[] cantid = null;
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
	
	//Ingresar Pedido
	public void ingrepedido(int prod) {
		int j = 1,opci, opca, can;
		float precio = 0, aux=0;
		System.out.println("Menu de productos disponible");
		for (int i = 0; i < prod; i++) {
			System.out.println(j +"Producto: " + procc[i]);
			System.out.println("PVP: "+pvp[i]);
			j++;
		}
		
		System.out.println("--------------------------------------------");
		System.out.print("Cantidad de productos a facturar: ");
		can = tecla.nextInt();
		
		producc = new float[can];
		cantid = new float[can];
		for (int i = 0; i < can ;i++) {
			System.out.print("Producto: ");
			opci = tecla.nextInt();
			System.out.print("Cantidad: ");
			opca = tecla.nextInt();
			
			System.out.print(procc[opci]+" | "+provee[opci]+" | "+pvp[opci]+" | "+opca);
			
			precio = pvp[opci]*opca;
			aux += precio;
			
			producc[i]=opci;
			cantid[i]=opca;
		}
		System.out.println("El total a facturar es: "+aux);
	}
	
	public void ordenamiento(int prod) {
		for (int i = 0; i < cantid.length -1; i++) {
            for (int j =0; j < cantid.length -1; j++){
                if (cantid[ j ] > cantid[j+1]){
                    float aux = cantid[j];
		            cantid[ j ] = cantid[j +1]; 
		            cantid[ j+1 ] = aux;
		    		System.out.println("El pedido mayor es: "+ cantid[j+1]);
                }
            }
		}
	}
	
	
}
