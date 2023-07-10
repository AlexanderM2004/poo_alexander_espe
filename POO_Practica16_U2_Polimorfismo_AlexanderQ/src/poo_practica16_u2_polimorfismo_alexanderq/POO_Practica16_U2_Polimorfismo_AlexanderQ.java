package poo_practica16_u2_polimorfismo_alexanderq;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_Practica16_U2_Polimorfismo_AlexanderQ {
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        int opc,base, alt, radio;
        String color;
        //Llamamos al metodo mostrar figuras
        do{
            System.out.println("Calcular Superficies de Figuras");
            System.out.println("1: Tirangulo");
            System.out.println("2: Circulo");
            System.out.println("3: Cuadrado");
            System.out.println("4: Salir");
            opc = tecl.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("--------------TRIANGULO--------------");
                    System.out.print("Base: ");
                    base = tecl.nextInt();
                    System.out.print("Altura: ");
                    alt = tecl.nextInt();
                    tecl.nextLine();
                    System.out.print("Color: ");
                    color = tecl.nextLine();
                    System.out.println(" ");
                    mostrarDatosFiguras(new Triangulo(base,alt,color));
                    break;
                case 2:
                    System.out.println("---------------CIRCULO---------------");
                    System.out.print("Base: ");
                    radio = tecl.nextInt();
                    tecl.nextLine();
                    System.out.print("Color: ");
                    color = tecl.nextLine();
                    System.out.println(" ");
                    mostrarDatosFiguras(new Circulo(radio,color));
                    break;
                case 3:
                    System.out.println("---------------CUADRADO---------------");
                    System.out.print("lado: ");
                    base = tecl.nextInt();
                    tecl.nextLine();
                    System.out.print("Color: ");
                    color = tecl.nextLine();
                    System.out.println(" ");
                    mostrarDatosFiguras(new Cuadrado(base,color));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println(" ");
        }while(opc != 4);
    }
    
    /*
    La gran ventaja del polimorfismo es la reutilizacion de codigo, la forzar a todas 
    las clases a tener un mismo formato del metodo.
    Esta expresión vale para culaquier subclase de figura, cuyos objetos vengan aqui como 
    parametro
    */
    
    private static void mostrarDatosFiguras(Figura f){
        System.out.println("Color: "+f.getColor());
        System.out.println("Superficie: "+f.superficie());
    }
}
