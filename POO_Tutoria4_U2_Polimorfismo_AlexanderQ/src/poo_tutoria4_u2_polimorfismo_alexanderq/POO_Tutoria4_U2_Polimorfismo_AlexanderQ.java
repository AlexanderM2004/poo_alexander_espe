package poo_tutoria4_u2_polimorfismo_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_Tutoria4_U2_Polimorfismo_AlexanderQ {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre, disciplina,sexo;
        int edad;
        
        System.out.println("Deportes");
        System.out.println("1: Atletismo");
        System.out.println("2: Natacion");
        int opc = entrada.nextInt();
        entrada.nextLine();
        
        switch(opc){
            case 1:
                System.out.println("Ingresar los datos");
                System.out.print("Nombre: ");
                nombre = entrada.nextLine();
                System.out.print("Edad: ");
                edad = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Disciplina: ");
                disciplina = entrada.nextLine();
                System.out.print("Sexo: ");
                sexo = entrada.nextLine();
                System.out.print("Prueba: ");
                String prueba = entrada.nextLine();
                
                Atletismo atle = new Atletismo(nombre, edad, disciplina, sexo, prueba);
                atle.entrenamiento();
                atle.mostrardatos();
                
                break;
            case 2:
                System.out.println("Ingresar los datos");
                System.out.print("Nombre: ");
                nombre = entrada.nextLine();
                System.out.print("Edad: ");
                edad = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Disciplina: ");
                disciplina = entrada.nextLine();
                System.out.print("Sexo: ");
                sexo = entrada.nextLine();
                System.out.print("Estilo: ");
                String estilo = entrada.nextLine();
                
                Natacion nata = new Natacion(nombre, edad, disciplina, sexo, estilo);
                nata.entrenamiento();
                nata.mostrardatos();
                break;
            default:
                System.out.println("No existe la opcion selecionada, vuelva a intentarlo");
                break;
        }
    }
    
}
