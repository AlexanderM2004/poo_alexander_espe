package poo_u3_tarea2_polimorfismo_alexanderq;

/**
 *
 * @author Alexander Quizhpe
 */

import java.util.*;

public class POO_U3_Tarea2_Polimorfismo_AlexanderQ {
    public static void main(String[] args) {
        //Arreglo para almacenar los datos en memoria RAM
        Vehiculo vehi[] = new Vehiculo[1];
        Vehiculo cami[] = new Vehiculo[1];
        Scanner tec = new Scanner(System.in);
        int opc, i = 0, j = 0;
        boolean band = false, bande = false;
        do{
            System.out.println("Registro de vehiculos");
            System.out.println("1: Registro Carros");
            System.out.println("2: Registro Camion");
            System.out.println("3: Mostrar registros");
            System.out.println("4: Salir");
            opc = tec.nextInt();
            
            switch(opc){
                case 1:
                    band = true;
                    System.out.println("Registro de Carros");
                    System.out.print("Matricula: ");
                    tec.nextLine();
                    String matri = tec.nextLine();
                    System.out.print("Marca: ");
                    String marca = tec.nextLine();
                    System.out.print("Modelo: ");
                    String model = tec.nextLine();
                    System.out.print("Cantidad de llanta: ");
                    int cantlla = tec.nextInt();
                    System.out.print("Cantidad de asientos: ");
                    int cantasi = tec.nextInt();
                    
                    vehi[i] = new Automovil(matri,marca,model,cantlla,cantasi);
                    i++;
                    
                    break;
                case 2:
                    bande = true;
                    System.out.println("Registro de Camion");
                    System.out.print("Matricula: ");
                    tec.nextLine();
                    String matr = tec.nextLine();
                    System.out.print("Marca: ");
                    String marc = tec.nextLine();
                    System.out.print("Modelo: ");
                    String mode = tec.nextLine();
                    System.out.print("Cantidad de llanta: ");
                    int canlla = tec.nextInt();
                    System.out.print("Peso maximo: ");
                    int pesmax = tec.nextInt();
                    
                    cami[j] = new Camion(matr,marc,mode,canlla,pesmax);
                    j++;
                    
                    break;
                case 3:
                    System.out.println("Registros Ingresados");
                    if(band){
                        System.out.println("Carro");
                    
                        for(Vehiculo vehiculos:vehi){
                            System.out.println(vehiculos.mostrarDatos());
                        }
                    }
                    
                    System.out.println(" ");
                    
                    if(bande){
                      System.out.println("Camion");
                        for(Vehiculo vehiculos:cami){
                            System.out.println(vehiculos.mostrarDatos());
                        }  
                    }
                   
                    break;
                case 4:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("No existe la opcion seleccionada");
                    break;
            }
            
        }while(opc != 4);
    }
    
}
