//Menu met,set,get
package poo_lab3_.met.set.get._alexanderq;
import java.util.Scanner;
import javax.swing.*;
public class POO_LAB3_MetSetGet_AlexanderQ {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        String nombre;
        String apellido;
        int edad;
        Scanner teclado = new Scanner(System.in);
        
        //Pedir nombre al usuario
        System.out.print("Ingrese Nombre: ");
        nombre = teclado.nextLine();
        
        //Pedir Apellido al usuario
        System.out.print("Ingresar Apellido: ");
        apellido = teclado.nextLine();
        
        //Pedir edad al usuario
        System.out.print("Ingresar Edad: ");
        edad = teclado.nextInt();
        
        //Creacion ed objeto persona
        Persona persona1 = new Persona();
        
        //Almacenar informacion mediante el SET
        persona1.setNombre(nombre);
        persona1.setApellido(apellido);
        persona1.setEdad(edad);
        
        //Mostrar la informacion almacenada mediante el GET
        System.out.println("------------------Datos de la persona-----------------");
        System.out.println("El nombre es: "+persona1.getNombre());
        System.out.println("El apellido es: "+persona1.getApellido());
        System.out.println("La edad es: "+persona1.getEdad());
    }
    
}
