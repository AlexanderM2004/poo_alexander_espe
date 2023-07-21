package GestionPersonal;

//Importar la libreria java.util.Scanner
import java.util.*;
public class Main {
	public static void main(String[] args) {
		//Instanciar objetos
		Docente docen = new Docente(null, 0, 0, 0, 0, 0, null, null);
		Tecnico tec = new Tecnico(null, 0, 0, 0, 0, 0, null, null);
		Administrativo admi = new Administrativo(null, 0, 0, 0, 0, 0, null, null);
		Limpieza limp = new Limpieza(null, 0, 0, 0, 0, 0, null);
		
		//Scanner para ingresar texto
		Scanner tecla = new Scanner(System.in);
		
		//Declaracion de variables
		int opc;
		boolean marc;
		
		do {
			System.out.println("---------------------GESTION DE COMISIONES---------------------");
			System.out.println("1: Personal Docente");
			System.out.println("2: Personal Tecnico");
			System.out.println("3: Personal Administratio");
			System.out.println("4: Personal Limpieza");
			System.out.println("5: Salir");
			opc = tecla.nextInt();
			tecla.nextLine();
			switch(opc) {
			case 1:
				System.out.println("-----------------------PERSONAL DOCENTE------------------------");
				System.out.print("Nombre: ");
				docen.nombre = tecla.nextLine();
				System.out.print("Edad: ");
				docen.edad = tecla.nextInt();
				System.out.print("Cedula: ");
				docen.ci = tecla.nextLong();
				System.out.print("Años de trabajo: ");
				docen.añostraba = tecla.nextInt();
				System.out.print("Hijos: ");
				docen.hijos = tecla.nextInt();
				System.out.print("Sueldo: ");
				docen.sueldo = tecla.nextFloat();
				tecla.nextLine();
				System.out.print("Area: ");
				docen.Area = tecla.nextLine();
				System.out.print("Titulo: ");
				docen.titulo = tecla.nextLine();
				System.out.println("¿Estas estudiando?: ");
				System.out.println("1: Si");
				System.out.println("2: No: ");
				int op = tecla.nextInt();
				
				if (op == 1) {
					marc = true;
				}else {
					marc = false;
				}
				
				System.out.println("-------------------------Metodo de bonificacion------------------------");
				System.out.println("1: Cantidad de hijos");
				System.out.println("2: Cantidad de años de trabajo");
				int opcin = tecla.nextInt();
				switch (opcin) {
				case 1:
					System.out.println("---------------------------Cantidad de hijos---------------------------");
					docen.PagoComisionHijos(docen.hijos, marc);
					break;
				case 2:
					System.out.println("-----------------------Cantidad de años de trabajo---------------------");
					docen.PagoComisionAños(docen.añostraba, marc);
					break;
				}
				break;
				
			case 2:
				System.out.println("-----------------------PERSONAL TECNICO------------------------");
				System.out.print("Nombre: ");
				tec.nombre = tecla.nextLine();
				System.out.print("Edad: ");
				tec.edad = tecla.nextInt();
				System.out.print("Cedula: ");
				tec.ci = tecla.nextLong();
				System.out.print("Años de trabajo: ");
				tec.añostraba = tecla.nextInt();
				System.out.print("Hijos: ");
				tec.hijos = tecla.nextInt();
				System.out.print("Sueldo: ");
				tec.sueldo = tecla.nextFloat();
				tecla.nextLine();
				System.out.print("Area: ");
				tec.Area = tecla.nextLine();
				System.out.print("Titulo: ");
				tec.titulo = tecla.nextLine();
				System.out.println("¿Estas estudiando?: ");
				System.out.println("1: Si");
				System.out.println("2: No: ");
				op = tecla.nextInt();
				
				if (op == 1) {
					marc = true;
				}else {
					marc = false;
				}
				
				System.out.println("-------------------------Metodo de bonificacion------------------------");
				System.out.println("1: Cantidad de hijos");
				System.out.println("2: Cantidad de años de trabajo");
				opcin = tecla.nextInt();
				switch (opcin) {
				case 1:
					System.out.println("---------------------------Cantidad de hijos---------------------------");
					tec.PagoComisionHijos(docen.hijos, marc);
					break;
				case 2:
					System.out.println("-----------------------Cantidad de años de trabajo---------------------");
					tec.PagoComisionAños(docen.añostraba, marc);
					break;
				}
				break;
				
			case 3:
				System.out.println("--------------------PERSONAL ADMINISTRATIVO--------------------");
				System.out.print("Nombre: ");
				admi.nombre = tecla.nextLine();
				System.out.print("Edad: ");
				admi.edad = tecla.nextInt();
				System.out.print("Cedula: ");
				admi.ci = tecla.nextLong();
				System.out.print("Años de trabajo: ");
				admi.añostraba = tecla.nextInt();
				System.out.print("Hijos: ");
				admi.hijos = tecla.nextInt();
				System.out.print("Sueldo: ");
				admi.sueldo = tecla.nextFloat();
				tecla.nextLine();
				System.out.print("Departamento: ");
				admi.Departamento = tecla.nextLine();
				System.out.print("Titulo: ");
				admi.titulo = tecla.nextLine();
				System.out.println("¿Estas estudiando?: ");
				System.out.println("1: Si");
				System.out.println("2: No: ");
				op = tecla.nextInt();
				
				if (op == 1) {
					marc = true;
				}else {
					marc = false;
				}
				
				System.out.println("-------------------------Metodo de bonificacion------------------------");
				System.out.println("1: Cantidad de hijos");
				System.out.println("2: Cantidad de años de trabajo");
				opcin = tecla.nextInt();
				switch (opcin) {
				case 1:
					System.out.println("---------------------------Cantidad de hijos---------------------------");
					admi.PagoComisionHijos(docen.hijos, marc);
					break;
				case 2:
					System.out.println("-----------------------Cantidad de años de trabajo---------------------");
					admi.PagoComisionAños(docen.añostraba, marc);
					break;
				}
				break;
				
			case 4:
				System.out.println("-----------------------PERSONAL LIMPIEZA-----------------------");
				System.out.print("Nombre: ");
				limp.nombre = tecla.nextLine();
				System.out.print("Edad: ");
				limp.edad = tecla.nextInt();
				System.out.print("Cedula: ");
				limp.ci = tecla.nextLong();
				System.out.print("Años de trabajo: ");
				limp.añostraba = tecla.nextInt();
				System.out.print("Hijos: ");
				limp.hijos = tecla.nextInt();
				System.out.print("Sueldo: ");
				limp.sueldo = tecla.nextFloat();
				tecla.nextLine();
				System.out.print("Area: ");
				limp.Area = tecla.nextLine();
				System.out.println("¿Estas estudiando?: ");
				System.out.println("1: Si");
				System.out.println("2: No: ");
				op = tecla.nextInt();
				
				if (op == 1) {
					marc = true;
				}else {
					marc = false;
				}
				
				System.out.println("-------------------------Metodo de bonificacion------------------------");
				System.out.println("1: Cantidad de hijos");
				System.out.println("2: Cantidad de años de trabajo");
				opcin = tecla.nextInt();
				switch (opcin) {
				case 1:
					System.out.println("---------------------------Cantidad de hijos---------------------------");
					limp.PagoComisionHijos(docen.hijos, marc);
					break;
				case 2:
					System.out.println("-----------------------Cantidad de años de trabajo---------------------");
					limp.PagoComisionAños(docen.añostraba, marc);
					break;
				}
				break;
				
			case 5:
				System.out.println("Muchas gracias por utilizar el sistema...Vuelva Pronto");
				break;
				
			default:
				System.out.println("No existe la opcion seleccionada, por favor vuelva a intentarlo ");
				break;
			}
		}while(opc != 5);
	}

}
