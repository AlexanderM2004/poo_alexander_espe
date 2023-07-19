package Personal;

/**
 * @author Alexander Quizhpe  
 */

import java.util.*;
public class EncargadoLab extends Personal {

	//Declaracion de variables
	Scanner tec = new Scanner(System.in);
	public String titulo; 
	
	//Creacion del constructor con las variables de la clase padre(Personal) y las variables de la clase hija(Encargado de laboratorio;
	public EncargadoLab(String nombre, int edad, long CI, String titulo) {
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
	
	
	public void datodeencar() {
		System.out.print("Nombre: ");
		nombre = tec.nextLine();
		System.out.print("Edad: ");
		edad = tec.nextInt();
		System.out.print("Identificacion: ");
		CI = tec.nextLong();
		tec.nextLine();
		System.out.print("Titulo: ");
		titulo = tec.nextLine();
		
		setTitulo(titulo);
		setNombre(nombre);
		setEdad(edad);
		setCI(CI);
	}
	
}
