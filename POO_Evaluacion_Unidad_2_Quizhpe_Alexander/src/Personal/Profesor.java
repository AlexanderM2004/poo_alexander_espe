package Personal;

/**
 * @author Alexander Quizhpe  
 */
import java.util.*;
public class Profesor extends Personal{

	//Declaracion de variables
	Scanner tec = new Scanner(System.in);
	public String titulo;
	
	//Creacion del constructor con las variables de la clase padre(Personal) y las variables de la clase hija(Profesor);
	public Profesor(String nombre, int edad, String titulo, long CI) {
		super(nombre, edad, CI);
		this.titulo = titulo;
	}

	//Creacion de metodos get y Set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void datodedoce() {
		System.out.print("Edad: ");
		edad = tec.nextInt();
		System.out.print("Identificacion: ");
		CI = tec.nextLong();
		tec.nextLine();
		System.out.print("Titulo: ");
		titulo = tec.nextLine();
		
		setTitulo(titulo);
		setEdad(edad);
		setCI(CI);
	}
	
	
}
