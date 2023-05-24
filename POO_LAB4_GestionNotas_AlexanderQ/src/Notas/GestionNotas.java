package Notas;
import java.util.Scanner;

public class GestionNotas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto
		GestionNot gnot1 = new GestionNot();
		
		int opc;
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		
		do {
			System.out.println("1: Añadir Nota");
			System.out.println("2: Ver Media");
			System.out.println("3: Ver Aprovados/Reprovados");
			System.out.println("4: Salir");
			opc = Integer.parseInt(sc.nextLine());
			
			switch (opc) {
			case 1:
				System.out.println("Ingrese Nota");
				notas = Double.parseDouble(sc.nextLine());
				gnot1.guardarNot(notas);
				break;
			case 2:
				System.out.println("La media es: "+gnot1.media());
				break;
			case 3:
				System.out.println("Aprovados: "+gnot1.aprobados());
				break;
			case 4:
				System.out.println("Saliendo ...");
				break;
			default:
				System.out.println("Seleccione la opcion correcta...Intente Nuevamente");
				break;
			}
		}while (opc != 4);
	}

}
