package Evaluacion1;

//Llamar a librerias
import java.util.Scanner;

public class Evaluacion_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
				int opc, prod = 0;
				int cant;
				boolean marc = false;
						
				//Creacion de objetos
				Scanner tecla = new Scanner(System.in);
				Inventario_1 inven = new Inventario_1();
				
				do {
					System.out.println("------------------------------------SISTEMA DE FACTURACION------------------------------------");
					System.out.println("1: Ingresar Productos y Proveedores");
					System.out.println("2: Mostrar Productos");
					System.out.println("3: Mostrar Proveedores");
					System.out.println("4: Nuevo pedido");
					System.out.println("5: Pedido mayor");
					System.out.println("6: Total facturado");
					System.out.println("7: Salir");
					opc = tecla.nextInt();
					
					switch (opc) {
						case 1:
							marc = true;
							System.out.println("INGRESAR PRODUCTO");
							System.out.println("Cantidad de productos a ingresar: ");
							prod = tecla.nextInt();
							inven.IngresarProduc(prod);
							break;
						case 2:
							if(marc) {
								System.out.println("MOSTRAR PRODUCTOS");
								inven.mostrarprod(prod);
							}else {
								System.out.println("No se puede realizar la accion, por favor primero ingrese Productos");
							}
							break;
						case 3:
							if(marc) {
								System.out.println("MOSTRAR PROVEEDORES");
								inven.mostrarprovee(prod);
							}else {
								System.out.println("No se puede realizar la accion, por favor primero ingrese Provedor");
							}
							break;
						case 4:
							if(marc) {
								System.out.println("INGRESAR PEDIDOS");
								//inven.ingrepedido(prod);
							}else {
								System.out.println("No se puede realizar la accion, por favor primero ingrese inventario (Productos, Provedor)");
							}
							break;
						case 5:
							
							break;
						case 6: 
							if(marc) {
								
							}else {
								System.out.println("No se puede realizar la accion, por favor primero ingrese un pedido");
							}
							break;
						case 7: 
							System.out.println("Muchas gracias por preferirnos, ... Saliendo...");
							break;
						default:
							System.out.println("Opcion ingresada no valida, por favor ingresar dato de nuevo");
							break;
					}
				}while(opc != 6 );
				tecla.close();
				

	}

}
