/*
 * Herencia de clases tema Vehiculo
 */
package practica_herencia.de.vehiculos;

/**
 * @author Alexander Quizhpe
 */

import java.util.*;

public class Practica_HerenciaDeVehiculos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lec = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Auto car1 = new Auto(); 
        Camion cami1 = new Camion();
        int opc;
        
        do{
            System.out.println("Seleccione el vehiculo");
            System.out.println("1: Auto");
            System.out.println("2: Camion");
            System.out.println("3: Salir");
            System.out.println("------------------------------------------");
            opc = lec.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("-------------------AUTO-------------------");
                    System.out.print("Placa del auto: ");
                    b.nextLine();
                    car1.numPlaca = lec.nextLine();
                    System.out.print("Marca: ");
                    car1.marca = lec.nextLine();
                    System.out.print("Cant. Ruedas: ");
                    car1.numRuedas = lec.nextInt();
                    System.out.print("Transmicion: ");
                    b.nextLine();
                    car1.transmision = lec.nextLine();
                    System.out.print("Multas: ");
                    car1.multas = lec.nextInt();
                    car1.parabrisasON = true;
                    car1.OnOffparabrisas();
                    break;
                case 2:
                    System.out.println("------------------CAMION------------------");
                    System.out.print("Placa del camion: ");
                    b.nextLine();
                    cami1.numPlaca = lec.nextLine();
                    System.out.print("Marca: ");
                    cami1.marca = lec.nextLine();
                    System.out.print("Cant. Ruedas: ");
                    cami1.numRuedas = lec.nextInt();
                    System.out.print("Color: ");
                    b.nextLine();
                    cami1.color = lec.nextLine();
                    System.out.print("Multas: ");
                    cami1.carga = lec.nextDouble();
                    cami1.parabrisasOn = true;
                    cami1.OnOffParabrisas();
                    break;
                case 3:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("No existe la opcion seleccionada");
                    break;
            }
        }while(opc !=3);
    }
    
}
