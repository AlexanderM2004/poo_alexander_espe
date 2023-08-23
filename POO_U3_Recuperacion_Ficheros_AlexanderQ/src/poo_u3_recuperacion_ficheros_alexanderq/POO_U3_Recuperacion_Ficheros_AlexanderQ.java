//Ejemplo de ficheros en java
package poo_u3_recuperacion_ficheros_alexanderq;

//Importar librerias
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alexander Quizhpe
 */
public class POO_U3_Recuperacion_Ficheros_AlexanderQ {

    public static void main(String[] args) {
        //Scanner es un comando que permite ingresar datos mediante el teclado
        Scanner rec = new Scanner(System.in);
        //Declaracion de las variables
        String marca, placa;
        float precio;
        int opc;
        boolean marc = false;
        
        do{
            System.out.println("Base de datos de la concencionaria");
            System.out.println("1: Ingresar registros");
            System.out.println("2: Mostrar registros");
            System.out.println("3: Salir");
            opc = rec.nextInt();
            
            switch(opc){
                case 1:
                    marc = true;
                    
                    try{
                        //No importa si no existe el archivo, el comando se encarga de crearlo
                        FileWriter fw = new FileWriter("C:\\Users\\Acer\\Documents\\NetBeansProjects\\POO_U3_Recuperacion_Ficheros_AlexanderQ\\DataCenter.txt",true);
                        System.out.println("Cuantos registros desea ingresar");
                        int cantreg = rec.nextInt();
                        
                        for(int i = 0; i<cantreg; i++){
                            System.out.print("Marca: ");
                            rec.nextLine();
                            marca = rec.nextLine();
                            System.out.print("Chasis: ");
                            placa = rec.nextLine();
                            System.out.print("Precio: ");
                            precio = rec.nextFloat();
                            
                            fw.write("Marca: "+marca+"\r\n");//Sirve para grabar los datos en el fichero
                            fw.write("Chasis: "+placa+"\r\n");//Sirve para grabar los datos en el fichero
                            fw.write("Precio: "+precio+"\r\n");//Sirve para grabar los datos en el fichero
                            fw.write("--------------------------------------------\r\n");//Sirve para grabar los datos en el fichero
                        }
                        
                        fw.close();
                        
                    }catch(IOException e){
                        System.out.println("Error: "+e);
                    }
                    
                    break;
                case 2:
                    if(marc){
                        int c;
                        String contend = "";
                        try{
                            //Codigo que permite leer ficheros
                            FileReader fr = new FileReader("C:\\Users\\Acer\\Documents\\NetBeansProjects\\POO_U3_Recuperacion_Ficheros_AlexanderQ\\DataCenter.txt");
                            
                            //Bucle para leer ficheros
                            while((c=fr.read()) != -1){
                                contend +=(char)c;//Sirve para leer fichero
                            }
                            
                        }catch(FileNotFoundException ex){
                            System.out.println("Error: "+ex);
                        }catch(IOException e){
                            System.out.println("Error: "+e);
                        }
                        
                        System.out.println("Registros Ingresados");
                        System.out.println(contend);
                        
                    }else{
                        System.out.println("Primero ingrese los registros");
                    }
                    break;
                case 3:
                    System.out.println("Vuelva pronto...Saliendo...");
                    break;
                default:
                    System.out.println("La opcion seleccionada no existe, intente nuevamente");
                    break;
            }
            
        }while(opc != 3);
        
    }
    
}