//Codigo Principal
package JerarquiaProductos;

//Libreria del Scanner
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Creacion de objetos de las clases hijas (Instanciar)
		ProductoEstandar prodest= new ProductoEstandar(null, 0, null);
		ProductoOfertado prodofer = new ProductoOfertado(null, 0, 0);
		//Escaner que permitira ingresar los datos requeridos
		Scanner tecl = new Scanner(System.in);
		
		//Declaracion de variables
		int opc, cant, can;
		double totalpE =0, totalpO=0;
		do {
			//Opcion menu
			System.out.println("------------------Jerarquia de productos------------------");
			System.out.println("1: Producto Estandar");
			System.out.println("2: Producto Ofertado");
			System.out.println("3: Mostrar total de pedido");
			System.out.println("4: Salir");
			opc = tecl.nextInt();
			
			switch(opc) {
			case 1:
				//Opcion Producto Estandar
				System.out.println("------------------Producto Estandar------------------");
				System.out.print("Cantidad de Productos a ingresar: ");
				can = tecl.nextInt();
				for(int i = 0; i < can; i++) {
					System.out.print("Nombre del producto: ");
					prodest.nomb = tecl.next();
					System.out.print("Seccion: ");
					prodest.seccion = tecl.next();
					System.out.print("Cantidad: ");
					cant = tecl.nextInt();
					System.out.print("Precio: ");
					prodest.preci = tecl.nextDouble();
					
					prodest.obtenerPrecioPedido(cant, i);;
					totalpE =  totalpE+ prodest.precifin[i];
					System.out.println("-----------------------------------------------------");
				}
				break;
			case 2:
				//Opcion Producto Ofertado
				System.out.println("------------------Producto Ofertado------------------");
				System.out.print("Cantidad de Productos a ingresar: ");
				can = tecl.nextInt();
				for(int i = 0; i < can; i++) {
					System.out.print("Nombre del producto: ");
					prodofer.nomb = tecl.next();
					System.out.print("Dias de oferta: ");
					prodofer.dias = tecl.nextInt();
					System.out.print("Cantidad: ");
					cant = tecl.nextInt();
					System.out.print("Precio: ");
					prodofer.preci = tecl.nextDouble();
					
					prodofer.obtenerPrecioPedido(cant, i);
					totalpO = totalpO + prodofer.precifin[i];
					System.out.println("-----------------------------------------------------");
				}
				break;
			case 3:
				//Opcion total del pedido
				System.out.println("------------------Total del pedido-------------------");
				double total = totalpE + totalpO;
				System.out.println("Total a pagar: "+total);
				break;
			case 4:
				System.out.println("Muchas Gracias por preferirnos...Saliendo...");
				break;
			default:
				System.out.println("No existe la opcion seleccionada, vuelva a intentarlo");
				break;
			}
		}while(opc != 4);
		
		
	}

}
