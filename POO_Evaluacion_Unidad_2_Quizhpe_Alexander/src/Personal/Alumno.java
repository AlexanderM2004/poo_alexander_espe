package Personal;

/**
 * @author Alexander Quizhpe  
 */


//Importacion de librerias para la intrada de texto
import java.util.*; 

public class Alumno extends Personal {

	//Declaracion de variables
	String [] alumn = new String [100];
	Long [] cedu = new Long [100];
	String [] pao = new String [100];
	Scanner tec = new Scanner(System.in);
	public int PAO;//Semestre del estudiante

	//Creacion del constructor con las variables de la clase padre(Personal) y las variables de la clase hija(Profesor);
	public Alumno(String nombre, int edad, long CI, int PAO) {
		super(nombre, edad, CI);
		this.PAO = PAO;
	}

	//Creacion de metodos get y Set
	public int getPAO() {
		return PAO;
	}

	public void setPAO(int pAO) {
		PAO = pAO;
	}
	
	//Metodo para registrar a estudiantes
	public void registroEstu(int cant) {
		for(int i = 0; i < cant; i++) {
			System.out.print("Estudiante "+i+": ");
			alumn[i] = tec.nextLine();
			System.out.print("Cedula "+i+": ");
			cedu[i] = tec.nextLong();
			System.out.print("PAO "+i+": ");
			pao[i] = tec.nextLine();
		}
	}
	
	//Metodo mostrar registro de estudiantes
	public void mostrarregistroEstu(int cant) {
		for(int i = 0; i < cant; i++) {
			System.out.println("Estudiante "+alumn[i]);
			System.out.println("Cedula "+cedu[i]);
			System.out.println("PAO "+pao[i]);
		}
	}
}
