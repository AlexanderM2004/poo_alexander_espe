package Herencia;

import java.util.*;

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = new Scanner(System.in);
		Cuadrado cua = new Cuadrado();
		HerenciaP rec = new HerenciaP();
		
		int opc, op;
		float medi, mediA, mediB;
		
		do {
			System.out.println("--------------CALCULADORA DE AREAS Y PERIMETROS--------------");
			
			System.out.println("1: Calcular Areas");
			System.out.println("2: Calcular Perimetros");
			System.out.println("3: Salir");
			opc = lectura.nextInt();
			
			if (opc == 1) {
				System.out.println("--------------------CALCULADORA DE AREAS---------------------");
				System.out.println("1: Cuadrado");
				System.out.println("2: Rectangulo");
				System.out.println("3: Triuangulo");
				System.out.println("4: Pentagono");
				op = lectura.nextInt();
				
				switch (op) {
				case 1:
					System.out.println("--------------AREA--------------");
					System.out.print("Ingrese medida del cuadrado: ");
					medi = lectura.nextFloat();
					System.out.println("Area: "+ cua.areaC(medi));
					break;
				case 2:
					System.out.println("--------------AREA--------------");
					System.out.print("Ingrese medida del lado A del rectangulo: ");
					mediA = lectura.nextFloat();
					System.out.print("Ingrese medida del lado B del rectangulo: ");
					mediB = lectura.nextFloat();
					System.out.println("Area: "+ rec.areaR(mediA, mediB));
					break;
				case 3:
					System.out.println("Muchas Gracias... Saliendo ...");
					break;
				case 4:
					System.out.println("Muchas Gracias... Saliendo ...");
					break;
				default:
					System.out.println("No existe la opcion seleccionada");
					break;
				}
				
			}else {
				
				System.out.println("--------------------CALCULADORA DE PERIMETROS---------------------");
				System.out.println("1: Cuadrado");
				System.out.println("2: Rectangulo");
				System.out.println("3: Triuangulo");
				System.out.println("4: Pentagono");
				op = lectura.nextInt();
				
				switch (op) {
				case 1:
					System.out.println("--------------PERIMETRO--------------");
					System.out.print("Ingrese medida del cuadrado: ");
					medi = lectura.nextFloat();
					System.out.println("Perimetro: "+ cua.perimetroC(medi));
					break;
				case 2:
					System.out.println("--------------PERIMETRO--------------");
					System.out.print("Ingrese medida del lado A del rectangulo: ");
					mediA = lectura.nextFloat();
					System.out.print("Ingrese medida del lado B del rectangulo: ");
					mediB = lectura.nextFloat();
					System.out.println("Area: "+ rec.perimetroR(mediA, mediB));
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				default:
					System.out.println("No existe la opcion seleccionada");
					break;
				}
				
			}
			
		}while(opc != 3);
		
	}

}
